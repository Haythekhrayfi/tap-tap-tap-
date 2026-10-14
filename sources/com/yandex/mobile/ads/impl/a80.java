package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public final class a80<V extends ViewGroup> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private yo<V> f18810a;

    public final void a(ViewGroup viewGroup) {
        viewGroup.removeAllViews();
        yo<V> yoVar = this.f18810a;
        if (yoVar != null) {
            yoVar.c();
        }
    }

    public final void a(ViewGroup viewGroup, V v10, z70<V> z70Var) {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        viewGroup.removeAllViews();
        viewGroup.addView(v10, layoutParams);
        yo<V> yoVarA = z70Var.a();
        this.f18810a = yoVarA;
        yoVarA.a(v10);
    }
}
