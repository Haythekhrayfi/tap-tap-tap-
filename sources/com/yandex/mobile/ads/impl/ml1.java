package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.mobile.ads.nativeads.MediaView;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ml1 extends zc0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final pg1<ViewPager2, List<j20>> f23109c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ml1(MediaView mediaView, gh0 gh0Var, k2 k2Var) {
        super(mediaView, k2Var);
        fd.j0.i(mediaView, "mediaView");
        fd.j0.i(gh0Var, "multiBannerViewAdapter");
        fd.j0.i(k2Var, "adConfiguration");
        this.f23109c = new pg1<>(gh0Var);
    }

    @Override // com.yandex.mobile.ads.impl.og1
    public final void a(View view) {
        MediaView mediaView = (MediaView) view;
        fd.j0.i(mediaView, "mediaView");
        this.f23109c.a();
        super.a(mediaView);
    }

    @Override // com.yandex.mobile.ads.impl.og1
    public final void a(qa qaVar, rg1 rg1Var, vc0 vc0Var) {
        vc0 vc0Var2 = vc0Var;
        fd.j0.i(qaVar, "asset");
        fd.j0.i(rg1Var, "viewConfigurator");
        this.f23109c.a(qaVar, rg1Var, vc0Var2 != null ? vc0Var2.a() : null);
    }

    @Override // com.yandex.mobile.ads.impl.zc0
    public final void a(vc0 vc0Var) {
        fd.j0.i(vc0Var, "mediaValue");
        List<j20> listA = vc0Var.a();
        if (listA != null && (listA.isEmpty() ^ true)) {
            this.f23109c.b(listA);
        }
    }

    @Override // com.yandex.mobile.ads.impl.zc0
    /* JADX INFO: renamed from: a */
    public final void b(MediaView mediaView, vc0 vc0Var) {
        fd.j0.i(mediaView, "mediaView");
        fd.j0.i(vc0Var, "mediaValue");
        super.b(mediaView, vc0Var);
        List<j20> listA = vc0Var.a();
        if (listA != null && (listA.isEmpty() ^ true)) {
            this.f23109c.b(listA);
        }
    }

    @Override // com.yandex.mobile.ads.impl.og1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final boolean a(MediaView mediaView, vc0 vc0Var) {
        fd.j0.i(mediaView, "mediaView");
        fd.j0.i(vc0Var, "mediaValue");
        List<j20> listA = vc0Var.a();
        if (listA != null && (listA.isEmpty() ^ true)) {
            return this.f23109c.a(listA);
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.zc0
    public final int c() {
        return 3;
    }
}
