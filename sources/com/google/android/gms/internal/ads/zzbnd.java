package com.google.android.gms.internal.ads;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzbnd implements zzbmp {
    private final zzbmr zza;
    private final zzbms zzb;
    private final zzbml zzc;
    private final String zzd;

    public zzbnd(zzbml zzbmlVar, String str, zzbms zzbmsVar, zzbmr zzbmrVar) {
        this.zzc = zzbmlVar;
        this.zzd = str;
        this.zzb = zzbmsVar;
        this.zza = zzbmrVar;
    }

    public static /* bridge */ /* synthetic */ void zzd(zzbnd zzbndVar, zzbmf zzbmfVar, zzbmm zzbmmVar, Object obj, zzcaj zzcajVar) {
        try {
            com.google.android.gms.ads.internal.zzt.zzp();
            String string = UUID.randomUUID().toString();
            zzbii.zzo.zzc(string, new zzbnc(zzbndVar, zzbmfVar, zzcajVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(FacebookMediationAdapter.KEY_ID, string);
            jSONObject.put("args", zzbndVar.zzb.zzb(obj));
            zzbmmVar.zzl(zzbndVar.zzd, jSONObject);
        } catch (Exception e10) {
            try {
                zzcajVar.zze(e10);
                zzbzr.zzh("Unable to invokeJavascript", e10);
            } finally {
                zzbmfVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfvj
    public final zzfwm zza(Object obj) throws Exception {
        return zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final zzfwm zzb(Object obj) {
        zzcaj zzcajVar = new zzcaj();
        zzbmf zzbmfVarZzb = this.zzc.zzb(null);
        zzbmfVarZzb.zzi(new zzbna(this, zzbmfVarZzb, obj, zzcajVar), new zzbnb(this, zzcajVar, zzbmfVarZzb));
        return zzcajVar;
    }
}
