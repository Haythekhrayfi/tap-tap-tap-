package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1127Pq extends C8Y<C06746z> {
    public final /* synthetic */ AnonymousClass74 A00;

    public C1127Pq(AnonymousClass74 anonymousClass74) {
        this.A00 = anonymousClass74;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C8Y
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C06746z c06746z) {
        int iA00 = c06746z.A00();
        int currentPositionMS = this.A00.A00;
        if (currentPositionMS > 0) {
            int currentPositionMS2 = this.A00.A0B.getDuration();
            if (iA00 == currentPositionMS2) {
                int duration = this.A00.A0B.getDuration();
                int currentPositionMS3 = this.A00.A00;
                if (duration > currentPositionMS3) {
                    return;
                }
            }
        }
        this.A00.A0e(iA00);
    }

    @Override // com.facebook.ads.redexgen.X.C8Y
    public final Class<C06746z> A01() {
        return C06746z.class;
    }
}
