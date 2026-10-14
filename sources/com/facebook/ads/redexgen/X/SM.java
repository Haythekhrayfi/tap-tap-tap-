package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class SM extends N3 {
    public static byte[] A01;
    public final /* synthetic */ OX A00;

    static {
        A04();
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 114);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A01 = new byte[]{5, Ascii.CAN, 15, 0, 12, 8, 2, 62, 18, 5, 10, 62, 13, 0, Ascii.CAN, 4, 19, 62, 2, 14, 15, 21, 4, 15, 21, 62, 9, 4, 8, 6, 9, 21, 12, 17, 6, 9, 5, 1, 11, 55, Ascii.ESC, 12, 3, 55, 4, 9, 17, 13, Ascii.SUB, 55, 11, 7, 6, Ascii.FS, 13, 6, Ascii.FS, 55, Ascii.US, 1, 12, Ascii.FS, 0};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int dynamicWebViewWidth = getDynamicWebViewWidth();
        int dynamicWebViewHeight = getDynamicWebViewHeight();
        if (dynamicWebViewWidth <= 0 || dynamicWebViewHeight <= 0) {
            super.onMeasure(i10, i11);
            return;
        }
        float f10 = dynamicWebViewWidth / dynamicWebViewHeight;
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        boolean z10 = mode != 1073741824;
        boolean z11 = mode2 != 1073741824;
        int width = getResources().getDisplayMetrics().widthPixels;
        int height = getResources().getDisplayMetrics().heightPixels;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            height = Integer.MAX_VALUE;
            width = viewGroup.getWidth() != 0 ? viewGroup.getWidth() : Integer.MAX_VALUE;
            if (viewGroup.getHeight() != 0) {
                height = viewGroup.getHeight();
            }
        }
        int iA01 = A01(dynamicWebViewWidth, width, i10);
        int iA02 = A01(dynamicWebViewHeight, height, i11);
        if ((z11 || z10) && Math.abs((iA01 / iA02) - f10) > 1.0E-7d) {
            boolean z12 = false;
            if (z11) {
                iA02 = (int) (iA01 / f10);
                z12 = true;
            }
            if (!z12 && z10) {
                iA01 = (int) (iA02 * f10);
            }
        }
        setMeasuredDimension(iA01, iA02);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SM(OX ox, C1337Xw c1337Xw) {
        super(c1337Xw);
        this.A00 = ox;
        getSettings().setAllowFileAccess(true);
        setBackgroundColor(0);
    }

    private int A01(int i10, int i11, int i12) {
        int specMode = View.MeasureSpec.getMode(i12);
        int result = View.MeasureSpec.getSize(i12);
        switch (specMode) {
            case Integer.MIN_VALUE:
                return Math.min(Math.min(i10, result), i11);
            case 0:
                return Math.min(i10, i11);
            case 1073741824:
                return result;
            default:
                return i10;
        }
    }

    @Override // com.facebook.ads.redexgen.X.N3
    public final WebChromeClient A0D() {
        return new OS(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.N3
    public final WebViewClient A0E() {
        return new OT(this.A00);
    }

    private int getDynamicWebViewHeight() {
        return this.A00.A09.A0O().optInt(A03(0, 32, 19));
    }

    private int getDynamicWebViewWidth() {
        return this.A00.A09.A0O().optInt(A03(32, 31, 26));
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.A00.A02 != null) {
            this.A00.A02.AD0(this, motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }
}
