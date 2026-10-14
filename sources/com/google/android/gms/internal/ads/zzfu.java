package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfu {
    public static final byte[] zza = {0, 0, 0, 1};
    public static final float[] zzb = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object zzc = new Object();
    private static int[] zzd = new int[10];

    public static int zza(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        zzdy.zzf(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            zzf(zArr);
            return i10 - 3;
        }
        if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            zzf(zArr);
            return i10 - 2;
        }
        if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            zzf(zArr);
            return i10 - 1;
        }
        int i13 = i11 - 1;
        int i14 = i10 + 2;
        while (i14 < i13) {
            byte b10 = bArr[i14];
            if ((b10 & 254) == 0) {
                int i15 = i14 - 2;
                if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b10 == 1) {
                    zzf(zArr);
                    return i15;
                }
                i14 = i15;
            }
            i14 += 3;
        }
        zArr[0] = i12 <= 2 ? !(i12 != 2 ? !(zArr[1] && bArr[i13] == 1) : !(zArr[2] && bArr[i11 + (-2)] == 0 && bArr[i13] == 1)) : bArr[i11 + (-3)] == 0 && bArr[i11 + (-2)] == 0 && bArr[i13] == 1;
        zArr[1] = i12 <= 1 ? zArr[2] && bArr[i13] == 0 : bArr[i11 + (-2)] == 0 && bArr[i13] == 0;
        zArr[2] = bArr[i13] == 0;
        return i11;
    }

    public static int zzb(byte[] bArr, int i10) {
        int i11;
        synchronized (zzc) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                while (true) {
                    try {
                        if (i12 >= i10 - 2) {
                            i12 = i10;
                            break;
                        }
                        if (bArr[i12] == 0 && bArr[i12 + 1] == 0 && bArr[i12 + 2] == 3) {
                            break;
                        }
                        i12++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i12 < i10) {
                    int[] iArr = zzd;
                    int length = iArr.length;
                    if (length <= i13) {
                        zzd = Arrays.copyOf(iArr, length + length);
                    }
                    zzd[i13] = i12;
                    i12 += 3;
                    i13++;
                }
            }
            i11 = i10 - i13;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = zzd[i16] - i14;
                System.arraycopy(bArr, i14, bArr, i15, i17);
                int i18 = i15 + i17;
                int i19 = i18 + 1;
                bArr[i18] = 0;
                i15 = i19 + 1;
                bArr[i19] = 0;
                i14 += i17 + 3;
            }
            System.arraycopy(bArr, i14, bArr, i15, i11 - i15);
        }
        return i11;
    }

    /* JADX WARN: Code duplicated, block: B:170:0x032d  */
    /* JADX WARN: Code duplicated, block: B:173:0x033c  */
    public static zzfr zzc(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        zzfv zzfvVar = new zzfv(bArr, i10, i11);
        zzfvVar.zze(4);
        int iZza = zzfvVar.zza(3);
        zzfvVar.zzd();
        int iZza2 = zzfvVar.zza(2);
        boolean zZzf = zzfvVar.zzf();
        int iZza3 = zzfvVar.zza(5);
        int i20 = 0;
        for (int i21 = 0; i21 < 32; i21++) {
            if (zzfvVar.zzf()) {
                i20 |= 1 << i21;
            }
        }
        int i22 = 6;
        int[] iArr = new int[6];
        for (int i23 = 0; i23 < 6; i23++) {
            iArr[i23] = zzfvVar.zza(8);
        }
        int iZza4 = zzfvVar.zza(8);
        int i24 = 0;
        for (int i25 = 0; i25 < iZza; i25++) {
            if (zzfvVar.zzf()) {
                i24 += 89;
            }
            if (zzfvVar.zzf()) {
                i24 += 8;
            }
        }
        zzfvVar.zze(i24);
        if (iZza > 0) {
            int i26 = 8 - iZza;
            zzfvVar.zze(i26 + i26);
        }
        int iZzc = zzfvVar.zzc();
        int iZzc2 = zzfvVar.zzc();
        if (iZzc2 == 3) {
            zzfvVar.zzd();
            iZzc2 = 3;
        }
        int iZzc3 = zzfvVar.zzc();
        int iZzc4 = zzfvVar.zzc();
        if (zzfvVar.zzf()) {
            int iZzc5 = zzfvVar.zzc();
            int iZzc6 = zzfvVar.zzc();
            int iZzc7 = zzfvVar.zzc();
            int iZzc8 = zzfvVar.zzc();
            if (iZzc2 == 1) {
                i19 = 2;
            } else if (iZzc2 == 2) {
                iZzc2 = 2;
                i19 = 2;
            } else {
                i19 = 1;
            }
            iZzc3 -= (iZzc5 + iZzc6) * i19;
            iZzc4 -= (iZzc7 + iZzc8) * (iZzc2 == 1 ? 2 : 1);
        }
        int i27 = iZzc3;
        int i28 = iZzc2;
        int i29 = iZzc4;
        int iZzc9 = zzfvVar.zzc();
        int iZzc10 = zzfvVar.zzc();
        int iZzc11 = zzfvVar.zzc();
        int i30 = true != zzfvVar.zzf() ? iZza : 0;
        while (true) {
            zzfvVar.zzc();
            zzfvVar.zzc();
            zzfvVar.zzc();
            if (i30 > iZza) {
                break;
            }
            i30++;
        }
        zzfvVar.zzc();
        zzfvVar.zzc();
        zzfvVar.zzc();
        if (zzfvVar.zzf() && zzfvVar.zzf()) {
            int i31 = 0;
            int i32 = 4;
            while (i31 < i32) {
                int i33 = 0;
                while (i33 < i22) {
                    if (zzfvVar.zzf()) {
                        int iMin = Math.min(64, 1 << ((i31 + i31) + 4));
                        if (i31 > 1) {
                            zzfvVar.zzb();
                        }
                        for (int i34 = 0; i34 < iMin; i34++) {
                            zzfvVar.zzb();
                        }
                    } else {
                        zzfvVar.zzc();
                    }
                    i33 += i31 == 3 ? 3 : 1;
                    i22 = 6;
                }
                i31++;
                i32 = 4;
                i22 = 6;
            }
        }
        zzfvVar.zze(2);
        if (zzfvVar.zzf()) {
            zzfvVar.zze(8);
            zzfvVar.zzc();
            zzfvVar.zzc();
            zzfvVar.zzd();
        }
        int iZzc12 = zzfvVar.zzc();
        int i35 = 0;
        int[] iArr2 = new int[0];
        int[] iArrCopyOf = new int[0];
        int i36 = -1;
        int i37 = -1;
        while (i35 < iZzc12) {
            if (i35 == 0 || !zzfvVar.zzf()) {
                int iZzc13 = zzfvVar.zzc();
                int iZzc14 = zzfvVar.zzc();
                int[] iArr3 = new int[iZzc13];
                for (int i38 = 0; i38 < iZzc13; i38++) {
                    iArr3[i38] = zzfvVar.zzc() + 1;
                    zzfvVar.zzd();
                }
                int i39 = 1;
                int[] iArr4 = new int[iZzc14];
                int i40 = 0;
                while (i40 < iZzc14) {
                    iArr4[i40] = zzfvVar.zzc() + i39;
                    zzfvVar.zzd();
                    i40++;
                    i39 = 1;
                }
                i36 = iZzc13;
                i37 = iZzc14;
                iArr2 = iArr3;
                iArrCopyOf = iArr4;
            } else {
                int i41 = i36 + i37;
                boolean zZzf2 = zzfvVar.zzf();
                int iZzc15 = zzfvVar.zzc() + 1;
                int i42 = 1 - ((zZzf2 ? 1 : 0) + (zZzf2 ? 1 : 0));
                int i43 = i41 + 1;
                boolean[] zArr = new boolean[i43];
                for (int i44 = 0; i44 <= i41; i44++) {
                    if (zzfvVar.zzf()) {
                        zArr[i44] = true;
                    } else {
                        zArr[i44] = zzfvVar.zzf();
                    }
                }
                int i45 = i37 - 1;
                int[] iArr5 = new int[i43];
                int[] iArr6 = new int[i43];
                int i46 = 0;
                while (true) {
                    i18 = i42 * iZzc15;
                    if (i45 < 0) {
                        break;
                    }
                    int i47 = iArrCopyOf[i45] + i18;
                    if (i47 < 0 && zArr[i36 + i45]) {
                        iArr5[i46] = i47;
                        i46++;
                    }
                    i45--;
                }
                if (i18 < 0 && zArr[i41]) {
                    iArr5[i46] = i18;
                    i46++;
                }
                int i48 = i46;
                for (int i49 = 0; i49 < i36; i49++) {
                    int i50 = iArr2[i49] + i18;
                    if (i50 < 0 && zArr[i49]) {
                        iArr5[i48] = i50;
                        i48++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr5, i48);
                int i51 = 0;
                for (int i52 = i36 - 1; i52 >= 0; i52--) {
                    int i53 = iArr2[i52] + i18;
                    if (i53 > 0 && zArr[i52]) {
                        iArr6[i51] = i53;
                        i51++;
                    }
                }
                if (i18 > 0 && zArr[i41]) {
                    iArr6[i51] = i18;
                    i51++;
                }
                int i54 = i51;
                for (int i55 = 0; i55 < i37; i55++) {
                    int i56 = iArrCopyOf[i55] + i18;
                    if (i56 > 0 && zArr[i36 + i55]) {
                        iArr6[i54] = i56;
                        i54++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr6, i54);
                i37 = i54;
                i36 = i48;
                iArr2 = iArrCopyOf2;
            }
            i35++;
            iZzc12 = iZzc12;
            iZzc = iZzc;
            i20 = i20;
            iArr = iArr;
            iZza4 = iZza4;
        }
        int i57 = i20;
        int[] iArr7 = iArr;
        int i58 = iZza4;
        int i59 = iZzc;
        if (zzfvVar.zzf()) {
            for (int i60 = 0; i60 < zzfvVar.zzc(); i60++) {
                zzfvVar.zze(iZzc11 + 5);
            }
        }
        zzfvVar.zze(2);
        float f10 = 1.0f;
        if (zzfvVar.zzf()) {
            if (zzfvVar.zzf()) {
                int iZza5 = zzfvVar.zza(8);
                if (iZza5 == 255) {
                    int iZza6 = zzfvVar.zza(16);
                    int iZza7 = zzfvVar.zza(16);
                    if (iZza6 != 0 && iZza7 != 0) {
                        f10 = iZza6 / iZza7;
                    }
                } else if (iZza5 < 17) {
                    f10 = zzb[iZza5];
                } else {
                    zzer.zzf("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + iZza5);
                }
            }
            if (zzfvVar.zzf()) {
                zzfvVar.zzd();
            }
            if (zzfvVar.zzf()) {
                zzfvVar.zze(3);
                i16 = true == zzfvVar.zzf() ? 1 : 2;
                if (zzfvVar.zzf()) {
                    int iZza8 = zzfvVar.zza(8);
                    int iZza9 = zzfvVar.zza(8);
                    zzfvVar.zze(8);
                    int iZza10 = zzs.zza(iZza8);
                    int iZzb = zzs.zzb(iZza9);
                    i17 = iZza10;
                    i14 = iZzb;
                }
                if (zzfvVar.zzf()) {
                    zzfvVar.zzc();
                    zzfvVar.zzc();
                }
                zzfvVar.zzd();
                if (zzfvVar.zzf()) {
                    i29 += i29;
                }
                i15 = i16;
                i13 = i17;
                i12 = i29;
            } else {
                i16 = -1;
            }
            i14 = -1;
            i17 = -1;
            if (zzfvVar.zzf()) {
                zzfvVar.zzc();
                zzfvVar.zzc();
            }
            zzfvVar.zzd();
            if (zzfvVar.zzf()) {
                i29 += i29;
            }
            i15 = i16;
            i13 = i17;
            i12 = i29;
        } else {
            i12 = i29;
            i13 = -1;
            i14 = -1;
            i15 = -1;
        }
        return new zzfr(iZza2, zZzf, iZza3, i57, i28, iZzc9, iZzc10, iArr7, i58, i59, i27, i12, f10, i13, i15, i14);
    }

    public static zzfs zzd(byte[] bArr, int i10, int i11) {
        zzfv zzfvVar = new zzfv(bArr, 4, i11);
        int iZzc = zzfvVar.zzc();
        int iZzc2 = zzfvVar.zzc();
        zzfvVar.zzd();
        return new zzfs(iZzc, iZzc2, zzfvVar.zzf());
    }

    /* JADX WARN: Code duplicated, block: B:102:0x019e  */
    /* JADX WARN: Code duplicated, block: B:103:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:106:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:111:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0053  */
    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x006a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x006c  */
    /* JADX WARN: Code duplicated, block: B:31:0x006e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0073  */
    /* JADX WARN: Code duplicated, block: B:36:0x0079  */
    /* JADX WARN: Code duplicated, block: B:38:0x007c  */
    /* JADX WARN: Code duplicated, block: B:39:0x007f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0088  */
    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:65:0x0109  */
    /* JADX WARN: Code duplicated, block: B:67:0x011b  */
    /* JADX WARN: Code duplicated, block: B:68:0x011d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0120  */
    /* JADX WARN: Code duplicated, block: B:71:0x0122  */
    /* JADX WARN: Code duplicated, block: B:73:0x0125  */
    /* JADX WARN: Code duplicated, block: B:74:0x0127  */
    /* JADX WARN: Code duplicated, block: B:79:0x013b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0141  */
    /* JADX WARN: Code duplicated, block: B:83:0x014b  */
    /* JADX WARN: Code duplicated, block: B:87:0x015d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0161  */
    /* JADX WARN: Code duplicated, block: B:90:0x0166  */
    /* JADX WARN: Code duplicated, block: B:91:0x017c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0184  */
    /* JADX WARN: Code duplicated, block: B:97:0x018d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0197  */
    /* JADX WARN: Instruction removed from duplicated block: B:90:0x0166, please report this as an issue */
    public static zzft zze(byte[] bArr, int i10, int i11) {
        int iZzc;
        boolean zZzf;
        int i12;
        boolean z10;
        int i13;
        int i14;
        int i15;
        int i16;
        int iZzb;
        int i17;
        int iZzc2;
        boolean z11;
        int i18;
        int i19;
        boolean zZzf2;
        int i20;
        int i21;
        int i22;
        float f10;
        int iZza;
        int i23;
        int iZzb2;
        int i24;
        int iZza2;
        int iZza3;
        int i25;
        int i26;
        zzfv zzfvVar = new zzfv(bArr, i10, i11);
        int iZza4 = zzfvVar.zza(8);
        int iZza5 = zzfvVar.zza(8);
        int iZza6 = zzfvVar.zza(8);
        int iZzc3 = zzfvVar.zzc();
        if (iZza4 == 100 || iZza4 == 110 || iZza4 == 122 || iZza4 == 244 || iZza4 == 44 || iZza4 == 83 || iZza4 == 86 || iZza4 == 118 || iZza4 == 128) {
            iZzc = zzfvVar.zzc();
            if (iZzc == 3) {
                zZzf = zzfvVar.zzf();
                i12 = 3;
            } else {
                zZzf = false;
                i12 = iZzc;
            }
            zzfvVar.zzc();
            zzfvVar.zzc();
            zzfvVar.zzd();
            if (zzfvVar.zzf()) {
                if (i12 != 3) {
                    i13 = 8;
                } else {
                    i13 = 12;
                }
                for (i14 = 0; i14 < i13; i14++) {
                    if (!zzfvVar.zzf()) {
                        if (i14 < 6) {
                            i15 = 16;
                        } else {
                            i15 = 64;
                        }
                        iZzb = 8;
                        i17 = 8;
                        for (i16 = 0; i16 < i15; i16++) {
                            if (iZzb != 0) {
                                iZzb = ((zzfvVar.zzb() + i17) + 256) % 256;
                            }
                            if (iZzb != 0) {
                                i17 = iZzb;
                            }
                        }
                    }
                }
            }
            z10 = zZzf;
        } else if (iZza4 == 138) {
            iZza4 = 138;
            iZzc = zzfvVar.zzc();
            if (iZzc == 3) {
                zZzf = zzfvVar.zzf();
                i12 = 3;
            } else {
                zZzf = false;
                i12 = iZzc;
            }
            zzfvVar.zzc();
            zzfvVar.zzc();
            zzfvVar.zzd();
            if (zzfvVar.zzf()) {
                if (i12 != 3) {
                    i13 = 8;
                } else {
                    i13 = 12;
                }
                while (i14 < i13) {
                    if (!zzfvVar.zzf()) {
                        if (i14 < 6) {
                            i15 = 16;
                        } else {
                            i15 = 64;
                        }
                        iZzb = 8;
                        i17 = 8;
                        while (i16 < i15) {
                            if (iZzb != 0) {
                                iZzb = ((zzfvVar.zzb() + i17) + 256) % 256;
                            }
                            if (iZzb != 0) {
                                i17 = iZzb;
                            }
                        }
                    }
                }
            }
            z10 = zZzf;
        } else {
            z10 = false;
            iZzc = 1;
        }
        int iZzc4 = zzfvVar.zzc() + 4;
        int iZzc5 = zzfvVar.zzc();
        if (iZzc5 != 0) {
            if (iZzc5 == 1) {
                boolean zZzf3 = zzfvVar.zzf();
                zzfvVar.zzb();
                zzfvVar.zzb();
                long jZzc = zzfvVar.zzc();
                iZza5 = iZza5;
                for (int i27 = 0; i27 < jZzc; i27++) {
                    zzfvVar.zzc();
                }
                z11 = zZzf3;
                i18 = 0;
                i19 = 1;
            } else {
                iZzc2 = 0;
            }
            int iZzc6 = zzfvVar.zzc();
            zzfvVar.zzd();
            int iZzc7 = zzfvVar.zzc() + 1;
            int iZzc8 = zzfvVar.zzc() + 1;
            zZzf2 = zzfvVar.zzf();
            i20 = 2 - (zZzf2 ? 1 : 0);
            if (!zZzf2) {
                zzfvVar.zzd();
            }
            zzfvVar.zzd();
            i21 = iZzc7 * 16;
            i22 = iZzc8 * i20 * 16;
            if (zzfvVar.zzf()) {
                int iZzc9 = zzfvVar.zzc();
                int iZzc10 = zzfvVar.zzc();
                int iZzc11 = zzfvVar.zzc();
                int iZzc12 = zzfvVar.zzc();
                if (iZzc == 0) {
                    i25 = 1;
                } else {
                    if (iZzc == 3) {
                        i25 = 1;
                    } else {
                        i25 = 2;
                    }
                    if (iZzc == 1) {
                        i26 = 2;
                    } else {
                        i26 = 1;
                    }
                    i20 *= i26;
                }
                i21 -= (iZzc9 + iZzc10) * i25;
                i22 -= (iZzc11 + iZzc12) * i20;
            }
            int i28 = i22;
            if (zzfvVar.zzf()) {
                if (zzfvVar.zzf()) {
                    iZza2 = zzfvVar.zza(8);
                    if (iZza2 == 255) {
                        iZza3 = zzfvVar.zza(16);
                        int iZza7 = zzfvVar.zza(16);
                        if (iZza3 != 0 || iZza7 == 0) {
                            f10 = 1.0f;
                        } else {
                            f10 = iZza3 / iZza7;
                        }
                    } else if (iZza2 < 17) {
                        f10 = zzb[iZza2];
                    } else {
                        zzer.zzf("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + iZza2);
                        f10 = 1.0f;
                    }
                } else {
                    f10 = 1.0f;
                }
                if (zzfvVar.zzf()) {
                    zzfvVar.zzd();
                }
                if (zzfvVar.zzf()) {
                    zzfvVar.zze(3);
                    i24 = true != zzfvVar.zzf() ? 2 : 1;
                    if (zzfvVar.zzf()) {
                        int iZza8 = zzfvVar.zza(8);
                        int iZza9 = zzfvVar.zza(8);
                        zzfvVar.zze(8);
                        iZza = zzs.zza(iZza8);
                        iZzb2 = zzs.zzb(iZza9);
                    }
                    i23 = i24;
                } else {
                    i24 = -1;
                }
                iZza = -1;
                iZzb2 = -1;
                i23 = i24;
            } else {
                f10 = 1.0f;
                iZza = -1;
                i23 = -1;
                iZzb2 = -1;
            }
            return new zzft(iZza4, iZza5, iZza6, iZzc3, iZzc6, i21, i28, f10, z10, zZzf2, iZzc4, i19, i18, z11, iZza, i23, iZzb2);
        }
        iZzc2 = zzfvVar.zzc() + 4;
        i19 = iZzc5;
        z11 = false;
        i18 = iZzc2;
        int iZzc13 = zzfvVar.zzc();
        zzfvVar.zzd();
        int iZzc14 = zzfvVar.zzc() + 1;
        int iZzc15 = zzfvVar.zzc() + 1;
        zZzf2 = zzfvVar.zzf();
        i20 = 2 - (zZzf2 ? 1 : 0);
        if (!zZzf2) {
            zzfvVar.zzd();
        }
        zzfvVar.zzd();
        i21 = iZzc14 * 16;
        i22 = iZzc15 * i20 * 16;
        if (zzfvVar.zzf()) {
            int iZzc16 = zzfvVar.zzc();
            int iZzc17 = zzfvVar.zzc();
            int iZzc18 = zzfvVar.zzc();
            int iZzc19 = zzfvVar.zzc();
            if (iZzc == 0) {
                i25 = 1;
            } else {
                if (iZzc == 3) {
                    i25 = 1;
                } else {
                    i25 = 2;
                }
                if (iZzc == 1) {
                    i26 = 2;
                } else {
                    i26 = 1;
                }
                i20 *= i26;
            }
            i21 -= (iZzc16 + iZzc17) * i25;
            i22 -= (iZzc18 + iZzc19) * i20;
        }
        int i29 = i22;
        if (zzfvVar.zzf()) {
            if (zzfvVar.zzf()) {
                f10 = 1.0f;
            } else {
                iZza2 = zzfvVar.zza(8);
                if (iZza2 == 255) {
                    iZza3 = zzfvVar.zza(16);
                    int iZza10 = zzfvVar.zza(16);
                    if (iZza3 != 0) {
                        f10 = 1.0f;
                    } else {
                        f10 = 1.0f;
                    }
                } else if (iZza2 < 17) {
                    f10 = zzb[iZza2];
                } else {
                    zzer.zzf("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + iZza2);
                    f10 = 1.0f;
                }
            }
            if (zzfvVar.zzf()) {
                zzfvVar.zzd();
            }
            if (zzfvVar.zzf()) {
                zzfvVar.zze(3);
                if (true != zzfvVar.zzf()) {
                }
                if (zzfvVar.zzf()) {
                    int iZza11 = zzfvVar.zza(8);
                    int iZza12 = zzfvVar.zza(8);
                    zzfvVar.zze(8);
                    iZza = zzs.zza(iZza11);
                    iZzb2 = zzs.zzb(iZza12);
                }
                i23 = i24;
            } else {
                i24 = -1;
            }
            iZza = -1;
            iZzb2 = -1;
            i23 = i24;
        } else {
            f10 = 1.0f;
            iZza = -1;
            i23 = -1;
            iZzb2 = -1;
        }
        return new zzft(iZza4, iZza5, iZza6, iZzc3, iZzc13, i21, i29, f10, z10, zZzf2, iZzc4, i19, i18, z11, iZza, i23, iZzb2);
    }

    public static void zzf(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }
}
