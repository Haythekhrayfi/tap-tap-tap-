package com.facebook.ads.redexgen.X;

import android.os.Handler;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class V4 implements GV, InterfaceC0905Gw<Object> {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public final Handler A06;
    public final GU A07;
    public final HJ A08;
    public final C0925Hq A09;

    public V4() {
        this(null, null, 1000000L, 2000, HJ.A00);
    }

    public V4(Handler handler, GU gu, long j10, int i10, HJ hj) {
        this.A06 = handler;
        this.A07 = gu;
        this.A09 = new C0925Hq(i10);
        this.A08 = hj;
        this.A01 = j10;
    }

    private void A01(int i10, long j10, long j11) {
        Handler handler = this.A06;
        if (handler != null && this.A07 != null) {
            handler.post(new Gf(this, i10, j10, j11));
        }
    }

    @Override // com.facebook.ads.redexgen.X.GV
    public final synchronized long A61() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0905Gw
    public final synchronized void AAb(Object obj, int i10) {
        this.A02 += (long) i10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0905Gw
    public final synchronized void AD3(Object obj) {
        HG.A04(this.A00 > 0);
        long nowMs = this.A08.A5N();
        int i10 = (int) (nowMs - this.A03);
        this.A05 += (long) i10;
        long j10 = this.A04;
        long j11 = this.A02;
        this.A04 = j10 + j11;
        if (i10 > 0) {
            this.A09.A03((int) Math.sqrt(j11), (8000 * j11) / ((long) i10));
            if (this.A05 >= 2000 || this.A04 >= 524288) {
                this.A01 = (long) this.A09.A02(0.5f);
            }
        }
        A01(i10, this.A02, this.A01);
        int sampleElapsedTimeMs = this.A00 - 1;
        this.A00 = sampleElapsedTimeMs;
        if (sampleElapsedTimeMs > 0) {
            this.A03 = nowMs;
        }
        this.A02 = 0L;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0905Gw
    public final synchronized void AD4(Object obj, C0889Ge c0889Ge) {
        if (this.A00 == 0) {
            this.A03 = this.A08.A5N();
        }
        this.A00++;
    }
}
