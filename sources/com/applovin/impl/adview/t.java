package com.applovin.impl.adview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
public final class t extends j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Paint f8613c = new Paint(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Paint f8614d = new Paint(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float[] f8615e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Path f8616f;

    public t(Context context) {
        super(context);
        this.f8615e = new float[]{30.0f, 30.0f, 50.0f, 50.0f, 30.0f, 70.0f, 55.0f, 30.0f, 75.0f, 50.0f, 55.0f, 70.0f};
        f8613c.setARGB(80, 0, 0, 0);
        Paint paint = f8614d;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
    }

    private void a() {
        int i10 = 0;
        while (true) {
            float[] fArr = this.f8615e;
            if (i10 >= fArr.length) {
                Path path = new Path();
                this.f8616f = path;
                float[] fArr2 = this.f8615e;
                path.moveTo(fArr2[0], fArr2[1]);
                Path path2 = this.f8616f;
                float[] fArr3 = this.f8615e;
                path2.lineTo(fArr3[2], fArr3[3]);
                Path path3 = this.f8616f;
                float[] fArr4 = this.f8615e;
                path3.lineTo(fArr4[4], fArr4[5]);
                Path path4 = this.f8616f;
                float[] fArr5 = this.f8615e;
                path4.moveTo(fArr5[6], fArr5[7]);
                Path path5 = this.f8616f;
                float[] fArr6 = this.f8615e;
                path5.lineTo(fArr6[8], fArr6[9]);
                Path path6 = this.f8616f;
                float[] fArr7 = this.f8615e;
                path6.lineTo(fArr7[10], fArr7[11]);
                return;
            }
            fArr[i10] = fArr[i10] * 0.3f * this.f8550a;
            i10++;
        }
    }

    @Override // com.applovin.impl.adview.j
    public void a(int i10) {
        setViewScale(i10 / 30.0f);
        a();
    }

    public float getCenter() {
        return getSize() / 2.0f;
    }

    public float getStrokeWidth() {
        return this.f8550a * 2.0f;
    }

    @Override // com.applovin.impl.adview.j
    public j.a getStyle() {
        return j.a.TRANSPARENT_SKIP;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, f8613c);
        Paint paint = f8614d;
        paint.setStrokeWidth(getStrokeWidth());
        canvas.drawPath(this.f8616f, paint);
    }
}
