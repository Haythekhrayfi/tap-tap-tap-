package v;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class i extends f {
    public float P0 = -1.0f;
    public int Q0 = -1;
    public int R0 = -1;
    public boolean S0 = true;
    public d T0 = this.N;
    public int U0 = 0;
    public boolean V0;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36653a;

        static {
            int[] iArr = new int[d.b.values().length];
            f36653a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36653a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36653a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36653a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36653a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f36653a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f36653a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f36653a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f36653a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public i() {
        this.V.clear();
        this.V.add(this.T0);
        int length = this.U.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.U[i10] = this.T0;
        }
    }

    @Override // v.f
    public boolean J() {
        return this.V0;
    }

    @Override // v.f
    public boolean K() {
        return this.V0;
    }

    @Override // v.f
    public void b0(r.d dVar, boolean z10) {
        if (this.Y == null) {
            return;
        }
        int iO = dVar.o(this.T0);
        if (this.U0 == 1) {
            this.f36582d0 = iO;
            this.f36584e0 = 0;
            U(this.Y.q());
            Z(0);
            return;
        }
        this.f36582d0 = 0;
        this.f36584e0 = iO;
        Z(this.Y.z());
        U(0);
    }

    public void c0(int i10) {
        d dVar = this.T0;
        dVar.f36566b = i10;
        dVar.f36567c = true;
        this.V0 = true;
    }

    public void d0(int i10) {
        if (this.U0 == i10) {
            return;
        }
        this.U0 = i10;
        this.V.clear();
        this.T0 = this.U0 == 1 ? this.M : this.N;
        this.V.add(this.T0);
        int length = this.U.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.U[i11] = this.T0;
        }
    }

    @Override // v.f
    public void g(r.d dVar, boolean z10) {
        g gVar = (g) this.Y;
        if (gVar == null) {
            return;
        }
        Object objN = gVar.n(d.b.LEFT);
        Object objN2 = gVar.n(d.b.RIGHT);
        f fVar = this.Y;
        boolean z11 = fVar != null && fVar.X[0] == f.b.WRAP_CONTENT;
        if (this.U0 == 0) {
            objN = gVar.n(d.b.TOP);
            objN2 = gVar.n(d.b.BOTTOM);
            f fVar2 = this.Y;
            z11 = fVar2 != null && fVar2.X[1] == f.b.WRAP_CONTENT;
        }
        if (this.V0) {
            d dVar2 = this.T0;
            if (dVar2.f36567c) {
                r.i iVarL = dVar.l(dVar2);
                dVar.e(iVarL, this.T0.d());
                if (this.Q0 != -1) {
                    if (z11) {
                        dVar.f(dVar.l(objN2), iVarL, 0, 5);
                    }
                } else if (this.R0 != -1 && z11) {
                    r.i iVarL2 = dVar.l(objN2);
                    dVar.f(iVarL, dVar.l(objN), 0, 5);
                    dVar.f(iVarL2, iVarL, 0, 5);
                }
                this.V0 = false;
                return;
            }
        }
        if (this.Q0 != -1) {
            r.i iVarL3 = dVar.l(this.T0);
            dVar.d(iVarL3, dVar.l(objN), this.Q0, 8);
            if (z11) {
                dVar.f(dVar.l(objN2), iVarL3, 0, 5);
                return;
            }
            return;
        }
        if (this.R0 != -1) {
            r.i iVarL4 = dVar.l(this.T0);
            r.i iVarL5 = dVar.l(objN2);
            dVar.d(iVarL4, iVarL5, -this.R0, 8);
            if (z11) {
                dVar.f(iVarL4, dVar.l(objN), 0, 5);
                dVar.f(iVarL5, iVarL4, 0, 5);
                return;
            }
            return;
        }
        if (this.P0 != -1.0f) {
            r.i iVarL6 = dVar.l(this.T0);
            r.i iVarL7 = dVar.l(objN2);
            float f10 = this.P0;
            r.b bVarM = dVar.m();
            bVarM.f34958d.h(iVarL6, -1.0f);
            bVarM.f34958d.h(iVarL7, f10);
            dVar.c(bVarM);
        }
    }

    @Override // v.f
    public boolean h() {
        return true;
    }

    @Override // v.f
    public void k(f fVar, HashMap<f, f> map) {
        super.k(fVar, map);
        i iVar = (i) fVar;
        this.P0 = iVar.P0;
        this.Q0 = iVar.Q0;
        this.R0 = iVar.R0;
        this.S0 = iVar.S0;
        d0(iVar.U0);
    }

    @Override // v.f
    public d n(d.b bVar) {
        int i10 = a.f36653a[bVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            if (this.U0 == 1) {
                return this.T0;
            }
            return null;
        }
        if ((i10 == 3 || i10 == 4) && this.U0 == 0) {
            return this.T0;
        }
        return null;
    }
}
