package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.bridge.gms.AdvertisingId;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class XY implements C7U {
    public final /* synthetic */ AdvertisingId A00;
    public final /* synthetic */ XX A01;

    public XY(XX xx, AdvertisingId advertisingId) {
        this.A01 = xx;
        this.A00 = advertisingId;
    }

    @Override // com.facebook.ads.redexgen.X.C7U
    public final boolean A8v() {
        return this.A00.isLimitAdTracking();
    }

    @Override // com.facebook.ads.redexgen.X.C7U
    public final String getId() {
        return this.A00.getId();
    }
}
