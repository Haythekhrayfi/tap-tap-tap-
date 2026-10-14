package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaaa {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {AdError.CACHE_ERROR_CODE, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX WARN: Code duplicated, block: B:47:0x0099  */
    /* JADX WARN: Code duplicated, block: B:49:0x009d  */
    public static zzzz zza(zzez zzezVar) {
        int i10;
        int i11;
        int iZzd;
        int iZzd2 = zzezVar.zzd(16);
        int iZzd3 = zzezVar.zzd(16);
        if (iZzd3 == 65535) {
            iZzd3 = zzezVar.zzd(24);
            i10 = 7;
        } else {
            i10 = 4;
        }
        int i12 = iZzd3 + i10;
        if (iZzd2 == 44097) {
            i12 += 2;
        }
        int i13 = i12;
        int iZzd4 = zzezVar.zzd(2);
        int i14 = 0;
        if (iZzd4 == 3) {
            int i15 = 0;
            while (true) {
                iZzd = zzezVar.zzd(2) + i15;
                if (!zzezVar.zzn()) {
                    break;
                }
                i15 = (iZzd + 1) << 2;
            }
            iZzd4 = iZzd + 3;
        }
        int iZzd5 = zzezVar.zzd(10);
        if (zzezVar.zzn() && zzezVar.zzd(3) > 0) {
            zzezVar.zzl(2);
        }
        int i16 = true != zzezVar.zzn() ? 44100 : 48000;
        int iZzd6 = zzezVar.zzd(4);
        if (i16 == 44100 && iZzd6 == 13) {
            i11 = zzb[13];
        } else {
            if (i16 == 48000 && iZzd6 < 14) {
                i14 = zzb[iZzd6];
                int i17 = iZzd5 % 5;
                if (i17 == 1) {
                    if (iZzd6 != 3 || iZzd6 == 8) {
                        i14++;
                    }
                } else if (i17 != 2) {
                    if (i17 != 3) {
                        if (i17 == 4 && (iZzd6 == 3 || iZzd6 == 8 || iZzd6 == 11)) {
                            i14++;
                        }
                    } else if (iZzd6 != 3) {
                        i14++;
                    } else {
                        i14++;
                    }
                } else if (iZzd6 == 8 || iZzd6 == 11) {
                    i14++;
                }
            }
            i11 = i14;
        }
        return new zzzz(iZzd4, 2, i16, i13, i11, null);
    }

    public static void zzb(int i10, zzfa zzfaVar) {
        zzfaVar.zzC(7);
        byte[] bArrZzH = zzfaVar.zzH();
        bArrZzH[0] = -84;
        bArrZzH[1] = 64;
        bArrZzH[2] = -1;
        bArrZzH[3] = -1;
        bArrZzH[4] = (byte) ((i10 >> 16) & 255);
        bArrZzH[5] = (byte) ((i10 >> 8) & 255);
        bArrZzH[6] = (byte) (i10 & 255);
    }
}
