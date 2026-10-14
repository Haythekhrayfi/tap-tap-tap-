package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.widget.ImageView;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class w21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s21 f26143a = new s21();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Matrix f26144b = new Matrix();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Paint f26145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f26146d;

    public w21() {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.parseColor("#2E7D32"));
        paint.setStrokeWidth(10.0f);
        this.f26145c = paint;
        this.f26146d = new Rect();
    }

    public final void a(ImageView imageView, Bitmap bitmap, q21 q21Var) {
        float fC;
        Float fValueOf;
        fd.j0.i(imageView, "view");
        fd.j0.i(bitmap, "bitmap");
        fd.j0.i(q21Var, "smartCenter");
        float width = imageView.getWidth();
        float height = imageView.getHeight();
        float width2 = bitmap.getWidth();
        float height2 = bitmap.getHeight();
        float fFloatValue = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        Float fValueOf2 = Float.valueOf(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        if (height == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            return;
        }
        if (height2 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            return;
        }
        boolean z10 = width / height > width2 / height2;
        float f10 = z10 ? width / width2 : height / height2;
        float f11 = width2 * f10;
        float f12 = height2 * f10;
        if (z10) {
            fC = 0.0f;
        } else {
            fC = (width / 2) - (((q21Var.c() / 2) + q21Var.d()) * f10);
            if (fC > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                fValueOf = fValueOf2;
            } else {
                fValueOf = fC + f11 < width ? Float.valueOf(width - f11) : null;
            }
            if (fValueOf != null) {
                fC = fValueOf.floatValue();
            }
        }
        if (z10) {
            float fB = (height / 2) - (((q21Var.b() / 2) + q21Var.e()) * f10);
            if (fB <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                fValueOf2 = fB + f12 < height ? Float.valueOf(height - f12) : null;
            }
            fFloatValue = fValueOf2 != null ? fValueOf2.floatValue() : fB;
        }
        this.f26144b.setScale(f10, f10);
        this.f26144b.postTranslate(fC, fFloatValue);
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        imageView.setImageMatrix(this.f26144b);
        s21 s21Var = this.f26143a;
        Context context = imageView.getContext();
        fd.j0.h(context, "view.context");
        Objects.requireNonNull(s21Var);
        if (s21.a(context)) {
            Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
            Canvas canvas = new Canvas(bitmapCopy);
            Rect rect = this.f26146d;
            rect.set(q21Var.d(), q21Var.e(), q21Var.c() + q21Var.d(), q21Var.b() + q21Var.e());
            canvas.drawRect(rect, this.f26145c);
            imageView.setImageBitmap(bitmapCopy);
        }
    }

    public final void a(ImageView imageView, Bitmap bitmap, q21 q21Var, String str) {
        fd.j0.i(imageView, "view");
        fd.j0.i(bitmap, "bitmap");
        fd.j0.i(q21Var, "smartCenter");
        fd.j0.i(str, "backGroundColor");
        float width = imageView.getWidth();
        float height = imageView.getHeight();
        float width2 = bitmap.getWidth();
        float height2 = bitmap.getHeight();
        float fC = q21Var.c();
        float fB = q21Var.b();
        if (height == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            return;
        }
        if (fB == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            return;
        }
        if (height2 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            return;
        }
        float f10 = width / height;
        float f11 = (f10 > (fC / fB) ? 1 : (f10 == (fC / fB) ? 0 : -1)) < 0 ? width / fC : height / fB;
        if (f11 > 1.0f) {
            f11 = f10 < width2 / height2 ? width / width2 : height / height2;
        }
        float f12 = 2;
        float fC2 = (width / f12) - (((q21Var.c() / 2) + q21Var.d()) * f11);
        float fB2 = (height / f12) - (((q21Var.b() / 2) + q21Var.e()) * f11);
        this.f26144b.setScale(f11, f11);
        this.f26144b.postTranslate(fC2, fB2);
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        imageView.setImageMatrix(this.f26144b);
        imageView.setBackgroundColor(Color.parseColor(str));
        s21 s21Var = this.f26143a;
        Context context = imageView.getContext();
        fd.j0.h(context, "view.context");
        Objects.requireNonNull(s21Var);
        if (s21.a(context)) {
            Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
            Canvas canvas = new Canvas(bitmapCopy);
            Rect rect = this.f26146d;
            rect.set(q21Var.d(), q21Var.e(), q21Var.c() + q21Var.d(), q21Var.b() + q21Var.e());
            canvas.drawRect(rect, this.f26145c);
            imageView.setImageBitmap(bitmapCopy);
        }
    }
}
