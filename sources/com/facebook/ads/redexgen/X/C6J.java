package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6J, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C6J implements Callable<Boolean> {
    public final BlockingQueue<Boolean> A00 = new LinkedBlockingQueue();
    public final /* synthetic */ C6O A01;

    public C6J(C6O c6o, C6K c6k) {
        this.A01 = c6o;
        new Handler(Looper.getMainLooper()).post(new C1340Xz(this, c6o, c6k));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Boolean call() throws Exception {
        return this.A00.take();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(C6K c6k) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        QD qdA05 = QD.A05(this.A01.A04.A01());
        Uri uriA00 = KW.A00(c6k.A08);
        long jA0O = c6k.A00;
        if (jA0O == -1) {
            jA0O = IN.A0O(this.A01.A04);
        }
        qdA05.A0G(uriA00, new C1339Xy(this, c6k, jA0O, jCurrentTimeMillis), jA0O);
    }
}
