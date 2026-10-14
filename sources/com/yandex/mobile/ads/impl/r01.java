package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class r01 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r01 f24582c = new r01(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f24584b;

    public r01(long j10, long j11) {
        this.f24583a = j10;
        this.f24584b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r01.class != obj.getClass()) {
            return false;
        }
        r01 r01Var = (r01) obj;
        return this.f24583a == r01Var.f24583a && this.f24584b == r01Var.f24584b;
    }

    public final int hashCode() {
        return (((int) this.f24583a) * 31) + ((int) this.f24584b);
    }

    public final String toString() {
        StringBuilder sbA = v60.a("[timeUs=");
        sbA.append(this.f24583a);
        sbA.append(", position=");
        return android.support.v4.media.session.e.a(sbA, this.f24584b, "]");
    }
}
