package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Uc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1242Uc implements InterfaceC1476bU<IT, IY> {
    public UZ A00;

    public C1242Uc(UZ uz) {
        this.A00 = uz;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bR != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC1476bU
    public final void A5W(C1473bR<IT, IY> c1473bR, InterfaceC1462bG interfaceC1462bG) {
        switch (IR.A00[interfaceC1462bG.A89(c1473bR).ordinal()]) {
            case 1:
            case 2:
                this.A00.A02(c1473bR, interfaceC1462bG);
                break;
        }
    }
}
