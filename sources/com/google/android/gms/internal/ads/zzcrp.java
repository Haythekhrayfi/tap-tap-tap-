package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzcrp implements zzfvy {
    public final /* synthetic */ zzfvy zza;
    public final /* synthetic */ zzcrr zzb;

    public zzcrp(zzcrr zzcrrVar, zzfvy zzfvyVar) {
        this.zzb = zzcrrVar;
        this.zza = zzfvyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvy
    public final void zza(Throwable th) {
        this.zza.zza(th);
        zzcae.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcro
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfvy
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcrr.zzb(this.zzb, ((zzcrk) obj).zza, this.zza);
    }
}
