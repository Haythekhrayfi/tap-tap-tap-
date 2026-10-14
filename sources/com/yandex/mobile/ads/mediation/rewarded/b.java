package com.yandex.mobile.ads.mediation.rewarded;

import android.content.Context;
import com.yandex.mobile.ads.impl.hd0;
import com.yandex.mobile.ads.impl.jd0;
import com.yandex.mobile.ads.impl.md0;

/* JADX INFO: loaded from: classes3.dex */
final class b implements jd0<MediatedRewardedAdapter> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final md0<MediatedRewardedAdapter> f27636a;

    public b(md0<MediatedRewardedAdapter> md0Var) {
        this.f27636a = md0Var;
    }

    @Override // com.yandex.mobile.ads.impl.jd0
    public final hd0<MediatedRewardedAdapter> a(Context context) {
        return this.f27636a.a(context, MediatedRewardedAdapter.class);
    }
}
