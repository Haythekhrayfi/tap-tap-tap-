package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class nj implements wf {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final wf.a<nj> f23395f = dp1.f19964w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f23399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f23400e;

    public nj(int i10, int i11, int i12, byte[] bArr) {
        this.f23396a = i10;
        this.f23397b = i11;
        this.f23398c = i12;
        this.f23399d = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static nj a(Bundle bundle) {
        return new nj(bundle.getInt(Integer.toString(0, 36), -1), bundle.getInt(Integer.toString(1, 36), -1), bundle.getInt(Integer.toString(2, 36), -1), bundle.getByteArray(Integer.toString(3, 36)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nj.class != obj.getClass()) {
            return false;
        }
        nj njVar = (nj) obj;
        return this.f23396a == njVar.f23396a && this.f23397b == njVar.f23397b && this.f23398c == njVar.f23398c && Arrays.equals(this.f23399d, njVar.f23399d);
    }

    public final int hashCode() {
        if (this.f23400e == 0) {
            this.f23400e = Arrays.hashCode(this.f23399d) + ((((((this.f23396a + 527) * 31) + this.f23397b) * 31) + this.f23398c) * 31);
        }
        return this.f23400e;
    }

    public final String toString() {
        StringBuilder sbA = v60.a("ColorInfo(");
        sbA.append(this.f23396a);
        sbA.append(", ");
        sbA.append(this.f23397b);
        sbA.append(", ");
        sbA.append(this.f23398c);
        sbA.append(", ");
        sbA.append(this.f23399d != null);
        sbA.append(")");
        return sbA.toString();
    }
}
