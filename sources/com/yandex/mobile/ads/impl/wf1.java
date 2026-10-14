package com.yandex.mobile.ads.impl;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class wf1 implements wf {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f26268e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f26272d;

    static {
        dp1 dp1Var = dp1.F;
    }

    public wf1(int i10, int i11, int i12, float f10) {
        this.f26269a = i10;
        this.f26270b = i11;
        this.f26271c = i12;
        this.f26272d = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static wf1 a(Bundle bundle) {
        return new wf1(bundle.getInt(Integer.toString(0, 36), 0), bundle.getInt(Integer.toString(1, 36), 0), bundle.getInt(Integer.toString(2, 36), 0), bundle.getFloat(Integer.toString(3, 36), 1.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wf1)) {
            return false;
        }
        wf1 wf1Var = (wf1) obj;
        return this.f26269a == wf1Var.f26269a && this.f26270b == wf1Var.f26270b && this.f26271c == wf1Var.f26271c && this.f26272d == wf1Var.f26272d;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f26272d) + ((((((this.f26269a + 217) * 31) + this.f26270b) * 31) + this.f26271c) * 31);
    }
}
