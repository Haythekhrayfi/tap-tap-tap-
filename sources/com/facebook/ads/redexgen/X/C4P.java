package com.facebook.ads.redexgen.X;

import android.database.Observable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4P, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C4P extends Observable<C4Q> {
    public final void A00() {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((C4Q) this.mObservers.get(size)).A00();
        }
    }
}
