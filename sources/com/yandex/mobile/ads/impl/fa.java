package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.appopenad.AppOpenAd;
import com.yandex.mobile.ads.appopenad.AppOpenAdEventListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class fa implements AppOpenAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ha f20584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qt0 f20585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t90 f20586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r90 f20587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f20588e;

    public /* synthetic */ fa(Context context, ha haVar) {
        this(context, haVar, new qt0(), new t90(context), new r90());
    }

    public fa(Context context, ha haVar, qt0 qt0Var, t90 t90Var, r90 r90Var) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(haVar, "appOpenAdContentController");
        fd.j0.i(qt0Var, "proxyAppOpenAdShowListener");
        fd.j0.i(t90Var, "mainThreadUsageValidator");
        fd.j0.i(r90Var, "mainThreadExecutor");
        this.f20584a = haVar;
        this.f20585b = qt0Var;
        this.f20586c = t90Var;
        this.f20587d = r90Var;
        this.f20588e = new AtomicBoolean(false);
        haVar.a(qt0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(fa faVar) {
        fd.j0.i(faVar, "this$0");
        if (!faVar.f20588e.getAndSet(true)) {
            faVar.f20584a.q();
            return;
        }
        qt0 qt0Var = faVar.f20585b;
        k11 k11Var = m2.f22884a;
        fd.j0.h(k11Var, "FULLSCREEN_AD_WAS_ALREADY_PRESENTED");
        qt0Var.a(k11Var);
    }

    @Override // com.yandex.mobile.ads.appopenad.AppOpenAd
    public final void setAdEventListener(AppOpenAdEventListener appOpenAdEventListener) {
        this.f20586c.a();
        this.f20585b.a(appOpenAdEventListener);
    }

    @Override // com.yandex.mobile.ads.appopenad.AppOpenAd
    public final void show(Activity activity) {
        fd.j0.i(activity, "activity");
        this.f20586c.a();
        this.f20587d.a(new pp1(this));
    }
}
