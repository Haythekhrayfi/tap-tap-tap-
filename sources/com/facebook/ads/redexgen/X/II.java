package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.view.Surface;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class II {
    public final Handler A00;
    public final IJ A01;

    public II(Handler handler, IJ ij) {
        this.A00 = ij != null ? (Handler) HG.A01(handler) : null;
        this.A01 = ij;
    }

    public final void A01(int i10, int i11, int i12, float f10) {
        if (this.A01 != null) {
            this.A00.post(new IF(this, i10, i11, i12, f10));
        }
    }

    public final void A02(int i10, long j10) {
        if (this.A01 != null) {
            this.A00.post(new IE(this, i10, j10));
        }
    }

    public final void A03(Surface surface) {
        if (this.A01 != null) {
            this.A00.post(new IG(this, surface));
        }
    }

    public final void A04(Format format) {
        if (this.A01 != null) {
            this.A00.post(new ID(this, format));
        }
    }

    public final void A05(C0766As c0766As) {
        if (this.A01 != null) {
            this.A00.post(new IH(this, c0766As));
        }
    }

    public final void A06(C0766As c0766As) {
        if (this.A01 != null) {
            this.A00.post(new IB(this, c0766As));
        }
    }

    public final void A07(String str, long j10, long j11) {
        if (this.A01 != null) {
            this.A00.post(new IC(this, str, j10, j11));
        }
    }
}
