package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdyr extends zzbtt {
    private final Context zza;
    private final zzesg zzb;
    private final zzese zzc;
    private final zzdyz zzd;
    private final zzfwn zze;
    private final zzdyw zzf;
    private final zzbuq zzg;

    public zzdyr(Context context, zzesg zzesgVar, zzese zzeseVar, zzdyw zzdywVar, zzdyz zzdyzVar, zzfwn zzfwnVar, zzbuq zzbuqVar) {
        this.zza = context;
        this.zzb = zzesgVar;
        this.zzc = zzeseVar;
        this.zzf = zzdywVar;
        this.zzd = zzdyzVar;
        this.zze = zzfwnVar;
        this.zzg = zzbuqVar;
    }

    private final void zzc(zzfwm zzfwmVar, zzbtx zzbtxVar) {
        zzfwc.zzq(zzfwc.zzm(zzfvt.zzv(zzfwmVar), new zzfvj() { // from class: com.google.android.gms.internal.ads.zzdyj
            @Override // com.google.android.gms.internal.ads.zzfvj
            public final zzfwm zza(Object obj) {
                return zzfwc.zzh(zzfbh.zza((InputStream) obj));
            }
        }, zzcae.zza), new zzdyq(this, zzbtxVar), zzcae.zzf);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a5  */
    public final zzfwm zzb(zzbtm zzbtmVar, int i10) {
        zzfwm zzfwmVarZzh;
        String str = zzbtmVar.zza;
        int i11 = zzbtmVar.zzb;
        Bundle bundle = zzbtmVar.zzc;
        HashMap map = new HashMap();
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                String string = bundle.getString(str2);
                if (string != null) {
                    map.put(str2, string);
                }
            }
        }
        final zzdyt zzdytVar = new zzdyt(str, i11, map, zzbtmVar.zzd, "", zzbtmVar.zze);
        zzese zzeseVar = this.zzc;
        zzeseVar.zza(new zzetl(zzbtmVar));
        zzesf zzesfVarZzb = zzeseVar.zzb();
        if (zzdytVar.zzf) {
            String str3 = zzbtmVar.zza;
            String str4 = (String) zzbdl.zzb.zze();
            if (TextUtils.isEmpty(str4)) {
                zzfwmVarZzh = zzfwc.zzh(zzdytVar);
            } else {
                String host = Uri.parse(str3).getHost();
                if (TextUtils.isEmpty(host)) {
                    zzfwmVarZzh = zzfwc.zzh(zzdytVar);
                } else {
                    Iterator it = zzfpu.zzc(zzfos.zzc(';')).zzd(str4).iterator();
                    while (it.hasNext()) {
                        if (host.endsWith((String) it.next())) {
                            zzfwmVarZzh = zzfwc.zzl(zzesfVarZzb.zza().zza(new JSONObject()), new zzfov() { // from class: com.google.android.gms.internal.ads.zzdyp
                                @Override // com.google.android.gms.internal.ads.zzfov
                                public final Object apply(Object obj) {
                                    zzdyt zzdytVar2 = zzdytVar;
                                    zzdyz.zza(zzdytVar2.zzc, (JSONObject) obj);
                                    return zzdytVar2;
                                }
                            }, this.zze);
                        }
                    }
                    zzfwmVarZzh = zzfwc.zzh(zzdytVar);
                }
            }
        } else {
            zzfwmVarZzh = zzfwc.zzh(zzdytVar);
        }
        zzfel zzfelVarZzb = zzesfVarZzb.zzb();
        return zzfwc.zzm(zzfelVarZzb.zzb(zzfef.HTTP, zzfwmVarZzh).zze(new zzdyv(this.zza, "", this.zzg, i10)).zza(), new zzfvj() { // from class: com.google.android.gms.internal.ads.zzdyl
            @Override // com.google.android.gms.internal.ads.zzfvj
            public final zzfwm zza(Object obj) throws JSONException {
                zzdyu zzdyuVar = (zzdyu) obj;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("response", zzdyuVar.zza);
                    JSONObject jSONObject2 = new JSONObject();
                    for (String str5 : zzdyuVar.zzb.keySet()) {
                        if (str5 != null) {
                            List<String> list = (List) zzdyuVar.zzb.get(str5);
                            JSONArray jSONArray = new JSONArray();
                            for (String str6 : list) {
                                if (str6 != null) {
                                    jSONArray.put(str6);
                                }
                            }
                            jSONObject2.put(str5, jSONArray);
                        }
                    }
                    jSONObject.put("headers", jSONObject2);
                    Object obj2 = zzdyuVar.zzc;
                    if (obj2 != null) {
                        jSONObject.put("body", obj2);
                    }
                    jSONObject.put("latency", zzdyuVar.zzd);
                    return zzfwc.zzh(new ByteArrayInputStream(jSONObject.toString().getBytes(StandardCharsets.UTF_8)));
                } catch (JSONException e10) {
                    zzbzr.zzj("Error converting response to JSONObject: ".concat(String.valueOf(e10.getMessage())));
                    throw new JSONException("Parsing HTTP Response: ".concat(String.valueOf(e10.getCause())));
                }
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzbtu
    public final void zze(zzbtm zzbtmVar, zzbtx zzbtxVar) {
        zzc(zzb(zzbtmVar, Binder.getCallingUid()), zzbtxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbtu
    public final void zzf(zzbti zzbtiVar, zzbtx zzbtxVar) {
        int callingUid = Binder.getCallingUid();
        zzesg zzesgVar = this.zzb;
        zzesgVar.zza(new zzerv(zzbtiVar, callingUid));
        final zzesh zzeshVarZzb = zzesgVar.zzb();
        zzfel zzfelVarZzb = zzeshVarZzb.zzb();
        zzfdq zzfdqVarZza = zzfelVarZzb.zzb(zzfef.GMS_SIGNALS, zzfwc.zzi()).zzf(new zzfvj() { // from class: com.google.android.gms.internal.ads.zzdyo
            @Override // com.google.android.gms.internal.ads.zzfvj
            public final zzfwm zza(Object obj) {
                return zzeshVarZzb.zza().zza(new JSONObject());
            }
        }).zze(new zzfdo() { // from class: com.google.android.gms.internal.ads.zzdyn
            @Override // com.google.android.gms.internal.ads.zzfdo
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                com.google.android.gms.ads.internal.util.zze.zza("GMS AdRequest Signals: ");
                com.google.android.gms.ads.internal.util.zze.zza(jSONObject.toString(2));
                return jSONObject;
            }
        }).zzf(new zzfvj() { // from class: com.google.android.gms.internal.ads.zzdym
            @Override // com.google.android.gms.internal.ads.zzfvj
            public final zzfwm zza(Object obj) {
                return zzfwc.zzh(new ByteArrayInputStream(((JSONObject) obj).toString().getBytes(StandardCharsets.UTF_8)));
            }
        }).zza();
        zzc(zzfdqVarZza, zzbtxVar);
        if (((Boolean) zzbdf.zzd.zze()).booleanValue()) {
            final zzdyz zzdyzVar = this.zzd;
            Objects.requireNonNull(zzdyzVar);
            zzfdqVarZza.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdyk
                @Override // java.lang.Runnable
                public final void run() {
                    zzdyzVar.zzb();
                }
            }, this.zze);
        }
    }
}
