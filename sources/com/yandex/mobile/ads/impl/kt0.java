package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes3.dex */
final class kt0 {
    /* JADX WARN: Code duplicated, block: B:25:0x0055 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0056  */
    /* JADX WARN: Code duplicated, block: B:28:0x005c  */
    /* JADX WARN: Code duplicated, block: B:30:0x005f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    /* JADX WARN: Code duplicated, block: B:33:0x0072  */
    public static jt0 a(int i10, byte[] bArr) {
        ArrayList<jt0.a> arrayListA;
        int size;
        mp0 mp0Var = new mp0(bArr);
        try {
            mp0Var.f(4);
            int iH = mp0Var.h();
            mp0Var.e(0);
            if (iH == 1886547818) {
                mp0Var.f(8);
                int iD = mp0Var.d();
                int iE = mp0Var.e();
                while (true) {
                    if (iD < iE) {
                        int iH2 = mp0Var.h() + iD;
                        if (iH2 > iD && iH2 <= iE) {
                            int iH3 = mp0Var.h();
                            if (iH3 != 2037673328 && iH3 != 1836279920) {
                                mp0Var.e(iH2);
                                iD = iH2;
                            }
                            mp0Var.d(iH2);
                        }
                        if (arrayListA == null) {
                            return null;
                        }
                        size = arrayListA.size();
                        if (size == 1) {
                            jt0.a aVar = arrayListA.get(0);
                            return new jt0(aVar, aVar, i10);
                        }
                        if (size != 2) {
                            return null;
                        }
                        return new jt0(arrayListA.get(0), arrayListA.get(1), i10);
                    }
                    arrayListA = null;
                    if (arrayListA == null) {
                        return null;
                    }
                    size = arrayListA.size();
                    if (size == 1) {
                        jt0.a aVar2 = arrayListA.get(0);
                        return new jt0(aVar2, aVar2, i10);
                    }
                    if (size != 2) {
                        return null;
                    }
                    return new jt0(arrayListA.get(0), arrayListA.get(1), i10);
                }
            }
            arrayListA = a(mp0Var);
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        if (arrayListA == null) {
            return null;
        }
        size = arrayListA.size();
        if (size == 1) {
            jt0.a aVar3 = arrayListA.get(0);
            return new jt0(aVar3, aVar3, i10);
        }
        if (size != 2) {
            return null;
        }
        return new jt0(arrayListA.get(0), arrayListA.get(1), i10);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0065  */
    private static ArrayList<jt0.a> a(mp0 mp0Var) {
        ArrayList<jt0.a> arrayList;
        boolean z10;
        int i10;
        ArrayList<jt0.a> arrayList2;
        jt0.a aVar;
        mp0 mp0Var2 = mp0Var;
        if (mp0Var.t() != 0) {
            return null;
        }
        mp0Var2.f(7);
        int iH = mp0Var.h();
        boolean z11 = true;
        if (iH == 1684433976) {
            mp0 mp0Var3 = new mp0();
            Inflater inflater = new Inflater(true);
            try {
                boolean zA = da1.a(mp0Var2, mp0Var3, inflater);
                inflater.end();
                if (!zA) {
                    return null;
                }
                mp0Var2 = mp0Var3;
            } catch (Throwable th) {
                inflater.end();
                throw th;
            }
        } else if (iH != 1918990112) {
            return null;
        }
        ArrayList<jt0.a> arrayList3 = new ArrayList<>();
        int iD = mp0Var2.d();
        int iE = mp0Var2.e();
        while (iD < iE) {
            int iH2 = mp0Var2.h() + iD;
            if (iH2 > iD && iH2 <= iE) {
                if (mp0Var2.h() == 1835365224) {
                    int iH3 = mp0Var2.h();
                    if (iH3 > 10000) {
                        arrayList2 = arrayList3;
                        z10 = z11;
                        i10 = iE;
                        aVar = null;
                    } else {
                        float[] fArr = new float[iH3];
                        for (int i11 = 0; i11 < iH3; i11++) {
                            fArr[i11] = Float.intBitsToFloat(mp0Var2.h());
                        }
                        int iH4 = mp0Var2.h();
                        if (iH4 > 32000) {
                            arrayList2 = arrayList3;
                        } else {
                            double dLog = Math.log(2.0d);
                            arrayList2 = arrayList3;
                            int iCeil = (int) Math.ceil(Math.log(((double) iH3) * 2.0d) / dLog);
                            byte[] bArrC = mp0Var2.c();
                            lp0 lp0Var = new lp0(bArrC.length, bArrC);
                            lp0Var.c(mp0Var2.d() * 8);
                            float[] fArr2 = new float[iH4 * 5];
                            int i12 = 5;
                            int[] iArr = new int[5];
                            int i13 = 0;
                            int i14 = 0;
                            while (true) {
                                if (i13 < iH4) {
                                    int i15 = 0;
                                    while (true) {
                                        if (i15 < i12) {
                                            int i16 = iArr[i15];
                                            int iB = lp0Var.b(iCeil);
                                            int i17 = i16 + ((iB >> 1) ^ (-(iB & 1)));
                                            if (i17 < iH3 && i17 >= 0) {
                                                fArr2[i14] = fArr[i17];
                                                iArr[i15] = i17;
                                                i15++;
                                                i14++;
                                                i12 = 5;
                                            }
                                        } else {
                                            i13++;
                                            i12 = 5;
                                        }
                                    }
                                } else {
                                    lp0Var.c((lp0Var.e() + 7) & (-8));
                                    int i18 = 32;
                                    int iB2 = lp0Var.b(32);
                                    jt0.b[] bVarArr = new jt0.b[iB2];
                                    int i19 = 0;
                                    while (true) {
                                        if (i19 < iB2) {
                                            int iB3 = lp0Var.b(8);
                                            int iB4 = lp0Var.b(8);
                                            int iB5 = lp0Var.b(i18);
                                            if (iB5 <= 128000) {
                                                i10 = iE;
                                                int iCeil2 = (int) Math.ceil(Math.log(((double) iH4) * 2.0d) / dLog);
                                                float[] fArr3 = new float[iB5 * 3];
                                                float[] fArr4 = new float[iB5 * 2];
                                                int i20 = 0;
                                                int i21 = 0;
                                                while (true) {
                                                    if (i20 < iB5) {
                                                        int iB6 = lp0Var.b(iCeil2);
                                                        int i22 = iB6 >> 1;
                                                        lp0 lp0Var2 = lp0Var;
                                                        int i23 = iB6 & 1;
                                                        int i24 = iB2;
                                                        float[] fArr5 = fArr4;
                                                        int i25 = i21 + (i22 ^ (-i23));
                                                        if (i25 < 0 || i25 >= iH4) {
                                                            z10 = true;
                                                        } else {
                                                            int i26 = i20 * 3;
                                                            int i27 = i25 * 5;
                                                            fArr3[i26] = fArr2[i27];
                                                            fArr3[i26 + 1] = fArr2[i27 + 1];
                                                            fArr3[i26 + 2] = fArr2[i27 + 2];
                                                            int i28 = i20 * 2;
                                                            fArr5[i28] = fArr2[i27 + 3];
                                                            fArr5[i28 + 1] = fArr2[i27 + 4];
                                                            i20++;
                                                            i21 = i25;
                                                            fArr4 = fArr5;
                                                            iB2 = i24;
                                                            lp0Var = lp0Var2;
                                                        }
                                                    } else {
                                                        bVarArr[i19] = new jt0.b(iB3, fArr3, fArr4, iB4);
                                                        i19++;
                                                        iE = i10;
                                                        z11 = true;
                                                        iB2 = iB2;
                                                        i18 = 32;
                                                    }
                                                }
                                            }
                                            aVar = null;
                                        } else {
                                            z10 = z11;
                                            i10 = iE;
                                            aVar = new jt0.a(bVarArr);
                                        }
                                    }
                                }
                            }
                        }
                        z10 = z11;
                        i10 = iE;
                        aVar = null;
                    }
                    if (aVar != null) {
                        arrayList = arrayList2;
                        arrayList.add(aVar);
                    }
                } else {
                    arrayList = arrayList3;
                    z10 = z11;
                    i10 = iE;
                }
                mp0Var2.e(iH2);
                arrayList3 = arrayList;
                iD = iH2;
                iE = i10;
                z11 = z10;
            }
            return null;
        }
        return arrayList3;
    }
}
