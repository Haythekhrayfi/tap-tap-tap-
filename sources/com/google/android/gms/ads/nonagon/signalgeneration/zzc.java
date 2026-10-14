package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzcae;
import com.google.android.gms.internal.ads.zzdpv;
import com.google.android.gms.internal.ads.zzdqf;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzc {
    private final zzdqf zzh;
    private Map zzi;
    private final ArrayDeque zzf = new ArrayDeque();
    private final ArrayDeque zzg = new ArrayDeque();
    private final int zza = ((Integer) zzba.zzc().zzb(zzbbm.zzgL)).intValue();
    private final long zzb = ((Long) zzba.zzc().zzb(zzbbm.zzgM)).longValue();
    private final boolean zzc = ((Boolean) zzba.zzc().zzb(zzbbm.zzgR)).booleanValue();
    private final boolean zzd = ((Boolean) zzba.zzc().zzb(zzbbm.zzgP)).booleanValue();
    private final Map zze = Collections.synchronizedMap(new zzb(this));

    public zzc(zzdqf zzdqfVar) {
        this.zzh = zzdqfVar;
    }

    private final synchronized void zzg(final zzdpv zzdpvVar) {
        if (this.zzc) {
            final ArrayDeque arrayDequeClone = this.zzg.clone();
            this.zzg.clear();
            final ArrayDeque arrayDequeClone2 = this.zzf.clone();
            this.zzf.clear();
            zzcae.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zza
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zze(zzdpvVar, arrayDequeClone, arrayDequeClone2);
                }
            });
        }
    }

    private final void zzh(zzdpv zzdpvVar, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(zzdpvVar.zza());
            this.zzi = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.zzi.put("e_r", str);
            this.zzi.put("e_id", (String) pair2.first);
            if (this.zzd) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(zzf.zza(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                zzj(this.zzi, "e_type", (String) pair.first);
                zzj(this.zzi, "e_agent", (String) pair.second);
            }
            this.zzh.zze(this.zzi);
        }
    }

    private final synchronized void zzi() {
        try {
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
            try {
                Iterator it = this.zze.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (jCurrentTimeMillis - ((Long) ((Pair) entry.getValue()).first).longValue() <= this.zzb) {
                        break;
                    }
                    this.zzg.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
                    it.remove();
                    throw th;
                }
            } catch (ConcurrentModificationException e10) {
                com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "QueryJsonMap.removeExpiredEntries");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private static final void zzj(Map map, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }

    public final synchronized String zzb(String str, zzdpv zzdpvVar) {
        Pair pair = (Pair) this.zze.get(str);
        zzdpvVar.zza().put("rid", str);
        if (pair == null) {
            zzdpvVar.zza().put("mhit", "false");
            return null;
        }
        String str2 = (String) pair.second;
        this.zze.remove(str);
        zzdpvVar.zza().put("mhit", "true");
        return str2;
    }

    public final synchronized void zzd(String str, String str2, zzdpv zzdpvVar) {
        this.zze.put(str, new Pair(Long.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()), str2));
        zzi();
        zzg(zzdpvVar);
    }

    public final /* synthetic */ void zze(zzdpv zzdpvVar, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) {
        zzh(zzdpvVar, arrayDeque, "to");
        zzh(zzdpvVar, arrayDeque2, "of");
    }

    public final synchronized void zzf(String str) {
        this.zze.remove(str);
    }
}
