package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.dynamicloading.DynamicLoader;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1323Xi extends K4 {
    public final /* synthetic */ C1336Xv A00;

    public C1323Xi(C1336Xv c1336Xv) {
        this.A00 = c1336Xv;
    }

    @Override // com.facebook.ads.redexgen.X.K4
    public final void A06() {
        DynamicLoader dynamicLoader = DynamicLoaderFactory.getDynamicLoader();
        if (dynamicLoader != null) {
            dynamicLoader.createBidderTokenProviderApi().getBidderToken(this.A00);
        }
    }
}
