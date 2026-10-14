package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.dd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1583dd {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile C1583dd f15926n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f15927o = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Object f15928p = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f15929q = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Uc f15932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Qi f15933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C2006ud f15934e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f15935f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Runnable f15936g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C2135zc f15937h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final B8 f15938i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final A8 f15939j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C1783le f15940k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f15931b = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f15941l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Object f15942m = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakHashMap<Object, Object> f15930a = new WeakHashMap<>();

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.dd$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Qi f15943a;

        public a(Qi qi) {
            this.f15943a = qi;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1583dd.this.f15934e != null) {
                C1583dd.this.f15934e.a(this.f15943a);
            }
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.dd$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Uc f15945a;

        public b(Uc uc2) {
            this.f15945a = uc2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1583dd.this.f15934e != null) {
                C1583dd.this.f15934e.a(this.f15945a);
            }
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.dd$c */
    public static class c {
    }

    public C1583dd(Context context, C1608ed c1608ed, c cVar, Qi qi) {
        this.f15937h = new C2135zc(context, c1608ed.a(), c1608ed.d());
        this.f15938i = c1608ed.c();
        this.f15939j = c1608ed.b();
        this.f15940k = c1608ed.e();
        this.f15935f = cVar;
        this.f15933d = qi;
    }

    public static C1583dd a(Context context) {
        if (f15926n == null) {
            synchronized (f15928p) {
                if (f15926n == null) {
                    Context applicationContext = context.getApplicationContext();
                    f15926n = new C1583dd(applicationContext, new C1608ed(applicationContext), new c(), new Qi.b(applicationContext).a());
                }
            }
        }
        return f15926n;
    }

    private void b() {
        boolean z10;
        if (this.f15941l) {
            if (this.f15931b && !this.f15930a.isEmpty()) {
                return;
            }
            this.f15937h.f18016b.execute(new RunnableC1508ad(this));
            Runnable runnable = this.f15936g;
            if (runnable != null) {
                this.f15937h.f18016b.a(runnable);
            }
            z10 = false;
        } else {
            if (!this.f15931b || this.f15930a.isEmpty()) {
                return;
            }
            if (this.f15934e == null) {
                c cVar = this.f15935f;
                C2031vd c2031vd = new C2031vd(this.f15937h, this.f15938i, this.f15939j, this.f15933d, this.f15932c);
                Objects.requireNonNull(cVar);
                this.f15934e = new C2006ud(c2031vd);
            }
            this.f15937h.f18016b.execute(new RunnableC1533bd(this));
            if (this.f15936g == null) {
                RunnableC1558cd runnableC1558cd = new RunnableC1558cd(this);
                this.f15936g = runnableC1558cd;
                this.f15937h.f18016b.a(runnableC1558cd, f15927o);
            }
            this.f15937h.f18016b.execute(new Zc(this));
            z10 = true;
        }
        this.f15941l = z10;
    }

    public static void b(C1583dd c1583dd) {
        c1583dd.f15937h.f18016b.a(c1583dd.f15936g, f15927o);
    }

    public Location a() {
        C2006ud c2006ud = this.f15934e;
        if (c2006ud == null) {
            return null;
        }
        return c2006ud.b();
    }

    public void a(Qi qi, Uc uc2) {
        synchronized (this.f15942m) {
            this.f15933d = qi;
            this.f15940k.a(qi);
            this.f15937h.f18017c.a(this.f15940k.a());
            this.f15937h.f18016b.execute(new a(qi));
            if (!U2.a(this.f15932c, uc2)) {
                a(uc2);
            }
        }
    }

    public void a(Uc uc2) {
        synchronized (this.f15942m) {
            this.f15932c = uc2;
        }
        this.f15937h.f18016b.execute(new b(uc2));
    }

    public void a(Object obj) {
        synchronized (this.f15942m) {
            this.f15930a.put(obj, null);
            b();
        }
    }

    public void a(boolean z10) {
        synchronized (this.f15942m) {
            if (this.f15931b != z10) {
                this.f15931b = z10;
                this.f15940k.a(z10);
                this.f15937h.f18017c.a(this.f15940k.a());
                b();
            }
        }
    }

    public void b(Object obj) {
        synchronized (this.f15942m) {
            this.f15930a.remove(obj);
            b();
        }
    }
}
