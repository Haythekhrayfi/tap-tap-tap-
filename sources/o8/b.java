package o8;

import android.util.DisplayMetrics;
import fd.j0;
import y9.c7;
import y9.n6;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34040a;

        static {
            int[] iArr = new int[n6.values().length];
            iArr[n6.DP.ordinal()] = 1;
            iArr[n6.SP.ordinal()] = 2;
            iArr[n6.PX.ordinal()] = 3;
            f34040a = iArr;
        }
    }

    public static final int a(c7 c7Var, v9.d dVar, DisplayMetrics displayMetrics) {
        v9.b<Long> bVar;
        Long lB;
        v9.b<n6> bVar2;
        j0.i(dVar, "expressionResolver");
        j0.i(displayMetrics, "metrics");
        n6 n6VarB = null;
        if (c7Var != null && (bVar2 = c7Var.f39544b) != null) {
            n6VarB = bVar2.b(dVar);
        }
        int i10 = n6VarB == null ? -1 : a.f34040a[n6VarB.ordinal()];
        if (i10 == 1) {
            return l8.b.u(c7Var.f39545c.b(dVar), displayMetrics);
        }
        if (i10 == 2) {
            return l8.b.Q(c7Var.f39545c.b(dVar), displayMetrics);
        }
        int i11 = Integer.MAX_VALUE;
        if (i10 == 3) {
            long jLongValue = c7Var.f39545c.b(dVar).longValue();
            long j10 = jLongValue >> 31;
            if (j10 == 0 || j10 == -1) {
                return (int) jLongValue;
            }
            int i12 = e9.a.f29114a;
            if (jLongValue <= 0) {
                return Integer.MIN_VALUE;
            }
        } else {
            if (c7Var == null || (bVar = c7Var.f39545c) == null || (lB = bVar.b(dVar)) == null) {
                return 0;
            }
            long jLongValue2 = lB.longValue();
            long j11 = jLongValue2 >> 31;
            if (j11 == 0 || j11 == -1) {
                return (int) jLongValue2;
            }
            int i13 = e9.a.f29114a;
            if (jLongValue2 <= 0) {
                i11 = Integer.MIN_VALUE;
            }
        }
        return i11;
    }
}
