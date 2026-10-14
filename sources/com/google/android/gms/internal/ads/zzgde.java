package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgde {
    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        long jZzb = zzb(bArr, 0, 0);
        long jZzb2 = zzb(bArr, 3, 2) & 67108611;
        long jZzb3 = zzb(bArr, 6, 4) & 67092735;
        long jZzb4 = zzb(bArr, 9, 6) & 66076671;
        long jZzb5 = zzb(bArr, 12, 8) & 1048575;
        int i10 = 17;
        byte[] bArr3 = new byte[17];
        long j10 = 0;
        int i11 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        while (true) {
            int length = bArr2.length;
            if (i11 >= length) {
                long j15 = j10 + (j11 >> 26);
                long j16 = j15 & 67108863;
                long j17 = j12 + (j15 >> 26);
                long j18 = j17 & 67108863;
                long j19 = j13 + (j17 >> 26);
                long j20 = j19 & 67108863;
                long j21 = ((j19 >> 26) * 5) + j14;
                long j22 = j21 >> 26;
                long j23 = j21 & 67108863;
                long j24 = j23 + 5;
                long j25 = (j11 & 67108863) + j22;
                long j26 = j25 + (j24 >> 26);
                long j27 = (j26 >> 26) + j16;
                long j28 = j18 + (j27 >> 26);
                long j29 = (j20 + (j28 >> 26)) - 67108864;
                long j30 = j29 >> 63;
                long j31 = ~j30;
                long j32 = (j25 & j30) | (j26 & 67108863 & j31);
                long j33 = (j16 & j30) | (j27 & 67108863 & j31);
                long j34 = (j18 & j30) | (j28 & 67108863 & j31);
                long j35 = (j20 & j30) | (j29 & j31);
                long jZzc = (((j23 & j30) | (j24 & 67108863 & j31) | (j32 << 26)) & 4294967295L) + zzc(bArr, 16);
                long jZzc2 = (((j32 >> 6) | (j33 << 20)) & 4294967295L) + zzc(bArr, 20);
                long jZzc3 = (((j34 << 14) | (j33 >> 12)) & 4294967295L) + zzc(bArr, 24);
                long jZzc4 = (((j34 >> 18) | (j35 << 8)) & 4294967295L) + zzc(bArr, 28);
                byte[] bArr4 = new byte[16];
                zzd(bArr4, jZzc & 4294967295L, 0);
                long j36 = jZzc2 + (jZzc >> 32);
                zzd(bArr4, j36 & 4294967295L, 4);
                long j37 = jZzc3 + (j36 >> 32);
                zzd(bArr4, j37 & 4294967295L, 8);
                zzd(bArr4, (jZzc4 + (j37 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
            int iMin = Math.min(16, length - i11);
            System.arraycopy(bArr2, i11, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, i10, (byte) 0);
            }
            long j38 = jZzb5 * 5;
            long j39 = jZzb4 * 5;
            long j40 = jZzb3 * 5;
            long jZzb6 = j14 + zzb(bArr3, 0, 0);
            long jZzb7 = j11 + zzb(bArr3, 3, 2);
            long jZzb8 = j10 + zzb(bArr3, 6, 4);
            long jZzb9 = j12 + zzb(bArr3, 9, 6);
            long jZzb10 = j13 + (zzb(bArr3, 12, 8) | ((long) (bArr3[16] << Ascii.CAN)));
            long j41 = jZzb7 * jZzb;
            long j42 = jZzb7 * jZzb2;
            long j43 = jZzb8 * jZzb;
            long j44 = jZzb7 * jZzb3;
            long j45 = jZzb8 * jZzb2;
            long j46 = jZzb9 * jZzb;
            long j47 = jZzb7 * jZzb4;
            long j48 = jZzb8 * jZzb3;
            long j49 = jZzb9 * jZzb2;
            long j50 = jZzb10 * jZzb;
            long j51 = (jZzb2 * 5 * jZzb10) + (jZzb9 * j40) + (jZzb8 * j39) + (jZzb7 * j38) + (jZzb6 * jZzb);
            long j52 = j51 & 67108863;
            long j53 = jZzb9 * j39;
            long j54 = j40 * jZzb10;
            long j55 = j54 + j53 + (jZzb8 * j38) + (jZzb6 * jZzb2) + j41 + (j51 >> 26);
            long j56 = j39 * jZzb10;
            long j57 = j56 + (jZzb9 * j38) + (jZzb6 * jZzb3) + j42 + j43 + (j55 >> 26);
            long j58 = (jZzb10 * j38) + (jZzb6 * jZzb4) + j44 + j45 + j46 + (j57 >> 26);
            long j59 = (jZzb6 * jZzb5) + j47 + j48 + j49 + j50 + (j58 >> 26);
            long j60 = ((j59 >> 26) * 5) + j52;
            j11 = (j55 & 67108863) + (j60 >> 26);
            i11 += 16;
            j10 = j57 & 67108863;
            j12 = j58 & 67108863;
            j13 = j59 & 67108863;
            i10 = 17;
            j14 = j60 & 67108863;
        }
    }

    private static long zzb(byte[] bArr, int i10, int i11) {
        return (zzc(bArr, i10) >> i11) & 67108863;
    }

    private static long zzc(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((long) (((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16))) & 4294967295L;
    }

    private static void zzd(byte[] bArr, long j10, int i10) {
        for (int i11 = 0; i11 < 4; i11++) {
            bArr[i10 + i11] = (byte) (255 & j10);
            j10 >>= 8;
        }
    }
}
