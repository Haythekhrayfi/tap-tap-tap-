package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;

/* JADX INFO: loaded from: classes3.dex */
public final class st0 implements qx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f25184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y3 f25185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterstitialAdEventListener f25186c;

    public /* synthetic */ st0(Context context, w3 w3Var) {
        this(context, w3Var, new Handler(Looper.getMainLooper()), new y3(context, w3Var));
    }

    public st0(Context context, w3 w3Var, Handler handler, y3 y3Var) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(w3Var, "adLoadingPhasesManager");
        fd.j0.i(handler, "handler");
        fd.j0.i(y3Var, "adLoadingResultReporter");
        this.f25184a = handler;
        this.f25185b = y3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(st0 st0Var) {
        fd.j0.i(st0Var, "this$0");
        InterstitialAdEventListener interstitialAdEventListener = st0Var.f25186c;
        if (interstitialAdEventListener != null) {
            interstitialAdEventListener.onAdLoaded();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(st0 st0Var, AdRequestError adRequestError) {
        fd.j0.i(st0Var, "this$0");
        fd.j0.i(adRequestError, "$error");
        InterstitialAdEventListener interstitialAdEventListener = st0Var.f25186c;
        if (interstitialAdEventListener != null) {
            interstitialAdEventListener.onAdFailedToLoad(adRequestError);
        }
    }

    public final void a(fw0.a aVar) {
        fd.j0.i(aVar, "reportParameterManager");
        this.f25185b.a(aVar);
    }

    public final void a(k2 k2Var) {
        fd.j0.i(k2Var, "adConfiguration");
        this.f25185b.b(new x4(k2Var));
    }

    public final void a(InterstitialAdEventListener interstitialAdEventListener) {
        this.f25186c = interstitialAdEventListener;
    }

    public final void onAdFailedToLoad(AdRequestError adRequestError) {
        fd.j0.i(adRequestError, "error");
        String description = adRequestError.getDescription();
        fd.j0.h(description, "error.description");
        this.f25185b.a(description);
        this.f25184a.post(new do1(this, adRequestError));
    }

    @Override // com.yandex.mobile.ads.impl.qx
    public final void onAdLoaded() {
        this.f25185b.a();
        this.f25184a.post(new pp1(this));
    }
}
