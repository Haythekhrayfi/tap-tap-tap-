package com.yandex.mobile.ads.banner;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.s;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.impl.k2;
import com.yandex.mobile.ads.impl.pz;
import com.yandex.mobile.ads.impl.r2;
import com.yandex.mobile.ads.impl.t2;
import com.yandex.mobile.ads.impl.w3;
import com.yandex.mobile.ads.impl.x4;
import com.yandex.mobile.ads.impl.y3;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f18137a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y3 f18138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BannerAdEventListener f18139c;

    public d(Context context, w3 w3Var) {
        this.f18138b = new y3(context, w3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        BannerAdEventListener bannerAdEventListener = this.f18139c;
        if (bannerAdEventListener != null) {
            bannerAdEventListener.onAdLoaded();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AdRequestError adRequestError) {
        BannerAdEventListener bannerAdEventListener = this.f18139c;
        if (bannerAdEventListener != null) {
            bannerAdEventListener.onAdFailedToLoad(adRequestError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ImpressionData impressionData) {
        BannerAdEventListener bannerAdEventListener = this.f18139c;
        if (bannerAdEventListener != null) {
            bannerAdEventListener.onImpression(impressionData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        BannerAdEventListener bannerAdEventListener = this.f18139c;
        if (bannerAdEventListener != null) {
            bannerAdEventListener.onAdClicked();
            bannerAdEventListener.onLeftApplication();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        BannerAdEventListener bannerAdEventListener = this.f18139c;
        if (bannerAdEventListener != null) {
            bannerAdEventListener.onReturnedToApplication();
        }
    }

    public final void a(BannerAdEventListener bannerAdEventListener) {
        this.f18139c = bannerAdEventListener;
    }

    public final void a(k2 k2Var) {
        this.f18138b.b(new x4(k2Var));
    }

    public final void a(pz pzVar) {
        this.f18138b.a(pzVar);
    }

    public final void a(t2 t2Var) {
        this.f18138b.a(t2Var.b());
        this.f18137a.post(new s(this, new AdRequestError(t2Var.a(), t2Var.b())));
    }

    public final void b(ImpressionData impressionData) {
        this.f18137a.post(new s(this, impressionData));
    }

    public final void d() {
        this.f18138b.a();
        this.f18137a.post(new l(this, 0));
    }

    public final void e() {
        this.f18137a.post(new l(this, 2));
    }

    public final void f() {
        this.f18137a.post(new l(this, 1));
    }
}
