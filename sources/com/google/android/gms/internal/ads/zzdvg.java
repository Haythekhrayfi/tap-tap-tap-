package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.applovin.sdk.AppLovinMediationProvider;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdvg {
    private final zzcgu zza;
    private final Context zzb;
    private final zzbzx zzc;
    private final zzfai zzd;
    private final Executor zze;
    private final String zzf;
    private final zzffy zzg;
    private final zzfau zzh;
    private final zzdpv zzi;

    public zzdvg(zzcgu zzcguVar, Context context, zzbzx zzbzxVar, zzfai zzfaiVar, Executor executor, String str, zzffy zzffyVar, zzdpv zzdpvVar) {
        this.zza = zzcguVar;
        this.zzb = context;
        this.zzc = zzbzxVar;
        this.zzd = zzfaiVar;
        this.zze = executor;
        this.zzf = str;
        this.zzg = zzffyVar;
        this.zzh = zzcguVar.zzv();
        this.zzi = zzdpvVar;
    }

    private final zzfwm zzc(final String str, final String str2) {
        zzffn zzffnVarZza = zzffm.zza(this.zzb, 11);
        zzffnVarZza.zzh();
        zzbmz zzbmzVarZza = com.google.android.gms.ads.internal.zzt.zzf().zza(this.zzb, this.zzc, this.zza.zzy());
        zzbmt zzbmtVar = zzbmw.zza;
        final zzbmp zzbmpVarZza = zzbmzVarZza.zza("google.afma.response.normalize", zzbmtVar, zzbmtVar);
        zzfwm zzfwmVarZzm = zzfwc.zzm(zzfwc.zzm(zzfwc.zzm(zzfwc.zzh(""), new zzfvj() { // from class: com.google.android.gms.internal.ads.zzdvd
            @Override // com.google.android.gms.internal.ads.zzfvj
            public final zzfwm zza(Object obj) throws JSONException {
                String str3 = str;
                String str4 = str2;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("headers", new JSONObject());
                    jSONObject3.put("body", str3);
                    jSONObject2.put("base_url", "");
                    jSONObject2.put("signals", new JSONObject(str4));
                    jSONObject.put("request", jSONObject2);
                    jSONObject.put("response", jSONObject3);
                    jSONObject.put("flags", new JSONObject());
                    return zzfwc.zzh(jSONObject);
                } catch (JSONException e10) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(e10.getCause())));
                }
            }
        }, this.zze), new zzfvj() { // from class: com.google.android.gms.internal.ads.zzdve
            @Override // com.google.android.gms.internal.ads.zzfvj
            public final zzfwm zza(Object obj) {
                return zzbmpVarZza.zzb((JSONObject) obj);
            }
        }, this.zze), new zzfvj() { // from class: com.google.android.gms.internal.ads.zzdvf
            @Override // com.google.android.gms.internal.ads.zzfvj
            public final zzfwm zza(Object obj) {
                return this.zza.zzb((JSONObject) obj);
            }
        }, this.zze);
        zzffx.zza(zzfwmVarZzm, this.zzg, zzffnVarZza);
        return zzfwmVarZzm;
    }

    private final String zzd(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && AppLovinMediationProvider.UNKNOWN.equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.zzf));
            }
            return jSONObject.toString();
        } catch (JSONException e10) {
            zzbzr.zzj("Failed to update the ad types for rendering. ".concat(e10.toString()));
            return str;
        }
    }

    private static final String zze(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    public final zzfwm zza() {
        Boolean bool;
        String strZzb = this.zzd.zzd.zzx;
        if (!TextUtils.isEmpty(strZzb)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzgK)).booleanValue()) {
                String strZze = zze(strZzb);
                zzbbe zzbbeVar = zzbbm.zzgW;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbeVar)).booleanValue() && strZze.isEmpty()) {
                    int iLastIndexOf = strZzb.lastIndexOf("&request_id=");
                    strZze = iLastIndexOf != -1 ? strZzb.substring(iLastIndexOf + 12) : "";
                }
                if (TextUtils.isEmpty(strZze)) {
                    return zzfwc.zzg(new zzefu(15, "Invalid ad string."));
                }
                String strZzb2 = this.zza.zzm().zzb(strZze, this.zzi);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbeVar)).booleanValue()) {
                    zzdpv zzdpvVar = this.zzi;
                    if (!TextUtils.isEmpty(strZzb2)) {
                        try {
                            bool = new JSONObject(strZzb2).optString("is_gbid").equals("true") ? Boolean.TRUE : Boolean.FALSE;
                        } catch (JSONException unused) {
                        }
                        if (bool.booleanValue()) {
                            int iLastIndexOf2 = strZzb.lastIndexOf("&");
                            String string = null;
                            String strSubstring = iLastIndexOf2 != -1 ? strZzb.substring(0, iLastIndexOf2) : null;
                            if (!TextUtils.isEmpty(strSubstring)) {
                                try {
                                    byte[] bArrDecode = Base64.decode(strSubstring, 11);
                                    byte[] bytes = strZze.getBytes("UTF-8");
                                    try {
                                        string = new JSONObject(strZzb2).getString("arek");
                                    } catch (JSONException e10) {
                                        com.google.android.gms.ads.internal.util.zze.zza("Failed to get key from QueryJSONMap".concat(e10.toString()));
                                        com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "CryptoUtils.getKeyFromQueryJsonMap");
                                    }
                                    strZzb = zzfau.zzb(bArrDecode, bytes, string, zzdpvVar);
                                } catch (UnsupportedEncodingException e11) {
                                    com.google.android.gms.ads.internal.util.zze.zza("Failed to decode the adResponse. ".concat(e11.toString()));
                                    com.google.android.gms.ads.internal.zzt.zzo().zzu(e11, "PreloadedLoader.decryptAdResponseIfNecessary");
                                }
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(strZzb2)) {
                    return zzc(strZzb, zzd(strZzb2));
                }
            }
        }
        com.google.android.gms.ads.internal.client.zzc zzcVar = this.zzd.zzd.zzs;
        if (zzcVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzgI)).booleanValue()) {
                String strZze2 = zze(zzcVar.zza);
                String strZze3 = zze(zzcVar.zzb);
                if (TextUtils.isEmpty(strZze3) || !strZze2.equals(strZze3)) {
                    this.zzi.zza().put("ridmm", "true");
                } else {
                    this.zza.zzm().zzf(strZze2);
                    this.zzi.zza().put("rid", strZze2);
                }
            }
            return zzc(zzcVar.zza, zzd(zzcVar.zzb));
        }
        return zzfwc.zzg(new zzefu(14, "Mismatch request IDs."));
    }

    public final /* synthetic */ zzfwm zzb(JSONObject jSONObject) throws Exception {
        return zzfwc.zzh(new zzezz(new zzezw(this.zzd), zzezy.zza(new StringReader(jSONObject.toString()))));
    }
}
