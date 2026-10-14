package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g61 f27442a = new g61();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z61 f27443b;

    public zx0(z61 z61Var) {
        this.f27443b = z61Var;
    }

    public final void a(View view, long j10, long j11) {
        view.setVisibility(0);
        TextView textViewB = this.f27443b.b(view);
        if (textViewB != null) {
            Objects.requireNonNull(this.f27442a);
            g61.a(textViewB, j10, j11);
        }
    }
}
