package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.view.View;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Lq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1023Lq extends View {
    public int A00;
    public Paint A01;
    public Paint A02;
    public Paint A03;
    public boolean A04;

    public C1023Lq(C1337Xw c1337Xw) {
        this(c1337Xw, 60, true);
    }

    public C1023Lq(C1337Xw c1337Xw, int i10, boolean z10) {
        super(c1337Xw);
        this.A00 = i10;
        this.A04 = z10;
        if (z10) {
            Paint paint = new Paint();
            this.A02 = paint;
            paint.setColor(-3355444);
            this.A02.setStyle(Paint.Style.STROKE);
            this.A02.setStrokeWidth(3.0f);
            this.A02.setAntiAlias(true);
            Paint paint2 = new Paint();
            this.A01 = paint2;
            paint2.setColor(-1287371708);
            this.A01.setStyle(Paint.Style.FILL);
            this.A01.setAntiAlias(true);
            Paint paint3 = new Paint();
            this.A03 = paint3;
            paint3.setColor(-1);
            this.A03.setStyle(Paint.Style.STROKE);
            this.A03.setStrokeWidth(6.0f);
            this.A03.setAntiAlias(true);
        }
    }

    public RelativeLayout.LayoutParams getDefaultLayoutParams() {
        float f10 = Kn.A02;
        int i10 = this.A00;
        float density = i10;
        int i11 = (int) (density * f10);
        float density2 = i10;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i11, (int) (density2 * f10));
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        return layoutParams;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.A04) {
            if (canvas.isHardwareAccelerated() && Build.VERSION.SDK_INT < 17) {
                setLayerType(1, null);
            }
            int iMin = Math.min(canvas.getWidth(), canvas.getHeight());
            int i10 = iMin / 2;
            int i11 = iMin / 2;
            int edgeLength = i10 * 2;
            int i12 = edgeLength / 3;
            canvas.drawCircle(i10, i11, i12, this.A02);
            int edgeLength2 = i12 - 2;
            canvas.drawCircle(i10, i11, edgeLength2, this.A01);
            int centerY = iMin / 3;
            int centerX = iMin / 3;
            int edgeLength3 = centerY * 2;
            float f10 = edgeLength3;
            int edgeLength4 = centerX * 2;
            canvas.drawLine(centerY, centerX, f10, edgeLength4, this.A03);
            int edgeLength5 = centerY * 2;
            int edgeLength6 = centerX * 2;
            canvas.drawLine(edgeLength5, centerX, centerY, edgeLength6, this.A03);
        }
        super.onDraw(canvas);
    }
}
