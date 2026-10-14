package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;

/* JADX INFO: loaded from: classes3.dex */
public final class tt0 implements yw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f25495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterstitialAdEventListener f25496b;

    public /* synthetic */ tt0() {
        this(new Handler(Looper.getMainLooper()));
    }

    public tt0(Handler handler) {
        fd.j0.i(handler, "handler");
        this.f25495a = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(tt0 tt0Var) {
        fd.j0.i(tt0Var, "this$0");
        InterstitialAdEventListener interstitialAdEventListener = tt0Var.f25496b;
        if (interstitialAdEventListener != null) {
            interstitialAdEventListener.onAdClicked();
        }
        InterstitialAdEventListener interstitialAdEventListener2 = tt0Var.f25496b;
        if (interstitialAdEventListener2 != null) {
            interstitialAdEventListener2.onLeftApplication();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(tt0 tt0Var, ImpressionData impressionData) {
        fd.j0.i(tt0Var, "this$0");
        InterstitialAdEventListener interstitialAdEventListener = tt0Var.f25496b;
        if (interstitialAdEventListener != null) {
            interstitialAdEventListener.onImpression(impressionData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(tt0 tt0Var) {
        fd.j0.i(tt0Var, "this$0");
        InterstitialAdEventListener interstitialAdEventListener = tt0Var.f25496b;
        if (interstitialAdEventListener != null) {
            interstitialAdEventListener.onAdDismissed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(tt0 tt0Var) {
        fd.j0.i(tt0Var, "this$0");
        InterstitialAdEventListener interstitialAdEventListener = tt0Var.f25496b;
        if (interstitialAdEventListener != null) {
            interstitialAdEventListener.onReturnedToApplication();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(tt0 tt0Var) {
        fd.j0.i(tt0Var, "this$0");
        InterstitialAdEventListener interstitialAdEventListener = tt0Var.f25496b;
        if (interstitialAdEventListener != null) {
            interstitialAdEventListener.onAdShown();
        }
    }

    @Override // com.yandex.mobile.ads.impl.yw
    public final void a() {
        this.f25495a.post(new eq1(this, 0));
    }

    public final void a(InterstitialAdEventListener interstitialAdEventListener) {
        this.f25496b = interstitialAdEventListener;
    }

    @Override // com.yandex.mobile.ads.impl.yw
    public final void onAdClicked() {
        this.f25495a.post(new eq1(this, 3));
    }

    @Override // com.yandex.mobile.ads.impl.yw
    public final void onAdDismissed() {
        this.f25495a.post(new eq1(this, 2));
    }

    @Override // com.yandex.mobile.ads.impl.yw
    public final void onAdShown() {
        this.f25495a.post(new eq1(this, 1));
    }

    @Override // com.yandex.mobile.ads.impl.yw
    public final void onImpression(ImpressionData impressionData) {
        this.f25495a.post(new do1(this, impressionData));
    }
}
