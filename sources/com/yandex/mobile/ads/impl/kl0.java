package com.yandex.mobile.ads.impl;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;

/* JADX INFO: loaded from: classes3.dex */
public final class kl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yq0 f22440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final of1 f22441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final oh1 f22442c;

    public kl0(kg1 kg1Var, ft ftVar, im0 im0Var, ul0 ul0Var) {
        fd.j0.i(kg1Var, "viewAdapter");
        fd.j0.i(ftVar, "nativeVideoAdPlayer");
        fd.j0.i(im0Var, "videoViewProvider");
        fd.j0.i(ul0Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        hl0 hl0Var = new hl0(ftVar);
        this.f22440a = new yq0(ul0Var);
        this.f22441b = new of1(kg1Var);
        this.f22442c = new oh1(hl0Var, im0Var);
    }

    public final void a(ud1 ud1Var) {
        fd.j0.i(ud1Var, "progressEventsObservable");
        ud1Var.a(this.f22440a, this.f22441b, this.f22442c);
    }
}
