package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.SizeInfo;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class kv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdResponse f22518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final iw0 f22519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k2 f22520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b5 f22521d = new b5();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private fw0.a f22522e;

    public kv0(Context context, AdResponse adResponse, k2 k2Var) {
        this.f22518a = adResponse;
        this.f22520c = k2Var;
        this.f22519b = z8.a(context);
    }

    public final void a() {
        gw0 gw0Var = new gw0(new HashMap());
        gw0Var.b("Yandex", "adapter");
        gw0Var.b(this.f22518a.p(), "block_id");
        gw0Var.b(this.f22518a.p(), "ad_unit_id");
        gw0Var.b(this.f22518a.o(), "ad_type_format");
        gw0Var.b(this.f22518a.B(), "product_type");
        gw0Var.b(this.f22518a.m(), FullscreenAdService.DATA_KEY_AD_SOURCE);
        gw0Var.a(this.f22518a.c());
        Map<String, Object> mapS = this.f22518a.s();
        if (mapS != null) {
            gw0Var.a(mapS);
        }
        l6 l6VarN = this.f22518a.n();
        gw0Var.b(l6VarN != null ? l6VarN.a() : null, "ad_type");
        fw0.a aVar = this.f22522e;
        if (aVar != null) {
            gw0Var.a(aVar.a());
        }
        SizeInfo sizeInfoN = this.f22520c.n();
        if (sizeInfoN != null) {
            gw0Var.b(a21.b(sizeInfoN.d()), "size_type");
            gw0Var.b(Integer.valueOf(sizeInfoN.e()), "width");
            gw0Var.b(Integer.valueOf(sizeInfoN.c()), "height");
        }
        gw0Var.a(this.f22521d.a(this.f22520c.a()));
        this.f22519b.a(new fw0(fw0.b.f20894u.a(), gw0Var.a()));
    }

    public final void a(qk0 qk0Var) {
        this.f22522e = qk0Var;
    }
}
