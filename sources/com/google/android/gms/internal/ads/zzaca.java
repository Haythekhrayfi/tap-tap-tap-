package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaca {
    private final byte[] zza = new byte[10];
    private boolean zzb;
    private int zzc;
    private long zzd;
    private int zze;
    private int zzf;
    private int zzg;

    public final void zza(zzabz zzabzVar, zzaby zzabyVar) {
        if (this.zzc > 0) {
            zzabzVar.zzs(this.zzd, this.zze, this.zzf, this.zzg, zzabyVar);
            this.zzc = 0;
        }
    }

    public final void zzb() {
        this.zzb = false;
        this.zzc = 0;
    }

    public final void zzc(zzabz zzabzVar, long j10, int i10, int i11, int i12, zzaby zzabyVar) {
        if (this.zzg > i11 + i12) {
            throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
        }
        if (this.zzb) {
            int i13 = this.zzc;
            int i14 = i13 + 1;
            this.zzc = i14;
            if (i13 == 0) {
                this.zzd = j10;
                this.zze = i10;
                this.zzf = 0;
            }
            this.zzf += i11;
            this.zzg = i12;
            if (i14 >= 16) {
                zza(zzabzVar, zzabyVar);
            }
        }
    }

    public final void zzd(zzaax zzaaxVar) throws IOException {
        if (this.zzb) {
            return;
        }
        zzaaxVar.zzh(this.zza, 0, 10);
        zzaaxVar.zzj();
        byte[] bArr = this.zza;
        int i10 = zzzx.zza;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.zzb = true;
        }
    }
}
