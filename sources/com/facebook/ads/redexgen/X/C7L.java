package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7L, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C7L extends AbstractC1064Nf {
    public final /* synthetic */ C7I A00;

    public C7L(C7I c7i) {
        this.A00 = c7i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C8Y
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(OA oa2) {
        new Handler(Looper.getMainLooper()).post(new RunnableC1105Ou(this));
    }
}
