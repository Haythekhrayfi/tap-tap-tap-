package com.yandex.mobile.ads.impl;

import com.applovin.impl.adview.activity.FullscreenAdService;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class pz implements fw0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AdResponse<String> f24281a;

    @Override // com.yandex.mobile.ads.impl.fw0.a
    public final Map<String, Object> a() {
        gw0 gw0Var = new gw0(new HashMap());
        AdResponse<String> adResponse = this.f24281a;
        if (adResponse != null) {
            String strE = adResponse.e();
            gw0Var.a(strE != null ? Collections.singletonList(strE) : null, "ad_id");
            gw0Var.b(this.f24281a.m(), FullscreenAdService.DATA_KEY_AD_SOURCE);
            gw0Var.a(this.f24281a.F(), "server_log_id");
            gw0Var.a(this.f24281a.c());
            Map<String, Object> mapS = this.f24281a.s();
            if (mapS != null) {
                gw0Var.a(mapS);
            }
            gw0Var.a(this.f24281a.w(), "design");
            if (!this.f24281a.I()) {
                gw0Var.b(this.f24281a.o(), "ad_type_format");
                gw0Var.b(this.f24281a.B(), "product_type");
            }
            gw0Var.b(a21.b(this.f24281a.G().d()), "size_type");
            gw0Var.b(Integer.valueOf(this.f24281a.G().e()), "width");
            gw0Var.b(Integer.valueOf(this.f24281a.G().c()), "height");
        }
        return gw0Var.a();
    }

    public final void a(AdResponse<String> adResponse) {
        this.f24281a = adResponse;
    }
}
