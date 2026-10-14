package com.applovin.exoplayer2.c;

import com.applovin.exoplayer2.v;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f4761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f4762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4764e;

    public h(String str, v vVar, v vVar2, int i10, int i11) {
        com.applovin.exoplayer2.l.a.a(i10 == 0 || i11 == 0);
        this.f4760a = com.applovin.exoplayer2.l.a.a(str);
        this.f4761b = (v) com.applovin.exoplayer2.l.a.b(vVar);
        this.f4762c = (v) com.applovin.exoplayer2.l.a.b(vVar2);
        this.f4763d = i10;
        this.f4764e = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        return this.f4763d == hVar.f4763d && this.f4764e == hVar.f4764e && this.f4760a.equals(hVar.f4760a) && this.f4761b.equals(hVar.f4761b) && this.f4762c.equals(hVar.f4762c);
    }

    public int hashCode() {
        return this.f4762c.hashCode() + ((this.f4761b.hashCode() + l1.e.a(this.f4760a, (((this.f4763d + 527) * 31) + this.f4764e) * 31, 31)) * 31);
    }
}
