package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.appopenad.AppOpenAdEventListener;
import com.yandex.mobile.ads.common.AdError;
import com.yandex.mobile.ads.common.ImpressionData;

/* JADX INFO: loaded from: classes3.dex */
public final class qt0 implements yw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f24566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AppOpenAdEventListener f24567b;

    public /* synthetic */ qt0() {
        this(new Handler(Looper.getMainLooper()));
    }

    public qt0(Handler handler) {
        fd.j0.i(handler, "handler");
        this.f24566a = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(qt0 qt0Var) {
        fd.j0.i(qt0Var, "this$0");
        AppOpenAdEventListener appOpenAdEventListener = qt0Var.f24567b;
        if (appOpenAdEventListener != null) {
            appOpenAdEventListener.onAdClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(qt0 qt0Var, AdError adError) {
        fd.j0.i(qt0Var, "this$0");
        fd.j0.i(adError, "$adError");
        AppOpenAdEventListener appOpenAdEventListener = qt0Var.f24567b;
        if (appOpenAdEventListener != null) {
            appOpenAdEventListener.onAdFailedToPresent(adError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(qt0 qt0Var, ImpressionData impressionData) {
        fd.j0.i(qt0Var, "this$0");
        AppOpenAdEventListener appOpenAdEventListener = qt0Var.f24567b;
        if (appOpenAdEventListener != null) {
            appOpenAdEventListener.onImpression(impressionData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(qt0 qt0Var) {
        fd.j0.i(qt0Var, "this$0");
        AppOpenAdEventListener appOpenAdEventListener = qt0Var.f24567b;
        if (appOpenAdEventListener != null) {
            appOpenAdEventListener.onAdDismissed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(qt0 qt0Var) {
        fd.j0.i(qt0Var, "this$0");
        AppOpenAdEventListener appOpenAdEventListener = qt0Var.f24567b;
        if (appOpenAdEventListener != null) {
            appOpenAdEventListener.onAdShown();
        }
    }

    @Override // com.yandex.mobile.ads.impl.yw
    public final void a() {
    }

    public final void a(AppOpenAdEventListener appOpenAdEventListener) {
        this.f24567b = appOpenAdEventListener;
    }

    public final void a(k11 k11Var) {
        fd.j0.i(k11Var, "adError");
        this.f24566a.post(new do1(this, k11Var));
    }

    @Override // com.yandex.mobile.ads.impl.yw
    public final void onAdClicked() {
        this.f24566a.post(new rp1(this, 1));
    }

    @Override // com.yandex.mobile.ads.impl.yw
    public final void onAdDismissed() {
        this.f24566a.post(new rp1(this, 2));
    }

    @Override // com.yandex.mobile.ads.impl.yw
    public final void onAdShown() {
        this.f24566a.post(new rp1(this, 0));
    }

    @Override // com.yandex.mobile.ads.impl.yw
    public final void onImpression(ImpressionData impressionData) {
        this.f24566a.post(new do1(this, impressionData));
    }
}
