package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdsx implements zzdtv, zzdsi {
    private final zzdtf zza;
    private final zzdtw zzb;
    private final zzdsj zzc;
    private final zzdss zzd;
    private final zzdsh zze;
    private final zzdtr zzf;
    private final String zzg;

    @Nullable
    private final String zzh;
    private JSONObject zzm;
    private boolean zzp;
    private int zzq;
    private boolean zzr;
    private final Map zzi = new HashMap();
    private final Map zzj = new HashMap();
    private final Map zzk = new HashMap();
    private String zzl = "{}";
    private long zzn = RecyclerView.FOREVER_NS;
    private zzdst zzo = zzdst.NONE;
    private zzdsw zzs = zzdsw.UNKNOWN;

    public zzdsx(zzdtf zzdtfVar, zzdtw zzdtwVar, zzdsj zzdsjVar, Context context, zzbzx zzbzxVar, zzdss zzdssVar, zzdtr zzdtrVar, @Nullable String str) {
        this.zza = zzdtfVar;
        this.zzb = zzdtwVar;
        this.zzc = zzdsjVar;
        this.zze = new zzdsh(context);
        this.zzg = zzbzxVar.zza;
        this.zzh = str;
        this.zzd = zzdssVar;
        this.zzf = zzdtrVar;
        com.google.android.gms.ads.internal.zzt.zzs().zzg(this);
    }

    private final synchronized JSONObject zzq() throws JSONException {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        for (Map.Entry entry : this.zzi.entrySet()) {
            JSONArray jSONArray = new JSONArray();
            for (zzdsl zzdslVar : (List) entry.getValue()) {
                if (zzdslVar.zzg()) {
                    jSONArray.put(zzdslVar.zzd());
                }
            }
            if (jSONArray.length() > 0) {
                jSONObject.put((String) entry.getKey(), jSONArray);
            }
        }
        return jSONObject;
    }

    private final void zzr() {
        this.zzr = true;
        this.zzd.zzc();
        this.zza.zzh(this);
        this.zzb.zzc(this);
        this.zzc.zzc(this);
        this.zzf.zzf(this);
        zzx(com.google.android.gms.ads.internal.zzt.zzo().zzh().zzo());
    }

    private final void zzs() {
        com.google.android.gms.ads.internal.zzt.zzo().zzh().zzG(zzd());
    }

    private final synchronized void zzt(zzdst zzdstVar, boolean z10) {
        if (this.zzo == zzdstVar) {
            return;
        }
        if (zzo()) {
            zzv();
        }
        this.zzo = zzdstVar;
        if (zzo()) {
            zzw();
        }
        if (z10) {
            zzs();
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002b A[Catch: all -> 0x003d, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x000b, B:11:0x001d, B:13:0x0027, B:18:0x0036, B:14:0x002b, B:16:0x0031), top: B:26:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[Catch: all -> 0x003d, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x000b, B:11:0x001d, B:13:0x0027, B:18:0x0036, B:14:0x002b, B:16:0x0031), top: B:26:0x0001 }] */
    private final synchronized void zzu(boolean z10, boolean z11) {
        if (this.zzp == z10) {
            return;
        }
        this.zzp = z10;
        if (z10) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zziJ)).booleanValue() || !com.google.android.gms.ads.internal.zzt.zzs().zzl()) {
                zzw();
            } else if (!zzo()) {
                zzv();
            }
        } else if (!zzo()) {
            zzv();
        }
        if (z11) {
            zzs();
        }
    }

    private final synchronized void zzv() {
        zzdst zzdstVar = zzdst.NONE;
        int iOrdinal = this.zzo.ordinal();
        if (iOrdinal == 1) {
            this.zzb.zza();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.zzc.zza();
        }
    }

    private final synchronized void zzw() {
        zzdst zzdstVar = zzdst.NONE;
        int iOrdinal = this.zzo.ordinal();
        if (iOrdinal == 1) {
            this.zzb.zzb();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.zzc.zzb();
        }
    }

    private final synchronized void zzx(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzu(jSONObject.optBoolean("isTestMode", false), false);
            zzt((zzdst) Enum.valueOf(zzdst.class, jSONObject.optString("gesture", "NONE")), false);
            this.zzl = jSONObject.optString("networkExtras", "{}");
            this.zzn = jSONObject.optLong("networkExtrasExpirationSecs", RecyclerView.FOREVER_NS);
        } catch (JSONException unused) {
        }
    }

    public final zzdst zza() {
        return this.zzo;
    }

    public final synchronized zzfwm zzb(String str) {
        zzcaj zzcajVar;
        zzcajVar = new zzcaj();
        if (this.zzj.containsKey(str)) {
            zzcajVar.zzd((zzdsl) this.zzj.get(str));
        } else {
            if (!this.zzk.containsKey(str)) {
                this.zzk.put(str, new ArrayList());
            }
            ((List) this.zzk.get(str)).add(zzcajVar);
        }
        return zzcajVar;
    }

    public final synchronized String zzc() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zziu)).booleanValue() && zzo()) {
            if (this.zzn < com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() / 1000) {
                this.zzl = "{}";
                this.zzn = RecyclerView.FOREVER_NS;
                return "";
            }
            if (this.zzl.equals("{}")) {
                return "";
            }
            return this.zzl;
        }
        return "";
    }

    public final synchronized String zzd() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("isTestMode", this.zzp);
            jSONObject.put("gesture", this.zzo);
            if (this.zzn > com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() / 1000) {
                jSONObject.put("networkExtras", this.zzl);
                jSONObject.put("networkExtrasExpirationSecs", this.zzn);
            }
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final synchronized JSONObject zze() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", "ANDROID");
            if (!TextUtils.isEmpty(this.zzh)) {
                jSONObject.put("sdkVersion", "afma-sdk-a-v" + this.zzh);
            }
            jSONObject.put("internalSdkVersion", this.zzg);
            jSONObject.put("osVersion", Build.VERSION.RELEASE);
            jSONObject.put("adapters", this.zzd.zza());
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zziS)).booleanValue()) {
                String strZzm = com.google.android.gms.ads.internal.zzt.zzo().zzm();
                if (!TextUtils.isEmpty(strZzm)) {
                    jSONObject.put("plugin", strZzm);
                }
            }
            if (this.zzn < com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() / 1000) {
                this.zzl = "{}";
            }
            jSONObject.put("networkExtras", this.zzl);
            jSONObject.put("adSlots", zzq());
            jSONObject.put("appInfo", this.zze.zza());
            String strZzc = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh().zzc();
            if (!TextUtils.isEmpty(strZzc)) {
                jSONObject.put("cld", new JSONObject(strZzc));
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zziK)).booleanValue() && (jSONObject2 = this.zzm) != null) {
                zzbzr.zze("Server data: " + jSONObject2.toString());
                jSONObject.put("serverData", this.zzm);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zziJ)).booleanValue()) {
                jSONObject.put("openAction", this.zzs);
                jSONObject.put("gesture", this.zzo);
            }
        } catch (JSONException e10) {
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e10, "Inspector.toJson");
            zzbzr.zzk("Ad inspector encountered an error", e10);
        }
        return jSONObject;
    }

    public final synchronized void zzf(String str, zzdsl zzdslVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zziu)).booleanValue() && zzo()) {
            if (this.zzq >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zziw)).intValue()) {
                zzbzr.zzj("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            if (!this.zzi.containsKey(str)) {
                this.zzi.put(str, new ArrayList());
            }
            this.zzq++;
            ((List) this.zzi.get(str)).add(zzdslVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zziQ)).booleanValue()) {
                String strZzc = zzdslVar.zzc();
                this.zzj.put(strZzc, zzdslVar);
                if (this.zzk.containsKey(strZzc)) {
                    List list = (List) this.zzk.get(strZzc);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((zzcaj) it.next()).zzd(zzdslVar);
                    }
                    list.clear();
                }
            }
        }
    }

    public final void zzg() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zziu)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zziJ)).booleanValue() && com.google.android.gms.ads.internal.zzt.zzo().zzh().zzO()) {
                zzr();
                return;
            }
            String strZzo = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzo();
            if (TextUtils.isEmpty(strZzo)) {
                return;
            }
            try {
                if (new JSONObject(strZzo).optBoolean("isTestMode", false)) {
                    zzr();
                }
            } catch (JSONException unused) {
            }
        }
    }

    public final synchronized void zzh(com.google.android.gms.ads.internal.client.zzda zzdaVar, zzdsw zzdswVar) {
        if (!zzo()) {
            try {
                zzdaVar.zze(zzfbi.zzd(18, null, null));
                return;
            } catch (RemoteException unused) {
                zzbzr.zzj("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zziu)).booleanValue()) {
            this.zzs = zzdswVar;
            this.zza.zzj(zzdaVar, new zzbjb(this), new zzbiu(this.zzf));
            return;
        } else {
            try {
                zzdaVar.zze(zzfbi.zzd(1, null, null));
                return;
            } catch (RemoteException unused2) {
                zzbzr.zzj("Ad inspector had an internal error.");
                return;
            }
        }
        throw th;
    }

    public final synchronized void zzi(String str, long j10) {
        this.zzl = str;
        this.zzn = j10;
        zzs();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0011  */
    public final void zzj(boolean z10) {
        if (this.zzr) {
            if (z10) {
                if (!this.zzp) {
                    zzw();
                    return;
                }
            }
        } else if (z10) {
            zzr();
            if (!this.zzp) {
                zzw();
                return;
            }
        }
        if (zzo()) {
            return;
        }
        zzv();
    }

    public final void zzk(zzdst zzdstVar) {
        zzt(zzdstVar, true);
    }

    public final synchronized void zzl(JSONObject jSONObject) {
        this.zzm = jSONObject;
    }

    public final void zzm(boolean z10) {
        if (!this.zzr && z10) {
            zzr();
        }
        zzu(z10, true);
    }

    public final boolean zzn() {
        return this.zzm != null;
    }

    public final synchronized boolean zzo() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zziJ)).booleanValue()) {
            return this.zzp || com.google.android.gms.ads.internal.zzt.zzs().zzl();
        }
        return this.zzp;
    }

    public final synchronized boolean zzp() {
        return this.zzp;
    }
}
