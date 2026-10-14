package com.yandex.mobile.ads.impl;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class dp implements wf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19937c;

    static {
        yn1 yn1Var = yn1.f26951k;
    }

    public dp(int i10, int i11, int i12) {
        this.f19935a = i10;
        this.f19936b = i11;
        this.f19937c = i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static dp a(Bundle bundle) {
        return new dp(bundle.getInt(Integer.toString(0, 36), 0), bundle.getInt(Integer.toString(1, 36), 0), bundle.getInt(Integer.toString(2, 36), 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dp)) {
            return false;
        }
        dp dpVar = (dp) obj;
        return this.f19935a == dpVar.f19935a && this.f19936b == dpVar.f19936b && this.f19937c == dpVar.f19937c;
    }

    public final int hashCode() {
        return ((((this.f19935a + 527) * 31) + this.f19936b) * 31) + this.f19937c;
    }
}
