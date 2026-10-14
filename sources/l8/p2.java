package l8;

import android.util.DisplayMetrics;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import y9.c7;

/* JADX INFO: loaded from: classes2.dex */
public final class p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f32734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i6 f32735b;

    public p2(v vVar, i6 i6Var) {
        fd.j0.i(vVar, "baseBinder");
        fd.j0.i(i6Var, "pagerIndicatorConnector");
        this.f32734a = vVar;
        this.f32735b = i6Var;
    }

    public static /* synthetic */ n9.d d(p2 p2Var, y9.t5 t5Var, DisplayMetrics displayMetrics, v9.d dVar, v9.b bVar, float f10, int i10) {
        if ((i10 & 8) != 0) {
            f10 = 1.0f;
        }
        return p2Var.c(t5Var, displayMetrics, dVar, bVar, f10);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00c2 A[PHI: r0
  0x00c2: PHI (r0v10 n9.d) = (r0v9 n9.d), (r0v32 n9.d), (r0v35 n9.d), (r0v45 n9.d) binds: [B:6:0x0049, B:10:0x0062, B:14:0x0078, B:17:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    public final void a(o8.k kVar, v9.d dVar, y9.k3 k3Var) {
        n9.d dVarD;
        n9.d aVar;
        n9.d dVarD2;
        n9.d dVarD3;
        n9.a aVar2;
        n9.b c0368b;
        int i10;
        DisplayMetrics displayMetrics = kVar.getResources().getDisplayMetrics();
        y9.t5 t5Var = k3Var.f41067d;
        y9.t5 t5Var2 = k3Var.f41082s;
        y9.t5 t5Var3 = k3Var.f41081r;
        float fDoubleValue = (float) k3Var.f41066c.b(dVar).doubleValue();
        float fDoubleValue2 = (float) k3Var.f41085v.b(dVar).doubleValue();
        if (t5Var2 == null) {
            dVarD = null;
        } else {
            fd.j0.h(displayMetrics, "metrics");
            dVarD = d(this, t5Var2, displayMetrics, dVar, k3Var.f41080q, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 8);
        }
        if (dVarD != null) {
            aVar = dVarD;
        } else {
            if (t5Var == null) {
                dVarD = null;
            } else {
                fd.j0.h(displayMetrics, r6);
                dVarD = c(t5Var, displayMetrics, dVar, k3Var.f41080q, 1 / fDoubleValue);
            }
            if (dVarD != null) {
                aVar = dVarD;
            } else {
                if (t5Var3 == null) {
                    dVarD = null;
                } else {
                    fd.j0.h(displayMetrics, r6);
                    dVarD = c(t5Var3, displayMetrics, dVar, k3Var.f41080q, fDoubleValue2);
                }
                if (dVarD == null) {
                    y9.h6 h6Var = k3Var.A;
                    fd.j0.h(displayMetrics, "metrics");
                    v9.b<Integer> bVar = k3Var.f41080q;
                    if (h6Var instanceof y9.h6.d) {
                        dVarD = c(((y9.h6.d) h6Var).f40293c, displayMetrics, dVar, bVar, 1.0f);
                        aVar = dVarD;
                    } else {
                        if (!(h6Var instanceof y9.h6.a)) {
                            throw new jc.g();
                        }
                        aVar = new n9.d.a(bVar.b(dVar).intValue(), new n9.c.a(b.a0(((y9.h6.a) h6Var).f40291c.f42677b, displayMetrics, dVar) * 1.0f));
                    }
                } else {
                    aVar = dVarD;
                }
            }
        }
        if (t5Var == null) {
            dVarD2 = null;
        } else {
            fd.j0.h(displayMetrics, r6);
            dVarD2 = d(this, t5Var, displayMetrics, dVar, k3Var.f41065b, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 8);
        }
        if (dVarD2 == null) {
            dVarD2 = b(aVar, fDoubleValue, k3Var.f41065b.b(dVar));
        }
        n9.d dVar2 = dVarD2;
        if (t5Var3 == null) {
            dVarD3 = null;
        } else {
            fd.j0.h(displayMetrics, r6);
            dVarD3 = d(this, t5Var3, displayMetrics, dVar, k3Var.f41080q, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 8);
        }
        if (dVarD3 == null) {
            dVarD3 = b(aVar, fDoubleValue2, null);
        }
        n9.d dVar3 = dVarD3;
        y9.k3.a aVarB = k3Var.f41071h.b(dVar);
        fd.j0.i(aVarB, "<this>");
        if (aVarB == y9.k3.a.WORM) {
            aVar2 = n9.a.WORM;
        } else {
            aVar2 = aVarB == y9.k3.a.SLIDER ? n9.a.SLIDER : n9.a.SCALE;
        }
        n9.a aVar3 = aVar2;
        u9.a cVar = k3Var.f41083t;
        if (cVar == null) {
            cVar = new y9.l3.c(new y9.m1(k3Var.B));
        }
        if (cVar instanceof y9.l3.c) {
            y9.l2 l2Var = ((y9.l3.c) cVar).f41222c.f41419a;
            fd.j0.h(displayMetrics, r6);
            c0368b = new n9.b.a(b.Y(l2Var, displayMetrics, dVar));
        } else {
            if (!(cVar instanceof y9.l3.d)) {
                throw new jc.g();
            }
            y9.l3.d dVar4 = (y9.l3.d) cVar;
            y9.l2 l2Var2 = dVar4.f41223c.f39095a;
            fd.j0.h(displayMetrics, r6);
            float fY = b.Y(l2Var2, displayMetrics, dVar);
            long jLongValue = dVar4.f41223c.f39096b.b(dVar).longValue();
            long j10 = jLongValue >> 31;
            if (j10 == 0 || j10 == -1) {
                i10 = (int) jLongValue;
            } else {
                int i11 = e9.a.f29114a;
                i10 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            c0368b = new n9.b.C0368b(fY, i10);
        }
        kVar.setStyle(new n9.e(aVar3, dVar2, aVar, dVar3, c0368b));
    }

    public final n9.d b(n9.d dVar, float f10, Integer num) {
        if (!(dVar instanceof n9.d.b)) {
            if (dVar instanceof n9.d.a) {
                return new n9.d.a(num == null ? dVar.a() : num.intValue(), new n9.c.a(((n9.d.a) dVar).f33720b.f33715a * f10));
            }
            throw new jc.g();
        }
        int iA = num == null ? dVar.a() : num.intValue();
        n9.d.b bVar = (n9.d.b) dVar;
        n9.c.b bVar2 = bVar.f33722b;
        return b.t(iA, bVar2.f33716a, bVar2.f33717b, bVar2.f33718c, f10, Float.valueOf(bVar.f33723c), Integer.valueOf(bVar.f33724d));
    }

    public final n9.d c(y9.t5 t5Var, DisplayMetrics displayMetrics, v9.d dVar, v9.b<Integer> bVar, float f10) {
        v9.b<y9.n6> bVar2;
        v9.b<Long> bVar3;
        Long lB;
        v9.b<Integer> bVar4;
        c7 c7Var = t5Var.f42761e;
        Integer numB = null;
        y9.n6 n6VarB = (c7Var == null || (bVar2 = c7Var.f39544b) == null) ? null : bVar2.b(dVar);
        if (n6VarB == null) {
            n6VarB = y9.n6.DP;
        }
        c7 c7Var2 = t5Var.f42761e;
        Integer numValueOf = (c7Var2 == null || (bVar3 = c7Var2.f39545c) == null || (lB = bVar3.b(dVar)) == null) ? null : Integer.valueOf(b.c0(lB, displayMetrics, n6VarB));
        v9.b<Integer> bVar5 = t5Var.f42757a;
        if (bVar5 != null) {
            bVar = bVar5;
        }
        int iIntValue = bVar.b(dVar).intValue();
        float fA0 = b.a0(t5Var.f42760d, displayMetrics, dVar);
        float fA1 = b.a0(t5Var.f42759c, displayMetrics, dVar);
        float fA2 = b.a0(t5Var.f42758b, displayMetrics, dVar);
        Float fValueOf = numValueOf == null ? null : Float.valueOf(numValueOf.intValue());
        c7 c7Var3 = t5Var.f42761e;
        if (c7Var3 != null && (bVar4 = c7Var3.f39543a) != null) {
            numB = bVar4.b(dVar);
        }
        return b.t(iIntValue, fA0, fA1, fA2, f10, fValueOf, numB);
    }
}
