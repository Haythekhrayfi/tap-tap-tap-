package com.applovin.impl.sdk;

import android.app.Activity;
import android.content.Intent;
import android.webkit.WebView;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinPrivacySettings;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinUserService;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class n implements m.a, AppLovinWebViewActivity.EventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicBoolean f10748a = new AtomicBoolean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static WeakReference<AppLovinWebViewActivity> f10749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o f10750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final y f10751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AppLovinUserService.OnConsentDialogDismissListener f10752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private m f10753f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private WeakReference<Activity> f10754g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.applovin.impl.sdk.utils.a f10755h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private AtomicBoolean f10756i = new AtomicBoolean();

    public n(o oVar) {
        this.f10754g = new WeakReference<>(null);
        this.f10750c = oVar;
        this.f10751d = oVar.F();
        if (oVar.B() != null) {
            this.f10754g = new WeakReference<>(oVar.B());
        }
        o.a(o.au()).a(new com.applovin.impl.sdk.utils.a() { // from class: com.applovin.impl.sdk.n.1
            @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                n.this.f10754g = new WeakReference(activity);
            }
        });
        this.f10753f = new m(this, oVar);
    }

    private void a(boolean z10, long j10) {
        g();
        if (z10) {
            a(j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(o oVar) {
        String str;
        if (d()) {
            str = "Consent dialog already showing";
        } else {
            if (com.applovin.impl.sdk.utils.i.a(o.au())) {
                if (!((Boolean) oVar.a(com.applovin.impl.sdk.c.b.aH)).booleanValue()) {
                    if (y.a()) {
                        this.f10751d.e("ConsentDialogManager", "Blocked publisher from showing consent dialog");
                    }
                    return false;
                }
                if (StringUtils.isValidString((String) oVar.a(com.applovin.impl.sdk.c.b.aI))) {
                    return true;
                }
                if (y.a()) {
                    this.f10751d.e("ConsentDialogManager", "AdServer returned empty consent dialog URL");
                }
                return false;
            }
            str = "No internet available, skip showing of consent dialog";
        }
        y.j("AppLovinSdk", str);
        return false;
    }

    private void g() {
        this.f10750c.E().b(this.f10755h);
        if (d()) {
            AppLovinWebViewActivity appLovinWebViewActivity = f10749b.get();
            f10749b = null;
            if (appLovinWebViewActivity != null) {
                appLovinWebViewActivity.finish();
                AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener = this.f10752e;
                if (onConsentDialogDismissListener != null) {
                    onConsentDialogDismissListener.onDismiss();
                    this.f10752e = null;
                }
            }
        }
    }

    @Override // com.applovin.impl.sdk.m.a
    public void a() {
        final Activity activity = this.f10754g.get();
        if (activity != null) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.n.5
                @Override // java.lang.Runnable
                public void run() {
                    n.this.a(activity, (AppLovinUserService.OnConsentDialogDismissListener) null);
                }
            }, ((Long) this.f10750c.a(com.applovin.impl.sdk.c.b.aK)).longValue());
        }
    }

    public void a(final long j10) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.n.4
            @Override // java.lang.Runnable
            public void run() {
                y unused = n.this.f10751d;
                if (y.a()) {
                    n.this.f10751d.b("ConsentDialogManager", "Scheduling repeating consent alert");
                }
                n.this.f10753f.a(j10, n.this.f10750c, n.this);
            }
        });
    }

    public void a(final Activity activity, final AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener) {
        activity.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.n.3
            @Override // java.lang.Runnable
            public void run() {
                n nVar = n.this;
                if (!nVar.a(nVar.f10750c) || n.f10748a.getAndSet(true)) {
                    AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener2 = onConsentDialogDismissListener;
                    if (onConsentDialogDismissListener2 != null) {
                        onConsentDialogDismissListener2.onDismiss();
                        return;
                    }
                    return;
                }
                n.this.f10754g = new WeakReference(activity);
                n.this.f10752e = onConsentDialogDismissListener;
                n.this.f10755h = new com.applovin.impl.sdk.utils.a() { // from class: com.applovin.impl.sdk.n.3.1
                    @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityStarted(Activity activity2) {
                        if (activity2 instanceof AppLovinWebViewActivity) {
                            if (!n.this.d() || n.f10749b.get() != activity2) {
                                AppLovinWebViewActivity appLovinWebViewActivity = (AppLovinWebViewActivity) activity2;
                                WeakReference unused = n.f10749b = new WeakReference(appLovinWebViewActivity);
                                appLovinWebViewActivity.loadUrl((String) n.this.f10750c.a(com.applovin.impl.sdk.c.b.aI), n.this);
                            }
                            n.f10748a.set(false);
                        }
                    }
                };
                n.this.f10750c.E().a(n.this.f10755h);
                Intent intent = new Intent(activity, (Class<?>) AppLovinWebViewActivity.class);
                intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, n.this.f10750c.ax());
                intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON, (Serializable) n.this.f10750c.a(com.applovin.impl.sdk.c.b.aJ));
                activity.startActivity(intent);
            }
        });
    }

    @Override // com.applovin.impl.sdk.m.a
    public void b() {
    }

    public void c() {
        if (this.f10756i.getAndSet(true)) {
            return;
        }
        final String str = (String) this.f10750c.a(com.applovin.impl.sdk.c.b.aI);
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.n.2
            @Override // java.lang.Runnable
            public void run() {
                o unused = n.this.f10750c;
                WebView webViewA = com.applovin.impl.sdk.utils.w.a(o.au(), "preloading consent dialog", true);
                if (webViewA == null) {
                    return;
                }
                webViewA.loadUrl(str);
            }
        });
    }

    public boolean d() {
        WeakReference<AppLovinWebViewActivity> weakReference = f10749b;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    @Override // com.applovin.sdk.AppLovinWebViewActivity.EventListener
    public void onReceivedEvent(String str) {
        boolean zBooleanValue;
        o oVar;
        com.applovin.impl.sdk.c.b<Long> bVar;
        if ("accepted".equalsIgnoreCase(str)) {
            AppLovinPrivacySettings.setHasUserConsent(true, o.au());
            g();
            return;
        }
        if ("rejected".equalsIgnoreCase(str)) {
            AppLovinPrivacySettings.setHasUserConsent(false, o.au());
            zBooleanValue = ((Boolean) this.f10750c.a(com.applovin.impl.sdk.c.b.aL)).booleanValue();
            oVar = this.f10750c;
            bVar = com.applovin.impl.sdk.c.b.aQ;
        } else if ("closed".equalsIgnoreCase(str)) {
            zBooleanValue = ((Boolean) this.f10750c.a(com.applovin.impl.sdk.c.b.aM)).booleanValue();
            oVar = this.f10750c;
            bVar = com.applovin.impl.sdk.c.b.aR;
        } else {
            if (!AppLovinWebViewActivity.EVENT_DISMISSED_VIA_BACK_BUTTON.equalsIgnoreCase(str)) {
                return;
            }
            zBooleanValue = ((Boolean) this.f10750c.a(com.applovin.impl.sdk.c.b.aN)).booleanValue();
            oVar = this.f10750c;
            bVar = com.applovin.impl.sdk.c.b.aS;
        }
        a(zBooleanValue, ((Long) oVar.a(bVar)).longValue());
    }
}
