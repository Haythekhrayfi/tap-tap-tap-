package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
final class zzbhq implements zzbij {
    @Override // com.google.android.gms.internal.ads.zzbij
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject jSONObjectZza;
        zzcez zzcezVar = (zzcez) obj;
        zzbee zzbeeVarZzK = zzcezVar.zzK();
        if (zzbeeVarZzK == null || (jSONObjectZza = zzbeeVarZzK.zza()) == null) {
            zzcezVar.zze("nativeAdViewSignalsReady", new JSONObject());
        } else {
            zzcezVar.zze("nativeAdViewSignalsReady", jSONObjectZza);
        }
    }
}
