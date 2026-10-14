package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class wd1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final eu0 f26259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bt0 f26260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wa1<T> f26261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final jh1<T> f26262d;

    public wd1(Context context, sc1<T> sc1Var, lg1 lg1Var, de1 de1Var, eg1 eg1Var, dd1<T> dd1Var) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(sc1Var, "videoAdInfo");
        fd.j0.i(lg1Var, "videoViewProvider");
        fd.j0.i(de1Var, "adStatusController");
        fd.j0.i(eg1Var, "videoTracker");
        fd.j0.i(dd1Var, "playbackEventsListener");
        this.f26259a = new eu0(eg1Var);
        this.f26260b = new bt0(context, sc1Var);
        this.f26261c = new wa1<>(sc1Var, lg1Var, eg1Var, dd1Var);
        this.f26262d = new jh1<>(sc1Var, lg1Var, de1Var, eg1Var, dd1Var);
    }

    public final void a(ud1 ud1Var) {
        fd.j0.i(ud1Var, "progressEventsObservable");
        ud1Var.a(this.f26259a, this.f26260b, this.f26261c, this.f26262d);
        ud1Var.a(this.f26262d);
    }
}
