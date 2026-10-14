package com.yandex.mobile.ads.impl;

import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public final class yg0 extends RecyclerView.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pg1<ImageView, j20> f26843a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yg0(ImageView imageView, r20 r20Var) {
        super(imageView);
        fd.j0.i(imageView, "imageView");
        fd.j0.i(r20Var, "imageViewAdapter");
        this.f26843a = new pg1<>(r20Var);
    }

    public final void a(j20 j20Var) {
        fd.j0.i(j20Var, "value");
        this.f26843a.b(j20Var);
    }
}
