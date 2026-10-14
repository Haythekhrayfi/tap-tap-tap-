package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1868p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17027b;

    public C1868p(int i10, int i11) {
        this.f17026a = i10;
        this.f17027b = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1868p.class != obj.getClass()) {
            return false;
        }
        C1868p c1868p = (C1868p) obj;
        return this.f17026a == c1868p.f17026a && this.f17027b == c1868p.f17027b;
    }

    public int hashCode() {
        return (this.f17026a * 31) + this.f17027b;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("BillingConfig{sendFrequencySeconds=");
        sbA.append(this.f17026a);
        sbA.append(", firstCollectingInappMaxAgeSeconds=");
        return android.support.v4.media.b.a(sbA, this.f17027b, "}");
    }
}
