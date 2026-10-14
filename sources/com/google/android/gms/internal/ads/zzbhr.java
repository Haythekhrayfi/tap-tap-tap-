package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
final class zzbhr implements zzbij {
    @Override // com.google.android.gms.internal.ads.zzbij
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject jSONObjectZzb;
        zzcez zzcezVar = (zzcez) obj;
        zzbee zzbeeVarZzK = zzcezVar.zzK();
        if (zzbeeVarZzK == null || (jSONObjectZzb = zzbeeVarZzK.zzb()) == null) {
            zzcezVar.zze("nativeClickMetaReady", new JSONObject());
        } else {
            zzcezVar.zze("nativeClickMetaReady", jSONObjectZzb);
        }
    }
}
