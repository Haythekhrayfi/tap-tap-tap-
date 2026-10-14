package com.applovin.impl.adview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.applovin.sdk.AppLovinMediationProvider;

/* JADX INFO: loaded from: classes.dex */
public class h extends View {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f8523s = Color.rgb(66, 145, 241);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f8524t = Color.rgb(66, 145, 241);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f8525u = Color.rgb(66, 145, 241);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Paint f8526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Paint f8527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Paint f8528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Paint f8529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RectF f8530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f8531f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f8532g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f8533h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f8534i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f8535j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f8536k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f8537l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f8538m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f8539n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f8540o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f8541p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f8542q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f8543r;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final float f8544v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final float f8545w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final float f8546x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final int f8547y;

    public static class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static float c(Resources resources, float f10) {
            return (f10 * resources.getDisplayMetrics().density) + 0.5f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static float d(Resources resources, float f10) {
            return f10 * resources.getDisplayMetrics().scaledDensity;
        }
    }

    public h(Context context) {
        this(context, null);
    }

    public h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public h(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f8530e = new RectF();
        this.f8534i = 0;
        this.f8539n = "";
        this.f8540o = "";
        this.f8542q = "";
        this.f8545w = a.d(getResources(), 14.0f);
        this.f8547y = (int) a.c(getResources(), 100.0f);
        this.f8544v = a.c(getResources(), 4.0f);
        this.f8546x = a.d(getResources(), 18.0f);
        b();
        a();
    }

