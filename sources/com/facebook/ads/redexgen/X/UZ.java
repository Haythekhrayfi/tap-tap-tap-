package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class UZ implements IS {
    public static String[] A02 = {"AMQNzlG2eGPOJo74lPpddO6twtMEce", "8uZuLGh3CZSzV4eSaK74M9a8aAW81o1g", "CYs8BZmCr6kO5jRRUq4laItl384RlovT", "PO4hUmmCpilEicL1R3sLdD9hI0Kiey5Z", "WmgRsP13YsLJamj9MMjVCco3tjnpIVCq", "0ErvOAeoLZJf3MJzf6jF5Cw5BrHPqp", "S0kgbIpbc64QMPj8XCJtTK8zDrzNpUnW", "MO6xPizLQkqntlkNHRrNVg7dZ2stU5UP"};
    public final Rect A00 = new Rect();
    public final Rect A01 = new Rect();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private boolean A01(C1473bR<IT, IY> c1473bR, InterfaceC1462bG interfaceC1462bG) {
        float fA8C = -1.0f;
        try {
            fA8C = interfaceC1462bG.A8C(c1473bR);
        } catch (IllegalStateException unused) {
        }
        if (fA8C > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && A00(c1473bR)) {
            return true;
        }
        if (c1473bR.A02.A00().getGlobalVisibleRect(this.A01) && this.A01.bottom - this.A01.top > 0 && A00(c1473bR)) {
            return true;
        }
        interfaceC1462bG.A8B(this.A00);
        interfaceC1462bG.A70(c1473bR, this.A01);
        return (this.A00.bottom - this.A00.top > 0 && this.A01.bottom - this.A00.top > 0) && A00(c1473bR);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bR != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    public static boolean A00(C1473bR<IT, IY> c1473bR) {
        if (c1473bR.A02.A05()) {
            return c1473bR.A03.A07();
        }
        if (!c1473bR.A02.A06()) {
            return true;
        }
        IY iy = c1473bR.A03;
        String[] strArr = A02;
        if (strArr[3].charAt(7) != strArr[2].charAt(7)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[3] = "8O0EOVeCMdEJdeSbYPFIeNjJXhTUSITs";
        strArr2[2] = "Km62DwbCV8Ma1ecjtuIU72b1y8KakI9d";
        return iy.A06();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bR != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    public final void A02(C1473bR<IT, IY> c1473bR, InterfaceC1462bG interfaceC1462bG) {
        if (c1473bR.A03.A04() && A01(c1473bR, interfaceC1462bG)) {
            c1473bR.A03.A01();
            c1473bR.A02.A02().A9b(c1473bR.A02.A03(), c1473bR.A02.A04());
        }
        if (c1473bR.A03.A05() && IN.A1K(c1473bR.A02.A01())) {
            c1473bR.A03.A02();
            c1473bR.A02.A02().A9R(c1473bR.A02.A03(), c1473bR.A02.A04());
        }
    }
}
