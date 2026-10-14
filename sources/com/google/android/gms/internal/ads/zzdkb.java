package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdkb {
    private final Context zza;
    private final zzdjk zzb;
    private final zzaqs zzc;
    private final zzbzx zzd;
    private final com.google.android.gms.ads.internal.zza zze;
    private final zzawz zzf;
    private final Executor zzg;
    private final zzbef zzh;
    private final zzdkt zzi;
    private final zzdni zzj;
    private final ScheduledExecutorService zzk;
    private final zzdmd zzl;
    private final zzdqa zzm;
    private final zzfev zzn;
    private final zzfgr zzo;
    private final zzeba zzp;
    private final zzebl zzq;

    public zzdkb(Context context, zzdjk zzdjkVar, zzaqs zzaqsVar, zzbzx zzbzxVar, com.google.android.gms.ads.internal.zza zzaVar, zzawz zzawzVar, Executor executor, zzfai zzfaiVar, zzdkt zzdktVar, zzdni zzdniVar, ScheduledExecutorService scheduledExecutorService, zzdqa zzdqaVar, zzfev zzfevVar, zzfgr zzfgrVar, zzeba zzebaVar, zzdmd zzdmdVar, zzebl zzeblVar) {
        this.zza = context;
        this.zzb = zzdjkVar;
        this.zzc = zzaqsVar;
        this.zzd = zzbzxVar;
        this.zze = zzaVar;
        this.zzf = zzawzVar;
        this.zzg = executor;
        this.zzh = zzfaiVar.zzi;
        this.zzi = zzdktVar;
        this.zzj = zzdniVar;
        this.zzk = scheduledExecutorService;
        this.zzm = zzdqaVar;
        this.zzn = zzfevVar;
        this.zzo = zzfgrVar;
        this.zzp = zzebaVar;
        this.zzl = zzdmdVar;
        this.zzq = zzeblVar;
    }

    public static final com.google.android.gms.ads.internal.client.zzel zzi(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("mute");
        if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return zzr(jSONObjectOptJSONObject);
    }

    public static final List zzj(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("mute");
        if (jSONObjectOptJSONObject == null) {
            return zzfsc.zzl();
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("reasons");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return zzfsc.zzl();
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            com.google.android.gms.ads.internal.client.zzel zzelVarZzr = zzr(jSONArrayOptJSONArray.optJSONObject(i10));
            if (zzelVarZzr != null) {
                arrayList.add(zzelVarZzr);
            }
        }
        return zzfsc.zzj(arrayList);
    }

    private final com.google.android.gms.ads.internal.client.zzq zzk(int i10, int i11) {
        if (i10 == 0) {
            if (i11 == 0) {
                return com.google.android.gms.ads.internal.client.zzq.zzc();
            }
            i10 = 0;
        }
        return new com.google.android.gms.ads.internal.client.zzq(this.zza, new AdSize(i10, i11));
    }

    private static zzfwm zzl(zzfwm zzfwmVar, Object obj) {
        final Object obj2 = null;
        return zzfwc.zzf(zzfwmVar, Exception.class, new zzfvj(obj2) { // from class: com.google.android.gms.internal.ads.zzdjy
            @Override // com.google.android.gms.internal.ads.zzfvj
            public final zzfwm zza(Object obj3) {
                com.google.android.gms.ads.internal.util.zze.zzb("Error during loading assets.", (Exception) obj3);
                return zzfwc.zzh(null);
            }
        }, zzcae.zzf);
    }

    private static zzfwm zzm(boolean z10, final zzfwm zzfwmVar, Object obj) {
        return z10 ? zzfwc.zzm(zzfwmVar, new zzfvj() { // from class: com.google.android.gms.internal.ads.zzdjw
            @Override // com.google.android.gms.internal.ads.zzfvj
            public final zzfwm zza(Object obj2) {
                return obj2 != null ? zzfwmVar : zzfwc.zzg(new zzefu(1, "Retrieve required value in native ad response failed."));
            }
        }, zzcae.zzf) : zzl(zzfwmVar, null);
    }

    private final zzfwm zzn(JSONObject jSONObject, boolean z10) {
        if (jSONObject == null) {
            return zzfwc.zzh(null);
        }
        final String strOptString = jSONObject.optString(ImagesContract.URL);
        if (TextUtils.isEmpty(strOptString)) {
            return zzfwc.zzh(null);
        }
        final double dOptDouble = jSONObject.optDouble("scale", 1.0d);
        boolean zOptBoolean = jSONObject.optBoolean("is_transparent", true);
        final int iOptInt = jSONObject.optInt("width", -1);
        final int iOptInt2 = jSONObject.optInt("height", -1);
        if (z10) {
            return zzfwc.zzh(new zzbed(null, Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2));
        }
        return zzm(jSONObject.optBoolean("require"), zzfwc.zzl(this.zzb.zzb(strOptString, dOptDouble, zOptBoolean), new zzfov() { // from class: com.google.android.gms.internal.ads.zzdjz
            @Override // com.google.android.gms.internal.ads.zzfov
            public final Object apply(Object obj) {
                String str = strOptString;
                return new zzbed(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(str), dOptDouble, iOptInt, iOptInt2);
            }
        }, this.zzg), null);
    }

    private final zzfwm zzo(JSONArray jSONArray, boolean z10, boolean z11) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzfwc.zzh(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z11 ? jSONArray.length() : 1;
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(zzn(jSONArray.optJSONObject(i10), z10));
        }
        return zzfwc.zzl(zzfwc.zzd(arrayList), new zzfov() { // from class: com.google.android.gms.internal.ads.zzdjx
            @Override // com.google.android.gms.internal.ads.zzfov
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (zzbed zzbedVar : (List) obj) {
                    if (zzbedVar != null) {
                        arrayList2.add(zzbedVar);
                    }
                }
                return arrayList2;
            }
        }, this.zzg);
    }

    private final zzfwm zzp(JSONObject jSONObject, zzezn zzeznVar, zzezq zzezqVar) {
        final zzfwm zzfwmVarZzb = this.zzi.zzb(jSONObject.optString("base_url"), jSONObject.optString("html"), zzeznVar, zzezqVar, zzk(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)));
        return zzfwc.zzm(zzfwmVarZzb, new zzfvj() { // from class: com.google.android.gms.internal.ads.zzdka
            @Override // com.google.android.gms.internal.ads.zzfvj
            public final zzfwm zza(Object obj) throws zzefu {
                zzfwm zzfwmVar = zzfwmVarZzb;
                zzcez zzcezVar = (zzcez) obj;
                if (zzcezVar == null || zzcezVar.zzq() == null) {
                    throw new zzefu(1, "Retrieve video view in html5 ad response failed.");
                }
                return zzfwmVar;
            }
        }, zzcae.zzf);
    }

    private static Integer zzq(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    private static final com.google.android.gms.ads.internal.client.zzel zzr(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("reason");
        String strOptString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            return null;
        }
        return new com.google.android.gms.ads.internal.client.zzel(strOptString, strOptString2);
    }

    public final /* synthetic */ zzbea zza(JSONObject jSONObject, List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String strOptString = jSONObject.optString("text");
        Integer numZzq = zzq(jSONObject, "bg_color");
        Integer numZzq2 = zzq(jSONObject, "text_color");
        int iOptInt = jSONObject.optInt("text_size", -1);
        boolean zOptBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int iOptInt2 = jSONObject.optInt("animation_ms", 1000);
        return new zzbea(strOptString, list, numZzq, numZzq2, iOptInt > 0 ? Integer.valueOf(iOptInt) : null, jSONObject.optInt("presentation_ms", 4000) + iOptInt2, this.zzh.zze, zOptBoolean);
    }

    public final /* synthetic */ zzfwm zzb(com.google.android.gms.ads.internal.client.zzq zzqVar, zzezn zzeznVar, zzezq zzezqVar, String str, String str2, Object obj) throws Exception {
        zzcez zzcezVarZza = this.zzj.zza(zzqVar, zzeznVar, zzezqVar);
        final zzcai zzcaiVarZza = zzcai.zza(zzcezVarZza);
        zzdma zzdmaVarZzb = this.zzl.zzb();
        zzcezVarZza.zzN().zzM(zzdmaVarZzb, zzdmaVarZzb, zzdmaVarZzb, zzdmaVarZzb, zzdmaVarZzb, false, null, new com.google.android.gms.ads.internal.zzb(this.zza, null, null), null, null, this.zzp, this.zzo, this.zzm, this.zzn, null, zzdmaVarZzb, null, null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzdw)).booleanValue()) {
            zzcezVarZza.zzad("/getNativeAdViewSignals", zzbii.zzs);
        }
        zzcezVarZza.zzad("/getNativeClickMeta", zzbii.zzt);
        zzcezVarZza.zzN().zzA(new zzcgk() { // from class: com.google.android.gms.internal.ads.zzdjv
            @Override // com.google.android.gms.internal.ads.zzcgk
            public final void zza(boolean z10) {
                zzcai zzcaiVar = zzcaiVarZza;
                if (z10) {
                    zzcaiVar.zzb();
                } else {
                    zzcaiVar.zze(new zzefu(1, "Image Web View failed to load."));
                }
            }
        });
        zzcezVarZza.zzab(str, str2, null);
        return zzcaiVarZza;
    }

    public final /* synthetic */ zzfwm zzc(String str, Object obj) throws Exception {
        com.google.android.gms.ads.internal.zzt.zzz();
        zzcez zzcezVarZza = zzcfl.zza(this.zza, zzcgo.zza(), "native-omid", false, false, this.zzc, null, this.zzd, null, null, this.zze, this.zzf, null, null, this.zzq);
        final zzcai zzcaiVarZza = zzcai.zza(zzcezVarZza);
        zzcezVarZza.zzN().zzA(new zzcgk() { // from class: com.google.android.gms.internal.ads.zzdjr
            @Override // com.google.android.gms.internal.ads.zzcgk
            public final void zza(boolean z10) {
                zzcaiVarZza.zzb();
            }
        });
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzeP)).booleanValue()) {
            zzcezVarZza.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        } else {
            zzcezVarZza.loadData(str, "text/html", "UTF-8");
        }
        return zzcaiVarZza;
    }

    public final zzfwm zzd(JSONObject jSONObject, String str) {
        final JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("attribution");
        if (jSONObjectOptJSONObject == null) {
            return zzfwc.zzh(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("images");
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("image");
        if (jSONArrayOptJSONArray == null && jSONObjectOptJSONObject2 != null) {
            jSONArrayOptJSONArray = new JSONArray();
            jSONArrayOptJSONArray.put(jSONObjectOptJSONObject2);
        }
        return zzm(jSONObjectOptJSONObject.optBoolean("require"), zzfwc.zzl(zzo(jSONArrayOptJSONArray, false, true), new zzfov() { // from class: com.google.android.gms.internal.ads.zzdjs
            @Override // com.google.android.gms.internal.ads.zzfov
            public final Object apply(Object obj) {
                return this.zza.zza(jSONObjectOptJSONObject, (List) obj);
            }
        }, this.zzg), null);
    }

    public final zzfwm zze(JSONObject jSONObject, String str) {
        return zzn(jSONObject.optJSONObject(str), this.zzh.zzb);
    }

    public final zzfwm zzf(JSONObject jSONObject, String str) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        zzbef zzbefVar = this.zzh;
        return zzo(jSONArrayOptJSONArray, zzbefVar.zzb, zzbefVar.zzd);
    }

    public final zzfwm zzg(JSONObject jSONObject, String str, final zzezn zzeznVar, final zzezq zzezqVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzjg)).booleanValue()) {
            return zzfwc.zzh(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return zzfwc.zzh(null);
        }
        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0);
        if (jSONObjectOptJSONObject == null) {
            return zzfwc.zzh(null);
        }
        final String strOptString = jSONObjectOptJSONObject.optString("base_url");
        final String strOptString2 = jSONObjectOptJSONObject.optString("html");
        final com.google.android.gms.ads.internal.client.zzq zzqVarZzk = zzk(jSONObjectOptJSONObject.optInt("width", 0), jSONObjectOptJSONObject.optInt("height", 0));
        if (TextUtils.isEmpty(strOptString2)) {
            return zzfwc.zzh(null);
        }
        final zzfwm zzfwmVarZzm = zzfwc.zzm(zzfwc.zzh(null), new zzfvj() { // from class: com.google.android.gms.internal.ads.zzdjt
            @Override // com.google.android.gms.internal.ads.zzfvj
            public final zzfwm zza(Object obj) {
                return this.zza.zzb(zzqVarZzk, zzeznVar, zzezqVar, strOptString, strOptString2, obj);
            }
        }, zzcae.zze);
        return zzfwc.zzm(zzfwmVarZzm, new zzfvj() { // from class: com.google.android.gms.internal.ads.zzdju
            @Override // com.google.android.gms.internal.ads.zzfvj
            public final zzfwm zza(Object obj) throws zzefu {
                zzfwm zzfwmVar = zzfwmVarZzm;
                if (((zzcez) obj) != null) {
                    return zzfwmVar;
                }
                throw new zzefu(1, "Retrieve Web View from image ad response failed.");
            }
        }, zzcae.zzf);
    }

    public final zzfwm zzh(JSONObject jSONObject, zzezn zzeznVar, zzezq zzezqVar) {
        zzfwm zzfwmVarZza;
        JSONObject jSONObjectZzg = com.google.android.gms.ads.internal.util.zzbu.zzg(jSONObject, "html_containers", "instream");
        if (jSONObjectZzg != null) {
            return zzp(jSONObjectZzg, zzeznVar, zzezqVar);
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("video");
        if (jSONObjectOptJSONObject != null) {
            String strOptString = jSONObjectOptJSONObject.optString("vast_xml");
            boolean z10 = false;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzjf)).booleanValue() && jSONObjectOptJSONObject.has("html")) {
                z10 = true;
            }
            if (!TextUtils.isEmpty(strOptString)) {
                if (!z10) {
                    zzfwmVarZza = this.zzi.zza(jSONObjectOptJSONObject);
                }
                return zzl(zzfwc.zzn(zzfwmVarZza, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzdx)).intValue(), TimeUnit.SECONDS, this.zzk), null);
            }
            if (!z10) {
                zzbzr.zzj("Required field 'vast_xml' or 'html' is missing");
            }
            zzfwmVarZza = zzp(jSONObjectOptJSONObject, zzeznVar, zzezqVar);
            return zzl(zzfwc.zzn(zzfwmVarZza, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzdx)).intValue(), TimeUnit.SECONDS, this.zzk), null);
        }
        return zzfwc.zzh(null);
    }
}
