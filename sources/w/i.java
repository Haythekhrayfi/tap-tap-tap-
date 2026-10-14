package w;

import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static b.a f37053a = new b.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f37054b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f37055c = 0;

    public static boolean a(v.f fVar) {
        v.f.b bVar;
        v.f.b bVar2;
        v.f.b bVarR = fVar.r();
        v.f.b bVarY = fVar.y();
        v.f fVar2 = fVar.Y;
        v.g gVar = fVar2 != null ? (v.g) fVar2 : null;
        if (gVar != null) {
            gVar.r();
            v.f.b bVar3 = v.f.b.FIXED;
        }
        if (gVar != null) {
            gVar.y();
            v.f.b bVar4 = v.f.b.FIXED;
        }
        v.f.b bVar5 = v.f.b.FIXED;
        boolean z10 = bVarR == bVar5 || fVar.J() || bVarR == v.f.b.WRAP_CONTENT || (bVarR == (bVar2 = v.f.b.MATCH_CONSTRAINT) && fVar.f36611s == 0 && fVar.f36578b0 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && fVar.C(0)) || (bVarR == bVar2 && fVar.f36611s == 1 && fVar.D(0, fVar.z()));
        boolean z11 = bVarY == bVar5 || fVar.K() || bVarY == v.f.b.WRAP_CONTENT || (bVarY == (bVar = v.f.b.MATCH_CONSTRAINT) && fVar.f36613t == 0 && fVar.f36578b0 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && fVar.C(1)) || (bVarY == bVar && fVar.f36613t == 1 && fVar.D(1, fVar.q()));
        if (fVar.f36578b0 <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD || !(z10 || z11)) {
            return z10 && z11;
        }
        return true;
    }

    public static void b(int i10, v.f fVar, b.InterfaceC0443b interfaceC0443b, boolean z10) {
        boolean z11;
        v.d dVar;
        v.d dVar2;
        v.d dVar3;
        v.d dVar4;
        if (fVar.f36601n) {
            return;
        }
        boolean z12 = true;
        f37054b++;
        int i11 = 0;
        if (!(fVar instanceof v.g) && fVar.I() && a(fVar)) {
            v.g.l0(fVar, interfaceC0443b, new b.a(), 0);
        }
        v.d dVarN = fVar.n(v.d.b.LEFT);
        v.d dVarN2 = fVar.n(v.d.b.RIGHT);
        int iD = dVarN.d();
        int iD2 = dVarN2.d();
        HashSet<v.d> hashSet = dVarN.f36565a;
        if (hashSet != null && dVarN.f36567c) {
            Iterator<v.d> it = hashSet.iterator();
            while (it.hasNext()) {
                v.d next = it.next();
                v.f fVar2 = next.f36568d;
                int i12 = i10 + 1;
                boolean zA = a(fVar2);
                if (fVar2.I() && zA) {
                    v.g.l0(fVar2, interfaceC0443b, new b.a(), i11);
                }
                v.d dVar5 = fVar2.M;
                boolean z13 = ((next == dVar5 && (dVar4 = fVar2.O.f36570f) != null && dVar4.f36567c) || (next == fVar2.O && (dVar3 = dVar5.f36570f) != null && dVar3.f36567c)) ? z12 : false;
                v.f.b bVarR = fVar2.r();
                v.f.b bVar = v.f.b.MATCH_CONSTRAINT;
                if (bVarR != bVar || zA) {
                    if (!fVar2.I()) {
                        v.d dVar6 = fVar2.M;
                        if (next == dVar6 && fVar2.O.f36570f == null) {
                            int iE = dVar6.e() + iD;
                            fVar2.S(iE, fVar2.z() + iE);
                        } else {
                            v.d dVar7 = fVar2.O;
                            if (next == dVar7 && dVar6.f36570f == null) {
                                int iE2 = iD - dVar7.e();
                                fVar2.S(iE2 - fVar2.z(), iE2);
                            } else if (z13 && !fVar2.G()) {
                                c(i12, interfaceC0443b, fVar2, z10);
                            }
                        }
                        b(i12, fVar2, interfaceC0443b, z10);
                    }
                } else if (fVar2.r() == bVar && fVar2.f36619w >= 0 && fVar2.f36617v >= 0 && ((fVar2.f36608q0 == 8 || (fVar2.f36611s == 0 && fVar2.f36578b0 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD)) && !fVar2.G() && !fVar2.J && z13 && !fVar2.G())) {
                    d(i12, fVar, interfaceC0443b, fVar2, z10);
                }
                z12 = true;
                i11 = 0;
            }
        }
        if (fVar instanceof v.i) {
            return;
        }
        HashSet<v.d> hashSet2 = dVarN2.f36565a;
        if (hashSet2 != null && dVarN2.f36567c) {
            Iterator<v.d> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                v.d next2 = it2.next();
                v.f fVar3 = next2.f36568d;
                int i13 = i10 + 1;
                boolean zA2 = a(fVar3);
                if (fVar3.I() && zA2) {
                    z11 = false;
                    v.g.l0(fVar3, interfaceC0443b, new b.a(), 0);
                } else {
                    z11 = false;
                }
                v.d dVar8 = fVar3.M;
                boolean z14 = ((next2 == dVar8 && (dVar2 = fVar3.O.f36570f) != null && dVar2.f36567c) || (next2 == fVar3.O && (dVar = dVar8.f36570f) != null && dVar.f36567c)) ? true : z11;
                v.f.b bVarR2 = fVar3.r();
                v.f.b bVar2 = v.f.b.MATCH_CONSTRAINT;
                if (bVarR2 != bVar2 || zA2) {
                    if (!fVar3.I()) {
                        v.d dVar9 = fVar3.M;
                        if (next2 == dVar9 && fVar3.O.f36570f == null) {
                            int iE3 = dVar9.e() + iD2;
                            fVar3.S(iE3, fVar3.z() + iE3);
                        } else {
                            v.d dVar10 = fVar3.O;
                            if (next2 == dVar10 && dVar9.f36570f == null) {
                                int iE4 = iD2 - dVar10.e();
                                fVar3.S(iE4 - fVar3.z(), iE4);
                            } else if (z14 && !fVar3.G()) {
                                c(i13, interfaceC0443b, fVar3, z10);
                            }
                        }
                        b(i13, fVar3, interfaceC0443b, z10);
                    }
                } else if (fVar3.r() == bVar2 && fVar3.f36619w >= 0 && fVar3.f36617v >= 0 && (fVar3.f36608q0 == 8 || (fVar3.f36611s == 0 && fVar3.f36578b0 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD))) {
                    if (!fVar3.G() && !fVar3.J && z14 && !fVar3.G()) {
                        d(i13, fVar, interfaceC0443b, fVar3, z10);
                    }
                }
            }
        }
        fVar.f36601n = true;
    }

    public static void c(int i10, b.InterfaceC0443b interfaceC0443b, v.f fVar, boolean z10) {
        float f10 = fVar.f36600m0;
        int iD = fVar.M.f36570f.d();
        int iD2 = fVar.O.f36570f.d();
        int iE = fVar.M.e() + iD;
        int iE2 = iD2 - fVar.O.e();
        if (iD == iD2) {
            f10 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iZ = fVar.z();
        int i11 = (iD2 - iD) - iZ;
        if (iD > iD2) {
            i11 = (iD - iD2) - iZ;
        }
        int i12 = ((int) (i11 > 0 ? (f10 * i11) + 0.5f : f10 * i11)) + iD;
        int i13 = i12 + iZ;
        if (iD > iD2) {
            i13 = i12 - iZ;
        }
        fVar.S(i12, i13);
        b(i10 + 1, fVar, interfaceC0443b, z10);
    }

    public static void d(int i10, v.f fVar, b.InterfaceC0443b interfaceC0443b, v.f fVar2, boolean z10) {
        float f10 = fVar2.f36600m0;
        int iE = fVar2.M.e() + fVar2.M.f36570f.d();
        int iD = fVar2.O.f36570f.d() - fVar2.O.e();
        if (iD >= iE) {
            int iZ = fVar2.z();
            if (fVar2.f36608q0 != 8) {
                int i11 = fVar2.f36611s;
                if (i11 == 2) {
                    if (!(fVar instanceof v.g)) {
                        fVar = fVar.Y;
                    }
                    iZ = (int) (fVar2.f36600m0 * 0.5f * fVar.z());
                } else if (i11 == 0) {
                    iZ = iD - iE;
                }
                iZ = Math.max(fVar2.f36617v, iZ);
                int i12 = fVar2.f36619w;
                if (i12 > 0) {
                    iZ = Math.min(i12, iZ);
                }
            }
            int i13 = iE + ((int) ((f10 * ((iD - iE) - iZ)) + 0.5f));
            fVar2.S(i13, iZ + i13);
            b(i10 + 1, fVar2, interfaceC0443b, z10);
        }
    }

    public static void e(int i10, b.InterfaceC0443b interfaceC0443b, v.f fVar) {
        float f10 = fVar.f36602n0;
        int iD = fVar.N.f36570f.d();
        int iD2 = fVar.P.f36570f.d();
        int iE = fVar.N.e() + iD;
        int iE2 = iD2 - fVar.P.e();
        if (iD == iD2) {
            f10 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iQ = fVar.q();
        int i11 = (iD2 - iD) - iQ;
        if (iD > iD2) {
            i11 = (iD - iD2) - iQ;
        }
        int i12 = (int) (i11 > 0 ? (f10 * i11) + 0.5f : f10 * i11);
        int i13 = iD + i12;
        int i14 = i13 + iQ;
        if (iD > iD2) {
            i13 = iD - i12;
            i14 = i13 - iQ;
        }
        fVar.T(i13, i14);
        g(i10 + 1, fVar, interfaceC0443b);
    }

    public static void f(int i10, v.f fVar, b.InterfaceC0443b interfaceC0443b, v.f fVar2) {
        float f10 = fVar2.f36602n0;
        int iE = fVar2.N.e() + fVar2.N.f36570f.d();
        int iD = fVar2.P.f36570f.d() - fVar2.P.e();
        if (iD >= iE) {
            int iQ = fVar2.q();
            if (fVar2.f36608q0 != 8) {
                int i11 = fVar2.f36613t;
                if (i11 == 2) {
                    if (!(fVar instanceof v.g)) {
                        fVar = fVar.Y;
                    }
                    iQ = (int) (f10 * 0.5f * fVar.q());
                } else if (i11 == 0) {
                    iQ = iD - iE;
                }
                iQ = Math.max(fVar2.f36623y, iQ);
                int i12 = fVar2.f36625z;
                if (i12 > 0) {
                    iQ = Math.min(i12, iQ);
                }
            }
            int i13 = iE + ((int) ((f10 * ((iD - iE) - iQ)) + 0.5f));
            fVar2.T(i13, iQ + i13);
            g(i10 + 1, fVar2, interfaceC0443b);
        }
    }

    public static void g(int i10, v.f fVar, b.InterfaceC0443b interfaceC0443b) {
        v.d dVar;
        v.d dVar2;
        v.d dVar3;
        v.d dVar4;
        if (fVar.f36603o) {
            return;
        }
        boolean z10 = true;
        f37055c++;
        if (!(fVar instanceof v.g) && fVar.I() && a(fVar)) {
            v.g.l0(fVar, interfaceC0443b, new b.a(), 0);
        }
        v.d dVarN = fVar.n(v.d.b.TOP);
        v.d dVarN2 = fVar.n(v.d.b.BOTTOM);
        int iD = dVarN.d();
        int iD2 = dVarN2.d();
        HashSet<v.d> hashSet = dVarN.f36565a;
        if (hashSet != null && dVarN.f36567c) {
            Iterator<v.d> it = hashSet.iterator();
            while (it.hasNext()) {
                v.d next = it.next();
                v.f fVar2 = next.f36568d;
                int i11 = i10 + 1;
                boolean zA = a(fVar2);
                if (fVar2.I() && zA) {
                    v.g.l0(fVar2, interfaceC0443b, new b.a(), 0);
                }
                v.d dVar5 = fVar2.N;
                boolean z11 = ((next == dVar5 && (dVar4 = fVar2.P.f36570f) != null && dVar4.f36567c) || (next == fVar2.P && (dVar3 = dVar5.f36570f) != null && dVar3.f36567c)) ? z10 : false;
                v.f.b bVarY = fVar2.y();
                v.f.b bVar = v.f.b.MATCH_CONSTRAINT;
                if (bVarY != bVar || zA) {
                    if (!fVar2.I()) {
                        v.d dVar6 = fVar2.N;
                        if (next == dVar6 && fVar2.P.f36570f == null) {
                            int iE = dVar6.e() + iD;
                            fVar2.T(iE, fVar2.q() + iE);
                        } else {
                            v.d dVar7 = fVar2.P;
                            if (next == dVar7 && dVar6.f36570f == null) {
                                int iE2 = iD - dVar7.e();
                                fVar2.T(iE2 - fVar2.q(), iE2);
                            } else if (z11 && !fVar2.H()) {
                                e(i11, interfaceC0443b, fVar2);
                            }
                        }
                        g(i11, fVar2, interfaceC0443b);
                    }
                } else if (fVar2.y() == bVar && fVar2.f36625z >= 0 && fVar2.f36623y >= 0 && ((fVar2.f36608q0 == 8 || (fVar2.f36613t == 0 && fVar2.f36578b0 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD)) && !fVar2.H() && !fVar2.J && z11 && !fVar2.H())) {
                    f(i11, fVar, interfaceC0443b, fVar2);
                }
                z10 = true;
            }
        }
        if (fVar instanceof v.i) {
            return;
        }
        HashSet<v.d> hashSet2 = dVarN2.f36565a;
        if (hashSet2 != null && dVarN2.f36567c) {
            Iterator<v.d> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                v.d next2 = it2.next();
                v.f fVar3 = next2.f36568d;
                int i12 = i10 + 1;
                boolean zA2 = a(fVar3);
                if (fVar3.I() && zA2) {
                    v.g.l0(fVar3, interfaceC0443b, new b.a(), 0);
                }
                v.d dVar8 = fVar3.N;
                boolean z12 = (next2 == dVar8 && (dVar2 = fVar3.P.f36570f) != null && dVar2.f36567c) || (next2 == fVar3.P && (dVar = dVar8.f36570f) != null && dVar.f36567c);
                v.f.b bVarY2 = fVar3.y();
                v.f.b bVar2 = v.f.b.MATCH_CONSTRAINT;
                if (bVarY2 != bVar2 || zA2) {
                    if (!fVar3.I()) {
                        v.d dVar9 = fVar3.N;
                        if (next2 == dVar9 && fVar3.P.f36570f == null) {
                            int iE3 = dVar9.e() + iD2;
                            fVar3.T(iE3, fVar3.q() + iE3);
                        } else {
                            v.d dVar10 = fVar3.P;
                            if (next2 == dVar10 && dVar9.f36570f == null) {
                                int iE4 = iD2 - dVar10.e();
                                fVar3.T(iE4 - fVar3.q(), iE4);
                            } else if (z12 && !fVar3.H()) {
                                e(i12, interfaceC0443b, fVar3);
                            }
                        }
                        g(i12, fVar3, interfaceC0443b);
                    }
                } else if (fVar3.y() == bVar2 && fVar3.f36625z >= 0 && fVar3.f36623y >= 0 && (fVar3.f36608q0 == 8 || (fVar3.f36613t == 0 && fVar3.f36578b0 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD))) {
                    if (!fVar3.H() && !fVar3.J && z12 && !fVar3.H()) {
                        f(i12, fVar, interfaceC0443b, fVar3);
                    }
                }
            }
        }
        v.d dVarN3 = fVar.n(v.d.b.BASELINE);
        if (dVarN3.f36565a != null && dVarN3.f36567c) {
            int iD3 = dVarN3.d();
            for (v.d dVar11 : dVarN3.f36565a) {
                v.f fVar4 = dVar11.f36568d;
                int i13 = i10 + 1;
                boolean zA3 = a(fVar4);
                if (fVar4.I() && zA3) {
                    v.g.l0(fVar4, interfaceC0443b, new b.a(), 0);
                }
                if (fVar4.y() != v.f.b.MATCH_CONSTRAINT || zA3) {
                    if (!fVar4.I() && dVar11 == fVar4.Q) {
                        int iE5 = dVar11.e() + iD3;
                        if (fVar4.H) {
                            int i14 = iE5 - fVar4.f36594j0;
                            int i15 = fVar4.f36576a0 + i14;
                            fVar4.f36584e0 = i14;
                            fVar4.N.m(i14);
                            fVar4.P.m(i15);
                            v.d dVar12 = fVar4.Q;
                            dVar12.f36566b = iE5;
                            dVar12.f36567c = true;
                            fVar4.f36599m = true;
                        }
                        g(i13, fVar4, interfaceC0443b);
                    }
                }
            }
        }
        fVar.f36603o = true;
    }
}
