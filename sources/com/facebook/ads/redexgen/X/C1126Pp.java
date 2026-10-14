package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1126Pp extends C8Y<AnonymousClass73> {
    public final /* synthetic */ AnonymousClass74 A00;

    public C1126Pp(AnonymousClass74 anonymousClass74) {
        this.A00 = anonymousClass74;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C8Y
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(AnonymousClass73 anonymousClass73) {
        int iA00 = anonymousClass73.A00();
        int duration = anonymousClass73.A01();
        int currentPosition = this.A00.A00;
        if (currentPosition > 0 && iA00 == duration) {
            int currentPosition2 = this.A00.A00;
            if (duration > currentPosition2) {
                return;
            }
        }
        int currentPosition3 = iA00 + 500;
        if (duration < currentPosition3) {
            if (duration == 0) {
                AnonymousClass74 anonymousClass74 = this.A00;
                int currentPosition4 = anonymousClass74.A00;
                anonymousClass74.A0d(currentPosition4);
                return;
            }
            this.A00.A0d(duration);
            return;
        }
        this.A00.A0d(iA00);
    }

    @Override // com.facebook.ads.redexgen.X.C8Y
    public final Class<AnonymousClass73> A01() {
        return AnonymousClass73.class;
    }
}
