package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzoz;

/* JADX INFO: loaded from: classes2.dex */
final class zzhy implements Runnable {
    public final /* synthetic */ zzai zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ boolean zzd;
    public final /* synthetic */ zzai zze;
    public final /* synthetic */ zzid zzf;

    public zzhy(zzid zzidVar, zzai zzaiVar, int i10, long j10, boolean z10, zzai zzaiVar2) {
        this.zzf = zzidVar;
        this.zza = zzaiVar;
        this.zzb = i10;
        this.zzc = j10;
        this.zzd = z10;
        this.zze = zzaiVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzf.zzV(this.zza);
        zzid.zzw(this.zzf, this.zza, this.zzb, this.zzc, false, this.zzd);
        zzoz.zzc();
        if (this.zzf.zzs.zzf().zzs(null, zzeb.zzas)) {
            zzid.zzv(this.zzf, this.zza, this.zze);
        }
    }
}
