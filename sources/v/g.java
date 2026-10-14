package v;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import w.p;
import w.q;

/* JADX INFO: loaded from: classes.dex */
public class g extends o {
    public w.b Q0;
    public w.f R0;
    public int S0;
    public w.b.InterfaceC0443b T0;
    public boolean U0;
    public r.f V0;
    public r.d W0;
    public int X0;
    public int Y0;
    public int Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public int f36629a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public c[] f36630b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public c[] f36631c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public int f36632d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public boolean f36633e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public boolean f36634f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public WeakReference<d> f36635g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public WeakReference<d> f36636h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public WeakReference<d> f36637i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public WeakReference<d> f36638j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public HashSet<f> f36639k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public w.b.a f36640l1;

    public g() {
        this.Q0 = new w.b(this);
        this.R0 = new w.f(this);
        this.T0 = null;
        this.U0 = false;
        this.W0 = new r.d();
        this.Z0 = 0;
        this.f36629a1 = 0;
        this.f36630b1 = new c[4];
        this.f36631c1 = new c[4];
        this.f36632d1 = 257;
        this.f36633e1 = false;
        this.f36634f1 = false;
        this.f36635g1 = null;
        this.f36636h1 = null;
        this.f36637i1 = null;
        this.f36638j1 = null;
        this.f36639k1 = new HashSet<>();
        this.f36640l1 = new w.b.a();
    }

    public g(int i10, int i11) {
        super(i10, i11);
        this.Q0 = new w.b(this);
        this.R0 = new w.f(this);
        this.T0 = null;
        this.U0 = false;
        this.W0 = new r.d();
        this.Z0 = 0;
        this.f36629a1 = 0;
        this.f36630b1 = new c[4];
        this.f36631c1 = new c[4];
        this.f36632d1 = 257;
        this.f36633e1 = false;
        this.f36634f1 = false;
        this.f36635g1 = null;
        this.f36636h1 = null;
        this.f36637i1 = null;
        this.f36638j1 = null;
        this.f36639k1 = new HashSet<>();
        this.f36640l1 = new w.b.a();
    }

    public g(int i10, int i11, int i12, int i13) {
        super(i10, i11, i12, i13);
        this.Q0 = new w.b(this);
        this.R0 = new w.f(this);
        this.T0 = null;
        this.U0 = false;
        this.W0 = new r.d();
        this.Z0 = 0;
        this.f36629a1 = 0;
        this.f36630b1 = new c[4];
        this.f36631c1 = new c[4];
        this.f36632d1 = 257;
        this.f36633e1 = false;
        this.f36634f1 = false;
        this.f36635g1 = null;
        this.f36636h1 = null;
        this.f36637i1 = null;
        this.f36638j1 = null;
        this.f36639k1 = new HashSet<>();
        this.f36640l1 = new w.b.a();
    }

    public g(String str, int i10, int i11) {
        super(i10, i11);
        this.Q0 = new w.b(this);
        this.R0 = new w.f(this);
        this.T0 = null;
        this.U0 = false;
        this.W0 = new r.d();
        this.Z0 = 0;
        this.f36629a1 = 0;
        this.f36630b1 = new c[4];
        this.f36631c1 = new c[4];
        this.f36632d1 = 257;
        this.f36633e1 = false;
        this.f36634f1 = false;
        this.f36635g1 = null;
        this.f36636h1 = null;
        this.f36637i1 = null;
        this.f36638j1 = null;
        this.f36639k1 = new HashSet<>();
        this.f36640l1 = new w.b.a();
        this.f36612s0 = str;
    }

    public static boolean l0(f fVar, w.b.InterfaceC0443b interfaceC0443b, w.b.a aVar, int i10) {
        int i11;
        int i12;
        if (interfaceC0443b == null) {
            return false;
        }
        if (fVar.f36608q0 == 8 || (fVar instanceof i) || (fVar instanceof a)) {
            aVar.f37024e = 0;
            aVar.f37025f = 0;
            return false;
        }
        aVar.f37020a = fVar.r();
        aVar.f37021b = fVar.y();
        aVar.f37022c = fVar.z();
        aVar.f37023d = fVar.q();
        aVar.f37028i = false;
        aVar.f37029j = i10;
        f.b bVar = aVar.f37020a;
        f.b bVar2 = f.b.MATCH_CONSTRAINT;
        boolean z10 = bVar == bVar2;
        boolean z11 = aVar.f37021b == bVar2;
        boolean z12 = z10 && fVar.f36578b0 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        boolean z13 = z11 && fVar.f36578b0 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        if (z10 && fVar.C(0) && fVar.f36611s == 0 && !z12) {
            aVar.f37020a = f.b.WRAP_CONTENT;
            if (z11 && fVar.f36613t == 0) {
                aVar.f37020a = f.b.FIXED;
            }
            z10 = false;
        }
        if (z11 && fVar.C(1) && fVar.f36613t == 0 && !z13) {
            aVar.f37021b = f.b.WRAP_CONTENT;
            if (z10 && fVar.f36611s == 0) {
                aVar.f37021b = f.b.FIXED;
            }
            z11 = false;
        }
        if (fVar.J()) {
            aVar.f37020a = f.b.FIXED;
            z10 = false;
        }
        if (fVar.K()) {
            aVar.f37021b = f.b.FIXED;
            z11 = false;
        }
        if (z12) {
            if (fVar.f36615u[0] == 4) {
                aVar.f37020a = f.b.FIXED;
            } else if (!z11) {
                f.b bVar3 = aVar.f37021b;
                f.b bVar4 = f.b.FIXED;
                if (bVar3 == bVar4) {
                    i12 = aVar.f37023d;
                } else {
                    aVar.f37020a = f.b.WRAP_CONTENT;
                    ((ConstraintLayout.c) interfaceC0443b).b(fVar, aVar);
                    i12 = aVar.f37025f;
                }
                aVar.f37020a = bVar4;
                aVar.f37022c = (int) (fVar.f36578b0 * i12);
            }
        }
        if (z13) {
            if (fVar.f36615u[1] == 4) {
                aVar.f37021b = f.b.FIXED;
            } else if (!z10) {
                f.b bVar5 = aVar.f37020a;
                f.b bVar6 = f.b.FIXED;
                if (bVar5 == bVar6) {
                    i11 = aVar.f37022c;
                } else {
                    aVar.f37021b = f.b.WRAP_CONTENT;
                    ((ConstraintLayout.c) interfaceC0443b).b(fVar, aVar);
                    i11 = aVar.f37024e;
                }
                aVar.f37021b = bVar6;
                aVar.f37023d = fVar.f36580c0 == -1 ? (int) (i11 / fVar.f36578b0) : (int) (fVar.f36578b0 * i11);
            }
        }
        ((ConstraintLayout.c) interfaceC0443b).b(fVar, aVar);
        fVar.Z(aVar.f37024e);
        fVar.U(aVar.f37025f);
        fVar.H = aVar.f37027h;
        fVar.R(aVar.f37026g);
        aVar.f37029j = 0;
        return aVar.f37028i;
    }

