package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.yandex.mobile.ads.exo.video.PlaceholderSurface;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class ye1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ev f26791a = new ev();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f26792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f26793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f26794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Surface f26795e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f26796f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f26797g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f26798h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f26799i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f26800j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f26801k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f26802l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f26803m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f26804n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f26805o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f26806p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f26807q;

    public static final class a {
        public static void a(Surface surface, float f10) {
            try {
                surface.setFrameRate(f10, f10 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD ? 0 : 1);
            } catch (IllegalStateException e10) {
                p90.a("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
            }
        }
    }

    public interface b {

        public interface a {
            void a(Display display);
        }

        void a();

        void a(a aVar);
    }

    public static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WindowManager f26808a;

        private c(WindowManager windowManager) {
            this.f26808a = windowManager;
        }

        public static c a(Context context) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                return new c(windowManager);
            }
            return null;
        }

        @Override // com.yandex.mobile.ads.impl.ye1.b
        public final void a() {
        }

        @Override // com.yandex.mobile.ads.impl.ye1.b
        public final void a(b.a aVar) {
            aVar.a(this.f26808a.getDefaultDisplay());
        }
    }

    public static final class d implements b, DisplayManager.DisplayListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final DisplayManager f26809a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b.a f26810b;

        private d(DisplayManager displayManager) {
            this.f26809a = displayManager;
        }

        public static d a(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager != null) {
                return new d(displayManager);
            }
            return null;
        }

        @Override // com.yandex.mobile.ads.impl.ye1.b
        public final void a() {
            this.f26809a.unregisterDisplayListener(this);
            this.f26810b = null;
        }

        @Override // com.yandex.mobile.ads.impl.ye1.b
        public final void a(b.a aVar) {
            this.f26810b = aVar;
            this.f26809a.registerDisplayListener(this, da1.a((Handler.Callback) null));
            aVar.a(this.f26809a.getDisplay(0));
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i10) {
            b.a aVar = this.f26810b;
            if (aVar == null || i10 != 0) {
                return;
            }
            aVar.a(this.f26809a.getDisplay(0));
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i10) {
        }
    }

    public static final class e implements Choreographer.FrameCallback, Handler.Callback {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final e f26811f = new e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile long f26812b = -9223372036854775807L;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Handler f26813c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Choreographer f26814d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f26815e;

        private e() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            handlerThread.start();
            Handler handlerA = da1.a(handlerThread.getLooper(), (Handler.Callback) this);
            this.f26813c = handlerA;
            handlerA.sendEmptyMessage(0);
        }

        public static e b() {
            return f26811f;
        }

        public final void a() {
            this.f26813c.sendEmptyMessage(1);
        }

        public final void c() {
            this.f26813c.sendEmptyMessage(2);
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j10) {
            this.f26812b = j10;
            Choreographer choreographer = this.f26814d;
            Objects.requireNonNull(choreographer);
            choreographer.postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                try {
                    this.f26814d = Choreographer.getInstance();
                } catch (RuntimeException e10) {
                    p90.b("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e10);
                }
                return true;
            }
            if (i10 == 1) {
                Choreographer choreographer = this.f26814d;
                if (choreographer != null) {
                    int i11 = this.f26815e + 1;
                    this.f26815e = i11;
                    if (i11 == 1) {
                        choreographer.postFrameCallback(this);
                    }
                }
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            Choreographer choreographer2 = this.f26814d;
            if (choreographer2 != null) {
                int i12 = this.f26815e - 1;
                this.f26815e = i12;
                if (i12 == 0) {
                    choreographer2.removeFrameCallback(this);
                    this.f26812b = -9223372036854775807L;
                }
            }
            return true;
        }
    }

    public ye1(Context context) {
        b bVarA = a(context);
        this.f26792b = bVarA;
        this.f26793c = bVarA != null ? e.b() : null;
        this.f26801k = -9223372036854775807L;
        this.f26802l = -9223372036854775807L;
        this.f26796f = -1.0f;
        this.f26799i = 1.0f;
        this.f26800j = 0;
    }

    private static b a(Context context) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        d dVarA = da1.f19803a >= 17 ? d.a(applicationContext) : null;
        return dVarA == null ? c.a(applicationContext) : dVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Display display) {
        long j10;
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            this.f26801k = refreshRate;
            j10 = (refreshRate * 80) / 100;
        } else {
            p90.d("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            j10 = -9223372036854775807L;
            this.f26801k = -9223372036854775807L;
        }
        this.f26802l = j10;
    }

    private void a(boolean z10) {
        Surface surface;
        if (da1.f19803a < 30 || (surface = this.f26795e) == null || this.f26800j == Integer.MIN_VALUE) {
            return;
        }
        float f10 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        if (this.f26794d) {
            float f11 = this.f26797g;
            if (f11 != -1.0f) {
                f10 = this.f26799i * f11;
            }
        }
        if (z10 || this.f26798h != f10) {
            this.f26798h = f10;
            a.a(surface, f10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    private void d() {
        if (da1.f19803a < 30 || this.f26795e == null) {
            return;
        }
        float fB = this.f26791a.e() ? this.f26791a.b() : this.f26796f;
        float f10 = this.f26797g;
        if (fB == f10) {
            return;
        }
        boolean z10 = true;
        if (fB != -1.0f && f10 != -1.0f) {
            if (Math.abs(fB - this.f26797g) < (this.f26791a.e() && (this.f26791a.d() > 5000000000L ? 1 : (this.f26791a.d() == 5000000000L ? 0 : -1)) >= 0 ? 0.02f : 1.0f)) {
                z10 = false;
            }
        } else if (fB == -1.0f && this.f26791a.c() < 30) {
            z10 = false;
        }
        if (z10) {
            this.f26797g = fB;
            a(false);
        }
    }

    public final long a(long j10) {
        long j11;
        if (this.f26806p != -1 && this.f26791a.e()) {
            long jA = this.f26807q + ((long) (((this.f26803m - this.f26806p) * this.f26791a.a()) / this.f26799i));
            if (Math.abs(j10 - jA) <= 20000000) {
                j10 = jA;
            } else {
                this.f26803m = 0L;
                this.f26806p = -1L;
                this.f26804n = -1L;
            }
        }
        this.f26804n = this.f26803m;
        this.f26805o = j10;
        e eVar = this.f26793c;
        if (eVar == null || this.f26801k == -9223372036854775807L) {
            return j10;
        }
        long j12 = eVar.f26812b;
        if (j12 == -9223372036854775807L) {
            return j10;
        }
        long j13 = this.f26801k;
        long j14 = (((j10 - j12) / j13) * j13) + j12;
        if (j10 <= j14) {
            j11 = j14 - j13;
        } else {
            j11 = j14;
            j14 = j13 + j14;
        }
        if (j14 - j10 >= j10 - j11) {
            j14 = j11;
        }
        return j14 - this.f26802l;
    }

    public final void a() {
        this.f26803m = 0L;
        this.f26806p = -1L;
        this.f26804n = -1L;
    }

    public final void a(float f10) {
        this.f26796f = f10;
        this.f26791a.f();
        d();
    }

    public final void a(int i10) {
        if (this.f26800j == i10) {
            return;
        }
        this.f26800j = i10;
        a(true);
    }

    public final void a(Surface surface) {
        if (surface instanceof PlaceholderSurface) {
            surface = null;
        }
        Surface surface2 = this.f26795e;
        if (surface2 == surface) {
            return;
        }
        if (da1.f19803a >= 30 && surface2 != null && this.f26800j != Integer.MIN_VALUE && this.f26798h != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            this.f26798h = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            a.a(surface2, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        }
        this.f26795e = surface;
        a(true);
    }

    public final void b() {
        this.f26794d = true;
        this.f26803m = 0L;
        this.f26806p = -1L;
        this.f26804n = -1L;
        if (this.f26792b != null) {
            e eVar = this.f26793c;
            Objects.requireNonNull(eVar);
            eVar.a();
            this.f26792b.a(new ho1(this));
        }
        a(false);
    }

    public final void b(float f10) {
        this.f26799i = f10;
        this.f26803m = 0L;
        this.f26806p = -1L;
        this.f26804n = -1L;
        a(false);
    }

    public final void b(long j10) {
        long j11 = this.f26804n;
        if (j11 != -1) {
            this.f26806p = j11;
            this.f26807q = this.f26805o;
        }
        this.f26803m++;
        this.f26791a.a(j10 * 1000);
        d();
    }

    public final void c() {
        Surface surface;
        this.f26794d = false;
        b bVar = this.f26792b;
        if (bVar != null) {
            bVar.a();
            e eVar = this.f26793c;
            Objects.requireNonNull(eVar);
            eVar.c();
        }
        if (da1.f19803a < 30 || (surface = this.f26795e) == null || this.f26800j == Integer.MIN_VALUE || this.f26798h == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            return;
        }
        this.f26798h = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        a.a(surface, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
    }
}
