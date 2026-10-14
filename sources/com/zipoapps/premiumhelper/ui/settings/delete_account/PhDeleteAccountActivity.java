package com.zipoapps.premiumhelper.ui.settings.delete_account;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ImagesContract;
import d0.d;
import fd.j0;
import vc.g;

/* JADX INFO: loaded from: classes3.dex */
public final class PhDeleteAccountActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f28393f = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WebView f28394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WebViewClient f28395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f28396e = new Handler(Looper.getMainLooper());

    public static final class a {
        public a() {
        }

        public a(g gVar) {
        }
    }

    public static final class b extends c.a<String, Integer> {
        @Override // c.a
        public Intent a(Context context, String str) {
            String str2 = str;
            j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            j0.i(str2, ImagesContract.URL);
            Intent intent = new Intent(context, (Class<?>) PhDeleteAccountActivity.class);
            intent.putExtra("DELETE_ACCOUNT_URL", str2);
            return intent;
        }

        @Override // c.a
        public Integer c(int i10, Intent intent) {
            return Integer.valueOf(i10);
        }
    }

    public static final class c extends androidx.activity.result.b<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.activity.result.b<String> f28397a;

        public c(androidx.activity.result.b<String> bVar) {
            j0.i(bVar, "sourceLauncher");
            this.f28397a = bVar;
        }

        @Override // androidx.activity.result.b
        public void a(String str) {
            String str2 = str;
            j0.i(str2, "deleteAccountUrl");
            b(str2, null);
        }

        @Override // androidx.activity.result.b
        public void b(String str, d dVar) {
            String str2 = str;
            j0.i(str2, "deleteAccountUrl");
            this.f28397a.b(str2, dVar);
        }

        @Override // androidx.activity.result.b
        public void c() {
            this.f28397a.c();
        }
    }

    @Override // androidx.fragment.app.n, androidx.activity.ComponentActivity, d0.l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f28395d = new cb.a(this);
        WebView webView = new WebView(this);
        this.f28394c = webView;
        WebViewClient webViewClient = this.f28395d;
        if (webViewClient == null) {
            j0.r("webClient");
            throw null;
        }
        webView.setWebViewClient(webViewClient);
        WebView webView2 = this.f28394c;
        if (webView2 == null) {
            j0.r("webView");
            throw null;
        }
        webView2.getSettings().setJavaScriptEnabled(true);
        WebView webView3 = this.f28394c;
        if (webView3 == null) {
            j0.r("webView");
            throw null;
        }
        setContentView(webView3);
        getOnBackPressedDispatcher().a(this, new cb.b(this));
        String stringExtra = getIntent().getStringExtra("DELETE_ACCOUNT_URL");
        if (stringExtra == null) {
            finish();
            return;
        }
        WebView webView4 = this.f28394c;
        if (webView4 != null) {
            webView4.loadUrl(stringExtra);
        } else {
            j0.r("webView");
            throw null;
        }
    }
}
