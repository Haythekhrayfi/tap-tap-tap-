package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class ZK implements C2U {
    public final /* synthetic */ ZJ A00;

    public ZK(ZJ zj) {
        this.A00 = zj;
    }

    @Override // com.facebook.ads.redexgen.X.C2U
    public final void A58(Canvas canvas, RectF rectF, float f10, Paint paint) {
        float f11 = f10 * 2.0f;
        float fWidth = (rectF.width() - f11) - 1.0f;
        float fHeight = (rectF.height() - f11) - 1.0f;
        Canvas canvas2 = canvas;
        Paint paint2 = paint;
        if (f10 >= 1.0f) {
            float f12 = f10 + 0.5f;
            this.A00.A00.set(-f12, -f12, f12, f12);
            int iSave = canvas2.save();
            canvas2.translate(rectF.left + f12, rectF.top + f12);
            canvas2.drawArc(this.A00.A00, 180.0f, 90.0f, true, paint2);
            canvas2.translate(fWidth, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
            canvas2.rotate(90.0f);
            canvas2.drawArc(this.A00.A00, 180.0f, 90.0f, true, paint2);
            canvas2.translate(fHeight, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
            canvas2.rotate(90.0f);
            canvas2.drawArc(this.A00.A00, 180.0f, 90.0f, true, paint2);
            canvas2.translate(fWidth, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
            canvas2.rotate(90.0f);
            canvas2 = canvas2;
            canvas2.drawArc(this.A00.A00, 180.0f, 90.0f, true, paint2);
            canvas2.restoreToCount(iSave);
            float f13 = (rectF.left + f12) - 1.0f;
            float innerWidth = rectF.top;
            float innerHeight = (rectF.right - f12) + 1.0f;
            float roundedCornerRadius = rectF.top + f12;
            canvas2.drawRect(f13, innerWidth, innerHeight, roundedCornerRadius, paint2);
            float f14 = (rectF.left + f12) - 1.0f;
            float innerWidth2 = rectF.bottom - f12;
            float innerHeight2 = (rectF.right - f12) + 1.0f;
            float roundedCornerRadius2 = rectF.bottom;
            paint2 = paint2;
            canvas2.drawRect(f14, innerWidth2, innerHeight2, roundedCornerRadius2, paint2);
        }
        float f15 = rectF.left;
        float innerWidth3 = rectF.top + f10;
        float innerHeight3 = rectF.right;
        canvas2.drawRect(f15, innerWidth3, innerHeight3, rectF.bottom - f10, paint2);
    }
}
