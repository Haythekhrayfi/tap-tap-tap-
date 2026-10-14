package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzejt implements zzekb {
    public final /* synthetic */ zzeju zza;

    public zzejt(zzeju zzejuVar) {
        this.zza = zzejuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzekb
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzj = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzekb
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzddn zzddnVar = (zzddn) obj;
        synchronized (this.zza) {
            this.zza.zzj = zzddnVar;
            this.zza.zzj.zzj();
        }
    }
}
