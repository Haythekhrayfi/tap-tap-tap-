package com.yandex.mobile.ads.impl;

import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public final class b41 implements u40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qa<?> f19113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ua f19114b;

    public b41(qa<?> qaVar, ua uaVar) {
        fd.j0.i(uaVar, "clickConfigurator");
        this.f19113a = qaVar;
        this.f19114b = uaVar;
    }

    @Override // com.yandex.mobile.ads.impl.u40
    public final void a(fc1 fc1Var) {
        fd.j0.i(fc1Var, "uiElements");
        TextView textViewN = fc1Var.n();
        if (textViewN != null) {
            qa<?> qaVar = this.f19113a;
            Object objD = qaVar != null ? qaVar.d() : null;
            if (objD instanceof String) {
                textViewN.setText((CharSequence) objD);
                textViewN.setVisibility(0);
            }
            this.f19114b.a(textViewN, this.f19113a);
        }
    }
}
