package com.yandex.mobile.ads.impl;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class mc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ud f23020a;

    public /* synthetic */ mc() {
        this(new ud());
    }

    public mc(ud udVar) {
        fd.j0.i(udVar, "base64Encoder");
        this.f23020a = udVar;
    }

    public final String a(JSONObject jSONObject) {
        fd.j0.i(jSONObject, "jsonObject");
        String string = jSONObject.toString();
        fd.j0.h(string, "jsonObject.toString()");
        Objects.requireNonNull(this.f23020a);
        return ud.a(string);
    }
}
