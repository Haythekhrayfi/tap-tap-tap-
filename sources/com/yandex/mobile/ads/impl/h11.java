package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class h11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b5 f21277a = new b5();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final iw0 f21278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AdResponse f21279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k2 f21280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final fw0.a f21281e;

    public h11(Context context, AdResponse adResponse, k2 k2Var, fw0.a aVar) {
        this.f21280d = k2Var;
        this.f21279c = adResponse;
        this.f21281e = aVar;
        this.f21278b = z8.a(context);
    }

    public final void a(List<f31> list) {
        gw0 gw0Var = new gw0(new HashMap());
        l6 l6VarN = this.f21279c.n();
        if (l6VarN != null) {
            gw0Var.b(l6VarN.a(), "ad_type");
        } else {
            gw0Var.a("ad_type");
        }
        gw0Var.b(this.f21279c.p(), "block_id");
        gw0Var.b(this.f21279c.p(), "ad_unit_id");
        gw0Var.b("Yandex", "adapter");
        gw0Var.b(this.f21279c.o(), "ad_type_format");
        gw0Var.b(this.f21279c.B(), "product_type");
        gw0Var.b(this.f21279c.m(), FullscreenAdService.DATA_KEY_AD_SOURCE);
        String[] strArr = new String[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            strArr[i10] = list.get(i10).b();
        }
        gw0Var.b(strArr, "social_actions");
        gw0Var.a(this.f21277a.a(this.f21280d.a()));
        fw0.a aVar = this.f21281e;
        if (aVar != null) {
            gw0Var.a(aVar.a());
        }
        fw0.b bVar = fw0.b.E;
        this.f21278b.a(new fw0(bVar.a(), gw0Var.a()));
    }
}
