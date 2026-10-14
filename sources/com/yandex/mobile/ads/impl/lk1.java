package com.yandex.mobile.ads.impl;

import com.applovin.impl.adview.activity.FullscreenAdService;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class lk1 implements q5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdResponse f22721a;

    public lk1(AdResponse adResponse) {
        this.f22721a = adResponse;
    }

    @Override // com.yandex.mobile.ads.impl.q5
    public final Map<String, Object> a() {
        gw0 gw0Var = new gw0(new HashMap());
        gw0Var.b(this.f22721a.m(), FullscreenAdService.DATA_KEY_AD_SOURCE);
        gw0Var.b(this.f22721a.o(), "ad_type_format");
        gw0Var.b(this.f22721a.p(), "block_id");
        gw0Var.b(this.f22721a.p(), "ad_unit_id");
        gw0Var.b(this.f22721a.B(), "product_type");
        gw0Var.a(this.f22721a.F(), "server_log_id");
        gw0Var.b(a21.b(this.f22721a.G().d()), "size_type");
        gw0Var.b(Integer.valueOf(this.f22721a.G().e()), "width");
        gw0Var.b(Integer.valueOf(this.f22721a.G().c()), "height");
        return gw0Var.a();
    }
}
