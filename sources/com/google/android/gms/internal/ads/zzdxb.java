package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdxb {
    private final zzfwn zza;
    private final zzdww zzb;
    private final zzfel zzc;

    public zzdxb(zzfwn zzfwnVar, zzdww zzdwwVar, zzfel zzfelVar) {
        this.zza = zzfwnVar;
        this.zzb = zzdwwVar;
        this.zzc = zzfelVar;
    }

    public final zzfwm zza(final zzbue zzbueVar) {
        zzfec zzfecVarZzb = this.zzc.zzb(zzfef.GMS_SIGNALS, zzfwc.zzl(zzfwc.zzh(null), new zzfov() { // from class: com.google.android.gms.internal.ads.zzdwy
            @Override // com.google.android.gms.internal.ads.zzfov
            public final Object apply(Object obj) {
                zzbue zzbueVar2 = zzbueVar;
                return new zzbti(zzbueVar2.zzc, zzbueVar2.zzd, zzbueVar2.zzf, zzfpw.zzc(zzbueVar2.zza.getString("ms")), -1, zzbueVar2.zzh, zzbueVar2.zze, zzbueVar2.zzk, zzbueVar2.zzl);
            }
        }, this.zza));
        final zzdww zzdwwVar = this.zzb;
        return zzfwc.zzl(zzfecVarZzb.zzf(new zzfvj() { // from class: com.google.android.gms.internal.ads.zzdwz
            @Override // com.google.android.gms.internal.ads.zzfvj
            public final zzfwm zza(Object obj) {
                return zzdwwVar.zzb((zzbti) obj);
            }
        }).zza(), new zzfov() { // from class: com.google.android.gms.internal.ads.zzdxa
            @Override // com.google.android.gms.internal.ads.zzfov
            public final Object apply(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                Bundle bundle = zzbueVar.zza;
                if (bundle == null) {
                    return jSONObject;
                }
                try {
                    JSONObject jSONObjectZzh = com.google.android.gms.ads.internal.client.zzay.zzb().zzh(bundle);
                    try {
                        com.google.android.gms.ads.internal.client.zzay.zzb().zzk(jSONObject, jSONObjectZzh);
                        return jSONObject;
                    } catch (JSONException unused) {
                        return jSONObjectZzh;
                    }
                } catch (JSONException unused2) {
                    return jSONObject;
                }
            }
        }, this.zza);
    }
}
