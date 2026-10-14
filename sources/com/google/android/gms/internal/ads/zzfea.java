package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzfea implements zzfvy {
    public final /* synthetic */ zzfdq zza;
    public final /* synthetic */ zzfec zzb;

    public zzfea(zzfec zzfecVar, zzfdq zzfdqVar) {
        this.zzb = zzfecVar;
        this.zza = zzfdqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvy
    public final void zza(Throwable th) {
        this.zzb.zza.zzd.zzb(this.zza, th);
    }

    @Override // com.google.android.gms.internal.ads.zzfvy
    public final void zzb(Object obj) {
        this.zzb.zza.zzd.zzd(this.zza);
    }
}
