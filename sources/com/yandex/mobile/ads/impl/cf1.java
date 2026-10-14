package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class cf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vd f19495a = new vd();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vc1<vl0> f19496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final jb1 f19497c;

    public cf1(Context context) {
        this.f19496b = new vc1<>(context, new wl0());
        this.f19497c = new jb1(context);
    }

    public final Object a(JSONObject jSONObject) throws JSONException, zi0 {
        na1 na1VarA;
        try {
            na1VarA = this.f19497c.a(this.f19495a.a("vast", jSONObject));
        } catch (Exception unused) {
            na1VarA = null;
        }
        if (na1VarA == null || na1VarA.b().isEmpty()) {
            throw new zi0("Invalid VAST in response");
        }
        ArrayList arrayListA = this.f19496b.a(na1VarA.b());
        if (arrayListA.isEmpty()) {
            throw new zi0("Invalid VAST in response");
        }
        return new zb1(arrayListA);
    }
}
