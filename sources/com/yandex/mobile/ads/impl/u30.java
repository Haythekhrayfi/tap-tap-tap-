package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ProgressBar;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes3.dex */
public final class u30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r50 f25545a;

    public u30(r50 r50Var) {
        this.f25545a = r50Var;
    }

    public final a50 a(fc1 fc1Var, a50 a50Var) {
        boolean z10 = this.f25545a.getVolume() == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        View viewL = fc1Var.l();
        Float fValueOf = null;
        Boolean boolValueOf = viewL != null ? Boolean.valueOf(viewL.isEnabled()) : null;
        ProgressBar progressBarJ = fc1Var.j();
        if (progressBarJ != null) {
            int progress = progressBarJ.getProgress();
            int max = progressBarJ.getMax();
            if (max != 0) {
                fValueOf = Float.valueOf(progress / max);
            }
        }
        a50.a aVar = new a50.a();
        aVar.b(z10);
        if (boolValueOf != null) {
            aVar.a(boolValueOf.booleanValue());
        }
        if (fValueOf != null) {
            aVar.b(fValueOf.floatValue());
        }
        aVar.a(a50Var.a());
        return aVar.a();
    }
}
