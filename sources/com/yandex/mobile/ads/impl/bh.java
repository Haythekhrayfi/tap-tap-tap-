package com.yandex.mobile.ads.impl;

import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public final class bh implements u40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qa<?> f19268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zh f19269b;

    public bh(qa<?> qaVar, zh zhVar) {
        fd.j0.i(zhVar, "clickControlConfigurator");
        this.f19268a = qaVar;
        this.f19269b = zhVar;
    }

    @Override // com.yandex.mobile.ads.impl.u40
    public final void a(fc1 fc1Var) {
        fd.j0.i(fc1Var, "uiElements");
        TextView textViewE = fc1Var.e();
        ImageView imageViewD = fc1Var.d();
        if (textViewE != null) {
            qa<?> qaVar = this.f19268a;
            Object objD = qaVar != null ? qaVar.d() : null;
            if (objD instanceof String) {
                textViewE.setText((CharSequence) objD);
            }
            this.f19269b.a(textViewE);
        }
        if (imageViewD != null) {
            this.f19269b.a(imageViewD);
        }
    }
}
