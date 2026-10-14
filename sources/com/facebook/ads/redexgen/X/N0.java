package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.exoplayer2.common.base.Ascii;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class N0 extends WebViewClient {
    public static byte[] A04;
    public WeakReference<InterfaceC1057My> A00 = new WeakReference<>(null);
    public final WeakReference<C1337Xw> A01;
    public final WeakReference<InterfaceC1056Mx> A02;
    public final WeakReference<C1053Mu> A03;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 97);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{54, 55, 68, 74, 73, 15, 55, 65, 54, 67, 64, 39, 52, 37, 39, 41, 58, 47, 60, 47, 58, 63, 51, 64, 54, 68, 65, 59, 54, 0, 59, 64, 70, 55, 64, 70, 0, 51, 53, 70, 59, 65, 64, 0, 40, Ascii.ESC, 23, 41, 9, 22, 12, Ascii.SUB, 23, 17, 12, -42, 17, 22, Ascii.FS, 13, 22, Ascii.FS, -42, 11, 9, Ascii.FS, 13, 15, 23, Ascii.SUB, 33, -42, -22, -6, -9, -1, -5, -23, -22, -12, -19, 7, 23, 20, Ascii.FS, Ascii.CAN, 10, 23, 4, 11, 6, 17, 17, 7, 6, 8, 16, 4, Ascii.SUB, 23, 17, -54, -57, -38, -57, 49, 54, 60, 45, 54, 60, -36, -39, -45, -95, -121, -30, -48, -51, -54, -31, -44, -48, -30};
    }

    public N0(WeakReference<C1337Xw> weakReference, WeakReference<InterfaceC1056Mx> weakReference2, WeakReference<C1053Mu> weakReference3) {
        this.A01 = weakReference;
        this.A02 = weakReference2;
        this.A03 = weakReference3;
    }

    private void A02(String str, C1337Xw c1337Xw) {
        c1337Xw.A07().A9K(A00(11, 11, 101), C06937v.A09, new C06947w(A00(111, 5, 6) + str));
    }

    private boolean A03(WebView webView, String str) {
        Intent intent;
        String strA00 = A00(116, 8, 10);
        C1337Xw c1337Xw = this.A01.get();
        if (c1337Xw == null) {
            return false;
        }
        if (T8.A0A && (TextUtils.isEmpty(str) || A00(0, 11, 116).equals(str))) {
            return true;
        }
        try {
            Uri uri = KW.A00(str);
            String scheme = uri.getScheme();
            try {
                boolean zA0x = IN.A0x(c1337Xw);
                String strA01 = A00(48, 33, 71);
                String strA02 = A00(22, 26, 113);
                String strA03 = A00(105, 6, 103);
                if (zA0x) {
                    if (!T8.A0D.contains(scheme) && !A00(101, 4, 5).equals(scheme)) {
                        if (strA03.equalsIgnoreCase(scheme)) {
                            intent = Intent.parseUri(str, 1);
                            intent.setComponent(null);
                            intent.setSelector(null);
                        } else {
                            intent = new Intent(strA02, uri);
                        }
                        intent.addCategory(strA01);
                        if (Build.VERSION.SDK_INT >= 30) {
                            intent.setFlags(268436480);
                        } else {
                            intent.setFlags(268435456);
                        }
                        try {
                            if (!KJ.A0B(c1337Xw, intent)) {
                                A02(str, c1337Xw);
                            }
                            return true;
                        } catch (KH unused) {
                            if (strA03.equals(scheme)) {
                                String stringExtra = intent.getStringExtra(A00(81, 20, 68));
                                if (!TextUtils.isEmpty(stringExtra)) {
                                    if (!KJ.A0B(c1337Xw, new Intent(strA02, KW.A00(stringExtra)))) {
                                        A02(str, c1337Xw);
                                    }
                                    return true;
                                }
                            }
                            C06947w c06947w = new C06947w(A00(111, 5, 6) + str);
                            c06947w.A03(1);
                            c1337Xw.A07().A9L(A00(11, 11, 101), C06937v.A06, c06947w);
                            return true;
                        }
                    }
                    return false;
                }
                if (T8.A0A && strA03.equalsIgnoreCase(scheme)) {
                    Intent uri2 = Intent.parseUri(str, 1);
                    uri2.addCategory(strA01);
                    uri2.setComponent(null);
                    uri2.setSelector(null);
                    if (c1337Xw.getPackageManager().resolveActivity(uri2, 65536) != null && KJ.A0B(c1337Xw, uri2)) {
                        webView.goBack();
                        return true;
                    }
                } else if ((T8.A0A && C0998Kr.A04(str)) || !T8.A0D.contains(scheme)) {
                    return KJ.A0B(c1337Xw, new Intent(strA02, uri));
                }
            } catch (Exception e10) {
                c1337Xw.A07().A9L(strA00, C06937v.A2a, new C06947w(e10));
                c1337Xw.A0E().A8Z(e10.toString());
            }
            return false;
        } catch (SecurityException e11) {
            c1337Xw.A07().A9L(strA00, C06937v.A2a, new C06947w(e11));
            return true;
        }
    }

    public final void A04(WeakReference<InterfaceC1057My> weakReference) {
        this.A00 = weakReference;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        C1053Mu timingLogger = this.A03.get();
        if (timingLogger != null) {
            timingLogger.A03();
        }
        InterfaceC1056Mx interfaceC1056Mx = this.A02.get();
        if (interfaceC1056Mx != null) {
            interfaceC1056Mx.AC5(str);
        }
        InterfaceC1057My interfaceC1057My = this.A00.get();
        if (interfaceC1057My != null) {
            interfaceC1057My.AAV(webView.canGoBack());
            interfaceC1057My.ABE(webView.canGoForward());
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        InterfaceC1056Mx listener = this.A02.get();
        if (listener != null) {
            listener.AC7(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
        C1337Xw c1337Xw = this.A01.get();
        if (c1337Xw != null) {
            StringBuilder sb2 = new StringBuilder();
            String strA00 = A00(0, 0, 27);
            String errorMessage = C0998Kr.A01(i10, sb2.append(strA00).append(str).toString(), strA00 + str2);
            c1337Xw.A0E().A8W(errorMessage);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        C1337Xw c1337Xw = this.A01.get();
        if (c1337Xw != null) {
            int errorCode = webResourceError.getErrorCode();
            StringBuilder sb2 = new StringBuilder();
            String strA00 = A00(0, 0, 27);
            String errorMessage = C0998Kr.A01(errorCode, sb2.append(strA00).append((Object) webResourceError.getDescription()).toString(), strA00 + webResourceRequest.getUrl());
            c1337Xw.A0E().A8W(errorMessage);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        C1337Xw context = this.A01.get();
        if (context != null) {
            context.A0E().A8X();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        C1337Xw context = this.A01.get();
        if (context != null) {
            context.A0E().A8Y();
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        N3.A02(C06937v.A2b);
        InterfaceC1056Mx listener = this.A02.get();
        if (listener != null) {
            listener.ACW();
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return A03(webView, webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return A03(webView, str);
    }
}
