package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1474bS<ModelType, StateType> {
    public final ModelType A02;
    public final StateType A03;
    public final String A04;
    public List<InterfaceC1476bU<ModelType, StateType>> A01 = null;
    public C1473bR A00 = C1473bR.A08;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bS != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    public C1474bS(ModelType model, StateType state, String str) {
        this.A02 = model;
        this.A03 = state;
        this.A04 = str;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bS != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bU != com.instagram.common.viewpoint.core.ViewpointAction<ModelType, StateType> */
    public final C1474bS<ModelType, StateType> A05(InterfaceC1476bU<ModelType, StateType> interfaceC1476bU) {
        if (this.A01 == null) {
            this.A01 = new ArrayList();
        }
        this.A01.add(interfaceC1476bU);
        return this;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bS != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    public final C1473bR<ModelType, StateType> A06() {
        return new C1473bR<>(this);
    }
}
