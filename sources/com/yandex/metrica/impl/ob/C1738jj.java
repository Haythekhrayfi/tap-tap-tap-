package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.jj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1738jj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set<String> f16480a;

    static {
        HashSet hashSet = new HashSet();
        f16480a = hashSet;
        hashSet.add("get_ad");
        hashSet.add("report");
        hashSet.add("report_ad");
        hashSet.add("location");
        hashSet.add("startup");
        hashSet.add("diagnostic");
        hashSet.add("mediascope");
    }

    private List<String> a(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
            if (jSONObjectOptJSONObject != null) {
                return C2120ym.b(jSONObjectOptJSONObject.getJSONArray("urls"));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public void a(C2042vj c2042vj, C2120ym.a aVar) {
        String string;
        List<String> listA;
        String string2 = "";
        try {
            Object jSONObject = new JSONObject();
            try {
                jSONObject = aVar.get("query_hosts");
            } catch (Throwable unused) {
            }
            JSONObject jSONObjectOptJSONObject = ((JSONObject) jSONObject).optJSONObject("list");
            if (jSONObjectOptJSONObject != null) {
                try {
                    string = jSONObjectOptJSONObject.getJSONObject("get_ad").getJSONArray("urls").getString(0);
                } catch (Throwable unused2) {
                    string = "";
                }
                if (!TextUtils.isEmpty(string)) {
                    c2042vj.f(string);
                }
                List<String> listA2 = a(jSONObjectOptJSONObject, "report");
                if (!U2.b(listA2)) {
                    c2042vj.f(listA2);
                }
                try {
                    string2 = jSONObjectOptJSONObject.getJSONObject("report_ad").getJSONArray("urls").getString(0);
                } catch (Throwable unused3) {
                }
                if (!TextUtils.isEmpty(string2)) {
                    c2042vj.g(string2);
                }
                List<String> listA3 = a(jSONObjectOptJSONObject, "location");
                if (!U2.b(listA3)) {
                    c2042vj.c(listA3);
                }
                List<String> listA4 = a(jSONObjectOptJSONObject, "startup");
                if (!U2.b(listA4)) {
                    c2042vj.h(listA4);
                }
                List<String> listA5 = a(jSONObjectOptJSONObject, "diagnostic");
                if (!U2.b(listA5)) {
                    c2042vj.a(listA5);
                }
                List<String> listA6 = a(jSONObjectOptJSONObject, "mediascope");
                if (!U2.b(listA6)) {
                    c2042vj.e(listA6);
                }
                HashMap map = new HashMap();
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!f16480a.contains(next) && (listA = a(jSONObjectOptJSONObject, next)) != null) {
                        map.put(next, listA);
                    }
                }
                c2042vj.a(map);
            }
        } catch (Throwable unused4) {
        }
    }
}
