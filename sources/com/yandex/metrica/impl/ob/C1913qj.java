package com.yandex.metrica.impl.ob;

import android.util.Pair;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.qj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1913qj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, Bi.a> f17186a = Collections.unmodifiableMap(new a());

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.qj$a */
    public class a extends HashMap<String, Bi.a> {
        public a() {
            put("wifi", Bi.a.WIFI);
            put("cell", Bi.a.CELL);
        }
    }

    private Bi a(JSONObject jSONObject) throws JSONException {
        int i10;
        JSONObject jSONObject2 = jSONObject.getJSONObject("headers");
        ArrayList arrayList = new ArrayList(jSONObject2.length());
        Iterator<String> itKeys = jSONObject2.keys();
        while (true) {
            i10 = 0;
            if (!itKeys.hasNext()) {
                break;
            }
            String next = itKeys.next();
            JSONArray jSONArray = jSONObject2.getJSONArray(next);
            while (i10 < jSONArray.length()) {
                arrayList.add(new Pair(next, jSONArray.getString(i10)));
                i10++;
            }
        }
        String strE = C2120ym.e(jSONObject, FacebookMediationAdapter.KEY_ID);
        String strE2 = C2120ym.e(jSONObject, ImagesContract.URL);
        String strE3 = C2120ym.e(jSONObject, "method");
        Long lValueOf = Long.valueOf(jSONObject.getLong("delay_seconds"));
        ArrayList arrayList2 = new ArrayList();
        if (jSONObject.has("accept_network_types")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("accept_network_types");
            while (i10 < jSONArray2.length()) {
                arrayList2.add(f17186a.get(jSONArray2.getString(i10)));
                i10++;
            }
        }
        return new Bi(strE, strE2, strE3, arrayList, lValueOf, arrayList2);
    }

    public void a(C2042vj c2042vj, C2120ym.a aVar) {
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject = aVar.optJSONObject("requests");
        if (jSONObjectOptJSONObject == null || !jSONObjectOptJSONObject.has("list") || (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("list")) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(jSONArrayOptJSONArray.length());
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            try {
                arrayList.add(a(jSONArrayOptJSONArray.getJSONObject(i10)));
            } catch (Throwable unused) {
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        c2042vj.g(arrayList);
    }
}
