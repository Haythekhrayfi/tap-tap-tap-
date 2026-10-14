package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.NativeAdRequestConfiguration;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class si0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f25117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final su0 f25118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ke.a<AdResponse<cj0>> f25119c;

    public si0(Context context, ke.a<AdResponse<cj0>> aVar) {
        this.f25117a = context;
        this.f25119c = aVar;
        tu0.a();
        this.f25118b = new su0();
    }

    public final ri0 a(ww0<cj0> ww0Var, k2 k2Var, NativeAdRequestConfiguration nativeAdRequestConfiguration, String str, String str2) {
        Objects.requireNonNull(this.f25118b);
        Objects.requireNonNull(nativeAdRequestConfiguration);
        return new ri0(this.f25117a, ww0Var, k2Var, str, str2, this.f25119c);
    }
}
