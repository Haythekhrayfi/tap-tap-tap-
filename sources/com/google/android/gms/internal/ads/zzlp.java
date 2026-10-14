package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class zzlp implements zzkl {
    private final zzdz zza;
    private boolean zzb;
    private long zzc;
    private long zzd;
    private zzch zze = zzch.zza;

    public zzlp(zzdz zzdzVar) {
        this.zza = zzdzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final long zza() {
        long j10 = this.zzc;
        if (!this.zzb) {
            return j10;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.zzd;
        zzch zzchVar = this.zze;
        return j10 + (zzchVar.zzc == 1.0f ? zzfj.zzo(jElapsedRealtime) : zzchVar.zza(jElapsedRealtime));
    }

    public final void zzb(long j10) {
        this.zzc = j10;
        if (this.zzb) {
            this.zzd = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final zzch zzc() {
        return this.zze;
    }

    public final void zzd() {
        if (this.zzb) {
            return;
        }
        this.zzd = SystemClock.elapsedRealtime();
        this.zzb = true;
    }

    public final void zze() {
        if (this.zzb) {
            zzb(zza());
            this.zzb = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final void zzg(zzch zzchVar) {
        if (this.zzb) {
            zzb(zza());
        }
        this.zze = zzchVar;
    }
}
