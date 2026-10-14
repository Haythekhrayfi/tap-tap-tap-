package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class yl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kg1 f26872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bf1 f26873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k2 f26874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AdResponse<?> f26875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ze1 f26876e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ul0 f26877f;

    public yl0(kg1 kg1Var, bf1 bf1Var, k2 k2Var, AdResponse adResponse, ze1 ze1Var, pl0 pl0Var) {
        this.f26872a = kg1Var;
        this.f26873b = bf1Var;
        this.f26874c = k2Var;
        this.f26875d = adResponse;
        this.f26876e = ze1Var;
        this.f26877f = pl0Var;
    }

    public final xl0 a(Context context, ft ftVar, sc1 sc1Var, eg1 eg1Var) {
        return new xl0(context, ftVar, sc1Var, this.f26873b, this.f26872a, new jd1(this.f26874c, this.f26875d), eg1Var, this.f26876e, this.f26877f);
    }
}
