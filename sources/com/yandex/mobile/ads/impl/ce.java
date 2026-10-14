package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.SizeInfo;
import com.yandex.mobile.ads.common.AdRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ce<T> implements zw0<k2, AdResponse<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b5 f19460a = new b5();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p5 f19461b = new p5();

    @Override // com.yandex.mobile.ads.impl.zw0
    public final fw0 a(gx0 gx0Var, int i10, k2 k2Var) {
        return new fw0(fw0.b.f20884k.a(), a(i10, k2Var, gx0Var));
    }

    @Override // com.yandex.mobile.ads.impl.zw0
    public final fw0 a(k2 k2Var) {
        return new fw0(fw0.b.f20883j.a(), a(k2Var));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00da  */
    public HashMap a(int i10, k2 k2Var, gx0 gx0Var) {
        String str;
        T t10;
        T t11;
        HashMap map = new HashMap();
        Objects.requireNonNull(this.f19461b);
        gw0 gw0Var = new gw0(new HashMap());
        gw0Var.b(k2Var.c(), "block_id");
        gw0Var.b(k2Var.c(), "ad_unit_id");
        gw0Var.b(k2Var.b().a(), "ad_type");
        if (gx0Var != null && (t11 = gx0Var.f21226a) != null && ((AdResponse) t11).A() == null) {
            gw0Var.b(((AdResponse) gx0Var.f21226a).o(), "ad_type_format");
            gw0Var.b(((AdResponse) gx0Var.f21226a).B(), "product_type");
            gw0Var.a(((AdResponse) gx0Var.f21226a).w(), "design");
            gw0Var.a(((AdResponse) gx0Var.f21226a).c());
            Map<String, Object> mapS = ((AdResponse) gx0Var.f21226a).s();
            if (mapS != null) {
                gw0Var.a(mapS);
            }
        }
        SizeInfo sizeInfoN = k2Var.n();
        if (sizeInfoN != null) {
            gw0Var.b(a21.b(sizeInfoN.d()), "size_type");
            gw0Var.b(Integer.valueOf(sizeInfoN.e()), "width");
            gw0Var.b(Integer.valueOf(sizeInfoN.c()), "height");
        }
        gw0Var.b(Integer.valueOf(i10), i10 == -1 ? "error_code" : "code");
        if (gx0Var == null || (t10 = gx0Var.f21226a) == null) {
            str = "empty";
        } else if (((AdResponse) t10).A() != null) {
            str = "mediation";
        } else if (((AdResponse) gx0Var.f21226a).C() != null) {
            str = "ad";
        } else {
            str = "empty";
        }
        gw0Var.b(str, "response_type");
        map.putAll(gw0Var.a());
        AdRequest adRequestA = k2Var.a();
        if (adRequestA != null) {
            map.putAll(this.f19460a.a(adRequestA));
        }
        return map;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    public HashMap a(k2 k2Var) {
        HashMap map = new HashMap();
        AdRequest adRequestA = k2Var.a();
        if (adRequestA != null) {
            map.putAll(this.f19460a.a(adRequestA));
        }
        map.put("block_id", k2Var.c());
        map.put("ad_unit_id", k2Var.c());
        map.put("ad_type", k2Var.b().a());
        if (k2Var.n() != null) {
            map.put("size_type", a21.b(k2Var.n().d()));
        }
        map.put("is_passback", Boolean.valueOf(k2Var.p() == 2));
        return map;
    }
}