    @Override // v.o, v.f
    public void L() {
        this.W0.u();
        this.X0 = 0;
        this.Y0 = 0;
        super.L();
    }

    @Override // v.f
    public void a0(boolean z10, boolean z11) {
        super.a0(z10, z11);
        int size = this.P0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.P0.get(i10).a0(z10, z11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:339:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:353:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:371:0x0605  */
    /* JADX WARN: Code duplicated, block: B:376:0x061b  */
    /* JADX WARN: Code duplicated, block: B:388:0x0645  */
    /* JADX WARN: Code duplicated, block: B:399:0x066b  */
    /* JADX WARN: Code duplicated, block: B:402:0x0676  */
    /* JADX WARN: Code duplicated, block: B:404:0x0682  */
    /* JADX WARN: Code duplicated, block: B:408:0x0693  */
    /* JADX WARN: Code duplicated, block: B:411:0x06a8 A[Catch: Exception -> 0x0771, LOOP:12: B:410:0x06a6->B:411:0x06a8, LOOP_END, TryCatch #2 {Exception -> 0x0771, blocks: (B:409:0x0696, B:411:0x06a8, B:412:0x06b8), top: B:520:0x0696 }] */
    /* JADX WARN: Code duplicated, block: B:443:0x0766  */
    /* JADX WARN: Code duplicated, block: B:452:0x078e  */
    /* JADX WARN: Code duplicated, block: B:454:0x07aa  */
    /* JADX WARN: Code duplicated, block: B:460:0x07c5  */
    /* JADX WARN: Code duplicated, block: B:462:0x07c8  */
    /* JADX WARN: Code duplicated, block: B:465:0x07d5  */
    /* JADX WARN: Code duplicated, block: B:467:0x07de A[LOOP:15: B:466:0x07dc->B:467:0x07de, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:476:0x0802 A[LOOP:14: B:475:0x0800->B:476:0x0802, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:488:0x086b  */
    /* JADX WARN: Code duplicated, block: B:491:0x0888  */
    /* JADX WARN: Code duplicated, block: B:492:0x0896  */
    /* JADX WARN: Code duplicated, block: B:494:0x0899  */
    /* JADX WARN: Code duplicated, block: B:499:0x08aa  */
    /* JADX WARN: Code duplicated, block: B:506:0x08d7 A[PHI: r10 r16
  0x08d7: PHI (r10v5 ??) = (r10v4 ??), (r10v7 ??), (r10v7 ??), (r10v7 ??) binds: [B:493:0x0897, B:501:0x08bc, B:502:0x08be, B:504:0x08c4] A[DONT_GENERATE, DONT_INLINE]
  0x08d7: PHI (r16v5 boolean) = (r16v4 boolean), (r16v7 boolean), (r16v7 boolean), (r16v7 boolean) binds: [B:493:0x0897, B:501:0x08bc, B:502:0x08be, B:504:0x08c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:508:0x08db  */
    /* JADX WARN: Code duplicated, block: B:509:0x08dd  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:513:0x08e8  */
    /* JADX WARN: Code duplicated, block: B:570:0x0687 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:577:0x07ca A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v67 */
    /* JADX WARN: Type inference failed for: r10v68 */
    /* JADX WARN: Type inference failed for: r10v69 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v70 */
    /* JADX WARN: Type inference failed for: r10v71 */
    /* JADX WARN: Type inference failed for: r10v72 */
    /* JADX WARN: Type inference failed for: r10v73 */
    /* JADX WARN: Type inference failed for: r10v74 */
    /* JADX WARN: Type inference failed for: r10v75 */
    /* JADX WARN: Type inference failed for: r10v76 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v9 */
    @Override // v.o
    public void c0() {
        int i10;
        int i11;
        f.b bVar;
        f.b bVar2;
        int i12;
        int iZ;
        int iQ;
        boolean z10;
        boolean z11;
        r.d dVar;
        f.b bVarR;
        f.b bVar3;
        int i13;
        boolean z12;
        int i14;
        int i15;
        boolean zM0;
        ?? r10;
        int i16;
        boolean z13;
        int i17;
        boolean z14;
        int i18;
        boolean z15;
        int iMax;
        boolean z16;
        ?? r11;
        int iMax2;
        ?? r12;
        boolean z17;
        ?? r13;
        int i19;
        boolean z18;
        ?? r14;
        boolean z19;
        f.b bVar4;
        f.b bVar5;
        int i20;
        int iMax3;
        int iMax4;
        int iMax5;
        int iMax6;
        f.b bVar6;
        r.d dVar2;
        boolean zM1;
        int size;
        int i21;
        boolean z20;
        f fVar;
        boolean z21;
        boolean z22;
        int i22;
        WeakReference<d> weakReference;
        WeakReference<d> weakReference2;
        WeakReference<d> weakReference3;
        WeakReference<d> weakReference4;
        f fVar2;
        f.b bVar7;
        int i23;
        int i24;
        f.b bVar8;
        f.b bVar9;
        p pVar;
        p pVar2;
        boolean z23;
        int iC;
        int iC2;
        Object obj;
        int i25;
        int i26;
        this.f36582d0 = 0;
        this.f36584e0 = 0;
        this.f36633e1 = false;
        this.f36634f1 = false;
        int size2 = this.P0.size();
        int iMax7 = Math.max(0, z());
        int iMax8 = Math.max(0, q());
        f.b[] bVarArr = this.X;
        f.b bVar10 = bVarArr[1];
        f.b bVar11 = bVarArr[0];
        r.f fVar3 = this.V0;
        if (fVar3 != null) {
            fVar3.f35006y++;
        }
        if (this.S0 == 0 && l.b(this.f36632d1, 1)) {
            w.b.InterfaceC0443b interfaceC0443b = this.T0;
            w.b.a aVar = w.i.f37053a;
            f.b bVarR2 = r();
            f.b bVarY = y();
            w.i.f37054b = 0;
            w.i.f37055c = 0;
            N();
            ArrayList<f> arrayList = this.P0;
            int size3 = arrayList.size();
            for (int i27 = 0; i27 < size3; i27++) {
                arrayList.get(i27).N();
            }
            boolean z24 = this.U0;
            if (bVarR2 == f.b.FIXED) {
                S(0, z());
            } else {
                d dVar3 = this.M;
                dVar3.f36566b = 0;
                dVar3.f36567c = true;
                this.f36582d0 = 0;
            }
            int i28 = 0;
            boolean z25 = false;
            boolean z26 = false;
            while (i28 < size3) {
                f fVar4 = arrayList.get(i28);
                if (fVar4 instanceof i) {
                    i iVar = (i) fVar4;
                    if (iVar.U0 == 1) {
                        int iZ2 = iVar.Q0;
                        if (iZ2 == -1) {
                            if (iVar.R0 != -1 && J()) {
                                iZ2 = z() - iVar.R0;
                            } else if (J()) {
                                iZ2 = (int) ((iVar.P0 * z()) + 0.5f);
                            }
                            iVar.c0(iZ2);
                        } else {
                            iVar.c0(iZ2);
                        }
                        z25 = true;
                    }
                } else if ((fVar4 instanceof a) && ((a) fVar4).e0() == 0) {
                    z26 = true;
                }
                i28++;
                z25 = z25;
                z26 = z26;
            }
            if (z25) {
                for (int i29 = 0; i29 < size3; i29++) {
                    f fVar5 = arrayList.get(i29);
                    if (fVar5 instanceof i) {
                        i iVar2 = (i) fVar5;
                        if (iVar2.U0 == 1) {
                            w.i.b(0, iVar2, interfaceC0443b, z24);
                        }
                    }
                }
            }
            w.i.b(0, this, interfaceC0443b, z24);
            if (z26) {
                for (int i30 = 0; i30 < size3; i30++) {
                    f fVar6 = arrayList.get(i30);
                    if (fVar6 instanceof a) {
                        a aVar2 = (a) fVar6;
                        if (aVar2.e0() == 0 && aVar2.d0()) {
                            w.i.b(1, aVar2, interfaceC0443b, z24);
                        }
                    }
                }
            }
            if (bVarY == f.b.FIXED) {
                T(0, q());
            } else {
                d dVar4 = this.N;
                dVar4.f36566b = 0;
                dVar4.f36567c = true;
                this.f36584e0 = 0;
            }
            boolean z27 = false;
            boolean z28 = false;
            for (int i31 = 0; i31 < size3; i31++) {
                f fVar7 = arrayList.get(i31);
                if (fVar7 instanceof i) {
                    i iVar3 = (i) fVar7;
                    if (iVar3.U0 == 0) {
                        int iQ2 = iVar3.Q0;
                        if (iQ2 == -1) {
                            if (iVar3.R0 != -1 && K()) {
                                iQ2 = q() - iVar3.R0;
                            } else if (K()) {
                                iQ2 = (int) ((iVar3.P0 * q()) + 0.5f);
                            }
                            iVar3.c0(iQ2);
                        } else {
                            iVar3.c0(iQ2);
                        }
                        z27 = true;
                    }
                } else if ((fVar7 instanceof a) && ((a) fVar7).e0() == 1) {
                    z28 = true;
                }
            }
            if (z27) {
                for (int i32 = 0; i32 < size3; i32++) {
                    f fVar8 = arrayList.get(i32);
                    if (fVar8 instanceof i) {
                        i iVar4 = (i) fVar8;
                        if (iVar4.U0 == 0) {
                            w.i.g(1, iVar4, interfaceC0443b);
                        }
                    }
                }
            }
            w.i.g(0, this, interfaceC0443b);
            if (z28) {
                for (int i33 = 0; i33 < size3; i33++) {
                    f fVar9 = arrayList.get(i33);
                    if (fVar9 instanceof a) {
                        a aVar3 = (a) fVar9;
                        if (aVar3.e0() == 1 && aVar3.d0()) {
                            w.i.g(1, aVar3, interfaceC0443b);
                        }
                    }
                }
            }
            for (int i34 = 0; i34 < size3; i34++) {
                f fVar10 = arrayList.get(i34);
                if (fVar10.I() && w.i.a(fVar10)) {
                    l0(fVar10, interfaceC0443b, w.i.f37053a, 0);
                    if (!(fVar10 instanceof i)) {
                        w.i.b(0, fVar10, interfaceC0443b, z24);
                    } else if (((i) fVar10).U0 != 0) {
                        w.i.b(0, fVar10, interfaceC0443b, z24);
                    }
                    w.i.g(0, fVar10, interfaceC0443b);
                }
            }
            for (int i35 = 0; i35 < size2; i35++) {
                f fVar11 = this.P0.get(i35);
                if (fVar11.I() && !(fVar11 instanceof i) && !(fVar11 instanceof a) && !(fVar11 instanceof n) && !fVar11.J) {
                    f.b bVarP = fVar11.p(0);
                    f.b bVarP2 = fVar11.p(1);
                    f.b bVar12 = f.b.MATCH_CONSTRAINT;
                    if (!(bVarP == bVar12 && fVar11.f36611s != 1 && bVarP2 == bVar12 && fVar11.f36613t != 1)) {
                        l0(fVar11, this.T0, new w.b.a(), 0);
                    }
                }
            }
        }
        if (size2 > 2 && ((bVar11 == (bVar7 = f.b.WRAP_CONTENT) || bVar10 == bVar7) && l.b(this.f36632d1, 1024))) {
            w.b.InterfaceC0443b interfaceC0443b2 = this.T0;
            ArrayList<f> arrayList2 = this.P0;
            int size4 = arrayList2.size();
            int i36 = 0;
            while (true) {
                if (i36 >= size4) {
                    r.f fVar12 = this.V0;
                    if (fVar12 != null) {
                        fVar12.f35007z++;
                    }
                    ArrayList arrayList3 = null;
                    int i37 = 0;
                    ArrayList<k> arrayList4 = null;
                    ArrayList arrayList5 = null;
                    ArrayList<k> arrayList6 = null;
                    ArrayList arrayList7 = null;
                    ArrayList arrayList8 = null;
                    while (i37 < size4) {
                        int i38 = size2;
                        f fVar13 = arrayList2.get(i37);
                        int i39 = iMax8;
                        f.b bVar13 = bVar10;
                        int i40 = iMax7;
                        f.b bVar14 = bVar11;
                        if (!w.j.c(r(), y(), fVar13.r(), fVar13.y())) {
                            l0(fVar13, interfaceC0443b2, this.f36640l1, 0);
                        }
                        boolean z29 = fVar13 instanceof i;
                        if (z29) {
                            i iVar5 = (i) fVar13;
                            if (iVar5.U0 == 0) {
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                }
                                arrayList5.add(iVar5);
                            }
                            if (iVar5.U0 == 1) {
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(iVar5);
                            }
                        }
                        if (fVar13 instanceof k) {
                            if (fVar13 instanceof a) {
                                a aVar4 = (a) fVar13;
                                if (aVar4.e0() == 0) {
                                    if (arrayList4 == null) {
                                        arrayList4 = new ArrayList();
                                    }
                                    arrayList4.add(aVar4);
                                }
                                int iE0 = aVar4.e0();
                                obj = aVar4;
                                if (iE0 == 1) {
                                    if (arrayList6 == null) {
                                        arrayList6 = new ArrayList();
                                        obj = aVar4;
                                    }
                                }
                            } else {
                                k kVar = (k) fVar13;
                                if (arrayList4 == null) {
                                    arrayList4 = new ArrayList();
                                }
                                arrayList4.add(kVar);
                                obj = kVar;
                                if (arrayList6 == null) {
                                    arrayList6 = new ArrayList();
                                    obj = kVar;
                                }
                            }
                            arrayList6.add(obj);
                        }
                        if (fVar13.M.f36570f == null && fVar13.O.f36570f == null && !z29 && !(fVar13 instanceof a)) {
                            if (arrayList7 == null) {
                                arrayList7 = new ArrayList();
                            }
                            arrayList7.add(fVar13);
                        }
                        if (fVar13.N.f36570f == null && fVar13.P.f36570f == null && fVar13.Q.f36570f == null && !z29 && !(fVar13 instanceof a)) {
                            if (arrayList8 == null) {
                                arrayList8 = new ArrayList();
                            }
                            arrayList8.add(fVar13);
                        }
                        i37++;
                        iMax8 = i39;
                        size2 = i38;
                        bVar10 = bVar13;
                        iMax7 = i40;
                        bVar11 = bVar14;
                    }
                    i23 = iMax7;
                    i10 = size2;
                    i24 = iMax8;
                    bVar8 = bVar11;
                    bVar9 = bVar10;
                    ArrayList<p> arrayList9 = new ArrayList<>();
                    if (arrayList3 != null) {
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            w.j.a((i) it.next(), 0, arrayList9, null);
                        }
                    }
                    p pVar3 = null;
                    int i41 = 0;
                    if (arrayList4 != null) {
                        for (k kVar2 : arrayList4) {
                            p pVarA = w.j.a(kVar2, i41, arrayList9, pVar3);
                            kVar2.c0(arrayList9, i41, pVarA);
                            pVarA.b(arrayList9);
                            pVar3 = null;
                            i41 = 0;
                        }
                    }
                    HashSet<d> hashSet = n(d.b.LEFT).f36565a;
                    if (hashSet != null) {
                        Iterator<d> it2 = hashSet.iterator();
                        while (it2.hasNext()) {
                            w.j.a(it2.next().f36568d, 0, arrayList9, null);
                        }
                    }
                    HashSet<d> hashSet2 = n(d.b.RIGHT).f36565a;
                    if (hashSet2 != null) {
                        Iterator<d> it3 = hashSet2.iterator();
                        while (it3.hasNext()) {
                            w.j.a(it3.next().f36568d, 0, arrayList9, null);
                        }
                    }
                    HashSet<d> hashSet3 = n(d.b.CENTER).f36565a;
                    if (hashSet3 != null) {
                        Iterator<d> it4 = hashSet3.iterator();
                        while (it4.hasNext()) {
                            w.j.a(it4.next().f36568d, 0, arrayList9, null);
                        }
                    }
                    p pVar4 = null;
                    if (arrayList7 != null) {
                        Iterator it5 = arrayList7.iterator();
                        while (it5.hasNext()) {
                            w.j.a((f) it5.next(), 0, arrayList9, null);
                        }
                    }
                    if (arrayList5 != null) {
                        Iterator it6 = arrayList5.iterator();
                        while (it6.hasNext()) {
                            w.j.a((i) it6.next(), 1, arrayList9, null);
                        }
                    }
                    int i42 = 1;
                    if (arrayList6 != null) {
                        for (k kVar3 : arrayList6) {
                            p pVarA2 = w.j.a(kVar3, i42, arrayList9, pVar4);
                            kVar3.c0(arrayList9, i42, pVarA2);
                            pVarA2.b(arrayList9);
                            pVar4 = null;
                            i42 = 1;
                        }
                    }
                    HashSet<d> hashSet4 = n(d.b.TOP).f36565a;
                    if (hashSet4 != null) {
                        Iterator<d> it7 = hashSet4.iterator();
                        while (it7.hasNext()) {
                            w.j.a(it7.next().f36568d, 1, arrayList9, null);
                        }
                    }
                    HashSet<d> hashSet5 = n(d.b.BASELINE).f36565a;
                    if (hashSet5 != null) {
                        Iterator<d> it8 = hashSet5.iterator();
                        while (it8.hasNext()) {
                            w.j.a(it8.next().f36568d, 1, arrayList9, null);
                        }
                    }
                    HashSet<d> hashSet6 = n(d.b.BOTTOM).f36565a;
                    if (hashSet6 != null) {
                        Iterator<d> it9 = hashSet6.iterator();
                        while (it9.hasNext()) {
                            w.j.a(it9.next().f36568d, 1, arrayList9, null);
                        }
                    }
                    HashSet<d> hashSet7 = n(d.b.CENTER).f36565a;
                    if (hashSet7 != null) {
                        Iterator<d> it10 = hashSet7.iterator();
                        while (it10.hasNext()) {
                            w.j.a(it10.next().f36568d, 1, arrayList9, null);
                        }
                    }
                    if (arrayList8 != null) {
                        Iterator it11 = arrayList8.iterator();
                        while (it11.hasNext()) {
                            w.j.a((f) it11.next(), 1, arrayList9, null);
                        }
                    }
                    for (int i43 = 0; i43 < size4; i43++) {
                        f fVar14 = arrayList2.get(i43);
                        f.b[] bVarArr2 = fVar14.X;
                        f.b bVar15 = bVarArr2[0];
                        f.b bVar16 = f.b.MATCH_CONSTRAINT;
                        if (bVar15 == bVar16 && bVarArr2[1] == bVar16) {
                            p pVarB = w.j.b(arrayList9, fVar14.N0);
                            p pVarB2 = w.j.b(arrayList9, fVar14.O0);
                            if (pVarB != null && pVarB2 != null) {
                                pVarB.d(0, pVarB2);
                                pVarB2.f37067c = 2;
                                arrayList9.remove(pVarB);
                            }
                        }
                    }
                    if (arrayList9.size() > 1) {
                        if (r() == f.b.WRAP_CONTENT) {
                            pVar = null;
                            int i44 = 0;
                            for (p pVar5 : arrayList9) {
                                if (pVar5.f37067c != 1 && (iC2 = pVar5.c(this.W0, 0)) > i44) {
                                    pVar = pVar5;
                                    i44 = iC2;
                                }
                            }
                            if (pVar != null) {
                                V(f.b.FIXED);
                                Z(i44);
                            } else {
                                pVar = null;
                            }
                        } else {
                            pVar = null;
                        }
                        if (y() == f.b.WRAP_CONTENT) {
                            pVar2 = null;
                            int i45 = 0;
                            for (p pVar6 : arrayList9) {
                                if (pVar6.f37067c != 0 && (iC = pVar6.c(this.W0, 1)) > i45) {
                                    pVar2 = pVar6;
                                    i45 = iC;
                                }
                            }
                            if (pVar2 != null) {
                                Y(f.b.FIXED);
                                U(i45);
                            } else {
                                pVar2 = null;
                            }
                        } else {
                            pVar2 = null;
                        }
                        if (pVar != null || pVar2 != null) {
                            z23 = true;
                            break;
                        }
                    }
                } else {
                    f fVar15 = arrayList2.get(i36);
                    if (w.j.c(r(), y(), fVar15.r(), fVar15.y()) && !(fVar15 instanceof h)) {
                        i36++;
                    } else {
                        i23 = iMax7;
                        i10 = size2;
                        i24 = iMax8;
                        bVar8 = bVar11;
                        bVar9 = bVar10;
                    }
                }
                z23 = false;
                break;
            }
            if (z23) {
                f.b bVar17 = f.b.WRAP_CONTENT;
                bVar = bVar8;
                if (bVar == bVar17) {
                    i25 = i23;
                    if (i25 >= z() || i25 <= 0) {
                        iZ = z();
                    } else {
                        Z(i25);
                        this.f36633e1 = true;
                    }
                    bVar2 = bVar9;
                    if (bVar2 == bVar17) {
                        i26 = i24;
                        if (i26 < q() || i26 <= 0) {
                            iQ = q();
                        } else {
                            U(i26);
                            this.f36634f1 = true;
                        }
                        z10 = true;
                    } else {
                        i26 = i24;
                    }
                    iQ = i26;
                    z10 = true;
                } else {
                    i25 = i23;
                }
                iZ = i25;
                bVar2 = bVar9;
                if (bVar2 == bVar17) {
                    i26 = i24;
                    if (i26 < q()) {
                    }
                    iQ = q();
                    z10 = true;
                } else {
                    i26 = i24;
                }
                iQ = i26;
                z10 = true;
            } else {
                i11 = i24;
                bVar2 = bVar9;
                i12 = i23;
                bVar = bVar8;
            }
            if (!m0(64) || m0(128)) {
                z11 = true;
            } else {
                z11 = false;
            }
            dVar = this.W0;
            Objects.requireNonNull(dVar);
            dVar.f34973g = false;
            if (this.f36632d1 != 0 && z11) {
                dVar.f34973g = true;
            }
            ArrayList<f> arrayList10 = this.P0;
            bVarR = r();
            bVar3 = f.b.WRAP_CONTENT;
            if (bVarR != bVar3 || y() == bVar3) {
                i13 = 0;
                z12 = true;
            } else {
                i13 = 0;
                z12 = false;
            }
            this.Z0 = i13;
            this.f36629a1 = i13;
            i14 = i10;
            for (i15 = 0; i15 < i14; i15++) {
                fVar2 = this.P0.get(i15);
                if (fVar2 instanceof o) {
                    ((o) fVar2).c0();
                }
            }
            zM0 = m0(64);
            r10 = z10;
            i16 = 0;
            z13 = true;
            while (z13) {
                i17 = i16 + 1;
                try {
                    this.W0.u();
                    this.Z0 = 0;
                    this.f36629a1 = 0;
                    l(this.W0);
                    for (i22 = 0; i22 < i14; i22++) {
                        this.P0.get(i22).l(this.W0);
                    }
                    e0(this.W0);
                    try {
                        weakReference = this.f36635g1;
                        if (weakReference != null && weakReference.get() != null) {
                            this.W0.f(this.W0.l(this.f36635g1.get()), this.W0.l(this.N), 0, 5);
                            try {
                                this.f36635g1 = null;
                            } catch (Exception e10) {
                                e = e10;
                                z22 = true;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : " + e);
                                z14 = z22;
                            }
                        }
                        weakReference2 = this.f36637i1;
                        if (weakReference2 != null && weakReference2.get() != null) {
                            this.W0.f(this.W0.l(this.P), this.W0.l(this.f36637i1.get()), 0, 5);
                            this.f36637i1 = null;
                        }
                        weakReference3 = this.f36636h1;
                        if (weakReference3 != null && weakReference3.get() != null) {
                            this.W0.f(this.W0.l(this.f36636h1.get()), this.W0.l(this.M), 0, 5);
                            this.f36636h1 = null;
                        }
                        weakReference4 = this.f36638j1;
                        if (weakReference4 == null && weakReference4.get() != null) {
                            this.W0.f(this.W0.l(this.O), this.W0.l(this.f36638j1.get()), 0, 5);
                            this.f36638j1 = null;
                        }
                        this.W0.q();
                        z14 = true;
                    } catch (Exception e11) {
                        e = e11;
                    }
                } catch (Exception e12) {
                    e = e12;
                    z22 = z13;
                }
                if (z14) {
                    dVar2 = this.W0;
                    l.f36654a[2] = false;
                    zM1 = m0(64);
                    b0(dVar2, zM1);
                    size = this.P0.size();
                    i21 = 0;
                    z20 = false;
                    while (i21 < size) {
                        fVar = this.P0.get(i21);
                        fVar.b0(dVar2, zM1);
                        r.d dVar5 = dVar2;
                        boolean z30 = zM1;
                        if (fVar.f36591i == -1 || fVar.f36593j != -1) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        if (z21) {
                            z20 = true;
                        }
                        i21++;
                        dVar2 = dVar5;
                        zM1 = z30;
                        z20 = z20;
                    }
                    z15 = z20;
                } else {
                    b0(this.W0, zM0);
                    for (i18 = 0; i18 < i14; i18++) {
                        this.P0.get(i18).b0(this.W0, zM0);
                    }
                    z15 = false;
                }
                if (z12 && i17 < 8 && l.f36654a[2]) {
                    iMax3 = 0;
                    iMax4 = 0;
                    for (i20 = 0; i20 < i14; i20++) {
                        f fVar16 = this.P0.get(i20);
                        iMax4 = Math.max(iMax4, fVar16.z() + fVar16.f36582d0);
                        iMax3 = Math.max(iMax3, fVar16.q() + fVar16.f36584e0);
                    }
                    iMax5 = Math.max(this.f36596k0, iMax4);
                    iMax6 = Math.max(this.f36598l0, iMax3);
                    bVar6 = f.b.WRAP_CONTENT;
                    r10 = r10;
                    z15 = z15;
                    if (bVar == bVar6 && z() < iMax5) {
                        r10 = r10;
                        z15 = z15;
                        Z(iMax5);
                        this.X[0] = bVar6;
                        r10 = 1;
                        z15 = true;
                    }
                    if (bVar2 == bVar6 && q() < iMax6) {
                        U(iMax6);
                        this.X[1] = bVar6;
                        r10 = 1;
                        z15 = true;
                    }
                }
                iMax = Math.max(this.f36596k0, z());
                r11 = r10;
                z16 = z15;
                if (iMax > z()) {
                    Z(iMax);
                    this.X[0] = f.b.FIXED;
                    r11 = 1;
                    z16 = true;
                }
                iMax2 = Math.max(this.f36598l0, q());
                if (iMax2 > q()) {
                    U(iMax2);
                    r12 = 1;
                    this.X[1] = f.b.FIXED;
                    r13 = 1;
                    z17 = true;
                } else {
                    r12 = 1;
                }
                if (r13 == 0) {
                    r13 = r11;
                    z17 = z16;
                    bVar4 = this.X[0];
                    bVar5 = f.b.WRAP_CONTENT;
                    if (bVar4 == bVar5 && iZ > 0) {
                        r13 = r13;
                        z17 = z17;
                        if (z() > iZ) {
                            this.f36633e1 = r12;
                            this.X[0] = f.b.FIXED;
                            Z(iZ);
                            ?? r15 = r12;
                            z17 = r15 == true ? 1 : 0;
                            r13 = r15;
                        }
                    }
                    r13 = r13;
                    r13 = r13;
                    z17 = z17;
                    z17 = z17;
                    if (this.X[r12] == bVar5 || iQ <= 0 || q() <= iQ) {
                        r13 = r11;
                        z17 = z16;
                        i19 = 8;
                        r14 = r13;
                        z18 = z17;
                    } else {
                        this.f36634f1 = r12;
                        this.X[r12] = f.b.FIXED;
                        U(iQ);
                        i19 = 8;
                        r14 = 1;
                        z18 = true;
                    }
                } else {
                    r13 = r11;
                    z17 = z16;
                    i19 = 8;
                    r14 = r13;
                    z18 = z17;
                }
                if (i17 > i19) {
                    z19 = false;
                } else {
                    z19 = z18;
                }
                i16 = i17;
                r10 = r14;
                z13 = z19;
            }
            this.P0 = arrayList10;
            if (r10 != 0) {
                f.b[] bVarArr3 = this.X;
                bVarArr3[0] = bVar;
                bVarArr3[1] = bVar2;
            }
            O(this.W0.f34978l);
        }
        i10 = size2;
        i11 = iMax8;
        bVar = bVar11;
        bVar2 = bVar10;
        i12 = iMax7;
        iZ = i12;
        iQ = i11;
        z10 = false;
        if (m0(64)) {
            z11 = true;
        } else {
            z11 = true;
        }
        dVar = this.W0;
        Objects.requireNonNull(dVar);
        dVar.f34973g = false;
        if (this.f36632d1 != 0) {
            dVar.f34973g = true;
        }
        ArrayList<f> arrayList11 = this.P0;
        bVarR = r();
        bVar3 = f.b.WRAP_CONTENT;
        if (bVarR != bVar3) {
            i13 = 0;
            z12 = true;
        } else {
            i13 = 0;
            z12 = true;
        }
        this.Z0 = i13;
        this.f36629a1 = i13;
        i14 = i10;
        while (i15 < i14) {
            fVar2 = this.P0.get(i15);
            if (fVar2 instanceof o) {
                ((o) fVar2).c0();
            }
        }
        zM0 = m0(64);
        r10 = z10;
        i16 = 0;
        z13 = true;
        while (z13) {
            i17 = i16 + 1;
            this.W0.u();
            this.Z0 = 0;
            this.f36629a1 = 0;
            l(this.W0);
            while (i22 < i14) {
                this.P0.get(i22).l(this.W0);
            }
            e0(this.W0);
            weakReference = this.f36635g1;
            if (weakReference != null) {
                this.W0.f(this.W0.l(this.f36635g1.get()), this.W0.l(this.N), 0, 5);
                this.f36635g1 = null;
            }
            weakReference2 = this.f36637i1;
            if (weakReference2 != null) {
                this.W0.f(this.W0.l(this.P), this.W0.l(this.f36637i1.get()), 0, 5);
                this.f36637i1 = null;
            }
            weakReference3 = this.f36636h1;
            if (weakReference3 != null) {
                this.W0.f(this.W0.l(this.f36636h1.get()), this.W0.l(this.M), 0, 5);
                this.f36636h1 = null;
            }
            weakReference4 = this.f36638j1;
            if (weakReference4 == null) {
            }
            this.W0.q();
            z14 = true;
            if (z14) {
                dVar2 = this.W0;
                l.f36654a[2] = false;
                zM1 = m0(64);
                b0(dVar2, zM1);
                size = this.P0.size();
                i21 = 0;
                z20 = false;
                while (i21 < size) {
                    fVar = this.P0.get(i21);
                    fVar.b0(dVar2, zM1);
                    r.d dVar6 = dVar2;
                    boolean z31 = zM1;
                    if (fVar.f36591i == -1) {
                        z21 = true;
                    } else {
                        z21 = true;
                    }
                    if (z21) {
                        z20 = true;
                    }
                    i21++;
                    dVar2 = dVar6;
                    zM1 = z31;
                    z20 = z20;
                }
                z15 = z20;
            } else {
                b0(this.W0, zM0);
                while (i18 < i14) {
                    this.P0.get(i18).b0(this.W0, zM0);
                }
                z15 = false;
            }
            if (z12) {
                iMax3 = 0;
                iMax4 = 0;
                while (i20 < i14) {
                    f fVar17 = this.P0.get(i20);
                    iMax4 = Math.max(iMax4, fVar17.z() + fVar17.f36582d0);
                    iMax3 = Math.max(iMax3, fVar17.q() + fVar17.f36584e0);
                }
                iMax5 = Math.max(this.f36596k0, iMax4);
                iMax6 = Math.max(this.f36598l0, iMax3);
                bVar6 = f.b.WRAP_CONTENT;
                r10 = r10;
                z15 = z15;
                if (bVar == bVar6) {
                    r10 = r10;
                    z15 = z15;
                    Z(iMax5);
                    this.X[0] = bVar6;
                    r10 = 1;
                    z15 = true;
                }
                if (bVar2 == bVar6) {
                    U(iMax6);
                    this.X[1] = bVar6;
                    r10 = 1;
                    z15 = true;
                }
            }
            iMax = Math.max(this.f36596k0, z());
            r11 = r10;
            z16 = z15;
            if (iMax > z()) {
                Z(iMax);
                this.X[0] = f.b.FIXED;
                r11 = 1;
                z16 = true;
            }
            iMax2 = Math.max(this.f36598l0, q());
            if (iMax2 > q()) {
                U(iMax2);
                r12 = 1;
                this.X[1] = f.b.FIXED;
                r13 = 1;
                z17 = true;
            } else {
                r12 = 1;
            }
            if (r13 == 0) {
                r13 = r11;
                z17 = z16;
                bVar4 = this.X[0];
                bVar5 = f.b.WRAP_CONTENT;
                if (bVar4 == bVar5) {
                    r13 = r13;
                    z17 = z17;
                    if (z() > iZ) {
                        this.f36633e1 = r12;
                        this.X[0] = f.b.FIXED;
                        Z(iZ);
                        ?? r16 = r12;
                        z17 = r16 == true ? 1 : 0;
                        r13 = r16;
                    }
                }
                r13 = r13;
                r13 = r13;
                z17 = z17;
                z17 = z17;
                if (this.X[r12] == bVar5) {
                    r13 = r11;
                    z17 = z16;
                    i19 = 8;
                    r14 = r13;
                    z18 = z17;
                } else {
                    r13 = r11;
                    z17 = z16;
                    i19 = 8;
                    r14 = r13;
                    z18 = z17;
                }
            } else {
                r13 = r11;
                z17 = z16;
                i19 = 8;
                r14 = r13;
                z18 = z17;
            }
            if (i17 > i19) {
                z19 = false;
            } else {
                z19 = z18;
            }
            i16 = i17;
            r10 = r14;
            z13 = z19;
        }
        this.P0 = arrayList11;
        if (r10 != 0) {
            f.b[] bVarArr4 = this.X;
            bVarArr4[0] = bVar;
            bVarArr4[1] = bVar2;
        }
        O(this.W0.f34978l);
    }

