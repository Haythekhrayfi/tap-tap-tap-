package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.impl.lk0;
import com.yandex.mobile.ads.impl.yh;
import com.yandex.mobile.ads.impl.yp;
import com.yandex.mobile.ads.nativeads.template.NativeBannerView;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface u extends NativeAd, OpenLinksInAppProvider, CustomClickable, com.yandex.mobile.ads.nativeads.video.b {
    lk0 a();

    void a(NativeAdViewBinder nativeAdViewBinder, yh yhVar) throws NativeAdException;

    void a(NativeBannerView nativeBannerView) throws NativeAdException;

    List<yp> b();

    void destroy();
}
