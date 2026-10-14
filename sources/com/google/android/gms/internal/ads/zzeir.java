package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzeir implements zzekb {
    public final /* synthetic */ zzeis zza;

    public zzeir(zzeis zzeisVar) {
        this.zza = zzeisVar;
    }

    @Override // com.google.android.gms.internal.ads.zzekb
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzekb
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcpb zzcpbVar = (zzcpb) obj;
        synchronized (this.zza) {
            zzeis zzeisVar = this.zza;
            if (zzeisVar.zzi != null) {
                zzeisVar.zzi.zzb();
            }
            this.zza.zzi = zzcpbVar;
            this.zza.zzi.zzj();
        }
    }
}
