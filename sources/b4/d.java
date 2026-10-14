package b4;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public class d extends InputStream {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Queue<d> f3292e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InputStream f3293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public IOException f3294d;

    static {
        char[] cArr = j.f3307a;
        f3292e = new ArrayDeque(0);
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f3293c.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f3293c.close();
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f3293c.mark(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f3293c.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            return this.f3293c.read();
        } catch (IOException e10) {
            this.f3294d = e10;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            return this.f3293c.read(bArr);
        } catch (IOException e10) {
            this.f3294d = e10;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        try {
            return this.f3293c.read(bArr, i10, i11);
        } catch (IOException e10) {
            this.f3294d = e10;
            return -1;
        }
    }

    public void release() {
        this.f3294d = null;
        this.f3293c = null;
        Queue<d> queue = f3292e;
        synchronized (queue) {
            ((ArrayDeque) queue).offer(this);
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f3293c.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        try {
            return this.f3293c.skip(j10);
        } catch (IOException e10) {
            this.f3294d = e10;
            return 0L;
        }
    }
}
