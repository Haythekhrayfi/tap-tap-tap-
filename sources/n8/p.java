package n8;

import y9.q2;

/* JADX INFO: loaded from: classes2.dex */
public final class p {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33683a;

        static {
            int[] iArr = new int[q2.values().length];
            iArr[q2.MEDIUM.ordinal()] = 1;
            iArr[q2.REGULAR.ordinal()] = 2;
            iArr[q2.LIGHT.ordinal()] = 3;
            iArr[q2.BOLD.ordinal()] = 4;
            f33683a = iArr;
        }
    }

    public static final y7.b a(q2 q2Var) {
        int i10 = a.f33683a[q2Var.ordinal()];
        if (i10 == 1) {
            return y7.b.MEDIUM;
        }
        if (i10 == 2) {
            return y7.b.REGULAR;
        }
        if (i10 == 3) {
            return y7.b.LIGHT;
        }
        if (i10 == 4) {
            return y7.b.BOLD;
        }
        throw new jc.g();
    }
}
