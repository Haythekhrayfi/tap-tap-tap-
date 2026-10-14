package com.facebook.ads.redexgen.X;

import android.view.Surface;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class IG implements Runnable {
    public final /* synthetic */ Surface A00;
    public final /* synthetic */ II A01;

    public IG(II ii, Surface surface) {
        this.A01 = ii;
        this.A00 = surface;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            this.A01.A01.ACX(this.A00);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }
}
