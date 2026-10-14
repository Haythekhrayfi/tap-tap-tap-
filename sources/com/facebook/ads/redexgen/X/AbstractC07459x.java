package com.facebook.ads.redexgen.X;

import android.util.Pair;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC07459x {
    public static String[] A00 = {"PM7DSx0y0lrec1UT4WPnkT9xVE7xO4Q3", "BEgdeY8scYjWDgLVGs4ZUut3Hirr2MX3", "ZAPPhI63uMybzXuqxrZ5dKdt3S18BPE9", "MM2rXOZDxF7k2VlV9Dcr24aSmfbMyxXV", "eywYp4IUfN7s09w4sjk3CdaIEMxiykZ2", "eISkZjTp9yJ8vcJJgc2cD29HnvZjEHrc", "bxIeMq2jLgGDMU", "MX4WpiU2EnoJ87vmil9r758WOfjNIsLN"};
    public static final AbstractC07459x A01 = new XC();

    public abstract int A00();

    public abstract int A01();

    public abstract int A04(Object obj);

    public abstract C07439v A0A(int i10, C07439v c07439v, boolean z10);

    public abstract C07449w A0D(int i10, C07449w c07449w, boolean z10, long j10);

    public int A02(int i10, int i11, boolean z10) {
        switch (i11) {
            case 0:
                if (i10 == A06(z10)) {
                    return -1;
                }
                return i10 + 1;
            case 1:
                return i10;
            case 2:
                if (i10 == A06(z10)) {
                    return A05(z10);
                }
                return i10 + 1;
            default:
                throw new IllegalStateException();
        }
    }

    public final int A03(int i10, C07439v c07439v, C07449w c07449w, int i11, boolean z10) {
        int i12 = A09(i10, c07439v).A00;
        int windowIndex = A0B(i12, c07449w).A01;
        if (windowIndex == i10) {
            int iA02 = A02(i12, i11, z10);
            if (A00[1].charAt(27) != 'r') {
                throw new RuntimeException();
            }
            A00[5] = "vHlQRfGLACzPc9SqhGGMQS9yx8mDrtQw";
            if (iA02 == -1) {
                return -1;
            }
            C07449w c07449wA0B = A0B(iA02, c07449w);
            int nextWindowIndex = A00[6].length();
            if (nextWindowIndex == 14) {
                A00[5] = "g3EvwHO3x67yk3ScCmOHXM9FC4inpbOU";
                int windowIndex2 = c07449wA0B.A00;
                return windowIndex2;
            }
            String[] strArr = A00;
            strArr[4] = "oJT8BcC7iC9ashzghnGVZpN5rOviRVye";
            strArr[3] = "BXJ5tQfk704SS2XTm0iOlKfvNFhc4WVf";
            int windowIndex3 = c07449wA0B.A00;
            return windowIndex3;
        }
        int windowIndex4 = i10 + 1;
        return windowIndex4;
    }

    public int A05(boolean z10) {
        return A0E() ? -1 : 0;
    }

    public int A06(boolean z10) {
        if (A0E()) {
            return -1;
        }
        return A01() - 1;
    }

    public final Pair<Integer, Long> A07(C07449w c07449w, C07439v c07439v, int i10, long j10) {
        return A08(c07449w, c07439v, i10, j10, 0L);
    }

    public final Pair<Integer, Long> A08(C07449w c07449w, C07439v c07439v, int i10, long j10, long j11) {
        HG.A00(i10, 0, A01());
        A0D(i10, c07449w, false, j11);
        if (j10 == -9223372036854775807L) {
            j10 = c07449w.A01();
            if (A00[5].charAt(22) != '9') {
                throw new RuntimeException();
            }
            A00[0] = "jYNh2aRlntxjcST03zipQODHWrcZ3Q9N";
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = c07449w.A00;
        long jA03 = c07449w.A03() + j10;
        long jA07 = A09(i11, c07439v).A07();
        while (jA07 != -9223372036854775807L && jA03 >= jA07) {
            int i12 = c07449w.A01;
            if (A00[1].charAt(27) == 'r') {
                String[] strArr = A00;
                strArr[7] = "IuvzXoPM3cIs3JU7ThgGmV6LQ39mYtz4";
                strArr[2] = "DGRaGmTIVAXEwTC12jYPgBDTgoVWDlIc";
                if (i11 >= i12) {
                    break;
                }
                jA03 -= jA07;
                i11++;
                jA07 = A09(i11, c07439v).A07();
            } else {
                throw new RuntimeException();
            }
        }
        return Pair.create(Integer.valueOf(i11), Long.valueOf(jA03));
    }

    public final C07439v A09(int i10, C07439v c07439v) {
        return A0A(i10, c07439v, false);
    }

    public final C07449w A0B(int i10, C07449w c07449w) {
        return A0C(i10, c07449w, false);
    }

    public final C07449w A0C(int i10, C07449w c07449w, boolean z10) {
        return A0D(i10, c07449w, z10, 0L);
    }

    public final boolean A0E() {
        return A01() == 0;
    }

    public final boolean A0F(int i10, C07439v c07439v, C07449w c07449w, int i11, boolean z10) {
        return A03(i10, c07439v, c07449w, i11, z10) == -1;
    }
}