    private int a(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == 1073741824) {
            return size;
        }
        int i11 = this.f8547y;
        return mode == Integer.MIN_VALUE ? Math.min(i11, size) : i11;
    }

    private float getProgressAngle() {
        return (getProgress() / this.f8535j) * 360.0f;
    }

    public void a() {
        TextPaint textPaint = new TextPaint();
        this.f8526a = textPaint;
        textPaint.setColor(this.f8532g);
        this.f8526a.setTextSize(this.f8531f);
        this.f8526a.setAntiAlias(true);
        TextPaint textPaint2 = new TextPaint();
        this.f8527b = textPaint2;
        textPaint2.setColor(this.f8533h);
        this.f8527b.setTextSize(this.f8541p);
        this.f8527b.setAntiAlias(true);
        Paint paint = new Paint();
        this.f8528c = paint;
        paint.setColor(this.f8536k);
        this.f8528c.setStyle(Paint.Style.STROKE);
        this.f8528c.setAntiAlias(true);
        this.f8528c.setStrokeWidth(this.f8537l);
        Paint paint2 = new Paint();
        this.f8529d = paint2;
        paint2.setColor(this.f8538m);
        this.f8529d.setAntiAlias(true);
    }

    public void b() {
        this.f8536k = f8523s;
        this.f8532g = f8524t;
        this.f8531f = this.f8545w;
        setMax(100);
        setProgress(0);
        this.f8537l = this.f8544v;
        this.f8538m = 0;
        this.f8541p = this.f8546x;
        this.f8533h = f8525u;
    }

    public int getFinishedStrokeColor() {
        return this.f8536k;
    }

    public float getFinishedStrokeWidth() {
        return this.f8537l;
    }

    public int getInnerBackgroundColor() {
        return this.f8538m;
    }

    public String getInnerBottomText() {
        return this.f8542q;
    }

    public int getInnerBottomTextColor() {
        return this.f8533h;
    }

    public float getInnerBottomTextSize() {
        return this.f8541p;
    }

    public int getMax() {
        return this.f8535j;
    }

    public String getPrefixText() {
        return this.f8539n;
    }

    public int getProgress() {
        return this.f8534i;
    }

    public String getSuffixText() {
        return this.f8540o;
    }

    public int getTextColor() {
        return this.f8532g;
    }

    public float getTextSize() {
        return this.f8531f;
    }

    @Override // android.view.View
    public void invalidate() {
        a();
        super.invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f10 = this.f8537l;
        this.f8530e.set(f10, f10, getWidth() - f10, getHeight() - f10);
        float width = getWidth();
        float f11 = this.f8537l;
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, ((width - f11) + f11) / 2.0f, this.f8529d);
        canvas.drawArc(this.f8530e, 270.0f, -getProgressAngle(), false, this.f8528c);
        String str = this.f8539n + this.f8534i + this.f8540o;
        if (!TextUtils.isEmpty(str)) {
            canvas.drawText(str, (getWidth() - this.f8526a.measureText(str)) / 2.0f, (getWidth() - (this.f8526a.ascent() + this.f8526a.descent())) / 2.0f, this.f8526a);
        }
        if (TextUtils.isEmpty(getInnerBottomText())) {
            return;
        }
        this.f8527b.setTextSize(this.f8541p);
        canvas.drawText(getInnerBottomText(), (getWidth() - this.f8527b.measureText(getInnerBottomText())) / 2.0f, (getHeight() - this.f8543r) - ((this.f8526a.ascent() + this.f8526a.descent()) / 2.0f), this.f8527b);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(a(i10), a(i11));
        this.f8543r = getHeight() - ((getHeight() * 3) / 4);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        this.f8532g = bundle.getInt("text_color");
        this.f8531f = bundle.getFloat("text_size");
        this.f8541p = bundle.getFloat("inner_bottom_text_size");
        this.f8542q = bundle.getString("inner_bottom_text");
        this.f8533h = bundle.getInt("inner_bottom_text_color");
        this.f8536k = bundle.getInt("finished_stroke_color");
        this.f8537l = bundle.getFloat("finished_stroke_width");
        this.f8538m = bundle.getInt("inner_background_color");
        a();
        setMax(bundle.getInt(AppLovinMediationProvider.MAX));
        setProgress(bundle.getInt("progress"));
        this.f8539n = bundle.getString("prefix");
        this.f8540o = bundle.getString("suffix");
        super.onRestoreInstanceState(bundle.getParcelable("saved_instance"));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("saved_instance", super.onSaveInstanceState());
        bundle.putInt("text_color", getTextColor());
        bundle.putFloat("text_size", getTextSize());
        bundle.putFloat("inner_bottom_text_size", getInnerBottomTextSize());
        bundle.putFloat("inner_bottom_text_color", getInnerBottomTextColor());
        bundle.putString("inner_bottom_text", getInnerBottomText());
        bundle.putInt("inner_bottom_text_color", getInnerBottomTextColor());
        bundle.putInt("finished_stroke_color", getFinishedStrokeColor());
        bundle.putInt(AppLovinMediationProvider.MAX, getMax());
        bundle.putInt("progress", getProgress());
        bundle.putString("suffix", getSuffixText());
        bundle.putString("prefix", getPrefixText());
        bundle.putFloat("finished_stroke_width", getFinishedStrokeWidth());
        bundle.putInt("inner_background_color", getInnerBackgroundColor());
        return bundle;
    }

    public void setFinishedStrokeColor(int i10) {
        this.f8536k = i10;
        invalidate();
    }

    public void setFinishedStrokeWidth(float f10) {
        this.f8537l = f10;
        invalidate();
    }

    public void setInnerBackgroundColor(int i10) {
        this.f8538m = i10;
        invalidate();
    }

    public void setInnerBottomText(String str) {
        this.f8542q = str;
        invalidate();
    }

    public void setInnerBottomTextColor(int i10) {
        this.f8533h = i10;
        invalidate();
    }

    public void setInnerBottomTextSize(float f10) {
        this.f8541p = f10;
        invalidate();
    }

    public void setMax(int i10) {
        if (i10 > 0) {
            this.f8535j = i10;
            invalidate();
        }
    }

    public void setPrefixText(String str) {
        this.f8539n = str;
        invalidate();
    }

    public void setProgress(int i10) {
        this.f8534i = i10;
        if (i10 > getMax()) {
            this.f8534i %= getMax();
        }
        invalidate();
    }

    public void setSuffixText(String str) {
        this.f8540o = str;
        invalidate();
    }

    public void setTextColor(int i10) {
        this.f8532g = i10;
        invalidate();
    }

    public void setTextSize(float f10) {
        this.f8531f = f10;
        invalidate();
    }
}
