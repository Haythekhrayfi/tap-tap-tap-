package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.FrameLayout;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.MediaView;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class fd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdResponse<?> f20659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final sl0 f20660b = new sl0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final hm0 f20661c = new hm0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final zf1 f20662d = new zf1();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.yandex.mobile.ads.nativeads.e f20663e = new com.yandex.mobile.ads.nativeads.e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final cm0 f20664f = new cm0();

    public fd0(AdResponse<?> adResponse) {
        this.f20659a = adResponse;
    }

    public final nl1 a(MediaView mediaView, k2 k2Var, v20 v20Var, pl0 pl0Var, zj0 zj0Var) {
        Context context = mediaView.getContext();
        int iA = this.f20664f.a(mediaView);
        Objects.requireNonNull(this.f20660b);
        bf1 bf1VarA = sl0.a(iA);
        Objects.requireNonNull(this.f20663e);
        em0 em0VarA = this.f20661c.a(context, bf1VarA, com.yandex.mobile.ads.nativeads.e.a(mediaView));
        Objects.requireNonNull(this.f20662d);
        mediaView.removeAllViews();
        mediaView.addView(em0VarA, new FrameLayout.LayoutParams(-1, -1));
        return new nl1(mediaView, new kg1(em0VarA, bf1VarA, k2Var, this.f20659a, v20Var, pl0Var, zj0Var), k2Var);
    }
}
