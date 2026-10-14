package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class YA implements InterfaceC06455p {
    public static byte[] A02;
    public static final String A03;
    public final InterfaceC06485s A00;
    public final C6O A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 112);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{50, 84, 71, 78, 81, 67, 70, 75, 80, 73, 2, 7, 70, 2, 67, 85, 85, 71, 86, 85, 58, 92, 79, 86, 89, 75, 78, 83, 88, 81, 10, 83, 87, 75, 81, 79, 36, 10, 15, 93, 35, 69, 56, 63, 66, 52, 55, 60, 65, 58, -13, 64, 52, 69, 62, 72, 67, 13, -13, -8, 70, Ascii.EM, 59, 46, 53, 56, 42, 45, 50, 55, 48, -23, 63, 50, 45, 46, 56, 3, -23, -18, 60, -33, -82, -31, -31, -79, -78, -81, -81, -88, -35, -77, -82, -83, -88, -84, -84, -32, -76, -88, -36, -83, -36, -82, -88, -83, -36, -83, -36, -32, -83, -33, -35, -34, -34, -32, -81, 58, 60, 47, 48, 47, 62, 45, 50, 19, 12, 9, 12, 13, 21, 12};
    }

    static {
        A02();
        A03 = YA.class.getSimpleName();
    }

    public YA(InterfaceC06485s interfaceC06485s, C1336Xv c1336Xv) {
        this.A00 = interfaceC06485s;
        interfaceC06485s.A3K(new YC(this));
        this.A01 = new C6O(c1336Xv);
        A01();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(0, 20, 114), Integer.valueOf(this.A00.A5w().size()));
        }
        for (InterfaceC06515v interfaceC06515v : this.A00.A5w()) {
            switch (C06475r.A00[interfaceC06515v.A83().ordinal()]) {
                case 1:
                    A04(interfaceC06515v.getUrl());
                    break;
                case 2:
                    A06(interfaceC06515v.getUrl());
                    break;
                case 3:
                    A05(interfaceC06515v.getUrl());
                    break;
            }
        }
        this.A01.A0W(new YB(this), new C6H(A00(81, 36, 11), A00(125, 7, 46)));
    }

    private void A04(String str) {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(20, 20, 122), str);
        }
        C6M c6m = new C6M(str, -1, -1, A00(81, 36, 11), A00(125, 7, 46));
        c6m.A01 = A00(117, 8, 90);
        this.A01.A0b(c6m);
    }

    private void A05(String str) {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(40, 21, 99), str);
        }
        C6K c6k = new C6K(str, A00(81, 36, 11), A00(125, 7, 46));
        c6k.A04 = true;
        c6k.A02 = A00(117, 8, 90);
        this.A01.A0X(c6k);
    }

    private void A06(String str) {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(61, 20, 89), str);
        }
        C6K c6k = new C6K(str, A00(81, 36, 11), A00(125, 7, 46));
        c6k.A04 = false;
        c6k.A02 = A00(117, 8, 90);
        this.A01.A0a(c6k);
    }
}
