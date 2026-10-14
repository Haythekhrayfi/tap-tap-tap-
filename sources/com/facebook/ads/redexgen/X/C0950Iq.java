package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdListener;
import com.facebook.ads.AdView;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Iq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0950Iq implements AdView.AdViewLoadConfigBuilder, AdView.AdViewLoadConfig {
    public String A00;
    public final C5B A01;

    public C0950Iq(C5B c5b) {
        this.A01 = c5b;
    }

    public final String A00() {
        return this.A00;
    }

    @Override // com.facebook.ads.AdView.AdViewLoadConfigBuilder, com.facebook.ads.Ad.LoadConfigBuilder
    public final AdView.AdViewLoadConfig build() {
        return this;
    }

    @Override // com.facebook.ads.AdView.AdViewLoadConfigBuilder
    public final AdView.AdViewLoadConfigBuilder withAdListener(AdListener adListener) {
        this.A01.A0C(adListener);
        return this;
    }

    @Override // com.facebook.ads.AdView.AdViewLoadConfigBuilder, com.facebook.ads.Ad.LoadConfigBuilder
    public final AdView.AdViewLoadConfigBuilder withBid(String str) {
        this.A00 = str;
        return this;
    }
}
