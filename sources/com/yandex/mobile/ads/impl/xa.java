package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class xa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<qa<?>> f26477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f2 f26478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ov0 f26479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final v20 f26480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final m80 f26481e;

    /* JADX WARN: Multi-variable type inference failed */
    public xa(List<? extends qa<?>> list, f2 f2Var, ov0 ov0Var, v20 v20Var, m80 m80Var) {
        fd.j0.i(list, "assets");
        fd.j0.i(f2Var, "adClickHandler");
        fd.j0.i(ov0Var, "renderedTimer");
        fd.j0.i(v20Var, "impressionEventsObservable");
        this.f26477a = list;
        this.f26478b = f2Var;
        this.f26479c = ov0Var;
        this.f26480d = v20Var;
        this.f26481e = m80Var;
    }

    public final wa a(com.yandex.mobile.ads.nativeads.c cVar, com.yandex.mobile.ads.nativeads.w<View> wVar) {
        fd.j0.i(cVar, "clickListenerFactory");
        fd.j0.i(wVar, "viewAdapter");
        return new wa(cVar, this.f26477a, this.f26478b, wVar, this.f26479c, this.f26480d, this.f26481e);
    }
}
