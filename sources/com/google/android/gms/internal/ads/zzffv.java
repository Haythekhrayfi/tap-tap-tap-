package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzffv implements zzfvy {
    public final /* synthetic */ zzffy zza;
    public final /* synthetic */ zzffn zzb;
    public final /* synthetic */ boolean zzc;

    public zzffv(zzffy zzffyVar, zzffn zzffnVar, boolean z10) {
        this.zza = zzffyVar;
        this.zzb = zzffnVar;
        this.zzc = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzfvy
    public final void zza(Throwable th) {
        zzffn zzffnVar = this.zzb;
        if (zzffnVar.zzj()) {
            zzffy zzffyVar = this.zza;
            zzffnVar.zzg(th);
            zzffnVar.zzf(false);
            zzffyVar.zza(zzffnVar);
            if (this.zzc) {
                this.zza.zzg();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfvy
    public final void zzb(Object obj) {
        zzffy zzffyVar = this.zza;
        zzffn zzffnVar = this.zzb;
        zzffnVar.zzf(true);
        zzffyVar.zza(zzffnVar);
        if (this.zzc) {
            this.zza.zzg();
        }
    }
}
