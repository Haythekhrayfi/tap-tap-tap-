package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzafr {
    private static final long[] zza = {128, 64, 32, 16, 8, 4, 2, 1};
    private final byte[] zzb = new byte[8];
    private int zzc;
    private int zzd;

    public static int zzb(int i10) {
        int i11 = 0;
        while (i11 < 8) {
            long j10 = zza[i11] & ((long) i10);
            i11++;
            if (j10 != 0) {
                return i11;
            }
        }
        return -1;
    }

    public static long zzc(byte[] bArr, int i10, boolean z10) {
        long j10 = ((long) bArr[0]) & 255;
        if (z10) {
            j10 &= ~zza[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (((long) bArr[i11]) & 255);
        }
        return j10;
    }

    public final int zza() {
        return this.zzd;
    }

    public final long zzd(zzaax zzaaxVar, boolean z10, boolean z11, int i10) throws IOException {
        if (this.zzc == 0) {
            if (!zzaaxVar.zzn(this.zzb, 0, 1, z10)) {
                return -1L;
            }
            int iZzb = zzb(this.zzb[0] & 255);
            this.zzd = iZzb;
            if (iZzb == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.zzc = 1;
        }
        int i11 = this.zzd;
        if (i11 > i10) {
            this.zzc = 0;
            return -2L;
        }
        if (i11 != 1) {
            ((zzaam) zzaaxVar).zzn(this.zzb, 1, i11 - 1, false);
        }
        this.zzc = 0;
        return zzc(this.zzb, this.zzd, z11);
    }

    public final void zze() {
        this.zzc = 0;
        this.zzd = 0;
    }
}
