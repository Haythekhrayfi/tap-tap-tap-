package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzbmd implements zzcan {
    public final /* synthetic */ zzbmf zza;

    public zzbmd(zzbmf zzbmfVar) {
        this.zza = zzbmfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("Releasing engine reference.");
        this.zza.zzb.zzd();
    }
}
