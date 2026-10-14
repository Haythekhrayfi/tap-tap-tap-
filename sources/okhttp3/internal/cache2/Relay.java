package okhttp3.internal.cache2;

import ch.qos.logback.core.joran.action.Action;
import fd.j0;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import okhttp3.internal.Util;
import qd.a0;
import qd.b0;
import qd.c;
import qd.g;

/* JADX INFO: loaded from: classes3.dex */
public final class Relay {
    public static final Companion Companion = new Companion(null);
    private static final long FILE_HEADER_SIZE = 32;
    public static final g PREFIX_CLEAN;
    public static final g PREFIX_DIRTY;
    private static final int SOURCE_FILE = 2;
    private static final int SOURCE_UPSTREAM = 1;
    private final c buffer;
    private final long bufferMaxSize;
    private boolean complete;
    private RandomAccessFile file;
    private final g metadata;
    private int sourceCount;
    private a0 upstream;
    private final c upstreamBuffer;
    private long upstreamPos;
    private Thread upstreamReader;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(vc.g gVar) {
            this();
        }

        public final Relay edit(File file, a0 a0Var, g gVar, long j10) throws IOException {
            j0.i(file, Action.FILE_ATTRIBUTE);
            j0.i(a0Var, "upstream");
            j0.i(gVar, "metadata");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            Relay relay = new Relay(randomAccessFile, a0Var, 0L, gVar, j10, null);
            randomAccessFile.setLength(0L);
            relay.writeHeader(Relay.PREFIX_DIRTY, -1L, -1L);
            return relay;
        }

