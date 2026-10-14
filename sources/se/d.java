package se;

import java.io.Serializable;
import ne.r;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements Comparable<d>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne.g f35522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f35523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r f35524e;

    public d(long j10, r rVar, r rVar2) {
        this.f35522c = ne.g.v(j10, 0, rVar);
        this.f35523d = rVar;
        this.f35524e = rVar2;
    }

    public d(ne.g gVar, r rVar, r rVar2) {
        this.f35522c = gVar;
        this.f35523d = rVar;
        this.f35524e = rVar2;
    }

    private Object writeReplace() {
        return new a((byte) 2, this);
    }

    public ne.g a() {
        return this.f35522c.z(this.f35524e.f33835d - this.f35523d.f33835d);
    }

    public boolean b() {
        return this.f35524e.f33835d > this.f35523d.f33835d;
    }

    @Override // java.lang.Comparable
    public int compareTo(d dVar) {
        d dVar2 = dVar;
        return this.f35522c.l(this.f35523d).compareTo(dVar2.f35522c.l(dVar2.f35523d));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f35522c.equals(dVar.f35522c) && this.f35523d.equals(dVar.f35523d) && this.f35524e.equals(dVar.f35524e);
    }

    public int hashCode() {
        return (this.f35522c.hashCode() ^ this.f35523d.f33835d) ^ Integer.rotateLeft(this.f35524e.f33835d, 16);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("Transition[");
        sbA.append(b() ? "Gap" : "Overlap");
        sbA.append(" at ");
        sbA.append(this.f35522c);
        sbA.append(this.f35523d);
        sbA.append(" to ");
        sbA.append(this.f35524e);
        sbA.append(']');
        return sbA.toString();
    }
}
