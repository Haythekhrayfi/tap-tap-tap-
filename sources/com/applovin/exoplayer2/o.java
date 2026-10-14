package com.applovin.exoplayer2;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class o implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f7911a = new o(0, 0, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g.a<o> f7912e = k0.f7561l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7915d;

    public o(int i10, int i11, int i12) {
        this.f7913b = i10;
        this.f7914c = i11;
        this.f7915d = i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ o a(Bundle bundle) {
        return new o(bundle.getInt(a(0), 0), bundle.getInt(a(1), 0), bundle.getInt(a(2), 0));
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
        return this.f7913b == oVar.f7913b && this.f7914c == oVar.f7914c && this.f7915d == oVar.f7915d;
    }

    public int hashCode() {
        return ((((527 + this.f7913b) * 31) + this.f7914c) * 31) + this.f7915d;
    }
}
