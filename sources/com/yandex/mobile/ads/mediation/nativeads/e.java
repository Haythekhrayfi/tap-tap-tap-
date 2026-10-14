package com.yandex.mobile.ads.mediation.nativeads;

import android.content.Context;
import com.yandex.mobile.ads.impl.k2;
import com.yandex.mobile.ads.impl.ni0;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements ni0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f27586a;

    public interface a {
    }

    public e(r rVar) {
        this.f27586a = rVar;
    }

    @Override // com.yandex.mobile.ads.impl.ni0
    public final com.yandex.mobile.ads.nativeads.k a(Context context, k2 k2Var) {
        com.yandex.mobile.ads.nativeads.k kVar = new com.yandex.mobile.ads.nativeads.k(context, k2Var);
        ((r) this.f27586a).f27613a.f27618e.a(kVar);
        return kVar;
    }
}
