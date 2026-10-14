package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinMediationProvider;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.ads.zzauz;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbcx;
import com.google.android.gms.internal.ads.zzbyu;
import com.google.android.gms.internal.ads.zzbzr;
import com.google.android.gms.internal.ads.zzcae;
import com.google.android.gms.internal.ads.zzfwm;
import com.google.android.gms.internal.ads.zzfwn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzj implements zzg {
    private boolean zzb;
    private zzfwm zzd;
    private SharedPreferences zzf;
    private SharedPreferences.Editor zzg;
    private String zzi;
    private String zzj;
    private final Object zza = new Object();
    private final List zzc = new ArrayList();
    private zzauz zze = null;
    private boolean zzh = true;
    private boolean zzk = true;
    private String zzl = "-1";
    private String zzm = "-1";
    private String zzn = "-1";
    private int zzo = -1;
    private zzbyu zzp = new zzbyu("", 0);
    private long zzq = 0;
    private long zzr = 0;
    private int zzs = -1;
    private int zzt = 0;
    private Set zzu = Collections.emptySet();
    private JSONObject zzv = new JSONObject();
    private boolean zzw = true;
    private boolean zzx = true;
    private String zzy = null;
    private String zzz = "";
    private boolean zzA = false;
    private String zzB = "";
    private int zzC = -1;
    private int zzD = -1;
    private long zzE = 0;

    private final void zzR() {
        zzfwm zzfwmVar = this.zzd;
        if (zzfwmVar == null || zzfwmVar.isDone()) {
            return;
        }
        try {
            this.zzd.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            zzbzr.zzk("Interrupted while waiting for preferences loaded.", e10);
        } catch (CancellationException e11) {
            e = e11;
            zzbzr.zzh("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (ExecutionException e12) {
            e = e12;
            zzbzr.zzh("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (TimeoutException e13) {
            e = e13;
            zzbzr.zzh("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    private final void zzS() {
        zzcae.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzi
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzg();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzA(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zziJ)).booleanValue()) {
            zzR();
            synchronized (this.zza) {
                if (this.zzB.equals(str)) {
                    return;
                }
                this.zzB = str;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putString("linked_ad_unit", str);
                    this.zzg.apply();
                }
                zzS();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzB(boolean z10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zziJ)).booleanValue()) {
            zzR();
            synchronized (this.zza) {
                if (this.zzA == z10) {
                    return;
                }
                this.zzA = z10;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putBoolean("linked_device", z10);
                    this.zzg.apply();
                }
                zzS();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzC(String str) {
        zzR();
        synchronized (this.zza) {
            if (TextUtils.equals(this.zzy, str)) {
                return;
            }
            this.zzy = str;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putString("display_cutout", str);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzD(long j10) {
        zzR();
        synchronized (this.zza) {
            if (this.zzr == j10) {
                return;
            }
            this.zzr = j10;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putLong("first_ad_req_time_ms", j10);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzE(int i10) {
        zzR();
        synchronized (this.zza) {
            this.zzo = i10;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                if (i10 == -1) {
                    editor.remove("gad_has_consent_for_cookies");
                } else {
                    editor.putInt("gad_has_consent_for_cookies", i10);
                }
                this.zzg.apply();
            }
            zzS();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003a  */
    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzF(String str, String str2) {
        byte b10;
        zzR();
        synchronized (this.zza) {
            int iHashCode = str.hashCode();
            if (iHashCode != -2004976699) {
                if (iHashCode != 83641339) {
                    if (iHashCode == 1218895378 && str.equals("IABTCF_TCString")) {
                        b10 = 1;
                    } else {
                        b10 = -1;
                    }
                } else if (str.equals("IABTCF_gdprApplies")) {
                    b10 = 0;
                } else {
                    b10 = -1;
                }
            } else if (str.equals("IABTCF_PurposeConsents")) {
                b10 = 2;
            } else {
                b10 = -1;
            }
            if (b10 == 0) {
                this.zzl = str2;
            } else if (b10 == 1) {
                this.zzm = str2;
            } else if (b10 != 2) {
                return;
            } else {
                this.zzn = str2;
            }
            if (this.zzg != null) {
                if (str2.equals("-1")) {
                    this.zzg.remove(str);
                } else {
                    this.zzg.putString(str, str2);
                }
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzG(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zziu)).booleanValue()) {
            zzR();
            synchronized (this.zza) {
                if (this.zzz.equals(str)) {
                    return;
                }
                this.zzz = str;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putString("inspector_info", str);
                    this.zzg.apply();
                }
                zzS();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzH(boolean z10) {
        zzR();
        synchronized (this.zza) {
            if (z10 == this.zzk) {
                return;
            }
            this.zzk = z10;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putBoolean("gad_idless", z10);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzI(String str, String str2, boolean z10) {
        zzR();
        synchronized (this.zza) {
            JSONArray jSONArrayOptJSONArray = this.zzv.optJSONArray(str);
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
            }
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject == null) {
                    return;
                }
                if (str2.equals(jSONObjectOptJSONObject.optString("template_id"))) {
                    if (z10 && jSONObjectOptJSONObject.optBoolean("uses_media_view", false)) {
                        return;
                    }
                    length = i10;
                    break;
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z10);
                jSONObject.put("timestamp_ms", com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis());
                jSONArrayOptJSONArray.put(length, jSONObject);
                this.zzv.put(str, jSONArrayOptJSONArray);
            } catch (JSONException e10) {
                zzbzr.zzk("Could not update native advanced settings", e10);
            }
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putString("native_advanced_settings", this.zzv.toString());
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzJ(int i10) {
        zzR();
        synchronized (this.zza) {
            if (this.zzs == i10) {
                return;
            }
            this.zzs = i10;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putInt("request_in_session_count", i10);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzK(int i10) {
        zzR();
        synchronized (this.zza) {
            if (this.zzD == i10) {
                return;
            }
            this.zzD = i10;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putInt("sd_app_measure_npa", i10);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzL(long j10) {
        zzR();
        synchronized (this.zza) {
            if (this.zzE == j10) {
                return;
            }
            this.zzE = j10;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putLong("sd_app_measure_npa_ts", j10);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzM() {
        boolean z10;
        zzR();
        synchronized (this.zza) {
            z10 = this.zzw;
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzN() {
        boolean z10;
        zzR();
        synchronized (this.zza) {
            z10 = this.zzx;
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzO() {
        boolean z10;
        zzR();
        synchronized (this.zza) {
            z10 = this.zzA;
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzP() {
        boolean z10;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzau)).booleanValue()) {
            return false;
        }
        zzR();
        synchronized (this.zza) {
            z10 = this.zzk;
        }
        return z10;
    }

    public final /* synthetic */ void zzQ(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(AppLovinMediationProvider.ADMOB, 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        synchronized (this.zza) {
            this.zzf = sharedPreferences;
            this.zzg = editorEdit;
            if (PlatformVersion.isAtLeastM()) {
                NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
            }
            this.zzh = this.zzf.getBoolean("use_https", this.zzh);
            this.zzw = this.zzf.getBoolean("content_url_opted_out", this.zzw);
            this.zzi = this.zzf.getString("content_url_hashes", this.zzi);
            this.zzk = this.zzf.getBoolean("gad_idless", this.zzk);
            this.zzx = this.zzf.getBoolean("content_vertical_opted_out", this.zzx);
            this.zzj = this.zzf.getString("content_vertical_hashes", this.zzj);
            this.zzt = this.zzf.getInt("version_code", this.zzt);
            this.zzp = new zzbyu(this.zzf.getString("app_settings_json", this.zzp.zzc()), this.zzf.getLong("app_settings_last_update_ms", this.zzp.zza()));
            this.zzq = this.zzf.getLong("app_last_background_time_ms", this.zzq);
            this.zzs = this.zzf.getInt("request_in_session_count", this.zzs);
            this.zzr = this.zzf.getLong("first_ad_req_time_ms", this.zzr);
            this.zzu = this.zzf.getStringSet("never_pool_slots", this.zzu);
            this.zzy = this.zzf.getString("display_cutout", this.zzy);
            this.zzC = this.zzf.getInt("app_measurement_npa", this.zzC);
            this.zzD = this.zzf.getInt("sd_app_measure_npa", this.zzD);
            this.zzE = this.zzf.getLong("sd_app_measure_npa_ts", this.zzE);
            this.zzz = this.zzf.getString("inspector_info", this.zzz);
            this.zzA = this.zzf.getBoolean("linked_device", this.zzA);
            this.zzB = this.zzf.getString("linked_ad_unit", this.zzB);
            this.zzl = this.zzf.getString("IABTCF_gdprApplies", this.zzl);
            this.zzn = this.zzf.getString("IABTCF_PurposeConsents", this.zzn);
            this.zzm = this.zzf.getString("IABTCF_TCString", this.zzm);
            this.zzo = this.zzf.getInt("gad_has_consent_for_cookies", this.zzo);
            try {
                this.zzv = new JSONObject(this.zzf.getString("native_advanced_settings", "{}"));
            } catch (JSONException e10) {
                zzbzr.zzk("Could not convert native advanced settings to json object", e10);
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zza() {
        int i10;
        zzR();
        synchronized (this.zza) {
            i10 = this.zzt;
        }
        return i10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzb() {
        int i10;
        zzR();
        synchronized (this.zza) {
            i10 = this.zzo;
        }
        return i10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzc() {
        int i10;
        zzR();
        synchronized (this.zza) {
            i10 = this.zzs;
        }
        return i10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zzd() {
        long j10;
        zzR();
        synchronized (this.zza) {
            j10 = this.zzq;
        }
        return j10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zze() {
        long j10;
        zzR();
        synchronized (this.zza) {
            j10 = this.zzr;
        }
        return j10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zzf() {
        long j10;
        zzR();
        synchronized (this.zza) {
            j10 = this.zzE;
        }
        return j10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final zzauz zzg() {
        if (!this.zzb) {
            return null;
        }
        if ((zzM() && zzN()) || !((Boolean) zzbcx.zzb.zze()).booleanValue()) {
            return null;
        }
        synchronized (this.zza) {
            if (Looper.getMainLooper() == null) {
                return null;
            }
            if (this.zze == null) {
                this.zze = new zzauz();
            }
            this.zze.zze();
            zzbzr.zzi("start fetching content...");
            return this.zze;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final zzbyu zzh() {
        zzbyu zzbyuVar;
        zzR();
        synchronized (this.zza) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzkc)).booleanValue() && this.zzp.zzj()) {
                Iterator it = this.zzc.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            }
            zzbyuVar = this.zzp;
        }
        return zzbyuVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final zzbyu zzi() {
        zzbyu zzbyuVar;
        synchronized (this.zza) {
            zzbyuVar = this.zzp;
        }
        return zzbyuVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzj() {
        String str;
        zzR();
        synchronized (this.zza) {
            str = this.zzi;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzk() {
        String str;
        zzR();
        synchronized (this.zza) {
            str = this.zzj;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzl() {
        String str;
        zzR();
        synchronized (this.zza) {
            str = this.zzB;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzm() {
        String str;
        zzR();
        synchronized (this.zza) {
            str = this.zzy;
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003a  */
    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzn(String str) {
        byte b10;
        zzR();
        synchronized (this.zza) {
            int iHashCode = str.hashCode();
            if (iHashCode != -2004976699) {
                if (iHashCode != 83641339) {
                    if (iHashCode == 1218895378 && str.equals("IABTCF_TCString")) {
                        b10 = 1;
                    } else {
                        b10 = -1;
                    }
                } else if (str.equals("IABTCF_gdprApplies")) {
                    b10 = 0;
                } else {
                    b10 = -1;
                }
            } else if (str.equals("IABTCF_PurposeConsents")) {
                b10 = 2;
            } else {
                b10 = -1;
            }
            if (b10 == 0) {
                return this.zzl;
            }
            if (b10 == 1) {
                return this.zzm;
            }
            if (b10 != 2) {
                return null;
            }
            return this.zzn;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzo() {
        String str;
        zzR();
        synchronized (this.zza) {
            str = this.zzz;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final JSONObject zzp() {
        JSONObject jSONObject;
        zzR();
        synchronized (this.zza) {
            jSONObject = this.zzv;
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzq(Runnable runnable) {
        this.zzc.add(runnable);
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzr(final Context context) {
        synchronized (this.zza) {
            if (this.zzf != null) {
                return;
            }
            zzfwn zzfwnVar = zzcae.zza;
            final String str = AppLovinMediationProvider.ADMOB;
            this.zzd = zzfwnVar.zza(new Runnable(context, str) { // from class: com.google.android.gms.ads.internal.util.zzh
                public final /* synthetic */ Context zzb;
                public final /* synthetic */ String zzc = AppLovinMediationProvider.ADMOB;

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzQ(this.zzb, this.zzc);
                }
            });
            this.zzb = true;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzs() {
        zzR();
        synchronized (this.zza) {
            this.zzv = new JSONObject();
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.remove("native_advanced_settings");
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzt(long j10) {
        zzR();
        synchronized (this.zza) {
            if (this.zzq == j10) {
                return;
            }
            this.zzq = j10;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putLong("app_last_background_time_ms", j10);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzu(String str) {
        zzR();
        synchronized (this.zza) {
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
            if (str != null && !str.equals(this.zzp.zzc())) {
                this.zzp = new zzbyu(str, jCurrentTimeMillis);
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putString("app_settings_json", str);
                    this.zzg.putLong("app_settings_last_update_ms", jCurrentTimeMillis);
                    this.zzg.apply();
                }
                zzS();
                Iterator it = this.zzc.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                return;
            }
            this.zzp.zzg(jCurrentTimeMillis);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzv(int i10) {
        zzR();
        synchronized (this.zza) {
            if (this.zzt == i10) {
                return;
            }
            this.zzt = i10;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putInt("version_code", i10);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzw(String str) {
        zzR();
        synchronized (this.zza) {
            if (str.equals(this.zzi)) {
                return;
            }
            this.zzi = str;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putString("content_url_hashes", str);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzx(boolean z10) {
        zzR();
        synchronized (this.zza) {
            if (this.zzw == z10) {
                return;
            }
            this.zzw = z10;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putBoolean("content_url_opted_out", z10);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzy(String str) {
        zzR();
        synchronized (this.zza) {
            if (str.equals(this.zzj)) {
                return;
            }
            this.zzj = str;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putString("content_vertical_hashes", str);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzz(boolean z10) {
        zzR();
        synchronized (this.zza) {
            if (this.zzx == z10) {
                return;
            }
            this.zzx = z10;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putBoolean("content_vertical_opted_out", z10);
                this.zzg.apply();
            }
            zzS();
        }
    }
}
