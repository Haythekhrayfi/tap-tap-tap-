package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.TextureView;

/* JADX INFO: loaded from: classes3.dex */
public final class hm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f21468a = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ff1 f21469b = new ff1();

    public final em0 a(Context context, bf1 bf1Var, int i10) {
        TextureView textureView = new TextureView(context);
        textureView.setVisibility(8);
        dl0 dl0VarA = this.f21468a.a(context, bf1Var, i10);
        dl0VarA.setVisibility(8);
        ef1 ef1VarA = this.f21469b.a(context);
        ef1VarA.setVisibility(8);
        em0 em0Var = new em0(context, ef1VarA, textureView, dl0VarA);
        em0Var.addView(ef1VarA);
        em0Var.addView(textureView);
        em0Var.addView(dl0VarA);
        return em0Var;
    }
}
