package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.TypedValue;
import android.view.View;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
public final class zf extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hp f27318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Paint f27319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Paint f27320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Paint f27321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f27322e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f27323f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f27324g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f27325h;

    public zf(Context context, hp hpVar) {
        super(context);
        this.f27318a = hpVar;
        a(context);
    }

    private void a(Context context) {
        this.f27322e = 40.0f;
        Objects.requireNonNull(this.f27318a);
        this.f27323f = Math.round(TypedValue.applyDimension(1, 34.0f, context.getResources().getDisplayMetrics()));
        Objects.requireNonNull(this.f27318a);
        this.f27324g = Math.round(TypedValue.applyDimension(1, 3.0f, context.getResources().getDisplayMetrics()));
        Objects.requireNonNull(this.f27318a);
        this.f27325h = Math.round(TypedValue.applyDimension(1, 20.0f, context.getResources().getDisplayMetrics()));
        Paint paint = new Paint();
        this.f27319b = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f27320c = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f27320c.setStrokeWidth(this.f27324g);
        this.f27320c.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.f27321d = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f27321d.setTextSize(this.f27325h);
        this.f27321d.setTextAlign(Paint.Align.CENTER);
        this.f27320c.setColor(eh1.a(-65536, this.f27322e));
        this.f27319b.setColor(eh1.a(-1, this.f27322e));
        this.f27321d.setColor(eh1.a(-65536, this.f27322e));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f10 = this.f27323f / 2.0f;
        canvas.drawCircle(f10, f10, f10, this.f27319b);
        canvas.drawCircle(f10, f10, f10 - (this.f27324g / 2.0f), this.f27320c);
        float f11 = this.f27323f / 2.0f;
        canvas.drawText("!", f11, f11 - ((this.f27321d.ascent() + this.f27321d.descent()) / 2.0f), this.f27321d);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = (int) this.f27323f;
        setMeasuredDimension(i12, i12);
    }

    @Override // android.view.View
    public void setSelected(boolean z10) {
        super.setSelected(z10);
        float f10 = z10 ? StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD : 40.0f;
        this.f27322e = f10;
        this.f27320c.setColor(eh1.a(-65536, f10));
        this.f27319b.setColor(eh1.a(-1, this.f27322e));
        this.f27321d.setColor(eh1.a(-65536, this.f27322e));
        invalidate();
    }
}
