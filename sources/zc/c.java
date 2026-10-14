package zc;

import fd.j0;
import java.io.Serializable;
import vc.g;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f45275c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f45276d = pc.b.f34635a.b();

    public static final class a extends c implements Serializable {
        public a() {
        }

        public a(g gVar) {
        }

        @Override // zc.c
        public int a(int i10) {
            return c.f45276d.a(i10);
        }

        @Override // zc.c
        public int b() {
            return c.f45276d.b();
        }

        @Override // zc.c
        public int c(int i10) {
            return c.f45276d.c(i10);
        }

        @Override // zc.c
        public int d(int i10, int i11) {
            return c.f45276d.d(i10, i11);
        }
    }

    public abstract int a(int i10);

    public int b() {
        return a(32);
    }

    public int c(int i10) {
        return d(0, i10);
    }

    public int d(int i10, int i11) {
        int iB;
        int i12;
        int iA;
        int iB2;
        if (!(i11 > i10)) {
            Integer numValueOf = Integer.valueOf(i10);
            Integer numValueOf2 = Integer.valueOf(i11);
            j0.i(numValueOf, "from");
            j0.i(numValueOf2, "until");
            throw new IllegalArgumentException(("Random range is empty: [" + numValueOf + ", " + numValueOf2 + ").").toString());
        }
        int i13 = i11 - i10;
        if (i13 <= 0 && i13 != Integer.MIN_VALUE) {
            do {
                iB2 = b();
            } while (!(i10 <= iB2 && iB2 < i11));
            return iB2;
        }
        if (((-i13) & i13) == i13) {
            iA = a(31 - Integer.numberOfLeadingZeros(i13));
        } else {
            do {
                iB = b() >>> 1;
                i12 = iB % i13;
            } while ((i13 - 1) + (iB - i12) < 0);
            iA = i12;
        }
        return i10 + iA;
    }
}
