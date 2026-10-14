package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzbgt extends zzbfu {
    public final /* synthetic */ zzbgw zza;

    public /* synthetic */ zzbgt(zzbgw zzbgwVar, zzbgs zzbgsVar) {
        this.zza = zzbgwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfv
    public final void zze(zzbfl zzbflVar, String str) {
        zzbgw zzbgwVar = this.zza;
        if (zzbgwVar.zzb == null) {
            return;
        }
        zzbgwVar.zzb.onCustomClick(zzbgwVar.zzf(zzbflVar), str);
    }
}
