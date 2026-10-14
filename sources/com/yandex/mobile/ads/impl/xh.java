package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes3.dex */
public final class xh implements View.OnTouchListener, View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View.OnClickListener f26518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f26519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f26520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f26521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f26522e;

    public xh(Context context, View.OnClickListener onClickListener) {
        this.f26518a = onClickListener;
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f26519b = scaledTouchSlop * scaledTouchSlop;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f26518a.onClick(view);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001b  */
    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        int i10 = action & 255;
        if (i10 == 0) {
            this.f26521d = x10;
            this.f26522e = y10;
            this.f26520c = true;
        } else {
            if (i10 == 1) {
                if (!this.f26520c) {
                    return true;
                }
                this.f26518a.onClick(view);
                return true;
            }
            if (i10 != 2) {
                if (i10 == 3) {
                    this.f26520c = false;
                }
            } else if (this.f26520c) {
                int i11 = (int) (x10 - this.f26521d);
                int i12 = (int) (y10 - this.f26522e);
                if ((i12 * i12) + (i11 * i11) > this.f26519b) {
                    this.f26520c = false;
                }
            }
        }
        return false;
    }
}
