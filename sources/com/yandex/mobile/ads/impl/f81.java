package com.yandex.mobile.ads.impl;

import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public final class f81 implements u40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g20 f20579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qa<?> f20580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ua f20581c;

    public f81(g20 g20Var, qa<?> qaVar, ua uaVar) {
        fd.j0.i(g20Var, "imageProvider");
        fd.j0.i(uaVar, "assetClickConfigurator");
        this.f20579a = g20Var;
        this.f20580b = qaVar;
        this.f20581c = uaVar;
    }

    @Override // com.yandex.mobile.ads.impl.u40
    public final void a(fc1 fc1Var) {
        fd.j0.i(fc1Var, "uiElements");
        ImageView imageViewP = fc1Var.p();
        TextView textViewO = fc1Var.o();
        if (imageViewP != null) {
            qa<?> qaVar = this.f20580b;
            Object objD = qaVar != null ? qaVar.d() : null;
            j20 j20Var = objD instanceof j20 ? (j20) objD : null;
            if (j20Var != null) {
                imageViewP.setImageBitmap(this.f20579a.a(j20Var));
                imageViewP.setVisibility(0);
                if (textViewO != null) {
                    textViewO.setVisibility(0);
                }
            }
            this.f20581c.a(imageViewP, this.f20580b);
        }
    }
}
