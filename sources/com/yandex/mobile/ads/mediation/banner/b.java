package com.yandex.mobile.ads.mediation.banner;

import android.content.Context;
import com.yandex.mobile.ads.impl.hd0;
import com.yandex.mobile.ads.impl.jd0;
import com.yandex.mobile.ads.impl.md0;

/* JADX INFO: loaded from: classes3.dex */
final class b implements jd0<MediatedBannerAdapter> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final md0<MediatedBannerAdapter> f27517a;

    public b(md0<MediatedBannerAdapter> md0Var) {
        this.f27517a = md0Var;
    }

    @Override // com.yandex.mobile.ads.impl.jd0
    public final hd0<MediatedBannerAdapter> a(Context context) {
        return this.f27517a.a(context, MediatedBannerAdapter.class);
    }
}
