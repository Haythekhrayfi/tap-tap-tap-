package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0884Fz implements InterfaceC1477bV {
    public final List<InterfaceC1478bW> A00 = new ArrayList();

    @Override // com.facebook.ads.redexgen.X.InterfaceC1477bV
    public final InterfaceC1478bW A5l(int i10) {
        return this.A00.get(i10);
    }

    @Override // java.lang.Iterable
    public final Iterator<InterfaceC1478bW> iterator() {
        return this.A00.iterator();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1477bV
    public final int size() {
        return this.A00.size();
    }
}
