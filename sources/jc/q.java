package jc;

import fd.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements Comparable<q> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f31831d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f31832c;

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
    public int compareTo(q qVar) {
        long j10 = qVar.f31832c;
        long j11 = this.f31832c ^ Long.MIN_VALUE;
        long j12 = j10 ^ Long.MIN_VALUE;
        if (j11 < j12) {
            return -1;
        }
        return j11 == j12 ? 0 : 1;
    }

    public boolean equals(Object obj) {
        return (obj instanceof q) && this.f31832c == ((q) obj).f31832c;
    }

    public int hashCode() {
        long j10 = this.f31832c;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public String toString() {
        long j10 = this.f31832c;
        if (j10 >= 0) {
            ed.a.a(10);
            String string = Long.toString(j10, 10);
            j0.h(string, "toString(this, checkRadix(radix))");
            return string;
        }
        long j11 = 10;
        long j12 = ((j10 >>> 1) / j11) << 1;
        long j13 = j10 - (j12 * j11);
        if (j13 >= j11) {
            j13 -= j11;
            j12++;
        }
        StringBuilder sb2 = new StringBuilder();
        ed.a.a(10);
        String string2 = Long.toString(j12, 10);
        j0.h(string2, "toString(this, checkRadix(radix))");
        sb2.append(string2);
        ed.a.a(10);
        String string3 = Long.toString(j13, 10);
        j0.h(string3, "toString(this, checkRadix(radix))");
        sb2.append(string3);
        return sb2.toString();
    }
}
