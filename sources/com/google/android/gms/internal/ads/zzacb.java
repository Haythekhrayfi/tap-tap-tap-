package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzacb {
    private final byte[] zza;
    private final int zzb;
    private int zzc;
    private int zzd;

    public zzacb(byte[] bArr) {
        this.zza = bArr;
        this.zzb = bArr.length;
    }

    public final int zza() {
        return (this.zzc * 8) + this.zzd;
    }

    public final int zzb(int i10) {
        int i11 = this.zzc;
        int i12 = i11 + 1;
        int iMin = Math.min(i10, 8 - this.zzd);
        int i13 = ((this.zza[i11] & 255) >> this.zzd) & (255 >> (8 - iMin));
        while (iMin < i10) {
            i13 |= (this.zza[i12] & 255) << iMin;
            iMin += 8;
            i12++;
        }
        int i14 = i13 & ((-1) >>> (32 - i10));
        zzc(i10);
        return i14;
    }

    public final void zzc(int i10) {
        int i11;
        int i12 = i10 / 8;
        int i13 = this.zzc + i12;
        this.zzc = i13;
        int i14 = (i10 - (i12 * 8)) + this.zzd;
        this.zzd = i14;
        if (i14 > 7) {
            i13++;
            this.zzc = i13;
            i14 -= 8;
            this.zzd = i14;
        }
        boolean z10 = false;
        if (i13 >= 0 && (i13 < (i11 = this.zzb) || (i13 == i11 && i14 == 0))) {
            z10 = true;
        }
        zzdy.zzf(z10);
    }

    public final boolean zzd() {
        int i10 = (this.zza[this.zzc] & 255) >> this.zzd;
        zzc(1);
        return 1 == (i10 & 1);
    }
}
