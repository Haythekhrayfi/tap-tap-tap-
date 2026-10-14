package com.facebook.ads.redexgen.X;

import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8Q, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C8Q {
    public static C8Q A00 = new C8Q();

    public static C8Q A00() {
        return A00;
    }

    public final XR A01(C7Q c7q, boolean z10) {
        return new XR(c7q, z10, new C6E());
    }

    public final Map<String, String> A02(C7Q c7q) {
        try {
            return A01(c7q, false).A0C();
        } catch (Throwable th) {
            c7q.A07().A3X(th);
            return C8M.A01(c7q);
        }
    }
}
