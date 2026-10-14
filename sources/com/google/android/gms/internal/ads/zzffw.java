package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzffw implements zzfvy {
    public final /* synthetic */ zzffy zza;
    public final /* synthetic */ zzffn zzb;

    public zzffw(zzffy zzffyVar, zzffn zzffnVar) {
        this.zza = zzffyVar;
        this.zzb = zzffnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvy
    public final void zza(Throwable th) {
        zzffy zzffyVar = this.zza;
        zzffn zzffnVar = this.zzb;
        zzffnVar.zzg(th);
        zzffnVar.zzf(false);
        zzffyVar.zza(zzffnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfvy
    public final void zzb(Object obj) {
    }
}
