package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class P0 extends RelativeLayout {
    public final Paint A00;
    public final RectF A01;

    public P0(C1337Xw c1337Xw, String str) {
        super(c1337Xw);
        float f10 = c1337Xw.getResources().getDisplayMetrics().density;
        TextView textView = new TextView(c1337Xw);
        textView.setTextColor(-16777216);
        textView.setTextSize(16.0f);
        textView.setText(str);
        textView.setTypeface(Typeface.defaultFromStyle(1));
        setGravity(17);
        float density = 6.0f * f10;
        int i10 = (int) density;
        textView.setPadding(i10, i10, i10, i10);
        addView(textView);
        Paint paint = new Paint();
        this.A00 = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        this.A01 = new RectF();
        LO.A0M(this, 0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10 = getContext().getResources().getDisplayMetrics().density;
        this.A01.set(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, getWidth(), getHeight());
        canvas.drawRoundRect(this.A01, f10 * 10.0f, 10.0f * f10, this.A00);
        super.onDraw(canvas);
    }
}
