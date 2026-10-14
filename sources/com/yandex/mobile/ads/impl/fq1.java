package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.BidderTokenLoadListener;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fq1 implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f20796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BidderTokenLoadListener f20797d;

    public /* synthetic */ fq1(BidderTokenLoadListener bidderTokenLoadListener, int i10) {
        this.f20796c = i10;
        this.f20797d = bidderTokenLoadListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20796c) {
            case 0:
                this.f20797d.onBidderTokenFailedToLoad("Cannot load bidder token. Token generation failed");
                break;
            default:
                this.f20797d.onBidderTokenFailedToLoad("Cannot load bidder token. SDK initialization failed.");
                break;
        }
    }
}
