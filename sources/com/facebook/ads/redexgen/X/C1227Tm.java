package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1227Tm implements L4 {
    public final Collection<String> A00;

    public C1227Tm() {
        this.A00 = new ArrayList();
    }

    @Override // com.facebook.ads.redexgen.X.L4
    public final void ADn(String str) {
        this.A00.add(str);
    }

    @Override // com.facebook.ads.redexgen.X.L4
    public final void flush() {
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = this.A00.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
