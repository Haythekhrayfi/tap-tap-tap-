package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;

/* JADX INFO: loaded from: classes3.dex */
public final class ut0 implements qx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f25738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y3 f25739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RewardedAdEventListener f25740c;

    public /* synthetic */ ut0(Context context, w3 w3Var) {
        this(context, w3Var, new Handler(Looper.getMainLooper()), new y3(context, w3Var));
    }

    public ut0(Context context, w3 w3Var, Handler handler, y3 y3Var) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(w3Var, "adLoadingPhasesManager");
        fd.j0.i(handler, "handler");
        fd.j0.i(y3Var, "adLoadingResultReporter");
        this.f25738a = handler;
        this.f25739b = y3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ut0 ut0Var) {
        fd.j0.i(ut0Var, "this$0");
        RewardedAdEventListener rewardedAdEventListener = ut0Var.f25740c;
        if (rewardedAdEventListener != null) {
            rewardedAdEventListener.onAdLoaded();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ut0 ut0Var, AdRequestError adRequestError) {
        fd.j0.i(ut0Var, "this$0");
        fd.j0.i(adRequestError, "$error");
        RewardedAdEventListener rewardedAdEventListener = ut0Var.f25740c;
        if (rewardedAdEventListener != null) {
            rewardedAdEventListener.onAdFailedToLoad(adRequestError);
        }
    }

    public final void a(fw0.a aVar) {
        fd.j0.i(aVar, "reportParameterManager");
        this.f25739b.a(aVar);
    }

    public final void a(k2 k2Var) {
        fd.j0.i(k2Var, "adConfiguration");
        this.f25739b.b(new x4(k2Var));
    }

    public final void a(RewardedAdEventListener rewardedAdEventListener) {
        this.f25740c = rewardedAdEventListener;
    }

    public final void onAdFailedToLoad(AdRequestError adRequestError) {
        fd.j0.i(adRequestError, "error");
        String description = adRequestError.getDescription();
        fd.j0.h(description, "error.description");
        this.f25739b.a(description);
        this.f25738a.post(new do1(this, adRequestError));
    }

    @Override // com.yandex.mobile.ads.impl.qx
    public final void onAdLoaded() {
        this.f25739b.a();
        this.f25738a.post(new pp1(this));
    }
}
