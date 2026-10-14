package com.yandex.mobile.ads.rewarded;

import android.content.Context;
import androidx.activity.c;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.impl.gx;
import com.yandex.mobile.ads.impl.hw;
import com.yandex.mobile.ads.impl.ny0;
import com.yandex.mobile.ads.impl.o60;
import com.yandex.mobile.ads.impl.ox;
import com.yandex.mobile.ads.impl.r90;
import com.yandex.mobile.ads.impl.t90;
import com.yandex.mobile.ads.nativeads.v0;

/* JADX INFO: loaded from: classes3.dex */
public final class RewardedAd extends hw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t90 f27997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r90 f27998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final gx<RewardedAdEventListener> f27999c;

    public RewardedAd(Context context) {
        super(context);
        this.f27998b = new r90();
        t90 t90Var = new t90(context);
        this.f27997a = t90Var;
        t90Var.a();
        this.f27999c = new ox(new ny0()).a(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        if (this.f27999c.a()) {
            this.f27999c.b();
        } else {
            o60.a("Failed to show not loaded ad. We recommend checking whether the ad was actually loaded. To do this, call the 'isLoaded()' method.", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AdRequest adRequest) {
        this.f27999c.a(adRequest);
    }

    public void destroy() {
        this.f27997a.a();
        this.f27998b.a();
        this.f27999c.c();
    }

    public boolean isLoaded() {
        this.f27997a.a();
        return this.f27999c.a();
    }

    public void loadAd(AdRequest adRequest) {
        this.f27997a.a();
        this.f27998b.a(new v0(this, adRequest));
    }

    public void setAdUnitId(String str) {
        this.f27997a.a();
        this.f27999c.a(str);
    }

    public void setRewardedAdEventListener(RewardedAdEventListener rewardedAdEventListener) {
        this.f27997a.a();
        this.f27999c.a(rewardedAdEventListener);
    }

    public void setShouldOpenLinksInApp(boolean z10) {
        this.f27997a.a();
        this.f27999c.setShouldOpenLinksInApp(z10);
    }

    public void show() {
        this.f27997a.a();
        this.f27998b.a(new c(this));
    }
}
