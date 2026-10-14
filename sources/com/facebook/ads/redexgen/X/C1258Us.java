package com.facebook.ads.redexgen.X;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Us, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1258Us implements InterfaceC0902Gt {
    public HandlerC0896Gn<? extends InterfaceC0897Go> A00;
    public IOException A01;
    public final ExecutorService A02;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final <T extends InterfaceC0897Go> long A04(T t10, InterfaceC0895Gm<T> interfaceC0895Gm, int i10) {
        Looper looperMyLooper = Looper.myLooper();
        HG.A04(looperMyLooper != null);
        this.A01 = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new HandlerC0896Gn(this, looperMyLooper, t10, interfaceC0895Gm, i10, jElapsedRealtime).A06(0L);
        return jElapsedRealtime;
    }

    public C1258Us(String str) {
        this.A02 = C0930Hv.A0T(str);
    }

    public final void A05() {
        this.A00.A07(false);
    }

    public final void A06(int i10) throws IOException {
        IOException iOException = this.A01;
        if (iOException == null) {
            HandlerC0896Gn<? extends InterfaceC0897Go> handlerC0896Gn = this.A00;
            if (handlerC0896Gn != null) {
                if (i10 == Integer.MIN_VALUE) {
                    i10 = handlerC0896Gn.A03;
                }
                handlerC0896Gn.A05(i10);
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void A07(InterfaceC0898Gp interfaceC0898Gp) {
        HandlerC0896Gn<? extends InterfaceC0897Go> handlerC0896Gn = this.A00;
        if (handlerC0896Gn != null) {
            handlerC0896Gn.A07(true);
        }
        if (interfaceC0898Gp != null) {
            this.A02.execute(new RunnableC0899Gq(interfaceC0898Gp));
        }
        this.A02.shutdown();
    }

    public final boolean A08() {
        return this.A00 != null;
    }
}
