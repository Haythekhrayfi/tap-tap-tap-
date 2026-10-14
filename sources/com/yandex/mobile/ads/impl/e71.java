package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class e71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f20102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f20103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f20104e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final yv f20105f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f20106g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long[] f20107h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long[] f20108i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f20109j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final f71[] f20110k;

    public e71(int i10, int i11, long j10, long j11, long j12, yv yvVar, int i12, f71[] f71VarArr, int i13, long[] jArr, long[] jArr2) {
        this.f20100a = i10;
        this.f20101b = i11;
        this.f20102c = j10;
        this.f20103d = j11;
        this.f20104e = j12;
        this.f20105f = yvVar;
        this.f20106g = i12;
        this.f20110k = f71VarArr;
        this.f20109j = i13;
        this.f20107h = jArr;
        this.f20108i = jArr2;
    }

    public final f71 a(int i10) {
        f71[] f71VarArr = this.f20110k;
        if (f71VarArr == null) {
            return null;
        }
        return f71VarArr[i10];
    }
}
