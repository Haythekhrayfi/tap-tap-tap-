package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.SizeInfo;
import com.yandex.mobile.ads.base.model.BiddingSettings;
import com.yandex.mobile.ads.common.AdRequest;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ae<T> implements kq0.a, vh, ke.a<AdResponse<T>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f18884b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f18886d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k2 f18888f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w01 f18890h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final kc f18891i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w3 f18892j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final w80 f18893k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h01 f18894l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final r9 f18895m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ue f18896n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f18900r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f18901s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public AdResponse<T> f18902t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private r2 f18903u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f18904v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f18883a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u2 f18885c = new u2(this);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private z3 f18899q = z3.f27198b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final kq0 f18887e = kq0.a();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final e51 f18897o = e51.a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final dx0 f18898p = new dx0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final s6 f18889g = new s6();

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o91 f18905b;

        /* JADX INFO: renamed from: com.yandex.mobile.ads.impl.ae$a$a, reason: collision with other inner class name */
        public class C0201a implements nc {
            public C0201a() {
            }

            @Override // com.yandex.mobile.ads.impl.nc
            public final void a(String str) {
                ae.this.f18892j.a(v3.f25802e);
                ae.this.f18888f.b(str);
                a aVar = a.this;
                ae.this.b(aVar.f18905b);
            }
        }

        public a(o91 o91Var) {
            this.f18905b = o91Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            kc kcVar = ae.this.f18891i;
            ae aeVar = ae.this;
            kcVar.a(aeVar.f18884b, aeVar.f18895m, new C0201a());
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t2 f18908b;

        public b(t2 t2Var) {
            this.f18908b = t2Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ae.this.a(this.f18908b);
        }
    }

    public ae(Context context, l6 l6Var, w3 w3Var) {
        this.f18884b = context;
        this.f18892j = w3Var;
        k2 k2Var = new k2(l6Var);
        this.f18888f = k2Var;
        Executor executorB = a90.a().b();
        this.f18886d = executorB;
        this.f18894l = new h01(context, executorB, w3Var);
        this.f18890h = new w01();
        this.f18891i = lc.a();
        this.f18895m = s9.a();
        this.f18896n = new ue(k2Var);
        this.f18893k = new w80(context, k2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(BiddingSettings biddingSettings, o91 o91Var) {
        this.f18896n.a(this.f18884b, biddingSettings, new com.applovin.exoplayer2.a.e(this, o91Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(o91 o91Var, String str) {
        this.f18892j.a(v3.f25803f);
        this.f18888f.c(str);
        synchronized (this) {
            this.f18886d.execute(new be(this, o91Var));
        }
    }

    public abstract xd<T> a(String str, String str2);

    @Override // com.yandex.mobile.ads.impl.kq0.a
    public void a(Intent intent) {
        StringBuilder sbA = v60.a("action = ");
        sbA.append(intent.getAction());
        x60.d(sbA.toString(), new Object[0]);
    }

    public final void a(com.yandex.mobile.ads.banner.d dVar) {
        this.f18903u = dVar;
    }

    @Override // com.yandex.mobile.ads.impl.gx0.b
    public synchronized void a(AdResponse<T> adResponse) {
        this.f18892j.a(v3.f25807j);
        this.f18902t = adResponse;
    }

    public final void a(SizeInfo sizeInfo) {
        this.f18888f.a(sizeInfo);
    }

    @Override // com.yandex.mobile.ads.impl.gx0.a
    public final void a(bi1 bi1Var) {
        if (bi1Var instanceof p2) {
            b(u2.a(this.f18888f, ((p2) bi1Var).a()));
        }
    }

    public final void a(o91 o91Var) {
        this.f18892j.b(v3.f25802e);
        this.f18886d.execute(new a(o91Var));
    }

    public synchronized void a(t2 t2Var) {
        r2 r2Var = this.f18903u;
        if (r2Var != null) {
            ((com.yandex.mobile.ads.banner.d) r2Var).a(t2Var);
        }
    }

    public final void a(up0 up0Var) {
        AdRequest adRequestA = this.f18888f.a();
        synchronized (this) {
            a(z3.f27199c);
            this.f18883a.post(new yd(this, adRequestA, up0Var));
        }
    }

    public final synchronized void a(z3 z3Var) {
        x60.b("assignLoadingState, state = " + z3Var, new Object[0]);
        this.f18899q = z3Var;
    }

    public final void a(String str) {
        this.f18888f.a(str);
    }

    public final void a(boolean z10) {
        this.f18888f.b(z10);
    }

    @Override // com.yandex.mobile.ads.impl.vh
    public final synchronized boolean a() {
        return this.f18900r;
    }

    public synchronized boolean a(AdRequest adRequest) {
        boolean z10;
        if (this.f18902t != null && this.f18901s > 0 && SystemClock.elapsedRealtime() - this.f18901s <= this.f18902t.i() && (adRequest == null || adRequest.equals(this.f18888f.a()))) {
            synchronized (this) {
                z10 = this.f18899q == z3.f27201e;
            }
        }
        return z10;
    }

    public final void b() {
        this.f18891i.a(this.f18895m);
    }

    public synchronized void b(AdRequest adRequest) {
        z3 z3Var;
        z3 z3Var2;
        x60.b("loadAd", new Object[0]);
        synchronized (this) {
            x60.b("isLoading, state = " + this.f18899q, new Object[0]);
            z3Var = this.f18899q;
            z3Var2 = z3.f27199c;
        }
        if (z3Var != z3Var2) {
            if (a(adRequest)) {
                this.f18892j.a();
                this.f18892j.b(v3.f25800c);
                this.f18897o.b(s70.f24994a, this);
                synchronized (this) {
                    s6 s6Var = this.f18889g;
                    synchronized (this) {
                        a(z3Var2);
                        this.f18883a.post(new yd(this, adRequest, s6Var));
                    }
                }
            } else {
                m();
            }
        }
    }

    public final void b(o91 o91Var) {
        nz0 nz0VarA = i01.b().a(this.f18884b);
        BiddingSettings biddingSettingsF = nz0VarA != null ? nz0VarA.f() : null;
        if (biddingSettingsF != null) {
            this.f18892j.b(v3.f25803f);
            this.f18886d.execute(new ap1(this, biddingSettingsF, o91Var));
        } else {
            synchronized (this) {
                this.f18886d.execute(new be(this, o91Var));
            }
        }
    }

    public void b(t2 t2Var) {
        o60.c(t2Var.b(), new Object[0]);
        a(z3.f27201e);
        this.f18892j.a(new a7(fw0.c.f20902c, this.f18904v));
        this.f18892j.a(v3.f25800c);
        this.f18897o.a(s70.f24994a, this);
        this.f18883a.post(new b(t2Var));
    }

    public final void b(String str) {
        this.f18904v = str;
    }

    public synchronized void c() {
        synchronized (this) {
        }
        if (!this.f18900r) {
            this.f18900r = true;
            s();
            this.f18894l.a();
            b();
            this.f18885c.c();
            this.f18883a.removeCallbacksAndMessages(null);
            this.f18897o.a(s70.f24994a, this);
            this.f18902t = null;
            x60.f("Ad view controller has been cleaned out, controller type: %s", getClass().toString());
        }
    }

    public final synchronized void c(AdRequest adRequest) {
        s6 s6Var = this.f18889g;
        synchronized (this) {
            a(z3.f27199c);
            this.f18883a.post(new yd(this, adRequest, s6Var));
        }
    }

    public final k2 d() {
        return this.f18888f;
    }

    public final w3 e() {
        return this.f18892j;
    }

    public final synchronized AdRequest f() {
        return this.f18888f.a();
    }

    public final z3 g() {
        return this.f18899q;
    }

    public final AdResponse<T> h() {
        return this.f18902t;
    }

    public final Context i() {
        return this.f18884b;
    }

    public final SizeInfo j() {
        return this.f18888f.n();
    }

    public final synchronized boolean k() {
        return this.f18899q == z3.f27197a;
    }

    public final boolean l() {
        return !this.f18887e.b(this.f18884b);
    }

    public void m() {
        n();
    }

    public synchronized void n() {
        x60.d("notifyListenersOnSuccessAdLoaded", new Object[0]);
        r2 r2Var = this.f18903u;
        if (r2Var != null) {
            ((com.yandex.mobile.ads.banner.d) r2Var).d();
        }
    }

    public final void o() {
        this.f18892j.a(new a7(fw0.c.f20901b, this.f18904v));
        this.f18892j.a(v3.f25800c);
        this.f18897o.a(s70.f24994a, this);
        a(z3.f27200d);
        this.f18901s = SystemClock.elapsedRealtime();
    }

    public void p() {
        v2.a(this.f18888f.b().a());
        o();
        n();
    }

    public final void q() {
        StringBuilder sbA = v60.a("registerPhoneStateTracker(), clazz = ");
        sbA.append(getClass());
        x60.d(sbA.toString(), new Object[0]);
        this.f18887e.a(this.f18884b, this);
    }

    public final synchronized void r() {
        a(z3.f27198b);
    }

    public final void s() {
        StringBuilder sbA = v60.a("unregisterPhoneStateTracker(), clazz = ");
        sbA.append(getClass());
        x60.d(sbA.toString(), new Object[0]);
        this.f18887e.b(this.f18884b, this);
    }

    public t2 t() {
        return this.f18893k.b();
    }
}
