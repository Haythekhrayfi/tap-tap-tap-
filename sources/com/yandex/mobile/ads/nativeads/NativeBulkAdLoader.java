package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import com.yandex.mobile.ads.impl.aj0;

/* JADX INFO: loaded from: classes3.dex */
public class NativeBulkAdLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f27696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f27697b;

    public NativeBulkAdLoader(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f27697b = applicationContext;
        this.f27696a = new p(applicationContext);
    }

    public void cancelLoading() {
        this.f27696a.a();
    }

    public void loadAds(NativeAdRequestConfiguration nativeAdRequestConfiguration, int i10) {
        this.f27696a.a(nativeAdRequestConfiguration, new aj0(this.f27697b), i10);
    }

    public void setNativeBulkAdLoadListener(NativeBulkAdLoadListener nativeBulkAdLoadListener) {
        this.f27696a.a(nativeBulkAdLoadListener);
    }
}
