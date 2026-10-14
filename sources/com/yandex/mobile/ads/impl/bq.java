package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class bq implements zo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdResponse<?> f19308a;

    public bq(AdResponse<?> adResponse) {
        this.f19308a = adResponse;
    }

    @Override // com.yandex.mobile.ads.impl.zo
    public final boolean a(Context context) {
        return "divkit".equals(this.f19308a.w());
    }
}
