package com.yandex.metrica.identifiers.impl;

import defpackage.a;
import fd.j0;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f13598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f13599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13600c;

    public g(l lVar, f fVar, String str) {
        j0.i(lVar, "status");
        this.f13598a = lVar;
        this.f13599b = fVar;
        this.f13600c = str;
    }

    public /* synthetic */ g(l lVar, f fVar, String str, int i10) {
        this(lVar, (i10 & 2) != 0 ? null : fVar, (i10 & 4) != 0 ? null : str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return j0.d(this.f13598a, gVar.f13598a) && j0.d(this.f13599b, gVar.f13599b) && j0.d(this.f13600c, gVar.f13600c);
    }

    public int hashCode() {
        l lVar = this.f13598a;
        int iHashCode = (lVar != null ? lVar.hashCode() : 0) * 31;
        f fVar = this.f13599b;
        int iHashCode2 = (iHashCode + (fVar != null ? fVar.hashCode() : 0)) * 31;
        String str = this.f13600c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbA = a.a("AdsIdResult(status=");
        sbA.append(this.f13598a);
        sbA.append(", adsIdInfo=");
        sbA.append(this.f13599b);
        sbA.append(", errorExplanation=");
        return androidx.activity.k.a(sbA, this.f13600c, ")");
    }
}
