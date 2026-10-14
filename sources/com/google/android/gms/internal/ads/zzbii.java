package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.developer.filepicker.model.DialogConfigs;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbii {
    public static final zzbij zza = new zzbij() { // from class: com.google.android.gms.internal.ads.zzbhn
        @Override // com.google.android.gms.internal.ads.zzbij
        public final void zza(Object obj, Map map) {
            zzcga zzcgaVar = (zzcga) obj;
            zzbij zzbijVar = zzbii.zza;
            String str = (String) map.get("urls");
            if (TextUtils.isEmpty(str)) {
                zzbzr.zzj("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String[] strArrSplit = str.split(",");
            HashMap map2 = new HashMap();
            PackageManager packageManager = zzcgaVar.getContext().getPackageManager();
            for (String str2 : strArrSplit) {
                String[] strArrSplit2 = str2.split(";", 2);
                boolean z10 = true;
                if (packageManager.resolveActivity(new Intent(strArrSplit2.length > 1 ? strArrSplit2[1].trim() : "android.intent.action.VIEW", Uri.parse(strArrSplit2[0].trim())), 65536) == null) {
                    z10 = false;
                }
                Boolean boolValueOf = Boolean.valueOf(z10);
                map2.put(str2, boolValueOf);
                com.google.android.gms.ads.internal.util.zze.zza("/canOpenURLs;" + str2 + ";" + boolValueOf);
            }
            ((zzblc) zzcgaVar).zzd("openableURLs", map2);
        }
    };
    public static final zzbij zzb = new zzbij() { // from class: com.google.android.gms.internal.ads.zzbho
        @Override // com.google.android.gms.internal.ads.zzbij
        public final void zza(Object obj, Map map) {
            zzcga zzcgaVar = (zzcga) obj;
            zzbij zzbijVar = zzbii.zza;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzhN)).booleanValue()) {
                zzbzr.zzj("canOpenAppGmsgHandler disabled.");
                return;
            }
            String str = (String) map.get("package_name");
            if (TextUtils.isEmpty(str)) {
                zzbzr.zzj("Package name missing in canOpenApp GMSG.");
                return;
            }
            HashMap map2 = new HashMap();
            Boolean boolValueOf = Boolean.valueOf(zzcgaVar.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
            map2.put(str, boolValueOf);
            com.google.android.gms.ads.internal.util.zze.zza("/canOpenApp;" + str + ";" + boolValueOf);
            ((zzblc) zzcgaVar).zzd("openableApp", map2);
        }
    };
    public static final zzbij zzc = new zzbij() { // from class: com.google.android.gms.internal.ads.zzbhg
        @Override // com.google.android.gms.internal.ads.zzbij
        public final void zza(Object obj, Map map) {
            zzbii.zzb((zzcga) obj, map);
        }
    };
    public static final zzbij zzd = new zzbia();
    public static final zzbij zze = new zzbib();
    public static final zzbij zzf = new zzbij() { // from class: com.google.android.gms.internal.ads.zzbhm
        @Override // com.google.android.gms.internal.ads.zzbij
        public final void zza(Object obj, Map map) {
            zzcga zzcgaVar = (zzcga) obj;
            zzbij zzbijVar = zzbii.zza;
            String str = (String) map.get("u");
            if (str == null) {
                zzbzr.zzj("URL missing from httpTrack GMSG.");
            } else {
                new com.google.android.gms.ads.internal.util.zzby(zzcgaVar.getContext(), ((zzcgi) zzcgaVar).zzn().zza, str).zzb();
            }
        }
    };
    public static final zzbij zzg = new zzbic();
    public static final zzbij zzh = new zzbid();
    public static final zzbij zzi = new zzbij() { // from class: com.google.android.gms.internal.ads.zzbhl
        @Override // com.google.android.gms.internal.ads.zzbij
        public final void zza(Object obj, Map map) {
            zzcgh zzcghVar = (zzcgh) obj;
            zzbij zzbijVar = zzbii.zza;
            String str = (String) map.get("tx");
            String str2 = (String) map.get("ty");
            String str3 = (String) map.get("td");
            try {
                int i10 = Integer.parseInt(str);
                int i11 = Integer.parseInt(str2);
                int i12 = Integer.parseInt(str3);
                zzaqs zzaqsVarZzI = zzcghVar.zzI();
                if (zzaqsVarZzI != null) {
                    zzaqsVarZzI.zzc().zzl(i10, i11, i12);
                }
            } catch (NumberFormatException unused) {
                zzbzr.zzj("Could not parse touch parameters from gmsg.");
            }
        }
    };
    public static final zzbij zzj = new zzbie();
    public static final zzbij zzk = new zzbif();
    public static final zzbij zzl = new zzccz();
    public static final zzbij zzm = new zzcda();
    public static final zzbij zzn = new zzbhf();
    public static final zzbix zzo = new zzbix();
    public static final zzbij zzp = new zzbig();
    public static final zzbij zzq = new zzbih();
    public static final zzbij zzr = new zzbhp();
    public static final zzbij zzs = new zzbhq();
    public static final zzbij zzt = new zzbhr();
    public static final zzbij zzu = new zzbhs();
    public static final zzbij zzv = new zzbht();
    public static final zzbij zzw = new zzbhu();
    public static final zzbij zzx = new zzbhv();
    public static final zzbij zzy = new zzbhw();
    public static final zzbij zzz = new zzbhx();
    public static final zzbij zzA = new zzbhy();

    public static zzfwm zza(zzcez zzcezVar, String str) {
        Uri uriZza = Uri.parse(str);
        try {
            zzaqs zzaqsVarZzI = zzcezVar.zzI();
            if (zzaqsVarZzI != null && zzaqsVarZzI.zzf(uriZza)) {
                uriZza = zzaqsVarZzI.zza(uriZza, zzcezVar.getContext(), zzcezVar.zzF(), zzcezVar.zzi());
            }
        } catch (zzaqt unused) {
            zzbzr.zzj("Unable to append parameter to URL: ".concat(str));
        }
        final String strZzb = zzbxy.zzb(uriZza, zzcezVar.getContext());
        long jLongValue = ((Long) zzbde.zze.zze()).longValue();
        if (jLongValue <= 0 || jLongValue > 232400000) {
            return zzfwc.zzh(strZzb);
        }
        zzfvt zzfvtVarZzv = zzfvt.zzv(zzcezVar.zzR());
        zzbhh zzbhhVar = new zzfov() { // from class: com.google.android.gms.internal.ads.zzbhh
            @Override // com.google.android.gms.internal.ads.zzfov
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                zzbij zzbijVar = zzbii.zza;
                if (!((Boolean) zzbde.zzk.zze()).booleanValue()) {
                    return "failure_click_attok";
                }
                com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "prepareClickUrl.attestation1");
                return "failure_click_attok";
            }
        };
        zzfwn zzfwnVar = zzcae.zzf;
        return zzfwc.zze(zzfwc.zzl(zzfwc.zze(zzfvtVarZzv, Throwable.class, zzbhhVar, zzfwnVar), new zzfov() { // from class: com.google.android.gms.internal.ads.zzbhi
            /* JADX WARN: Code duplicated, block: B:16:0x004f  */
            /* JADX WARN: Code duplicated, block: B:19:0x0059  */
            /* JADX WARN: Code duplicated, block: B:21:0x0067  */
            @Override // com.google.android.gms.internal.ads.zzfov
            public final Object apply(Object obj) {
                String str2;
                String str3;
                Uri uri;
                String strReplace = strZzb;
                String str4 = (String) obj;
                zzbij zzbijVar = zzbii.zza;
                if (str4 != null) {
                    if (((Boolean) zzbde.zzf.zze()).booleanValue()) {
                        String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                        String host = Uri.parse(strReplace).getHost();
                        for (int i10 = 0; i10 < 3; i10++) {
                            if (host.endsWith(strArr[i10])) {
                                str2 = (String) zzbde.zza.zze();
                                str3 = (String) zzbde.zzb.zze();
                                if (!TextUtils.isEmpty(str2)) {
                                    strReplace = strReplace.replace(str2, str4);
                                }
                                if (!TextUtils.isEmpty(str3)) {
                                    uri = Uri.parse(strReplace);
                                    if (!TextUtils.isEmpty(uri.getQueryParameter(str3))) {
                                        break;
                                    }
                                    return uri.buildUpon().appendQueryParameter(str3, str4).toString();
                                }
                                break;
                            }
                        }
                    } else {
                        str2 = (String) zzbde.zza.zze();
                        str3 = (String) zzbde.zzb.zze();
                        if (!TextUtils.isEmpty(str2)) {
                            strReplace = strReplace.replace(str2, str4);
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            uri = Uri.parse(strReplace);
                            if (!TextUtils.isEmpty(uri.getQueryParameter(str3))) {
                                return uri.buildUpon().appendQueryParameter(str3, str4).toString();
                            }
                        }
                    }
                }
                return strReplace;
            }
        }, zzfwnVar), Throwable.class, new zzfov() { // from class: com.google.android.gms.internal.ads.zzbhj
            @Override // com.google.android.gms.internal.ads.zzfov
            public final Object apply(Object obj) {
                String str2 = strZzb;
                Throwable th = (Throwable) obj;
                zzbij zzbijVar = zzbii.zza;
                if (((Boolean) zzbde.zzk.zze()).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "prepareClickUrl.attestation2");
                }
                return str2;
            }
        }, zzfwnVar);
    }

    public static /* synthetic */ void zzb(zzcga zzcgaVar, Map map) {
        JSONException jSONException;
        String str;
        Intent uri;
        PackageManager packageManager = zzcgaVar.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                        String strOptString = jSONObject2.optString(FacebookMediationAdapter.KEY_ID);
                        String strOptString2 = jSONObject2.optString("u");
                        String strOptString3 = jSONObject2.optString(IntegerTokenConverter.CONVERTER_KEY);
                        String strOptString4 = jSONObject2.optString("m");
                        String strOptString5 = jSONObject2.optString("p");
                        String strOptString6 = jSONObject2.optString("c");
                        String strOptString7 = jSONObject2.optString("intent_url");
                        ResolveInfo resolveInfoResolveActivity = null;
                        if (TextUtils.isEmpty(strOptString7)) {
                            uri = null;
                        } else {
                            try {
                                uri = Intent.parseUri(strOptString7, 0);
                            } catch (URISyntaxException e10) {
                                zzbzr.zzh("Error parsing the url: ".concat(String.valueOf(strOptString7)), e10);
                                uri = null;
                            }
                        }
                        if (uri == null) {
                            uri = new Intent();
                            if (!TextUtils.isEmpty(strOptString2)) {
                                uri.setData(Uri.parse(strOptString2));
                            }
                            if (!TextUtils.isEmpty(strOptString3)) {
                                uri.setAction(strOptString3);
                            }
                            if (!TextUtils.isEmpty(strOptString4)) {
                                uri.setType(strOptString4);
                            }
                            if (!TextUtils.isEmpty(strOptString5)) {
                                uri.setPackage(strOptString5);
                            }
                            if (!TextUtils.isEmpty(strOptString6)) {
                                String[] strArrSplit = strOptString6.split(DialogConfigs.DIRECTORY_SEPERATOR, 2);
                                if (strArrSplit.length == 2) {
                                    uri.setComponent(new ComponentName(strArrSplit[0], strArrSplit[1]));
                                }
                            }
                        }
                        Intent intent = uri;
                        try {
                            resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
                        } catch (NullPointerException e11) {
                            com.google.android.gms.ads.internal.zzt.zzo().zzu(e11, intent.toString());
                        }
                        try {
                            jSONObject.put(strOptString, resolveInfoResolveActivity != null);
                        } catch (JSONException e12) {
                            jSONException = e12;
                            str = "Error constructing openable urls response.";
                            zzbzr.zzh(str, jSONException);
                        }
                    } catch (JSONException e13) {
                        jSONException = e13;
                        str = "Error parsing the intent data.";
                    }
                }
                ((zzblc) zzcgaVar).zze("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((zzblc) zzcgaVar).zze("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((zzblc) zzcgaVar).zze("openableIntents", new JSONObject());
        }
    }

    public static void zzc(Map map, zzdcu zzdcuVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzjr)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && zzdcuVar != null) {
            zzdcuVar.zzr();
        }
    }
}
