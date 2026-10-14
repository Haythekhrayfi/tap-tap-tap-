package com.applovin.exoplayer2.k;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import ch.qos.logback.classic.Level;
import com.applovin.exoplayer2.l.ah;
import com.applovin.exoplayer2.l.ai;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f7510a = a(false, -9223372036854775807L);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f7511b = a(true, -9223372036854775807L);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f7512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f7513d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ExecutorService f7514e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c<? extends d> f7515f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private IOException f7516g;

    public interface a<T extends d> {
        b a(T t10, long j10, long j11, IOException iOException, int i10);

        void a(T t10, long j10, long j11);

        void a(T t10, long j10, long j11, boolean z10);
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f7517a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f7518b;

        private b(int i10, long j10) {
            this.f7517a = i10;
            this.f7518b = j10;
        }

        public boolean a() {
            int i10 = this.f7517a;
            return i10 == 0 || i10 == 1;
        }
    }

    @SuppressLint({"HandlerLeak"})
    public final class c<T extends d> extends Handler implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7519a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final T f7521c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f7522d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private a<T> f7523e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private IOException f7524f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f7525g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Thread f7526h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f7527i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private volatile boolean f7528j;

        public c(Looper looper, T t10, a<T> aVar, int i10, long j10) {
            super(looper);
            this.f7521c = t10;
            this.f7523e = aVar;
            this.f7519a = i10;
            this.f7522d = j10;
        }

        private void a() {
            this.f7524f = null;
            w.this.f7514e.execute((Runnable) com.applovin.exoplayer2.l.a.b(w.this.f7515f));
        }

        private void b() {
            w.this.f7515f = null;
        }

        private long c() {
            return Math.min((this.f7525g - 1) * 1000, Level.TRACE_INT);
        }

        public void a(int i10) throws IOException {
            IOException iOException = this.f7524f;
            if (iOException != null && this.f7525g > i10) {
                throw iOException;
            }
        }

        public void a(long j10) {
            com.applovin.exoplayer2.l.a.b(w.this.f7515f == null);
            w.this.f7515f = this;
            if (j10 > 0) {
                sendEmptyMessageDelayed(0, j10);
            } else {
                a();
            }
        }

        public void a(boolean z10) {
            this.f7528j = z10;
            this.f7524f = null;
            if (hasMessages(0)) {
                this.f7527i = true;
                removeMessages(0);
                if (!z10) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.f7527i = true;
                    this.f7521c.a();
                    Thread thread = this.f7526h;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z10) {
                b();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ((a) com.applovin.exoplayer2.l.a.b(this.f7523e)).a(this.f7521c, jElapsedRealtime, jElapsedRealtime - this.f7522d, true);
                this.f7523e = null;
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f7528j) {
                return;
            }
            int i10 = message.what;
            if (i10 == 0) {
                a();
                return;
            }
            if (i10 == 3) {
                throw ((Error) message.obj);
            }
            b();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = jElapsedRealtime - this.f7522d;
            a aVar = (a) com.applovin.exoplayer2.l.a.b(this.f7523e);
            if (this.f7527i) {
                aVar.a(this.f7521c, jElapsedRealtime, j10, false);
                return;
            }
            int i11 = message.what;
            if (i11 == 1) {
                try {
                    aVar.a(this.f7521c, jElapsedRealtime, j10);
                    return;
                } catch (RuntimeException e10) {
                    com.applovin.exoplayer2.l.q.c("LoadTask", "Unexpected exception handling load completed", e10);
                    w.this.f7516g = new g(e10);
                    return;
                }
            }
            if (i11 != 2) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f7524f = iOException;
            int i12 = this.f7525g + 1;
            this.f7525g = i12;
            b bVarA = aVar.a(this.f7521c, jElapsedRealtime, j10, iOException, i12);
            if (bVarA.f7517a == 3) {
                w.this.f7516g = this.f7524f;
            } else if (bVarA.f7517a != 2) {
                if (bVarA.f7517a == 1) {
                    this.f7525g = 1;
                }
                a(bVarA.f7518b != -9223372036854775807L ? bVarA.f7518b : c());
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar;
            Message messageObtainMessage;
            boolean z10;
            try {
                synchronized (this) {
                    z10 = !this.f7527i;
                    this.f7526h = Thread.currentThread();
                }
                if (z10) {
                    ah.a("load:" + this.f7521c.getClass().getSimpleName());
                    try {
                        this.f7521c.b();
                        ah.a();
                    } catch (Throwable th) {
                        ah.a();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.f7526h = null;
                    Thread.interrupted();
                }
                if (this.f7528j) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (IOException e10) {
                if (this.f7528j) {
                    return;
                }
                messageObtainMessage = obtainMessage(2, e10);
                messageObtainMessage.sendToTarget();
            } catch (Error e11) {
                if (!this.f7528j) {
                    com.applovin.exoplayer2.l.q.c("LoadTask", "Unexpected error loading stream", e11);
                    obtainMessage(3, e11).sendToTarget();
                }
                throw e11;
            } catch (Exception e12) {
                if (this.f7528j) {
                    return;
                }
                com.applovin.exoplayer2.l.q.c("LoadTask", "Unexpected exception loading stream", e12);
                gVar = new g(e12);
                messageObtainMessage = obtainMessage(2, gVar);
                messageObtainMessage.sendToTarget();
            } catch (OutOfMemoryError e13) {
                if (this.f7528j) {
                    return;
                }
                com.applovin.exoplayer2.l.q.c("LoadTask", "OutOfMemory error loading stream", e13);
                gVar = new g(e13);
                messageObtainMessage = obtainMessage(2, gVar);
                messageObtainMessage.sendToTarget();
            }
        }
    }

    public interface d {
        void a();

        void b() throws IOException;
    }

    public interface e {
        void h();
    }

    public static final class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f7529a;

        public f(e eVar) {
            this.f7529a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f7529a.h();
        }
    }

    public static final class g extends IOException {
        /* JADX WARN: Illegal instructions before constructor call */
        public g(Throwable th) {
            StringBuilder sbA = defpackage.a.a("Unexpected ");
            sbA.append(th.getClass().getSimpleName());
            sbA.append(": ");
            sbA.append(th.getMessage());
            super(sbA.toString(), th);
        }
    }

    static {
        long j10 = -9223372036854775807L;
        f7512c = new b(2, j10);
        f7513d = new b(3, j10);
    }

    public w(String str) {
        this.f7514e = ai.a("ExoPlayer:Loader:" + str);
    }

    public static b a(boolean z10, long j10) {
        return new b(z10 ? 1 : 0, j10);
    }

    public <T extends d> long a(T t10, a<T> aVar, int i10) {
        Looper looper = (Looper) com.applovin.exoplayer2.l.a.a(Looper.myLooper());
        this.f7516g = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new c(looper, t10, aVar, i10, jElapsedRealtime).a(0L);
        return jElapsedRealtime;
    }

    public void a(int i10) throws IOException {
        IOException iOException = this.f7516g;
        if (iOException != null) {
            throw iOException;
        }
        c<? extends d> cVar = this.f7515f;
        if (cVar != null) {
            if (i10 == Integer.MIN_VALUE) {
                i10 = cVar.f7519a;
            }
            cVar.a(i10);
        }
    }

    public void a(e eVar) {
        c<? extends d> cVar = this.f7515f;
        if (cVar != null) {
            cVar.a(true);
        }
        if (eVar != null) {
            this.f7514e.execute(new f(eVar));
        }
        this.f7514e.shutdown();
    }

    public boolean a() {
        return this.f7516g != null;
    }

    public void b() {
        this.f7516g = null;
    }

    public boolean c() {
        return this.f7515f != null;
    }

    public void d() {
        ((c) com.applovin.exoplayer2.l.a.a(this.f7515f)).a(false);
    }
}
