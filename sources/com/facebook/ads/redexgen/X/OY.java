package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class OY {
    public static final Map<String, WeakReference<OX>> A00 = new HashMap();

    public static int A00() {
        return A00.size();
    }

    public static OX A01(C1337Xw c1337Xw, AbstractC1404aD abstractC1404aD, int i10, OV ov) {
        OX ox = new OX(c1337Xw, abstractC1404aD, c1337Xw.A01().A09(), i10);
        ox.A0b(ov);
        ox.A0X();
        A00.put(abstractC1404aD.A0M(), new WeakReference<>(ox));
        return ox;
    }

    public static OX A02(String str) {
        WeakReference<OX> weakReference = A00.get(str);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void A03(AbstractC1404aD abstractC1404aD, OX ox) {
        A00.put(abstractC1404aD.A0M(), new WeakReference<>(ox));
    }

    public static void A04(String str) {
        A00.remove(str);
    }
}
