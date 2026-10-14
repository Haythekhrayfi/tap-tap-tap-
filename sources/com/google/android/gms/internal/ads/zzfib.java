package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfib {
    private static WindowManager zzb;
    private static final String[] zzc = {"x", "y", "width", "height"};
    public static float zza = Resources.getSystem().getDisplayMetrics().density;

    public static JSONObject zza(int i10, int i11, int i12, int i13) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i10 / zza);
            jSONObject.put("y", i11 / zza);
            jSONObject.put("width", i12 / zza);
            jSONObject.put("height", i13 / zza);
        } catch (JSONException e10) {
            zzfic.zza("Error with creating viewStateObject", e10);
        }
        return jSONObject;
    }

    public static void zzb(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e10) {
            zzfic.zza("Error with setting ad session id", e10);
        }
    }

    public static void zzc(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
                jSONObject.put("childViews", jSONArrayOptJSONArray);
            }
            jSONArrayOptJSONArray.put(jSONObject2);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public static void zzd(Context context) {
        if (context != null) {
            zza = context.getResources().getDisplayMetrics().density;
            zzb = (WindowManager) context.getSystemService("window");
        }
    }

    public static void zze(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e10) {
            zzfic.zza("JSONException during JSONObject.put for name [" + str + "]", e10);
        }
    }

    public static void zzf(JSONObject jSONObject) {
        float f10;
        WindowManager windowManager = zzb;
        float f11 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        if (windowManager != null) {
            Point point = new Point(0, 0);
            zzb.getDefaultDisplay().getRealSize(point);
            float f12 = point.x;
            float f13 = zza;
            f11 = f12 / f13;
            f10 = point.y / f13;
        } else {
            f10 = 0.0f;
        }
        try {
            jSONObject.put("width", f11);
            jSONObject.put("height", f10);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0092  */
    /* JADX WARN: Code duplicated, block: B:42:0x0099  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a7 A[LOOP:1: B:40:0x0093->B:44:0x00a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ab A[SYNTHETIC] */
    public static boolean zzg(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray;
        JSONArray jSONArrayOptJSONArray2;
        int i10;
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject != null && jSONObject2 != null) {
            String[] strArr = zzc;
            for (int i11 = 0; i11 < 4; i11++) {
                String str = strArr[i11];
                if (jSONObject.optDouble(str) == jSONObject2.optDouble(str)) {
                }
            }
            if (jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", "")) && Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")))) {
                JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("isFriendlyObstructionFor");
                JSONArray jSONArrayOptJSONArray4 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
                if (jSONArrayOptJSONArray3 == null && jSONArrayOptJSONArray4 == null) {
                    jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
                    jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("childViews");
                    if (jSONArrayOptJSONArray == null) {
                    }
                    if (zzh(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
                        for (i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                            if (zzg(jSONArrayOptJSONArray.optJSONObject(i10), jSONArrayOptJSONArray2.optJSONObject(i10))) {
                            }
                        }
                        return true;
                    }
                } else if (zzh(jSONArrayOptJSONArray3, jSONArrayOptJSONArray4)) {
                    for (int i12 = 0; i12 < jSONArrayOptJSONArray3.length(); i12++) {
                        if (jSONArrayOptJSONArray3.optString(i12, "").equals(jSONArrayOptJSONArray4.optString(i12, ""))) {
                        }
                    }
                    jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
                    jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("childViews");
                    if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray2 != null) {
                        if (zzh(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
                            while (i10 < jSONArrayOptJSONArray.length()) {
                                if (zzg(jSONArrayOptJSONArray.optJSONObject(i10), jSONArrayOptJSONArray2.optJSONObject(i10))) {
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean zzh(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
