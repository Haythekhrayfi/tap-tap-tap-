package com.yandex.mobile.ads.nativeads;

import com.applovin.impl.adview.activity.FullscreenAdService;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.SizeInfo;
import com.yandex.mobile.ads.impl.a21;
import com.yandex.mobile.ads.impl.b5;
import com.yandex.mobile.ads.impl.fk0;
import com.yandex.mobile.ads.impl.fw0;
import com.yandex.mobile.ads.impl.gw0;
import com.yandex.mobile.ads.impl.ji0;
import com.yandex.mobile.ads.impl.k2;
import com.yandex.mobile.ads.impl.qh0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class f0 implements fw0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k2 f27737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<qh0> f27738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ji0 f27739c = new ji0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b5 f27740d = new b5();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f27741e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f27742f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private AdResponse f27743g;

    public f0(List<qh0> list, k2 k2Var) {
        this.f27738b = list;
        this.f27737a = k2Var;
    }

    @Override // com.yandex.mobile.ads.impl.fw0.a
    public final Map<String, Object> a() {
        gw0 gw0Var = new gw0(new HashMap());
        int i10 = this.f27742f;
        if (i10 != 0) {
            gw0Var.b(fk0.a(i10), "bind_type");
        }
        gw0Var.a(this.f27741e, "native_ad_type");
        AdResponse adResponse = this.f27743g;
        if (adResponse != null) {
            gw0Var.a(adResponse.c());
            Map<String, Object> mapS = this.f27743g.s();
            if (mapS != null) {
                gw0Var.a(mapS);
            }
            gw0Var.a(this.f27743g.w(), "design");
            gw0Var.b(this.f27743g.m(), FullscreenAdService.DATA_KEY_AD_SOURCE);
        }
        SizeInfo sizeInfoN = this.f27737a.n();
        if (sizeInfoN != null) {
            gw0Var.b(a21.b(sizeInfoN.d()), "size_type");
            gw0Var.b(Integer.valueOf(sizeInfoN.e()), "width");
            gw0Var.b(Integer.valueOf(sizeInfoN.c()), "height");
        }
        gw0Var.a(this.f27740d.a(this.f27737a.a()));
        ji0 ji0Var = this.f27739c;
        List<qh0> list = this.f27738b;
        Objects.requireNonNull(ji0Var);
        HashSet hashSet = new HashSet();
        Iterator<qh0> it = list.iterator();
        while (it.hasNext()) {
            hashSet.addAll(ji0Var.a(it.next()));
        }
        ArrayList arrayList = new ArrayList(hashSet);
        if (arrayList.size() > 0) {
            gw0Var.b(arrayList.toArray(new String[arrayList.size()]), "image_sizes");
        }
        return gw0Var.a();
    }

    public final void a(int i10) {
        this.f27742f = i10;
    }

    public final void a(AdResponse adResponse) {
        this.f27743g = adResponse;
    }

    public final void a(String str) {
        this.f27741e = str;
    }
}
