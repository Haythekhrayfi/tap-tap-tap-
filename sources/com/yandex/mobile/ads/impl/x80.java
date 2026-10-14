package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import ch.qos.logback.classic.Level;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class x80 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f26445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f26446e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f26447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c<? extends d> f26448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IOException f26449c;

    public interface a<T extends d> {
        b a(T t10, long j10, long j11, IOException iOException, int i10);

        void a(T t10, long j10, long j11);

        void a(T t10, long j10, long j11, boolean z10);
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f26450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f26451b;

        private b(int i10, long j10) {
            this.f26450a = i10;
            this.f26451b = j10;
        }

        public /* synthetic */ b(int i10, long j10, int i11) {
            this(i10, j10);
        }

        public final boolean a() {
            int i10 = this.f26450a;
            return i10 == 0 || i10 == 1;
        }
    }

    @SuppressLint({"HandlerLeak"})
    public final class c<T extends d> extends Handler implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f26452b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final T f26453c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f26454d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private a<T> f26455e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private IOException f26456f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f26457g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Thread f26458h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f26459i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private volatile boolean f26460j;

        public c(Looper looper, T t10, a<T> aVar, int i10, long j10) {
            super(looper);
            this.f26453c = t10;
            this.f26455e = aVar;
            this.f26452b = i10;
            this.f26454d = j10;
        }

        public final void a(int i10) throws IOException {
            IOException iOException = this.f26456f;
            if (iOException != null && this.f26457g > i10) {
                throw iOException;
            }
        }

        public final void a(long j10) {
            pa.b(x80.this.f26448b == null);
            x80.this.f26448b = this;
            if (j10 > 0) {
                sendEmptyMessageDelayed(0, j10);
                return;
            }
            this.f26456f = null;
            ExecutorService executorService = x80.this.f26447a;
            c cVar = x80.this.f26448b;
            Objects.requireNonNull(cVar);
            executorService.execute(cVar);
        }

        public final void a(boolean z10) {
            this.f26460j = z10;
            this.f26456f = null;
            if (hasMessages(0)) {
                this.f26459i = true;
                removeMessages(0);
                if (!z10) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.f26459i = true;
                    this.f26453c.b();
                    Thread thread = this.f26458h;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z10) {
                x80.this.f26448b = null;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                a<T> aVar = this.f26455e;
                Objects.requireNonNull(aVar);
                aVar.a(this.f26453c, jElapsedRealtime, jElapsedRealtime - this.f26454d, true);
                this.f26455e = null;
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (this.f26460j) {
                return;
            }
            int i10 = message.what;
            if (i10 == 0) {
                this.f26456f = null;
                ExecutorService executorService = x80.this.f26447a;
                c cVar = x80.this.f26448b;
                Objects.requireNonNull(cVar);
                executorService.execute(cVar);
                return;
            }
            if (i10 == 3) {
                throw ((Error) message.obj);
            }
            x80.this.f26448b = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = jElapsedRealtime - this.f26454d;
            a<T> aVar = this.f26455e;
            Objects.requireNonNull(aVar);
            if (this.f26459i) {
                aVar.a(this.f26453c, jElapsedRealtime, j10, false);
                return;
            }
            int i11 = message.what;
            if (i11 == 1) {
                try {
                    aVar.a(this.f26453c, jElapsedRealtime, j10);
                    return;
                } catch (RuntimeException e10) {
                    p90.a("LoadTask", "Unexpected exception handling load completed", e10);
                    x80.this.f26449c = new g(e10);
                    return;
                }
            }
            if (i11 != 2) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f26456f = iOException;
            int i12 = this.f26457g + 1;
            this.f26457g = i12;
            b bVarA = aVar.a(this.f26453c, jElapsedRealtime, j10, iOException, i12);
            if (bVarA.f26450a == 3) {
                x80.this.f26449c = this.f26456f;
            } else if (bVarA.f26450a != 2) {
                if (bVarA.f26450a == 1) {
                    this.f26457g = 1;
                }
                a(bVarA.f26451b != -9223372036854775807L ? bVarA.f26451b : Math.min((this.f26457g - 1) * 1000, Level.TRACE_INT));
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            g gVar;
            Message messageObtainMessage;
            boolean z10;
            try {
                synchronized (this) {
                    z10 = !this.f26459i;
                    this.f26458h = Thread.currentThread();
                }
                if (z10) {
                    d71.a("load:" + this.f26453c.getClass().getSimpleName());
                    try {
                        this.f26453c.a();
                        d71.a();
                    } catch (Throwable th) {
                        d71.a();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.f26458h = null;
                    Thread.interrupted();
                }
                if (this.f26460j) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (IOException e10) {
                if (this.f26460j) {
                    return;
                }
                messageObtainMessage = obtainMessage(2, e10);
                messageObtainMessage.sendToTarget();
            } catch (Exception e11) {
                if (this.f26460j) {
                    return;
                }
                p90.a("LoadTask", "Unexpected exception loading stream", e11);
                gVar = new g(e11);
                messageObtainMessage = obtainMessage(2, gVar);
                messageObtainMessage.sendToTarget();
            } catch (OutOfMemoryError e12) {
                if (this.f26460j) {
                    return;
                }
                p90.a("LoadTask", "OutOfMemory error loading stream", e12);
                gVar = new g(e12);
                messageObtainMessage = obtainMessage(2, gVar);
                messageObtainMessage.sendToTarget();
            } catch (Error e13) {
                if (!this.f26460j) {
                    p90.a("LoadTask", "Unexpected error loading stream", e13);
                    obtainMessage(3, e13).sendToTarget();
                }
                throw e13;
            }
        }
    }

    public interface d {
        void a() throws IOException;

        void b();
    }

    public interface e {
        void b();
    }

    public static final class f implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final e f26462b;

        public f(e eVar) {
            this.f26462b = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f26462b.b();
        }
    }

    public static final class g extends IOException {
        /* JADX WARN: Illegal instructions before constructor call */
        public g(Throwable th) {
            StringBuilder sbA = v60.a("Unexpected ");
            sbA.append(th.getClass().getSimpleName());
            sbA.append(": ");
            sbA.append(th.getMessage());
            super(sbA.toString(), th);
        }
    }

    static {
        long j10 = -9223372036854775807L;
        int i10 = 0;
        f26445d = new b(2, j10, i10);
        f26446e = new b(3, j10, i10);
    }

    public x80(String str) {
        this.f26447a = da1.c("ExoPlayer:Loader:" + str);
    }

    public static b a(long j10, boolean z10) {
        return new b(z10 ? 1 : 0, j10, 0);
    }

    public final <T extends d> long a(T t10, a<T> aVar, int i10) {
        Looper looper = (Looper) pa.b(Looper.myLooper());
        this.f26449c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new c(looper, t10, aVar, i10, jElapsedRealtime).a(0L);
        return jElapsedRealtime;
    }

    public final void a() {
        ((c) pa.b(this.f26448b)).a(false);
    }

    public final void a(int i10) throws IOException {
        IOException iOException = this.f26449c;
        if (iOException != null) {
            throw iOException;
        }
        c<? extends d> cVar = this.f26448b;
        if (cVar != null) {
            if (i10 == Integer.MIN_VALUE) {
                i10 = cVar.f26452b;
            }
            cVar.a(i10);
        }
    }

    public final void a(e eVar) {
        c<? extends d> cVar = this.f26448b;
        if (cVar != null) {
            cVar.a(true);
        }
        if (eVar != null) {
            this.f26447a.execute(new f(eVar));
        }
        this.f26447a.shutdown();
    }

    public final void b() {
        this.f26449c = null;
    }

    public final boolean c() {
        return this.f26449c != null;
    }

    public final boolean d() {
        return this.f26448b != null;
    }
}
