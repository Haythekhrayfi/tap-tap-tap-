package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzbir implements com.google.android.gms.ads.internal.overlay.zzx {
    public boolean zza = false;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ com.google.android.gms.ads.internal.client.zza zzc;
    public final /* synthetic */ Map zzd;
    public final /* synthetic */ Map zze;

    public zzbir(zzbit zzbitVar, boolean z10, com.google.android.gms.ads.internal.client.zza zzaVar, Map map, Map map2) {
        this.zzb = z10;
        this.zzc = zzaVar;
        this.zzd = map;
        this.zze = map2;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzx
    public final void zza(boolean z10) {
        if (this.zza) {
            return;
        }
        if (z10 && this.zzb) {
            ((zzdcu) this.zzc).zzr();
        }
        this.zza = true;
        this.zzd.put((String) this.zze.get("event_id"), Boolean.valueOf(z10));
        ((zzblc) this.zzc).zzd("openIntentAsync", this.zzd);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzx
    public final void zzb(int i10) {
    }
}
