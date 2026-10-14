package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class lb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bb f22671a;

    public lb(Context context) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f22671a = new bb(context, new n80());
    }

    public final ArrayList a(JSONObject jSONObject) throws JSONException, zi0 {
        fd.j0.i(jSONObject, "jsonNative");
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("assets");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
            boolean z10 = jSONObject2.getBoolean("required");
            try {
                qa qaVarA = this.f22671a.a(jSONObject2);
                fd.j0.h(qaVarA, "mAssetJsonParser.parseAsset(jsonAsset)");
                arrayList.add(qaVarA);
            } catch (Throwable th) {
                if (z10) {
                    throw th;
                }
            }
        }
        return arrayList;
    }
}
