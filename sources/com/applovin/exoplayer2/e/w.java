package com.applovin.exoplayer2.e;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f6139a = new w(0, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6141c;

    public w(long j10, long j11) {
        this.f6140b = j10;
        this.f6141c = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w.class != obj.getClass()) {
            return false;
        }
        w wVar = (w) obj;
        return this.f6140b == wVar.f6140b && this.f6141c == wVar.f6141c;
    }

    public int hashCode() {
        return (((int) this.f6140b) * 31) + ((int) this.f6141c);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("[timeUs=");
        sbA.append(this.f6140b);
        sbA.append(", position=");
        return android.support.v4.media.session.e.a(sbA, this.f6141c, "]");
    }
}
