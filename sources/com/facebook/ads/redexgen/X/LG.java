package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.View;
import ch.qos.logback.core.net.SyslogConstants;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class LG {
    public static byte[] A0I;
    public static String[] A0J = {"UAfRYX1IJYK1F4gMurnkVir00q2Lzr", "W9rWnfjKrefpB8hDj8decpkzvyqzW", "KuE77vVQtzCska5bvEw0ie6MMkaH2LqI", "aCUXypAv16RVdaAbRrmoDPgF0pJQTLdN", "UhONC0e0tLrj", "Xpoa", "YCNHKjVOQFwEe4MjzAzWrTTEWfFYaS", "tXFOakpgFhvHBQhEUyJ4FZAKQx0U"};
    public static final String A0K;
    public View A0F;
    public View A0G;
    public boolean A0H;
    public int A04 = -1;
    public int A05 = -1;
    public int A06 = -1;
    public int A03 = -1;
    public long A0C = -1;
    public int A09 = -1;
    public long A0E = -1;
    public long A0D = -1;
    public int A0A = -1;
    public int A0B = -1;
    public int A07 = -1;
    public int A08 = -1;
    public float A00 = -1.0f;
    public float A02 = -1.0f;
    public float A01 = -1.0f;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0I, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 45);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        byte[] bArr = {-48, -60, -124, 120, -69, -60, -63, -69, -61, -65, -51, -71, -54, -68, -84, -63, -59, -67, -110, 120, -8, -5, -25, 6, 10, 0, 11, 0, 6, 5, -17, -16, -13, -33, -2, 2, -8, 3, -8, -2, -3, -24, -79, -70, -73, -79, -71, -110, -77, -70, -81, -57, -94, -73, -69, -77, 5, 14, 11, 5, 13, -6, -4, 5, 2, -4, 4, -14, -88, -79, -82, -88, -80, -86, -87, -101, -82, -86, -68, -103, -90, -84, -69, -60, -70, -86, -65, -61, -69, -16, -7, -17, -29, -94, -85, -95, -106, -97, -88, -85, -100, -98, -91, -94, -90, -92, -91, -79, 10, 20, -28, 13, 10, 4, 12, -24, 22, 2, 19, 5, -26, 15, 2, 3, 13, 6, 5, -37, -63, -20, -37, -34, -29, -17, -19, -46, 20, 3, 6, 11, 23, 21, -5, -53, -66, -68, -56, -53, -67, -62, -57, -64, 121, -62, -58, -55, -53, -66, -52, -52, -62, -56, -57, -109, 121, -59, -58, -77, -60, -58, -90, -69, -65, -73, -52, -51, -70, -53, -51, -79, 7, 8, -11, 6, 8, -19, 4, -10, -15, 1, -11};
        if (A0J[6].length() == 24) {
            throw new RuntimeException();
        }
        A0J[5] = "KWAi";
        A0I = bArr;
    }

    static {
        A02();
        A0K = LG.class.getSimpleName();
    }

    private EnumC0999Ks A00() {
        View view;
        View view2 = this.A0G;
        if (view2 == null || (view = this.A0F) == null) {
            return EnumC0999Ks.A0I;
        }
        if (view2 != view) {
            return EnumC0999Ks.A0G;
        }
        if (Build.VERSION.SDK_INT < 4) {
            return EnumC0999Ks.A0F;
        }
        Object tag = this.A0G.getTag(EnumC0999Ks.A02);
        if (tag == null) {
            return EnumC0999Ks.A0H;
        }
        if (!(tag instanceof EnumC0999Ks)) {
            return EnumC0999Ks.A0J;
        }
        return (EnumC0999Ks) tag;
    }

    public final long A03() {
        if (A07()) {
            return System.currentTimeMillis() - this.A0C;
        }
        if (A0J[6].length() == 24) {
            throw new RuntimeException();
        }
        A0J[5] = "dmN9";
        return -1L;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0156  */
    public final Map<String, String> A04() {
        long clickDelayMs;
        if (!this.A0H) {
            return null;
        }
        String strValueOf = String.valueOf((this.A02 * this.A01) / 2.0f);
        long j10 = this.A0C;
        if (j10 > 0) {
            long j11 = this.A0D;
            if (j11 > j10) {
                clickDelayMs = j11 - j10;
            } else {
                clickDelayMs = -1;
            }
        } else {
            clickDelayMs = -1;
        }
        HashMap map = new HashMap();
        String strValueOf2 = String.valueOf(this.A04);
        String radius = A01(20, 11, 106);
        map.put(radius, strValueOf2);
        String strValueOf3 = String.valueOf(this.A05);
        String radius2 = A01(31, 11, 98);
        map.put(radius2, strValueOf3);
        String strValueOf4 = String.valueOf(this.A06);
        String radius3 = A01(186, 5, 96);
        map.put(radius3, strValueOf4);
        String strValueOf5 = String.valueOf(this.A03);
        String radius4 = A01(102, 6, 16);
        map.put(radius4, strValueOf5);
        String strValueOf6 = String.valueOf(clickDelayMs);
        String radius5 = A01(42, 14, 33);
        map.put(radius5, strValueOf6);
        String strValueOf7 = String.valueOf(this.A0E);
        String radius6 = A01(165, 9, 37);
        map.put(radius6, strValueOf7);
        String strValueOf8 = String.valueOf(this.A0D);
        String radius7 = A01(82, 7, 41);
        map.put(radius7, strValueOf8);
        String strValueOf9 = String.valueOf(this.A0A);
        String radius8 = A01(174, 6, 44);
        map.put(radius8, strValueOf9);
        String strValueOf10 = String.valueOf(this.A0B);
        String radius9 = A01(BaseTransientBottomBar.ANIMATION_FADE_DURATION, 6, 103);
        map.put(radius9, strValueOf10);
        String strValueOf11 = String.valueOf(this.A07);
        String radius10 = A01(56, 6, 117);
        map.put(radius10, strValueOf11);
        String strValueOf12 = String.valueOf(this.A08);
        String radius11 = A01(62, 6, 108);
        map.put(radius11, strValueOf12);
        String strValueOf13 = String.valueOf(this.A07);
        String radius12 = A01(89, 4, 94);
        map.put(radius12, strValueOf13);
        String strValueOf14 = String.valueOf(this.A08);
        String radius13 = A01(93, 4, 16);
        map.put(radius13, strValueOf14);
        String strValueOf15 = String.valueOf(this.A00);
        String radius14 = A01(97, 5, 12);
        map.put(radius14, strValueOf15);
        String radius15 = A01(129, 7, 77);
        map.put(radius15, strValueOf);
        String radius16 = A01(SyslogConstants.LOG_LOCAL1, 7, 117);
        map.put(radius16, strValueOf);
        String strValueOf16 = String.valueOf(A00().A05());
        String radius17 = A01(68, 14, 24);
        map.put(radius17, strValueOf16);
        return map;
    }

    public final void A05() {
        this.A0C = System.currentTimeMillis();
        if (BuildConfigApi.isDebug()) {
            String str = A01(143, 22, 44) + this.A0C;
        }
    }

    public final void A06(C1337Xw c1337Xw, MotionEvent motionEvent, View view, View view2) {
        if (view == null) {
            c1337Xw.A0E().AFy();
            return;
        }
        boolean z10 = this.A0H;
        if (A0J[5].length() != 4) {
            throw new RuntimeException();
        }
        A0J[4] = "drnDCnvAjgSKiECIW4dLYcZdZ";
        if (!z10) {
            this.A0H = true;
            InputDevice touchDevice = motionEvent.getDevice();
            if (touchDevice != null) {
                InputDevice.MotionRange motionRange = touchDevice.getMotionRange(0);
                InputDevice.MotionRange motionRange2 = touchDevice.getMotionRange(1);
                if (motionRange != null && motionRange2 != null) {
                    this.A01 = Math.min(motionRange.getRange(), motionRange2.getRange());
                }
            }
            if (this.A01 <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                this.A01 = Math.min(view.getMeasuredWidth(), view.getMeasuredHeight());
            }
        }
        int[] adViewLocation = new int[2];
        view.getLocationInWindow(adViewLocation);
        int[] iArr = new int[2];
        view2.getLocationInWindow(iArr);
        switch (motionEvent.getAction()) {
            case 0:
                this.A04 = (int) (adViewLocation[0] / Kn.A02);
                this.A05 = (int) (adViewLocation[1] / Kn.A02);
                this.A06 = (int) (view.getWidth() / Kn.A02);
                this.A03 = (int) (view.getHeight() / Kn.A02);
                this.A09 = 1;
                this.A0E = System.currentTimeMillis();
                this.A0A = (int) (((((int) (motionEvent.getX() + 0.5f)) + iArr[0]) - adViewLocation[0]) / Kn.A02);
                int touchStartYInPx = (((int) (motionEvent.getY() + 0.5f)) + iArr[1]) - adViewLocation[1];
                this.A0B = (int) (touchStartYInPx / Kn.A02);
                this.A00 = motionEvent.getPressure();
                this.A02 = motionEvent.getSize();
                this.A0G = view2;
                return;
            case 1:
            case 3:
                this.A0D = System.currentTimeMillis();
                int touchStartYInPx2 = (int) (motionEvent.getX() + 0.5f);
                this.A07 = (int) (((touchStartYInPx2 + iArr[0]) - adViewLocation[0]) / Kn.A02);
                int touchStartYInPx3 = (int) (motionEvent.getY() + 0.5f);
                this.A08 = (int) (((touchStartYInPx3 + iArr[1]) - adViewLocation[1]) / Kn.A02);
                this.A0F = view2;
                return;
            case 2:
                float f10 = this.A00;
                float f11 = f10 - (f10 / this.A09);
                this.A00 = f11;
                float pressure = motionEvent.getPressure();
                int touchEndYInPx = this.A09;
                this.A00 = f11 + (pressure / touchEndYInPx);
                float f12 = this.A02;
                float f13 = f12 - (f12 / touchEndYInPx);
                this.A02 = f13;
                float size = motionEvent.getSize();
                int touchEndYInPx2 = this.A09;
                this.A02 = f13 + (size / touchEndYInPx2);
                this.A09 = touchEndYInPx2 + 1;
                return;
            default:
                return;
        }
    }

    public final boolean A07() {
        return this.A0C != -1;
    }

    public final boolean A08() {
        return this.A0H;
    }

    public final boolean A09(Context context) {
        boolean z10;
        int iA06 = IN.A06(context);
        long jA03 = A03();
        if (iA06 >= 0 && jA03 < iA06) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (BuildConfigApi.isDebug()) {
            String str = A01(108, 21, 116) + z10 + A01(2, 18, 43) + iA06 + A01(0, 2, 119) + jA03;
        }
        return z10;
    }
}
