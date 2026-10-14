package com.yandex.metrica.impl.ob;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class C9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final I8 f13766a;

    public C9(I8 i10) {
        this.f13766a = i10;
    }

    public final int a(int i10) {
        JSONObject jSONObjectF = this.f13766a.f();
        if (jSONObjectF != null) {
            return jSONObjectF.optInt(String.valueOf(i10));
        }
        return 0;
    }

    public final void a(int i10, int i11) throws JSONException {
        JSONObject jSONObjectF = this.f13766a.f();
        if (jSONObjectF == null) {
            jSONObjectF = new JSONObject();
        }
        jSONObjectF.put(String.valueOf(i10), i11);
        this.f13766a.b(jSONObjectF);
    }
}
