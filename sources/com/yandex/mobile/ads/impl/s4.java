package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.SizeInfo;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdResponse f24950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b5 f24951b = new b5();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final iw0 f24952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k2 f24953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final x3 f24954e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private fw0.a f24955f;

    public s4(Context context, AdResponse adResponse, k2 k2Var, w3 w3Var, pz pzVar) {
        this.f24950a = adResponse;
        this.f24953d = k2Var;
        this.f24955f = pzVar;
        this.f24954e = new x3(w3Var);
        this.f24952c = z8.a(context);
    }

    public final void a() {
        gw0 gw0Var = new gw0(new HashMap());
        gw0Var.b(this.f24950a.p(), "block_id");
        gw0Var.b(this.f24950a.p(), "ad_unit_id");
        gw0Var.b("Yandex", "adapter");
        gw0Var.b(this.f24950a.B(), "product_type");
        gw0Var.b(this.f24950a.o(), "ad_type_format");
        gw0Var.b(this.f24950a.m(), FullscreenAdService.DATA_KEY_AD_SOURCE);
        gw0Var.a(this.f24950a.c());
        gw0Var.a(this.f24955f.a());
        gw0Var.a(this.f24954e.b());
        Map<String, Object> mapS = this.f24950a.s();
        if (mapS != null) {
            gw0Var.a(mapS);
        }
        SizeInfo sizeInfoN = this.f24953d.n();
        if (sizeInfoN != null) {
            gw0Var.b(a21.b(sizeInfoN.d()), "size_type");
            gw0Var.b(Integer.valueOf(sizeInfoN.e()), "width");
            gw0Var.b(Integer.valueOf(sizeInfoN.c()), "height");
        }
        l6 l6VarN = this.f24950a.n();
        gw0Var.b(l6VarN != null ? l6VarN.a() : null, "ad_type");
        gw0Var.a(this.f24951b.a(this.f24953d.a()));
        this.f24952c.a(new fw0(fw0.b.f20876c.a(), gw0Var.a()));
    }
}
