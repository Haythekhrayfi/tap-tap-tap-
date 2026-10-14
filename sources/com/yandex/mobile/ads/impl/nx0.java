package com.yandex.mobile.ads.impl;

import com.applovin.impl.adview.activity.FullscreenAdService;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class nx0 {
    public static final Map<String, Object> a(AdResponse<?> adResponse) {
        l6 l6VarN;
        gw0 gw0Var = new gw0(new LinkedHashMap());
        gw0Var.b(adResponse != null ? adResponse.p() : null, "block_id");
        gw0Var.b(adResponse != null ? adResponse.p() : null, "ad_unit_id");
        gw0Var.b(adResponse != null ? adResponse.o() : null, "ad_type_format");
        gw0Var.b(adResponse != null ? adResponse.B() : null, "product_type");
        gw0Var.b(adResponse != null ? adResponse.m() : null, FullscreenAdService.DATA_KEY_AD_SOURCE);
        gw0Var.b((adResponse == null || (l6VarN = adResponse.n()) == null) ? null : l6VarN.a(), "ad_type");
        gw0Var.a(adResponse != null ? adResponse.w() : null, "design");
        Map<String, Object> mapA = gw0Var.a();
        fd.j0.h(mapA, "with(ReportDataWrapper(m…     reportData\n        }");
        return mapA;
    }
}
