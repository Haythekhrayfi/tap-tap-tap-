package com.yandex.metrica.identifiers.impl;

import defpackage.a;
import fd.j0;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f13597c;

    public f(String str, String str2, Boolean bool) {
        j0.i(str, "provider");
        this.f13595a = str;
        this.f13596b = str2;
        this.f13597c = bool;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return j0.d(this.f13595a, fVar.f13595a) && j0.d(this.f13596b, fVar.f13596b) && j0.d(this.f13597c, fVar.f13597c);
    }

    public int hashCode() {
        String str = this.f13595a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f13596b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.f13597c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbA = a.a("AdsIdInfo(provider=");
        sbA.append(this.f13595a);
        sbA.append(", advId=");
        sbA.append(this.f13596b);
        sbA.append(", limitedAdTracking=");
        sbA.append(this.f13597c);
        sbA.append(")");
        return sbA.toString();
    }
}
