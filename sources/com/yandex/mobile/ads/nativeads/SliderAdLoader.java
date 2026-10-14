package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import com.yandex.mobile.ads.impl.aj0;

/* JADX INFO: loaded from: classes3.dex */
public class SliderAdLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f27698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f27699b;

    public SliderAdLoader(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f27699b = applicationContext;
        this.f27698a = new p(applicationContext);
    }

    public void cancelLoading() {
        this.f27698a.a();
    }

    public void loadSlider(NativeAdRequestConfiguration nativeAdRequestConfiguration) {
        this.f27698a.b(nativeAdRequestConfiguration, new aj0(this.f27699b));
    }

    public void setSliderAdLoadListener(SliderAdLoadListener sliderAdLoadListener) {
        this.f27698a.a(sliderAdLoadListener);
    }
}
