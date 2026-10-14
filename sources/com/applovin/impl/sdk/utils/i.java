package com.applovin.impl.sdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.preference.PreferenceManager;
import com.applovin.sdk.AppLovinMediationProvider;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f11219a = {7, 4, 2, 1, 11};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f11220b = {5, 6, 12, 10, 3, 9, 8, 14};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f11221c = {15, 13};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f11222d = {20};

    public static String a(String str, com.applovin.impl.sdk.o oVar) {
        return a((String) oVar.a(com.applovin.impl.sdk.c.b.bj), str, oVar);
    }

    public static String a(String str, String str2, com.applovin.impl.sdk.o oVar) {
        if (str == null || str.length() < 4) {
            throw new IllegalArgumentException("Invalid domain specified");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("No endpoint specified");
        }
        if (oVar != null) {
            return i.f.a(str, str2);
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    public static void a(int i10, com.applovin.impl.sdk.o oVar) {
        if (i10 == 401) {
            StringBuilder sbA = defpackage.a.a("SDK key \"");
            sbA.append(oVar.ax());
            sbA.append("\" is rejected by AppLovin. Please make sure the SDK key is correct.");
            com.applovin.impl.sdk.y.j("AppLovinSdk", sbA.toString());
            return;
        }
        if (i10 == 418) {
            oVar.H().a(com.applovin.impl.sdk.c.b.f10343ac, Boolean.TRUE);
            oVar.H().a();
            return;
        }
        if (i10 < 400 || i10 >= 500) {
            if (i10 != -1 || !((Boolean) oVar.a(com.applovin.impl.sdk.c.b.f10345ae)).booleanValue()) {
                return;
            }
        } else if (!((Boolean) oVar.a(com.applovin.impl.sdk.c.b.f10345ae)).booleanValue()) {
            return;
        }
        oVar.m();
    }

    public static void a(JSONObject jSONObject, boolean z10, com.applovin.impl.sdk.o oVar) {
        oVar.X().a(jSONObject, z10);
    }

    private static boolean a(int i10, int[] iArr) {
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(Context context) {
        if (context.getSystemService("connectivity") == null) {
            return true;
        }
        NetworkInfo networkInfoB = b(context);
        if (networkInfoB != null) {
            return networkInfoB.isConnected();
        }
        return false;
    }

    public static byte[] a(InputStream inputStream, com.applovin.impl.sdk.o oVar) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[((Integer) oVar.a(com.applovin.impl.sdk.c.b.dD)).intValue()];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 <= 0) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }

    private static NetworkInfo b(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            return connectivityManager.getActiveNetworkInfo();
        }
        return null;
    }

    public static String b(String str, com.applovin.impl.sdk.o oVar) {
        return a((String) oVar.a(com.applovin.impl.sdk.c.b.bk), str, oVar);
    }

    public static void d(JSONObject jSONObject, com.applovin.impl.sdk.o oVar) {
        String string = JsonUtils.getString(jSONObject, "persisted_data", null);
        if (StringUtils.isValidString(string)) {
            oVar.a(com.applovin.impl.sdk.c.d.N, string);
            oVar.F();
            if (com.applovin.impl.sdk.y.a()) {
                oVar.F().c("ConnectionUtils", "Updated persisted data");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0034  */
    /* JADX WARN: Code duplicated, block: B:12:0x003d  */
    public static Map<String, String> e(com.applovin.impl.sdk.o oVar) {
        String str;
        Map<String, Object> mapI;
        HashMap map = new HashMap();
        String strAx = (String) oVar.a(com.applovin.impl.sdk.c.b.ag);
        if (!StringUtils.isValidString(strAx)) {
            if (!((Boolean) oVar.a(com.applovin.impl.sdk.c.b.fx)).booleanValue()) {
                strAx = oVar.ax();
                str = "api_key";
            }
            if (oVar.M() != null) {
                mapI = oVar.M().f();
            } else {
                mapI = oVar.K().i();
            }
            map.putAll(w.a(mapI));
            return map;
        }
        str = "device_token";
        map.put(str, strAx);
        if (oVar.M() != null) {
            mapI = oVar.M().f();
        } else {
            mapI = oVar.K().i();
        }
        map.putAll(w.a(mapI));
        return map;
    }

    public static void e(JSONObject jSONObject, com.applovin.impl.sdk.o oVar) {
        if (jSONObject == null) {
            throw new IllegalArgumentException("No response specified");
        }
        if (oVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        try {
            if (jSONObject.has("settings")) {
                com.applovin.impl.sdk.c.c cVarH = oVar.H();
                if (jSONObject.isNull("settings")) {
                    return;
                }
                cVarH.a(jSONObject.getJSONObject("settings"));
                cVarH.a();
            }
        } catch (JSONException e10) {
            oVar.F();
            if (com.applovin.impl.sdk.y.a()) {
                oVar.F().b("ConnectionUtils", "Unable to parse settings out of API response", e10);
            }
        }
    }

    public static String f(com.applovin.impl.sdk.o oVar) {
        NetworkInfo networkInfoB = b(com.applovin.impl.sdk.o.au());
        if (networkInfoB == null) {
            return AppLovinMediationProvider.UNKNOWN;
        }
        int type = networkInfoB.getType();
        int subtype = networkInfoB.getSubtype();
        if (type == 1) {
            return "wifi";
        }
        if (type != 0) {
            return AppLovinMediationProvider.UNKNOWN;
        }
        if (a(subtype, f11219a)) {
            return "2g";
        }
        if (a(subtype, f11220b)) {
            return "3g";
        }
        if (a(subtype, f11221c)) {
            return "4g";
        }
        return a(subtype, f11222d) ? "5g" : "mobile";
    }

    public static void f(JSONObject jSONObject, com.applovin.impl.sdk.o oVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "filesystem_values", (JSONObject) null);
        if (jSONObject2 != null) {
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(com.applovin.impl.sdk.o.au()).edit();
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object object = JsonUtils.getObject(jSONObject2, next, null);
                if (object != null) {
                    com.applovin.impl.sdk.c.e.a(next, object, (SharedPreferences) null, editorEdit);
                }
            }
            editorEdit.apply();
        }
    }

    public static int g(com.applovin.impl.sdk.o oVar) {
        NetworkInfo networkInfoB = b(com.applovin.impl.sdk.o.au());
        if (networkInfoB != null) {
            int type = networkInfoB.getType();
            int subtype = networkInfoB.getSubtype();
            if (type == 1) {
                return 2;
            }
            if (type == 0) {
                if (a(subtype, f11219a)) {
                    return 4;
                }
                if (a(subtype, f11220b)) {
                    return 5;
                }
                if (a(subtype, f11221c)) {
                    return 6;
                }
                return a(subtype, f11222d) ? 7 : 3;
            }
        }
        return 0;
    }

    public static void g(JSONObject jSONObject, com.applovin.impl.sdk.o oVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "variables", (JSONObject) null);
        if (jSONObject2 != null) {
            oVar.A().updateVariables(jSONObject2);
        }
    }

    public static String h(com.applovin.impl.sdk.o oVar) {
        return a((String) oVar.a(com.applovin.impl.sdk.c.b.bh), ((Boolean) oVar.a(com.applovin.impl.sdk.c.b.dL)).booleanValue() ? "5.0/ad" : "4.0/ad", oVar);
    }

    public static String i(com.applovin.impl.sdk.o oVar) {
        return a((String) oVar.a(com.applovin.impl.sdk.c.b.bi), ((Boolean) oVar.a(com.applovin.impl.sdk.c.b.dL)).booleanValue() ? "5.0/ad" : "4.0/ad", oVar);
    }

    public static String j(com.applovin.impl.sdk.o oVar) {
        return a((String) oVar.a(com.applovin.impl.sdk.c.b.bh), "4.0/ad", oVar);
    }

    public static String k(com.applovin.impl.sdk.o oVar) {
        return a((String) oVar.a(com.applovin.impl.sdk.c.b.bi), "4.0/ad", oVar);
    }

    public static String l(com.applovin.impl.sdk.o oVar) {
        return a((String) oVar.a(com.applovin.impl.sdk.c.b.bn), "1.0/variable_config", oVar);
    }

    public static String m(com.applovin.impl.sdk.o oVar) {
        return a((String) oVar.a(com.applovin.impl.sdk.c.b.bo), "1.0/variable_config", oVar);
    }

    public static Long n(com.applovin.impl.sdk.o oVar) {
        com.applovin.impl.sdk.network.b.c cVarA = oVar.I().a();
        if (cVarA == null) {
            return null;
        }
        double d10 = w.d(cVarA.c());
        double dA = w.a(cVarA.d());
        if (dA == 0.0d) {
            return null;
        }
        return Long.valueOf((long) (d10 / dA));
    }
}
