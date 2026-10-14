package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.webkit.WebSettings;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class kp0 extends oe implements zz, kq0.a, gh1.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f22480j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final gh1 f22481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w11 f22482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final kq0 f22483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ba1 f22484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b00 f22485f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a00 f22486g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f22487h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f22488i;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            kp0.this.h();
        }
    }

    public kp0(Context context) {
        super(context.getApplicationContext());
        this.f22481b = new gh1();
        this.f22482c = new w11();
        this.f22484e = r8.a();
        this.f22483d = kq0.a();
        b(context);
        if (f22480j) {
            return;
        }
        a(getContext());
        f22480j = true;
    }

    private static void a(Context context) {
    }

    public void a() {
        this.f22482c.a(new a());
    }

    public void a(int i10) {
        a00 a00Var = this.f22486g;
        if (a00Var != null) {
            ((w7) a00Var).a(i10);
        }
    }

    @Override // com.yandex.mobile.ads.impl.zz
    public void a(Context context, String str) {
        b00 b00Var = this.f22485f;
        if (b00Var != null) {
            b00Var.a(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    @Override // com.yandex.mobile.ads.impl.kq0.a
    public final void a(Intent intent) {
        boolean z10;
        if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            z10 = false;
        } else {
            Objects.requireNonNull(this.f22481b);
            if (gh1.a(this) && this.f22483d.b(getContext())) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (this.f22487h != z10) {
            this.f22487h = z10;
            b00 b00Var = this.f22485f;
            if (b00Var != null) {
                b00Var.a(z10);
            }
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void b(Context context) {
        setBackgroundColor(0);
        setVisibility(4);
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        setScrollBarStyle(0);
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(false);
        settings.setBuiltInZoomControls(false);
        settings.setMinimumFontSize(1);
        settings.setMinimumLogicalFontSize(1);
        if (u6.a(21)) {
            settings.setMixedContentMode(0);
        }
        settings.setMediaPlaybackRequiresUserGesture(false);
        WebSettings settings2 = getSettings();
        nz0 nz0VarA = i01.b().a(context);
        if (nz0VarA != null && nz0VarA.A()) {
            settings2.setUserAgentString(this.f22484e.a(context));
        }
        setWebViewClient(new yz(this));
        setWebChromeClient(new tz());
    }

    @Override // com.yandex.mobile.ads.impl.gh1.a
    public final boolean b() {
        return this.f22488i;
    }

    @Override // com.yandex.mobile.ads.impl.oe
    public String c() {
        StringBuilder sbA = android.support.v4.media.c.a("", "<style type='text/css'> \n  * { \n      -webkit-tap-highlight-color: rgba(0, 0, 0, 0) !important; \n      -webkit-focus-ring-color: rgba(0, 0, 0, 0) !important; \n      outline: none !important; \n    } \n</style> \n");
        sbA.append(wi1.f26292b);
        return sbA.toString();
    }

    @Override // com.yandex.mobile.ads.impl.oe
    public void e() {
        this.f22485f = null;
        super.e();
    }

    public abstract void h();

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f22488i = true;
        this.f22483d.a(getContext(), this);
        Objects.requireNonNull(this.f22481b);
        boolean zA = gh1.a(this);
        if (this.f22487h != zA) {
            this.f22487h = zA;
            b00 b00Var = this.f22485f;
            if (b00Var != null) {
                b00Var.a(zA);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f22488i = false;
        Objects.requireNonNull(this.f22481b);
        boolean zA = gh1.a(this);
        if (this.f22487h != zA) {
            this.f22487h = zA;
            b00 b00Var = this.f22485f;
            if (b00Var != null) {
                b00Var.a(zA);
            }
        }
        this.f22483d.b(getContext(), this);
        super.onDetachedFromWindow();
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        Objects.requireNonNull(this.f22481b);
        boolean zA = gh1.a(this);
        if (this.f22487h != zA) {
            this.f22487h = zA;
            b00 b00Var = this.f22485f;
            if (b00Var != null) {
                b00Var.a(zA);
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        Objects.requireNonNull(this.f22481b);
        boolean zA = gh1.a(this);
        if (this.f22487h != zA) {
            this.f22487h = zA;
            b00 b00Var = this.f22485f;
            if (b00Var != null) {
                b00Var.a(zA);
            }
        }
    }

    public void setHtmlWebViewErrorListener(a00 a00Var) {
        this.f22486g = a00Var;
    }

    public void setHtmlWebViewListener(b00 b00Var) {
        this.f22485f = b00Var;
    }
}
