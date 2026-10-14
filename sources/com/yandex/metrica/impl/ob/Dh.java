package com.yandex.metrica.impl.ob;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class Dh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2140zh f13823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Q9<Eh> f13824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final R2 f13825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceExecutorC1966sn f13826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C2047w.c f13827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C2047w f13828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C2115yh f13829g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f13830h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Di f13831i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f13832j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f13833k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f13834l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f13835m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f13836n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f13837o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f13838p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Object f13839q;

    public Dh(Context context, InterfaceExecutorC1966sn interfaceExecutorC1966sn) {
        this(new C2140zh(context, null, interfaceExecutorC1966sn), Ma.b.a(Eh.class).a(context), new R2(), interfaceExecutorC1966sn, P0.i().a());
    }

    public Dh(C2140zh c2140zh, Q9<Eh> q10, R2 r10, InterfaceExecutorC1966sn interfaceExecutorC1966sn, C2047w c2047w) {
        this.f13838p = false;
        this.f13839q = new Object();
        this.f13823a = c2140zh;
        this.f13824b = q10;
        this.f13829g = new C2115yh(q10, new Bh(this));
        this.f13825c = r10;
        this.f13826d = interfaceExecutorC1966sn;
        this.f13827e = new Ch(this);
        this.f13828f = c2047w;
    }

    public void a() {
        if (this.f13830h) {
            return;
        }
        this.f13830h = true;
        if (this.f13838p) {
            this.f13823a.a(this.f13829g);
        } else {
            this.f13828f.a(this.f13831i.f13842c, this.f13826d, this.f13827e);
        }
    }

    public void a(Qi qi) {
        Eh eh = (Eh) this.f13824b.b();
        this.f13835m = eh.f13910c;
        this.f13836n = eh.f13911d;
        this.f13837o = eh.f13912e;
        b(qi);
    }

    public void b() {
        Eh eh = (Eh) this.f13824b.b();
        this.f13835m = eh.f13910c;
        this.f13836n = eh.f13911d;
        this.f13837o = eh.f13912e;
    }

    public void b(Qi qi) {
        Di di;
        Di di2;
        boolean z10 = true;
        if (qi == null || ((this.f13832j || !qi.f().f17340e) && (di2 = this.f13831i) != null && di2.equals(qi.K()) && this.f13833k == qi.B() && this.f13834l == qi.p() && !this.f13823a.b(qi))) {
            z10 = false;
        }
        synchronized (this.f13839q) {
            if (qi != null) {
                this.f13832j = qi.f().f17340e;
                this.f13831i = qi.K();
                this.f13833k = qi.B();
                this.f13834l = qi.p();
                this.f13823a.a(qi);
            } else {
                this.f13823a.a(qi);
            }
            throw th;
        }
        if (z10) {
            synchronized (this.f13839q) {
                if (this.f13832j && (di = this.f13831i) != null) {
                    if (this.f13836n) {
                        if (this.f13837o) {
                            if (this.f13825c.a(this.f13835m, di.f13843d, "should retry sdk collecting")) {
                                a();
                            }
                        } else if (this.f13825c.a(this.f13835m, di.f13840a, "should collect sdk as usual")) {
                            a();
                        }
                    } else if (this.f13833k - this.f13834l >= di.f13841b) {
                        a();
                    }
                }
            }
        }
    }
}
