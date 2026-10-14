package com.applovin.impl.adview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
public final class s extends j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Paint f8611c = new Paint(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Paint f8612d = new Paint(1);

    public s(Context context) {
        super(context);
        f8611c.setARGB(80, 0, 0, 0);
        Paint paint = f8612d;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // com.applovin.impl.adview.j
    public void a(int i10) {
        setViewScale(i10 / 30.0f);
    }

    public float getCenter() {
        return getSize() / 2.0f;
    }

    public float getCrossOffset() {
        return this.f8550a * 8.0f;
    }

    public float getStrokeWidth() {
        return this.f8550a * 2.0f;
    }

    @Override // com.applovin.impl.adview.j
    public j.a getStyle() {
        return j.a.WHITE_ON_TRANSPARENT;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, f8611c);
        float crossOffset = getCrossOffset();
        float size = getSize() - crossOffset;
        Paint paint = f8612d;
        paint.setStrokeWidth(getStrokeWidth());
        canvas.drawLine(crossOffset, crossOffset, size, size, paint);
        canvas.drawLine(crossOffset, size, size, crossOffset, paint);
    }
}
