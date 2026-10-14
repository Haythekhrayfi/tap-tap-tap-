package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaat {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] zzc = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    private static final int[] zzd = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    public static zzam zza(byte[] bArr, String str, String str2, zzad zzadVar) {
        zzez zzezVar;
        if (bArr[0] == 127) {
            zzezVar = new zzez(bArr, bArr.length);
        } else {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            byte b10 = bArrCopyOf[0];
            if (b10 == -2 || b10 == -1) {
                for (int i10 = 0; i10 < bArrCopyOf.length - 1; i10 += 2) {
                    byte b11 = bArrCopyOf[i10];
                    int i11 = i10 + 1;
                    bArrCopyOf[i10] = bArrCopyOf[i11];
                    bArrCopyOf[i11] = b11;
                }
            }
            int length = bArrCopyOf.length;
            zzezVar = new zzez(bArrCopyOf, length);
            if (bArrCopyOf[0] == 31) {
                zzez zzezVar2 = new zzez(bArrCopyOf, length);
                while (zzezVar2.zza() >= 16) {
                    zzezVar2.zzl(2);
                    zzezVar.zzf(zzezVar2.zzd(14), 14);
                }
            }
            zzezVar.zzi(bArrCopyOf, bArrCopyOf.length);
        }
        zzezVar.zzl(60);
        int i12 = zzb[zzezVar.zzd(6)];
        int i13 = zzc[zzezVar.zzd(4)];
        int iZzd = zzezVar.zzd(5);
        int i14 = iZzd < 29 ? (zzd[iZzd] * 1000) / 2 : -1;
        zzezVar.zzl(10);
        int i15 = i12 + (zzezVar.zzd(2) > 0 ? 1 : 0);
        zzak zzakVar = new zzak();
        zzakVar.zzH(str);
        zzakVar.zzS("audio/vnd.dts");
        zzakVar.zzv(i14);
        zzakVar.zzw(i15);
        zzakVar.zzT(i13);
        zzakVar.zzB(null);
        zzakVar.zzK(str2);
        return zzakVar.zzY();
    }
}
