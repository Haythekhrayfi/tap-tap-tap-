package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1458bC {
    public final InterfaceC1462bG A00;
    public final String A01;
    public final Collection<C1473bR> A02;
    public final Collection<C1473bR> A03;
    public final List<Rect> A04;

    public C1458bC(String str, InterfaceC1462bG interfaceC1462bG, List<Rect> rects, Collection<C1473bR> collection, Collection<C1473bR> collection2) {
        this.A01 = str;
        this.A00 = interfaceC1462bG;
        this.A04 = new ArrayList(rects);
        this.A02 = collection;
        this.A03 = collection2;
    }
}
