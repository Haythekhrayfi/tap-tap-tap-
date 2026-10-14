package com.yandex.metrica.impl.ob;

import android.app.Activity;

/* JADX INFO: loaded from: classes.dex */
public class I2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W0 f14173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2097y f14174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1916qm<C1944s1> f14175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C2097y.b f14176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C2097y.b f14177e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C2122z f14178f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C2072x f14179g;

    public class a implements C2097y.b {

        /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.I2$a$a, reason: collision with other inner class name */
        public class C0174a implements Y1<C1944s1> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Activity f14181a;

            public C0174a(Activity activity) {
                this.f14181a = activity;
            }

            @Override // com.yandex.metrica.impl.ob.Y1
            public void b(C1944s1 c1944s1) {
                I2.a(I2.this, this.f14181a, c1944s1);
            }
        }

        public a() {
        }

        @Override // com.yandex.metrica.impl.ob.C2097y.b
        public void a(Activity activity, C2097y.a aVar) {
            I2.this.f14175c.a((Y1) new C0174a(activity));
        }
    }

    public class b implements C2097y.b {

        public class a implements Y1<C1944s1> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Activity f14184a;

            public a(Activity activity) {
                this.f14184a = activity;
            }

            @Override // com.yandex.metrica.impl.ob.Y1
            public void b(C1944s1 c1944s1) {
                I2.b(I2.this, this.f14184a, c1944s1);
            }
        }

        public b() {
        }

        @Override // com.yandex.metrica.impl.ob.C2097y.b
        public void a(Activity activity, C2097y.a aVar) {
            I2.this.f14175c.a((Y1) new a(activity));
        }
    }

    public I2(W0 w10, C2097y c2097y, C2072x c2072x, C1916qm<C1944s1> c1916qm, C2122z c2122z) {
        this.f14174b = c2097y;
        this.f14173a = w10;
        this.f14179g = c2072x;
        this.f14175c = c1916qm;
        this.f14178f = c2122z;
        this.f14176d = new a();
        this.f14177e = new b();
    }

    public I2(C2097y c2097y, InterfaceExecutorC1966sn interfaceExecutorC1966sn, C2072x c2072x) {
        this(Oh.a(), c2097y, c2072x, new C1916qm(interfaceExecutorC1966sn), new C2122z());
    }

    public static void a(I2 i10, Activity activity, U0 u10) {
        if (i10.f14178f.a(activity, C2122z.a.RESUMED)) {
            ((C1944s1) u10).a(activity);
        }
    }

    public static void b(I2 i10, Activity activity, U0 u10) {
        if (i10.f14178f.a(activity, C2122z.a.PAUSED)) {
            ((C1944s1) u10).b(activity);
        }
    }

    public C2097y.c a(boolean z10) {
        this.f14174b.a(this.f14176d, C2097y.a.RESUMED);
        this.f14174b.a(this.f14177e, C2097y.a.PAUSED);
        C2097y.c cVarA = this.f14174b.a();
        if (cVarA == C2097y.c.WATCHING) {
            this.f14173a.reportEvent(z10 ? "session_auto_tracking_listener_registered_auto" : "session_auto_tracking_listener_registered_manual");
        }
        return cVarA;
    }

    public void a(Activity activity, U0 u10) {
        if (activity != null) {
            this.f14179g.a(activity);
        }
        if (this.f14178f.a(activity, C2122z.a.PAUSED)) {
            u10.b(activity);
        }
    }

    public void a(C1944s1 c1944s1) {
        this.f14175c.a(c1944s1);
    }

    public void b(Activity activity, U0 u10) {
        if (activity != null) {
            this.f14179g.a(activity);
        }
        if (this.f14178f.a(activity, C2122z.a.RESUMED)) {
            u10.a(activity);
        }
    }
}
