package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.webkit.JavascriptInterface;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class N5 {
    public static String[] A07 = {"FOFLIt4izaDLaQDOMIXk8qYNT283z5pM", "oiToeohcscvINDKXEsytRf9HFldaqPXB", "4ipPd9h88IiL3d99rWL92oIsRR1k6HBA", "hPx", "0GhefH5NzI2ypbPnqUG75Cq8VmhNX1", "2b6", "snO0JYp8WiAdMwbOevXppfTs6iFhTSIS", "awSLBYFe7Md8cHgboMT9P3Pgh1wlsZGE"};
    public final String A00 = N5.class.getSimpleName();
    public final WeakReference<AtomicBoolean> A01;
    public final WeakReference<AtomicBoolean> A02;
    public final WeakReference<C0S> A03;
    public final WeakReference<N6> A04;
    public final WeakReference<QR> A05;
    public final WeakReference<C1214Sz> A06;

    public N5(C1214Sz c1214Sz, N6 n10, QR qr, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, C1337Xw c1337Xw) {
        this.A06 = new WeakReference<>(c1214Sz);
        this.A04 = new WeakReference<>(n10);
        this.A05 = new WeakReference<>(qr);
        this.A01 = new WeakReference<>(atomicBoolean);
        this.A02 = new WeakReference<>(atomicBoolean2);
        this.A03 = new WeakReference<>(c1337Xw.A0E());
    }

    private C0S A00() {
        C0S funnel = this.A03.get();
        if (funnel == null) {
            return new C1436aj();
        }
        return funnel;
    }

    @JavascriptInterface
    public void alert(String str) {
        Log.e(this.A00, str);
    }

    @JavascriptInterface
    public String getAnalogInfo() {
        return C1000Kt.A01(AnonymousClass84.A02());
    }

    @JavascriptInterface
    public void logFunnel(int i10, String str) {
        A00().AG3(i10, str);
    }

    @JavascriptInterface
    public void onMainAssetLoaded() {
        A00().AG4();
        if (this.A06.get() == null || this.A01.get() == null || this.A02.get() == null) {
            return;
        }
        boolean z10 = this.A02.get().get();
        String[] strArr = A07;
        if (strArr[4].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        A07[1] = "xXjDpbk5Vvc7CvrBd08NYXaJ46SIZN7q";
        if (z10) {
            this.A01.get().set(true);
            A00().AG5();
            if (this.A06.get().isShown()) {
                A00().AG6();
                new Handler(Looper.getMainLooper()).post(new T1(this.A05));
            }
            N6 n10 = this.A04.get();
            if (n10 != null) {
                new Handler(Looper.getMainLooper()).post(new N4(this, n10));
            }
        }
    }

    @JavascriptInterface
    public void onPageInitialized() {
        C1214Sz webView = this.A06.get();
        if (webView == null || webView.A06()) {
            A00().AG7(true);
            return;
        }
        N6 listener = this.A04.get();
        if (listener == null) {
            A00().AG7(true);
        } else {
            A00().AG7(false);
            listener.AC6();
        }
    }
}
