package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class v50 implements InstreamAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<w50> f25843a;

    public v50(ArrayList arrayList) {
        this.f25843a = arrayList;
    }

    public final void a() {
        Iterator<w50> it = this.f25843a.iterator();
        while (it.hasNext()) {
            it.next().a(null);
        }
    }

    @Override // com.yandex.mobile.ads.instream.InstreamAd
    public final List<w50> getAdBreaks() {
        return this.f25843a;
    }
}
