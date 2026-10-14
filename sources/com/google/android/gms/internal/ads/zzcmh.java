package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcmh {
    private final Map zza;
    private final Map zzb;

    public zzcmh(Map map, Map map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public final void zza(zzezz zzezzVar) throws Exception {
        for (zzezx zzezxVar : zzezzVar.zzb.zzc) {
            if (this.zza.containsKey(zzezxVar.zza)) {
                ((zzcmk) this.zza.get(zzezxVar.zza)).zza(zzezxVar.zzb);
            } else if (this.zzb.containsKey(zzezxVar.zza)) {
                zzcmj zzcmjVar = (zzcmj) this.zzb.get(zzezxVar.zza);
                JSONObject jSONObject = zzezxVar.zzb;
                HashMap map = new HashMap();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String strOptString = jSONObject.optString(next);
                    if (strOptString != null) {
                        map.put(next, strOptString);
                    }
                }
                zzcmjVar.zza(map);
            }
        }
    }
}
