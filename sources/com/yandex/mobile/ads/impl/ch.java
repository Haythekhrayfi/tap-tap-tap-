package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public final class ch implements u40 {
    @Override // com.yandex.mobile.ads.impl.u40
    public final void a(fc1 fc1Var) {
        fd.j0.i(fc1Var, "uiElements");
        View viewC = fc1Var.c();
        TextView textViewF = fc1Var.f();
        ImageView imageViewG = fc1Var.g();
        if (textViewF != null && textViewF.getVisibility() == 8) {
            if (!(imageViewG != null && imageViewG.getVisibility() == 8) || viewC == null) {
                return;
            }
            viewC.setBackground(null);
        }
    }
}
