package com.facebook.ads.redexgen.X;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class PY extends ContentObserver {
    public final C1115Pe A00;

    public PY(Handler handler, C1115Pe c1115Pe) {
        super(handler);
        this.A00 = c1115Pe;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        this.A00.A0Z();
    }
}
