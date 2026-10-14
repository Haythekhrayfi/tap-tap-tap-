package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class bj0 extends ce<cj0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final fj0 f19274c = new fj0();

    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.mobile.ads.impl.ce
    public final HashMap a(int i10, k2 k2Var, gx0 gx0Var) {
        fw0.c cVar;
        T t10;
        T t11;
        HashMap mapA = super.a(i10, k2Var, gx0Var);
        if (204 == i10) {
            cVar = fw0.c.f20903d;
        } else if (gx0Var == null || (t10 = gx0Var.f21226a) == 0 || i10 != 200) {
            cVar = fw0.c.f20902c;
        } else {
            AdResponse adResponse = (AdResponse) t10;
            Objects.requireNonNull(this.f19274c);
            cVar = null;
            cj0 cj0Var = (cj0) adResponse.C();
            if (cj0Var != null) {
                cVar = (fw0.c) cj0Var.e().get("status");
            } else if (adResponse.A() == null) {
                cVar = fw0.c.f20902c;
            }
        }
        if (cVar != null) {
            mapA.put("status", cVar.a());
        }
        if (gx0Var != null && (t11 = gx0Var.f21226a) != 0) {
            ArrayList arrayListA = this.f19274c.a((AdResponse) t11);
            if (!arrayListA.isEmpty()) {
                mapA.put("image_sizes", arrayListA.toArray(new String[arrayListA.size()]));
            }
            AdResponse adResponse2 = (AdResponse) gx0Var.f21226a;
            Objects.requireNonNull(this.f19274c);
            ArrayList arrayListC = fj0.c(adResponse2);
            if (!arrayListC.isEmpty()) {
                mapA.put("native_ad_types", arrayListC.toArray(new String[arrayListC.size()]));
            }
        }
        return mapA;
    }

    @Override // com.yandex.mobile.ads.impl.ce
    public final HashMap a(k2 k2Var) {
        HashMap mapA = super.a(k2Var);
        mapA.put("image_loading_automatically", Boolean.valueOf(k2Var.q()));
        String[] strArrK = k2Var.k();
        if (strArrK != null && strArrK.length > 0) {
            mapA.put("image_sizes", k2Var.k());
        }
        return mapA;
    }
}
