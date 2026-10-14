package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdPlacementType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C05220t {
    public static InterfaceC05170o A00;

    public final InterfaceC05170o A00(C1337Xw c1337Xw, AdPlacementType adPlacementType) {
        InterfaceC05170o interfaceC05170o = A00;
        if (interfaceC05170o != null) {
            return interfaceC05170o;
        }
        switch (C05210s.A00[adPlacementType.ordinal()]) {
            case 1:
                return new C1422aV();
            case 2:
                return new C1421aU();
            case 3:
                return new C1419aS(c1337Xw);
            case 4:
                return new FB(c1337Xw);
            case 5:
                return new F8();
            default:
                return null;
        }
    }
}
