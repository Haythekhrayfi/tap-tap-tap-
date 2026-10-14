package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.widget.ImageView;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class P8 extends ImageView {
    public static byte[] A03;
    public static final int A04;
    public final Paint A00;
    public final P6 A01;
    public final P7 A02;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 78);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{11, 47, 33, 40, Ascii.GS, -40, 36, Ascii.GS, Ascii.RS, 44, 14, 50, 36, 43, 32, -37, 45, 36, 34, 35, 47};
    }

    static {
        A03();
        A04 = (int) (Kn.A02 * 4.0f);
    }

    public P8(C1337Xw c1337Xw, P6 p10, P7 p11) {
        super(c1337Xw);
        this.A01 = p10;
        this.A02 = p11;
        Paint paint = new Paint();
        this.A00 = paint;
        paint.setColor(-1728053248);
        setColorFilter(-1);
        int i10 = A04;
        setPadding(i10, i10, i10, i10);
        boolean z10 = p10 == P6.A03;
        setContentDescription(z10 ? A02(0, 10, 106) : A02(10, 11, 109));
        Bitmap arrowIcon = LX.A01(LW.TO_RIGHT_ARROW);
        if (z10) {
            Matrix matrix = new Matrix();
            matrix.postRotate(180.0f);
            arrowIcon = Bitmap.createBitmap(arrowIcon, 0, 0, arrowIcon.getWidth(), arrowIcon.getHeight(), matrix, true);
        }
        setImageBitmap(arrowIcon);
        setOnClickListener(new P5(this));
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        int y10 = getWidth() / 2;
        int x10 = getHeight() / 2;
        canvas.drawCircle(y10, x10, Math.min(y10, x10), this.A00);
        super.onDraw(canvas);
    }
}
