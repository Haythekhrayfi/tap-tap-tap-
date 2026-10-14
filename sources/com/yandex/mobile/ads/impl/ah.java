package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.fullscreen.template.view.CallToActionView;
import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.NativeAdType;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class ah<V extends ViewGroup> implements yo<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NativeAd f18934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final uh0 f18935b = new uh0();

    public ah(NativeAd nativeAd) {
        this.f18934a = nativeAd;
    }

    @Override // com.yandex.mobile.ads.impl.yo
    public final void a(V v10) {
        Objects.requireNonNull(this.f18935b);
        TextView textView = (TextView) v10.findViewById(R.id.call_to_action);
        NativeAdType adType = this.f18934a.getAdType();
        if (!(textView instanceof CallToActionView) || adType == NativeAdType.APP_INSTALL) {
            return;
        }
        ((CallToActionView) textView).a();
    }

    @Override // com.yandex.mobile.ads.impl.yo
    public final void c() {
    }
}
