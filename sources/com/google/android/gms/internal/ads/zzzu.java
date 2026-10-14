package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzzu {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] zzc = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static zzzt zza(byte[] bArr) throws zzcd {
        return zzb(new zzez(bArr, bArr.length), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a9, code lost:
    
        if (r11 != 3) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzzt zzb(com.google.android.gms.internal.ads.zzez r11, boolean r12) throws com.google.android.gms.internal.ads.zzcd {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzu.zzb(com.google.android.gms.internal.ads.zzez, boolean):com.google.android.gms.internal.ads.zzzt");
    }

    private static int zzc(zzez zzezVar) {
        int iZzd = zzezVar.zzd(5);
        return iZzd == 31 ? zzezVar.zzd(6) + 32 : iZzd;
    }

    private static int zzd(zzez zzezVar) throws zzcd {
        int iZzd = zzezVar.zzd(4);
        if (iZzd == 15) {
            if (zzezVar.zza() >= 24) {
                return zzezVar.zzd(24);
            }
            throw zzcd.zza("AAC header insufficient data", null);
        }
        if (iZzd < 13) {
            return zzb[iZzd];
        }
        throw zzcd.zza("AAC header wrong Sampling Frequency Index", null);
    }
}
