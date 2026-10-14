package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class ze0 extends ie {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f27313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ie f27314b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l9 f27316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final xm0 f27317e = new xm0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final pu0 f27315c = new pu0();

    public ze0(Context context, SSLSocketFactory sSLSocketFactory) {
        this.f27313a = new b(context, sSLSocketFactory);
        this.f27314b = h10.a(context, null, sSLSocketFactory);
        this.f27316d = c.b(context);
    }

    @Override // com.yandex.mobile.ads.impl.ie
    public final z00 a(mw0<?> mw0Var, Map<String, String> map) throws fc, IOException {
        wm0 wm0VarA = this.f27317e.a(mw0Var);
        if (wm0VarA == null) {
            return this.f27316d.a() ? this.f27313a.a(mw0Var, map) : this.f27314b.a(mw0Var, map);
        }
        Objects.requireNonNull(this.f27315c);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : wm0VarA.f26321c.entrySet()) {
            arrayList.add(new oy(entry.getKey(), entry.getValue()));
        }
        return new z00(wm0VarA.f26319a, arrayList, wm0VarA.f26320b);
    }
}
