package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes3.dex */
final class n5 extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hm f23228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Paint f23229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Paint f23230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Paint f23231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23232e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23233f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f23234g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f23235h;

    public n5(Context context) {
        super(context);
        int i10 = k5.f22254a;
        this.f23232e = i10;
        this.f23233f = i10;
        this.f23234g = -1;
        this.f23235h = -1.0f;
        this.f23228a = new hm(context);
        this.f23233f = i10;
        a(i10);
        a();
    }

    private void a() {
        Paint paint = new Paint(0);
        this.f23229b = paint;
        paint.setAntiAlias(true);
        this.f23229b.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(0);
        this.f23230c = paint2;
        paint2.setAntiAlias(true);
        this.f23230c.setStrokeWidth(2.0f);
        this.f23230c.setStyle(Paint.Style.STROKE);
        Paint paint3 = new Paint(0);
        this.f23231d = paint3;
        paint3.setAntiAlias(true);
        this.f23231d.setStyle(Paint.Style.STROKE);
        this.f23229b.setColor(this.f23232e);
        this.f23230c.setColor(this.f23234g);
        this.f23231d.setColor(this.f23234g);
    }

    private void a(int i10) {
        int i11;
        int iA = eh1.a(i10, 20.0f);
        this.f23232e = iA;
        float[] fArr = new float[3];
        Color.colorToHSV(iA, fArr);
        if (fArr[2] < 0.5f) {
            i11 = this.f23228a.a() ? -7829368 : -1;
        } else {
            i11 = -16777216;
        }
        this.f23234g = i11;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f23234g = this.f23228a.a() ? -7829368 : -1;
        this.f23229b.setColor(this.f23232e);
        this.f23230c.setColor(this.f23234g);
        this.f23231d.setColor(this.f23234g);
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(0);
        float fMin = Math.min(getWidth(), getHeight());
        float f10 = fMin / 2.0f;
        canvas.drawCircle(f10, f10, f10, this.f23229b);
        float f11 = fMin / 5.0f;
        float f12 = f10 - f11;
        float f13 = f11 + f10;
        canvas.drawLine(f12, f12, f13, f13, this.f23230c);
        canvas.drawLine(f12, f13, f13, f12, this.f23230c);
        float f14 = this.f23235h;
        if (f14 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            this.f23231d.setStrokeWidth(f14);
            canvas.drawCircle(f10, f10, f10 - this.f23235h, this.f23231d);
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        if (motionEvent.getAction() != 0) {
            if (1 == motionEvent.getAction()) {
                i10 = this.f23233f;
            }
            return super.onTouchEvent(motionEvent);
        }
        i10 = j5.f21950a;
        a(i10);
        this.f23229b.setColor(this.f23232e);
        this.f23230c.setColor(this.f23234g);
        this.f23231d.setColor(this.f23234g);
        invalidate();
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i10) {
        this.f23233f = i10;
        a(i10);
        this.f23229b.setColor(this.f23232e);
        this.f23230c.setColor(this.f23234g);
        this.f23231d.setColor(this.f23234g);
        invalidate();
    }
}
