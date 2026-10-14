package com.applovin.adview;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.window.OnBackInvokedCallback;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.applovin.impl.adview.activity.b.e;
import com.applovin.impl.adview.l;
import com.applovin.impl.adview.q;
import com.applovin.impl.sdk.c.b;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.h;
import com.applovin.impl.sdk.utils.w;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkSettings;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes.dex */
public class AppLovinFullscreenActivity extends Activity implements l {

    @SuppressLint({"StaticFieldLeak"})
    public static q parentInterstitialWrapper;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private o f3890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.applovin.impl.adview.activity.b.a f3891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f3892c = new AtomicBoolean(true);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.applovin.impl.adview.activity.a f3893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f3894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f3895f;

    public static class a implements OnBackInvokedCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Runnable f3898a;

        public a(Runnable runnable) {
            this.f3898a = runnable;
        }

        @Override // android.window.OnBackInvokedCallback
        public void onBackInvoked() {
            this.f3898a.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        com.applovin.impl.adview.activity.b.a aVar = this.f3891b;
        if (aVar != null) {
            aVar.l();
        }
        if (w.d(getApplicationContext())) {
            super.onBackPressed();
        }
    }

    @Override // com.applovin.impl.adview.l
    public void dismiss() {
        if (h.l() && this.f3894e != null) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f3894e);
            this.f3894e = null;
        }
        com.applovin.impl.adview.activity.b.a aVar = this.f3891b;
        if (aVar != null) {
            aVar.h();
        } else {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.applovin.impl.adview.activity.b.a aVar = this.f3891b;
        if (aVar != null) {
            aVar.a(configuration);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null && parentInterstitialWrapper == null) {
            if (bundle.getBoolean("com.applovin.dismiss_on_restore", false)) {
                y.h("AppLovinFullscreenActivity", "Dismissing ad. Activity was destroyed while in background.");
                dismiss();
                return;
            }
            y.f("AppLovinFullscreenActivity", "Activity was destroyed while in background.");
        }
        try {
            requestWindowFeature(1);
        } catch (Throwable th) {
            y.c("AppLovinFullscreenActivity", "Failed to request window feature", th);
        }
        getWindow().setFlags(1024, 1024);
        getWindow().addFlags(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
        getWindow().addFlags(128);
        View viewFindViewById = findViewById(R.id.content);
        viewFindViewById.setBackgroundColor(-16777216);
        String stringExtra = getIntent().getStringExtra("com.applovin.interstitial.sdk_key");
        if (TextUtils.isEmpty(stringExtra)) {
            q qVar = parentInterstitialWrapper;
            if (qVar != null && qVar.f() != null) {
                q.a(parentInterstitialWrapper.f(), parentInterstitialWrapper.c(), "Empty SDK key", null, this);
            }
            finish();
            return;
        }
        o oVarA = AppLovinSdk.getInstance(stringExtra, new AppLovinSdkSettings(this), this).a();
        this.f3890a = oVarA;
        this.f3895f = ((Boolean) oVarA.a(b.f10359db)).booleanValue();
        if (((Boolean) this.f3890a.a(b.f10360dc)).booleanValue()) {
            viewFindViewById.setFitsSystemWindows(true);
        }
        com.applovin.impl.sdk.utils.b.a(this.f3895f, this);
        if (h.l() && ((Boolean) this.f3890a.a(b.gu)).booleanValue()) {
            this.f3894e = new a(new Runnable() { // from class: com.applovin.adview.AppLovinFullscreenActivity.1
                @Override // java.lang.Runnable
                public void run() {
                    AppLovinFullscreenActivity.this.a();
                }
            });
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f3894e);
        }
        q qVar2 = parentInterstitialWrapper;
        if (qVar2 != null) {
            com.applovin.impl.adview.activity.b.a.a(qVar2.f(), parentInterstitialWrapper.e(), parentInterstitialWrapper.c(), parentInterstitialWrapper.d(), parentInterstitialWrapper.b(), this.f3890a, this, new com.applovin.impl.adview.activity.b.a.InterfaceC0110a() { // from class: com.applovin.adview.AppLovinFullscreenActivity.2
                @Override // com.applovin.impl.adview.activity.b.a.InterfaceC0110a
                public void a(com.applovin.impl.adview.activity.b.a aVar) {
                    AppLovinFullscreenActivity.this.f3891b = aVar;
                    aVar.d();
                }

                @Override // com.applovin.impl.adview.activity.b.a.InterfaceC0110a
                public void a(String str, Throwable th2) {
                    q.a(AppLovinFullscreenActivity.parentInterstitialWrapper.f(), AppLovinFullscreenActivity.parentInterstitialWrapper.c(), str, th2, AppLovinFullscreenActivity.this);
                }
            });
            return;
        }
        Intent intent = new Intent(this, (Class<?>) FullscreenAdService.class);
        com.applovin.impl.adview.activity.a aVar = new com.applovin.impl.adview.activity.a(this, this.f3890a);
        this.f3893d = aVar;
        bindService(intent, aVar, 1);
        if (h.h()) {
            String str = this.f3890a.ay().getExtraParameters().get(AppLovinSdkExtraParameterKey.DISABLE_SET_DATA_DIRECTORY_SUFFIX);
            if (StringUtils.isValidString(str) && Boolean.parseBoolean(str)) {
                return;
            }
            try {
                WebView.setDataDirectorySuffix(String.valueOf(Process.myPid()));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        parentInterstitialWrapper = null;
        com.applovin.impl.adview.activity.a aVar = this.f3893d;
        if (aVar != null) {
            try {
                unbindService(aVar);
            } catch (Throwable unused) {
            }
        }
        com.applovin.impl.adview.activity.b.a aVar2 = this.f3891b;
        if (aVar2 != null) {
            if (!aVar2.i()) {
                this.f3891b.h();
            }
            this.f3891b.k();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        com.applovin.impl.adview.activity.b.a aVar = this.f3891b;
        if (aVar != null) {
            aVar.a(i10, keyEvent);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        com.applovin.impl.adview.activity.b.a aVar = this.f3891b;
        if (aVar != null) {
            aVar.g();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        com.applovin.impl.adview.activity.b.a aVar;
        try {
            super.onResume();
            if (this.f3892c.get() || (aVar = this.f3891b) == null) {
                return;
            }
            aVar.f();
        } catch (IllegalArgumentException e10) {
            this.f3890a.F();
            if (y.a()) {
                this.f3890a.F().b("AppLovinFullscreenActivity", "Error was encountered in onResume().", e10);
            }
            this.f3890a.ag().a("AppLovinFullscreenActivity", "onResume", e10);
            dismiss();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        o oVar = this.f3890a;
        if (oVar != null) {
            bundle.putBoolean("com.applovin.dismiss_on_restore", ((Boolean) oVar.a(b.gp)).booleanValue());
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        com.applovin.impl.adview.activity.b.a aVar = this.f3891b;
        if (aVar != null) {
            aVar.j();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        if (this.f3891b != null) {
            if (!this.f3892c.getAndSet(false) || (this.f3891b instanceof e)) {
                this.f3891b.c(z10);
            }
            if (z10) {
                com.applovin.impl.sdk.utils.b.a(this.f3895f, this);
            }
        }
        super.onWindowFocusChanged(z10);
    }

    public void setPresenter(com.applovin.impl.adview.activity.b.a aVar) {
        this.f3891b = aVar;
    }
}
