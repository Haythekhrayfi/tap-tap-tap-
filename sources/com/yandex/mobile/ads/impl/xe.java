package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.model.AdUnitIdBiddingSettings;
import com.yandex.mobile.ads.base.model.BiddingSettings;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class xe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ge0 f26507a = new ge0();

    public final AdUnitIdBiddingSettings a(JSONObject jSONObject) {
        String strB;
        try {
            try {
                strB = r70.b("ad_unit_id", jSONObject);
            } catch (JSONException unused) {
                strB = r70.b("block_id", jSONObject);
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("networks");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                ArrayList arrayList = new ArrayList(jSONArrayOptJSONArray.length());
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    ce0 ce0VarA = this.f26507a.a(jSONArrayOptJSONArray.getJSONObject(i10));
                    if (ce0VarA != null) {
                        arrayList.add(ce0VarA);
                    }
                }
                if (!arrayList.isEmpty()) {
                    return new AdUnitIdBiddingSettings(strB, jSONObject.toString(), arrayList);
                }
            }
        } catch (JSONException unused2) {
            x60.c("Can't parse bidding block in bidding settings json", new Object[0]);
        }
        return null;
    }

    public final BiddingSettings b(JSONObject jSONObject) {
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("ad_unit_id_settings");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = jSONObject.optJSONArray("block_id_settings");
            }
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    AdUnitIdBiddingSettings adUnitIdBiddingSettingsA = a(jSONArrayOptJSONArray.getJSONObject(i10));
                    if (adUnitIdBiddingSettingsA != null) {
                        arrayList.add(adUnitIdBiddingSettingsA);
                    }
                }
                if (!arrayList.isEmpty()) {
                    return new BiddingSettings(arrayList);
                }
            }
        } catch (JSONException unused) {
            x60.c("Can't parse bidding settings json", new Object[0]);
        }
        return null;
    }
}
