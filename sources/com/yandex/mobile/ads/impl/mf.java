package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
public final class mf extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hp f23044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f23045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final or f23046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f23047d;

    public mf(Context context, hp hpVar) {
        super(context);
        this.f23044a = hpVar;
        this.f23045b = new Paint();
        this.f23046c = new or();
        a(context);
    }

    private void a(Context context) {
        Objects.requireNonNull(this.f23044a);
        int iRound = Math.round(TypedValue.applyDimension(1, 1.0f, context.getResources().getDisplayMetrics()));
        Objects.requireNonNull(this.f23044a);
        this.f23047d = Math.round(TypedValue.applyDimension(1, 0.5f, context.getResources().getDisplayMetrics()));
        this.f23045b.setStyle(Paint.Style.STROKE);
        this.f23045b.setStrokeWidth(iRound);
        this.f23045b.setColor(-65536);
        setClickable(false);
        setFocusable(false);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f10 = this.f23047d;
        canvas.drawRect(f10, f10, getWidth() - this.f23047d, getHeight() - this.f23047d, this.f23045b);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Object parent = getParent();
        if (!(parent instanceof View)) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        View view = (View) parent;
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        setLeft(0);
        setTop(0);
        setRight(measuredWidth);
        setBottom(measuredHeight);
        super.onLayout(z10, 0, 0, measuredWidth, measuredHeight);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        sa0.a aVarA = this.f23046c.a(i10, i11);
        super.onMeasure(aVarA.f25006a, aVarA.f25007b);
    }

    public void setColor(int i10) {
        if (this.f23045b.getColor() != i10) {
            this.f23045b.setColor(i10);
            requestLayout();
        }
    }
}
