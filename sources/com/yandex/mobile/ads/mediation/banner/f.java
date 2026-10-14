package com.yandex.mobile.ads.mediation.banner;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class f implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f27520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h.a f27521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f27522d;

    public f(h hVar, View view, a.C0213a c0213a) {
        this.f27522d = hVar;
        this.f27520b = view;
        this.f27521c = c0213a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup = (ViewGroup) this.f27522d.f27528b.get();
        if (viewGroup != null && viewGroup.indexOfChild(this.f27520b) == -1) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            viewGroup.addView(this.f27520b, layoutParams);
            viewGroup.setVisibility(0);
            this.f27520b.setVisibility(0);
        }
        h hVar = this.f27522d;
        View view = this.f27520b;
        h.a aVar = this.f27521c;
        Objects.requireNonNull(hVar);
        view.getViewTreeObserver().addOnPreDrawListener(new g(hVar, view, aVar));
    }
}
