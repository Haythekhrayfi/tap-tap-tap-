package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzbwm implements zzfvy {
    public final /* synthetic */ zzfwm zza;

    public zzbwm(zzbwn zzbwnVar, zzfwm zzfwmVar) {
        this.zza = zzfwmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvy
    public final void zza(Throwable th) {
        zzbwn.zzc.remove(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfvy
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzbwn.zzc.remove(this.zza);
    }
}
