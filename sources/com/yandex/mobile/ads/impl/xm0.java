package com.yandex.mobile.ads.impl;

import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public final class xm0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final tu0 f26558b = tu0.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ru0 f26557a = new ru0();

    public final wm0 a(mw0<?> mw0Var) {
        String strA = this.f26558b.a(mw0Var);
        if (strA != null) {
            try {
                qu0 qu0VarA = this.f26557a.a(strA);
                return new wm0(qu0VarA.a().getBytes(), qu0VarA.b());
            } catch (JSONException unused) {
            }
        }
        return null;
    }
}
