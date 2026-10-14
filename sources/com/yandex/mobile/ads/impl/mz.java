package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mz extends ae<String> {
    public mz(Context context, l6 l6Var, w3 w3Var) {
        super(context, l6Var, w3Var);
    }

    @Override // com.yandex.mobile.ads.impl.ae
    public final xd<String> a(String str, String str2) {
        return new s2(this.f18884b, this.f18888f, str, str2, this);
    }

    @Override // com.yandex.mobile.ads.impl.ae, com.yandex.mobile.ads.impl.gx0.b
    public /* bridge */ /* synthetic */ void a(Object obj) {
        a((AdResponse) obj);
    }
}
