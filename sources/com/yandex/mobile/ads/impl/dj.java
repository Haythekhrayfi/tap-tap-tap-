package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.yandex.mobile.ads.base.AdResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class dj<V extends ViewGroup> implements yo<V>, r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdResponse<?> f19861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ci0 f19862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q0 f19863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final oi f19864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final uk f19865e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ri f19866f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final um f19867g;

    public static class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final uk f19868a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final um f19869b;

        public a(uk ukVar, um umVar) {
            this.f19868a = ukVar;
            this.f19869b = umVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f19868a.e();
            this.f19869b.a(tm.f25398b);
        }
    }

    public dj(AdResponse adResponse, q0 q0Var, lh1 lh1Var, uk ukVar, ci0 ci0Var, um umVar) {
        this.f19861a = adResponse;
        this.f19863c = q0Var;
        this.f19864d = lh1Var;
        this.f19865e = ukVar;
        this.f19862b = ci0Var;
        this.f19867g = umVar;
    }

    @Override // com.yandex.mobile.ads.impl.r0
    public final void a() {
        ri riVar = this.f19866f;
        if (riVar != null) {
            riVar.a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.yo
    public final void a(V v10) {
        View viewB = this.f19862b.b(v10);
        ProgressBar progressBarA = this.f19862b.a(v10);
        if (viewB == null) {
            this.f19865e.e();
            return;
        }
        this.f19863c.a(this);
        nz0 nz0VarA = i01.b().a(viewB.getContext());
        boolean z10 = false;
        boolean z11 = nz0VarA != null && nz0VarA.X();
        if ("divkit".equals(this.f19861a.w()) && z11) {
            z10 = true;
        }
        if (!z10) {
            viewB.setOnClickListener(new a(this.f19865e, this.f19867g));
        }
        Long lU = this.f19861a.u();
        long jLongValue = lU != null ? lU.longValue() : 0L;
        ri ws0Var = progressBarA != null ? new ws0(viewB, progressBarA, new qr(), new yi(), this.f19867g, jLongValue) : new rn(viewB, this.f19864d, this.f19867g, jLongValue);
        this.f19866f = ws0Var;
        ws0Var.c();
    }

    @Override // com.yandex.mobile.ads.impl.r0
    public final void b() {
        ri riVar = this.f19866f;
        if (riVar != null) {
            riVar.b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.yo
    public final void c() {
        this.f19863c.b(this);
        ri riVar = this.f19866f;
        if (riVar != null) {
            riVar.invalidate();
        }
    }
}
