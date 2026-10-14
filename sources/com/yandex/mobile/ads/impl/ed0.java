package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.viewpager2.widget.ViewPager2;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.nativeads.MediaView;
import com.yandex.mobile.ads.nativeads.view.pager.MultiBannerControlsContainer;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class ed0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final dh0 f20223a = new dh0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wg0 f20224b = new wg0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final vg0 f20225c = new vg0();

    public final ml1 a(MediaView mediaView, g20 g20Var, List list, k2 k2Var, d11 d11Var) {
        Long lA;
        ug0 ug0Var;
        fd.j0.i(mediaView, "mediaView");
        fd.j0.i(g20Var, "imageProvider");
        fd.j0.i(list, "imageValues");
        fd.j0.i(k2Var, "adConfiguration");
        Context context = mediaView.getContext();
        ViewPager2 viewPager2 = new ViewPager2(context);
        fd.j0.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        xg0 xg0Var = new xg0(context);
        eh0 eh0Var = new eh0(viewPager2);
        if (d11Var == null || (lA = d11Var.a()) == null) {
            lA = 0L;
        }
        long jLongValue = lA.longValue();
        if (jLongValue > 0) {
            ug0Var = new ug0(viewPager2, eh0Var, xg0Var);
            viewPager2.addOnAttachStateChangeListener(new ah0(ug0Var, jLongValue));
        } else {
            ug0Var = null;
        }
        viewPager2.f3011e.f3049a.add(new jp0(xg0Var, ug0Var));
        MultiBannerControlsContainer multiBannerControlsContainerA = this.f20224b.a(context);
        if (multiBannerControlsContainerA != null) {
            multiBannerControlsContainerA.a(viewPager2);
            multiBannerControlsContainerA.setOnClickLeftButtonListener(new el.a(eh0Var, xg0Var, ug0Var));
            multiBannerControlsContainerA.setOnClickRightButtonListener(new el.b(eh0Var, xg0Var, ug0Var));
        }
        ExtendedViewContainer extendedViewContainerA = this.f20225c.a(context, list);
        Objects.requireNonNull(this.f20223a);
        dh0.a(mediaView, extendedViewContainerA, viewPager2, multiBannerControlsContainerA);
        return new ml1(mediaView, new gh0(viewPager2, g20Var), k2Var);
    }
}
