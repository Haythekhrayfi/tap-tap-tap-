package com.yandex.mobile.ads.impl;

import com.applovin.impl.adview.activity.FullscreenAdService;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class nd0 implements q5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdResponse f23337a;

    public nd0(AdResponse adResponse) {
        this.f23337a = adResponse;
    }

    @Override // com.yandex.mobile.ads.impl.q5
    public final Map<String, Object> a() {
        gw0 gw0Var = new gw0(new HashMap());
        gw0Var.b(this.f23337a.m(), FullscreenAdService.DATA_KEY_AD_SOURCE);
        gw0Var.b(this.f23337a.p(), "block_id");
        gw0Var.b(this.f23337a.p(), "ad_unit_id");
        gw0Var.a(this.f23337a.F(), "server_log_id");
        return gw0Var.a();
    }
}
