package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.SizeInfo;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class gi implements jw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b5 f21062a = new b5();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final iw0 f21063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AdResponse f21064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k2 f21065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final fw0.a f21066e;

    public gi(Context context, AdResponse adResponse, k2 k2Var, ai0 ai0Var) {
        this.f21064c = adResponse;
        this.f21065d = k2Var;
        this.f21066e = ai0Var;
        this.f21063b = z8.a(context);
    }

    private fw0 a(fw0.b bVar, HashMap map) {
        SizeInfo sizeInfoN;
        gw0 gw0Var = new gw0(map);
        l6 l6VarN = this.f21064c.n();
        if (l6VarN != null) {
            gw0Var.b(l6VarN.a(), "ad_type");
        } else {
            gw0Var.a("ad_type");
        }
        gw0Var.b(this.f21064c.p(), "block_id");
        gw0Var.b(this.f21064c.p(), "ad_unit_id");
        gw0Var.b("Yandex", "adapter");
        gw0Var.b(this.f21064c.o(), "ad_type_format");
        gw0Var.b(this.f21064c.B(), "product_type");
        gw0Var.b(this.f21064c.m(), FullscreenAdService.DATA_KEY_AD_SOURCE);
        Map<String, Object> mapS = this.f21064c.s();
        if (mapS != null) {
            gw0Var.a(mapS);
        }
        k2 k2Var = this.f21065d;
        if (k2Var != null && (sizeInfoN = k2Var.n()) != null) {
            gw0Var.b(a21.b(sizeInfoN.d()), "size_type");
            gw0Var.b(Integer.valueOf(sizeInfoN.e()), "width");
            gw0Var.b(Integer.valueOf(sizeInfoN.c()), "height");
        }
        gw0Var.a(this.f21064c.c());
        k2 k2Var2 = this.f21065d;
        if (k2Var2 != null) {
            map.putAll(this.f21062a.a(k2Var2.a()));
        }
        fw0.a aVar = this.f21066e;
        if (aVar != null) {
            map.putAll(aVar.a());
        }
        return new fw0(bVar.a(), gw0Var.a());
    }

    public final void a(fw0.b bVar) {
        this.f21063b.a(a(bVar, new HashMap()));
    }

    public final void a(HashMap map) {
        this.f21063b.a(a(fw0.b.A, map));
    }
}
