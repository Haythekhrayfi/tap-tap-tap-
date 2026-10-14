package com.yandex.mobile.ads.impl;

import com.applovin.impl.adview.activity.FullscreenAdService;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class hj0 implements fw0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fj0 f21438a = new fj0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AdResponse<cj0> f21439b;

    @Override // com.yandex.mobile.ads.impl.fw0.a
    public final Map<String, Object> a() {
        gw0 gw0Var = new gw0(new HashMap());
        AdResponse<cj0> adResponse = this.f21439b;
        if (adResponse != null) {
            ArrayList arrayListA = this.f21438a.a(adResponse);
            if (!arrayListA.isEmpty()) {
                gw0Var.a(arrayListA, "image_sizes");
            }
            fj0 fj0Var = this.f21438a;
            AdResponse<cj0> adResponse2 = this.f21439b;
            Objects.requireNonNull(fj0Var);
            ArrayList arrayListC = fj0.c(adResponse2);
            if (!arrayListC.isEmpty()) {
                gw0Var.a(arrayListC, "native_ad_types");
            }
            fj0 fj0Var2 = this.f21438a;
            AdResponse<cj0> adResponse3 = this.f21439b;
            Objects.requireNonNull(fj0Var2);
            ArrayList arrayListB = fj0.b(adResponse3);
            if (!arrayListB.isEmpty()) {
                gw0Var.a(arrayListB, "ad_id");
            }
            gw0Var.a(this.f21439b.F(), "server_log_id");
            gw0Var.b(this.f21439b.m(), FullscreenAdService.DATA_KEY_AD_SOURCE);
            gw0Var.a(this.f21439b.c());
            Map<String, Object> mapS = this.f21439b.s();
            if (mapS != null) {
                gw0Var.a(mapS);
            }
            if (!this.f21439b.I()) {
                gw0Var.b(this.f21439b.o(), "ad_type_format");
                gw0Var.b(this.f21439b.B(), "product_type");
            }
            gw0Var.a(this.f21439b.w(), "design");
        }
        return gw0Var.a();
    }

    public final void a(AdResponse<cj0> adResponse) {
        this.f21439b = adResponse;
    }
}
