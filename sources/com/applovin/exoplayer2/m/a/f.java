package com.applovin.exoplayer2.m.a;

import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.x;
import com.applovin.exoplayer2.l.y;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes.dex */
final class f {
    private static int a(int i10) {
        return (-(i10 & 1)) ^ (i10 >> 1);
    }

    public static e a(byte[] bArr, int i10) {
        ArrayList<e.a> arrayListB;
        y yVar = new y(bArr);
        try {
            arrayListB = a(yVar) ? b(yVar) : c(yVar);
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayListB = null;
        }
        if (arrayListB == null) {
            return null;
        }
        int size = arrayListB.size();
        if (size == 1) {
            return new e(arrayListB.get(0), i10);
        }
        if (size != 2) {
            return null;
        }
        return new e(arrayListB.get(0), arrayListB.get(1), i10);
    }

    private static boolean a(y yVar) {
        yVar.e(4);
        int iQ = yVar.q();
        yVar.d(0);
        return iQ == 1886547818;
    }

    private static ArrayList<e.a> b(y yVar) {
        int iQ;
        yVar.e(8);
        int iC = yVar.c();
        int iB = yVar.b();
        while (iC < iB && (iQ = yVar.q() + iC) > iC && iQ <= iB) {
            int iQ2 = yVar.q();
            if (iQ2 == 2037673328 || iQ2 == 1836279920) {
                yVar.c(iQ);
                return c(yVar);
            }
            yVar.d(iQ);
            iC = iQ;
        }
        return null;
    }

    private static ArrayList<e.a> c(y yVar) {
        if (yVar.h() != 0) {
            return null;
        }
        yVar.e(7);
        int iQ = yVar.q();
        if (iQ == 1684433976) {
            y yVar2 = new y();
            Inflater inflater = new Inflater(true);
            try {
                boolean zA = ai.a(yVar, yVar2, inflater);
                inflater.end();
                if (!zA) {
                    return null;
                }
                yVar = yVar2;
            } catch (Throwable th) {
                inflater.end();
                throw th;
            }
        } else if (iQ != 1918990112) {
            return null;
        }
        return d(yVar);
    }

    private static ArrayList<e.a> d(y yVar) {
        ArrayList<e.a> arrayList = new ArrayList<>();
        int iC = yVar.c();
        int iB = yVar.b();
        while (iC < iB) {
            int iQ = yVar.q() + iC;
            if (iQ <= iC || iQ > iB) {
                return null;
            }
            if (yVar.q() == 1835365224) {
                e.a aVarE = e(yVar);
                if (aVarE == null) {
                    return null;
                }
                arrayList.add(aVarE);
            }
            yVar.d(iQ);
            iC = iQ;
        }
        return arrayList;
    }

    private static e.a e(y yVar) {
        int iQ = yVar.q();
        if (iQ > 10000) {
            return null;
        }
        float[] fArr = new float[iQ];
        for (int i10 = 0; i10 < iQ; i10++) {
            fArr[i10] = yVar.z();
        }
        int iQ2 = yVar.q();
        if (iQ2 > 32000) {
            return null;
        }
        double d10 = 2.0d;
        double dLog = Math.log(2.0d);
        int iCeil = (int) Math.ceil(Math.log(((double) iQ) * 2.0d) / dLog);
        x xVar = new x(yVar.d());
        int i11 = 8;
        xVar.a(yVar.c() * 8);
        float[] fArr2 = new float[iQ2 * 5];
        int i12 = 5;
        int[] iArr = new int[5];
        int i13 = 0;
        int i14 = 0;
        while (i13 < iQ2) {
            int i15 = 0;
            while (i15 < i12) {
                int iA = iArr[i15] + a(xVar.c(iCeil));
                if (iA >= iQ || iA < 0) {
                    return null;
                }
                fArr2[i14] = fArr[iA];
                iArr[i15] = iA;
                i15++;
                i14++;
                i12 = 5;
            }
            i13++;
            i12 = 5;
        }
        xVar.a((xVar.b() + 7) & (-8));
        int i16 = 32;
        int iC = xVar.c(32);
        e.b[] bVarArr = new e.b[iC];
        int i17 = 0;
        while (i17 < iC) {
            int iC2 = xVar.c(i11);
            int iC3 = xVar.c(i11);
            int iC4 = xVar.c(i16);
            if (iC4 > 128000) {
                return null;
            }
            int iCeil2 = (int) Math.ceil(Math.log(((double) iQ2) * d10) / dLog);
            float[] fArr3 = new float[iC4 * 3];
            float[] fArr4 = new float[iC4 * 2];
            int iA2 = 0;
            for (int i18 = 0; i18 < iC4; i18++) {
                iA2 += a(xVar.c(iCeil2));
                if (iA2 < 0 || iA2 >= iQ2) {
                    return null;
                }
                int i19 = i18 * 3;
                int i20 = iA2 * 5;
                fArr3[i19] = fArr2[i20];
                fArr3[i19 + 1] = fArr2[i20 + 1];
                fArr3[i19 + 2] = fArr2[i20 + 2];
                int i21 = i18 * 2;
                fArr4[i21] = fArr2[i20 + 3];
                fArr4[i21 + 1] = fArr2[i20 + 4];
            }
            bVarArr[i17] = new e.b(iC2, fArr3, fArr4, iC3);
            i17++;
            i16 = 32;
            d10 = 2.0d;
            i11 = 8;
        }
        return new e.a(bVarArr);
    }
}
