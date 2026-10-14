package com.yandex.mobile.ads.banner;

import com.yandex.mobile.ads.impl.eh1;
import com.yandex.mobile.ads.impl.y6;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements y6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference<g> f18132a;

    public b(g gVar) {
        this.f18132a = new WeakReference<>(gVar);
    }

    @Override // com.yandex.mobile.ads.impl.y6
    public final boolean a() {
        g gVar = this.f18132a.get();
        return gVar != null && eh1.b(gVar) >= 1;
    }

    @Override // com.yandex.mobile.ads.impl.y6
    public final boolean b() {
        g gVar = this.f18132a.get();
        return (gVar == null || eh1.d(gVar)) ? false : true;
    }
}
