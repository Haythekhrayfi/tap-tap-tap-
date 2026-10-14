package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzevs implements zzekb {
    public final /* synthetic */ zzevt zza;

    public zzevs(zzevt zzevtVar) {
        this.zza = zzevtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzekb
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzekb
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcov zzcovVar = (zzcov) obj;
        synchronized (this.zza) {
            zzcov zzcovVar2 = this.zza.zza;
            if (zzcovVar2 != null) {
                zzcovVar2.zzb();
            }
            zzevt zzevtVar = this.zza;
            zzevtVar.zza = zzcovVar;
            zzcovVar.zzc(zzevtVar);
            zzevt zzevtVar2 = this.zza;
            zzevtVar2.zzg.zzl(new zzcow(zzcovVar, zzevtVar2, zzevtVar2.zzg, zzevtVar2.zzi));
            zzcovVar.zzj();
        }
    }
}
