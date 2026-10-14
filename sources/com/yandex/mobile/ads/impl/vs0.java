package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.TypedValue;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.yandex.mobile.ads.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class vs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hp f26082a = new hp();

    public final ProgressBar a(Context context) {
        ProgressBar progressBar = new ProgressBar(context);
        int i10 = R.drawable.yandex_ads_video_progress_bar_background;
        Object obj = e0.a.f28964a;
        progressBar.setIndeterminateDrawable(e0.a.c.b(context, i10));
        Objects.requireNonNull(this.f26082a);
        int iRound = Math.round(TypedValue.applyDimension(1, 45.0f, context.getResources().getDisplayMetrics()));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iRound, iRound);
        layoutParams.gravity = 17;
        progressBar.setLayoutParams(layoutParams);
        return progressBar;
    }
}
