package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.FrameLayout;
import com.yandex.mobile.ads.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class cw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hp f19679a = new hp();

    public final Button a(Context context) {
        Button button = new Button(context);
        int i10 = R.drawable.yandex_ads_video_ic_replay;
        Object obj = e0.a.f28964a;
        button.setBackground(e0.a.c.b(context, i10));
        Objects.requireNonNull(this.f19679a);
        int iRound = Math.round(TypedValue.applyDimension(1, 90.0f, context.getResources().getDisplayMetrics()));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iRound, iRound);
        layoutParams.gravity = 17;
        button.setLayoutParams(layoutParams);
        return button;
    }
}
