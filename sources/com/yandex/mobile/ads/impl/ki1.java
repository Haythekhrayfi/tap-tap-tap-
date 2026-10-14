package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes3.dex */
final class ki1 extends s41 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private a f22423n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f22424o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f22425p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private mi1.c f22426q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private mi1.a f22427r;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final mi1.c f22428a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final mi1.a f22429b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f22430c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final mi1.b[] f22431d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f22432e;

        public a(mi1.c cVar, mi1.a aVar, byte[] bArr, mi1.b[] bVarArr, int i10) {
            this.f22428a = cVar;
            this.f22429b = aVar;
            this.f22430c = bArr;
            this.f22431d = bVarArr;
            this.f22432e = i10;
        }
    }

    @Override // com.yandex.mobile.ads.impl.s41
    public final long a(mp0 mp0Var) {
        if ((mp0Var.c()[0] & 1) == 1) {
            return -1L;
        }
        byte b10 = mp0Var.c()[0];
        a aVar = (a) pa.b(this.f22423n);
        int i10 = !aVar.f22431d[(b10 >> 1) & (255 >>> (8 - aVar.f22432e))].f23091a ? aVar.f22428a.f23096e : aVar.f22428a.f23097f;
        long j10 = this.f22425p ? (this.f22424o + i10) / 4 : 0;
        if (mp0Var.b() < mp0Var.e() + 4) {
            byte[] bArrCopyOf = Arrays.copyOf(mp0Var.c(), mp0Var.e() + 4);
            mp0Var.a(bArrCopyOf.length, bArrCopyOf);
        } else {
            mp0Var.d(mp0Var.e() + 4);
        }
        byte[] bArrC = mp0Var.c();
        bArrC[mp0Var.e() - 4] = (byte) (j10 & 255);
        bArrC[mp0Var.e() - 3] = (byte) ((j10 >>> 8) & 255);
        bArrC[mp0Var.e() - 2] = (byte) ((j10 >>> 16) & 255);
        bArrC[mp0Var.e() - 1] = (byte) ((j10 >>> 24) & 255);
        this.f22425p = true;
        this.f22424o = i10;
        return j10;
    }

    @Override // com.yandex.mobile.ads.impl.s41
    public final void a(boolean z10) {
        super.a(z10);
        if (z10) {
            this.f22423n = null;
            this.f22426q = null;
            this.f22427r = null;
        }
        this.f22424o = 0;
        this.f22425p = false;
    }

    /* JADX WARN: Code duplicated, block: B:166:0x03a1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:168:0x03a3  */
    @Override // com.yandex.mobile.ads.impl.s41
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean a(mp0 mp0Var, long j10, s41.a aVar) throws IOException {
        a aVar2;
        ji1 ji1Var;
        ji1 ji1Var2;
        boolean z10;
        if (this.f22423n != null) {
            Objects.requireNonNull(aVar.f24970a);
            return false;
        }
        mi1.c cVar = this.f22426q;
        boolean z11 = true;
        if (cVar != null) {
            mi1.a aVar3 = this.f22427r;
            if (aVar3 == null) {
                this.f22427r = mi1.a(mp0Var, true, true);
            } else {
                byte[] bArr = new byte[mp0Var.e()];
                System.arraycopy(mp0Var.c(), 0, bArr, 0, mp0Var.e());
                int i10 = cVar.f23092a;
                int i11 = 5;
                mi1.a(5, mp0Var, false);
                int iT = mp0Var.t() + 1;
                ji1 ji1Var3 = new ji1(mp0Var.c());
                ji1Var3.b(mp0Var.d() * 8);
                int i12 = 0;
                while (i12 < iT) {
                    if (ji1Var3.a(24) != 5653314) {
                        StringBuilder sbA = v60.a("expected code book to start with [0x56, 0x43, 0x42] at ");
                        sbA.append(ji1Var3.a());
                        throw qp0.a(sbA.toString(), (Exception) null);
                    }
                    int iA = ji1Var3.a(16);
                    int iA2 = ji1Var3.a(24);
                    long[] jArr = new long[iA2];
                    long jFloor = 0;
                    if (ji1Var3.b()) {
                        int i13 = i11;
                        ji1Var = ji1Var3;
                        int iA3 = ji1Var.a(i13) + 1;
                        int i14 = 0;
                        while (i14 < iA2) {
                            int i15 = 0;
                            for (int i16 = iA2 - i14; i16 > 0; i16 >>>= 1) {
                                i15++;
                            }
                            int iA4 = ji1Var.a(i15);
                            int i17 = 0;
                            while (i17 < iA4 && i14 < iA2) {
                                jArr[i14] = iA3;
                                i14++;
                                i17++;
                                aVar3 = aVar3;
                                bArr = bArr;
                            }
                            iA3++;
                            aVar3 = aVar3;
                            bArr = bArr;
                        }
                    } else {
                        boolean zB = ji1Var3.b();
                        int i18 = 0;
                        while (i18 < iA2) {
                            if (zB) {
                                if (ji1Var3.b()) {
                                    jArr[i18] = ji1Var3.a(i11) + 1;
                                } else {
                                    jArr[i18] = 0;
                                }
                                ji1Var2 = ji1Var3;
                                z10 = true;
                            } else {
                                int i19 = i11;
                                ji1Var2 = ji1Var3;
                                z10 = true;
                                jArr[i18] = ji1Var2.a(i19) + 1;
                            }
                            i18++;
                            ji1Var3 = ji1Var2;
                            i11 = 5;
                        }
                        ji1Var = ji1Var3;
                    }
                    mi1.a aVar4 = aVar3;
                    byte[] bArr2 = bArr;
                    int iA5 = ji1Var.a(4);
                    if (iA5 > 2) {
                        throw qp0.a("lookup type greater than 2 not decodable: " + iA5, (Exception) null);
                    }
                    if (iA5 == 1 || iA5 == 2) {
                        ji1Var.b(32);
                        ji1Var.b(32);
                        int iA6 = ji1Var.a(4) + 1;
                        ji1Var.b(1);
                        if (iA5 != 1) {
                            jFloor = ((long) iA2) * ((long) iA);
                        } else if (iA != 0) {
                            jFloor = (long) Math.floor(Math.pow(iA2, 1.0d / ((double) iA)));
                        }
                        ji1Var.b((int) (((long) iA6) * jFloor));
                    }
                    i12++;
                    ji1Var3 = ji1Var;
                    aVar3 = aVar4;
                    bArr = bArr2;
                    i11 = 5;
                    z11 = true;
                }
                mi1.a aVar5 = aVar3;
                byte[] bArr3 = bArr;
                ji1 ji1Var4 = ji1Var3;
                int i20 = 6;
                int iA7 = ji1Var4.a(6) + 1;
                for (int i21 = 0; i21 < iA7; i21++) {
                    if (ji1Var4.a(16) != 0) {
                        throw qp0.a("placeholder of time domain transforms not zeroed out", (Exception) null);
                    }
                }
                int i22 = 1;
                int iA8 = ji1Var4.a(6) + 1;
                int i23 = 0;
                while (true) {
                    int i24 = 3;
                    if (i23 >= iA8) {
                        int i25 = 1;
                        int iA9 = ji1Var4.a(i20) + 1;
                        int i26 = 0;
                        while (i26 < iA9) {
                            if (ji1Var4.a(16) > 2) {
                                throw qp0.a("residueType greater than 2 is not decodable", (Exception) null);
                            }
                            ji1Var4.b(24);
                            ji1Var4.b(24);
                            ji1Var4.b(24);
                            int iA10 = ji1Var4.a(i20) + i25;
                            int i27 = 8;
                            ji1Var4.b(8);
                            int[] iArr = new int[iA10];
                            for (int i28 = 0; i28 < iA10; i28++) {
                                iArr[i28] = ((ji1Var4.b() ? ji1Var4.a(5) : 0) * 8) + ji1Var4.a(3);
                            }
                            int i29 = 0;
                            while (i29 < iA10) {
                                int i30 = 0;
                                while (i30 < i27) {
                                    if ((iArr[i29] & (1 << i30)) != 0) {
                                        ji1Var4.b(i27);
                                    }
                                    i30++;
                                    i27 = 8;
                                }
                                i29++;
                                i27 = 8;
                            }
                            i26++;
                            i20 = 6;
                            i25 = 1;
                        }
                        int iA11 = ji1Var4.a(i20) + 1;
                        for (int i31 = 0; i31 < iA11; i31++) {
                            int iA12 = ji1Var4.a(16);
                            if (iA12 != 0) {
                                p90.b("VorbisUtil", "mapping type other than 0 not supported: " + iA12);
                            } else {
                                int iA13 = ji1Var4.b() ? ji1Var4.a(4) + 1 : 1;
                                if (ji1Var4.b()) {
                                    int iA14 = ji1Var4.a(8) + 1;
                                    for (int i32 = 0; i32 < iA14; i32++) {
                                        int i33 = i10 - 1;
                                        int i34 = 0;
                                        for (int i35 = i33; i35 > 0; i35 >>>= 1) {
                                            i34++;
                                        }
                                        ji1Var4.b(i34);
                                        int i36 = 0;
                                        while (i33 > 0) {
                                            i36++;
                                            i33 >>>= 1;
                                        }
                                        ji1Var4.b(i36);
                                    }
                                }
                                if (ji1Var4.a(2) != 0) {
                                    throw qp0.a("to reserved bits must be zero after mapping coupling steps", (Exception) null);
                                }
                                if (iA13 > 1) {
                                    for (int i37 = 0; i37 < i10; i37++) {
                                        ji1Var4.b(4);
                                    }
                                }
                                for (int i38 = 0; i38 < iA13; i38++) {
                                    ji1Var4.b(8);
                                    ji1Var4.b(8);
                                    ji1Var4.b(8);
                                }
                            }
                        }
                        int iA15 = ji1Var4.a(6) + 1;
                        mi1.b[] bVarArr = new mi1.b[iA15];
                        for (int i39 = 0; i39 < iA15; i39++) {
                            boolean zB2 = ji1Var4.b();
                            ji1Var4.a(16);
                            ji1Var4.a(16);
                            ji1Var4.a(8);
                            bVarArr[i39] = new mi1.b(zB2);
                        }
                        if (!ji1Var4.b()) {
                            throw qp0.a("framing bit after modes not set as expected", (Exception) null);
                        }
                        int i40 = 0;
                        for (int i41 = iA15 - 1; i41 > 0; i41 >>>= 1) {
                            i40++;
                        }
                        aVar2 = new a(cVar, aVar5, bArr3, bVarArr, i40);
                        break;
                    }
                    int iA16 = ji1Var4.a(16);
                    if (iA16 == 0) {
                        int i42 = 8;
                        ji1Var4.b(8);
                        ji1Var4.b(16);
                        ji1Var4.b(16);
                        ji1Var4.b(6);
                        ji1Var4.b(8);
                        int iA17 = ji1Var4.a(4) + 1;
                        int i43 = 0;
                        while (i43 < iA17) {
                            ji1Var4.b(i42);
                            i43++;
                            i42 = 8;
                        }
                    } else {
                        if (iA16 != i22) {
                            throw qp0.a("floor type greater than 1 not decodable: " + iA16, (Exception) null);
                        }
                        int iA18 = ji1Var4.a(5);
                        int i44 = -1;
                        int[] iArr2 = new int[iA18];
                        for (int i45 = 0; i45 < iA18; i45++) {
                            int iA19 = ji1Var4.a(4);
                            iArr2[i45] = iA19;
                            if (iA19 > i44) {
                                i44 = iA19;
                            }
                        }
                        int i46 = i44 + 1;
                        int[] iArr3 = new int[i46];
                        int i47 = 0;
                        while (i47 < i46) {
                            iArr3[i47] = ji1Var4.a(i24) + 1;
                            int iA20 = ji1Var4.a(2);
                            int i48 = 8;
                            if (iA20 > 0) {
                                ji1Var4.b(8);
                            }
                            int i49 = 0;
                            for (int i50 = 1; i49 < (i50 << iA20); i50 = 1) {
                                ji1Var4.b(i48);
                                i49++;
                                i48 = 8;
                            }
                            i47++;
                            i24 = 3;
                        }
                        ji1Var4.b(2);
                        int iA21 = ji1Var4.a(4);
                        int i51 = 0;
                        int i52 = 0;
                        for (int i53 = 0; i53 < iA18; i53++) {
                            i51 += iArr3[iArr2[i53]];
                            while (i52 < i51) {
                                ji1Var4.b(iA21);
                                i52++;
                            }
                        }
                    }
                    i23++;
                    i20 = 6;
                    i22 = 1;
                }
            }
            this.f22423n = aVar2;
            if (aVar2 == null) {
                return true;
            }
            mi1.c cVar2 = aVar2.f22428a;
            ArrayList arrayList = new ArrayList();
            arrayList.add(cVar2.f23098g);
            arrayList.add(aVar2.f22430c);
            aVar.f24970a = new yv.a().f("audio/vorbis").b(cVar2.f23095d).k(cVar2.f23094c).c(cVar2.f23092a).n(cVar2.f23093b).a(arrayList).a(mi1.a(com.yandex.mobile.ads.embedded.guava.collect.p.b(aVar2.f22429b.f23090a))).a();
            return true;
        }
        this.f22426q = mi1.a(mp0Var);
        aVar2 = null;
        this.f22423n = aVar2;
        if (aVar2 == null) {
            return true;
        }
        mi1.c cVar3 = aVar2.f22428a;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(cVar3.f23098g);
        arrayList2.add(aVar2.f22430c);
        aVar.f24970a = new yv.a().f("audio/vorbis").b(cVar3.f23095d).k(cVar3.f23094c).c(cVar3.f23092a).n(cVar3.f23093b).a(arrayList2).a(mi1.a(com.yandex.mobile.ads.embedded.guava.collect.p.b(aVar2.f22429b.f23090a))).a();
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.s41
    public final void c(long j10) {
        super.c(j10);
        this.f22425p = j10 != 0;
        mi1.c cVar = this.f22426q;
        this.f22424o = cVar != null ? cVar.f23096e : 0;
    }
}
