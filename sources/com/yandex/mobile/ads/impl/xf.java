package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class xf {
    private xf() {
    }

    public static com.yandex.mobile.ads.embedded.guava.collect.p a(wf.a aVar, ArrayList arrayList) {
        int i10 = com.yandex.mobile.ads.embedded.guava.collect.p.f18374c;
        com.yandex.mobile.ads.embedded.guava.collect.p.a aVar2 = new com.yandex.mobile.ads.embedded.guava.collect.p.a();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            Bundle bundle = (Bundle) arrayList.get(i11);
            Objects.requireNonNull(bundle);
            aVar2.b(aVar.fromBundle(bundle));
        }
        return aVar2.a();
    }
}
