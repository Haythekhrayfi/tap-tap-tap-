package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class ZM implements C2U {
    public final /* synthetic */ EL A00;

    public ZM(EL el) {
        this.A00 = el;
    }

    @Override // com.facebook.ads.redexgen.X.C2U
    public final void A58(Canvas canvas, RectF rectF, float f10, Paint paint) {
        canvas.drawRoundRect(rectF, f10, f10, paint);
    }
}
