package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zzbld {
    public static void zza(zzble zzbleVar, String str, Map map) {
        try {
            zzbleVar.zze(str, com.google.android.gms.ads.internal.client.zzay.zzb().zzi(map));
        } catch (JSONException unused) {
            zzbzr.zzj("Could not convert parameters to JSON.");
        }
    }

    public static void zzb(zzble zzbleVar, String str, JSONObject jSONObject) {
        StringBuilder sbA = q2.a.a("(window.AFMA_ReceiveMessage || function() {})('", str, "',", jSONObject.toString(), ");");
        zzbzr.zze("Dispatching AFMA event: ".concat(sbA.toString()));
        zzbleVar.zza(sbA.toString());
    }

    public static void zzc(zzble zzbleVar, String str, String str2) {
        zzbleVar.zza(str + "(" + str2 + ");");
    }

    public static void zzd(zzble zzbleVar, String str, JSONObject jSONObject) {
        zzbleVar.zzb(str, jSONObject.toString());
    }
}
