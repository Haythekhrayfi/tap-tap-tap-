package com.yandex.mobile.ads.exo.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import com.yandex.mobile.ads.impl.ay;
import com.yandex.mobile.ads.impl.ir;
import com.yandex.mobile.ads.impl.p90;
import com.yandex.mobile.ads.impl.pa;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class PlaceholderSurface extends Surface {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f18729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f18730e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f18732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f18733c;

    public static class a extends HandlerThread implements Handler.Callback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ir f18734b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Handler f18735c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Error f18736d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private RuntimeException f18737e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private PlaceholderSurface f18738f;

        public a() {
            super("ExoPlayer:PlaceholderSurface");
        }

        private void b(int i10) {
            Objects.requireNonNull(this.f18734b);
            this.f18734b.a(i10);
            this.f18738f = new PlaceholderSurface(this, this.f18734b.a(), i10 != 0, 0);
        }

        public final PlaceholderSurface a(int i10) {
            boolean z10;
            start();
            Handler handler = new Handler(getLooper(), this);
            this.f18735c = handler;
            this.f18734b = new ir(handler);
            synchronized (this) {
                z10 = false;
                this.f18735c.obtainMessage(1, i10, 0).sendToTarget();
                while (this.f18738f == null && this.f18737e == null && this.f18736d == null) {
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
            RuntimeException runtimeException = this.f18737e;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.f18736d;
            if (error != null) {
                throw error;
            }
            PlaceholderSurface placeholderSurface = this.f18738f;
            Objects.requireNonNull(placeholderSurface);
            return placeholderSurface;
        }

        public final void a() {
            Objects.requireNonNull(this.f18735c);
            this.f18735c.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i10 = message.what;
            try {
                if (i10 != 1) {
                    if (i10 != 2) {
                        return true;
                    }
                    try {
                        Objects.requireNonNull(this.f18734b);
                        this.f18734b.b();
                    } catch (Throwable th) {
                        try {
                            p90.a("PlaceholderSurface", "Failed to release placeholder surface", th);
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
                    p90.a("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.f18736d = e10;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e11) {
                    p90.a("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.f18737e = e11;
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

    private PlaceholderSurface(a aVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f18732b = aVar;
        this.f18731a = z10;
    }

    public /* synthetic */ PlaceholderSurface(a aVar, SurfaceTexture surfaceTexture, boolean z10, int i10) {
        this(aVar, surfaceTexture, z10);
    }

    public static PlaceholderSurface a(Context context, boolean z10) {
        pa.b(!z10 || a(context));
        return new a().a(z10 ? f18729d : 0);
    }

    public static synchronized boolean a(Context context) {
        int i10;
        if (!f18730e) {
            if (ay.a(context)) {
                i10 = ay.c() ? 1 : 2;
            } else {
                i10 = 0;
            }
            f18729d = i10;
            f18730e = true;
        }
        return f18729d != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f18732b) {
            if (!this.f18733c) {
                this.f18732b.a();
                this.f18733c = true;
            }
        }
    }
}
