package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.rewarded.Reward;
import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;

/* JADX INFO: loaded from: classes3.dex */
public final class vt0 implements yw, ky0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f26083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RewardedAdEventListener f26084b;

    public /* synthetic */ vt0() {
        this(new Handler(Looper.getMainLooper()));
    }

    public vt0(Handler handler) {
        fd.j0.i(handler, "handler");
        this.f26083a = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(vt0 vt0Var) {
        fd.j0.i(vt0Var, "this$0");
        RewardedAdEventListener rewardedAdEventListener = vt0Var.f26084b;
        if (rewardedAdEventListener != null) {
            rewardedAdEventListener.onAdClicked();
        }
        RewardedAdEventListener rewardedAdEventListener2 = vt0Var.f26084b;
        if (rewardedAdEventListener2 != null) {
            rewardedAdEventListener2.onLeftApplication();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(vt0 vt0Var, ImpressionData impressionData) {
        fd.j0.i(vt0Var, "this$0");
        RewardedAdEventListener rewardedAdEventListener = vt0Var.f26084b;
        if (rewardedAdEventListener != null) {
            rewardedAdEventListener.onImpression(impressionData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(vt0 vt0Var, Reward reward) {
        fd.j0.i(vt0Var, "this$0");
        fd.j0.i(reward, "$reward");
        RewardedAdEventListener rewardedAdEventListener = vt0Var.f26084b;
        if (rewardedAdEventListener != null) {
            rewardedAdEventListener.onRewarded(reward);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(vt0 vt0Var) {
        fd.j0.i(vt0Var, "this$0");
        RewardedAdEventListener rewardedAdEventListener = vt0Var.f26084b;
        if (rewardedAdEventListener != null) {
            rewardedAdEventListener.onAdDismissed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(vt0 vt0Var) {
        fd.j0.i(vt0Var, "this$0");
        RewardedAdEventListener rewardedAdEventListener = vt0Var.f26084b;
        if (rewardedAdEventListener != null) {
            rewardedAdEventListener.onReturnedToApplication();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(vt0 vt0Var) {
        fd.j0.i(vt0Var, "this$0");
        RewardedAdEventListener rewardedAdEventListener = vt0Var.f26084b;
        if (rewardedAdEventListener != null) {
            rewardedAdEventListener.onAdShown();
        }
    }

    @Override // com.yandex.mobile.ads.impl.yw
    public final void a() {
        this.f26083a.post(new gq1(this, 0));
    }

    @Override // com.yandex.mobile.ads.impl.ky0
    public final void a(wl1 wl1Var) {
        fd.j0.i(wl1Var, "reward");
        this.f26083a.post(new do1(this, wl1Var));
    }

    public final void a(RewardedAdEventListener rewardedAdEventListener) {
        this.f26084b = rewardedAdEventListener;
    }

    @Override // com.yandex.mobile.ads.impl.yw
    public final void onAdClicked() {
        this.f26083a.post(new gq1(this, 3));
    }

    @Override // com.yandex.mobile.ads.impl.yw
    public final void onAdDismissed() {
        this.f26083a.post(new gq1(this, 1));
    }

    @Override // com.yandex.mobile.ads.impl.yw
    public final void onAdShown() {
        this.f26083a.post(new gq1(this, 2));
    }

    @Override // com.yandex.mobile.ads.impl.yw
    public final void onImpression(ImpressionData impressionData) {
        this.f26083a.post(new do1(this, impressionData));
    }
}
