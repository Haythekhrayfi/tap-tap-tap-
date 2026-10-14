package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.impl.hj0;
import com.yandex.mobile.ads.impl.k2;
import com.yandex.mobile.ads.impl.l6;
import com.yandex.mobile.ads.impl.t2;
import com.yandex.mobile.ads.impl.v2;
import com.yandex.mobile.ads.impl.w3;
import com.yandex.mobile.ads.impl.wi0;
import com.yandex.mobile.ads.impl.x4;
import com.yandex.mobile.ads.impl.y3;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wi0 f27824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f27825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final y3 f27826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private NativeAdLoadListener f27827d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private NativeBulkAdLoadListener f27828e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SliderAdLoadListener f27829f;

    public t(Context context, w3 w3Var, wi0 wi0Var) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(w3Var, "adLoadingPhasesManager");
        fd.j0.i(wi0Var, "nativeAdLoadingFinishedListener");
        this.f27824a = wi0Var;
        this.f27825b = new Handler(Looper.getMainLooper());
        this.f27826c = new y3(context, w3Var);
    }

    private final void a(t2 t2Var) {
        this.f27826c.a(t2Var.b());
        this.f27825b.post(new androidx.appcompat.app.s(t2Var, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(t2 t2Var, t tVar) {
        fd.j0.i(t2Var, "$error");
        fd.j0.i(tVar, "this$0");
        AdRequestError adRequestError = new AdRequestError(t2Var.a(), t2Var.b());
        NativeAdLoadListener nativeAdLoadListener = tVar.f27827d;
        if (nativeAdLoadListener != null) {
            nativeAdLoadListener.onAdFailedToLoad(adRequestError);
        }
        NativeBulkAdLoadListener nativeBulkAdLoadListener = tVar.f27828e;
        if (nativeBulkAdLoadListener != null) {
            nativeBulkAdLoadListener.onAdsFailedToLoad(adRequestError);
        }
        SliderAdLoadListener sliderAdLoadListener = tVar.f27829f;
        if (sliderAdLoadListener != null) {
            sliderAdLoadListener.onSliderAdFailedToLoad(adRequestError);
        }
        ((q) tVar.f27824a).b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(t tVar, NativeAd nativeAd) {
        fd.j0.i(tVar, "this$0");
        fd.j0.i(nativeAd, "$nativeAd");
        NativeAdLoadListener nativeAdLoadListener = tVar.f27827d;
        if (nativeAdLoadListener != null) {
            nativeAdLoadListener.onAdLoaded(nativeAd);
        }
        ((q) tVar.f27824a).b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(t tVar, SliderAd sliderAd) {
        fd.j0.i(tVar, "this$0");
        fd.j0.i(sliderAd, "$sliderAd");
        SliderAdLoadListener sliderAdLoadListener = tVar.f27829f;
        if (sliderAdLoadListener != null) {
            sliderAdLoadListener.onSliderAdLoaded(sliderAd);
        }
        ((q) tVar.f27824a).b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(t tVar, List list) {
        fd.j0.i(tVar, "this$0");
        fd.j0.i(list, "$nativeGenericAds");
        NativeBulkAdLoadListener nativeBulkAdLoadListener = tVar.f27828e;
        if (nativeBulkAdLoadListener != null) {
            nativeBulkAdLoadListener.onAdsLoaded(list);
        }
        ((q) tVar.f27824a).b();
    }

    public final void a() {
        this.f27825b.removeCallbacksAndMessages(null);
    }

    public final void a(hj0 hj0Var) {
        fd.j0.i(hj0Var, "reportParameterManager");
        this.f27826c.a(hj0Var);
    }

    public final void a(k2 k2Var) {
        fd.j0.i(k2Var, "adConfiguration");
        this.f27826c.b(new x4(k2Var));
    }

    public final void a(NativeAd nativeAd) {
        fd.j0.i(nativeAd, "nativeAd");
        String strA = l6.f22630e.a();
        fd.j0.h(strA, "NATIVE.typeName");
        v2.a(strA);
        this.f27826c.a();
        this.f27825b.post(new v0(this, nativeAd));
    }

    public final void a(NativeAdLoadListener nativeAdLoadListener) {
        this.f27827d = nativeAdLoadListener;
    }

    public final void a(NativeBulkAdLoadListener nativeBulkAdLoadListener) {
        this.f27828e = nativeBulkAdLoadListener;
    }

    public final void a(SliderAd sliderAd) {
        fd.j0.i(sliderAd, "sliderAd");
        String strA = l6.f22630e.a();
        fd.j0.h(strA, "NATIVE.typeName");
        v2.a(strA);
        this.f27826c.a();
        this.f27825b.post(new androidx.appcompat.app.s(this, sliderAd));
    }

    public final void a(SliderAdLoadListener sliderAdLoadListener) {
        this.f27829f = sliderAdLoadListener;
    }

    public final void a(ArrayList arrayList) {
        fd.j0.i(arrayList, "nativeGenericAds");
        String strA = l6.f22630e.a();
        fd.j0.h(strA, "NATIVE.typeName");
        v2.a(strA);
        this.f27826c.a();
        this.f27825b.post(new androidx.appcompat.app.s(this, arrayList));
    }

    public final void b(t2 t2Var) {
        fd.j0.i(t2Var, "error");
        a(t2Var);
    }
}
