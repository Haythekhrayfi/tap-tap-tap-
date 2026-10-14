package okhttp3.internal.ws;

import bd.c;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import defpackage.a;
import ed.q;
import fd.j0;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kc.k;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import qd.e;
import qd.f;
import qd.g;

/* JADX INFO: loaded from: classes3.dex */
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback {
    private static final long CANCEL_AFTER_CLOSE_MILLIS = 60000;
    public static final long DEFAULT_MINIMUM_DEFLATE_SIZE = 1024;
    private static final long MAX_QUEUE_SIZE = 16777216;
    private boolean awaitingPong;
    private Call call;
    private boolean enqueuedClose;
    private WebSocketExtensions extensions;
    private boolean failed;
    private final String key;
    private final WebSocketListener listener;
    private final ArrayDeque<Object> messageAndCloseQueue;
    private long minimumDeflateSize;
    private String name;
    private final Request originalRequest;
    private final long pingIntervalMillis;
    private final ArrayDeque<g> pongQueue;
    private long queueSize;
    private final Random random;
    private WebSocketReader reader;
    private int receivedCloseCode;
    private String receivedCloseReason;
    private int receivedPingCount;
    private int receivedPongCount;
    private int sentPingCount;
    private Streams streams;
    private TaskQueue taskQueue;
    private WebSocketWriter writer;
    private Task writerTask;
    public static final Companion Companion = new Companion(null);
    private static final List<Protocol> ONLY_HTTP1 = k.a(Protocol.HTTP_1_1);

    public static final class Close {
        private final long cancelAfterCloseMillis;
        private final int code;
        private final g reason;

        public Close(int i10, g gVar, long j10) {
            this.code = i10;
            this.reason = gVar;
            this.cancelAfterCloseMillis = j10;
        }

        public final long getCancelAfterCloseMillis() {
            return this.cancelAfterCloseMillis;
        }

        public final int getCode() {
            return this.code;
        }

        public final g getReason() {
            return this.reason;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(vc.g gVar) {
            this();
        }
    }

    public static final class Message {
        private final g data;
        private final int formatOpcode;

        public Message(int i10, g gVar) {
            j0.i(gVar, "data");
            this.formatOpcode = i10;
            this.data = gVar;
        }

        public final g getData() {
            return this.data;
        }

        public final int getFormatOpcode() {
            return this.formatOpcode;
        }
    }

    public static abstract class Streams implements Closeable {
        private final boolean client;
        private final e sink;
        private final f source;

        public Streams(boolean z10, f fVar, e eVar) {
            j0.i(fVar, "source");
            j0.i(eVar, "sink");
            this.client = z10;
            this.source = fVar;
            this.sink = eVar;
        }

        public final boolean getClient() {
            return this.client;
        }

        public final e getSink() {
            return this.sink;
        }

        public final f getSource() {
            return this.source;
        }
    }

    public final class WriterTask extends Task {
        public final /* synthetic */ RealWebSocket this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WriterTask(RealWebSocket realWebSocket) {
            super(j0.p(realWebSocket.name, " writer"), false, 2, null);
            j0.i(realWebSocket, "this$0");
            this.this$0 = realWebSocket;
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
            try {
                return this.this$0.writeOneFrame$okhttp() ? 0L : -1L;
            } catch (IOException e10) {
                this.this$0.failWebSocket(e10, null);
                return -1L;
            }
        }
    }

    public RealWebSocket(TaskRunner taskRunner, Request request, WebSocketListener webSocketListener, Random random, long j10, WebSocketExtensions webSocketExtensions, long j11) {
        j0.i(taskRunner, "taskRunner");
        j0.i(request, "originalRequest");
        j0.i(webSocketListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        j0.i(random, "random");
        this.originalRequest = request;
        this.listener = webSocketListener;
        this.random = random;
        this.pingIntervalMillis = j10;
        this.extensions = webSocketExtensions;
        this.minimumDeflateSize = j11;
        this.taskQueue = taskRunner.newQueue();
        this.pongQueue = new ArrayDeque<>();
        this.messageAndCloseQueue = new ArrayDeque<>();
        this.receivedCloseCode = -1;
        if (!j0.d("GET", request.method())) {
            throw new IllegalArgumentException(j0.p("Request must be GET: ", request.method()).toString());
        }
        g.a aVar = g.f34892f;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.key = g.a.e(aVar, bArr, 0, 0, 3).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isValid(WebSocketExtensions webSocketExtensions) {
        if (!webSocketExtensions.unknownValues && webSocketExtensions.clientMaxWindowBits == null) {
            return webSocketExtensions.serverMaxWindowBits == null || new c(8, 15).e(webSocketExtensions.serverMaxWindowBits.intValue());
        }
        return false;
    }

    private final void runWriter() {
        if (!Util.assertionsEnabled || Thread.holdsLock(this)) {
            Task task = this.writerTask;
            if (task != null) {
                TaskQueue.schedule$default(this.taskQueue, task, 0L, 2, null);
                return;
            }
            return;
        }
        StringBuilder sbA = a.a("Thread ");
        sbA.append((Object) Thread.currentThread().getName());
        sbA.append(" MUST hold lock on ");
        sbA.append(this);
        throw new AssertionError(sbA.toString());
    }

    private final synchronized boolean send(g gVar, int i10) {
        if (!this.failed && !this.enqueuedClose) {
            if (this.queueSize + ((long) gVar.c()) > MAX_QUEUE_SIZE) {
                close(1001, null);
                return false;
            }
            this.queueSize += (long) gVar.c();
            this.messageAndCloseQueue.add(new Message(i10, gVar));
            runWriter();
            return true;
        }
        return false;
    }

    public final void awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException {
        j0.i(timeUnit, "timeUnit");
        this.taskQueue.idleLatch().await(j10, timeUnit);
    }

    @Override // okhttp3.WebSocket
    public void cancel() {
        Call call = this.call;
        j0.f(call);
        call.cancel();
    }

    public final void checkUpgradeSuccess$okhttp(Response response, Exchange exchange) throws IOException {
        j0.i(response, "response");
        if (response.code() != 101) {
            StringBuilder sbA = a.a("Expected HTTP 101 response but was '");
            sbA.append(response.code());
            sbA.append(' ');
            sbA.append(response.message());
            sbA.append(CoreConstants.SINGLE_QUOTE_CHAR);
            throw new ProtocolException(sbA.toString());
        }
        String strHeader$default = Response.header$default(response, "Connection", null, 2, null);
        if (!q.i("Upgrade", strHeader$default, true)) {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + ((Object) strHeader$default) + CoreConstants.SINGLE_QUOTE_CHAR);
        }
        String strHeader$default2 = Response.header$default(response, "Upgrade", null, 2, null);
        if (!q.i("websocket", strHeader$default2, true)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + ((Object) strHeader$default2) + CoreConstants.SINGLE_QUOTE_CHAR);
        }
        String strHeader$default3 = Response.header$default(response, "Sec-WebSocket-Accept", null, 2, null);
        String strA = g.f34892f.d(j0.p(this.key, WebSocketProtocol.ACCEPT_MAGIC)).i().a();
        if (j0.d(strA, strHeader$default3)) {
            if (exchange == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strA + "' but was '" + ((Object) strHeader$default3) + CoreConstants.SINGLE_QUOTE_CHAR);
    }

    @Override // okhttp3.WebSocket
    public boolean close(int i10, String str) {
        return close(i10, str, 60000L);
    }

    public final synchronized boolean close(int i10, String str, long j10) {
        WebSocketProtocol.INSTANCE.validateCloseCode(i10);
        g gVarD = null;
        if (str != null) {
            gVarD = g.f34892f.d(str);
            if (!(((long) gVarD.c()) <= 123)) {
                throw new IllegalArgumentException(j0.p("reason.size() > 123: ", str).toString());
            }
        }
        if (!this.failed && !this.enqueuedClose) {
            this.enqueuedClose = true;
            this.messageAndCloseQueue.add(new Close(i10, gVarD, j10));
            runWriter();
            return true;
        }
        return false;
    }

    public final void connect(OkHttpClient okHttpClient) {
        j0.i(okHttpClient, "client");
        if (this.originalRequest.header("Sec-WebSocket-Extensions") != null) {
            failWebSocket(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
            return;
        }
        OkHttpClient okHttpClientBuild = okHttpClient.newBuilder().eventListener(EventListener.NONE).protocols(ONLY_HTTP1).build();
        final Request requestBuild = this.originalRequest.newBuilder().header("Upgrade", "websocket").header("Connection", "Upgrade").header("Sec-WebSocket-Key", this.key).header("Sec-WebSocket-Version", "13").header("Sec-WebSocket-Extensions", "permessage-deflate").build();
        RealCall realCall = new RealCall(okHttpClientBuild, requestBuild, true);
        this.call = realCall;
        j0.f(realCall);
        realCall.enqueue(new Callback() { // from class: okhttp3.internal.ws.RealWebSocket.connect.1
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                j0.i(call, "call");
                j0.i(iOException, "e");
                RealWebSocket.this.failWebSocket(iOException, null);
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) throws IOException {
                j0.i(call, "call");
                j0.i(response, "response");
                Exchange exchange = response.exchange();
                try {
                    RealWebSocket.this.checkUpgradeSuccess$okhttp(response, exchange);
                    j0.f(exchange);
                    Streams streamsNewWebSocketStreams = exchange.newWebSocketStreams();
                    WebSocketExtensions webSocketExtensions = WebSocketExtensions.Companion.parse(response.headers());
                    RealWebSocket.this.extensions = webSocketExtensions;
                    if (!RealWebSocket.this.isValid(webSocketExtensions)) {
                        RealWebSocket realWebSocket = RealWebSocket.this;
                        synchronized (realWebSocket) {
                            realWebSocket.messageAndCloseQueue.clear();
                            realWebSocket.close(1010, "unexpected Sec-WebSocket-Extensions in response header");
                        }
                    }
                    try {
                        RealWebSocket.this.initReaderAndWriter(Util.okHttpName + " WebSocket " + requestBuild.url().redact(), streamsNewWebSocketStreams);
                        RealWebSocket.this.getListener$okhttp().onOpen(RealWebSocket.this, response);
                        RealWebSocket.this.loopReader();
                    } catch (Exception e10) {
                        RealWebSocket.this.failWebSocket(e10, null);
                    }
                } catch (IOException e11) {
                    if (exchange != null) {
                        exchange.webSocketUpgradeFailed();
                    }
                    RealWebSocket.this.failWebSocket(e11, response);
                    Util.closeQuietly(response);
                }
            }
        });
    }

    public final void failWebSocket(Exception exc, Response response) {
        j0.i(exc, "e");
        synchronized (this) {
            if (this.failed) {
                return;
            }
            this.failed = true;
            Streams streams = this.streams;
            this.streams = null;
            WebSocketReader webSocketReader = this.reader;
            this.reader = null;
            WebSocketWriter webSocketWriter = this.writer;
            this.writer = null;
            this.taskQueue.shutdown();
            try {
                this.listener.onFailure(this, exc, response);
            } finally {
                if (streams != null) {
                    Util.closeQuietly(streams);
                }
                if (webSocketReader != null) {
                    Util.closeQuietly(webSocketReader);
                }
                if (webSocketWriter != null) {
                    Util.closeQuietly(webSocketWriter);
                }
            }
        }
    }

    public final WebSocketListener getListener$okhttp() {
        return this.listener;
    }

    public final void initReaderAndWriter(String str, Streams streams) throws IOException {
        j0.i(str, "name");
        j0.i(streams, "streams");
        WebSocketExtensions webSocketExtensions = this.extensions;
        j0.f(webSocketExtensions);
        synchronized (this) {
            this.name = str;
            this.streams = streams;
            this.writer = new WebSocketWriter(streams.getClient(), streams.getSink(), this.random, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(streams.getClient()), this.minimumDeflateSize);
            this.writerTask = new WriterTask(this);
            long j10 = this.pingIntervalMillis;
            if (j10 != 0) {
                final long nanos = TimeUnit.MILLISECONDS.toNanos(j10);
                TaskQueue taskQueue = this.taskQueue;
                final String strP = j0.p(str, " ping");
                taskQueue.schedule(new Task(strP, this, nanos) { // from class: okhttp3.internal.ws.RealWebSocket$initReaderAndWriter$lambda-3$$inlined$schedule$1
                    public final /* synthetic */ String $name;
                    public final /* synthetic */ long $pingIntervalNanos$inlined;
                    public final /* synthetic */ RealWebSocket this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(strP, false, 2, null);
                        this.$name = strP;
                        this.this$0 = this;
                        this.$pingIntervalNanos$inlined = nanos;
                    }

                    @Override // okhttp3.internal.concurrent.Task
                    public long runOnce() {
                        this.this$0.writePingFrame$okhttp();
                        return this.$pingIntervalNanos$inlined;
                    }
                }, nanos);
            }
            if (!this.messageAndCloseQueue.isEmpty()) {
                runWriter();
            }
        }
        this.reader = new WebSocketReader(streams.getClient(), streams.getSource(), this, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(!streams.getClient()));
    }

    public final void loopReader() throws IOException {
        while (this.receivedCloseCode == -1) {
            WebSocketReader webSocketReader = this.reader;
            j0.f(webSocketReader);
            webSocketReader.processNextFrame();
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadClose(int i10, String str) {
        Streams streams;
        WebSocketReader webSocketReader;
        WebSocketWriter webSocketWriter;
        j0.i(str, "reason");
        boolean z10 = true;
        if (!(i10 != -1)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        synchronized (this) {
            if (this.receivedCloseCode != -1) {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalStateException("already closed".toString());
            }
            this.receivedCloseCode = i10;
            this.receivedCloseReason = str;
            streams = null;
            if (this.enqueuedClose && this.messageAndCloseQueue.isEmpty()) {
                Streams streams2 = this.streams;
                this.streams = null;
                webSocketReader = this.reader;
                this.reader = null;
                webSocketWriter = this.writer;
                this.writer = null;
                this.taskQueue.shutdown();
                streams = streams2;
            } else {
                webSocketReader = null;
                webSocketWriter = null;
            }
        }
        try {
            this.listener.onClosing(this, i10, str);
            if (streams != null) {
                this.listener.onClosed(this, i10, str);
            }
        } finally {
            if (streams != null) {
                Util.closeQuietly(streams);
            }
            if (webSocketReader != null) {
                Util.closeQuietly(webSocketReader);
            }
            if (webSocketWriter != null) {
                Util.closeQuietly(webSocketWriter);
            }
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(String str) throws IOException {
        j0.i(str, "text");
        this.listener.onMessage(this, str);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(g gVar) throws IOException {
        j0.i(gVar, "bytes");
        this.listener.onMessage(this, gVar);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPing(g gVar) {
        j0.i(gVar, "payload");
        if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
            this.pongQueue.add(gVar);
            runWriter();
            this.receivedPingCount++;
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPong(g gVar) {
        j0.i(gVar, "payload");
        this.receivedPongCount++;
        this.awaitingPong = false;
    }

    public final synchronized boolean pong(g gVar) {
        boolean z10;
        j0.i(gVar, "payload");
        if (this.failed || (this.enqueuedClose && this.messageAndCloseQueue.isEmpty())) {
            z10 = false;
        } else {
            this.pongQueue.add(gVar);
            runWriter();
            z10 = true;
        }
        return z10;
    }

    public final boolean processNextFrame() throws IOException {
        try {
            WebSocketReader webSocketReader = this.reader;
            j0.f(webSocketReader);
            webSocketReader.processNextFrame();
            return this.receivedCloseCode == -1;
        } catch (Exception e10) {
            failWebSocket(e10, null);
            return false;
        }
    }

    @Override // okhttp3.WebSocket
    public synchronized long queueSize() {
        return this.queueSize;
    }

    public final synchronized int receivedPingCount() {
        return this.receivedPingCount;
    }

    public final synchronized int receivedPongCount() {
        return this.receivedPongCount;
    }

    @Override // okhttp3.WebSocket
    public Request request() {
        return this.originalRequest;
    }

    @Override // okhttp3.WebSocket
    public boolean send(String str) {
        j0.i(str, "text");
        return send(g.f34892f.d(str), 1);
    }

    @Override // okhttp3.WebSocket
    public boolean send(g gVar) {
        j0.i(gVar, "bytes");
        return send(gVar, 2);
    }

    public final synchronized int sentPingCount() {
        return this.sentPingCount;
    }

    public final void tearDown() throws InterruptedException {
        this.taskQueue.shutdown();
        this.taskQueue.idleLatch().await(10L, TimeUnit.SECONDS);
    }

    public final boolean writeOneFrame$okhttp() throws IOException {
        Streams streams;
        String str;
        WebSocketReader webSocketReader;
        Closeable closeable;
        synchronized (this) {
            if (this.failed) {
                return false;
            }
            WebSocketWriter webSocketWriter = this.writer;
            g gVarPoll = this.pongQueue.poll();
            final boolean z10 = true;
            int i10 = -1;
            Object obj = null;
            if (gVarPoll == null) {
                Object objPoll = this.messageAndCloseQueue.poll();
                if (objPoll instanceof Close) {
                    int i11 = this.receivedCloseCode;
                    str = this.receivedCloseReason;
                    if (i11 != -1) {
                        Streams streams2 = this.streams;
                        this.streams = null;
                        webSocketReader = this.reader;
                        this.reader = null;
                        closeable = this.writer;
                        this.writer = null;
                        this.taskQueue.shutdown();
                        obj = objPoll;
                        i10 = i11;
                        streams = streams2;
                    } else {
                        long cancelAfterCloseMillis = ((Close) objPoll).getCancelAfterCloseMillis();
                        TaskQueue taskQueue = this.taskQueue;
                        final String strP = j0.p(this.name, " cancel");
                        taskQueue.schedule(new Task(strP, z10, this) { // from class: okhttp3.internal.ws.RealWebSocket$writeOneFrame$lambda-8$$inlined$execute$default$1
                            public final /* synthetic */ boolean $cancelable;
                            public final /* synthetic */ String $name;
                            public final /* synthetic */ RealWebSocket this$0;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(strP, z10);
                                this.$name = strP;
                                this.$cancelable = z10;
                                this.this$0 = this;
                            }

                            @Override // okhttp3.internal.concurrent.Task
                            public long runOnce() {
                                this.this$0.cancel();
                                return -1L;
                            }
                        }, TimeUnit.MILLISECONDS.toNanos(cancelAfterCloseMillis));
                        i10 = i11;
                        streams = null;
                        webSocketReader = null;
                    }
                } else {
                    if (objPoll == null) {
                        return false;
                    }
                    streams = null;
                    str = null;
                    webSocketReader = null;
                }
                closeable = webSocketReader;
                obj = objPoll;
            } else {
                streams = null;
                str = null;
                webSocketReader = null;
                closeable = null;
            }
            try {
                if (gVarPoll != null) {
                    j0.f(webSocketWriter);
                    webSocketWriter.writePong(gVarPoll);
                } else if (obj instanceof Message) {
                    Message message = (Message) obj;
                    j0.f(webSocketWriter);
                    webSocketWriter.writeMessageFrame(message.getFormatOpcode(), message.getData());
                    synchronized (this) {
                        this.queueSize -= (long) message.getData().c();
                    }
                } else {
                    if (!(obj instanceof Close)) {
                        throw new AssertionError();
                    }
                    Close close = (Close) obj;
                    j0.f(webSocketWriter);
                    webSocketWriter.writeClose(close.getCode(), close.getReason());
                    if (streams != null) {
                        WebSocketListener webSocketListener = this.listener;
                        j0.f(str);
                        webSocketListener.onClosed(this, i10, str);
                    }
                }
                if (streams != null) {
                    Util.closeQuietly(streams);
                }
                if (webSocketReader != null) {
                    Util.closeQuietly(webSocketReader);
                }
                if (closeable != null) {
                    Util.closeQuietly(closeable);
                }
                return true;
            } catch (Throwable th) {
                if (streams != null) {
                    Util.closeQuietly(streams);
                }
                if (webSocketReader != null) {
                    Util.closeQuietly(webSocketReader);
                }
                if (closeable != null) {
                    Util.closeQuietly(closeable);
                }
                throw th;
            }
        }
    }

    public final void writePingFrame$okhttp() {
        synchronized (this) {
            if (this.failed) {
                return;
            }
            WebSocketWriter webSocketWriter = this.writer;
            if (webSocketWriter == null) {
                return;
            }
            int i10 = this.awaitingPong ? this.sentPingCount : -1;
            this.sentPingCount++;
            this.awaitingPong = true;
            if (i10 == -1) {
                try {
                    webSocketWriter.writePing(g.f34893g);
                    return;
                } catch (IOException e10) {
                    failWebSocket(e10, null);
                    return;
                }
            }
            StringBuilder sbA = a.a("sent ping but didn't receive pong within ");
            sbA.append(this.pingIntervalMillis);
            sbA.append("ms (after ");
            sbA.append(i10 - 1);
            sbA.append(" successful ping/pongs)");
            failWebSocket(new SocketTimeoutException(sbA.toString()), null);
        }
    }
}