    public void d0(f fVar, int i10) {
        if (i10 == 0) {
            int i11 = this.Z0 + 1;
            c[] cVarArr = this.f36631c1;
            if (i11 >= cVarArr.length) {
                this.f36631c1 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
            }
            this.f36631c1[this.Z0] = new c(fVar, 0, this.U0);
            this.Z0++;
            return;
        }
        if (i10 == 1) {
            int i12 = this.f36629a1 + 1;
            c[] cVarArr2 = this.f36630b1;
            if (i12 >= cVarArr2.length) {
                this.f36630b1 = (c[]) Arrays.copyOf(cVarArr2, cVarArr2.length * 2);
            }
            this.f36630b1[this.f36629a1] = new c(fVar, 1, this.U0);
            this.f36629a1++;
        }
    }

    public boolean e0(r.d dVar) {
        boolean z10;
        boolean zM0 = m0(64);
        g(dVar, zM0);
        int size = this.P0.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            f fVar = this.P0.get(i10);
            boolean[] zArr = fVar.W;
            zArr[0] = false;
            zArr[1] = false;
            if (fVar instanceof a) {
                z11 = true;
            }
        }
        if (z11) {
            for (int i11 = 0; i11 < size; i11++) {
                f fVar2 = this.P0.get(i11);
                if (fVar2 instanceof a) {
                    a aVar = (a) fVar2;
                    for (int i12 = 0; i12 < aVar.Q0; i12++) {
                        f fVar3 = aVar.P0[i12];
                        if (aVar.S0 || fVar3.h()) {
                            int i13 = aVar.R0;
                            if (i13 == 0 || i13 == 1) {
                                fVar3.W[0] = true;
                            } else if (i13 == 2 || i13 == 3) {
                                fVar3.W[1] = true;
                            }
                        }
                    }
                }
            }
        }
        this.f36639k1.clear();
        for (int i14 = 0; i14 < size; i14++) {
            f fVar4 = this.P0.get(i14);
            if (fVar4.f()) {
                if (fVar4 instanceof n) {
                    this.f36639k1.add(fVar4);
                } else {
                    fVar4.g(dVar, zM0);
                }
            }
        }
        while (this.f36639k1.size() > 0) {
            int size2 = this.f36639k1.size();
            Iterator<f> it = this.f36639k1.iterator();
            while (it.hasNext()) {
                n nVar = (n) it.next();
                HashSet<f> hashSet = this.f36639k1;
                int i15 = 0;
                while (true) {
                    if (i15 >= nVar.Q0) {
                        z10 = false;
                        break;
                    }
                    if (hashSet.contains(nVar.P0[i15])) {
                        z10 = true;
                        break;
                    }
                    i15++;
                }
                if (z10) {
                    nVar.g(dVar, zM0);
                    this.f36639k1.remove(nVar);
                    break;
                }
            }
            if (size2 == this.f36639k1.size()) {
                Iterator<f> it2 = this.f36639k1.iterator();
                while (it2.hasNext()) {
                    it2.next().g(dVar, zM0);
                }
                this.f36639k1.clear();
            }
        }
        if (r.d.f34963p) {
            HashSet<f> hashSet2 = new HashSet<>();
            for (int i16 = 0; i16 < size; i16++) {
                f fVar5 = this.P0.get(i16);
                if (!fVar5.f()) {
                    hashSet2.add(fVar5);
                }
            }
            e(this, dVar, hashSet2, r() == f.b.WRAP_CONTENT ? 0 : 1, false);
            for (f fVar6 : hashSet2) {
                l.a(this, dVar, fVar6);
                fVar6.g(dVar, zM0);
            }
        } else {
            for (int i17 = 0; i17 < size; i17++) {
                f fVar7 = this.P0.get(i17);
                if (fVar7 instanceof g) {
                    f.b[] bVarArr = fVar7.X;
                    f.b bVar = bVarArr[0];
                    f.b bVar2 = bVarArr[1];
                    f.b bVar3 = f.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        fVar7.V(f.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        fVar7.Y(f.b.FIXED);
                    }
                    fVar7.g(dVar, zM0);
                    if (bVar == bVar3) {
                        fVar7.V(bVar);
                    }
                    if (bVar2 == bVar3) {
                        fVar7.Y(bVar2);
                    }
                } else {
                    l.a(this, dVar, fVar7);
                    if (!fVar7.f()) {
                        fVar7.g(dVar, zM0);
                    }
                }
            }
        }
        if (this.Z0 > 0) {
            b.a(this, dVar, null, 0);
        }
        if (this.f36629a1 > 0) {
            b.a(this, dVar, null, 1);
        }
        return true;
    }

    public void f0(d dVar) {
        WeakReference<d> weakReference = this.f36638j1;
        if (weakReference == null || weakReference.get() == null || dVar.d() > this.f36638j1.get().d()) {
            this.f36638j1 = new WeakReference<>(dVar);
        }
    }

    public void g0(d dVar) {
        WeakReference<d> weakReference = this.f36636h1;
        if (weakReference == null || weakReference.get() == null || dVar.d() > this.f36636h1.get().d()) {
            this.f36636h1 = new WeakReference<>(dVar);
        }
    }

    public void h0(d dVar) {
        WeakReference<d> weakReference = this.f36637i1;
        if (weakReference == null || weakReference.get() == null || dVar.d() > this.f36637i1.get().d()) {
            this.f36637i1 = new WeakReference<>(dVar);
        }
    }

    public void i0(d dVar) {
        WeakReference<d> weakReference = this.f36635g1;
        if (weakReference == null || weakReference.get() == null || dVar.d() > this.f36635g1.get().d()) {
            this.f36635g1 = new WeakReference<>(dVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c2  */
    public boolean j0(boolean z10, int i10) {
        boolean z11;
        f.b bVar;
        w.h hVar;
        int iQ;
        w.f fVar = this.R0;
        boolean z12 = true;
        boolean z13 = z10 & true;
        f.b bVarP = fVar.f37032a.p(0);
        f.b bVarP2 = fVar.f37032a.p(1);
        int iA = fVar.f37032a.A();
        int iB = fVar.f37032a.B();
        if (z13 && (bVarP == (bVar = f.b.WRAP_CONTENT) || bVarP2 == bVar)) {
            for (q qVar : fVar.f37036e) {
                if (qVar.f37075f == i10 && !qVar.k()) {
                    z13 = false;
                    break;
                }
            }
            if (i10 == 0) {
                if (z13 && bVarP == f.b.WRAP_CONTENT) {
                    fVar.f37032a.V(f.b.FIXED);
                    g gVar = fVar.f37032a;
                    gVar.Z(fVar.d(gVar, 0));
                    g gVar2 = fVar.f37032a;
                    hVar = gVar2.f36581d.f37074e;
                    iQ = gVar2.z();
                    hVar.c(iQ);
                }
            } else if (z13 && bVarP2 == f.b.WRAP_CONTENT) {
                fVar.f37032a.Y(f.b.FIXED);
                g gVar3 = fVar.f37032a;
                gVar3.U(fVar.d(gVar3, 1));
                g gVar4 = fVar.f37032a;
                hVar = gVar4.f36583e.f37074e;
                iQ = gVar4.q();
                hVar.c(iQ);
            }
        }
        g gVar5 = fVar.f37032a;
        if (i10 == 0) {
            f.b[] bVarArr = gVar5.X;
            if (bVarArr[0] == f.b.FIXED || bVarArr[0] == f.b.MATCH_PARENT) {
                int iZ = gVar5.z() + iA;
                fVar.f37032a.f36581d.f37078i.c(iZ);
                fVar.f37032a.f36581d.f37074e.c(iZ - iA);
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            f.b[] bVarArr2 = gVar5.X;
            if (bVarArr2[1] == f.b.FIXED || bVarArr2[1] == f.b.MATCH_PARENT) {
                int iQ2 = gVar5.q() + iB;
                fVar.f37032a.f36583e.f37078i.c(iQ2);
                fVar.f37032a.f36583e.f37074e.c(iQ2 - iB);
                z11 = true;
            } else {
                z11 = false;
            }
        }
        fVar.g();
        for (q qVar2 : fVar.f37036e) {
            if (qVar2.f37075f == i10 && (qVar2.f37071b != fVar.f37032a || qVar2.f37076g)) {
                qVar2.e();
            }
        }
        for (q qVar3 : fVar.f37036e) {
            if (qVar3.f37075f == i10 && (z11 || qVar3.f37071b != fVar.f37032a)) {
                if (!qVar3.f37077h.f37049j || !qVar3.f37078i.f37049j || (!(qVar3 instanceof w.c) && !qVar3.f37074e.f37049j)) {
                    z12 = false;
                    break;
                }
            }
        }
        fVar.f37032a.V(bVarP);
        fVar.f37032a.Y(bVarP2);
        return z12;
    }

    public void k0() {
        this.R0.f37033b = true;
    }

    public boolean m0(int i10) {
        return (this.f36632d1 & i10) == i10;
    }

    public void n0(w.b.InterfaceC0443b interfaceC0443b) {
        this.T0 = interfaceC0443b;
        this.R0.f37037f = interfaceC0443b;
    }

    public void o0(int i10) {
        this.f36632d1 = i10;
        r.d.f34963p = m0(512);
    }

    @Override // v.f
    public void v(StringBuilder sb2) {
        sb2.append(this.f36595k + ":{\n");
        sb2.append("  actualWidth:" + this.Z);
        sb2.append("\n");
        sb2.append("  actualHeight:" + this.f36576a0);
        sb2.append("\n");
        Iterator<f> it = this.P0.iterator();
        while (it.hasNext()) {
            it.next().v(sb2);
            sb2.append(",\n");
        }
        sb2.append("}");
    }
}
