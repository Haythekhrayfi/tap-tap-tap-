package v;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class a extends k {
    public int R0 = 0;
    public boolean S0 = true;
    public int T0 = 0;
    public boolean U0 = false;

    public a() {
    }

    public a(String str) {
        this.f36612s0 = str;
    }

    @Override // v.f
    public boolean J() {
        return this.U0;
    }

    @Override // v.f
    public boolean K() {
        return this.U0;
    }

    public boolean d0() {
        int i10;
        d.b bVar;
        d.b bVar2;
        d.b bVar3;
        int i11;
        int i12;
        int i13 = 0;
        boolean z10 = true;
        while (true) {
            i10 = this.Q0;
            if (i13 >= i10) {
                break;
            }
            f fVar = this.P0[i13];
            if ((this.S0 || fVar.h()) && ((((i11 = this.R0) == 0 || i11 == 1) && !fVar.J()) || (((i12 = this.R0) == 2 || i12 == 3) && !fVar.K()))) {
                z10 = false;
            }
            i13++;
        }
        if (!z10 || i10 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z11 = false;
        for (int i14 = 0; i14 < this.Q0; i14++) {
            f fVar2 = this.P0[i14];
            if (this.S0 || fVar2.h()) {
                if (!z11) {
                    int i15 = this.R0;
                    if (i15 == 0) {
                        bVar3 = d.b.LEFT;
                    } else if (i15 == 1) {
                        bVar3 = d.b.RIGHT;
                    } else if (i15 == 2) {
                        bVar3 = d.b.TOP;
                    } else {
                        if (i15 == 3) {
                            bVar3 = d.b.BOTTOM;
                        }
                        z11 = true;
                    }
                    iMax = fVar2.n(bVar3).d();
                    z11 = true;
                }
                int i16 = this.R0;
                if (i16 == 0) {
                    bVar2 = d.b.LEFT;
                } else {
                    if (i16 == 1) {
                        bVar = d.b.RIGHT;
                    } else if (i16 == 2) {
                        bVar2 = d.b.TOP;
                    } else if (i16 == 3) {
                        bVar = d.b.BOTTOM;
                    }
                    iMax = Math.max(iMax, fVar2.n(bVar).d());
                }
                iMax = Math.min(iMax, fVar2.n(bVar2).d());
            }
        }
        int i17 = iMax + this.T0;
        int i18 = this.R0;
        if (i18 == 0 || i18 == 1) {
            S(i17, i17);
        } else {
            T(i17, i17);
        }
        this.U0 = true;
        return true;
    }

    public int e0() {
        int i10 = this.R0;
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        return (i10 == 2 || i10 == 3) ? 1 : -1;
    }

    @Override // v.f
    public void g(r.d dVar, boolean z10) {
        d[] dVarArr;
        boolean z11;
        r.i iVar;
        d dVar2;
        int i10;
        int i11;
        int i12;
        r.i iVar2;
        int i13;
        d[] dVarArr2 = this.U;
        dVarArr2[0] = this.M;
        dVarArr2[2] = this.N;
        dVarArr2[1] = this.O;
        dVarArr2[3] = this.P;
        int i14 = 0;
        while (true) {
            dVarArr = this.U;
            if (i14 >= dVarArr.length) {
                break;
            }
            dVarArr[i14].f36573i = dVar.l(dVarArr[i14]);
            i14++;
        }
        int i15 = this.R0;
        if (i15 < 0 || i15 >= 4) {
            return;
        }
        d dVar3 = dVarArr[i15];
        if (!this.U0) {
            d0();
        }
        if (this.U0) {
            this.U0 = false;
            int i16 = this.R0;
            if (i16 == 0 || i16 == 1) {
                dVar.e(this.M.f36573i, this.f36582d0);
                iVar2 = this.O.f36573i;
                i13 = this.f36582d0;
            } else {
                if (i16 != 2 && i16 != 3) {
                    return;
                }
                dVar.e(this.N.f36573i, this.f36584e0);
                iVar2 = this.P.f36573i;
                i13 = this.f36584e0;
            }
            dVar.e(iVar2, i13);
            return;
        }
        int i17 = 0;
        while (true) {
            if (i17 >= this.Q0) {
                z11 = false;
                break;
            }
            f fVar = this.P0[i17];
            if ((this.S0 || fVar.h()) && ((((i11 = this.R0) == 0 || i11 == 1) && fVar.r() == f.b.MATCH_CONSTRAINT && fVar.M.f36570f != null && fVar.O.f36570f != null) || (((i12 = this.R0) == 2 || i12 == 3) && fVar.y() == f.b.MATCH_CONSTRAINT && fVar.N.f36570f != null && fVar.P.f36570f != null))) {
                z11 = true;
                break;
            }
            i17++;
        }
        boolean z12 = this.M.g() || this.O.g();
        boolean z13 = this.N.g() || this.P.g();
        int i18 = !z11 && (((i10 = this.R0) == 0 && z12) || ((i10 == 2 && z13) || ((i10 == 1 && z12) || (i10 == 3 && z13)))) ? 5 : 4;
        for (int i19 = 0; i19 < this.Q0; i19++) {
            f fVar2 = this.P0[i19];
            if (this.S0 || fVar2.h()) {
                r.i iVarL = dVar.l(fVar2.U[this.R0]);
                d[] dVarArr3 = fVar2.U;
                int i20 = this.R0;
                dVarArr3[i20].f36573i = iVarL;
                int i21 = (dVarArr3[i20].f36570f == null || dVarArr3[i20].f36570f.f36568d != this) ? 0 : dVarArr3[i20].f36571g + 0;
                if (i20 == 0 || i20 == 2) {
                    r.i iVar3 = dVar3.f36573i;
                    int i22 = this.T0 - i21;
                    r.b bVarM = dVar.m();
                    r.i iVarN = dVar.n();
                    iVarN.f35021g = 0;
                    bVarM.f(iVar3, iVarL, iVarN, i22);
                    dVar.c(bVarM);
                } else {
                    r.i iVar4 = dVar3.f36573i;
                    int i23 = this.T0 + i21;
                    r.b bVarM2 = dVar.m();
                    r.i iVarN2 = dVar.n();
                    iVarN2.f35021g = 0;
                    bVarM2.e(iVar4, iVarL, iVarN2, i23);
                    dVar.c(bVarM2);
                }
                dVar.d(dVar3.f36573i, iVarL, this.T0 + i21, i18);
            }
        }
        int i24 = this.R0;
        if (i24 == 0) {
            dVar.d(this.O.f36573i, this.M.f36573i, 0, 8);
            dVar.d(this.M.f36573i, this.Y.O.f36573i, 0, 4);
            iVar = this.M.f36573i;
            dVar2 = this.Y.M;
        } else if (i24 == 1) {
            dVar.d(this.M.f36573i, this.O.f36573i, 0, 8);
            dVar.d(this.M.f36573i, this.Y.M.f36573i, 0, 4);
            iVar = this.M.f36573i;
            dVar2 = this.Y.O;
        } else if (i24 == 2) {
            dVar.d(this.P.f36573i, this.N.f36573i, 0, 8);
            dVar.d(this.N.f36573i, this.Y.P.f36573i, 0, 4);
            iVar = this.N.f36573i;
            dVar2 = this.Y.N;
        } else {
            if (i24 != 3) {
                return;
            }
            dVar.d(this.N.f36573i, this.P.f36573i, 0, 8);
            dVar.d(this.N.f36573i, this.Y.N.f36573i, 0, 4);
            iVar = this.N.f36573i;
            dVar2 = this.Y.P;
        }
        dVar.d(iVar, dVar2.f36573i, 0, 0);
    }

    @Override // v.f
    public boolean h() {
        return true;
    }

    @Override // v.k, v.f
    public void k(f fVar, HashMap<f, f> map) {
        super.k(fVar, map);
        a aVar = (a) fVar;
        this.R0 = aVar.R0;
        this.S0 = aVar.S0;
        this.T0 = aVar.T0;
    }

    @Override // v.f
    public String toString() {
        String strA = androidx.activity.k.a(defpackage.a.a("[Barrier] "), this.f36612s0, " {");
        for (int i10 = 0; i10 < this.Q0; i10++) {
            f fVar = this.P0[i10];
            if (i10 > 0) {
                strA = i.f.a(strA, ", ");
            }
            StringBuilder sbA = defpackage.a.a(strA);
            sbA.append(fVar.f36612s0);
            strA = sbA.toString();
        }
        return i.f.a(strA, "}");
    }
}
