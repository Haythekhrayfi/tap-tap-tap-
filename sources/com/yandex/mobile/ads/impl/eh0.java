package com.yandex.mobile.ads.impl;

import androidx.viewpager2.widget.ViewPager2;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class eh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference<ViewPager2> f20251a;

    public eh0(ViewPager2 viewPager2) {
        fd.j0.i(viewPager2, "viewPager");
        this.f20251a = new WeakReference<>(viewPager2);
    }

    public final void a() {
        ViewPager2 viewPager2 = this.f20251a.get();
        if (viewPager2 != null) {
            viewPager2.e(viewPager2.getCurrentItem() + 1, true);
        }
    }

    public final void b() {
        ViewPager2 viewPager2 = this.f20251a.get();
        if (viewPager2 != null) {
            viewPager2.e(viewPager2.getCurrentItem() - 1, true);
        }
    }
}
