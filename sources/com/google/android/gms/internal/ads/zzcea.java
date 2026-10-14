package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzcea implements zzge {
    private final zzge zza;
    private final long zzb;
    private final zzge zzc;
    private long zzd;
    private Uri zze;

    public zzcea(zzge zzgeVar, int i10, zzge zzgeVar2) {
        this.zza = zzgeVar;
        this.zzb = i10;
        this.zzc = zzgeVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        long j10 = this.zzd;
        long j11 = this.zzb;
        if (j10 < j11) {
            int iZza = this.zza.zza(bArr, i10, (int) Math.min(i11, j11 - j10));
            long j12 = this.zzd + ((long) iZza);
            this.zzd = j12;
            i12 = iZza;
            j10 = j12;
        } else {
            i12 = 0;
        }
        if (j10 < this.zzb) {
            return i12;
        }
        int iZza2 = this.zzc.zza(bArr, i10 + i12, i11 - i12);
        int i13 = i12 + iZza2;
        this.zzd += (long) iZza2;
        return i13;
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final long zzb(zzgj zzgjVar) throws IOException {
        zzgj zzgjVar2;
        this.zze = zzgjVar.zza;
        long j10 = zzgjVar.zzf;
        long j11 = this.zzb;
        zzgj zzgjVar3 = null;
        if (j10 >= j11) {
            zzgjVar2 = null;
        } else {
            long j12 = zzgjVar.zzg;
            long jMin = j11 - j10;
            if (j12 != -1) {
                jMin = Math.min(j12, jMin);
            }
            zzgjVar2 = new zzgj(zzgjVar.zza, null, j10, j10, jMin, null, 0);
        }
        long j13 = zzgjVar.zzg;
        if (j13 == -1 || zzgjVar.zzf + j13 > this.zzb) {
            long jMax = Math.max(this.zzb, zzgjVar.zzf);
            long j14 = zzgjVar.zzg;
            zzgjVar3 = new zzgj(zzgjVar.zza, null, jMax, jMax, j14 != -1 ? Math.min(j14, (zzgjVar.zzf + j14) - this.zzb) : -1L, null, 0);
        }
        long jZzb = zzgjVar2 != null ? this.zza.zzb(zzgjVar2) : 0L;
        long jZzb2 = zzgjVar3 != null ? this.zzc.zzb(zzgjVar3) : 0L;
        this.zzd = zzgjVar.zzf;
        if (jZzb == -1 || jZzb2 == -1) {
            return -1L;
        }
        return jZzb + jZzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final void zzd() throws IOException {
        this.zza.zzd();
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final Map zze() {
        return zzfsf.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final void zzf(zzhg zzhgVar) {
    }
}
