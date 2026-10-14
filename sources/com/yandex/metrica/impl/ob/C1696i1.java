package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import com.applovin.sdk.AppLovinMediationProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.i1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1696i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f16317a = new JSONObject();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f16318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final A0 f16319c;

    public C1696i1(Context context, A0 a10) {
        this.f16318b = context;
        this.f16319c = a10;
    }

    public static <T> T a(JSONObject jSONObject, String str, T t10) throws JSONException {
        if (!jSONObject.has(str)) {
            jSONObject.put(str, t10);
        }
        return (T) jSONObject.get(str);
    }

    private void d() throws JSONException {
        if (U2.a(24)) {
            JSONObject jSONObject = (JSONObject) a(this.f16317a, "dfid", new JSONObject());
            jSONObject.putOpt("wids", (Integer) U2.a(new V2(1), this.f16318b, "wallpaper", "getting wallpaper id", "wallpaper manager"));
            jSONObject.putOpt("widl", (Integer) U2.a(new V2(2), this.f16318b, "wallpaper", "getting wallpaper id", "wallpaper manager"));
        }
    }

    public String a() {
        return this.f16317a.toString();
    }

    public C1696i1 b() throws JSONException {
        JSONArray jSONArray;
        JSONObject jSONObject = (JSONObject) a(this.f16317a, "dfid", new JSONObject());
        if (U2.a(21)) {
            jSONArray = new JSONArray(Build.SUPPORTED_ABIS);
        } else {
            ArrayList arrayList = new ArrayList();
            String str = Build.CPU_ABI;
            if (!AppLovinMediationProvider.UNKNOWN.equals(str)) {
                arrayList.add(str);
            }
            String str2 = Build.CPU_ABI2;
            if (!AppLovinMediationProvider.UNKNOWN.equals(str2)) {
                arrayList.add(str2);
            }
            jSONArray = new JSONArray((Collection) arrayList);
        }
        jSONObject.put("cpu_abis", jSONArray);
        return this;
    }

    public C1696i1 c() {
        try {
            JSONObject jSONObject = (JSONObject) a(this.f16317a, "dfid", new JSONObject());
            A0.a aVarA = this.f16319c.a();
            jSONObject.put("tds", aVarA.f13621a);
            jSONObject.put("fds", aVarA.f13622b);
            ((JSONObject) a(this.f16317a, "dfid", new JSONObject())).put("boot_time", (System.currentTimeMillis() - SystemClock.elapsedRealtime()) / 1000);
            d();
            ((JSONObject) a(this.f16317a, "dfid", new JSONObject())).put("lc", C2120ym.b((List<?>) C1870p1.a(this.f16318b).a()));
        } catch (Throwable unused) {
        }
        try {
            Object obj = Class.forName("kotlin.KotlinVersion").getDeclaredField("CURRENT").get(null);
            int iIntValue = ((Integer) obj.getClass().getDeclaredMethod("getMajor", new Class[0]).invoke(obj, new Object[0])).intValue();
            int iIntValue2 = ((Integer) obj.getClass().getDeclaredMethod("getMinor", new Class[0]).invoke(obj, new Object[0])).intValue();
            ((JSONObject) a(this.f16317a, "dfid", new JSONObject())).put("kotlin_runtime", new JSONObject().put("major", iIntValue).put("minor", iIntValue2).put("patch", ((Integer) obj.getClass().getDeclaredMethod("getPatch", new Class[0]).invoke(obj, new Object[0])).intValue()));
        } catch (Throwable unused2) {
        }
        return this;
    }

    public String toString() {
        return this.f16317a.toString();
    }
}
