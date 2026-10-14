package com.yandex.mobile.ads.mediation.nativeads;

import android.content.Context;
import com.yandex.mobile.ads.impl.hd0;
import com.yandex.mobile.ads.impl.jd0;
import com.yandex.mobile.ads.impl.md0;

/* JADX INFO: loaded from: classes3.dex */
final class k implements jd0<MediatedNativeAdapter> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final md0<MediatedNativeAdapter> f27598a;

    public k(md0<MediatedNativeAdapter> md0Var) {
        this.f27598a = md0Var;
    }

    @Override // com.yandex.mobile.ads.impl.jd0
    public final hd0<MediatedNativeAdapter> a(Context context) {
        return this.f27598a.a(context, MediatedNativeAdapter.class);
    }
}
