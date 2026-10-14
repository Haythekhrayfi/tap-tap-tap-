package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class rm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static WindowManager f24792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String[] f24793b = {"x", "y", "width", "height"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static float f24794c = Resources.getSystem().getDisplayMetrics().density;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f24795d = 0;

    public static float a(int i10) {
        return i10 / f24794c;
    }

    public static JSONObject a(int i10, int i11, int i12, int i13) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", a(i10));
            jSONObject.put("y", a(i11));
            jSONObject.put("width", a(i12));
            jSONObject.put("height", a(i13));
        } catch (JSONException e10) {
            ym1.a("Error with creating viewStateObject", e10);
        }
        return jSONObject;
    }

    public static void a(Context context) {
        if (context != null) {
            f24794c = context.getResources().getDisplayMetrics().density;
            f24792a = (WindowManager) context.getSystemService("window");
        }
    }

    public static void a(JSONObject jSONObject) {
        float f10;
        WindowManager windowManager = f24792a;
        float fA = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        if (windowManager != null) {
            Point point = new Point(0, 0);
            f24792a.getDefaultDisplay().getRealSize(point);
            float fA2 = a(point.x);
            fA = a(point.y);
            f10 = fA2;
        } else {
            f10 = 0.0f;
        }
        try {
            jSONObject.put("width", f10);
            jSONObject.put("height", fA);
        } catch (JSONException unused) {
        }
    }

    public static void a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e10) {
            ym1.a("JSONException during JSONObject.put for name [" + str + "]", e10);
        }
    }

    public static boolean a(JSONObject jSONObject, JSONObject jSONObject2) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        String[] strArr = f24793b;
        int i10 = 0;
        while (true) {
            if (i10 >= 4) {
                z10 = true;
                break;
            }
            String str = strArr[i10];
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                z10 = false;
                break;
            }
            i10++;
        }
        if (z10 && jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""))) {
            if (Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")) == Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus"))) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
                JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
                if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
                    z11 = true;
                } else {
                    if ((jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) || !(jSONArrayOptJSONArray == null || jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray.length() != jSONArrayOptJSONArray2.length())) {
                        int i11 = 0;
                        while (true) {
                            if (i11 >= jSONArrayOptJSONArray.length()) {
                                z11 = true;
                            } else if (jSONArrayOptJSONArray.optString(i11, "").equals(jSONArrayOptJSONArray2.optString(i11, ""))) {
                                i11++;
                            }
                        }
                    }
                    z11 = false;
                }
                if (z11) {
                    JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("childViews");
                    JSONArray jSONArrayOptJSONArray4 = jSONObject2.optJSONArray("childViews");
                    if (jSONArrayOptJSONArray3 == null && jSONArrayOptJSONArray4 == null) {
                        z12 = true;
                    } else {
                        if ((jSONArrayOptJSONArray3 == null && jSONArrayOptJSONArray4 == null) || !(jSONArrayOptJSONArray3 == null || jSONArrayOptJSONArray4 == null || jSONArrayOptJSONArray3.length() != jSONArrayOptJSONArray4.length())) {
                            int i12 = 0;
                            while (true) {
                                if (i12 >= jSONArrayOptJSONArray3.length()) {
                                    z12 = true;
                                } else if (a(jSONArrayOptJSONArray3.optJSONObject(i12), jSONArrayOptJSONArray4.optJSONObject(i12))) {
                                    i12++;
                                }
                            }
                        }
                        z12 = false;
                    }
                    if (z12) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
