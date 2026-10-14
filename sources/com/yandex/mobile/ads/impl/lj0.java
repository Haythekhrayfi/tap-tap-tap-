package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
final class lj0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference<View> f22715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c81.a f22716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f22717c;

    public lj0(View view, c81.a aVar) {
        this.f22715a = new WeakReference<>(view);
        this.f22716b = aVar;
    }

    public final void a() {
        View view = this.f22715a.get();
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view = this.f22715a.get();
        if (view != null) {
            Integer numValueOf = Integer.valueOf(view.getVisibility());
            if (numValueOf.equals(this.f22717c)) {
                return;
            }
            this.f22717c = numValueOf;
            if (this.f22716b != null) {
                if (numValueOf.intValue() == 0) {
                    this.f22716b.a();
                } else {
                    this.f22716b.b();
                }
            }
        }
    }
}
