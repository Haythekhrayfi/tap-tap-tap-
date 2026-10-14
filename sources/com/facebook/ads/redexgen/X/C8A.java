package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8A, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C8A extends AbstractC1064Nf {
    public final /* synthetic */ SC A00;

    public C8A(SC sc2) {
        this.A00 = sc2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C8Y
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(OA oa2) {
        new Handler(Looper.getMainLooper()).post(new RunnableC1099Oo(this));
    }
}
