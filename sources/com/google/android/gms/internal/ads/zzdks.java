package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdks {
    private final Executor zza;
    private final zzcoh zzb;
    private final zzdco zzc;

    public zzdks(Executor executor, zzcoh zzcohVar, zzdco zzdcoVar) {
        this.zza = executor;
        this.zzc = zzdcoVar;
        this.zzb = zzcohVar;
    }

    public final void zza(final zzcez zzcezVar) {
        if (zzcezVar == null) {
            return;
        }
        this.zzc.zza(zzcezVar.zzF());
        this.zzc.zzm(new zzaua() { // from class: com.google.android.gms.internal.ads.zzdko
            @Override // com.google.android.gms.internal.ads.zzaua
            public final void zzc(zzatz zzatzVar) {
                zzcgm zzcgmVarZzN = zzcezVar.zzN();
                Rect rect = zzatzVar.zzd;
                zzcgmVarZzN.zzp(rect.left, rect.top, false);
            }
        }, this.zza);
        this.zzc.zzm(new zzaua() { // from class: com.google.android.gms.internal.ads.zzdkp
            @Override // com.google.android.gms.internal.ads.zzaua
            public final void zzc(zzatz zzatzVar) {
                zzcez zzcezVar2 = zzcezVar;
                HashMap map = new HashMap();
                map.put("isVisible", true != zzatzVar.zzj ? "0" : "1");
                zzcezVar2.zzd("onAdVisibilityChanged", map);
            }
        }, this.zza);
        this.zzc.zzm(this.zzb, this.zza);
        this.zzb.zzf(zzcezVar);
        zzcezVar.zzad("/trackActiveViewUnit", new zzbij() { // from class: com.google.android.gms.internal.ads.zzdkq
            @Override // com.google.android.gms.internal.ads.zzbij
            public final void zza(Object obj, Map map) {
                this.zza.zzb((zzcez) obj, map);
            }
        });
        zzcezVar.zzad("/untrackActiveViewUnit", new zzbij() { // from class: com.google.android.gms.internal.ads.zzdkr
            @Override // com.google.android.gms.internal.ads.zzbij
            public final void zza(Object obj, Map map) {
                this.zza.zzc((zzcez) obj, map);
            }
        });
    }

    public final /* synthetic */ void zzb(zzcez zzcezVar, Map map) {
        this.zzb.zzb();
    }

    public final /* synthetic */ void zzc(zzcez zzcezVar, Map map) {
        this.zzb.zza();
    }
}
