package com.applovin.impl.adview;

import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.ab;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdSize;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class e extends ab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f8517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.y f8518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f8519c;

    public e(b bVar, com.applovin.impl.sdk.o oVar) {
        this.f8517a = oVar;
        this.f8518b = oVar.F();
        this.f8519c = bVar;
    }

    private void a(PointF pointF) {
        this.f8519c.a(pointF);
    }

    private void a(d dVar, Uri uri) {
        a(dVar, uri, false);
    }

    private void a(d dVar, Uri uri, boolean z10) {
        com.applovin.impl.sdk.ad.e currentAd = dVar.getCurrentAd();
        AppLovinAdView appLovinAdViewR = this.f8519c.r();
        if (appLovinAdViewR != null && currentAd != null) {
            com.applovin.impl.sdk.d.d statsManagerHelper = dVar.getStatsManagerHelper();
            if (statsManagerHelper != null) {
                statsManagerHelper.b();
            }
            if (currentAd instanceof com.applovin.impl.c.a) {
                ((com.applovin.impl.c.a) currentAd).o().o();
            }
            this.f8519c.a(currentAd, appLovinAdViewR, uri, dVar.getAndClearLastClickLocation(), z10);
            return;
        }
        if (com.applovin.impl.sdk.y.a()) {
            this.f8518b.e("AdWebView", "Attempting to track click that is null or not an ApplovinAdView instance for clickedUri = " + uri);
        }
    }

    private void a(com.applovin.impl.c.a aVar, d dVar) {
        a(aVar, dVar, false);
    }

    private void a(com.applovin.impl.c.a aVar, d dVar, boolean z10) {
        com.applovin.impl.c.d dVarAV = aVar.aV();
        if (dVarAV != null) {
            com.applovin.impl.c.m.a(dVarAV.c(), this.f8519c.q());
            a(dVar, dVarAV.a(), z10);
        }
    }

    private void b() {
        this.f8519c.l();
    }

    private void c() {
        this.f8519c.k();
    }

    public b a() {
        return this.f8519c;
    }

    /* JADX WARN: Code duplicated, block: B:138:0x0294 A[PHI: r6
  0x0294: PHI (r6v3 com.applovin.impl.c.a) = (r6v2 com.applovin.impl.c.a), (r6v4 com.applovin.impl.c.a), (r6v5 com.applovin.impl.c.a) binds: [B:137:0x0292, B:85:0x016b, B:71:0x0136] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:97:0x0198  */
    public boolean a(WebView webView, String str) {
        com.applovin.impl.c.a aVar;
        if (this.f8519c == null) {
            return true;
        }
        if (com.applovin.impl.sdk.y.a()) {
            this.f8518b.c("AdWebView", "Processing click on ad URL \"" + str + "\"");
        }
        if (str != null && (webView instanceof d)) {
            Uri uri = Uri.parse(str);
            d dVar = (d) webView;
            String scheme = uri.getScheme();
            String host = uri.getHost();
            String path = uri.getPath();
            com.applovin.impl.sdk.ad.e eVarP = this.f8519c.p();
            if (eVarP == null) {
                if (com.applovin.impl.sdk.y.a()) {
                    this.f8518b.e("AdWebView", "Unable to process click, ad not found!");
                }
                return true;
            }
            boolean z10 = !dVar.getLastClickLocation().equals(new PointF());
            boolean z11 = !eVarP.N() || z10;
            if ("applovin".equals(scheme) && AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN.equals(host)) {
                if ("/adservice/close_ad".equals(path)) {
                    String str2 = this.f8517a.ay().getExtraParameters().get(AppLovinSdkExtraParameterKey.CLOSE_URL_AD_VALUE);
                    if (StringUtils.isValidString(str2) && Boolean.parseBoolean(str2)) {
                        eVarP.setMaxAdValue("close_url", str);
                    }
                    b();
                } else if ("/adservice/expand_ad".equals(path)) {
                    if (eVarP.M() && !z10) {
                        if (com.applovin.impl.sdk.y.a()) {
                            this.f8518b.e("AdWebView", "Skipping expand command without user interaction");
                        }
                        return true;
                    }
                    a(dVar.getAndClearLastClickLocation());
                } else if ("/adservice/contract_ad".equals(path)) {
                    c();
                } else {
                    if ("/adservice/no_op".equals(path)) {
                        return true;
                    }
                    if ("/adservice/load_url".equals(path)) {
                        if (eVarP.M() && !z10) {
                            if (com.applovin.impl.sdk.y.a()) {
                                this.f8518b.e("AdWebView", "Skipping URL load command without user interaction");
                            }
                            return true;
                        }
                        com.applovin.impl.sdk.utils.u.a(uri, this.f8519c, this.f8517a);
                    } else if ("/adservice/track_click_now".equals(path)) {
                        if (eVarP.M() && !z10) {
                            if (com.applovin.impl.sdk.y.a()) {
                                this.f8518b.e("AdWebView", "Skipping click tracking command without user interaction");
                            }
                            return true;
                        }
                        if (eVarP instanceof com.applovin.impl.c.a) {
                            aVar = (com.applovin.impl.c.a) eVarP;
                            a(aVar, dVar);
                        } else {
                            a(dVar, Uri.parse("/adservice/track_click_now"));
                        }
                    } else if ("/adservice/deeplink".equals(path)) {
                        if (eVarP.M() && !z10) {
                            if (com.applovin.impl.sdk.y.a()) {
                                this.f8518b.e("AdWebView", "Skipping deep link plus command without user interaction");
                            }
                            return true;
                        }
                        if (eVarP instanceof com.applovin.impl.c.a) {
                            aVar = (com.applovin.impl.c.a) eVarP;
                            if (aVar.aY()) {
                                a(aVar, dVar);
                            }
                        }
                        a(dVar, uri);
                    } else if ("/adservice/postback".equals(path)) {
                        com.applovin.impl.sdk.utils.u.a(uri, eVarP, this.f8517a);
                    } else if ("/adservice/install".equals(path)) {
                        if (eVarP instanceof com.applovin.impl.c.a) {
                            com.applovin.impl.c.a aVar2 = (com.applovin.impl.c.a) eVarP;
                            if (aVar2.aY()) {
                                a(aVar2, dVar, true);
                            } else {
                                a(dVar, eVarP.j(), true);
                            }
                        } else {
                            a(dVar, eVarP.j(), true);
                        }
                    } else if (this.f8519c.h() == null) {
                        if (com.applovin.impl.sdk.y.a()) {
                            this.f8518b.d("AdWebView", "Unknown URL: " + str);
                        }
                        if (com.applovin.impl.sdk.y.a()) {
                            this.f8518b.d("AdWebView", "Path: " + path);
                        }
                    } else if ("/video_began".equals(path)) {
                        this.f8519c.h().a(com.applovin.impl.sdk.utils.w.a(uri.getQueryParameter("duration"), 0.0d));
                    } else if ("/video_completed".equals(path)) {
                        this.f8519c.h().g_();
                    } else if ("/video_progress".equals(path)) {
                        this.f8519c.h().b(com.applovin.impl.sdk.utils.w.a(uri.getQueryParameter("percent_viewed"), 0.0d));
                    } else if ("/video_waiting".equals(path)) {
                        this.f8519c.h().h_();
                    } else if ("/video_resumed".equals(path)) {
                        this.f8519c.h().c();
                    }
                }
            } else if (z11) {
                List<String> listAF = eVarP.aF();
                List<String> listAG = eVarP.aG();
                if ((listAF.isEmpty() || listAF.contains(scheme)) && (listAG.isEmpty() || listAG.contains(host))) {
                    if (eVarP instanceof com.applovin.impl.c.a) {
                        aVar = (com.applovin.impl.c.a) eVarP;
                        if (aVar.aY()) {
                            a(aVar, dVar);
                        }
                    }
                    a(dVar, uri);
                } else if (com.applovin.impl.sdk.y.a()) {
                    this.f8518b.e("AdWebView", "URL is not whitelisted - bypassing click");
                }
            }
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        if (com.applovin.impl.sdk.y.a()) {
            this.f8518b.c("AdWebView", "Loaded resource: " + str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        b bVar = this.f8519c;
        if (bVar != null) {
            bVar.a(webView);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
        b bVar = this.f8519c;
        if (bVar != null) {
            com.applovin.impl.sdk.ad.e eVarP = bVar.p();
            String str3 = "Received error with error code: " + i10 + " with description \\'" + str + "\\' for URL: " + str2;
            if (eVarP != null) {
                this.f8517a.T().a(eVarP).a(com.applovin.impl.sdk.d.b.f10448y, str3).a();
            }
            if (com.applovin.impl.sdk.y.a()) {
                this.f8518b.e("AdWebView", str3 + " for ad: " + eVarP);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(23)
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(21)
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        b bVar = this.f8519c;
        if (bVar != null) {
            com.applovin.impl.sdk.ad.e eVarP = bVar.p();
            this.f8517a.T().a(eVarP).a(com.applovin.impl.sdk.d.b.f10449z).a();
            if (com.applovin.impl.sdk.y.a()) {
                this.f8518b.e("AdWebView", "Received HTTP error: " + webResourceResponse + "for url: " + webResourceRequest.getUrl() + " and ad: " + eVarP);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        b bVar = this.f8519c;
        if (bVar != null) {
            com.applovin.impl.sdk.ad.e eVarP = bVar.p();
            String str = "Received SSL error: " + sslError;
            this.f8517a.T().a(eVarP).a(com.applovin.impl.sdk.d.b.B, str).a();
            if (com.applovin.impl.sdk.y.a()) {
                this.f8518b.e("AdWebView", str + " for ad: " + eVarP);
            }
        }
    }

    @Override // com.applovin.impl.sdk.ab, android.webkit.WebViewClient
    @TargetApi(26)
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.render_process_gone"), null);
        if (this.f8519c == null) {
            return true;
        }
        StringBuilder sbA = defpackage.a.a("Render process gone for ad: ");
        sbA.append(this.f8519c.p());
        sbA.append(". Process did crash: ");
        sbA.append(renderProcessGoneDetail.didCrash());
        com.applovin.impl.sdk.y.j("AdWebView", sbA.toString());
        com.applovin.impl.sdk.ad.e eVarP = this.f8519c.p();
        if (eVarP != null) {
            this.f8517a.T().a(eVarP).a(com.applovin.impl.sdk.d.b.A).a();
            HashMap map = new HashMap();
            map.put("top_main_method", "onRenderProcessGone");
            StringBuilder sbA2 = defpackage.a.a("size=");
            sbA2.append(eVarP.getSize());
            sbA2.append(",ad_id=");
            sbA2.append(eVarP.getAdIdNumber());
            sbA2.append(",dsp=");
            sbA2.append(eVarP.getDspName());
            map.put("details", sbA2.toString());
            if (com.applovin.impl.sdk.utils.h.g()) {
                map.put("source", renderProcessGoneDetail.didCrash() ? AppMeasurement.CRASH_ORIGIN : "non_crash");
            }
            this.f8517a.ag().a(com.applovin.impl.sdk.s.a.WEB_VIEW_ERROR, map);
        }
        if (((Boolean) this.f8517a.a(com.applovin.impl.sdk.c.b.gg)).booleanValue()) {
            if (renderProcessGoneDetail.didCrash() && ((Boolean) this.f8517a.a(com.applovin.impl.sdk.c.b.gj)).booleanValue()) {
                throw new RuntimeException(i.f.a("Render process crashed. This is likely caused by a crash in an AppLovin ad with ID: ", eVarP != null ? String.valueOf(eVarP.getAdIdNumber()) : "null"));
            }
            if (webView != null && webView.equals(this.f8519c.s())) {
                this.f8519c.f();
                AppLovinAdSize appLovinAdSizeB = this.f8519c.b();
                if (com.applovin.impl.sdk.utils.w.a(appLovinAdSizeB)) {
                    this.f8519c.a(appLovinAdSizeB);
                    this.f8519c.e();
                }
            }
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(24)
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url = webResourceRequest.getUrl();
        if (url != null) {
            return a(webView, url.toString());
        }
        if (!com.applovin.impl.sdk.y.a()) {
            return false;
        }
        this.f8518b.e("AdWebView", "No url found for request");
        return false;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return a(webView, str);
    }
}
