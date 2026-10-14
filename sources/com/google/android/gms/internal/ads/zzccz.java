package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.recyclerview.widget.o;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzccz implements zzbij {
    private boolean zza;

    private static int zzb(Context context, Map map, String str, int i10) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                com.google.android.gms.ads.internal.client.zzay.zzb();
                i10 = zzbzk.zzx(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                zzbzr.zzj("Could not parse " + str + " in a video GMSG: " + str2);
            }
        }
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            StringBuilder sbA = q2.a.a("Parse pixels for ", str, ", got string ", str2, ", int ");
            sbA.append(i10);
            sbA.append(".");
            com.google.android.gms.ads.internal.util.zze.zza(sbA.toString());
        }
        return i10;
    }

    private static void zzc(zzcbo zzcboVar, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                zzcboVar.zzB(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                zzbzr.zzj(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2));
                return;
            }
        }
        if (str2 != null) {
            zzcboVar.zzA(Integer.parseInt(str2));
        }
        if (str3 != null) {
            zzcboVar.zzy(Integer.parseInt(str3));
        }
        if (str4 != null) {
            zzcboVar.zzz(Integer.parseInt(str4));
        }
        if (str5 != null) {
            zzcboVar.zzD(Integer.parseInt(str5));
        }
    }

    /* JADX WARN: Code duplicated, block: B:194:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:197:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:199:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:207:0x0432  */
    @Override // com.google.android.gms.internal.ads.zzbij
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        int iZzh;
        int iMin;
        int iZzb;
        int iZzg;
        int i10;
        Integer numValueOf;
        zzcca zzccaVar = (zzcca) obj;
        String str = (String) map.get("action");
        if (str == null) {
            zzbzr.zzj("Action missing from video GMSG.");
            return;
        }
        Integer numValueOf2 = map.containsKey("playerId") ? Integer.valueOf(Integer.parseInt((String) map.get("playerId"))) : null;
        Integer numZzb = zzccaVar.zzo() != null ? zzccaVar.zzo().zzb() : null;
        if (numValueOf2 != null && numZzb != null && !numValueOf2.equals(numZzb) && !str.equals("load")) {
            zzbzr.zzi(String.format(Locale.US, "Event intended for player %s, but sent to player %d - event ignored", numValueOf2, numZzb));
            return;
        }
        if (zzbzr.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            zzbzr.zze("Video GMSG: " + str + " " + jSONObject.toString());
        }
        if ("background".equals(str)) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                zzbzr.zzj("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                zzccaVar.setBackgroundColor(Color.parseColor(str2));
                return;
            } catch (IllegalArgumentException unused) {
                zzbzr.zzj("Invalid color parameter in background video GMSG.");
                return;
            }
        }
        if ("playerBackground".equals(str)) {
            String str3 = (String) map.get("color");
            if (TextUtils.isEmpty(str3)) {
                zzbzr.zzj("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                zzccaVar.zzB(Color.parseColor(str3));
                return;
            } catch (IllegalArgumentException unused2) {
                zzbzr.zzj("Invalid color parameter in playerBackground video GMSG.");
                return;
            }
        }
        if ("decoderProps".equals(str)) {
            String str4 = (String) map.get("mimeTypes");
            if (str4 == null) {
                zzbzr.zzj("No MIME types specified for decoder properties inspection.");
                HashMap map2 = new HashMap();
                map2.put("event", "decoderProps");
                map2.put("error", "missingMimeTypes");
                zzccaVar.zzd("onVideoEvent", map2);
                return;
            }
            HashMap map3 = new HashMap();
            for (String str5 : str4.split(",")) {
                map3.put(str5, com.google.android.gms.ads.internal.util.zzch.zza(str5.trim()));
            }
            HashMap map4 = new HashMap();
            map4.put("event", "decoderProps");
            map4.put("mimeTypes", map3);
            zzccaVar.zzd("onVideoEvent", map4);
            return;
        }
        zzcbp zzcbpVarZzo = zzccaVar.zzo();
        if (zzcbpVarZzo == null) {
            zzbzr.zzj("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean zEquals = "new".equals(str);
        boolean zEquals2 = "position".equals(str);
        if (zEquals || zEquals2) {
            Context context = zzccaVar.getContext();
            int iZzb2 = zzb(context, map, "x", 0);
            int iZzb3 = zzb(context, map, "y", 0);
            int iZzb4 = zzb(context, map, "w", -1);
            zzbbe zzbbeVar = zzbbm.zzdB;
            try {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbeVar)).booleanValue()) {
                    if (iZzb4 == -1) {
                        iMin = zzccaVar.zzh();
                    } else {
                        iZzh = zzccaVar.zzh();
                    }
                    int i11 = iMin;
                    iZzb = zzb(context, map, "h", -1);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbeVar)).booleanValue()) {
                        iZzg = zzccaVar.zzg();
                        if (iZzb != -1) {
                        }
                        i10 = Integer.parseInt((String) map.get("player"));
                        boolean z10 = Boolean.parseBoolean((String) map.get("spherical"));
                        if (zEquals || zzcbpVarZzo.zza() != null) {
                            zzcbpVarZzo.zzc(iZzb2, iZzb3, i11, iZzg);
                            return;
                        }
                        zzcbpVarZzo.zzd(iZzb2, iZzb3, i11, iZzg, i10, z10, new zzcbz((String) map.get("flags")));
                        zzcbo zzcboVarZza = zzcbpVarZzo.zza();
                        if (zzcboVarZza != null) {
                            zzc(zzcboVarZza, map);
                            return;
                        }
                        return;
                    }
                    if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                        StringBuilder sbA = o.a("Calculate height with original height ", iZzb, ", videoHost.getVideoBoundingHeight() ", zzccaVar.zzg(), ", y ");
                        sbA.append(iZzb3);
                        sbA.append(".");
                        com.google.android.gms.ads.internal.util.zze.zza(sbA.toString());
                    }
                    iZzg = zzccaVar.zzg() - iZzb3;
                    iZzg = Math.min(iZzb, iZzg);
                    i10 = Integer.parseInt((String) map.get("player"));
                    boolean z11 = Boolean.parseBoolean((String) map.get("spherical"));
                    if (zEquals) {
                    }
                    zzcbpVarZzo.zzc(iZzb2, iZzb3, i11, iZzg);
                    return;
                }
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    StringBuilder sbA2 = o.a("Calculate width with original width ", iZzb4, ", videoHost.getVideoBoundingWidth() ", zzccaVar.zzh(), ", x ");
                    sbA2.append(iZzb2);
                    sbA2.append(".");
                    com.google.android.gms.ads.internal.util.zze.zza(sbA2.toString());
                }
                iZzh = zzccaVar.zzh() - iZzb2;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbeVar)).booleanValue()) {
                    iZzg = zzccaVar.zzg();
                    if (iZzb != -1) {
                    }
                    i10 = Integer.parseInt((String) map.get("player"));
                    boolean z12 = Boolean.parseBoolean((String) map.get("spherical"));
                    if (zEquals) {
                    }
                    zzcbpVarZzo.zzc(iZzb2, iZzb3, i11, iZzg);
                    return;
                }
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    StringBuilder sbA3 = o.a("Calculate height with original height ", iZzb, ", videoHost.getVideoBoundingHeight() ", zzccaVar.zzg(), ", y ");
                    sbA3.append(iZzb3);
                    sbA3.append(".");
                    com.google.android.gms.ads.internal.util.zze.zza(sbA3.toString());
                }
                iZzg = zzccaVar.zzg() - iZzb3;
                i10 = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException unused3) {
                i10 = 0;
            }
            iMin = Math.min(iZzb4, iZzh);
            int i12 = iMin;
            iZzb = zzb(context, map, "h", -1);
            iZzg = Math.min(iZzb, iZzg);
            boolean z13 = Boolean.parseBoolean((String) map.get("spherical"));
            if (zEquals) {
            }
            zzcbpVarZzo.zzc(iZzb2, iZzb3, i12, iZzg);
            return;
        }
        zzcfv zzcfvVarZzq = zzccaVar.zzq();
        if (zzcfvVarZzq != null) {
            if ("timeupdate".equals(str)) {
                String str6 = (String) map.get("currentTime");
                if (str6 == null) {
                    zzbzr.zzj("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                }
                try {
                    zzcfvVarZzq.zzt(Float.parseFloat(str6));
                    return;
                } catch (NumberFormatException unused4) {
                    zzbzr.zzj("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6));
                    return;
                }
            }
            if ("skip".equals(str)) {
                zzcfvVarZzq.zzu();
                return;
            }
        }
        zzcbo zzcboVarZza2 = zzcbpVarZzo.zza();
        if (zzcboVarZza2 == null) {
            HashMap map5 = new HashMap();
            map5.put("event", "no_video_view");
            zzccaVar.zzd("onVideoEvent", map5);
            return;
        }
        if ("click".equals(str)) {
            Context context2 = zzccaVar.getContext();
            int iZzb5 = zzb(context2, map, "x", 0);
            float fZzb = zzb(context2, map, "y", 0);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, iZzb5, fZzb, 0);
            zzcboVarZza2.zzx(motionEventObtain);
            motionEventObtain.recycle();
            return;
        }
        if ("currentTime".equals(str)) {
            String str7 = (String) map.get("time");
            if (str7 == null) {
                zzbzr.zzj("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                zzcboVarZza2.zzw((int) (Float.parseFloat(str7) * 1000.0f));
                return;
            } catch (NumberFormatException unused5) {
                zzbzr.zzj("Could not parse time parameter from currentTime video GMSG: ".concat(str7));
                return;
            }
        }
        if ("hide".equals(str)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzG)).booleanValue()) {
                zzcboVarZza2.setVisibility(8);
                return;
            } else {
                zzcboVarZza2.setVisibility(4);
                return;
            }
        }
        if ("load".equals(str)) {
            zzcboVarZza2.zzr(numValueOf2);
            return;
        }
        if ("loadControl".equals(str)) {
            zzc(zzcboVarZza2, map);
            return;
        }
        if ("muted".equals(str)) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                zzcboVarZza2.zzs();
                return;
            } else {
                zzcboVarZza2.zzI();
                return;
            }
        }
        if ("pause".equals(str)) {
            zzcboVarZza2.zzu();
            return;
        }
        if ("play".equals(str)) {
            zzcboVarZza2.zzv();
            return;
        }
        if ("show".equals(str)) {
            zzcboVarZza2.setVisibility(0);
            return;
        }
        if ("src".equals(str)) {
            String str8 = (String) map.get("src");
            if (map.containsKey("periodicReportIntervalMs")) {
                try {
                    numValueOf = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
                } catch (NumberFormatException unused6) {
                    zzbzr.zzj("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map.get("periodicReportIntervalMs"))));
                    numValueOf = null;
                }
            } else {
                numValueOf = null;
            }
            String[] strArr = {str8};
            String str9 = (String) map.get("demuxed");
            if (str9 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str9);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i13 = 0; i13 < jSONArray.length(); i13++) {
                        strArr2[i13] = jSONArray.getString(i13);
                    }
                    strArr = strArr2;
                } catch (JSONException unused7) {
                    zzbzr.zzj("Malformed demuxed URL list for playback: ".concat(str9));
                    strArr = new String[]{str8};
                }
            }
            if (numValueOf != null) {
                zzccaVar.zzA(numValueOf.intValue());
            }
            zzcboVarZza2.zzE(str8, strArr);
            return;
        }
        if ("touchMove".equals(str)) {
            Context context3 = zzccaVar.getContext();
            zzcboVarZza2.zzH(zzb(context3, map, "dx", 0), zzb(context3, map, "dy", 0));
            if (this.zza) {
                return;
            }
            zzccaVar.zzu();
            this.zza = true;
            return;
        }
        if (!"volume".equals(str)) {
            if ("watermark".equals(str)) {
                zzcboVarZza2.zzn();
                return;
            } else {
                zzbzr.zzj("Unknown video action: ".concat(str));
                return;
            }
        }
        String str10 = (String) map.get("volume");
        if (str10 == null) {
            zzbzr.zzj("Level parameter missing from volume video GMSG.");
            return;
        }
        try {
            zzcboVarZza2.zzG(Float.parseFloat(str10));
        } catch (NumberFormatException unused8) {
            zzbzr.zzj("Could not parse volume parameter from volume video GMSG: ".concat(str10));
        }
    }
}
