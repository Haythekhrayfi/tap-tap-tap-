package com.applovin.sdk;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.adview.a0;
import com.applovin.impl.sdk.ab;
import com.applovin.impl.sdk.c.b;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.w;
import com.applovin.impl.sdk.y;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class AppLovinWebViewActivity extends Activity {
    public static final String EVENT_DISMISSED_VIA_BACK_BUTTON = "dismissed_via_back_button";
    public static final String INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON = "immersive_mode_on";
    public static final String INTENT_EXTRA_KEY_LOAD_URL = "load_url";
    public static final String INTENT_EXTRA_KEY_SDK_KEY = "sdk_key";
    public static final String URI_PATH_WEBVIEW_EVENT = "webview_event";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f11601a = new AtomicBoolean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f11602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WebView f11603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private EventListener f11604d;

    public interface EventListener {
        void onReceivedEvent(String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final o oVar) {
        WebView webViewA = w.a(this, "WebView Activity");
        this.f11603c = webViewA;
        if (webViewA == null) {
            finish();
            return;
        }
        setContentView(webViewA);
        WebSettings settings = this.f11603c.getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        this.f11603c.setVerticalScrollBarEnabled(true);
        this.f11603c.setHorizontalScrollBarEnabled(true);
        this.f11603c.setScrollBarStyle(33554432);
        this.f11603c.setWebViewClient(new ab() { // from class: com.applovin.sdk.AppLovinWebViewActivity.1
            @Override // com.applovin.impl.sdk.ab, android.webkit.WebViewClient
            public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                if (AppLovinWebViewActivity.this.f11603c == webView) {
                    AppLovinWebViewActivity.this.f11603c.destroy();
                    AppLovinWebViewActivity.this.f11603c = null;
                    AppLovinWebViewActivity.this.runOnUiThread(new Runnable() { // from class: com.applovin.sdk.AppLovinWebViewActivity.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (!((Boolean) oVar.a(b.gh)).booleanValue() || !AppLovinWebViewActivity.this.f11601a.compareAndSet(false, true)) {
                                AppLovinWebViewActivity.this.finish();
                                return;
                            }
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            AppLovinWebViewActivity.this.a(oVar);
                            if (StringUtils.isValidString(AppLovinWebViewActivity.this.f11602b)) {
                                AppLovinWebViewActivity.this.f11603c.loadUrl(AppLovinWebViewActivity.this.f11602b);
                            }
                        }
                    });
                }
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                Uri uri = Uri.parse(str);
                String scheme = uri.getScheme();
                String host = uri.getHost();
                String path = uri.getPath();
                oVar.F();
                if (y.a()) {
                    a0.a("Handling url load: ", str, oVar.F(), "AppLovinWebViewActivity");
                }
                if (!"applovin".equalsIgnoreCase(scheme) || !AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN.equalsIgnoreCase(host) || AppLovinWebViewActivity.this.f11604d == null) {
                    return super.shouldOverrideUrlLoading(webView, str);
                }
                if (!path.endsWith(AppLovinWebViewActivity.URI_PATH_WEBVIEW_EVENT)) {
                    return true;
                }
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                String str2 = queryParameterNames.isEmpty() ? "" : (String) queryParameterNames.toArray()[0];
                if (!StringUtils.isValidString(str2)) {
                    oVar.F();
                    if (!y.a()) {
                        return true;
                    }
                    oVar.F().e("AppLovinWebViewActivity", "Failed to parse WebView event parameter");
                    return true;
                }
                String queryParameter = uri.getQueryParameter(str2);
                oVar.F();
                if (y.a()) {
                    oVar.F().b("AppLovinWebViewActivity", androidx.fragment.app.w.a("Parsed WebView event parameter name: ", str2, " and value: ", queryParameter));
                }
                AppLovinWebViewActivity.this.f11604d.onReceivedEvent(queryParameter);
                return true;
            }
        });
    }

    public void loadUrl(String str, EventListener eventListener) {
        this.f11604d = eventListener;
        this.f11602b = str;
        this.f11601a.set(false);
        WebView webView = this.f11603c;
        if (webView != null) {
            webView.loadUrl(str);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        EventListener eventListener = this.f11604d;
        if (eventListener != null) {
            eventListener.onReceivedEvent(EVENT_DISMISSED_VIA_BACK_BUTTON);
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra(INTENT_EXTRA_KEY_SDK_KEY);
        if (TextUtils.isEmpty(stringExtra)) {
            y.j("AppLovinWebViewActivity", "No SDK key specified");
            finish();
            return;
        }
        a(AppLovinSdk.getInstance(stringExtra, new AppLovinSdkSettings(getApplicationContext()), getApplicationContext()).a());
        if (getIntent().getBooleanExtra(INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON, false)) {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        }
        String stringExtra2 = getIntent().getStringExtra(INTENT_EXTRA_KEY_LOAD_URL);
        this.f11602b = stringExtra2;
        if (StringUtils.isValidString(stringExtra2)) {
            this.f11603c.loadUrl(this.f11602b);
        }
    }
}
