package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public final class v01 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f25766a;

    public v01(TextView textView) {
        this.f25766a = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View view2 = this.f25766a;
        if (view2 != null) {
            view2.setSelected(!view2.isSelected());
        }
    }
}
