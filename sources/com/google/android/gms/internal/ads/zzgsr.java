package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;

/* JADX INFO: loaded from: classes2.dex */
final class zzgsr {
    public static /* bridge */ /* synthetic */ void zza(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) throws zzgpy {
        if (!zzg(b11)) {
            if ((((b11 + 112) + (b10 << Ascii.FS)) >> 30) == 0 && !zzg(b12) && !zzg(b13)) {
                int i11 = ((b10 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
                cArr[i10] = (char) ((i11 >>> 10) + 55232);
                cArr[i10 + 1] = (char) ((i11 & 1023) + 56320);
                return;
            }
        }
        throw zzgpy.zzd();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0013 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:11:0x0015  */
    /* JADX WARN: Code duplicated, block: B:12:0x0016 A[PHI: r2
  0x0016: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:9:0x0011, B:11:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x001c  */
    public static /* bridge */ /* synthetic */ void zzb(byte b10, byte b11, byte b12, char[] cArr, int i10) throws zzgpy {
        if (!zzg(b11)) {
            if (b10 != -32) {
                if (b10 != -19) {
                    if (!zzg(b12)) {
                        cArr[i10] = (char) (((b10 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
                        return;
                    }
                } else if (b11 < -96) {
                    b10 = -19;
                    if (!zzg(b12)) {
                        cArr[i10] = (char) (((b10 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
                        return;
                    }
                }
            } else if (b11 >= -96) {
                b10 = -32;
                if (b10 != -19) {
                    if (!zzg(b12)) {
                        cArr[i10] = (char) (((b10 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
                        return;
                    }
                } else if (b11 < -96) {
                    b10 = -19;
                    if (!zzg(b12)) {
                        cArr[i10] = (char) (((b10 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
                        return;
                    }
                }
            }
        }
        throw zzgpy.zzd();
    }

    public static /* bridge */ /* synthetic */ void zzc(byte b10, byte b11, char[] cArr, int i10) throws zzgpy {
        if (b10 < -62 || zzg(b11)) {
            throw zzgpy.zzd();
        }
        cArr[i10] = (char) (((b10 & Ascii.US) << 6) | (b11 & 63));
    }

    public static /* bridge */ /* synthetic */ boolean zzd(byte b10) {
        return b10 >= 0;
    }

    public static /* bridge */ /* synthetic */ boolean zze(byte b10) {
        return b10 < -16;
    }

    public static /* bridge */ /* synthetic */ boolean zzf(byte b10) {
        return b10 < -32;
    }

    private static boolean zzg(byte b10) {
        return b10 > -65;
    }
}
