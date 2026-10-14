package jc;

import fd.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements Comparable<o> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f31826d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31827c;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }
    }

    static {
        new a(null);
    }

    @Override // java.lang.Comparable
    public int compareTo(o oVar) {
        return j0.k(this.f31827c ^ Integer.MIN_VALUE, oVar.f31827c ^ Integer.MIN_VALUE);
    }

    public boolean equals(Object obj) {
        return (obj instanceof o) && this.f31827c == ((o) obj).f31827c;
    }

    public int hashCode() {
        return this.f31827c;
    }

    public String toString() {
        return String.valueOf(((long) this.f31827c) & 4294967295L);
    }
}
