package com.facebook.ads.redexgen.X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1338Xx implements C6S {
    public final Map<String, Set<String>> A00 = new HashMap();

    @Override // com.facebook.ads.redexgen.X.C6S
    public final synchronized void A4D(String str) {
        this.A00.remove(str);
    }

    @Override // com.facebook.ads.redexgen.X.C6S
    public final boolean A8l(String str, String str2) {
        Set<String> loadedAds = this.A00.get(str2);
        return loadedAds != null && loadedAds.contains(str);
    }

    @Override // com.facebook.ads.redexgen.X.C6S
    public final synchronized void AEv(String str, String str2) {
        Set<String> hashSet = this.A00.get(str2);
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.A00.put(str2, hashSet);
        }
        hashSet.add(str);
    }
}
