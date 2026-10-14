package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import com.yandex.mobile.ads.impl.aj0;

/* JADX INFO: loaded from: classes3.dex */
public class NativeAdLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f27666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f27667b;

    public NativeAdLoader(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f27667b = applicationContext;
        this.f27666a = new p(applicationContext);
    }

    public void cancelLoading() {
        this.f27666a.a();
    }

    public void loadAd(NativeAdRequestConfiguration nativeAdRequestConfiguration) {
        this.f27666a.a(nativeAdRequestConfiguration, new aj0(this.f27667b));
    }

    public void setNativeAdLoadListener(NativeAdLoadListener nativeAdLoadListener) {
        this.f27666a.a(nativeAdLoadListener);
    }
}
