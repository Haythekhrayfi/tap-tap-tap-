package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class z61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zy0 f27225a = new zy0();

    public final View a(View view) {
        zy0 zy0Var = this.f27225a;
        View viewFindViewWithTag = view.findViewWithTag("timer_container");
        Objects.requireNonNull(zy0Var);
        return (View) zy0.a(View.class, viewFindViewWithTag);
    }

    public final TextView b(View view) {
        zy0 zy0Var = this.f27225a;
        View viewFindViewWithTag = view.findViewWithTag("timer_value");
        Objects.requireNonNull(zy0Var);
        return (TextView) zy0.a(TextView.class, viewFindViewWithTag);
    }
}
