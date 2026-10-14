package com.facebook.ads.redexgen.X;

import com.facebook.ads.NativeAdLayout;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ML {
    public static String[] A00 = {"Mh7OQPY25mJ4xZdJdnJU4lIWxnSb2W80", "uMvQGqYS2R9kLiwAhxbB5gyg9uPLoFmG", "JD8RnvPxGeaTxsc34jN0O6vhnDfoaLvm", "v", "yiVoJ6", "bh6EDcFJy1WMlrC6ew5uNV", "HsXTYL", "k"};
    public static final int A01 = (int) (Kn.A02 * 200.0f);
    public static final int A03 = (int) (Kn.A02 * 200.0f);
    public static final int A02 = (int) (Kn.A02 * 50.0f);

    public static AnonymousClass11 A00(NativeAdLayout nativeAdLayout) {
        if (nativeAdLayout == null) {
            return AnonymousClass11.A05;
        }
        if (A03(nativeAdLayout)) {
            return AnonymousClass11.A06;
        }
        return AnonymousClass11.A04;
    }

    public static MK A01(C1337Xw c1337Xw, InterfaceC0937Id interfaceC0937Id, String str, NativeAdLayout nativeAdLayout) {
        if (nativeAdLayout == null) {
            return null;
        }
        int h10 = nativeAdLayout.getWidth();
        int w10 = nativeAdLayout.getHeight();
        int i10 = A01;
        if (h10 >= i10 && w10 >= i10) {
            return new TA(c1337Xw, interfaceC0937Id, str);
        }
        if (h10 < A03 || w10 < A02) {
            return null;
        }
        return new TB(c1337Xw, interfaceC0937Id, str);
    }

    public static TC A02(C1337Xw c1337Xw, InterfaceC0937Id interfaceC0937Id, String str, C1W c1w, InterfaceC1020Ln interfaceC1020Ln, InterfaceC1019Lm interfaceC1019Lm) {
        return new TC(c1337Xw, interfaceC0937Id, str, c1w, interfaceC1020Ln, interfaceC1019Lm);
    }

    public static boolean A03(NativeAdLayout nativeAdLayout) {
        int h10 = nativeAdLayout.getWidth();
        int height = nativeAdLayout.getHeight();
        int w10 = A01;
        if (h10 < w10 || height < w10) {
            if (h10 >= A03) {
                int i10 = A02;
                if (A00[5].length() != 22) {
                    throw new RuntimeException();
                }
                A00[5] = "hhrIY4o6fKEkU42z4UVpb3";
                if (height < i10) {
                }
            }
            return true;
        }
        return false;
    }
}
