package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class wv0 implements ff.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ em0 f26393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yv0 f26394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xv0 f26395c;

    public wv0(xv0 xv0Var, em0 em0Var, yv0 yv0Var) {
        this.f26395c = xv0Var;
        this.f26393a = em0Var;
        this.f26394b = yv0Var;
    }

    @Override // com.yandex.mobile.ads.impl.ff.b
    public final void a(Bitmap bitmap) {
        vv0 vv0Var = this.f26395c.f26642d;
        em0 em0Var = this.f26393a;
        yv0 yv0Var = this.f26394b;
        Objects.requireNonNull(vv0Var);
        vv0.a(em0Var, yv0Var, bitmap);
    }
}
