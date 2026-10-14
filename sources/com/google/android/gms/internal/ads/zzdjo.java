package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.activity.j;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdjo {
    private final zzfwn zza;
    private final zzdkb zzb;
    private final zzdkg zzc;

    public zzdjo(zzfwn zzfwnVar, zzdkb zzdkbVar, zzdkg zzdkgVar) {
        this.zza = zzfwnVar;
        this.zzb = zzdkbVar;
        this.zzc = zzdkgVar;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0059  */
    public final zzfwm zza(final zzezz zzezzVar, final zzezn zzeznVar, final JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        zzfwm zzfwmVarZzm;
        final zzfwm zzfwmVarZzb = this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdjm
            @Override // java.util.concurrent.Callable
            public final Object call() throws zzefu {
                zzezz zzezzVar2 = zzezzVar;
                zzezn zzeznVar2 = zzeznVar;
                JSONObject jSONObject2 = jSONObject;
                zzdha zzdhaVar = new zzdha();
                zzdhaVar.zzY(jSONObject2.optInt("template_id", -1));
                zzdhaVar.zzJ(jSONObject2.optString("custom_template_id"));
                JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("omid_settings");
                zzdhaVar.zzU(jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("omid_partner_name") : null);
                zzfai zzfaiVar = zzezzVar2.zza.zza;
                if (!zzfaiVar.zzg.contains(Integer.toString(zzdhaVar.zzc()))) {
                    throw new zzefu(1, android.support.v4.media.a.a("Invalid template ID: ", zzdhaVar.zzc()));
                }
                if (zzdhaVar.zzc() == 3) {
                    if (zzdhaVar.zzz() == null) {
                        throw new zzefu(1, "No custom template id for custom template ad response.");
                    }
                    if (!zzfaiVar.zzh.contains(zzdhaVar.zzz())) {
                        throw new zzefu(1, "Unexpected custom template id in the response.");
                    }
                }
                zzdhaVar.zzW(jSONObject2.optDouble("rating", -1.0d));
                String strOptString = jSONObject2.optString("headline", null);
                if (zzeznVar2.zzN) {
                    com.google.android.gms.ads.internal.zzt.zzp();
                    strOptString = j.a(com.google.android.gms.ads.internal.util.zzs.zzu(), " : ", strOptString);
                }
                zzdhaVar.zzX("headline", strOptString);
                zzdhaVar.zzX("body", jSONObject2.optString("body", null));
                zzdhaVar.zzX("call_to_action", jSONObject2.optString("call_to_action", null));
                zzdhaVar.zzX("store", jSONObject2.optString("store", null));
                zzdhaVar.zzX("price", jSONObject2.optString("price", null));
                zzdhaVar.zzX("advertiser", jSONObject2.optString("advertiser", null));
                return zzdhaVar;
            }
        });
        final zzfwm zzfwmVarZzf = this.zzb.zzf(jSONObject, "images");
        final zzfwm zzfwmVarZzg = this.zzb.zzg(jSONObject, "images", zzeznVar, zzezzVar.zzb.zzb);
        final zzfwm zzfwmVarZze = this.zzb.zze(jSONObject, "secondary_image");
        final zzfwm zzfwmVarZze2 = this.zzb.zze(jSONObject, "app_icon");
        final zzfwm zzfwmVarZzd = this.zzb.zzd(jSONObject, "attribution");
        final zzfwm zzfwmVarZzh = this.zzb.zzh(jSONObject, zzeznVar, zzezzVar.zzb.zzb);
        final zzfwm zzfwmVarZza = this.zzc.zza(jSONObject, "custom_assets");
        final zzdkb zzdkbVar = this.zzb;
        if (jSONObject.optBoolean("enable_omid") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings")) != null) {
            final String strOptString = jSONObjectOptJSONObject.optString("omid_html");
            if (TextUtils.isEmpty(strOptString)) {
                zzfwmVarZzm = zzfwc.zzh(null);
            } else {
                zzfwmVarZzm = zzfwc.zzm(zzfwc.zzh(null), new zzfvj() { // from class: com.google.android.gms.internal.ads.zzdjq
                    @Override // com.google.android.gms.internal.ads.zzfvj
                    public final zzfwm zza(Object obj) {
                        return zzdkbVar.zzc(strOptString, obj);
                    }
                }, zzcae.zze);
            }
        } else {
            zzfwmVarZzm = zzfwc.zzh(null);
        }
        final zzfwm zzfwmVar = zzfwmVarZzm;
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzfwmVarZzb);
        arrayList.add(zzfwmVarZzf);
        arrayList.add(zzfwmVarZzg);
        arrayList.add(zzfwmVarZze);
        arrayList.add(zzfwmVarZze2);
        arrayList.add(zzfwmVarZzd);
        arrayList.add(zzfwmVarZzh);
        arrayList.add(zzfwmVarZza);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzeS)).booleanValue()) {
            arrayList.add(zzfwmVar);
        }
        return zzfwc.zza(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdjn
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzfwm zzfwmVar2 = zzfwmVarZzb;
                zzfwm zzfwmVar3 = zzfwmVarZzf;
                zzfwm zzfwmVar4 = zzfwmVarZze2;
                zzfwm zzfwmVar5 = zzfwmVarZze;
                zzfwm zzfwmVar6 = zzfwmVarZzd;
                JSONObject jSONObject2 = jSONObject;
                zzfwm zzfwmVar7 = zzfwmVarZzh;
                zzfwm zzfwmVar8 = zzfwmVarZzg;
                zzfwm zzfwmVar9 = zzfwmVar;
                zzfwm zzfwmVar10 = zzfwmVarZza;
                zzdha zzdhaVar = (zzdha) zzfwmVar2.get();
                zzdhaVar.zzO((List) zzfwmVar3.get());
                zzdhaVar.zzL((zzber) zzfwmVar4.get());
                zzdhaVar.zzP((zzber) zzfwmVar5.get());
                zzdhaVar.zzI((zzbej) zzfwmVar6.get());
                zzdhaVar.zzR(zzdkb.zzj(jSONObject2));
                zzdhaVar.zzK(zzdkb.zzi(jSONObject2));
                zzcez zzcezVar = (zzcez) zzfwmVar7.get();
                if (zzcezVar != null) {
                    zzdhaVar.zzab(zzcezVar);
                    zzdhaVar.zzaa(zzcezVar.zzF());
                    zzdhaVar.zzZ(zzcezVar.zzq());
                }
                zzcez zzcezVar2 = (zzcez) zzfwmVar8.get();
                if (zzcezVar2 != null) {
                    zzdhaVar.zzN(zzcezVar2);
                    zzdhaVar.zzac(zzcezVar2.zzF());
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzeS)).booleanValue()) {
                    zzdhaVar.zzT(zzfwmVar9);
                } else {
                    zzcez zzcezVar3 = (zzcez) zzfwmVar9.get();
                    if (zzcezVar3 != null) {
                        zzdhaVar.zzS(zzcezVar3);
                    }
                }
                for (zzdkf zzdkfVar : (List) zzfwmVar10.get()) {
                    if (zzdkfVar.zza != 1) {
                        zzdhaVar.zzM(zzdkfVar.zzb, zzdkfVar.zzd);
                    } else {
                        zzdhaVar.zzX(zzdkfVar.zzb, zzdkfVar.zzc);
                    }
                }
                return zzdhaVar;
            }
        }, this.zza);
    }
}
