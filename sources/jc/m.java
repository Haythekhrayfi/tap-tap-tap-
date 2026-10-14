package jc;

import fd.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements Comparable<m> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f31821d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte f31822c;

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
    public /* synthetic */ int compareTo(m mVar) {
        return j0.k(this.f31822c & 255, mVar.f31822c & 255);
    }

    public boolean equals(Object obj) {
        return (obj instanceof m) && this.f31822c == ((m) obj).f31822c;
    }

    public int hashCode() {
        return this.f31822c;
    }

    public String toString() {
        return String.valueOf(this.f31822c & 255);
    }
}
