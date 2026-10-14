package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.viewpager2.widget.ViewPager2;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class zg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g20 f27329a;

    public static final class a implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ViewParent parent = view != null ? view.getParent() : null;
            ViewParent parent2 = parent != null ? parent.getParent() : null;
            ViewPager2 viewPager2 = parent2 instanceof ViewPager2 ? (ViewPager2) parent2 : null;
            if (viewPager2 != null) {
                viewPager2.callOnClick();
            }
        }
    }

    public zg0(g20 g20Var) {
        fd.j0.i(g20Var, "imageProvider");
        this.f27329a = g20Var;
    }

    public final yg0 a(ViewGroup viewGroup) {
        fd.j0.i(viewGroup, "parent");
        Context context = viewGroup.getContext();
        fd.j0.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setOnClickListener(new a());
        return new yg0(imageView, new r20(imageView, this.f27329a));
    }
}
