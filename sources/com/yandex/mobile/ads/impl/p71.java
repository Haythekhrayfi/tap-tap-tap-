package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class p71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rv0[] f23999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final et[] f24000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e81 f24001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f24002e;

    public p71(rv0[] rv0VarArr, et[] etVarArr, e81 e81Var, ia0.a aVar) {
        this.f23999b = rv0VarArr;
        this.f24000c = (et[]) etVarArr.clone();
        this.f24001d = e81Var;
        this.f24002e = aVar;
        this.f23998a = rv0VarArr.length;
    }

    public final boolean a(int i10) {
        return this.f23999b[i10] != null;
    }
}
