package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcdm implements zzbij {
    private static final Integer zzb(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            zzbzr.zzj("Precache invalid numeric parameter '" + str + "': " + ((String) map.get(str)));
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbij
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcdl zzcdoVar;
        zzcdd zzcddVarZza;
        zzcca zzccaVar = (zzcca) obj;
        if (zzbzr.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            zzbzr.zze("Precache GMSG: ".concat(jSONObject.toString()));
        }
        zzcde zzcdeVarZzy = com.google.android.gms.ads.internal.zzt.zzy();
        if (map.containsKey("abort")) {
            if (zzcdeVarZzy.zzd(zzccaVar)) {
                return;
            }
            zzbzr.zzj("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        Integer numZzb = zzb(map, "periodicReportIntervalMs");
        Integer numZzb2 = zzb(map, "exoPlayerRenderingIntervalMs");
        Integer numZzb3 = zzb(map, "exoPlayerIdleIntervalMs");
        zzcbz zzcbzVar = new zzcbz((String) map.get("flags"));
        boolean z10 = zzcbzVar.zzl;
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        strArr2[i10] = jSONArray.getString(i10);
                    }
                    strArr = strArr2;
                } catch (JSONException unused) {
                    zzbzr.zzj("Malformed demuxed URL list for precache: ".concat(str2));
                    strArr = null;
                }
            }
            if (strArr == null) {
                strArr = new String[]{str};
            }
            if (z10) {
                Iterator it = zzcdeVarZzy.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        zzcddVarZza = null;
                        break;
                    }
                    zzcdd zzcddVar = (zzcdd) it.next();
                    if (zzcddVar.zza == zzccaVar && str.equals(zzcddVar.zze())) {
                        zzcddVarZza = zzcddVar;
                        break;
                    }
                }
            } else {
                zzcddVarZza = zzcdeVarZzy.zza(zzccaVar);
            }
            if (zzcddVarZza != null) {
                zzbzr.zzj("Precache task is already running.");
                return;
            }
            if (zzccaVar.zzj() == null) {
                zzbzr.zzj("Precache requires a dependency provider.");
                return;
            }
            Integer numZzb4 = zzb(map, "player");
            if (numZzb4 == null) {
                numZzb4 = 0;
            }
            if (numZzb != null) {
                zzccaVar.zzA(numZzb.intValue());
            }
            if (numZzb2 != null) {
                zzccaVar.zzy(numZzb2.intValue());
            }
            if (numZzb3 != null) {
                zzccaVar.zzx(numZzb3.intValue());
            }
            int iIntValue = numZzb4.intValue();
            zzccx zzccxVar = zzccaVar.zzj().zzb;
            if (iIntValue > 0) {
                int iZzu = zzcbr.zzu();
                zzcdoVar = iZzu < zzcbzVar.zzh ? new zzcdu(zzccaVar, zzcbzVar) : iZzu < zzcbzVar.zzb ? new zzcdr(zzccaVar, zzcbzVar) : new zzcdp(zzccaVar);
            } else {
                zzcdoVar = new zzcdo(zzccaVar);
            }
            new zzcdd(zzccaVar, zzcdoVar, str, strArr).zzb();
        } else {
            zzcdd zzcddVarZza2 = zzcdeVarZzy.zza(zzccaVar);
            if (zzcddVarZza2 == null) {
                zzbzr.zzj("Precache must specify a source.");
                return;
            }
            zzcdoVar = zzcddVarZza2.zzb;
        }
        Integer numZzb5 = zzb(map, "minBufferMs");
        if (numZzb5 != null) {
            zzcdoVar.zzs(numZzb5.intValue());
        }
        Integer numZzb6 = zzb(map, "maxBufferMs");
        if (numZzb6 != null) {
            zzcdoVar.zzr(numZzb6.intValue());
        }
        Integer numZzb7 = zzb(map, "bufferForPlaybackMs");
        if (numZzb7 != null) {
            zzcdoVar.zzp(numZzb7.intValue());
        }
        Integer numZzb8 = zzb(map, "bufferForPlaybackAfterRebufferMs");
        if (numZzb8 != null) {
            zzcdoVar.zzq(numZzb8.intValue());
        }
    }
}
