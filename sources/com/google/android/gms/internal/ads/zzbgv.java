package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzbgv extends zzbfx {
    public final /* synthetic */ zzbgw zza;

    public /* synthetic */ zzbgv(zzbgw zzbgwVar, zzbgu zzbguVar) {
        this.zza = zzbgwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfy
    public final void zze(zzbfl zzbflVar) {
        zzbgw zzbgwVar = this.zza;
        zzbgwVar.zza.onCustomTemplateAdLoaded(zzbgwVar.zzf(zzbflVar));
    }
}
