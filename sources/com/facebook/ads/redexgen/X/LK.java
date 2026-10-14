package com.facebook.ads.redexgen.X;

import com.facebook.ads.VideoStartReason;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class LK {
    public static PZ A00(VideoStartReason videoStartReason) {
        switch (LJ.A00[videoStartReason.ordinal()]) {
            case 1:
                return PZ.A02;
            case 2:
                return PZ.A03;
            case 3:
                return PZ.A04;
            default:
                return PZ.A03;
        }
    }
}
