package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzblw implements zzbij {
    public final /* synthetic */ long zza;
    public final /* synthetic */ zzbmk zzb;
    public final /* synthetic */ zzblg zzc;
    public final /* synthetic */ zzbml zzd;

    public zzblw(zzbml zzbmlVar, long j10, zzbmk zzbmkVar, zzblg zzblgVar) {
        this.zzd = zzbmlVar;
        this.zza = j10;
        this.zzb = zzbmkVar;
        this.zzc = zzblgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbij
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        com.google.android.gms.ads.internal.util.zze.zza("onGmsg /jsLoaded. JsLoaded latency is " + (com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - this.zza) + " ms.");
        synchronized (this.zzd.zza) {
            if (this.zzb.zze() != -1 && this.zzb.zze() != 1) {
                this.zzd.zzi = 0;
                zzblg zzblgVar = this.zzc;
                zzblgVar.zzq("/log", zzbii.zzg);
                zzblgVar.zzq("/result", zzbii.zzo);
                this.zzb.zzh(this.zzc);
                this.zzd.zzh = this.zzb;
                com.google.android.gms.ads.internal.util.zze.zza("Successfully loaded JS Engine.");
            }
        }
    }
}
