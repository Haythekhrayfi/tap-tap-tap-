package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import com.yandex.mobile.ads.base.model.MediationData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ae0 implements qx0<MediationData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zm0 f18910a = new zm0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ge0 f18911b = new ge0();

    @Override // com.yandex.mobile.ads.impl.qx0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final MediationData a(fx0 fx0Var) {
        String strA = this.f18910a.a(fx0Var);
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(strA);
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("passback_parameters");
                HashMap map = new HashMap();
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, jSONObject2.getString(next));
                }
                if (map.isEmpty()) {
                    return null;
                }
                JSONArray jSONArray = jSONObject.getJSONArray("networks");
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    ce0 ce0VarA = this.f18911b.a(jSONArray.getJSONObject(i10));
                    if (ce0VarA != null) {
                        arrayList.add(ce0VarA);
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new MediationData(arrayList, map);
            } catch (JSONException e10) {
                x60.a(e10, "Can't parse mediation passback_parameters", new Object[0]);
                throw new JSONException(e10.getMessage());
            }
        } catch (JSONException e11) {
            x60.a(e11, "Can't parse mediation data response", new Object[0]);
            return null;
        }
    }
}
