package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeho implements zzecc {
    private final Context zza;
    private final zzcpy zzb;
    private final zzbck zzc;
    private final zzfwn zzd;
    private final zzfel zze;

    public zzeho(Context context, zzcpy zzcpyVar, zzfel zzfelVar, zzfwn zzfwnVar, zzbck zzbckVar) {
        this.zza = context;
        this.zzb = zzcpyVar;
        this.zze = zzfelVar;
        this.zzd = zzfwnVar;
        this.zzc = zzbckVar;
    }

    @Override // com.google.android.gms.internal.ads.zzecc
    public final zzfwm zza(zzezz zzezzVar, zzezn zzeznVar) {
        zzcpc zzcpcVarZza = this.zzb.zza(new zzcrs(zzezzVar, zzeznVar, null), new zzehm(this, new View(this.zza), null, new zzcrb() { // from class: com.google.android.gms.internal.ads.zzehk
            @Override // com.google.android.gms.internal.ads.zzcrb
            public final com.google.android.gms.ads.internal.client.zzdq zza() {
                return null;
            }
        }, (zzezo) zzeznVar.zzv.get(0)));
        zzehn zzehnVarZzk = zzcpcVarZza.zzk();
        zzezs zzezsVar = zzeznVar.zzt;
        final zzbcf zzbcfVar = new zzbcf(zzehnVarZzk, zzezsVar.zzb, zzezsVar.zza);
        zzfel zzfelVar = this.zze;
        return zzfdv.zzd(new zzfdp() { // from class: com.google.android.gms.internal.ads.zzehl
            @Override // com.google.android.gms.internal.ads.zzfdp
            public final void zza() throws Exception {
                this.zza.zzc(zzbcfVar);
            }
        }, this.zzd, zzfef.CUSTOM_RENDER_SYN, zzfelVar).zzb(zzfef.CUSTOM_RENDER_ACK).zzd(zzfwc.zzh(zzcpcVarZza.zza())).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzecc
    public final boolean zzb(zzezz zzezzVar, zzezn zzeznVar) {
        zzezs zzezsVar;
        return (this.zzc == null || (zzezsVar = zzeznVar.zzt) == null || zzezsVar.zza == null) ? false : true;
    }

    public final /* synthetic */ void zzc(zzbcf zzbcfVar) throws Exception {
        this.zzc.zze(zzbcfVar);
    }
}
