package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gh0 extends og1<ViewPager2, List<? extends j20>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g20 f21061b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gh0(ViewPager2 viewPager2, g20 g20Var) {
        super(viewPager2);
        fd.j0.i(viewPager2, "viewPager");
        fd.j0.i(g20Var, "imageProvider");
        this.f21061b = g20Var;
    }

    @Override // com.yandex.mobile.ads.impl.og1
    public final boolean a(View view, List<? extends j20> list) {
        ViewPager2 viewPager2 = (ViewPager2) view;
        fd.j0.i(viewPager2, "viewPager");
        fd.j0.i(list, "imageValues");
        return viewPager2.getAdapter() instanceof ch0;
    }

    @Override // com.yandex.mobile.ads.impl.og1
    public final void b(View view, List<? extends j20> list) {
        ViewPager2 viewPager2 = (ViewPager2) view;
        List<? extends j20> list2 = list;
        fd.j0.i(viewPager2, "viewPager");
        fd.j0.i(list2, "imageValues");
        viewPager2.setAdapter(new ch0(this.f21061b, list2));
    }
}
