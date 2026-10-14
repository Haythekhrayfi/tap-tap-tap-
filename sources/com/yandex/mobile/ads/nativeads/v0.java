package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.rewarded.RewardedAd;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v0 implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f27976c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f27977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f27978e;

    public /* synthetic */ v0(t tVar, NativeAd nativeAd) {
        this.f27977d = tVar;
        this.f27978e = nativeAd;
    }

    public /* synthetic */ v0(RewardedAd rewardedAd, AdRequest adRequest) {
        this.f27977d = rewardedAd;
        this.f27978e = adRequest;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27976c) {
            case 0:
                t.a((t) this.f27977d, (NativeAd) this.f27978e);
                break;
            default:
                ((RewardedAd) this.f27977d).a((AdRequest) this.f27978e);
                break;
        }
    }
}
