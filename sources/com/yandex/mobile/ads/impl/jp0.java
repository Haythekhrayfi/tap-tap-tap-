package com.yandex.mobile.ads.impl;

import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes3.dex */
public final class jp0 extends ViewPager2.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xg0 f22119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ug0 f22120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f22121c;

    public jp0(xg0 xg0Var, ug0 ug0Var) {
        fd.j0.i(xg0Var, "multiBannerEventTracker");
        this.f22119a = xg0Var;
        this.f22120b = ug0Var;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void onPageScrollStateChanged(int i10) {
        if (i10 == 0) {
            this.f22121c = false;
        } else {
            if (i10 != 1) {
                return;
            }
            ug0 ug0Var = this.f22120b;
            if (ug0Var != null) {
                ug0Var.a();
            }
            this.f22121c = true;
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void onPageSelected(int i10) {
        if (this.f22121c) {
            this.f22119a.c();
            this.f22121c = false;
        }
    }
}
