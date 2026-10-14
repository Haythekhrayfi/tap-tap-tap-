package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes3.dex */
public final class kd<T extends ViewGroup> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f22389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private yo<T> f22390b;

    public kd(ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        fd.j0.i(onPreDrawListener, "preDrawListener");
        this.f22389a = onPreDrawListener;
    }

    public final void a(ViewGroup viewGroup) {
        fd.j0.i(viewGroup, "container");
        viewGroup.removeAllViews();
        yo<T> yoVar = this.f22390b;
        if (yoVar != null) {
            yoVar.c();
        }
    }

    public final void a(ViewGroup viewGroup, T t10, z70<T> z70Var) {
        fd.j0.i(viewGroup, "container");
        fd.j0.i(t10, "designView");
        fd.j0.i(z70Var, "layoutDesign");
        viewGroup.removeAllViews();
        Context context = viewGroup.getContext();
        fd.j0.h(context, "container.context");
        sg1.a(viewGroup, t10, context, null, this.f22389a);
        yo<T> yoVar = (yo<T>) z70Var.a();
        this.f22390b = yoVar;
        if (yoVar != null) {
            yoVar.a(t10);
        }
    }
}
