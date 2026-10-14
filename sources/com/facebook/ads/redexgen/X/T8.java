package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Canvas;
import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class T8 extends N3 {
    public static ValueCallback A08;
    public static boolean A09;
    public static boolean A0A;
    public static byte[] A0B;
    public static final String A0C;
    public static final Set<String> A0D;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public C1337Xw A04;
    public C1053Mu A05;
    public InterfaceC1056Mx A06;
    public N0 A07;

    public static String A05(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 93);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A0B = new byte[]{83, 79, 79, 75, 49, 45, 45, 41, 42};
    }

    static {
        A08();
        A0C = T8.class.getSimpleName();
        HashSet hashSet = new HashSet(2);
        A0D = hashSet;
        A09 = false;
        A0A = false;
        hashSet.add(A05(0, 4, 102));
        hashSet.add(A05(4, 5, 4));
    }

    public T8(C1337Xw c1337Xw, Activity activity, InterfaceC1056Mx interfaceC1056Mx) {
        super(activity, c1337Xw);
        this.A02 = -1L;
        this.A00 = -1L;
        this.A03 = -1L;
        this.A01 = -1L;
        A0A(c1337Xw, interfaceC1056Mx);
    }

    public T8(C1337Xw c1337Xw, InterfaceC1056Mx interfaceC1056Mx) {
        super(c1337Xw);
        this.A02 = -1L;
        this.A00 = -1L;
        this.A03 = -1L;
        this.A01 = -1L;
        A0A(c1337Xw, interfaceC1056Mx);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.N3
    /* JADX INFO: renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final N0 A0E() {
        return new N0(new WeakReference(this.A04), new WeakReference(this.A06), new WeakReference(this.A05));
    }

    private void A07() {
        if (this.A02 > -1 && this.A00 > -1 && this.A01 > -1) {
            this.A05.A05(false);
        }
    }

    public static void A09(int i10, int i11, Intent intent) {
        if (A08 != null && i10 == 1001) {
            if (Build.VERSION.SDK_INT >= 21) {
                A08.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(i11, intent));
            } else {
                A08.onReceiveValue(intent.getData());
            }
            A08 = null;
        }
    }

    private void A0A(C1337Xw c1337Xw, InterfaceC1056Mx interfaceC1056Mx) {
        this.A04 = c1337Xw;
        this.A06 = interfaceC1056Mx;
        this.A05 = new C1053Mu(this);
        A09 = IO.A03(this.A04);
        A0A = IO.A04(this.A04);
        WebSettings settings = getSettings();
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setAllowFileAccess(false);
        setWebChromeClient(A0D());
        N0 n0A0E = A0E();
        this.A07 = n0A0E;
        setWebViewClient(n0A0E);
    }

    @Override // com.facebook.ads.redexgen.X.N3
    public final WebChromeClient A0D() {
        return new C1058Mz(new WeakReference(this.A04), new WeakReference(this.A06), new WeakReference(this.A05));
    }

    public final void A0F(long j10) {
        if (this.A00 < 0) {
            this.A00 = j10;
        }
        A07();
    }

    public final void A0G(long j10) {
        if (this.A01 < 0) {
            this.A01 = j10;
        }
        A07();
    }

    public final void A0H(long j10) {
        if (this.A02 < 0) {
            this.A02 = j10;
        }
        A07();
    }

    @Override // com.facebook.ads.redexgen.X.N3, android.webkit.WebView
    public final void destroy() {
        this.A06 = null;
        N9.A03(this);
        super.destroy();
    }

    public long getDomContentLoadedMs() {
        return this.A00;
    }

    public String getFirstUrl() {
        WebBackForwardList webBackForwardListCopyBackForwardList = copyBackForwardList();
        if (webBackForwardListCopyBackForwardList.getSize() > 0) {
            return webBackForwardListCopyBackForwardList.getItemAtIndex(0).getUrl();
        }
        return getUrl();
    }

    public long getLoadFinishMs() {
        return this.A01;
    }

    public long getResponseEndMs() {
        return this.A02;
    }

    public long getScrollReadyMs() {
        return this.A03;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A03 < 0 && computeVerticalScrollRange() > getHeight()) {
            this.A03 = System.currentTimeMillis();
        }
    }

    public void setBrowserNavigationListener(InterfaceC1057My interfaceC1057My) {
        this.A07.A04(new WeakReference<>(interfaceC1057My));
    }
}