        public final Relay read(File file) throws IOException {
            j0.i(file, Action.FILE_ATTRIBUTE);
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            FileChannel channel = randomAccessFile.getChannel();
            j0.h(channel, "randomAccessFile.channel");
            FileOperator fileOperator = new FileOperator(channel);
            c cVar = new c();
            fileOperator.read(0L, cVar, Relay.FILE_HEADER_SIZE);
            g gVar = Relay.PREFIX_CLEAN;
            if (!j0.d(cVar.d(gVar.c()), gVar)) {
                throw new IOException("unreadable cache file");
            }
            long j10 = cVar.readLong();
            long j11 = cVar.readLong();
            c cVar2 = new c();
            fileOperator.read(j10 + Relay.FILE_HEADER_SIZE, cVar2, j11);
            return new Relay(randomAccessFile, null, j10, cVar2.I(), 0L, null);
        }
    }

    public final class RelaySource implements a0 {
        private FileOperator fileOperator;
        private long sourcePos;
        public final /* synthetic */ Relay this$0;
        private final b0 timeout;

        public RelaySource(Relay relay) {
            j0.i(relay, "this$0");
            this.this$0 = relay;
            this.timeout = new b0();
            RandomAccessFile file = relay.getFile();
            j0.f(file);
            FileChannel channel = file.getChannel();
            j0.h(channel, "file!!.channel");
            this.fileOperator = new FileOperator(channel);
        }

        @Override // qd.a0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.fileOperator == null) {
                return;
            }
            RandomAccessFile randomAccessFile = null;
            this.fileOperator = null;
            Relay relay = this.this$0;
            synchronized (relay) {
                relay.setSourceCount(relay.getSourceCount() - 1);
                if (relay.getSourceCount() == 0) {
                    RandomAccessFile file = relay.getFile();
                    relay.setFile(null);
                    randomAccessFile = file;
                }
            }
            if (randomAccessFile == null) {
                return;
            }
            Util.closeQuietly(randomAccessFile);
        }

        @Override // qd.a0
        public long read(c cVar, long j10) throws IOException {
            j0.i(cVar, "sink");
            char c10 = 1;
            if (!(this.fileOperator != null)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            Relay relay = this.this$0;
            synchronized (relay) {
                while (true) {
                    if (this.sourcePos == relay.getUpstreamPos()) {
                        if (!relay.getComplete()) {
                            if (relay.getUpstreamReader() == null) {
                                relay.setUpstreamReader(Thread.currentThread());
                                break;
                            }
                            this.timeout.waitUntilNotified(relay);
                        } else {
                            return -1L;
                        }
                    } else {
                        long upstreamPos = relay.getUpstreamPos() - relay.getBuffer().f34879d;
                        if (this.sourcePos < upstreamPos) {
                            c10 = 2;
                            break;
                        }
                        long jMin = Math.min(j10, relay.getUpstreamPos() - this.sourcePos);
                        relay.getBuffer().e(cVar, this.sourcePos - upstreamPos, jMin);
                        this.sourcePos += jMin;
                        return jMin;
                    }
                }
                if (c10 == 2) {
                    long jMin2 = Math.min(j10, this.this$0.getUpstreamPos() - this.sourcePos);
                    FileOperator fileOperator = this.fileOperator;
                    j0.f(fileOperator);
                    fileOperator.read(this.sourcePos + Relay.FILE_HEADER_SIZE, cVar, jMin2);
                    this.sourcePos += jMin2;
                    return jMin2;
                }
                try {
                    a0 upstream = this.this$0.getUpstream();
                    j0.f(upstream);
                    long j11 = upstream.read(this.this$0.getUpstreamBuffer(), this.this$0.getBufferMaxSize());
                    if (j11 == -1) {
                        Relay relay2 = this.this$0;
                        relay2.commit(relay2.getUpstreamPos());
                        Relay relay3 = this.this$0;
                        synchronized (relay3) {
                            relay3.setUpstreamReader(null);
                            relay3.notifyAll();
                        }
                        return -1L;
                    }
                    long jMin3 = Math.min(j11, j10);
                    this.this$0.getUpstreamBuffer().e(cVar, 0L, jMin3);
                    this.sourcePos += jMin3;
                    FileOperator fileOperator2 = this.fileOperator;
                    j0.f(fileOperator2);
                    fileOperator2.write(this.this$0.getUpstreamPos() + Relay.FILE_HEADER_SIZE, this.this$0.getUpstreamBuffer().clone(), j11);
                    Relay relay4 = this.this$0;
                    synchronized (relay4) {
                        try {
                            relay4.getBuffer().write(relay4.getUpstreamBuffer(), j11);
                            if (relay4.getBuffer().f34879d > relay4.getBufferMaxSize()) {
                                relay4.getBuffer().skip(relay4.getBuffer().f34879d - relay4.getBufferMaxSize());
                            }
                            relay4.setUpstreamPos(relay4.getUpstreamPos() + j11);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    Relay relay5 = this.this$0;
                    synchronized (relay5) {
                        relay5.setUpstreamReader(null);
                        relay5.notifyAll();
                    }
                    return jMin3;
                } catch (Throwable th2) {
                    Relay relay6 = this.this$0;
                    synchronized (relay6) {
                        relay6.setUpstreamReader(null);
                        relay6.notifyAll();
                        throw th2;
                    }
                }
            }
        }

        @Override // qd.a0
        public b0 timeout() {
            return this.timeout;
        }
    }

    static {
        g.a aVar = g.f34892f;
        PREFIX_CLEAN = aVar.d("OkHttp cache v1\n");
        PREFIX_DIRTY = aVar.d("OkHttp DIRTY :(\n");
    }

    private Relay(RandomAccessFile randomAccessFile, a0 a0Var, long j10, g gVar, long j11) {
        this.file = randomAccessFile;
        this.upstream = a0Var;
        this.upstreamPos = j10;
        this.metadata = gVar;
        this.bufferMaxSize = j11;
        this.upstreamBuffer = new c();
        this.complete = this.upstream == null;
        this.buffer = new c();
    }

    public /* synthetic */ Relay(RandomAccessFile randomAccessFile, a0 a0Var, long j10, g gVar, long j11, vc.g gVar2) {
        this(randomAccessFile, a0Var, j10, gVar, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void writeHeader(g gVar, long j10, long j11) throws IOException {
        c cVar = new c();
        cVar.K(gVar);
        cVar.b0(j10);
        cVar.b0(j11);
        if (!(cVar.f34879d == FILE_HEADER_SIZE)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        RandomAccessFile randomAccessFile = this.file;
        j0.f(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        j0.h(channel, "file!!.channel");
        new FileOperator(channel).write(0L, cVar, FILE_HEADER_SIZE);
    }

    private final void writeMetadata(long j10) throws IOException {
        c cVar = new c();
        cVar.K(this.metadata);
        RandomAccessFile randomAccessFile = this.file;
        j0.f(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        j0.h(channel, "file!!.channel");
        new FileOperator(channel).write(FILE_HEADER_SIZE + j10, cVar, this.metadata.c());
    }

    public final void commit(long j10) throws IOException {
        writeMetadata(j10);
        RandomAccessFile randomAccessFile = this.file;
        j0.f(randomAccessFile);
        randomAccessFile.getChannel().force(false);
        writeHeader(PREFIX_CLEAN, j10, this.metadata.c());
        RandomAccessFile randomAccessFile2 = this.file;
        j0.f(randomAccessFile2);
        randomAccessFile2.getChannel().force(false);
        synchronized (this) {
            setComplete(true);
        }
        a0 a0Var = this.upstream;
        if (a0Var != null) {
            Util.closeQuietly(a0Var);
        }
        this.upstream = null;
    }

    public final c getBuffer() {
        return this.buffer;
    }

    public final long getBufferMaxSize() {
        return this.bufferMaxSize;
    }

    public final boolean getComplete() {
        return this.complete;
    }

    public final RandomAccessFile getFile() {
        return this.file;
    }

    public final int getSourceCount() {
        return this.sourceCount;
    }

    public final a0 getUpstream() {
        return this.upstream;
    }

    public final c getUpstreamBuffer() {
        return this.upstreamBuffer;
    }

    public final long getUpstreamPos() {
        return this.upstreamPos;
    }

    public final Thread getUpstreamReader() {
        return this.upstreamReader;
    }

    public final boolean isClosed() {
        return this.file == null;
    }

    public final g metadata() {
        return this.metadata;
    }

    public final a0 newSource() {
        synchronized (this) {
            if (getFile() == null) {
                return null;
            }
            setSourceCount(getSourceCount() + 1);
            return new RelaySource(this);
        }
    }

    public final void setComplete(boolean z10) {
        this.complete = z10;
    }

    public final void setFile(RandomAccessFile randomAccessFile) {
        this.file = randomAccessFile;
    }

    public final void setSourceCount(int i10) {
        this.sourceCount = i10;
    }

    public final void setUpstream(a0 a0Var) {
        this.upstream = a0Var;
    }

    public final void setUpstreamPos(long j10) {
        this.upstreamPos = j10;
    }

    public final void setUpstreamReader(Thread thread) {
        this.upstreamReader = thread;
    }
}
