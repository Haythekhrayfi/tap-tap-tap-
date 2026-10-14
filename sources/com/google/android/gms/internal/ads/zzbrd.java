package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzbrd extends zzbfu {
    public final /* synthetic */ zzbrg zza;

    public /* synthetic */ zzbrd(zzbrg zzbrgVar, zzbrc zzbrcVar) {
        this.zza = zzbrgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfv
    public final void zze(zzbfl zzbflVar, String str) {
        zzbrg zzbrgVar = this.zza;
        if (zzbrgVar.zzb == null) {
            return;
        }
        zzbrgVar.zzb.onCustomClick(zzbrgVar.zzf(zzbflVar), str);
    }
}
