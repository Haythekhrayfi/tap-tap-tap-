package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.io.IOException;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
final class b extends ie implements g10.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ie f19075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f19076b = c.a();

    public b(Context context, SSLSocketFactory sSLSocketFactory) {
        this.f19075a = h10.a(context, this, sSLSocketFactory);
    }

    @Override // com.yandex.mobile.ads.impl.ie
    public final z00 a(mw0<?> mw0Var, Map<String, String> map) throws fc, IOException {
        String strM = mw0Var.m();
        if ((strM == null || this.f19076b.a(strM)) ? false : true) {
            map.put(t00.b(1), mw0Var.m());
        }
        return this.f19075a.a(mw0Var, map);
    }

    @Override // com.yandex.mobile.ads.impl.q91
    public final String a(String str) {
        return str != null && !this.f19076b.a(str) ? "https://yandex.ru/appcry" : str;
    }
}
