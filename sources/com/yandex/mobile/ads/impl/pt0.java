package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.yandex.mobile.ads.appopenad.AppOpenAdLoadListener;
import com.yandex.mobile.ads.common.AdRequestError;

/* JADX INFO: loaded from: classes3.dex */
public final class pt0 implements ww<ha> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f24242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y3 f24243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ga f24244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AppOpenAdLoadListener f24245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private t3 f24246e;

    public /* synthetic */ pt0(Context context, w3 w3Var) {
        this(context, w3Var, new Handler(Looper.getMainLooper()), new y3(context, w3Var), new ga(context));
    }

    public pt0(Context context, w3 w3Var, Handler handler, y3 y3Var, ga gaVar) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(w3Var, "adLoadingPhasesManager");
        fd.j0.i(handler, "handler");
        fd.j0.i(y3Var, "adLoadingResultReporter");
        fd.j0.i(gaVar, "appOpenAdApiControllerFactory");
        this.f24242a = handler;
        this.f24243b = y3Var;
        this.f24244c = gaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(pt0 pt0Var, fa faVar) {
        fd.j0.i(pt0Var, "this$0");
        fd.j0.i(faVar, "$appOpenAdApiController");
        AppOpenAdLoadListener appOpenAdLoadListener = pt0Var.f24245d;
        if (appOpenAdLoadListener != null) {
            appOpenAdLoadListener.onAdLoaded(faVar);
        }
        t3 t3Var = pt0Var.f24246e;
        if (t3Var != null) {
            t3Var.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(t2 t2Var, pt0 pt0Var) {
        fd.j0.i(t2Var, "$error");
        fd.j0.i(pt0Var, "this$0");
        AdRequestError adRequestError = new AdRequestError(t2Var.a(), t2Var.b());
        AppOpenAdLoadListener appOpenAdLoadListener = pt0Var.f24245d;
        if (appOpenAdLoadListener != null) {
            appOpenAdLoadListener.onAdFailedToLoad(adRequestError);
        }
        t3 t3Var = pt0Var.f24246e;
        if (t3Var != null) {
            t3Var.a();
        }
    }

    public final void a(AppOpenAdLoadListener appOpenAdLoadListener) {
        this.f24245d = appOpenAdLoadListener;
    }

    @Override // com.yandex.mobile.ads.impl.ww
    public final void a(ha haVar) {
        fd.j0.i(haVar, "ad");
        this.f24243b.a();
        this.f24242a.post(new do1(this, this.f24244c.a(haVar)));
    }

    public final void a(ja.a aVar) {
        fd.j0.i(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f24246e = aVar;
    }

    @Override // com.yandex.mobile.ads.impl.ww
    public final void a(t2 t2Var) {
        fd.j0.i(t2Var, "error");
        String strB = t2Var.b();
        fd.j0.h(strB, "error.description");
        this.f24243b.a(strB);
        this.f24242a.post(new do1(t2Var, this));
    }
}
