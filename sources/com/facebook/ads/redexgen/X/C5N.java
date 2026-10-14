package com.facebook.ads.redexgen.X;

import android.content.Context;
import com.facebook.ads.internal.api.BidderTokenProviderApi;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5N, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C5N implements BidderTokenProviderApi {
    public final C6F A00 = new C6F();

    public final C6F A00() {
        return this.A00;
    }

    @Override // com.facebook.ads.internal.api.BidderTokenProviderApi
    public final String getBidderToken(Context context) {
        return this.A00.A06(C5O.A07(context));
    }
}
