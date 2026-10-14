package com.facebook.ads.redexgen.X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class BG implements VO {
    public static String[] A06 = {"KcRMvDVLZNgc0ooVkhN4ahdKcengok4t", "7pRgSHJJ", "GNHbGuKbKosn0JAz4xkib8iBcGb5WNz5", "hJNyShuwv1tZ2cTKHVoLW9isLSOVhBhj", "H7WHQ", "6cZmXLfi2DPGYj7ZmxIdQ5A", "b2Hmg2LD", "cSsJl4a3bVOvbO76ENMD9MAL1lcw3B"};
    public long A00;
    public long A01;
    public AnonymousClass36 A02;
    public final ArrayDeque<AnonymousClass36> A03 = new ArrayDeque<>();
    public final ArrayDeque<BL> A04;
    public final PriorityQueue<AnonymousClass36> A05;

    public abstract VL A0N();

    public abstract void A0P(BM bm);

    public abstract boolean A0R();

    public BG() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.A03.add(new AnonymousClass36());
        }
        this.A04 = new ArrayDeque<>();
        for (int i11 = 0; i11 < 2; i11++) {
            this.A04.add(new AnonymousClass35(this));
        }
        this.A05 = new PriorityQueue<>();
    }

    private void A0K(AnonymousClass36 anonymousClass36) {
        anonymousClass36.A07();
        this.A03.add(anonymousClass36);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0765Ar
    /* JADX INFO: renamed from: A0L, reason: merged with bridge method [inline-methods] */
    public BM A4z() throws FV {
        HG.A04(this.A02 == null);
        boolean zIsEmpty = this.A03.isEmpty();
        if (A06[4].length() != 5) {
            throw new RuntimeException();
        }
        A06[4] = "MSCQz";
        if (zIsEmpty) {
            return null;
        }
        AnonymousClass36 anonymousClass36PollFirst = this.A03.pollFirst();
        this.A02 = anonymousClass36PollFirst;
        return anonymousClass36PollFirst;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0765Ar
    /* JADX INFO: renamed from: A0M, reason: merged with bridge method [inline-methods] */
    public BL A50() throws FV {
        if (this.A04.isEmpty()) {
            return null;
        }
        while (!this.A05.isEmpty() && ((X0) this.A05.peek()).A00 <= this.A00) {
            AnonymousClass36 anonymousClass36Poll = this.A05.poll();
            if (anonymousClass36Poll.A04()) {
                BL blPollFirst = this.A04.pollFirst();
                blPollFirst.A00(4);
                A0K(anonymousClass36Poll);
                String[] strArr = A06;
                if (strArr[1].length() != strArr[6].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A06;
                strArr2[2] = "Z7l20gfPvvtRCAhrDUNIN8ivECfXDju3";
                strArr2[3] = "MHWMj6Fd4O5yELPFkyyjrniha9DdnabU";
                return blPollFirst;
            }
            A0P(anonymousClass36Poll);
            if (A0R()) {
                VL vlA0N = A0N();
                if (!anonymousClass36Poll.A03()) {
                    BL blPollFirst2 = this.A04.pollFirst();
                    blPollFirst2.A09(((X0) anonymousClass36Poll).A00, vlA0N, RecyclerView.FOREVER_NS);
                    A0K(anonymousClass36Poll);
                    return blPollFirst2;
                }
            }
            A0K(anonymousClass36Poll);
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0765Ar
    /* JADX INFO: renamed from: A0O, reason: merged with bridge method [inline-methods] */
    public void ADx(BM bm) throws FV {
        HG.A03(bm == this.A02);
        if (A06[0].charAt(9) != 'N') {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[7] = "h6rCbn8hi0Qg5CvGAi8vHFDPjl0uqV";
        strArr[5] = "6Me2Lvii1P8K0tFjrCRJacm";
        if (bm.A03()) {
            A0K(this.A02);
        } else {
            AnonymousClass36 anonymousClass36 = this.A02;
            long j10 = this.A01;
            this.A01 = 1 + j10;
            anonymousClass36.A00 = j10;
            this.A05.add(this.A02);
        }
        this.A02 = null;
    }

    public final void A0Q(BL bl) {
        bl.A07();
        this.A04.add(bl);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0765Ar
    public void AED() {
    }

    @Override // com.facebook.ads.redexgen.X.VO
    public void AFF(long j10) {
        this.A00 = j10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0765Ar
    public void flush() {
        this.A01 = 0L;
        this.A00 = 0L;
        while (!this.A05.isEmpty()) {
            A0K(this.A05.poll());
        }
        AnonymousClass36 anonymousClass36 = this.A02;
        if (anonymousClass36 != null) {
            A0K(anonymousClass36);
            this.A02 = null;
        }
    }
}
