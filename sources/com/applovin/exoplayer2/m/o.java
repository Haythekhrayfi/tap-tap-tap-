package com.applovin.exoplayer2.m;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class o implements com.applovin.exoplayer2.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f7878a = new o(0, 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final com.applovin.exoplayer2.g.a<o> f7879f = com.applovin.exoplayer2.a.p.A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f7883e;

    public o(int i10, int i11) {
        this(i10, i11, 0, 1.0f);
    }

    public o(int i10, int i11, int i12, float f10) {
        this.f7880b = i10;
        this.f7881c = i11;
        this.f7882d = i12;
        this.f7883e = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ o a(Bundle bundle) {
        return new o(bundle.getInt(a(0), 0), bundle.getInt(a(1), 0), bundle.getInt(a(2), 0), bundle.getFloat(a(3), 1.0f));
    }

    private static String a(int i10) {
        return Integer.toString(i10, 36);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f7880b == oVar.f7880b && this.f7881c == oVar.f7881c && this.f7882d == oVar.f7882d && this.f7883e == oVar.f7883e;
    }

    public int hashCode() {
        return Float.floatToRawIntBits(this.f7883e) + ((((((217 + this.f7880b) * 31) + this.f7881c) * 31) + this.f7882d) * 31);
    }
}
