package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.FrameLayout;
import com.yandex.mobile.ads.nativeads.MediaView;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class dd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sc0 f19837a = new sc0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pg0 f19838b = new pg0();

    public final ll1 a(MediaView mediaView, wa0 wa0Var, v20 v20Var, om0 om0Var, k2 k2Var) throws xi1 {
        Context context = mediaView.getContext();
        Objects.requireNonNull(this.f19838b);
        kg0 kg0VarA = pg0.a(context, wa0Var, v20Var, om0Var);
        Objects.requireNonNull(this.f19837a);
        mediaView.removeAllViews();
        mediaView.addView(kg0VarA, new FrameLayout.LayoutParams(-1, -1));
        return new ll1(mediaView, new mg0(kg0VarA), k2Var);
    }
}
