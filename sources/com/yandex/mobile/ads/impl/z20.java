package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.SizeInfo;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class z20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final iw0 f27190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k2 f27191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b5 f27192c = new b5();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AdResponse f27193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private fw0.a f27194e;

    public z20(Context context, k2 k2Var) {
        this.f27191b = k2Var;
        this.f27190a = z8.a(context);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x00c1  */
    private Map<String, Object> a() {
        fw0.a aVar;
        gw0 gw0Var = new gw0(new HashMap());
        gw0Var.b("Yandex", "adapter");
        AdResponse adResponse = this.f27193d;
        String str = FullscreenAdService.DATA_KEY_AD_SOURCE;
        if (adResponse != null) {
            gw0Var.b(adResponse.p(), "block_id");
            gw0Var.b(this.f27193d.p(), "ad_unit_id");
            gw0Var.b(this.f27193d.o(), "ad_type_format");
            gw0Var.b(this.f27193d.B(), "product_type");
            gw0Var.b(this.f27193d.m(), FullscreenAdService.DATA_KEY_AD_SOURCE);
            gw0Var.a(this.f27193d.c());
            Map<String, Object> mapS = this.f27193d.s();
            if (mapS != null) {
                gw0Var.a(mapS);
            }
            SizeInfo sizeInfoN = this.f27191b.n();
            if (sizeInfoN != null) {
                gw0Var.b(a21.b(sizeInfoN.d()), "size_type");
                gw0Var.b(Integer.valueOf(sizeInfoN.e()), "width");
                gw0Var.b(Integer.valueOf(sizeInfoN.c()), "height");
            }
            l6 l6VarN = this.f27193d.n();
            str = "ad_type";
            if (l6VarN != null) {
                gw0Var.b(l6VarN.a(), "ad_type");
            }
            gw0Var.a(this.f27192c.a(this.f27191b.a()));
            aVar = this.f27194e;
            if (aVar != null) {
                gw0Var.a(aVar.a());
            }
            return gw0Var.a();
        }
        gw0Var.a("block_id");
        gw0Var.a("ad_unit_id");
        gw0Var.a("ad_type_format");
        gw0Var.a("product_type");
        gw0Var.a(str);
        gw0Var.a(this.f27192c.a(this.f27191b.a()));
        aVar = this.f27194e;
        if (aVar != null) {
            gw0Var.a(aVar.a());
        }
        return gw0Var.a();
    }

    public final void a(AdResponse adResponse) {
        this.f27193d = adResponse;
    }

    public final void a(fw0.a aVar) {
        this.f27194e = aVar;
    }

    public final void a(fw0.b bVar) {
        this.f27190a.a(new fw0(bVar.a(), a()));
    }

    public final void a(fw0.b bVar, HashMap map) {
        Map<String, Object> mapA = a();
        mapA.putAll(map);
        this.f27190a.a(new fw0(bVar.a(), mapA));
    }

    public final void a(la1 la1Var) {
        Map<String, Object> mapA = a();
        mapA.put("reason", la1Var.e().a());
        String strA = la1Var.a();
        if (!TextUtils.isEmpty(strA)) {
            mapA.put("asset_name", strA);
        }
        this.f27190a.a(new fw0(la1Var.b().a(), mapA));
    }

    public final void b(la1 la1Var) {
        Map<String, Object> mapA = a();
        mapA.put("reason", la1Var.e().a());
        String strA = la1Var.a();
        if (!TextUtils.isEmpty(strA)) {
            mapA.put("asset_name", strA);
        }
        this.f27190a.a(new fw0(la1Var.c().a(), mapA));
    }
}
