package okhttp3.internal.ws;

import fd.j0;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import qd.c;
import qd.e;
import qd.g;

/* JADX INFO: loaded from: classes3.dex */
public final class WebSocketWriter implements Closeable {
    private final boolean isClient;
    private final c.a maskCursor;
    private final byte[] maskKey;
    private final c messageBuffer;
    private MessageDeflater messageDeflater;
    private final long minimumDeflateSize;
    private final boolean noContextTakeover;
    private final boolean perMessageDeflate;
    private final Random random;
    private final e sink;
    private final c sinkBuffer;
    private boolean writerClosed;

    public WebSocketWriter(boolean z10, e eVar, Random random, boolean z11, boolean z12, long j10) {
        j0.i(eVar, "sink");
        j0.i(random, "random");
        this.isClient = z10;
        this.sink = eVar;
        this.random = random;
        this.perMessageDeflate = z11;
        this.noContextTakeover = z12;
        this.minimumDeflateSize = j10;
        this.messageBuffer = new c();
        this.sinkBuffer = eVar.r();
        this.maskKey = z10 ? new byte[4] : null;
        this.maskCursor = z10 ? new c.a() : null;
    }

    private final void writeControlFrame(int i10, g gVar) throws IOException {
        if (this.writerClosed) {
            throw new IOException("closed");
        }
        int iC = gVar.c();
        if (!(((long) iC) <= 125)) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125".toString());
        }
        this.sinkBuffer.R(i10 | 128);
        if (this.isClient) {
            this.sinkBuffer.R(iC | 128);
            Random random = this.random;
            byte[] bArr = this.maskKey;
            j0.f(bArr);
            random.nextBytes(bArr);
            this.sinkBuffer.O(this.maskKey);
            if (iC > 0) {
                c cVar = this.sinkBuffer;
                long j10 = cVar.f34879d;
                cVar.K(gVar);
                c cVar2 = this.sinkBuffer;
                c.a aVar = this.maskCursor;
                j0.f(aVar);
                cVar2.j(aVar);
                this.maskCursor.b(j10);
                WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        } else {
            this.sinkBuffer.R(iC);
            this.sinkBuffer.K(gVar);
        }
        this.sink.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        MessageDeflater messageDeflater = this.messageDeflater;
        if (messageDeflater == null) {
            return;
        }
        messageDeflater.close();
    }

    public final Random getRandom() {
        return this.random;
    }

    public final e getSink() {
        return this.sink;
    }

    public final void writeClose(int i10, g gVar) throws IOException {
        g gVarI = g.f34893g;
        if (i10 != 0 || gVar != null) {
            if (i10 != 0) {
                WebSocketProtocol.INSTANCE.validateCloseCode(i10);
            }
            c cVar = new c();
            cVar.c0(i10);
            if (gVar != null) {
                cVar.K(gVar);
            }
            gVarI = cVar.I();
        }
        try {
            writeControlFrame(8, gVarI);
        } finally {
            this.writerClosed = true;
        }
    }

    public final void writeMessageFrame(int i10, g gVar) throws IOException {
        j0.i(gVar, "data");
        if (this.writerClosed) {
            throw new IOException("closed");
        }
        this.messageBuffer.K(gVar);
        int i11 = i10 | 128;
        if (this.perMessageDeflate && gVar.c() >= this.minimumDeflateSize) {
            MessageDeflater messageDeflater = this.messageDeflater;
            if (messageDeflater == null) {
                messageDeflater = new MessageDeflater(this.noContextTakeover);
                this.messageDeflater = messageDeflater;
            }
            messageDeflater.deflate(this.messageBuffer);
            i11 |= 64;
        }
        long j10 = this.messageBuffer.f34879d;
        this.sinkBuffer.R(i11);
        int i12 = this.isClient ? 128 : 0;
        if (j10 <= 125) {
            this.sinkBuffer.R(((int) j10) | i12);
        } else if (j10 <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            this.sinkBuffer.R(i12 | 126);
            this.sinkBuffer.c0((int) j10);
        } else {
            this.sinkBuffer.R(i12 | 127);
            this.sinkBuffer.b0(j10);
        }
        if (this.isClient) {
            Random random = this.random;
            byte[] bArr = this.maskKey;
            j0.f(bArr);
            random.nextBytes(bArr);
            this.sinkBuffer.O(this.maskKey);
            if (j10 > 0) {
                c cVar = this.messageBuffer;
                c.a aVar = this.maskCursor;
                j0.f(aVar);
                cVar.j(aVar);
                this.maskCursor.b(0L);
                WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        }
        this.sinkBuffer.write(this.messageBuffer, j10);
        this.sink.s();
    }

    public final void writePing(g gVar) throws IOException {
        j0.i(gVar, "payload");
        writeControlFrame(9, gVar);
    }

    public final void writePong(g gVar) throws IOException {
        j0.i(gVar, "payload");
        writeControlFrame(10, gVar);
    }
}
