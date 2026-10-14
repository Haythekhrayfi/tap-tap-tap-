package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
final class zp extends vc.l implements uc.l<JSONObject, jc.w> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List<JSONObject> f27391a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp(ArrayList arrayList) {
        super(1);
        this.f27391a = arrayList;
    }

    @Override // uc.l
    public final jc.w invoke(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        fd.j0.i(jSONObject2, "node");
        this.f27391a.add(jSONObject2);
        return jc.w.f31842a;
    }
}
