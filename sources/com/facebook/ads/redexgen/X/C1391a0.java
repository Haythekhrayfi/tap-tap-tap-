package com.facebook.ads.redexgen.X;

import android.webkit.WebView;
import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1391a0 implements C6G {
    public final C1Y A00;
    public final InterfaceC05411m A01;
    public final C6O A02;
    public final C1337Xw A03;
    public final boolean A04;

    public C1391a0(C1337Xw c1337Xw, InterfaceC05411m interfaceC05411m, C6O c6o, C1Y c1y, boolean z10) {
        this.A03 = c1337Xw;
        this.A01 = interfaceC05411m;
        this.A02 = c6o;
        this.A00 = c1y;
        this.A04 = z10;
    }

    private final void A00() {
        WebView webView = new WebView(this.A03);
        webView.getSettings().setCacheMode(1);
        webView.setWebViewClient(new C05421n(this.A00, this.A01, this.A04));
        webView.loadUrl(this.A00.A0E());
    }

    private void A01(boolean z10) {
        if (this.A00.A09() == C1Z.A05) {
            A00();
            return;
        }
        String strA0E = this.A00.A0E();
        if (z10) {
            C6O c6o = this.A02;
            String markupUrlResult = this.A00.A0E();
            strA0E = c6o.A0R(markupUrlResult);
        }
        this.A00.A0H(strA0E);
        this.A01.ACC();
    }

    @Override // com.facebook.ads.redexgen.X.C6G
    public final void AAc() {
        if (this.A04) {
            this.A01.ACB(AdError.CACHE_ERROR);
        } else {
            A01(false);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C6G
    public final void AAl() {
        A01(true);
    }
}
