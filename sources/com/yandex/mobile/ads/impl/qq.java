package com.yandex.mobile.ads.impl;

import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public final class qq implements u40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qa<?> f24557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ua f24558b;

    public qq(qa<?> qaVar, ua uaVar) {
        fd.j0.i(uaVar, "clickConfigurator");
        this.f24557a = qaVar;
        this.f24558b = uaVar;
    }

    @Override // com.yandex.mobile.ads.impl.u40
    public final void a(fc1 fc1Var) {
        fd.j0.i(fc1Var, "uiElements");
        TextView textViewF = fc1Var.f();
        qa<?> qaVar = this.f24557a;
        Object objD = qaVar != null ? qaVar.d() : null;
        if (textViewF == null || !(objD instanceof String)) {
            return;
        }
        textViewF.setText((CharSequence) objD);
        textViewF.setVisibility(0);
        this.f24558b.a(textViewF, this.f24557a);
    }
}
