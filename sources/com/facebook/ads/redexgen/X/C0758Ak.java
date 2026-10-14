package com.facebook.ads.redexgen.X;

import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ak, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0758Ak implements InterfaceC1250Uk, Comparator<H4> {
    public long A00;
    public final long A01;
    public final TreeSet<H4> A02 = new TreeSet<>(this);

    public C0758Ak(long j10) {
        this.A01 = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compare(H4 h10, H4 h11) {
        if (h10.A00 - h11.A00 == 0) {
            return h10.compareTo(h11);
        }
        return h10.A00 < h11.A00 ? -1 : 1;
    }

    private void A01(H0 h10, long j10) {
        while (this.A00 + j10 > this.A01 && !this.A02.isEmpty()) {
            try {
                h10.AEO(this.A02.first());
            } catch (C0907Gy unused) {
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0908Gz
    public final void ACp(H0 h10, H4 h11) {
        this.A02.add(h11);
        this.A00 += h11.A01;
        A01(h10, 0L);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0908Gz
    public final void ACq(H0 h10, H4 h11) {
        this.A02.remove(h11);
        this.A00 -= h11.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0908Gz
    public final void ACr(H0 h10, H4 h11, H4 h12) {
        ACq(h10, h11);
        ACp(h10, h12);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1250Uk
    public final void ACs(H0 h10, String str, long j10, long j11) {
        A01(h10, j11);
    }
}
