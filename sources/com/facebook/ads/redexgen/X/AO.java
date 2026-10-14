package com.facebook.ads.redexgen.X;

import android.os.Handler;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AO {
    public final Handler A00;
    public final AP A01;

    public AO(Handler handler, AP ap) {
        this.A00 = ap != null ? (Handler) HG.A01(handler) : null;
        this.A01 = ap;
    }

    public final void A01(int i10) {
        if (this.A01 != null) {
            this.A00.post(new AN(this, i10));
        }
    }

    public final void A02(int i10, long j10, long j11) {
        if (this.A01 != null) {
            this.A00.post(new AL(this, i10, j10, j11));
        }
    }

    public final void A03(Format format) {
        if (this.A01 != null) {
            this.A00.post(new AK(this, format));
        }
    }

    public final void A04(C0766As c0766As) {
        if (this.A01 != null) {
            this.A00.post(new AM(this, c0766As));
        }
    }

    public final void A05(C0766As c0766As) {
        if (this.A01 != null) {
            this.A00.post(new AI(this, c0766As));
        }
    }

    public final void A06(String str, long j10, long j11) {
        if (this.A01 != null) {
            this.A00.post(new AJ(this, str, j10, j11));
        }
    }
}
