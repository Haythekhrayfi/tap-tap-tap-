package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbxx {
    public static zzbxx zza;

    public static synchronized zzbxx zzd(Context context) {
        zzbxx zzbxxVar = zza;
        if (zzbxxVar != null) {
            return zzbxxVar;
        }
        Context applicationContext = context.getApplicationContext();
        zzbbm.zza(applicationContext);
        com.google.android.gms.ads.internal.util.zzg zzgVarZzh = com.google.android.gms.ads.internal.zzt.zzo().zzh();
        zzgVarZzh.zzr(applicationContext);
        zzbxb zzbxbVar = new zzbxb(null);
        zzbxbVar.zzb(applicationContext);
        zzbxbVar.zzc(com.google.android.gms.ads.internal.zzt.zzB());
        zzbxbVar.zza(zzgVarZzh);
        zzbxbVar.zzd(com.google.android.gms.ads.internal.zzt.zzn());
        zzbxx zzbxxVarZze = zzbxbVar.zze();
        zza = zzbxxVarZze;
        zzbxxVarZze.zza().zza();
        zza.zzb().zzc();
        zzbyb zzbybVarZzc = zza.zzc();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzar)).booleanValue()) {
            HashMap map = new HashMap();
            try {
                JSONObject jSONObject = new JSONObject((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzat));
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    HashSet hashSet = new HashSet();
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                    if (jSONArrayOptJSONArray != null) {
                        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                            String strOptString = jSONArrayOptJSONArray.optString(i10);
                            if (strOptString != null) {
                                hashSet.add(strOptString);
                            }
                        }
                        map.put(next, hashSet);
                    }
                }
                Iterator it = map.keySet().iterator();
                while (it.hasNext()) {
                    zzbybVarZzc.zzc((String) it.next());
                }
                zzbybVarZzc.zzd(new zzbxz(zzbybVarZzc, map));
            } catch (JSONException e10) {
                zzbzr.zzf("Failed to parse listening list", e10);
            }
        }
        return zza;
    }

    public abstract zzbwu zza();

    public abstract zzbwy zzb();

    public abstract zzbyb zzc();
}
