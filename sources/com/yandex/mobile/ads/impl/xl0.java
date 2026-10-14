package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class xl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bf1 f26540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kg1 f26541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final gl0 f26542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ts0 f26543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final fm0 f26544e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final xv0 f26545f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final uq0 f26546g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final uq0 f26547h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final a f26548i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ul0 f26549j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private uq0 f26550k;

    public class a implements hd1 {
        private a() {
        }

        public /* synthetic */ a(xl0 xl0Var, int i10) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.hd1
        public final void a() {
            xl0.this.f26549j.a();
        }

        @Override // com.yandex.mobile.ads.impl.hd1
        public final void b() {
            xl0.this.f26550k = null;
            xl0.this.f26545f.a();
            xl0.this.f26549j.b();
        }

        @Override // com.yandex.mobile.ads.impl.hd1
        public final void c() {
            em0 em0VarB = xl0.this.f26541b.b();
            if (em0VarB != null) {
                em0VarB.setClickable(true);
            }
        }
    }

    public class b implements dw0 {
        private b() {
        }

        public /* synthetic */ b(xl0 xl0Var, int i10) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.dw0
        public final void a() {
            xl0 xl0Var = xl0.this;
            xl0.a(xl0Var, xl0Var.f26546g);
        }
    }

    public xl0(Context context, ft ftVar, sc1 sc1Var, bf1 bf1Var, kg1 kg1Var, jd1 jd1Var, eg1 eg1Var, ze1 ze1Var, ul0 ul0Var) {
        this.f26540a = bf1Var;
        this.f26541b = kg1Var;
        this.f26549j = ul0Var;
        im0 im0Var = new im0(kg1Var);
        this.f26542c = new gl0(ftVar);
        this.f26544e = new fm0(ftVar);
        ud1 ud1Var = new ud1();
        new kl0(kg1Var, ftVar, im0Var, ul0Var).a(ud1Var);
        tl0 tl0Var = new tl0(context, ftVar, sc1Var, im0Var, jd1Var, eg1Var, ud1Var, ze1Var);
        ew0 ew0Var = new ew0(ftVar, sc1Var, ud1Var);
        gm0 gm0Var = new gm0(ftVar, bf1Var);
        ts0 ts0Var = new ts0();
        this.f26543d = ts0Var;
        this.f26547h = new uq0(kg1Var, tl0Var, gm0Var, ts0Var);
        this.f26546g = new uq0(kg1Var, ew0Var, gm0Var, ts0Var);
        int i10 = 0;
        this.f26548i = new a(this, i10);
        this.f26545f = new xv0(kg1Var, new b(this, i10));
    }

    public static void a(xl0 xl0Var, uq0 uq0Var) {
        xl0Var.f26550k = uq0Var;
        uq0Var.a(xl0Var.f26548i);
        xl0Var.f26550k.a();
    }

    public final void a() {
        em0 em0VarB = this.f26541b.b();
        if (em0VarB != null) {
            em0VarB.setClickable(false);
        }
    }

    public final void a(em0 em0Var) {
        this.f26542c.a(this.f26540a);
        this.f26544e.a(em0Var);
        ef1 ef1VarB = em0Var.b();
        Objects.requireNonNull(this.f26543d);
        ef1VarB.a().setVisibility(0);
        uq0 uq0Var = this.f26547h;
        this.f26550k = uq0Var;
        uq0Var.a(this.f26548i);
        this.f26550k.a();
    }

    public final void b(em0 em0Var) {
        uq0 uq0Var = this.f26550k;
        if (uq0Var != null) {
            uq0Var.a(em0Var);
        }
        this.f26544e.b(em0Var);
    }
}
