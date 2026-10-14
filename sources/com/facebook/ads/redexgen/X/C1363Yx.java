package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.applovin.exoplayer2.common.base.Ascii;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1363Yx extends AbstractC06174n {
    public static byte[] A06;
    public PointF A02;
    public final float A03;
    public final LinearInterpolator A05 = new LinearInterpolator();
    public final DecelerateInterpolator A04 = new DecelerateInterpolator();
    public int A00 = 0;
    public int A01 = 0;

    static {
        A06();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final int A03(View view, int i10) {
        AbstractC06054a abstractC06054aA08 = A08();
        if (abstractC06054aA08 == null || !abstractC06054aA08.A25()) {
            return 0;
        }
        C06064b c06064b = (C06064b) view.getLayoutParams();
        return A0N(abstractC06054aA08.A0o(view) - c06064b.topMargin, abstractC06054aA08.A0j(view) + c06064b.bottomMargin, abstractC06054aA08.A0g(), abstractC06054aA08.A0X() - abstractC06054aA08.A0d(), i10);
    }

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 35);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A06 = new byte[]{41, 12, 11, 0, 4, 23, 54, 8, 10, 10, 17, 13, 54, 6, 23, 10, 9, 9, 0, 23, 21, 35, 57, 108, 63, 36, 35, 57, 32, 40, 108, 35, 58, 41, 62, 62, 37, 40, 41, 108, 47, 35, 33, 60, 57, 56, 41, Ascii.US, 47, 62, 35, 32, 32, Ascii.SUB, 41, 47, 56, 35, 62, 10, 35, 62, Ascii.FS, 35, 63, 37, 56, 37, 35, 34, 108, 59, 36, 41, 34, 108, 56, 36, 41, 108, 0, 45, 53, 35, 57, 56, 1, 45, 34, 45, 43, 41, 62, 108, 40, 35, 41, 63, 108, 34, 35, 56, 108, 37, 33, 60, 32, 41, 33, 41, 34, 56, 108, 42, 55, 56, 41, 121, 41, 43, 60, 63, 60, 43, 60, 55, 58, 60, 121, 42, 49, 54, 44, 53, 61, 121, 59, 60, 121, 54, 55, 60, 121, 54, 63, 121, 45, 49, 60, 121, 58, 54, 55, 42, 45, 56, 55, 45, 42, 121, 61, 60, 63, 48, 55, 60, 61, 121, 48, 55, 121, 10, 52, 54, 54, 45, 49, 10, 58, 43, 54, 53, 53, 60, 43, 117, 121, 42, 45, 56, 43, 45, 48, 55, 62, 121, 46, 48, 45, 49, 121, 10, 23, Ascii.CAN, 9, 6};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public int A0O(View view, int i10) {
        AbstractC06054a abstractC06054aA08 = A08();
        if (abstractC06054aA08 == null || !abstractC06054aA08.A24()) {
            return 0;
        }
        C06064b c06064b = (C06064b) view.getLayoutParams();
        return A0N(abstractC06054aA08.A0k(view) - c06064b.leftMargin, abstractC06054aA08.A0n(view) + c06064b.rightMargin, abstractC06054aA08.A0e(), abstractC06054aA08.A0h() - abstractC06054aA08.A0f(), i10);
    }

    public C1363Yx(Context context) {
        this.A03 = A0J(context.getResources().getDisplayMetrics());
    }

    private final int A00() {
        PointF pointF = this.A02;
        if (pointF == null || pointF.y == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            return 0;
        }
        return this.A02.y > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD ? 1 : -1;
    }

    private int A01(int i10, int i11) {
        int before = i10 - i11;
        if (i10 * before <= 0) {
            return 0;
        }
        return before;
    }

    private final void A07(C06154l c06154l) {
        PointF pointFA0P = A0P(A07());
        if (pointFA0P == null || (pointFA0P.x == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && pointFA0P.y == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD)) {
            c06154l.A03(A07());
            A09();
            return;
        }
        A0B(pointFA0P);
        this.A02 = pointFA0P;
        this.A00 = (int) (pointFA0P.x * 10000.0f);
        this.A01 = (int) (pointFA0P.y * 10000.0f);
        int time = (int) (A0L(10000) * 1.2f);
        c06154l.A04((int) (this.A00 * 1.2f), (int) (this.A01 * 1.2f), time, this.A05);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC06174n
    public final void A0G() {
        this.A01 = 0;
        this.A00 = 0;
        this.A02 = null;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC06174n
    public final void A0H(int i10, int i11, C06194p c06194p, C06154l c06154l) {
        if (A06() == 0) {
            A09();
            return;
        }
        this.A00 = A01(this.A00, i10);
        int iA01 = A01(this.A01, i11);
        this.A01 = iA01;
        if (this.A00 == 0 && iA01 == 0) {
            A07(c06154l);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC06174n
    public void A0I(View view, C06194p c06194p, C06154l c06154l) {
        int iA0O = A0O(view, A0K());
        int dx = A00();
        int iA03 = A03(view, dx);
        int dy = iA0O * iA0O;
        int dx2 = iA03 * iA03;
        int time = A0M((int) Math.sqrt(dy + dx2));
        if (time > 0) {
            int distance = -iA0O;
            int dy2 = -iA03;
            c06154l.A04(distance, dy2, time, this.A04);
        }
    }

    public float A0J(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int A0K() {
        PointF pointF = this.A02;
        if (pointF == null || pointF.x == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            return 0;
        }
        return this.A02.x > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD ? 1 : -1;
    }

    public int A0L(int i10) {
        return (int) Math.ceil(Math.abs(i10) * this.A03);
    }

    public final int A0M(int i10) {
        return (int) Math.ceil(((double) A0L(i10)) / 0.3356d);
    }

    public final int A0N(int i10, int i11, int i12, int i13, int i14) {
        switch (i14) {
            case -1:
                return i12 - i10;
            case 0:
                int i15 = i12 - i10;
                if (i15 > 0) {
                    return i15;
                }
                int i16 = i13 - i11;
                if (i16 < 0) {
                    return i16;
                }
                return 0;
            case 1:
                return i13 - i11;
            default:
                throw new IllegalArgumentException(A04(113, 93, 122));
        }
    }

    public PointF A0P(int i10) {
        Object objA08 = A08();
        if (objA08 instanceof InterfaceC06164m) {
            return ((InterfaceC06164m) objA08).A4K(i10);
        }
        Log.w(A04(0, 20, 70), A04(20, 93, 111) + InterfaceC06164m.class.getCanonicalName());
        return null;
    }
}
