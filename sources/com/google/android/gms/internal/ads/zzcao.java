package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzcao implements zzfvy {
    public final /* synthetic */ zzcaq zza;

    public zzcao(zzcaq zzcaqVar) {
        this.zza = zzcaqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvy
    public final void zza(Throwable th) {
        this.zza.zzb.set(-1);
    }

    @Override // com.google.android.gms.internal.ads.zzfvy
    public final void zzb(Object obj) {
        this.zza.zzb.set(1);
    }
}
