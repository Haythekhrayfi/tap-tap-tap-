package com.yandex.mobile.ads.impl;

import android.widget.ImageView;

/* JADX INFO: loaded from: classes3.dex */
public final class gu implements u40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g20 f21216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qa<?> f21217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ua f21218c;

    public gu(g20 g20Var, qa<?> qaVar, ua uaVar) {
        fd.j0.i(g20Var, "imageProvider");
        fd.j0.i(uaVar, "clickConfigurator");
        this.f21216a = g20Var;
        this.f21217b = qaVar;
        this.f21218c = uaVar;
    }

    @Override // com.yandex.mobile.ads.impl.u40
    public final void a(fc1 fc1Var) {
        fd.j0.i(fc1Var, "uiElements");
        ImageView imageViewG = fc1Var.g();
        if (imageViewG != null) {
            qa<?> qaVar = this.f21217b;
            Object objD = qaVar != null ? qaVar.d() : null;
            j20 j20Var = objD instanceof j20 ? (j20) objD : null;
            if (j20Var != null) {
                imageViewG.setImageBitmap(this.f21216a.a(j20Var));
                imageViewG.setVisibility(0);
            }
            this.f21218c.a(imageViewG, this.f21217b);
        }
    }
}
