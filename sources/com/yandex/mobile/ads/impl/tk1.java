package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewTreeObserver;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class tk1 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.yandex.mobile.ads.banner.g f25384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k2 f25385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.yandex.mobile.ads.banner.c f25386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final s90 f25387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w60 f25388e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a f25389f;

    public static final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.yandex.mobile.ads.banner.g f25390b;

        public a(com.yandex.mobile.ads.banner.g gVar) {
            fd.j0.i(gVar, "adView");
            this.f25390b = gVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            sg1.a(this.f25390b, false);
        }
    }

    public /* synthetic */ tk1(Context context, com.yandex.mobile.ads.banner.g gVar, k2 k2Var, com.yandex.mobile.ads.banner.c cVar) {
        this(context, gVar, k2Var, cVar, new s90(), new w60(context), new a(gVar));
    }

    public tk1(Context context, com.yandex.mobile.ads.banner.g gVar, k2 k2Var, com.yandex.mobile.ads.banner.c cVar, s90 s90Var, w60 w60Var, a aVar) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(gVar, "adView");
        fd.j0.i(k2Var, "adConfiguration");
        fd.j0.i(cVar, "contentController");
        fd.j0.i(s90Var, "mainThreadHandler");
        fd.j0.i(w60Var, "sizeInfoController");
        fd.j0.i(aVar, "removePreviousBannerRunnable");
        this.f25384a = gVar;
        this.f25385b = k2Var;
        this.f25386c = cVar;
        this.f25387d = s90Var;
        this.f25388e = w60Var;
        this.f25389f = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        x60.d("onPreDraw(), clazz = " + this, new Object[0]);
        this.f25386c.l();
        this.f25388e.a(this.f25385b, this.f25384a);
        this.f25387d.a(this.f25389f);
        return true;
    }
}
