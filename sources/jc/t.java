package jc;

import fd.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements Comparable<t> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f31837d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final short f31838c;

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
    public /* synthetic */ int compareTo(t tVar) {
        return j0.k(this.f31838c & 65535, tVar.f31838c & 65535);
    }

    public boolean equals(Object obj) {
        return (obj instanceof t) && this.f31838c == ((t) obj).f31838c;
    }

    public int hashCode() {
        return this.f31838c;
    }

    public String toString() {
        return String.valueOf(this.f31838c & 65535);
    }
}
