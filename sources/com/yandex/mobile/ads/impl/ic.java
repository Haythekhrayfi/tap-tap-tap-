package com.yandex.mobile.ads.impl;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ic implements com.yandex.metrica.p.Ucc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q9.a f21676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mc f21677b;

    public /* synthetic */ ic(q9.a aVar) {
        this(aVar, new mc());
    }

    public ic(q9.a aVar, mc mcVar) {
        fd.j0.i(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        fd.j0.i(mcVar, "autograbParser");
        this.f21676a = aVar;
        this.f21677b = mcVar;
    }

    @Override // com.yandex.metrica.p.Ucc
    public final void onError(String str) {
        fd.j0.i(str, "error");
        this.f21676a.b(str);
    }

    @Override // com.yandex.metrica.p.Ucc
    public final void onResult(JSONObject jSONObject) {
        fd.j0.i(jSONObject, "jsonObject");
        this.f21676a.a(this.f21677b.a(jSONObject));
    }
}
