package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1387Zw implements InterfaceC05250w {
    public static byte[] A02;
    public static String[] A03 = {"7FIKHU9lgq27", "AgQqvAltXhi1bYF8zppFCZ", "CRAmwsbXNtyv0vmCJJ9qOPCwxUiND3E6", "ItQqdqoRYHMWKQzbVRTeHzNwEAi", "W2szVhKnaW", "HNVKE5hkEvipBMdeuLWXlSQ07SgK2Jmi", "9NOG2BA2dnlUEqMWgY53wMXC47FXKBrl", "EneshuO9jiHnlHF2bjWwp7WA0EKVaMOF"};
    public final /* synthetic */ C0854Ev A00;
    public final /* synthetic */ Runnable A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            byte b10 = (byte) ((bArrCopyOfRange[i13] - i12) - 16);
            if (A03[2].charAt(4) == 'y') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[5] = "2VG06oAYTcRzKBDE7gWFCU36hzL5px1b";
            strArr[7] = "j1xG2z3v9jq0UO66H2WqYNbpklLAu6IG";
            bArrCopyOfRange[i13] = b10;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{117, -96, 111, 116, 119, -93, -94, -92, -124, -93, -80, -80, -89, -76, 98, -85, -81, -78, -76, -89, -75, -75, -85, -79, -80, 98, -88, -85, -76, -89, -90, -118, -119, 93, 124, -119, -119, -128, -115, 103, -118, -126, -126, -124, -119, -126, 100, -120, -117, -115, -128, -114, -114, -124, -118, -119};
    }

    static {
        A01();
    }

    public C1387Zw(C0854Ev c0854Ev, Runnable runnable) {
        this.A00 = c0854Ev;
        this.A01 = runnable;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05250w
    public final void AAX(C1422aV c1422aV) {
        this.A00.A01.A0E().A3p();
        this.A00.A06.A0C();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05250w
    public final void AAY(C1422aV c1422aV, View view) {
        this.A00.A01.A0E().A3o(c1422aV == ((AbstractC1385Zu) this.A00).A00);
        if (c1422aV != ((AbstractC1385Zu) this.A00).A00) {
            return;
        }
        this.A00.A0E().removeCallbacks(this.A01);
        InterfaceC05170o interfaceC05170o = ((AbstractC1385Zu) this.A00).A01;
        ((AbstractC1385Zu) this.A00).A01 = c1422aV;
        this.A00.A00 = view;
        if (!this.A00.A0C) {
            this.A00.A06.A0F(c1422aV);
        } else {
            this.A00.A06.A0E(view);
            this.A00.A0M(interfaceC05170o);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05250w
    public final void AAZ(C1422aV c1422aV) {
        JR.A05(A00(31, 25, 11), A00(8, 23, 50), A00(0, 8, 46));
        this.A00.A01.A0E().A3r();
        this.A00.A06.A0D();
        this.A00.A0K();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05250w
    public final void ABb(C1422aV c1422aV, JD jd2) {
        this.A00.A01.A0E().A3q(c1422aV == ((AbstractC1385Zu) this.A00).A00, jd2.A03().getErrorCode());
        if (c1422aV != ((AbstractC1385Zu) this.A00).A00) {
            return;
        }
        this.A00.A0E().removeCallbacks(this.A01);
        this.A00.A0M(c1422aV);
        this.A00.AB6(jd2);
    }
}
