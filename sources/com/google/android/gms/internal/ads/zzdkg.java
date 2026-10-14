package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdkg {
    private final Executor zza;
    private final zzdkb zzb;

    public zzdkg(Executor executor, zzdkb zzdkbVar) {
        this.zza = executor;
        this.zzb = zzdkbVar;
    }

    public final zzfwm zza(JSONObject jSONObject, String str) {
        final String strOptString;
        zzfwm zzfwmVarZzl;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("custom_assets");
        if (jSONArrayOptJSONArray == null) {
            return zzfwc.zzh(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArrayOptJSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
            zzdkf zzdkfVar = null;
            if (jSONObjectOptJSONObject == null || (strOptString = jSONObjectOptJSONObject.optString("name")) == null) {
                zzfwmVarZzl = zzfwc.zzh(zzdkfVar);
            } else {
                String strOptString2 = jSONObjectOptJSONObject.optString("type");
                if ("string".equals(strOptString2)) {
                    zzdkfVar = new zzdkf(strOptString, jSONObjectOptJSONObject.optString("string_value"));
                } else if ("image".equals(strOptString2)) {
                    zzfwmVarZzl = zzfwc.zzl(this.zzb.zze(jSONObjectOptJSONObject, "image_value"), new zzfov() { // from class: com.google.android.gms.internal.ads.zzdkd
                        @Override // com.google.android.gms.internal.ads.zzfov
                        public final Object apply(Object obj) {
                            return new zzdkf(strOptString, (zzbed) obj);
                        }
                    }, this.zza);
                }
                zzfwmVarZzl = zzfwc.zzh(zzdkfVar);
            }
            arrayList.add(zzfwmVarZzl);
        }
        return zzfwc.zzl(zzfwc.zzd(arrayList), new zzfov() { // from class: com.google.android.gms.internal.ads.zzdke
            @Override // com.google.android.gms.internal.ads.zzfov
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (zzdkf zzdkfVar2 : (List) obj) {
                    if (zzdkfVar2 != null) {
                        arrayList2.add(zzdkfVar2);
                    }
                }
                return arrayList2;
            }
        }, this.zza);
    }
}
