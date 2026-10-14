package com.facebook.ads.redexgen.X;

import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class JB {
    public final J9 A0B;
    public final boolean A0F;
    public final String A0C = JB.class.getSimpleName();
    public final int A07 = 101;
    public final int A0A = 102;
    public final int A08 = 103;
    public final int A03 = 104;
    public final int A09 = 105;
    public final int A02 = 106;
    public final int A04 = 107;
    public final int A05 = 108;
    public final int A06 = 109;
    public final int A01 = 110;
    public final boolean A0E = false;
    public long A00 = -1;
    public final List<JA> A0D = new LinkedList();

    public JB(C7Q c7q, J9 j10) {
        int nativeViewabilityHistorySamplingRate = IP.A0D(c7q);
        if (nativeViewabilityHistorySamplingRate < 1) {
            this.A0F = false;
        } else {
            this.A0F = c7q.A08().A00() < 1.0d / ((double) nativeViewabilityHistorySamplingRate);
        }
        this.A0B = j10;
    }

    private int A00() {
        return this.A0B.A6V();
    }

    private int A01() {
        if (this.A00 > 0) {
            return (int) (System.currentTimeMillis() - this.A00);
        }
        return -1;
    }

    private void A03(JA ja2) {
        synchronized (this.A0D) {
            this.A0D.add(ja2);
        }
    }

    public final void A04() {
        if (!this.A0F) {
            return;
        }
        A03(new JA(A01(), 110, A00(), null));
    }

    public final void A05() {
        if (!this.A0F) {
            return;
        }
        A03(new JA(A01(), 106, A00(), null));
    }

    public final void A06() {
        if (!this.A0F) {
            return;
        }
        A03(new JA(A01(), 104, A00(), null));
    }

    public final void A07() {
        if (!this.A0F) {
            return;
        }
        A03(new JA(A01(), 109, -1, null));
    }

    public final void A08() {
        if (!this.A0F) {
            return;
        }
        A03(new JA(A01(), 108, A00(), null));
    }

    public final void A09() {
        if (!this.A0F) {
            return;
        }
        this.A00 = System.currentTimeMillis();
        A03(new JA(0, 101, -1, null));
    }

    public final void A0A() {
        if (!this.A0F) {
            return;
        }
        A03(new JA(A01(), 105, A00(), null));
    }

    public final void A0B() {
        if (!this.A0F) {
            return;
        }
        A03(new JA(A01(), 102, A00(), null));
    }

    public final void A0C(C7Q c7q, String str) {
        if (!this.A0F) {
            return;
        }
        A03(new JA(A01(), 103, A00(), null));
        LT.A06.execute(new J8(this, str, c7q));
    }
}
