package com.yandex.mobile.ads.impl;

import com.applovin.impl.adview.activity.FullscreenAdService;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class jd1 implements fw0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k2 f22017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdResponse<?> f22018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b5 f22019c = new b5();

    public jd1(k2 k2Var, AdResponse<?> adResponse) {
        this.f22017a = k2Var;
        this.f22018b = adResponse;
    }

    @Override // com.yandex.mobile.ads.impl.fw0.a
    public final Map<String, Object> a() {
        gw0 gw0Var = new gw0(new HashMap());
        gw0Var.b("Yandex", "adapter");
        gw0Var.b(this.f22018b.p(), "block_id");
        gw0Var.b(this.f22018b.p(), "ad_unit_id");
        gw0Var.b(this.f22018b.o(), "ad_type_format");
        gw0Var.b(this.f22018b.B(), "product_type");
        gw0Var.b(this.f22018b.m(), FullscreenAdService.DATA_KEY_AD_SOURCE);
        gw0Var.a(this.f22018b.c());
        l6 l6VarN = this.f22018b.n();
        if (l6VarN != null) {
            gw0Var.b(l6VarN.a(), "ad_type");
        } else {
            gw0Var.a("ad_type");
        }
        Map<String, Object> mapS = this.f22018b.s();
        if (mapS != null) {
            gw0Var.a(mapS);
        }
        gw0Var.a(this.f22019c.a(this.f22017a.a()));
        return gw0Var.a();
    }
}
