package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ym, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2120ym {

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ym$a */
    public static class a extends JSONObject {
        public a() {
        }

        public a(String str) throws JSONException {
            super(str);
        }

        public Long a(String str) {
            try {
                return Long.valueOf(getLong(str));
            } catch (Throwable unused) {
                return null;
            }
        }

        public String b(String str) {
            if (!has(str) || !has(str)) {
                return "";
            }
            try {
                return getString(str);
            } catch (Throwable unused) {
                return "";
            }
        }

        public String c(String str) {
            if (has(str)) {
                try {
                    return getString(str);
                } catch (Throwable unused) {
                }
            }
            return "";
        }

        public boolean d(String str) {
            try {
                return JSONObject.NULL != get(str);
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    public static long a(Long l10, TimeUnit timeUnit, long j10) {
        return l10 == null ? j10 : timeUnit.toMillis(l10.longValue());
    }

    private static Kl a(JSONObject jSONObject, C1760kg.u uVar) {
        return new Kl(jSONObject.optBoolean("tsc", uVar.f16725b), jSONObject.optBoolean("rtsc1", uVar.f16726c), jSONObject.optBoolean("tvc", uVar.f16727d), jSONObject.optBoolean("tsc1", uVar.f16728e), jSONObject.optBoolean("ic", uVar.f16733j), jSONObject.optBoolean("ncvc", uVar.f16734k), jSONObject.optBoolean("tlc", uVar.f16735l), jSONObject.optBoolean("vh", uVar.f16736m), jSONObject.optBoolean("if", uVar.f16738o), jSONObject.optBoolean("wvuc", uVar.f16739p), jSONObject.optInt("tltb", uVar.f16729f), jSONObject.optInt("ttb", uVar.f16730g), jSONObject.optInt("mec", uVar.f16731h), jSONObject.optInt("mfcl", uVar.f16732i), jSONObject.optInt("wvul", uVar.f16740q), a(jSONObject.optJSONArray("f")));
    }

    private static Wa a(JSONObject jSONObject, String str) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject != null) {
            return new Wa(jSONObjectOptJSONObject.optLong("exp_t"), jSONObjectOptJSONObject.optInt("interval"));
        }
        return null;
    }

    public static Xa a(JSONObject jSONObject) {
        return new Xa(a(jSONObject, "activation"), a(jSONObject, "satellite_clids"), a(jSONObject, "preload_info"));
    }

    public static Object a(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            if (!obj.getClass().isArray()) {
                if (obj instanceof Collection) {
                    return b((Collection<?>) obj);
                }
                return obj instanceof Map ? h((Map) obj) : obj;
            }
            int length = Array.getLength(obj);
            ArrayList arrayList = new ArrayList(length);
            for (int i10 = 0; i10 < length; i10++) {
                arrayList.add(a(Array.get(obj, i10)));
            }
            return new JSONArray((Collection) arrayList);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static <T> T a(T t10, T t11) {
        return t10 == null ? t11 : t10;
    }

    public static String a(Context context, String str) throws UnsupportedEncodingException {
        byte[] bArrA = a(context, Base64.decode(str.getBytes("UTF-8"), 0));
        if (bArrA == null) {
            return null;
        }
        try {
            return new String(V0.a(new String(bArrA, "UTF-8")), "UTF-8");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String a(C2050w2 c2050w2) {
        JSONObject jSONObject;
        if (c2050w2 == null) {
            jSONObject = null;
        } else {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("width", c2050w2.e()).put("height", c2050w2.c()).put("dpi", c2050w2.b()).put("scaleFactor", c2050w2.d()).putOpt("deviceType", c2050w2.a() == null ? null : c2050w2.a().a());
            } catch (Throwable unused) {
            }
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.toString();
    }

    public static String a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        return map.isEmpty() ? "" : g(map);
    }

    private static List<C1617em> a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                    arrayList.add(new C1617em(C1617em.b.a(jSONObject.getInt("ft")), jSONObject.optString("fv")));
                } catch (Throwable unused) {
                }
            }
        }
        return arrayList;
    }

    public static Map<String, String> a(String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : str.split(",")) {
                int iIndexOf = str2.indexOf(":");
                if (iIndexOf != -1) {
                    map.put(str2.substring(0, iIndexOf), str2.substring(iIndexOf + 1));
                }
            }
        }
        return map;
    }

    public static JSONArray a(Collection<Vj> collection) {
        JSONArray jSONArray = new JSONArray();
        if (collection != null) {
            Iterator<Vj> it = collection.iterator();
            while (it.hasNext()) {
                try {
                    jSONArray.put(a(it.next()));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    private static JSONArray a(List<C1617em> list) {
        JSONArray jSONArray = new JSONArray();
        for (C1617em c1617em : list) {
            try {
                jSONArray.put(new JSONObject().put("ft", c1617em.f16072a.f16079a).put("fv", c1617em.f16073b));
            } catch (Throwable unused) {
            }
        }
        return jSONArray;
    }

    public static JSONObject a(Il il) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("upe", il.f14232a).put("uece", il.f14233b).put("ruece", il.f14235d).put("ucfbe", il.f14234c);
        C1542bm c1542bm = il.f14236e;
        JSONObject jSONObjectPutOpt = jSONObjectPut.putOpt("upc", c1542bm == null ? null : new JSONObject().put("tltb", c1542bm.f15846a).put("ttb", c1542bm.f15847b).put("mvcl", c1542bm.f15848c).put("act", c1542bm.f15849d).put("rtsc", c1542bm.f15850e).put("er", c1542bm.f15851f).put("pabd", c1542bm.f15852g).put("f", a(c1542bm.f15853h)));
        Kl kl = il.f14237f;
        JSONObject jSONObjectPutOpt2 = jSONObjectPutOpt.putOpt("uecc", kl == null ? null : a(kl));
        Kl kl2 = il.f14239h;
        JSONObject jSONObjectPutOpt3 = jSONObjectPutOpt2.putOpt("ruecc", kl2 == null ? null : a(kl2));
        Kl kl3 = il.f14238g;
        return jSONObjectPutOpt3.putOpt("ucfbc", kl3 != null ? a(kl3) : null);
    }

    private static JSONObject a(Kl kl) throws JSONException {
        return new JSONObject().put("tsc", kl.f14359a).put("rtsc1", kl.f14360b).put("tvc", kl.f14361c).put("tsc1", kl.f14362d).put("ic", kl.f14363e).put("ncvc", kl.f14364f).put("tlc", kl.f14365g).put("vh", kl.f14366h).put("if", kl.f14367i).put("wvuc", kl.f14368j).put("tltb", kl.f14369k).put("ttb", kl.f14370l).put("mec", kl.f14371m).put("mfcl", kl.f14372n).put("wvul", kl.f14373o).put("f", a(kl.f14374p));
    }

    public static JSONObject a(Vj vj) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cell_id", vj.b());
        jSONObject.put("signal_strength", vj.p());
        jSONObject.put("lac", vj.e());
        jSONObject.put("country_code", vj.k());
        jSONObject.put("operator_id", vj.l());
        jSONObject.put("operator_name", vj.n());
        jSONObject.put("is_connected", vj.q());
        jSONObject.put("cell_type", vj.c());
        jSONObject.put("pci", vj.o());
        jSONObject.put("last_visible_time_offset", vj.d());
        jSONObject.put("lte_rsrq", vj.h());
        jSONObject.put("lte_rssnr", vj.j());
        jSONObject.put("arfcn", vj.a());
        jSONObject.put("lte_rssi", vj.i());
        jSONObject.put("lte_bandwidth", vj.f());
        jSONObject.put("lte_cqi", vj.g());
        return jSONObject;
    }

    private static JSONObject a(Wa wa2) {
        if (wa2 == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("exp_t", wa2.f15379a).put("interval", wa2.f15380b);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public static JSONObject a(Xa xa2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("activation", a(xa2.f15479a));
            jSONObject.putOpt("preload_info", a(xa2.f15481c));
            jSONObject.putOpt("satellite_clids", a(xa2.f15480b));
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public static boolean a(JSONObject jSONObject, String str, boolean z10) {
        Boolean boolB = b(jSONObject, str);
        return boolB == null ? z10 : boolB.booleanValue();
    }

    private static byte[] a(Context context, byte[] bArr) {
        try {
            byte[] bArrB = b(context.getPackageName());
            byte[] bArr2 = new byte[bArr.length];
            for (int i10 = 0; i10 < bArr.length; i10++) {
                bArr2[i10] = (byte) (bArr[i10] ^ bArrB[i10 % bArrB.length]);
            }
            return bArr2;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Boolean b(JSONObject jSONObject, String str) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return Boolean.valueOf(jSONObject.getBoolean(str));
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static String b(Context context, String str) throws UnsupportedEncodingException {
        String strA;
        try {
            strA = V0.a(str.getBytes("UTF-8"));
        } catch (Throwable unused) {
            strA = null;
        }
        return Base64.encodeToString(a(context, strA.getBytes("UTF-8")), 0);
    }

    public static String b(Map<String, List<String>> map) {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                JSONArray jSONArrayB = b((List<?>) entry.getValue());
                if (jSONArrayB != null) {
                    jSONObject.put(entry.getKey(), jSONArrayB.toString());
                }
            }
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    public static HashMap<String, String> b(JSONObject jSONObject) {
        if (JSONObject.NULL.equals(jSONObject)) {
            return null;
        }
        HashMap<String, String> map = new HashMap<>();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = jSONObject.optString(next);
            if (strOptString != null) {
                map.put(next, strOptString);
            }
        }
        return map;
    }

    public static List<String> b(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(jSONArray.getString(i10));
        }
        return arrayList;
    }

    private static JSONArray b(Collection<?> collection) {
        if (collection == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList(collection.size());
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(a(it.next()));
            }
            return new JSONArray((Collection) arrayList);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static JSONArray b(List<?> list) {
        if (U2.b(list)) {
            return null;
        }
        return U2.a(19) ? new JSONArray((Collection) list) : b((Collection<?>) list);
    }

    public static byte[] b(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.reset();
        messageDigest.update(str.getBytes("UTF-8"));
        return messageDigest.digest();
    }

    public static Il c(JSONObject jSONObject) throws JSONException {
        C1542bm c1542bm;
        C1760kg.i iVar = new C1760kg.i();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("upc");
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("uecc");
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("ucfbc");
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("ruecc");
        boolean zOptBoolean = jSONObject.optBoolean("upe", iVar.f16646q);
        boolean zOptBoolean2 = jSONObject.optBoolean("uece", iVar.f16647r);
        boolean zOptBoolean3 = jSONObject.optBoolean("ucfbe", iVar.f16648s);
        boolean zOptBoolean4 = jSONObject.optBoolean("ruece", iVar.f16652w);
        if (jSONObjectOptJSONObject == null) {
            c1542bm = null;
        } else {
            C1760kg.v vVar = new C1760kg.v();
            c1542bm = new C1542bm(jSONObjectOptJSONObject.optInt("tltb", vVar.f16741b), jSONObjectOptJSONObject.optInt("ttb", vVar.f16742c), jSONObjectOptJSONObject.optInt("mvcl", vVar.f16743d), jSONObjectOptJSONObject.optLong("act", vVar.f16744e), jSONObjectOptJSONObject.optBoolean("rtsc", vVar.f16745f), jSONObjectOptJSONObject.optBoolean("er", vVar.f16746g), jSONObjectOptJSONObject.optBoolean("pabd", vVar.f16747h), a(jSONObjectOptJSONObject.optJSONArray("f")));
        }
        return new Il(zOptBoolean, zOptBoolean2, zOptBoolean3, zOptBoolean4, c1542bm, jSONObjectOptJSONObject2 == null ? null : a(jSONObjectOptJSONObject2, C2048w0.b()), jSONObjectOptJSONObject3 == null ? null : a(jSONObjectOptJSONObject3, C2048w0.a()), jSONObjectOptJSONObject4 != null ? a(jSONObjectOptJSONObject4, C2048w0.b()) : null);
    }

    public static Integer c(JSONObject jSONObject, String str) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return Integer.valueOf(jSONObject.getInt(str));
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static String c(List<String> list) {
        if (U2.b(list)) {
            return null;
        }
        return U2.a(19) ? new JSONArray((Collection) list).toString() : a((Object) list).toString();
    }

    public static String c(Map<String, String> map) {
        if (U2.b(map)) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb2.append(entry.getKey());
            sb2.append(":");
            sb2.append(entry.getValue());
            sb2.append(",");
        }
        sb2.setLength(sb2.length() - 1);
        return sb2.toString();
    }

    public static List<String> c(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                ArrayList arrayList = new ArrayList(jSONArray.length());
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    try {
                        arrayList.add(jSONArray.getString(i10));
                    } catch (Throwable unused) {
                        return arrayList;
                    }
                }
                return arrayList;
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    public static Long d(JSONObject jSONObject, String str) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return Long.valueOf(jSONObject.getLong(str));
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static HashMap<String, String> d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return b(new JSONObject(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean d(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return false;
        }
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            try {
                Integer.parseInt(it.next().getValue());
            } catch (Throwable unused) {
                return false;
            }
        }
        return true;
    }

    public static String e(JSONObject jSONObject, String str) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return jSONObject.getString(str);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static HashMap<String, String> e(String str) throws JSONException {
        return b(new JSONObject(str));
    }

    public static JSONObject e(Map map) {
        if (U2.b(map)) {
            return null;
        }
        return U2.a(19) ? new JSONObject(map) : h(map);
    }

    public static C2050w2 f(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            return new C2050w2(jSONObject.optInt("width"), jSONObject.optInt("height"), jSONObject.optInt("dpi"), (float) jSONObject.optDouble("scaleFactor", 0.0d), com.yandex.metrica.c.a(jSONObject.optString("deviceType")));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static JSONObject f(Map map) {
        if (map == null) {
            return null;
        }
        return map.isEmpty() ? new JSONObject() : e(map);
    }

    public static String g(Map map) {
        if (U2.b(map)) {
            return null;
        }
        return U2.a(19) ? new JSONObject(map).toString() : a((Object) map).toString();
    }

    private static JSONObject h(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String string = entry.getKey().toString();
            if (string != null) {
                linkedHashMap.put(string, a(entry.getValue()));
            }
        }
        return new JSONObject(linkedHashMap);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005f  */
    public static Map<String, String> i(Map<String, String> map) {
        boolean z10;
        long j10;
        HashMap map2 = new HashMap();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                if ((TextUtils.isEmpty(key) || key.contains(":") || key.contains(",") || key.contains("&")) ? false : true) {
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(value)) {
                        try {
                            j10 = Long.parseLong(value);
                        } catch (NumberFormatException unused) {
                            j10 = -1;
                        }
                        z10 = j10 != -1;
                    }
                    if (z10) {
                        map2.put(entry.getKey(), entry.getValue());
                    }
                }
            }
        }
        return map2;
    }
}
