package com.yandex.mobile.ads.mediation.nativeads;

import com.yandex.mobile.ads.common.AdImpressionData;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakHashMap<com.yandex.mobile.ads.nativeads.k, Object> f27587a = new WeakHashMap<>();

    public final void a() {
        Iterator<com.yandex.mobile.ads.nativeads.k> it = this.f27587a.keySet().iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public final void a(AdImpressionData adImpressionData) {
        Iterator<com.yandex.mobile.ads.nativeads.k> it = this.f27587a.keySet().iterator();
        while (it.hasNext()) {
            it.next().a(adImpressionData);
        }
    }

    public final void a(com.yandex.mobile.ads.nativeads.k kVar) {
        this.f27587a.put(kVar, null);
    }

    public final void b() {
        Iterator<com.yandex.mobile.ads.nativeads.k> it = this.f27587a.keySet().iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    public final void c() {
        Iterator<com.yandex.mobile.ads.nativeads.k> it = this.f27587a.keySet().iterator();
        while (it.hasNext()) {
            it.next().d();
        }
    }

    public final void d() {
        Iterator<com.yandex.mobile.ads.nativeads.k> it = this.f27587a.keySet().iterator();
        while (it.hasNext()) {
            it.next().e();
        }
    }
}
