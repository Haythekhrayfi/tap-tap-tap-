package com.facebook.ads.redexgen.X;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1460bE {
    public final Map<String, C1473bR> A00;
    public final Set<C1473bR> A01;

    public C1460bE() {
        this.A00 = new HashMap();
        this.A01 = new HashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Collection<C1473bR> A00() {
        return this.A01;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Collection<C1473bR> A01() {
        return this.A00.values();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        this.A00.clear();
        for (C1473bR c1473bR : this.A01) {
            this.A00.put(c1473bR.A04, c1473bR);
        }
        this.A01.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A06(C1473bR c1473bR) {
        if (this.A01.add(c1473bR)) {
            this.A00.remove(c1473bR.A04);
            return true;
        }
        return false;
    }
}
