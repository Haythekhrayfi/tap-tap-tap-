package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class ij0 implements View.OnTouchListener, View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xh f21730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ui0 f21731b = ui0.a();

    public ij0(Context context, View.OnClickListener onClickListener) {
        this.f21730a = new xh(context, onClickListener);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f21730a.onClick(view);
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.f21731b.b(view, motionEvent);
        return this.f21730a.onTouch(view, motionEvent);
    }
}
