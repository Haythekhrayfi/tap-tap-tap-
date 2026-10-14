package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0979Jw {
    public static final Set<Object> A00 = Collections.newSetFromMap(new WeakHashMap());
    public static final AtomicBoolean A01 = new AtomicBoolean(true);
    public static final AtomicReference<InterfaceC0977Ju> A02 = new AtomicReference<>();

    public static void A00(Throwable th, Object obj) throws Throwable {
        if (A01.get()) {
            A00.add(obj);
            KB.A00().A9C(3306, th);
            InterfaceC0977Ju contextRepairHelper = A02.get();
            if (contextRepairHelper != null) {
                contextRepairHelper.AER(th, obj);
                return;
            }
            return;
        }
        throw th;
    }

    public static void A01(boolean z10, InterfaceC0977Ju interfaceC0977Ju) {
        A01.set(z10);
        A02.set(interfaceC0977Ju);
    }

    public static boolean A02(Object obj) {
        return A00.contains(obj);
    }
}
