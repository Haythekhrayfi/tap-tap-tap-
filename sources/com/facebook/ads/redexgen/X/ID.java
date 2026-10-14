package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class ID implements Runnable {
    public final /* synthetic */ Format A00;
    public final /* synthetic */ II A01;

    public ID(II ii, Format format) {
        this.A01 = ii;
        this.A00 = format;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            this.A01.A01.ADF(this.A00);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }
}
