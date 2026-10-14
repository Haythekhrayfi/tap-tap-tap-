package w;

import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class c extends q {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList<q> f37030k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f37031l;

    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX WARN: Code duplicated, block: B:17:0x003d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0027 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0022 A[EDGE_INSN: B:48:0x0022->B:8:0x0022 BREAK  A[LOOP:1: B:12:0x002b->B:50:0x002b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x002a A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x003a -> B:8:0x0022). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public c(v.f r4, int r5) {
        /*
            r3 = this;
            r3.<init>(r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r3.f37030k = r4
            r3.f37075f = r5
            v.f r4 = r3.f37071b
        Le:
            int r5 = r3.f37075f
            v.f r5 = r4.t(r5)
            if (r5 == 0) goto L18
            r4 = r5
            goto Le
        L18:
            r3.f37071b = r4
            java.util.ArrayList<w.q> r5 = r3.f37030k
            int r0 = r3.f37075f
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L25
        L22:
            w.m r0 = r4.f36581d
            goto L2b
        L25:
            if (r0 != r2) goto L2a
        L27:
            w.o r0 = r4.f36583e
            goto L2b
        L2a:
            r0 = r1
        L2b:
            r5.add(r0)
            int r5 = r3.f37075f
            v.f r4 = r4.s(r5)
            if (r4 == 0) goto L40
            java.util.ArrayList<w.q> r5 = r3.f37030k
            int r0 = r3.f37075f
            if (r0 != 0) goto L3d
            goto L22
        L3d:
            if (r0 != r2) goto L2a
            goto L27
        L40:
            java.util.ArrayList<w.q> r4 = r3.f37030k
            java.util.Iterator r4 = r4.iterator()
        L46:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L62
            java.lang.Object r5 = r4.next()
            w.q r5 = (w.q) r5
            int r0 = r3.f37075f
            if (r0 != 0) goto L5b
            v.f r5 = r5.f37071b
            r5.f36577b = r3
            goto L46
        L5b:
            if (r0 != r2) goto L46
            v.f r5 = r5.f37071b
            r5.f36579c = r3
            goto L46
        L62:
            int r4 = r3.f37075f
            if (r4 != 0) goto L72
            v.f r4 = r3.f37071b
            v.f r4 = r4.Y
            v.g r4 = (v.g) r4
            boolean r4 = r4.U0
            if (r4 == 0) goto L72
            r4 = r2
            goto L73
        L72:
            r4 = 0
        L73:
            if (r4 == 0) goto L8e
            java.util.ArrayList<w.q> r4 = r3.f37030k
            int r4 = r4.size()
            if (r4 <= r2) goto L8e
            java.util.ArrayList<w.q> r4 = r3.f37030k
            int r5 = r4.size()
            int r5 = r5 - r2
            java.lang.Object r4 = r4.get(r5)
            w.q r4 = (w.q) r4
            v.f r4 = r4.f37071b
            r3.f37071b = r4
        L8e:
            int r4 = r3.f37075f
            if (r4 != 0) goto L97
            v.f r4 = r3.f37071b
            int r4 = r4.E0
            goto L9b
        L97:
            v.f r4 = r3.f37071b
            int r4 = r4.F0
        L9b:
            r3.f37031l = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w.c.<init>(v.f, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0195  */
    /* JADX WARN: Code duplicated, block: B:300:0x00e3 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00db A[ADDED_TO_REGION] */
    @Override // w.q, w.d
    public void a(d dVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f10;
        boolean z10;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        float f11;
        g gVar = this.f37077h;
        if (gVar.f37049j) {
            g gVar2 = this.f37078i;
            if (gVar2.f37049j) {
                v.f fVar = this.f37071b.Y;
                boolean z11 = fVar instanceof v.g ? ((v.g) fVar).U0 : false;
                int i22 = gVar2.f37046g - gVar.f37046g;
                int size = this.f37030k.size();
                int i23 = 0;
                while (true) {
                    i10 = -1;
                    i11 = 8;
                    if (i23 >= size) {
                        i23 = -1;
                        break;
                    } else if (this.f37030k.get(i23).f37071b.f36608q0 != 8) {
                        break;
                    } else {
                        i23++;
                    }
                }
                int i24 = size - 1;
                for (int i25 = i24; i25 >= 0; i25--) {
                    if (this.f37030k.get(i25).f37071b.f36608q0 != 8) {
                        i10 = i25;
                        break;
                    }
                }
                int i26 = 0;
                while (true) {
                    if (i26 >= 2) {
                        i12 = 0;
                        i13 = 0;
                        i14 = 0;
                        f10 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                        break;
                    }
                    int i27 = 0;
                    i13 = 0;
                    i14 = 0;
                    int i28 = 0;
                    f10 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                    while (i27 < size) {
                        q qVar = this.f37030k.get(i27);
                        v.f fVar2 = qVar.f37071b;
                        if (fVar2.f36608q0 != i11) {
                            i28++;
                            if (i27 > 0 && i27 >= i23) {
                                i13 += qVar.f37077h.f37045f;
                            }
                            h hVar = qVar.f37074e;
                            int i29 = hVar.f37046g;
                            boolean z12 = qVar.f37073d != v.f.b.MATCH_CONSTRAINT;
                            if (z12) {
                                int i30 = this.f37075f;
                                if (i30 == 0 && !fVar2.f36581d.f37074e.f37049j) {
                                    return;
                                }
                                if (i30 == 1 && !fVar2.f36583e.f37074e.f37049j) {
                                    return;
                                }
                            } else {
                                if (qVar.f37070a == 1 && i26 == 0) {
                                    i21 = hVar.f37052m;
                                    i14++;
                                } else {
                                    if (hVar.f37049j) {
                                        i21 = i29;
                                    }
                                    if (z12) {
                                        i13 += i21;
                                    } else {
                                        i14++;
                                        f11 = fVar2.I0[this.f37075f];
                                        if (f11 >= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                                            f10 += f11;
                                        }
                                    }
                                    if (i27 >= i24 && i27 < i10) {
                                        i13 += -qVar.f37078i.f37045f;
                                    }
                                }
                                z12 = true;
                                if (z12) {
                                    i14++;
                                    f11 = fVar2.I0[this.f37075f];
                                    if (f11 >= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                                        f10 += f11;
                                    }
                                } else {
                                    i13 += i21;
                                }
                                if (i27 >= i24) {
                                }
                            }
                            i21 = i29;
                            if (z12) {
                                i14++;
                                f11 = fVar2.I0[this.f37075f];
                                if (f11 >= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                                    f10 += f11;
                                }
                            } else {
                                i13 += i21;
                            }
                            if (i27 >= i24) {
                            }
                        }
                        i27++;
                        i11 = 8;
                    }
                    if (i13 < i22 || i14 == 0) {
                        i12 = i28;
                        break;
                    } else {
                        i26++;
                        i11 = 8;
                    }
                }
                int i31 = this.f37077h.f37046g;
                if (z11) {
                    i31 = this.f37078i.f37046g;
                }
                if (i13 > i22) {
                    int i32 = (int) (((i13 - i22) / 2.0f) + 0.5f);
                    i31 = z11 ? i31 + i32 : i31 - i32;
                }
                if (i14 > 0) {
                    float f12 = i22 - i13;
                    int i33 = (int) ((f12 / i14) + 0.5f);
                    int i34 = 0;
                    int i35 = 0;
                    while (i34 < size) {
                        q qVar2 = this.f37030k.get(i34);
                        int i36 = i33;
                        v.f fVar3 = qVar2.f37071b;
                        int i37 = i13;
                        int i38 = i31;
                        if (fVar3.f36608q0 != 8 && qVar2.f37073d == v.f.b.MATCH_CONSTRAINT) {
                            h hVar2 = qVar2.f37074e;
                            if (hVar2.f37049j) {
                                z11 = z11;
                            } else {
                                int i39 = f10 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD ? (int) (((fVar3.I0[this.f37075f] * f12) / f10) + 0.5f) : i36;
                                if (this.f37075f == 0) {
                                    i19 = fVar3.f36619w;
                                    i20 = fVar3.f36617v;
                                } else {
                                    i19 = fVar3.f36625z;
                                    i20 = fVar3.f36623y;
                                }
                                int iMax = Math.max(i20, qVar2.f37070a == 1 ? Math.min(i39, hVar2.f37052m) : i39);
                                if (i19 > 0) {
                                    iMax = Math.min(i19, iMax);
                                }
                                if (iMax != i39) {
                                    i35++;
                                    i39 = iMax;
                                }
                                qVar2.f37074e.c(i39);
                            }
                        } else {
                            z11 = z11;
                        }
                        i34++;
                        i33 = i36;
                        i13 = i37;
                        i31 = i38;
                        z11 = z11;
                        f12 = f12;
                        i12 = i12;
                    }
                    z10 = z11;
                    i15 = i12;
                    i16 = i31;
                    int i40 = i13;
                    if (i35 > 0) {
                        i14 -= i35;
                        int i41 = 0;
                        for (int i42 = 0; i42 < size; i42++) {
                            q qVar3 = this.f37030k.get(i42);
                            if (qVar3.f37071b.f36608q0 != 8) {
                                if (i42 > 0 && i42 >= i23) {
                                    i41 += qVar3.f37077h.f37045f;
                                }
                                i41 += qVar3.f37074e.f37046g;
                                if (i42 < i24 && i42 < i10) {
                                    i41 += -qVar3.f37078i.f37045f;
                                }
                            }
                        }
                        i13 = i41;
                    } else {
                        i13 = i40;
                    }
                    i18 = 2;
                    if (this.f37031l == 2 && i35 == 0) {
                        i17 = 0;
                        this.f37031l = 0;
                    } else {
                        i17 = 0;
                    }
                } else {
                    z10 = z11;
                    i15 = i12;
                    i16 = i31;
                    i17 = 0;
                    i18 = 2;
                }
                if (i13 > i22) {
                    this.f37031l = i18;
                }
                if (i15 > 0 && i14 == 0 && i23 == i10) {
                    this.f37031l = i18;
                }
                int i43 = this.f37031l;
                int i44 = i15;
                if (i43 == 1) {
                    int i45 = i44 > 1 ? (i22 - i13) / (i44 - 1) : i44 == 1 ? (i22 - i13) / 2 : i17;
                    if (i14 > 0) {
                        i45 = i17;
                    }
                    int i46 = i16;
                    for (int i47 = i17; i47 < size; i47++) {
                        q qVar4 = this.f37030k.get(z10 ? size - (i47 + 1) : i47);
                        if (qVar4.f37071b.f36608q0 == 8) {
                            qVar4.f37077h.c(i46);
                            qVar4.f37078i.c(i46);
                        } else {
                            if (i47 > 0) {
                                i46 = z10 ? i46 - i45 : i46 + i45;
                            }
                            if (i47 > 0 && i47 >= i23) {
                                int i48 = qVar4.f37077h.f37045f;
                                i46 = z10 ? i46 - i48 : i46 + i48;
                            }
                            (z10 ? qVar4.f37078i : qVar4.f37077h).c(i46);
                            h hVar3 = qVar4.f37074e;
                            int i49 = hVar3.f37046g;
                            if (qVar4.f37073d == v.f.b.MATCH_CONSTRAINT && qVar4.f37070a == 1) {
                                i49 = hVar3.f37052m;
                            }
                            i46 = z10 ? i46 - i49 : i46 + i49;
                            (z10 ? qVar4.f37077h : qVar4.f37078i).c(i46);
                            qVar4.f37076g = true;
                            if (i47 < i24 && i47 < i10) {
                                int i50 = -qVar4.f37078i.f37045f;
                                i46 = z10 ? i46 - i50 : i46 + i50;
                            }
                        }
                    }
                    return;
                }
                if (i43 == 0) {
                    int i51 = (i22 - i13) / (i44 + 1);
                    if (i14 > 0) {
                        i51 = i17;
                    }
                    int i52 = i16;
                    for (int i53 = i17; i53 < size; i53++) {
                        q qVar5 = this.f37030k.get(z10 ? size - (i53 + 1) : i53);
                        if (qVar5.f37071b.f36608q0 == 8) {
                            qVar5.f37077h.c(i52);
                            qVar5.f37078i.c(i52);
                        } else {
                            int i54 = z10 ? i52 - i51 : i52 + i51;
                            if (i53 > 0 && i53 >= i23) {
                                int i55 = qVar5.f37077h.f37045f;
                                i54 = z10 ? i54 - i55 : i54 + i55;
                            }
                            (z10 ? qVar5.f37078i : qVar5.f37077h).c(i54);
                            h hVar4 = qVar5.f37074e;
                            int iMin = hVar4.f37046g;
                            if (qVar5.f37073d == v.f.b.MATCH_CONSTRAINT && qVar5.f37070a == 1) {
                                iMin = Math.min(iMin, hVar4.f37052m);
                            }
                            i52 = z10 ? i54 - iMin : i54 + iMin;
                            (z10 ? qVar5.f37077h : qVar5.f37078i).c(i52);
                            if (i53 < i24 && i53 < i10) {
                                int i56 = -qVar5.f37078i.f37045f;
                                i52 = z10 ? i52 - i56 : i52 + i56;
                            }
                        }
                    }
                    return;
                }
                if (i43 == 2) {
                    float f13 = this.f37075f == 0 ? this.f37071b.f36600m0 : this.f37071b.f36602n0;
                    if (z10) {
                        f13 = 1.0f - f13;
                    }
                    int i57 = (int) (((i22 - i13) * f13) + 0.5f);
                    if (i57 < 0 || i14 > 0) {
                        i57 = i17;
                    }
                    int i58 = z10 ? i16 - i57 : i16 + i57;
                    for (int i59 = i17; i59 < size; i59++) {
                        q qVar6 = this.f37030k.get(z10 ? size - (i59 + 1) : i59);
                        if (qVar6.f37071b.f36608q0 == 8) {
                            qVar6.f37077h.c(i58);
                            qVar6.f37078i.c(i58);
                        } else {
                            if (i59 > 0 && i59 >= i23) {
                                int i60 = qVar6.f37077h.f37045f;
                                i58 = z10 ? i58 - i60 : i58 + i60;
                            }
                            (z10 ? qVar6.f37078i : qVar6.f37077h).c(i58);
                            h hVar5 = qVar6.f37074e;
                            int i61 = hVar5.f37046g;
                            if (qVar6.f37073d == v.f.b.MATCH_CONSTRAINT && qVar6.f37070a == 1) {
                                i61 = hVar5.f37052m;
                            }
                            i58 = z10 ? i58 - i61 : i58 + i61;
                            (z10 ? qVar6.f37077h : qVar6.f37078i).c(i58);
                            if (i59 < i24 && i59 < i10) {
                                int i62 = -qVar6.f37078i.f37045f;
                                i58 = z10 ? i58 - i62 : i58 + i62;
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0078 A[PHI: r0 r1
  0x0078: PHI (r0v15 int) = (r0v10 int), (r0v20 int) binds: [B:29:0x00c4, B:19:0x0076] A[DONT_GENERATE, DONT_INLINE]
  0x0078: PHI (r1v3 w.g) = (r1v2 w.g), (r1v7 w.g) binds: [B:29:0x00c4, B:19:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // w.q
    public void d() {
        g gVarI;
        int iE;
        Iterator<q> it = this.f37030k.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int size = this.f37030k.size();
        if (size < 1) {
            return;
        }
        v.f fVar = this.f37030k.get(0).f37071b;
        v.f fVar2 = this.f37030k.get(size - 1).f37071b;
        if (this.f37075f == 0) {
            v.d dVar = fVar.M;
            v.d dVar2 = fVar2.O;
            g gVarI2 = i(dVar, 0);
            int iE2 = dVar.e();
            v.f fVarM = m();
            if (fVarM != null) {
                iE2 = fVarM.M.e();
            }
            if (gVarI2 != null) {
                g gVar = this.f37077h;
                gVar.f37051l.add(gVarI2);
                gVar.f37045f = iE2;
                gVarI2.f37050k.add(gVar);
            }
            gVarI = i(dVar2, 0);
            iE = dVar2.e();
            v.f fVarN = n();
            if (fVarN != null) {
                iE = fVarN.O.e();
            }
            if (gVarI != null) {
                g gVar2 = this.f37078i;
                gVar2.f37051l.add(gVarI);
                gVar2.f37045f = -iE;
                gVarI.f37050k.add(gVar2);
            }
        } else {
            v.d dVar3 = fVar.N;
            v.d dVar4 = fVar2.P;
            g gVarI3 = i(dVar3, 1);
            int iE3 = dVar3.e();
            v.f fVarM2 = m();
            if (fVarM2 != null) {
                iE3 = fVarM2.N.e();
            }
            if (gVarI3 != null) {
                g gVar3 = this.f37077h;
                gVar3.f37051l.add(gVarI3);
                gVar3.f37045f = iE3;
                gVarI3.f37050k.add(gVar3);
            }
            gVarI = i(dVar4, 1);
            iE = dVar4.e();
            v.f fVarN2 = n();
            if (fVarN2 != null) {
                iE = fVarN2.P.e();
            }
            if (gVarI != null) {
                g gVar4 = this.f37078i;
                gVar4.f37051l.add(gVarI);
                gVar4.f37045f = -iE;
                gVarI.f37050k.add(gVar4);
            }
        }
        this.f37077h.f37040a = this;
        this.f37078i.f37040a = this;
    }

    @Override // w.q
    public void e() {
        for (int i10 = 0; i10 < this.f37030k.size(); i10++) {
            this.f37030k.get(i10).e();
        }
    }

    @Override // w.q
    public void f() {
        this.f37072c = null;
        Iterator<q> it = this.f37030k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // w.q
    public long j() {
        int size = this.f37030k.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            q qVar = this.f37030k.get(i10);
            j10 = ((long) qVar.f37078i.f37045f) + qVar.j() + j10 + ((long) qVar.f37077h.f37045f);
        }
        return j10;
    }

    @Override // w.q
    public boolean k() {
        int size = this.f37030k.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!this.f37030k.get(i10).k()) {
                return false;
            }
        }
        return true;
    }

    public final v.f m() {
        for (int i10 = 0; i10 < this.f37030k.size(); i10++) {
            v.f fVar = this.f37030k.get(i10).f37071b;
            if (fVar.f36608q0 != 8) {
                return fVar;
            }
        }
        return null;
    }

    public final v.f n() {
        for (int size = this.f37030k.size() - 1; size >= 0; size--) {
            v.f fVar = this.f37030k.get(size).f37071b;
            if (fVar.f36608q0 != 8) {
                return fVar;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        sb2.append(this.f37075f == 0 ? "horizontal : " : "vertical : ");
        for (q qVar : this.f37030k) {
            sb2.append("<");
            sb2.append(qVar);
            sb2.append("> ");
        }
        return sb2.toString();
    }
}
