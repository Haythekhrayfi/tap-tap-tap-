package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1070Nl {
    public static final int A00 = Kn.A03.heightPixels;
    public static final int A01 = Kn.A03.widthPixels;

    public static float A00(C1D c1d) {
        int height = c1d.A0D().A01();
        int width = c1d.A0D().A00();
        if (width > 0) {
            return height / width;
        }
        return -1.0f;
    }

    public static int A01(double d10) {
        int availableWidth = (int) (((double) (A01 - (AbstractC1072Nn.A07 * 2))) / d10);
        return availableWidth;
    }

    public static int A02(int bottomMargin) {
        int ctaMargin = LO.A01(16);
        int ctaTextHeight = NS.A0A;
        int ctaSpacing = ctaTextHeight * 2;
        int ctaTextHeight2 = AbstractC1072Nn.A07;
        int ctaMargin2 = ctaMargin + ctaSpacing + (ctaTextHeight2 * 2);
        int ctaTextHeight3 = A00;
        return (ctaTextHeight3 - bottomMargin) - ctaMargin2;
    }

    public static ViewOnClickListenerC1069Nk A03(ViewOnClickListenerC1207Ss viewOnClickListenerC1207Ss, String str) {
        return new ViewOnClickListenerC1069Nk(viewOnClickListenerC1207Ss, str);
    }

    public static boolean A04(double d10) {
        return d10 < 0.9d;
    }

    public static boolean A05(double d10, int i10) {
        return A02(i10) < A01(d10);
    }

    public static boolean A06(int i10, int i11, double d10) {
        return i10 == 2 || A05(d10, i11);
    }
}
