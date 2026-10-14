package ch.qos.logback.core.net.server;

import androidx.activity.j;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.util.CloseUtil;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.net.SocketException;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public class b extends ContextAwareBase implements u2.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Socket f3708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public BlockingQueue<Serializable> f3709e;

    public b(String str, Socket socket) {
        this.f3707c = j.a("client ", str, ": ");
        this.f3708d = socket;
    }

    @Override // u2.a
    public void S(BlockingQueue<Serializable> blockingQueue) {
        this.f3709e = blockingQueue;
    }

    public final ObjectOutputStream a() throws IOException {
        return this.f3708d == null ? new ObjectOutputStream(null) : new ObjectOutputStream(this.f3708d.getOutputStream());
    }

    @Override // ch.qos.logback.core.net.server.Client, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Socket socket = this.f3708d;
        if (socket == null) {
            return;
        }
        CloseUtil.closeQuietly(socket);
    }

    @Override // u2.a
    public boolean o(Serializable serializable) {
        BlockingQueue<Serializable> blockingQueue = this.f3709e;
        if (blockingQueue != null) {
            return blockingQueue.offer(serializable);
        }
        throw new IllegalStateException("client has no event queue");
    }

    @Override // java.lang.Runnable
    public void run() {
        StringBuilder sb2;
        addInfo(this.f3707c + "connected");
        ObjectOutputStream objectOutputStreamA = null;
        try {
            try {
                try {
                    objectOutputStreamA = a();
                    loop0: while (true) {
                        int i10 = 0;
                        while (true) {
                            if (Thread.currentThread().isInterrupted()) {
                                break loop0;
                            }
                            try {
                                objectOutputStreamA.writeObject(this.f3709e.take());
                                objectOutputStreamA.flush();
                                i10++;
                                if (i10 >= 70) {
                                    try {
                                        objectOutputStreamA.reset();
                                        break;
                                    } catch (InterruptedException unused) {
                                        i10 = 0;
                                        Thread.currentThread().interrupt();
                                    }
                                } else {
                                    continue;
                                }
                            } catch (InterruptedException unused2) {
                            }
                        }
                    }
                    CloseUtil.closeQuietly(objectOutputStreamA);
                    close();
                    sb2 = new StringBuilder();
                } catch (SocketException e10) {
                    addInfo(this.f3707c + e10);
                    if (objectOutputStreamA != null) {
                        CloseUtil.closeQuietly(objectOutputStreamA);
                    }
                    close();
                    sb2 = new StringBuilder();
                }
            } catch (IOException e11) {
                addError(this.f3707c + e11);
                if (objectOutputStreamA != null) {
                    CloseUtil.closeQuietly(objectOutputStreamA);
                }
                close();
                sb2 = new StringBuilder();
            } catch (RuntimeException e12) {
                addError(this.f3707c + e12);
                if (objectOutputStreamA != null) {
                    CloseUtil.closeQuietly(objectOutputStreamA);
                }
                close();
                sb2 = new StringBuilder();
            }
            sb2.append(this.f3707c);
            sb2.append("connection closed");
            addInfo(sb2.toString());
        } catch (Throwable th) {
            if (objectOutputStreamA != null) {
                CloseUtil.closeQuietly(objectOutputStreamA);
            }
            close();
            addInfo(this.f3707c + "connection closed");
            throw th;
        }
    }
}
