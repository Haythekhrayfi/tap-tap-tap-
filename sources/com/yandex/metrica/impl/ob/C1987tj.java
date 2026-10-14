package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.tj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1987tj {
    private List<Integer> a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            int iOptInt = jSONArray.optInt(i10);
            if (iOptInt != 0) {
                arrayList.add(Integer.valueOf(iOptInt));
            }
        }
        return arrayList;
    }

    public void a(C2042vj c2042vj, C2120ym.a aVar) {
        JSONObject jSONObjectOptJSONObject;
        if (!c2042vj.O() || (jSONObjectOptJSONObject = aVar.optJSONObject("socket")) == null) {
            return;
        }
        C1760kg.p pVar = new C1760kg.p();
        long jOptLong = jSONObjectOptJSONObject.optLong("seconds_to_live");
        long jOptLong2 = jSONObjectOptJSONObject.optLong("first_delay_seconds", pVar.f16713f);
        int iOptInt = jSONObjectOptJSONObject.optInt("launch_delay_seconds", pVar.f16714g);
        long jOptLong3 = jSONObjectOptJSONObject.optLong("open_event_interval_seconds", pVar.f16715h);
        long jOptLong4 = jSONObjectOptJSONObject.optLong("min_failed_request_interval_seconds", pVar.f16716i);
        long jOptLong5 = jSONObjectOptJSONObject.optLong("min_successful_request_interval_seconds", pVar.f16717j);
        long jOptLong6 = jSONObjectOptJSONObject.optLong("open_retry_interval_seconds", pVar.f16718k);
        String strOptString = jSONObjectOptJSONObject.optString("token");
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("ports_https");
        JSONArray jSONArray = new JSONArray();
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = jSONArray;
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("ports_http");
        JSONArray jSONArray2 = new JSONArray();
        if (jSONArrayOptJSONArray2 == null) {
            jSONArrayOptJSONArray2 = jSONArray2;
        }
        boolean z10 = jSONArrayOptJSONArray.length() > 0 || jSONArrayOptJSONArray2.length() > 0;
        if (jOptLong <= 0 || TextUtils.isEmpty(strOptString) || !z10) {
            return;
        }
        List<Integer> listA = a(jSONArrayOptJSONArray);
        List<Integer> listA2 = a(jSONArrayOptJSONArray2);
        if (((ArrayList) listA).isEmpty() && ((ArrayList) listA2).isEmpty()) {
            return;
        }
        c2042vj.a(new Ei(jOptLong, strOptString, listA, listA2, jOptLong2, iOptInt, jOptLong3, jOptLong4, jOptLong5, jOptLong6));
    }
}
