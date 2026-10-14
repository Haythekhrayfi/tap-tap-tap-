package com.yandex.mobile.ads.interstitial;

import android.content.Context;
import androidx.activity.c;
import androidx.appcompat.app.s;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.impl.c70;
import com.yandex.mobile.ads.impl.gx;
import com.yandex.mobile.ads.impl.hw;
import com.yandex.mobile.ads.impl.o60;
import com.yandex.mobile.ads.impl.ox;
import com.yandex.mobile.ads.impl.r90;
import com.yandex.mobile.ads.impl.t90;

/* JADX INFO: loaded from: classes3.dex */
public final class InterstitialAd extends hw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t90 f27508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final gx<InterstitialAdEventListener> f27509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r90 f27510c;

    public InterstitialAd(Context context) {
        super(context);
        this.f27510c = new r90();
        t90 t90Var = new t90(context);
        this.f27508a = t90Var;
        t90Var.a();
        this.f27509b = new ox(new c70()).a(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        if (this.f27509b.a()) {
            this.f27509b.b();
        } else {
            o60.a("Failed to show not loaded ad. We recommend checking whether the ad was actually loaded. To do this, call the 'isLoaded()' method.", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AdRequest adRequest) {
        this.f27509b.a(adRequest);
    }

    public void destroy() {
        this.f27508a.a();
        this.f27510c.a();
        this.f27509b.c();
    }

    public boolean isLoaded() {
        this.f27508a.a();
        return this.f27509b.a();
    }

    public void loadAd(AdRequest adRequest) {
        this.f27508a.a();
        this.f27510c.a(new s(this, adRequest));
    }

    public void setAdUnitId(String str) {
        this.f27508a.a();
        this.f27509b.a(str);
    }

    public void setInterstitialAdEventListener(InterstitialAdEventListener interstitialAdEventListener) {
        this.f27508a.a();
        this.f27509b.a(interstitialAdEventListener);
    }

    public void setShouldOpenLinksInApp(boolean z10) {
        this.f27508a.a();
        this.f27509b.setShouldOpenLinksInApp(z10);
    }

    public void show() {
        this.f27508a.a();
        this.f27510c.a(new c(this));
    }
}
