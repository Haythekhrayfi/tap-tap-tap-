package com.applovin.exoplayer2.m;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class d extends Surface {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f7769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f7770c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7771a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f7772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f7773e;

    public static class a extends HandlerThread implements Handler.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.applovin.exoplayer2.l.j f7774a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Handler f7775b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Error f7776c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private RuntimeException f7777d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private d f7778e;

        public a() {
            super("ExoPlayer:DummySurface");
        }

        private void b() {
            com.applovin.exoplayer2.l.a.b(this.f7774a);
            this.f7774a.a();
        }

        private void b(int i10) {
            com.applovin.exoplayer2.l.a.b(this.f7774a);
            this.f7774a.a(i10);
            this.f7778e = new d(this, this.f7774a.b(), i10 != 0);
        }

        public d a(int i10) {
            boolean z10;
            start();
            Handler handler = new Handler(getLooper(), this);
            this.f7775b = handler;
            this.f7774a = new com.applovin.exoplayer2.l.j(handler);
            synchronized (this) {
                z10 = false;
                this.f7775b.obtainMessage(1, i10, 0).sendToTarget();
                while (this.f7778e == null && this.f7777d == null && this.f7776c == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f7777d;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.f7776c;
            if (error == null) {
                return (d) com.applovin.exoplayer2.l.a.b(this.f7778e);
            }
            throw error;
        }

        public void a() {
            com.applovin.exoplayer2.l.a.b(this.f7775b);
            this.f7775b.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            try {
                if (i10 != 1) {
                    if (i10 != 2) {
                        return true;
                    }
                    try {
                        b();
                    } catch (Throwable th) {
                        try {
                            com.applovin.exoplayer2.l.q.c("DummySurface", "Failed to release dummy surface", th);
                        } finally {
                            quit();
                        }
                    }
                    return true;
                }
                try {
                    b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e10) {
                    com.applovin.exoplayer2.l.q.c("DummySurface", "Failed to initialize dummy surface", e10);
                    this.f7776c = e10;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e11) {
                    com.applovin.exoplayer2.l.q.c("DummySurface", "Failed to initialize dummy surface", e11);
                    this.f7777d = e11;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th2) {
                synchronized (this) {
                    notify();
                    throw th2;
                }
            }
        }
    }

    private d(a aVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f7772d = aVar;
        this.f7771a = z10;
    }

    public static d a(Context context, boolean z10) {
        com.applovin.exoplayer2.l.a.b(!z10 || a(context));
        return new a().a(z10 ? f7769b : 0);
    }

    public static synchronized boolean a(Context context) {
        if (!f7770c) {
            f7769b = b(context);
            f7770c = true;
        }
        return f7769b != 0;
    }

    private static int b(Context context) {
        if (com.applovin.exoplayer2.l.n.a(context)) {
            return com.applovin.exoplayer2.l.n.a() ? 1 : 2;
        }
        return 0;
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f7772d) {
            if (!this.f7773e) {
                this.f7772d.a();
                this.f7773e = true;
            }
        }
    }
}
