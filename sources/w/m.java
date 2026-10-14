package w;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class m extends q {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int[] f37056k = new int[2];

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37057a;

        static {
            int[] iArr = new int[q.b.values().length];
            f37057a = iArr;
            try {
                iArr[q.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37057a[q.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37057a[q.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public m(v.f fVar) {
        super(fVar);
        this.f37077h.f37044e = g.a.LEFT;
        this.f37078i.f37044e = g.a.RIGHT;
        this.f37075f = 0;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:118:0x02b9  */
    @Override // w.q, w.d
    public void a(d dVar) {
        int iG;
        int i10;
        int iG2;
        int i11;
        if (a.f37057a[this.f37079j.ordinal()] == 3) {
            v.f fVar = this.f37071b;
            l(fVar.M, fVar.O, 0);
            return;
        }
        h hVar = this.f37074e;
        if (!hVar.f37049j && this.f37073d == v.f.b.MATCH_CONSTRAINT) {
            v.f fVar2 = this.f37071b;
            int i12 = fVar2.f36611s;
            if (i12 == 2) {
                v.f fVar3 = fVar2.Y;
                if (fVar3 != null) {
                    h hVar2 = fVar3.f36581d.f37074e;
                    if (hVar2.f37049j) {
                        hVar.c((int) ((hVar2.f37046g * fVar2.f36621x) + 0.5f));
                    }
                }
            } else if (i12 == 3) {
                int i13 = fVar2.f36613t;
                if (i13 == 0 || i13 == 3) {
                    o oVar = fVar2.f36583e;
                    g gVar = oVar.f37077h;
                    g gVar2 = oVar.f37078i;
                    boolean z10 = fVar2.M.f36570f != null;
                    boolean z11 = fVar2.N.f36570f != null;
                    boolean z12 = fVar2.O.f36570f != null;
                    boolean z13 = fVar2.P.f36570f != null;
                    int i14 = fVar2.f36580c0;
                    if (z10 && z11 && z12 && z13) {
                        float f10 = fVar2.f36578b0;
                        if (gVar.f37049j && gVar2.f37049j) {
                            g gVar3 = this.f37077h;
                            if (gVar3.f37042c && this.f37078i.f37042c) {
                                int i15 = gVar3.f37051l.get(0).f37046g + this.f37077h.f37045f;
                                int i16 = this.f37078i.f37051l.get(0).f37046g - this.f37078i.f37045f;
                                int i17 = gVar.f37046g + gVar.f37045f;
                                int i18 = gVar2.f37046g - gVar2.f37045f;
                                int[] iArr = f37056k;
                                m(iArr, i15, i16, i17, i18, f10, i14);
                                this.f37074e.c(iArr[0]);
                                this.f37071b.f36583e.f37074e.c(iArr[1]);
                                return;
                            }
                            return;
                        }
                        g gVar4 = this.f37077h;
                        if (gVar4.f37049j) {
                            g gVar5 = this.f37078i;
                            if (gVar5.f37049j) {
                                if (!gVar.f37042c || !gVar2.f37042c) {
                                    return;
                                }
                                int i19 = gVar4.f37046g + gVar4.f37045f;
                                int i20 = gVar5.f37046g - gVar5.f37045f;
                                int i21 = gVar.f37051l.get(0).f37046g + gVar.f37045f;
                                int i22 = gVar2.f37051l.get(0).f37046g - gVar2.f37045f;
                                int[] iArr2 = f37056k;
                                m(iArr2, i19, i20, i21, i22, f10, i14);
                                this.f37074e.c(iArr2[0]);
                                this.f37071b.f36583e.f37074e.c(iArr2[1]);
                            }
                        }
                        g gVar6 = this.f37077h;
                        if (!gVar6.f37042c || !this.f37078i.f37042c || !gVar.f37042c || !gVar2.f37042c) {
                            return;
                        }
                        int i23 = gVar6.f37051l.get(0).f37046g + this.f37077h.f37045f;
                        int i24 = this.f37078i.f37051l.get(0).f37046g - this.f37078i.f37045f;
                        int i25 = gVar.f37051l.get(0).f37046g + gVar.f37045f;
                        int i26 = gVar2.f37051l.get(0).f37046g - gVar2.f37045f;
                        int[] iArr3 = f37056k;
                        m(iArr3, i23, i24, i25, i26, f10, i14);
                        this.f37074e.c(iArr3[0]);
                        this.f37071b.f36583e.f37074e.c(iArr3[1]);
                    } else if (z10 && z12) {
                        g gVar7 = this.f37077h;
                        if (!gVar7.f37042c || !this.f37078i.f37042c) {
                            return;
                        }
                        float f11 = fVar2.f36578b0;
                        int i27 = gVar7.f37051l.get(0).f37046g + this.f37077h.f37045f;
                        int i28 = this.f37078i.f37051l.get(0).f37046g - this.f37078i.f37045f;
                        if (i14 == -1 || i14 == 0) {
                            int iG3 = g(i28 - i27, 0);
                            int i29 = (int) ((iG3 * f11) + 0.5f);
                            int iG4 = g(i29, 1);
                            if (i29 != iG4) {
                                iG3 = (int) ((iG4 / f11) + 0.5f);
                            }
                            this.f37074e.c(iG3);
                            this.f37071b.f36583e.f37074e.c(iG4);
                        } else if (i14 == 1) {
                            int iG5 = g(i28 - i27, 0);
                            int i30 = (int) ((iG5 / f11) + 0.5f);
                            int iG6 = g(i30, 1);
                            if (i30 != iG6) {
                                iG5 = (int) ((iG6 * f11) + 0.5f);
                            }
                            this.f37074e.c(iG5);
                            this.f37071b.f36583e.f37074e.c(iG6);
                        }
                    } else if (z11 && z13) {
                        if (!gVar.f37042c || !gVar2.f37042c) {
                            return;
                        }
                        float f12 = fVar2.f36578b0;
                        int i31 = gVar.f37051l.get(0).f37046g + gVar.f37045f;
                        int i32 = gVar2.f37051l.get(0).f37046g - gVar2.f37045f;
                        if (i14 == -1) {
                            iG = g(i32 - i31, 1);
                            i10 = (int) ((iG / f12) + 0.5f);
                            iG2 = g(i10, 0);
                            if (i10 != iG2) {
                                iG = (int) ((iG2 * f12) + 0.5f);
                            }
                            this.f37074e.c(iG2);
                            this.f37071b.f36583e.f37074e.c(iG);
                        } else if (i14 == 0) {
                            int iG7 = g(i32 - i31, 1);
                            int i33 = (int) ((iG7 * f12) + 0.5f);
                            int iG8 = g(i33, 0);
                            if (i33 != iG8) {
                                iG7 = (int) ((iG8 / f12) + 0.5f);
                            }
                            this.f37074e.c(iG8);
                            this.f37071b.f36583e.f37074e.c(iG7);
                        } else if (i14 == 1) {
                            iG = g(i32 - i31, 1);
                            i10 = (int) ((iG / f12) + 0.5f);
                            iG2 = g(i10, 0);
                            if (i10 != iG2) {
                                iG = (int) ((iG2 * f12) + 0.5f);
                            }
                            this.f37074e.c(iG2);
                            this.f37071b.f36583e.f37074e.c(iG);
                        }
                    }
                } else {
                    int i34 = fVar2.f36580c0;
                    if (i34 == -1) {
                        i11 = (int) ((fVar2.f36583e.f37074e.f37046g * fVar2.f36578b0) + 0.5f);
                    } else if (i34 != 0) {
                        i11 = i34 != 1 ? 0 : (int) ((fVar2.f36583e.f37074e.f37046g * fVar2.f36578b0) + 0.5f);
                    } else {
                        i11 = (int) ((fVar2.f36583e.f37074e.f37046g / fVar2.f36578b0) + 0.5f);
                    }
                    hVar.c(i11);
                }
            }
        }
        g gVar8 = this.f37077h;
        if (gVar8.f37042c) {
            g gVar9 = this.f37078i;
            if (gVar9.f37042c) {
                if (gVar8.f37049j && gVar9.f37049j && this.f37074e.f37049j) {
                    return;
                }
                if (!this.f37074e.f37049j && this.f37073d == v.f.b.MATCH_CONSTRAINT) {
                    v.f fVar4 = this.f37071b;
                    if (fVar4.f36611s == 0 && !fVar4.G()) {
                        g gVar10 = this.f37077h.f37051l.get(0);
                        g gVar11 = this.f37078i.f37051l.get(0);
                        int i35 = gVar10.f37046g;
                        g gVar12 = this.f37077h;
                        int i36 = i35 + gVar12.f37045f;
                        int i37 = gVar11.f37046g + this.f37078i.f37045f;
                        gVar12.c(i36);
                        this.f37078i.c(i37);
                        this.f37074e.c(i37 - i36);
                        return;
                    }
                }
                if (!this.f37074e.f37049j && this.f37073d == v.f.b.MATCH_CONSTRAINT && this.f37070a == 1 && this.f37077h.f37051l.size() > 0 && this.f37078i.f37051l.size() > 0) {
                    int iMin = Math.min((this.f37078i.f37051l.get(0).f37046g + this.f37078i.f37045f) - (this.f37077h.f37051l.get(0).f37046g + this.f37077h.f37045f), this.f37074e.f37052m);
                    v.f fVar5 = this.f37071b;
                    int i38 = fVar5.f36619w;
                    int iMax = Math.max(fVar5.f36617v, iMin);
                    if (i38 > 0) {
                        iMax = Math.min(i38, iMax);
                    }
                    this.f37074e.c(iMax);
                }
                if (this.f37074e.f37049j) {
                    g gVar13 = this.f37077h.f37051l.get(0);
                    g gVar14 = this.f37078i.f37051l.get(0);
                    int i39 = gVar13.f37046g;
                    g gVar15 = this.f37077h;
                    int i40 = gVar15.f37045f + i39;
                    int i41 = gVar14.f37046g;
                    int i42 = this.f37078i.f37045f + i41;
                    float f13 = this.f37071b.f36600m0;
                    if (gVar13 == gVar14) {
                        f13 = 0.5f;
                    } else {
                        i39 = i40;
                        i41 = i42;
                    }
                    gVar15.c((int) ((((i41 - i39) - this.f37074e.f37046g) * f13) + i39 + 0.5f));
                    this.f37078i.c(this.f37077h.f37046g + this.f37074e.f37046g);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x036b  */
    /* JADX WARN: Code duplicated, block: B:115:0x0373  */
    /* JADX WARN: Code duplicated, block: B:116:0x038c  */
    /* JADX WARN: Code duplicated, block: B:118:0x0392  */
    /* JADX WARN: Code duplicated, block: B:120:0x039a  */
    /* JADX WARN: Code duplicated, block: B:121:0x03be  */
    /* JADX WARN: Code duplicated, block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:71:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:78:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:80:0x020d  */
    /* JADX WARN: Code duplicated, block: B:81:0x025b  */
    /* JADX WARN: Code duplicated, block: B:83:0x0263  */
    /* JADX WARN: Code duplicated, block: B:84:0x027c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0283  */
    /* JADX WARN: Code duplicated, block: B:88:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:91:0x02d6  */
    @Override // w.q
    public void d() {
        v.f fVar;
        v.f fVar2;
        v.d[] dVarArr;
        v.f fVar3;
        g gVarH;
        g gVarH2;
        g gVar;
        v.d dVar;
        v.f fVar4;
        int i10;
        v.f fVar5;
        List<d> list;
        d dVar2;
        g gVar2;
        g gVar3;
        g gVar4;
        int i11;
        v.f fVar6;
        v.f fVar7 = this.f37071b;
        if (fVar7.f36575a) {
            this.f37074e.c(fVar7.z());
        }
        if (this.f37074e.f37049j) {
            v.f.b bVar = this.f37073d;
            v.f.b bVar2 = v.f.b.MATCH_PARENT;
            if (bVar == bVar2 && (fVar = this.f37071b.Y) != null && (fVar.r() == v.f.b.FIXED || fVar.r() == bVar2)) {
                b(this.f37077h, fVar.f36581d.f37077h, this.f37071b.M.e());
                b(this.f37078i, fVar.f36581d.f37078i, -this.f37071b.O.e());
                return;
            }
        } else {
            v.f.b bVarR = this.f37071b.r();
            this.f37073d = bVarR;
            if (bVarR != v.f.b.MATCH_CONSTRAINT) {
                v.f.b bVar3 = v.f.b.MATCH_PARENT;
                if (bVarR == bVar3 && (fVar6 = this.f37071b.Y) != null && (fVar6.r() == v.f.b.FIXED || fVar6.r() == bVar3)) {
                    int iZ = (fVar6.z() - this.f37071b.M.e()) - this.f37071b.O.e();
                    b(this.f37077h, fVar6.f36581d.f37077h, this.f37071b.M.e());
                    b(this.f37078i, fVar6.f36581d.f37078i, -this.f37071b.O.e());
                    this.f37074e.c(iZ);
                    return;
                }
                if (this.f37073d == v.f.b.FIXED) {
                    this.f37074e.c(this.f37071b.z());
                }
            }
        }
        h hVar = this.f37074e;
        if (!hVar.f37049j) {
            if (this.f37073d == v.f.b.MATCH_CONSTRAINT) {
                fVar4 = this.f37071b;
                i10 = fVar4.f36611s;
                if (i10 != 2) {
                    fVar5 = fVar4.Y;
                    if (fVar5 != null) {
                        h hVar2 = fVar5.f36583e.f37074e;
                        hVar.f37051l.add(hVar2);
                        hVar2.f37050k.add(this.f37074e);
                        h hVar3 = this.f37074e;
                        hVar3.f37041b = true;
                        hVar3.f37050k.add(this.f37077h);
                        list = this.f37074e.f37050k;
                        dVar2 = this.f37078i;
                        list.add(dVar2);
                    }
                } else if (i10 == 3) {
                    if (fVar4.f36613t == 3) {
                        this.f37077h.f37040a = this;
                        this.f37078i.f37040a = this;
                        o oVar = fVar4.f36583e;
                        oVar.f37077h.f37040a = this;
                        oVar.f37078i.f37040a = this;
                        hVar.f37040a = this;
                        if (fVar4.H()) {
                            this.f37074e.f37051l.add(this.f37071b.f36583e.f37074e);
                            this.f37071b.f36583e.f37074e.f37050k.add(this.f37074e);
                            o oVar2 = this.f37071b.f36583e;
                            oVar2.f37074e.f37040a = this;
                            this.f37074e.f37051l.add(oVar2.f37077h);
                            this.f37074e.f37051l.add(this.f37071b.f36583e.f37078i);
                            this.f37071b.f36583e.f37077h.f37050k.add(this.f37074e);
                            list = this.f37071b.f36583e.f37078i.f37050k;
                            dVar2 = this.f37074e;
                        } else if (this.f37071b.G()) {
                            this.f37071b.f36583e.f37074e.f37051l.add(this.f37074e);
                            list = this.f37074e.f37050k;
                            dVar2 = this.f37071b.f36583e.f37074e;
                        } else {
                            gVar2 = this.f37071b.f36583e.f37074e;
                        }
                        list.add(dVar2);
                    } else {
                        h hVar4 = fVar4.f36583e.f37074e;
                        hVar.f37051l.add(hVar4);
                        hVar4.f37050k.add(this.f37074e);
                        this.f37071b.f36583e.f37077h.f37050k.add(this.f37074e);
                        this.f37071b.f36583e.f37078i.f37050k.add(this.f37074e);
                        h hVar5 = this.f37074e;
                        hVar5.f37041b = true;
                        hVar5.f37050k.add(this.f37077h);
                        this.f37074e.f37050k.add(this.f37078i);
                        this.f37077h.f37051l.add(this.f37074e);
                        gVar2 = this.f37078i;
                    }
                    list = gVar2.f37051l;
                    dVar2 = this.f37074e;
                    list.add(dVar2);
                }
            }
            fVar2 = this.f37071b;
            dVarArr = fVar2.U;
            if (dVarArr[0].f36570f != null) {
            }
            if (dVarArr[0].f36570f == null) {
                if (dVarArr[1].f36570f == null) {
                    if (fVar2 instanceof v.j) {
                        return;
                    } else {
                        return;
                    }
                }
                gVarH = h(dVarArr[1]);
                if (gVarH != null) {
                    g gVar5 = this.f37078i;
                    int i12 = -this.f37071b.U[1].e();
                    gVar5.f37051l.add(gVarH);
                    gVar5.f37045f = i12;
                    gVarH.f37050k.add(gVar5);
                    c(this.f37077h, this.f37078i, -1, this.f37074e);
                    return;
                }
                return;
            }
            gVarH2 = h(dVarArr[0]);
            if (gVarH2 != null) {
                return;
            }
            g gVar6 = this.f37077h;
            int iE = this.f37071b.U[0].e();
            gVar6.f37051l.add(gVarH2);
            gVar6.f37045f = iE;
            gVarH2.f37050k.add(gVar6);
            c(this.f37078i, this.f37077h, 1, this.f37074e);
            return;
        }
        v.f fVar8 = this.f37071b;
        if (fVar8.f36575a) {
            v.d[] dVarArr2 = fVar8.U;
            if (dVarArr2[0].f36570f == null || dVarArr2[1].f36570f == null) {
                if (dVarArr2[0].f36570f == null) {
                    if (dVarArr2[1].f36570f != null) {
                        g gVarH3 = h(dVarArr2[1]);
                        if (gVarH3 == null) {
                            return;
                        }
                        g gVar7 = this.f37078i;
                        int i13 = -this.f37071b.U[1].e();
                        gVar7.f37051l.add(gVarH3);
                        gVar7.f37045f = i13;
                        gVarH3.f37050k.add(gVar7);
                        gVar3 = this.f37077h;
                        gVar4 = this.f37078i;
                        i11 = -this.f37074e.f37046g;
                    } else {
                        if ((fVar8 instanceof v.j) || fVar8.Y == null || fVar8.n(v.d.b.CENTER).f36570f != null) {
                            return;
                        }
                        v.f fVar9 = this.f37071b;
                        b(this.f37077h, fVar9.Y.f36581d.f37077h, fVar9.A());
                    }
                    b(gVar3, gVar4, i11);
                    return;
                }
                g gVarH4 = h(dVarArr2[0]);
                if (gVarH4 == null) {
                    return;
                }
                g gVar8 = this.f37077h;
                int iE2 = this.f37071b.U[0].e();
                gVar8.f37051l.add(gVarH4);
                gVar8.f37045f = iE2;
                gVarH4.f37050k.add(gVar8);
                gVar3 = this.f37078i;
                gVar4 = this.f37077h;
                i11 = this.f37074e.f37046g;
                b(gVar3, gVar4, i11);
                return;
            }
            if (!fVar8.G()) {
                g gVarH5 = h(this.f37071b.U[0]);
                if (gVarH5 != null) {
                    g gVar9 = this.f37077h;
                    int iE3 = this.f37071b.U[0].e();
                    gVar9.f37051l.add(gVarH5);
                    gVar9.f37045f = iE3;
                    gVarH5.f37050k.add(gVar9);
                }
                g gVarH6 = h(this.f37071b.U[1]);
                if (gVarH6 != null) {
                    g gVar10 = this.f37078i;
                    int i14 = -this.f37071b.U[1].e();
                    gVar10.f37051l.add(gVarH6);
                    gVar10.f37045f = i14;
                    gVarH6.f37050k.add(gVar10);
                }
                this.f37077h.f37041b = true;
                this.f37078i.f37041b = true;
                return;
            }
            this.f37077h.f37045f = this.f37071b.U[0].e();
            gVar = this.f37078i;
            dVar = this.f37071b.U[1];
        } else {
            if (this.f37073d == v.f.b.MATCH_CONSTRAINT) {
                fVar4 = this.f37071b;
                i10 = fVar4.f36611s;
                if (i10 != 2) {
                    fVar5 = fVar4.Y;
                    if (fVar5 != null) {
                        h hVar6 = fVar5.f36583e.f37074e;
                        hVar.f37051l.add(hVar6);
                        hVar6.f37050k.add(this.f37074e);
                        h hVar7 = this.f37074e;
                        hVar7.f37041b = true;
                        hVar7.f37050k.add(this.f37077h);
                        list = this.f37074e.f37050k;
                        dVar2 = this.f37078i;
                        list.add(dVar2);
                    }
                } else if (i10 == 3) {
                    if (fVar4.f36613t == 3) {
                        this.f37077h.f37040a = this;
                        this.f37078i.f37040a = this;
                        o oVar3 = fVar4.f36583e;
                        oVar3.f37077h.f37040a = this;
                        oVar3.f37078i.f37040a = this;
                        hVar.f37040a = this;
                        if (fVar4.H()) {
                            this.f37074e.f37051l.add(this.f37071b.f36583e.f37074e);
                            this.f37071b.f36583e.f37074e.f37050k.add(this.f37074e);
                            o oVar4 = this.f37071b.f36583e;
                            oVar4.f37074e.f37040a = this;
                            this.f37074e.f37051l.add(oVar4.f37077h);
                            this.f37074e.f37051l.add(this.f37071b.f36583e.f37078i);
                            this.f37071b.f36583e.f37077h.f37050k.add(this.f37074e);
                            list = this.f37071b.f36583e.f37078i.f37050k;
                            dVar2 = this.f37074e;
                        } else if (this.f37071b.G()) {
                            this.f37071b.f36583e.f37074e.f37051l.add(this.f37074e);
                            list = this.f37074e.f37050k;
                            dVar2 = this.f37071b.f36583e.f37074e;
                        } else {
                            gVar2 = this.f37071b.f36583e.f37074e;
                        }
                        list.add(dVar2);
                    } else {
                        h hVar8 = fVar4.f36583e.f37074e;
                        hVar.f37051l.add(hVar8);
                        hVar8.f37050k.add(this.f37074e);
                        this.f37071b.f36583e.f37077h.f37050k.add(this.f37074e);
                        this.f37071b.f36583e.f37078i.f37050k.add(this.f37074e);
                        h hVar9 = this.f37074e;
                        hVar9.f37041b = true;
                        hVar9.f37050k.add(this.f37077h);
                        this.f37074e.f37050k.add(this.f37078i);
                        this.f37077h.f37051l.add(this.f37074e);
                        gVar2 = this.f37078i;
                    }
                    list = gVar2.f37051l;
                    dVar2 = this.f37074e;
                    list.add(dVar2);
                }
            }
            fVar2 = this.f37071b;
            dVarArr = fVar2.U;
            if (dVarArr[0].f36570f != null || dVarArr[1].f36570f == null) {
                if (dVarArr[0].f36570f == null) {
                    gVarH2 = h(dVarArr[0]);
                    if (gVarH2 != null) {
                        return;
                    }
                    g gVar11 = this.f37077h;
                    int iE4 = this.f37071b.U[0].e();
                    gVar11.f37051l.add(gVarH2);
                    gVar11.f37045f = iE4;
                    gVarH2.f37050k.add(gVar11);
                } else {
                    if (dVarArr[1].f36570f == null) {
                        gVarH = h(dVarArr[1]);
                        if (gVarH != null) {
                            g gVar12 = this.f37078i;
                            int i15 = -this.f37071b.U[1].e();
                            gVar12.f37051l.add(gVarH);
                            gVar12.f37045f = i15;
                            gVarH.f37050k.add(gVar12);
                            c(this.f37077h, this.f37078i, -1, this.f37074e);
                            return;
                        }
                        return;
                    }
                    if ((fVar2 instanceof v.j) || (fVar3 = fVar2.Y) == null) {
                        return;
                    } else {
                        b(this.f37077h, fVar3.f36581d.f37077h, fVar2.A());
                    }
                }
                c(this.f37078i, this.f37077h, 1, this.f37074e);
                return;
            }
            if (!fVar2.G()) {
                g gVarH7 = h(this.f37071b.U[0]);
                g gVarH8 = h(this.f37071b.U[1]);
                if (gVarH7 != null) {
                    gVarH7.f37050k.add(this);
                    if (gVarH7.f37049j) {
                        a(this);
                    }
                }
                if (gVarH8 != null) {
                    gVarH8.f37050k.add(this);
                    if (gVarH8.f37049j) {
                        a(this);
                    }
                }
                this.f37079j = q.b.CENTER;
                return;
            }
            this.f37077h.f37045f = this.f37071b.U[0].e();
            gVar = this.f37078i;
            dVar = this.f37071b.U[1];
        }
        gVar.f37045f = -dVar.e();
    }

    @Override // w.q
    public void e() {
        g gVar = this.f37077h;
        if (gVar.f37049j) {
            this.f37071b.f36582d0 = gVar.f37046g;
        }
    }

    @Override // w.q
    public void f() {
        this.f37072c = null;
        this.f37077h.b();
        this.f37078i.b();
        this.f37074e.b();
        this.f37076g = false;
    }

    @Override // w.q
    public boolean k() {
        return this.f37073d != v.f.b.MATCH_CONSTRAINT || this.f37071b.f36611s == 0;
    }

    public final void m(int[] iArr, int i10, int i11, int i12, int i13, float f10, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 != -1) {
            if (i14 == 0) {
                iArr[0] = (int) ((i16 * f10) + 0.5f);
                iArr[1] = i16;
                return;
            } else {
                if (i14 != 1) {
                    return;
                }
                iArr[0] = i15;
                iArr[1] = (int) ((i15 * f10) + 0.5f);
                return;
            }
        }
        int i17 = (int) ((i16 * f10) + 0.5f);
        int i18 = (int) ((i15 / f10) + 0.5f);
        if (i17 <= i15) {
            iArr[0] = i17;
            iArr[1] = i16;
        } else if (i18 <= i16) {
            iArr[0] = i15;
            iArr[1] = i18;
        }
    }

    public void n() {
        this.f37076g = false;
        this.f37077h.b();
        this.f37077h.f37049j = false;
        this.f37078i.b();
        this.f37078i.f37049j = false;
        this.f37074e.f37049j = false;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("HorizontalRun ");
        sbA.append(this.f37071b.f36612s0);
        return sbA.toString();
    }
}
