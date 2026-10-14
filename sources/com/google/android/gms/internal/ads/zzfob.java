package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzfob extends zzfnx {
    public final /* synthetic */ zzfoh zza;

    public zzfob(zzfoh zzfohVar) {
        this.zza = zzfohVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfnx
    public final void zza() {
        synchronized (this.zza.zzg) {
            if (this.zza.zzl.get() > 0 && this.zza.zzl.decrementAndGet() > 0) {
                this.zza.zzc.zzc("Leaving the connection open for other ongoing calls.", new Object[0]);
                return;
            }
            zzfoh zzfohVar = this.zza;
            if (zzfohVar.zzn != null) {
                zzfohVar.zzc.zzc("Unbind from service.", new Object[0]);
                zzfoh zzfohVar2 = this.zza;
                zzfohVar2.zzb.unbindService(zzfohVar2.zzm);
                this.zza.zzh = false;
                this.zza.zzn = null;
                this.zza.zzm = null;
            }
            this.zza.zzw();
        }
    }
}
