package i8;

import java.util.Iterator;
import y9.a3;
import y9.l6;

/* JADX INFO: loaded from: classes2.dex */
public class g0 extends f9.a<Boolean> {
    @Override // f9.a
    public Boolean a(y9.k kVar, v9.d dVar) {
        return Boolean.TRUE;
    }

    @Override // f9.a
    public Boolean f(y9.k.g gVar, v9.d dVar) {
        int i10;
        int i11;
        long j10;
        Long lB;
        Long lB2;
        long jLongValue = gVar.f40980c.f39034j.b(dVar).longValue();
        long j11 = jLongValue >> 31;
        if (j11 == 0 || j11 == -1) {
            i10 = (int) jLongValue;
        } else {
            int i12 = e9.a.f29114a;
            i10 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        int[] iArr = new int[i10];
        Iterator<T> it = gVar.f40980c.f39044t.iterator();
        boolean z10 = false;
        int i13 = 0;
        int i14 = 0;
        loop0: while (true) {
            int i15 = 1;
            if (!it.hasNext()) {
                a3 a3Var = gVar.f40980c;
                if (!(a3Var.I instanceof l6.e) || i13 != a3Var.f39044t.size()) {
                    a3 a3Var2 = gVar.f40980c;
                    if ((a3Var2.f39042r instanceof l6.e) && i14 == a3Var2.f39044t.size()) {
                        break;
                    }
                    int i16 = 0;
                    while (i16 < i10) {
                        int i17 = iArr[i16];
                        i16++;
                        if (!(i17 == kc.j.p(iArr))) {
                            return Boolean.valueOf(z10);
                        }
                    }
                    z10 = true;
                    return Boolean.valueOf(z10);
                }
                break;
            }
            y9.k kVar = (y9.k) it.next();
            Integer numY = kc.j.y(iArr);
            int iIntValue = numY == null ? 0 : numY.intValue();
            int iU = kc.j.u(iArr, iIntValue);
            for (int i18 = 0; i18 < i10; i18++) {
                iArr[i18] = Math.max(0, iArr[i18] - iIntValue);
            }
            y9.g0 g0VarA = kVar.a();
            v9.b<Long> bVarE = g0VarA.e();
            if (bVarE == null || (lB2 = bVarE.b(dVar)) == null) {
                i11 = 1;
            } else {
                long jLongValue2 = lB2.longValue();
                long j12 = jLongValue2 >> 31;
                if (j12 == 0 || j12 == -1) {
                    i11 = (int) jLongValue2;
                } else {
                    int i19 = e9.a.f29114a;
                    i11 = jLongValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
            }
            v9.b<Long> bVarG = g0VarA.g();
            if (bVarG == null || (lB = bVarG.b(dVar)) == null) {
                j10 = -1;
            } else {
                long jLongValue3 = lB.longValue();
                long j13 = jLongValue3 >> 31;
                if (j13 != 0) {
                    j10 = -1;
                    if (j13 != -1) {
                        int i20 = e9.a.f29114a;
                        i15 = jLongValue3 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                    }
                } else {
                    j10 = -1;
                }
                i15 = (int) jLongValue3;
            }
            int i21 = iU + i11;
            if (i21 > i10) {
                break;
            }
            while (true) {
                int i22 = iU;
                if (i22 < i21) {
                    iU = i22 + 1;
                    if (iArr[i22] > 0) {
                        break loop0;
                    }
                    iArr[i22] = i15;
                }
            }
            if (g0VarA.getWidth() instanceof l6.d) {
                i13++;
            }
            if (g0VarA.getHeight() instanceof l6.d) {
                i14++;
            }
        }
        return Boolean.FALSE;
    }
}
