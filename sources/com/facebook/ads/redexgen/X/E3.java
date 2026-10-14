package com.facebook.ads.redexgen.X;

import com.facebook.ads.VideoStartReason;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class E3 extends OR {
    public final /* synthetic */ C5T A00;

    public E3(C5T c5t) {
        this.A00 = c5t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C8Y
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(AnonymousClass73 anonymousClass73) {
        this.A00.A00.onCompleted();
        if (IN.A1I(this.A00.A00.getContext())) {
            this.A00.A00.play(VideoStartReason.AUTO_STARTED);
        }
    }
}
