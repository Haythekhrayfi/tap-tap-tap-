package w;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v.g f37032a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v.g f37035d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b.InterfaceC0443b f37037f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b.a f37038g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList<n> f37039h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f37033b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f37034c = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<q> f37036e = new ArrayList<>();

    public f(v.g gVar) {
        new ArrayList();
        this.f37037f = null;
        this.f37038g = new b.a();
        this.f37039h = new ArrayList<>();
        this.f37032a = gVar;
        this.f37035d = gVar;
    }

    public final void a(g gVar, int i10, int i11, g gVar2, ArrayList<n> arrayList, n nVar) {
        q qVar = gVar.f37043d;
        if (qVar.f37072c == null) {
            v.g gVar3 = this.f37032a;
            if (qVar == gVar3.f36581d || qVar == gVar3.f36583e) {
                return;
            }
            if (nVar == null) {
                nVar = new n(qVar, i11);
                arrayList.add(nVar);
            }
            qVar.f37072c = nVar;
            nVar.f37060b.add(qVar);
            for (d dVar : qVar.f37077h.f37050k) {
                if (dVar instanceof g) {
                    a((g) dVar, i10, 0, gVar2, arrayList, nVar);
                }
            }
            for (d dVar2 : qVar.f37078i.f37050k) {
                if (dVar2 instanceof g) {
                    a((g) dVar2, i10, 1, gVar2, arrayList, nVar);
                }
            }
            if (i10 == 1 && (qVar instanceof o)) {
                for (d dVar3 : ((o) qVar).f37061k.f37050k) {
                    if (dVar3 instanceof g) {
                        a((g) dVar3, i10, 2, gVar2, arrayList, nVar);
                    }
                }
            }
            Iterator<g> it = qVar.f37077h.f37051l.iterator();
            while (it.hasNext()) {
                a(it.next(), i10, 0, gVar2, arrayList, nVar);
            }
            Iterator<g> it2 = qVar.f37078i.f37051l.iterator();
            while (it2.hasNext()) {
                a(it2.next(), i10, 1, gVar2, arrayList, nVar);
            }
            if (i10 == 1 && (qVar instanceof o)) {
                Iterator<g> it3 = ((o) qVar).f37061k.f37051l.iterator();
                while (it3.hasNext()) {
                    a(it3.next(), i10, 2, gVar2, arrayList, nVar);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0061  */
    public final boolean b(v.g gVar) {
        int iZ;
        v.f.b bVar;
        int iQ;
        v.f.b bVar2;
        int iQ2;
        v.f.b bVar3;
        int iZ2;
        v.f.b bVar4;
        v.f.b bVar5;
        h hVar;
        int iQ3;
        for (v.f fVar : gVar.P0) {
            v.f.b[] bVarArr = fVar.X;
            v.f.b bVar6 = bVarArr[0];
            v.f.b bVar7 = bVarArr[1];
            if (fVar.f36608q0 != 8) {
                float f10 = fVar.f36621x;
                if (f10 < 1.0f && bVar6 == v.f.b.MATCH_CONSTRAINT) {
                    fVar.f36611s = 2;
                }
                float f11 = fVar.A;
                if (f11 < 1.0f && bVar7 == v.f.b.MATCH_CONSTRAINT) {
                    fVar.f36613t = 2;
                }
                if (fVar.f36578b0 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                    v.f.b bVar8 = v.f.b.MATCH_CONSTRAINT;
                    if (bVar6 == bVar8 && (bVar7 == v.f.b.WRAP_CONTENT || bVar7 == v.f.b.FIXED)) {
                        fVar.f36611s = 3;
                    } else if (bVar7 == bVar8 && (bVar6 == v.f.b.WRAP_CONTENT || bVar6 == v.f.b.FIXED)) {
                        fVar.f36613t = 3;
                    } else if (bVar6 == bVar8 && bVar7 == bVar8) {
                        if (fVar.f36611s == 0) {
                            fVar.f36611s = 3;
                        }
                        if (fVar.f36613t == 0) {
                            fVar.f36613t = 3;
                        }
                    }
                }
                v.f.b bVar9 = v.f.b.MATCH_CONSTRAINT;
                if (bVar6 == bVar9 && fVar.f36611s == 1 && (fVar.M.f36570f == null || fVar.O.f36570f == null)) {
                    bVar6 = v.f.b.WRAP_CONTENT;
                }
                v.f.b bVar10 = bVar6;
                if (bVar7 == bVar9 && fVar.f36613t == 1 && (fVar.N.f36570f == null || fVar.P.f36570f == null)) {
                    bVar7 = v.f.b.WRAP_CONTENT;
                }
                v.f.b bVar11 = bVar7;
                m mVar = fVar.f36581d;
                mVar.f37073d = bVar10;
                int i10 = fVar.f36611s;
                mVar.f37070a = i10;
                o oVar = fVar.f36583e;
                oVar.f37073d = bVar11;
                int i11 = fVar.f36613t;
                oVar.f37070a = i11;
                v.f.b bVar12 = v.f.b.MATCH_PARENT;
                if ((bVar10 == bVar12 || bVar10 == v.f.b.FIXED || bVar10 == v.f.b.WRAP_CONTENT) && (bVar11 == bVar12 || bVar11 == v.f.b.FIXED || bVar11 == v.f.b.WRAP_CONTENT)) {
                    int iZ3 = fVar.z();
                    if (bVar10 == bVar12) {
                        iZ = (gVar.z() - fVar.M.f36571g) - fVar.O.f36571g;
                        bVar = v.f.b.FIXED;
                    } else {
                        iZ = iZ3;
                        bVar = bVar10;
                    }
                    int iQ4 = fVar.q();
                    if (bVar11 == bVar12) {
                        iQ = (gVar.q() - fVar.N.f36571g) - fVar.P.f36571g;
                        bVar2 = v.f.b.FIXED;
                    } else {
                        iQ = iQ4;
                        bVar2 = bVar11;
                    }
                    f(fVar, bVar, iZ, bVar2, iQ);
                    fVar.f36581d.f37074e.c(fVar.z());
                    fVar.f36583e.f37074e.c(fVar.q());
                    fVar.f36575a = true;
                } else {
                    if (bVar10 == bVar9 && (bVar11 == (bVar5 = v.f.b.WRAP_CONTENT) || bVar11 == v.f.b.FIXED)) {
                        if (i10 == 3) {
                            if (bVar11 == bVar5) {
                                f(fVar, bVar5, 0, bVar5, 0);
                            }
                            int iQ5 = fVar.q();
                            int i12 = (int) ((iQ5 * fVar.f36578b0) + 0.5f);
                            v.f.b bVar13 = v.f.b.FIXED;
                            f(fVar, bVar13, i12, bVar13, iQ5);
                            fVar.f36581d.f37074e.c(fVar.z());
                            fVar.f36583e.f37074e.c(fVar.q());
                        } else {
                            if (i10 == 1) {
                                f(fVar, bVar5, 0, bVar11, 0);
                                hVar = fVar.f36581d.f37074e;
                                iQ3 = fVar.z();
                            } else if (i10 == 2) {
                                v.f.b[] bVarArr2 = gVar.X;
                                v.f.b bVar14 = bVarArr2[0];
                                v.f.b bVar15 = v.f.b.FIXED;
                                if (bVar14 == bVar15 || bVarArr2[0] == bVar12) {
                                    iZ2 = (int) ((f10 * gVar.z()) + 0.5f);
                                    iQ2 = fVar.q();
                                    bVar4 = bVar15;
                                    bVar3 = bVar11;
                                    f(fVar, bVar4, iZ2, bVar3, iQ2);
                                    fVar.f36581d.f37074e.c(fVar.z());
                                    fVar.f36583e.f37074e.c(fVar.q());
                                    fVar.f36575a = true;
                                }
                            } else {
                                v.d[] dVarArr = fVar.U;
                                if (dVarArr[0].f36570f == null || dVarArr[1].f36570f == null) {
                                }
                                iZ = 0;
                                iQ = 0;
                                bVar = bVar5;
                                bVar2 = bVar11;
                                f(fVar, bVar, iZ, bVar2, iQ);
                                fVar.f36581d.f37074e.c(fVar.z());
                                fVar.f36583e.f37074e.c(fVar.q());
                                fVar.f36575a = true;
                            }
                            hVar.f37052m = iQ3;
                        }
                    }
                    if (bVar11 == bVar9 && (bVar10 == (bVar5 = v.f.b.WRAP_CONTENT) || bVar10 == v.f.b.FIXED)) {
                        if (i11 == 3) {
                            if (bVar10 == bVar5) {
                                f(fVar, bVar5, 0, bVar5, 0);
                            }
                            iZ2 = fVar.z();
                            float f12 = fVar.f36578b0;
                            if (fVar.f36580c0 == -1) {
                                f12 = 1.0f / f12;
                            }
                            iQ2 = (int) ((iZ2 * f12) + 0.5f);
                            bVar3 = v.f.b.FIXED;
                            bVar4 = bVar3;
                            f(fVar, bVar4, iZ2, bVar3, iQ2);
                            fVar.f36581d.f37074e.c(fVar.z());
                            fVar.f36583e.f37074e.c(fVar.q());
                            fVar.f36575a = true;
                        } else {
                            if (i11 == 1) {
                                f(fVar, bVar10, 0, bVar5, 0);
                            } else if (i11 == 2) {
                                v.f.b[] bVarArr3 = gVar.X;
                                v.f.b bVar16 = bVarArr3[1];
                                v.f.b bVar17 = v.f.b.FIXED;
                                if (bVar16 == bVar17 || bVarArr3[1] == bVar12) {
                                    int iZ4 = fVar.z();
                                    iQ = (int) ((f11 * gVar.q()) + 0.5f);
                                    bVar = bVar10;
                                    iZ = iZ4;
                                    bVar2 = bVar17;
                                    f(fVar, bVar, iZ, bVar2, iQ);
                                    fVar.f36581d.f37074e.c(fVar.z());
                                    fVar.f36583e.f37074e.c(fVar.q());
                                    fVar.f36575a = true;
                                }
                            } else {
                                v.d[] dVarArr2 = fVar.U;
                                if (dVarArr2[2].f36570f == null || dVarArr2[3].f36570f == null) {
                                    iZ = 0;
                                    iQ = 0;
                                    bVar = bVar5;
                                    bVar2 = bVar11;
                                    f(fVar, bVar, iZ, bVar2, iQ);
                                    fVar.f36581d.f37074e.c(fVar.z());
                                    fVar.f36583e.f37074e.c(fVar.q());
                                    fVar.f36575a = true;
                                }
                            }
                            hVar = fVar.f36583e.f37074e;
                            iQ3 = fVar.q();
                            hVar.f37052m = iQ3;
                        }
                    }
                    if (bVar10 == bVar9 && bVar11 == bVar9) {
                        if (i10 == 1 || i11 == 1) {
                            v.f.b bVar18 = v.f.b.WRAP_CONTENT;
                            f(fVar, bVar18, 0, bVar18, 0);
                            fVar.f36581d.f37074e.f37052m = fVar.z();
                            hVar = fVar.f36583e.f37074e;
                            iQ3 = fVar.q();
                            hVar.f37052m = iQ3;
                        } else if (i11 == 2 && i10 == 2) {
                            v.f.b[] bVarArr4 = gVar.X;
                            v.f.b bVar19 = bVarArr4[0];
                            bVar2 = v.f.b.FIXED;
                            if (bVar19 == bVar2 && bVarArr4[1] == bVar2) {
                                int iZ5 = (int) ((f10 * gVar.z()) + 0.5f);
                                int iQ6 = (int) ((f11 * gVar.q()) + 0.5f);
                                bVar = bVar2;
                                iZ = iZ5;
                                iQ = iQ6;
                                f(fVar, bVar, iZ, bVar2, iQ);
                                fVar.f36581d.f37074e.c(fVar.z());
                                fVar.f36583e.f37074e.c(fVar.q());
                                fVar.f36575a = true;
                            }
                        }
                    }
                }
            }
            fVar.f36575a = true;
        }
        return false;
    }

    public void c() {
        q kVar;
        ArrayList<q> arrayList = this.f37036e;
        arrayList.clear();
        this.f37035d.f36581d.f();
        this.f37035d.f36583e.f();
        arrayList.add(this.f37035d.f36581d);
        arrayList.add(this.f37035d.f36583e);
        HashSet hashSet = null;
        for (v.f fVar : this.f37035d.P0) {
            if (fVar instanceof v.i) {
                kVar = new k(fVar);
            } else {
                if (fVar.G()) {
                    if (fVar.f36577b == null) {
                        fVar.f36577b = new c(fVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(fVar.f36577b);
                } else {
                    arrayList.add(fVar.f36581d);
                }
                if (fVar.H()) {
                    if (fVar.f36579c == null) {
                        fVar.f36579c = new c(fVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(fVar.f36579c);
                } else {
                    arrayList.add(fVar.f36583e);
                }
                if (fVar instanceof v.k) {
                    kVar = new l(fVar);
                }
            }
            arrayList.add(kVar);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<q> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
        for (q qVar : arrayList) {
            if (qVar.f37071b != this.f37035d) {
                qVar.d();
            }
        }
        this.f37039h.clear();
        n.f37058c = 0;
        e(this.f37032a.f36581d, 0, this.f37039h);
        e(this.f37032a.f36583e, 1, this.f37039h);
        this.f37033b = false;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0038 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x003a  */
    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    /* JADX WARN: Code duplicated, block: B:21:0x0043  */
    /* JADX WARN: Code duplicated, block: B:22:0x0046  */
    /* JADX WARN: Code duplicated, block: B:25:0x0064 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:50:0x0103  */
    public final int d(v.g gVar, int i10) {
        q qVar;
        q qVar2;
        boolean zContains;
        boolean zContains2;
        long j10;
        q qVar3;
        long j11;
        long jB;
        float f10;
        long j12;
        f fVar = this;
        int size = fVar.f37039h.size();
        long jMax = 0;
        int i11 = 0;
        long j13 = 0;
        while (i11 < size) {
            n nVar = fVar.f37039h.get(i11);
            q qVar4 = nVar.f37059a;
            if (qVar4 instanceof c) {
                if (((c) qVar4).f37075f == i10) {
                    if (i10 == 0) {
                        qVar = gVar.f36581d;
                    } else {
                        qVar = gVar.f36583e;
                    }
                    g gVar2 = qVar.f37077h;
                    if (i10 == 0) {
                        qVar2 = gVar.f36581d;
                    } else {
                        qVar2 = gVar.f36583e;
                    }
                    g gVar3 = qVar2.f37078i;
                    zContains = qVar4.f37077h.f37051l.contains(gVar2);
                    zContains2 = nVar.f37059a.f37078i.f37051l.contains(gVar3);
                    j10 = nVar.f37059a.j();
                    if (zContains || !zContains2) {
                        qVar3 = nVar.f37059a;
                        if (zContains) {
                            g gVar4 = qVar3.f37077h;
                            jB = nVar.b(gVar4, gVar4.f37045f);
                            j11 = ((long) nVar.f37059a.f37077h.f37045f) + j10;
                        } else if (zContains2) {
                            g gVar5 = qVar3.f37078i;
                            long jA = nVar.a(gVar5, gVar5.f37045f);
                            j11 = ((long) (-nVar.f37059a.f37078i.f37045f)) + j10;
                            jB = -jA;
                        } else {
                            j13 = (qVar3.j() + ((long) qVar3.f37077h.f37045f)) - ((long) nVar.f37059a.f37078i.f37045f);
                        }
                        j13 = Math.max(jB, j11);
                    } else {
                        long jB2 = nVar.b(nVar.f37059a.f37077h, j13);
                        long jA2 = nVar.a(nVar.f37059a.f37078i, j13);
                        long j14 = jB2 - j10;
                        q qVar5 = nVar.f37059a;
                        int i12 = qVar5.f37078i.f37045f;
                        if (j14 >= (-i12)) {
                            j14 += (long) i12;
                        }
                        long j15 = (-jA2) - j10;
                        long j16 = qVar5.f37077h.f37045f;
                        long j17 = j15 - j16;
                        if (j17 >= j16) {
                            j17 -= j16;
                        }
                        v.f fVar2 = qVar5.f37071b;
                        Objects.requireNonNull(fVar2);
                        if (i10 == 0) {
                            f10 = fVar2.f36600m0;
                        } else {
                            f10 = i10 == 1 ? fVar2.f36602n0 : -1.0f;
                        }
                        if (f10 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                            j12 = (long) ((j14 / (1.0f - f10)) + (j17 / f10));
                        } else {
                            j12 = 0;
                        }
                        float f11 = j12;
                        long jA3 = ((long) ((f11 * f10) + 0.5f)) + j10 + ((long) e.a(1.0f, f10, f11, 0.5f));
                        q qVar6 = nVar.f37059a;
                        j13 = (((long) qVar6.f37077h.f37045f) + jA3) - ((long) qVar6.f37078i.f37045f);
                    }
                }
            } else if (i10 == 0) {
                if (qVar4 instanceof m) {
                    if (i10 == 0) {
                        qVar = gVar.f36581d;
                    } else {
                        qVar = gVar.f36583e;
                    }
                    g gVar6 = qVar.f37077h;
                    if (i10 == 0) {
                        qVar2 = gVar.f36581d;
                    } else {
                        qVar2 = gVar.f36583e;
                    }
                    g gVar7 = qVar2.f37078i;
                    zContains = qVar4.f37077h.f37051l.contains(gVar6);
                    zContains2 = nVar.f37059a.f37078i.f37051l.contains(gVar7);
                    j10 = nVar.f37059a.j();
                    if (zContains) {
                        qVar3 = nVar.f37059a;
                        if (zContains) {
                            g gVar8 = qVar3.f37077h;
                            jB = nVar.b(gVar8, gVar8.f37045f);
                            j11 = ((long) nVar.f37059a.f37077h.f37045f) + j10;
                        } else if (zContains2) {
                            g gVar9 = qVar3.f37078i;
                            long jA4 = nVar.a(gVar9, gVar9.f37045f);
                            j11 = ((long) (-nVar.f37059a.f37078i.f37045f)) + j10;
                            jB = -jA4;
                        } else {
                            j13 = (qVar3.j() + ((long) qVar3.f37077h.f37045f)) - ((long) nVar.f37059a.f37078i.f37045f);
                        }
                        j13 = Math.max(jB, j11);
                    } else {
                        qVar3 = nVar.f37059a;
                        if (zContains) {
                            g gVar10 = qVar3.f37077h;
                            jB = nVar.b(gVar10, gVar10.f37045f);
                            j11 = ((long) nVar.f37059a.f37077h.f37045f) + j10;
                        } else if (zContains2) {
                            g gVar11 = qVar3.f37078i;
                            long jA5 = nVar.a(gVar11, gVar11.f37045f);
                            j11 = ((long) (-nVar.f37059a.f37078i.f37045f)) + j10;
                            jB = -jA5;
                        } else {
                            j13 = (qVar3.j() + ((long) qVar3.f37077h.f37045f)) - ((long) nVar.f37059a.f37078i.f37045f);
                        }
                        j13 = Math.max(jB, j11);
                    }
                }
            } else if (qVar4 instanceof o) {
                if (i10 == 0) {
                    qVar = gVar.f36581d;
                } else {
                    qVar = gVar.f36583e;
                }
                g gVar12 = qVar.f37077h;
                if (i10 == 0) {
                    qVar2 = gVar.f36581d;
                } else {
                    qVar2 = gVar.f36583e;
                }
                g gVar13 = qVar2.f37078i;
                zContains = qVar4.f37077h.f37051l.contains(gVar12);
                zContains2 = nVar.f37059a.f37078i.f37051l.contains(gVar13);
                j10 = nVar.f37059a.j();
                if (zContains) {
                    qVar3 = nVar.f37059a;
                    if (zContains) {
                        g gVar14 = qVar3.f37077h;
                        jB = nVar.b(gVar14, gVar14.f37045f);
                        j11 = ((long) nVar.f37059a.f37077h.f37045f) + j10;
                    } else if (zContains2) {
                        g gVar15 = qVar3.f37078i;
                        long jA6 = nVar.a(gVar15, gVar15.f37045f);
                        j11 = ((long) (-nVar.f37059a.f37078i.f37045f)) + j10;
                        jB = -jA6;
                    } else {
                        j13 = (qVar3.j() + ((long) qVar3.f37077h.f37045f)) - ((long) nVar.f37059a.f37078i.f37045f);
                    }
                    j13 = Math.max(jB, j11);
                } else {
                    qVar3 = nVar.f37059a;
                    if (zContains) {
                        g gVar16 = qVar3.f37077h;
                        jB = nVar.b(gVar16, gVar16.f37045f);
                        j11 = ((long) nVar.f37059a.f37077h.f37045f) + j10;
                    } else if (zContains2) {
                        g gVar17 = qVar3.f37078i;
                        long jA7 = nVar.a(gVar17, gVar17.f37045f);
                        j11 = ((long) (-nVar.f37059a.f37078i.f37045f)) + j10;
                        jB = -jA7;
                    } else {
                        j13 = (qVar3.j() + ((long) qVar3.f37077h.f37045f)) - ((long) nVar.f37059a.f37078i.f37045f);
                    }
                    j13 = Math.max(jB, j11);
                }
            }
            jMax = Math.max(jMax, j13);
            i11++;
            j13 = 0;
            fVar = this;
        }
        return (int) jMax;
    }

    public final void e(q qVar, int i10, ArrayList<n> arrayList) {
        for (d dVar : qVar.f37077h.f37050k) {
            if (dVar instanceof g) {
                a((g) dVar, i10, 0, qVar.f37078i, arrayList, null);
            } else if (dVar instanceof q) {
                a(((q) dVar).f37077h, i10, 0, qVar.f37078i, arrayList, null);
            }
        }
        for (d dVar2 : qVar.f37078i.f37050k) {
            if (dVar2 instanceof g) {
                a((g) dVar2, i10, 1, qVar.f37077h, arrayList, null);
            } else if (dVar2 instanceof q) {
                a(((q) dVar2).f37078i, i10, 1, qVar.f37077h, arrayList, null);
            }
        }
        if (i10 == 1) {
            for (d dVar3 : ((o) qVar).f37061k.f37050k) {
                if (dVar3 instanceof g) {
                    a((g) dVar3, i10, 2, null, arrayList, null);
                }
            }
        }
    }

    public final void f(v.f fVar, v.f.b bVar, int i10, v.f.b bVar2, int i11) {
        b.a aVar = this.f37038g;
        aVar.f37020a = bVar;
        aVar.f37021b = bVar2;
        aVar.f37022c = i10;
        aVar.f37023d = i11;
        ((ConstraintLayout.c) this.f37037f).b(fVar, aVar);
        fVar.Z(this.f37038g.f37024e);
        fVar.U(this.f37038g.f37025f);
        b.a aVar2 = this.f37038g;
        fVar.H = aVar2.f37027h;
        fVar.R(aVar2.f37026g);
    }

    public void g() {
        h hVar;
        int iZ;
        h hVar2;
        int iZ2;
        h hVar3;
        for (v.f fVar : this.f37032a.P0) {
            if (!fVar.f36575a) {
                v.f.b[] bVarArr = fVar.X;
                boolean z10 = false;
                v.f.b bVar = bVarArr[0];
                v.f.b bVar2 = bVarArr[1];
                int i10 = fVar.f36611s;
                int i11 = fVar.f36613t;
                v.f.b bVar3 = v.f.b.WRAP_CONTENT;
                boolean z11 = bVar == bVar3 || (bVar == v.f.b.MATCH_CONSTRAINT && i10 == 1);
                if (bVar2 == bVar3 || (bVar2 == v.f.b.MATCH_CONSTRAINT && i11 == 1)) {
                    z10 = true;
                }
                h hVar4 = fVar.f36581d.f37074e;
                boolean z12 = hVar4.f37049j;
                h hVar5 = fVar.f36583e.f37074e;
                boolean z13 = hVar5.f37049j;
                if (z12 && z13) {
                    v.f.b bVar4 = v.f.b.FIXED;
                    f(fVar, bVar4, hVar4.f37046g, bVar4, hVar5.f37046g);
                } else {
                    if (z12 && z10) {
                        f(fVar, v.f.b.FIXED, hVar4.f37046g, bVar3, hVar5.f37046g);
                        if (bVar2 == v.f.b.MATCH_CONSTRAINT) {
                            hVar2 = fVar.f36583e.f37074e;
                            iZ2 = fVar.q();
                            hVar2.f37052m = iZ2;
                        } else {
                            hVar = fVar.f36583e.f37074e;
                            iZ = fVar.q();
                            hVar.c(iZ);
                        }
                    } else if (z13 && z11) {
                        f(fVar, bVar3, hVar4.f37046g, v.f.b.FIXED, hVar5.f37046g);
                        if (bVar == v.f.b.MATCH_CONSTRAINT) {
                            hVar2 = fVar.f36581d.f37074e;
                            iZ2 = fVar.z();
                            hVar2.f37052m = iZ2;
                        } else {
                            hVar = fVar.f36581d.f37074e;
                            iZ = fVar.z();
                            hVar.c(iZ);
                        }
                    }
                    if (!fVar.f36575a && (hVar3 = fVar.f36583e.f37062l) != null) {
                        hVar3.c(fVar.f36594j0);
                    }
                }
                fVar.f36575a = true;
                if (!fVar.f36575a) {
                }
            }
        }
    }
}
