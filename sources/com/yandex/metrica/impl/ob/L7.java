package com.yandex.metrica.impl.ob;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class L7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f14387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final K7 f14388b;

    public L7(byte[] bArr, K7 k10) {
        this.f14387a = bArr;
        this.f14388b = k10;
    }

    public final byte[] a() {
        return this.f14387a;
    }

    public final K7 b() {
        return this.f14388b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L7)) {
            return false;
        }
        L7 l10 = (L7) obj;
        return fd.j0.d(this.f14387a, l10.f14387a) && fd.j0.d(this.f14388b, l10.f14388b);
    }

    public int hashCode() {
        byte[] bArr = this.f14387a;
        int iHashCode = (bArr != null ? Arrays.hashCode(bArr) : 0) * 31;
        K7 k10 = this.f14388b;
        return iHashCode + (k10 != null ? k10.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("NativeCrashModel(data=");
        sbA.append(Arrays.toString(this.f14387a));
        sbA.append(", handlerDescription=");
        sbA.append(this.f14388b);
        sbA.append(")");
        return sbA.toString();
    }
}
