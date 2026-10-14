package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7O, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final /* synthetic */ class C7O {
    public static /* synthetic */ boolean A00(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}
