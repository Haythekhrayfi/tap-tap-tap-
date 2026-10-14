package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class c10 extends ie {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ie f19357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ba1 f19358b = r8.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f19359c;

    public c10(Context context, ze0 ze0Var) {
        this.f19357a = ze0Var;
        this.f19359c = context != null ? context.getApplicationContext() : null;
    }

    @Override // com.yandex.mobile.ads.impl.ie
    public final z00 a(mw0<?> mw0Var, Map<String, String> map) throws fc, IOException {
        HashMap map2 = new HashMap();
        if (map != null) {
            map2.putAll(map);
        }
        map2.put(t00.b(44), this.f19358b.a(this.f19359c));
        return this.f19357a.a(mw0Var, map2);
    }
}
