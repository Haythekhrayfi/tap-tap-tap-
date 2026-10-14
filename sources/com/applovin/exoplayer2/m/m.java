package com.applovin.exoplayer2.m;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import com.applovin.exoplayer2.l.ai;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.exoplayer2.m.e f7850a = new com.applovin.exoplayer2.m.e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f7851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f7852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f7853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Surface f7854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f7855f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f7856g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f7857h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f7858i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f7859j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f7860k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f7861l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f7862m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f7863n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f7864o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f7865p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f7866q;

    public static final class a {
        public static void a(Surface surface, float f10) {
            try {
                surface.setFrameRate(f10, f10 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD ? 0 : 1);
            } catch (IllegalStateException e10) {
                com.applovin.exoplayer2.l.q.c("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
            }
        }
    }

    public interface b {

        public interface a {
            void onDefaultDisplayChanged(Display display);
        }

        void a();

        void a(a aVar);
    }

    public static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WindowManager f7867a;

        private c(WindowManager windowManager) {
            this.f7867a = windowManager;
        }

        public static b a(Context context) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                return new c(windowManager);
            }
            return null;
        }

        @Override // com.applovin.exoplayer2.m.m.b
        public void a() {
        }

        @Override // com.applovin.exoplayer2.m.m.b
        public void a(b.a aVar) {
            aVar.onDefaultDisplayChanged(this.f7867a.getDefaultDisplay());
        }
    }

    public static final class d implements DisplayManager.DisplayListener, b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final DisplayManager f7868a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b.a f7869b;

        private d(DisplayManager displayManager) {
            this.f7868a = displayManager;
        }

        public static b a(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager != null) {
                return new d(displayManager);
            }
            return null;
        }

        private Display b() {
            return this.f7868a.getDisplay(0);
        }

        @Override // com.applovin.exoplayer2.m.m.b
        public void a() {
            this.f7868a.unregisterDisplayListener(this);
            this.f7869b = null;
        }

        @Override // com.applovin.exoplayer2.m.m.b
        public void a(b.a aVar) {
            this.f7869b = aVar;
            this.f7868a.registerDisplayListener(this, ai.a());
            aVar.onDefaultDisplayChanged(b());
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            b.a aVar = this.f7869b;
            if (aVar == null || i10 != 0) {
                return;
            }
            aVar.onDefaultDisplayChanged(b());
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
        }
    }

    public static final class e implements Handler.Callback, Choreographer.FrameCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final e f7870b = new e();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile long f7871a = -9223372036854775807L;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Handler f7872c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final HandlerThread f7873d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Choreographer f7874e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f7875f;

        private e() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f7873d = handlerThread;
            handlerThread.start();
            Handler handlerA = ai.a(handlerThread.getLooper(), (Handler.Callback) this);
            this.f7872c = handlerA;
            handlerA.sendEmptyMessage(0);
        }

        public static e a() {
            return f7870b;
        }

        private void d() {
            this.f7874e = Choreographer.getInstance();
        }

        private void e() {
            int i10 = this.f7875f + 1;
            this.f7875f = i10;
            if (i10 == 1) {
                ((Choreographer) com.applovin.exoplayer2.l.a.b(this.f7874e)).postFrameCallback(this);
            }
        }

        private void f() {
            int i10 = this.f7875f - 1;
            this.f7875f = i10;
            if (i10 == 0) {
                ((Choreographer) com.applovin.exoplayer2.l.a.b(this.f7874e)).removeFrameCallback(this);
                this.f7871a = -9223372036854775807L;
            }
        }

        public void b() {
            this.f7872c.sendEmptyMessage(1);
        }

        public void c() {
            this.f7872c.sendEmptyMessage(2);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            this.f7871a = j10;
            ((Choreographer) com.applovin.exoplayer2.l.a.b(this.f7874e)).postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                d();
                return true;
            }
            if (i10 == 1) {
                e();
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            f();
            return true;
        }
    }

    public m(Context context) {
        b bVarA = a(context);
        this.f7851b = bVarA;
        this.f7852c = bVarA != null ? e.a() : null;
        this.f7860k = -9223372036854775807L;
        this.f7861l = -9223372036854775807L;
        this.f7855f = -1.0f;
        this.f7858i = 1.0f;
        this.f7859j = 0;
    }

    private static long a(long j10, long j11, long j12) {
        long j13;
        long j14 = (((j10 - j11) / j12) * j12) + j11;
        if (j10 <= j14) {
            j13 = j14 - j12;
        } else {
            j13 = j14;
            j14 = j12 + j14;
        }
        return j14 - j10 < j10 - j13 ? j14 : j13;
    }

    private static b a(Context context) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        b bVarA = ai.f7595a >= 17 ? d.a(applicationContext) : null;
        return bVarA == null ? c.a(applicationContext) : bVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Display display) {
        long j10;
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            this.f7860k = refreshRate;
            j10 = (refreshRate * 80) / 100;
        } else {
            com.applovin.exoplayer2.l.q.c("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            j10 = -9223372036854775807L;
            this.f7860k = -9223372036854775807L;
        }
        this.f7861l = j10;
    }

    private void a(boolean z10) {
        Surface surface;
        if (ai.f7595a < 30 || (surface = this.f7854e) == null || this.f7859j == Integer.MIN_VALUE) {
            return;
        }
        float f10 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        if (this.f7853d) {
            float f11 = this.f7856g;
            if (f11 != -1.0f) {
                f10 = this.f7858i * f11;
            }
        }
        if (z10 || this.f7857h != f10) {
            this.f7857h = f10;
            a.a(surface, f10);
        }
    }

    private static boolean a(long j10, long j11) {
        return Math.abs(j10 - j11) <= 20000000;
    }

    private void f() {
        this.f7862m = 0L;
        this.f7865p = -1L;
        this.f7863n = -1L;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    private void g() {
        if (ai.f7595a < 30 || this.f7854e == null) {
            return;
        }
        float f10 = this.f7850a.b() ? this.f7850a.f() : this.f7855f;
        float f11 = this.f7856g;
        if (f10 == f11) {
            return;
        }
        boolean z10 = true;
        if (f10 != -1.0f && f11 != -1.0f) {
            if (Math.abs(f10 - this.f7856g) < (this.f7850a.b() && (this.f7850a.d() > 5000000000L ? 1 : (this.f7850a.d() == 5000000000L ? 0 : -1)) >= 0 ? 0.02f : 1.0f)) {
                z10 = false;
            }
        } else if (f10 == -1.0f && this.f7850a.c() < 30) {
            z10 = false;
        }
        if (z10) {
            this.f7856g = f10;
            a(false);
        }
    }

    private void h() {
        Surface surface;
        if (ai.f7595a < 30 || (surface = this.f7854e) == null || this.f7859j == Integer.MIN_VALUE || this.f7857h == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            return;
        }
        this.f7857h = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        a.a(surface, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
    }

    public void a() {
        if (this.f7851b != null) {
            ((e) com.applovin.exoplayer2.l.a.b(this.f7852c)).b();
            this.f7851b.a(new d0.a(this));
        }
    }

    public void a(float f10) {
        this.f7858i = f10;
        f();
        a(false);
    }

    public void a(int i10) {
        if (this.f7859j == i10) {
            return;
        }
        this.f7859j = i10;
        a(true);
    }

    public void a(long j10) {
        long j11 = this.f7863n;
        if (j11 != -1) {
            this.f7865p = j11;
            this.f7866q = this.f7864o;
        }
        this.f7862m++;
        this.f7850a.a(j10 * 1000);
        g();
    }

    public void a(Surface surface) {
        if (surface instanceof com.applovin.exoplayer2.m.d) {
            surface = null;
        }
        if (this.f7854e == surface) {
            return;
        }
        h();
        this.f7854e = surface;
        a(true);
    }

    public long b(long j10) {
        long j11;
        if (this.f7865p == -1 || !this.f7850a.b()) {
            j11 = j10;
        } else {
            long jE = this.f7866q + ((long) (((this.f7862m - this.f7865p) * this.f7850a.e()) / this.f7858i));
            if (a(j10, jE)) {
                j11 = jE;
            } else {
                f();
                j11 = j10;
            }
        }
        this.f7863n = this.f7862m;
        this.f7864o = j11;
        e eVar = this.f7852c;
        if (eVar == null || this.f7860k == -9223372036854775807L) {
            return j11;
        }
        long j12 = eVar.f7871a;
        return j12 == -9223372036854775807L ? j11 : a(j11, j12, this.f7860k) - this.f7861l;
    }

    public void b() {
        this.f7853d = true;
        f();
        a(false);
    }

    public void b(float f10) {
        this.f7855f = f10;
        this.f7850a.a();
        g();
    }

    public void c() {
        f();
    }

    public void d() {
        this.f7853d = false;
        h();
    }

    public void e() {
        b bVar = this.f7851b;
        if (bVar != null) {
            bVar.a();
            ((e) com.applovin.exoplayer2.l.a.b(this.f7852c)).c();
        }
    }
}
