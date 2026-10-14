package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzajx {
    public static int zza(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] != 71) {
            i10++;
        }
        return i10;
    }

    public static long zzb(zzfa zzfaVar, int i10, int i11) {
        zzfaVar.zzF(i10);
        if (zzfaVar.zza() < 5) {
            return -9223372036854775807L;
        }
        int iZze = zzfaVar.zze();
        if ((8388608 & iZze) != 0 || ((iZze >> 8) & 8191) != i11 || (iZze & 32) == 0 || zzfaVar.zzk() < 7 || zzfaVar.zza() < 7 || (zzfaVar.zzk() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        zzfaVar.zzB(bArr, 0, 6);
        long j10 = bArr[0];
        long j11 = bArr[1];
        long j12 = bArr[2];
        long j13 = bArr[3] & 255;
        return ((j10 & 255) << 25) | ((j11 & 255) << 17) | ((j12 & 255) << 9) | (j13 + j13) | ((((long) bArr[4]) & 255) >> 7);
    }
}
