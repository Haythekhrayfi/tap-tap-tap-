package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class TG implements InterfaceC1020Ln {
    public static byte[] A0D;
    public int A00;
    public PQ A01;
    public AnonymousClass74 A02;
    public String A03;
    public final C1337Xw A04;
    public final InterfaceC0937Id A05;
    public final InterfaceC1019Lm A06;
    public final MA A07;
    public final RN A08;
    public final OR A09;
    public final AbstractC1064Nf A0A;
    public final MN A0B;
    public final MB A0C;

    static {
        A03();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 38);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A0D = new byte[]{-49, -29, -30, -35, -34, -38, -49, -25, -17, -8, -11, -15, -6, 0, -32, -5, -9, -15, -6, -68, -70, -84, -107, -88, -69, -80, -67, -84, -118, -69, -88, -119, -68, -69, -69, -74, -75, -73, -86, -91, -90, -80, -118, -81, -75, -90, -77, -76, -75, -86, -75, -94, -83, -122, -73, -90, -81, -75, -99, -112, -117, -116, -106, 115, -106, -114, -114, -116, -103, -2, -15, -20, -19, -9, -43, -40, -52, Ascii.CAN, 11, 6, 7, 17, -11, 7, 7, 13, -10, 11, 15, 7, -66, -79, -84, -83, -73, -99, -102, -108};
    }

    public TG(C1337Xw c1337Xw, MA ma2, InterfaceC0937Id interfaceC0937Id, InterfaceC1019Lm interfaceC1019Lm) {
        AB ab2 = new AB(this);
        this.A0C = ab2;
        A4 a10 = new A4(this);
        this.A0B = a10;
        OR or = new OR() { // from class: com.facebook.ads.redexgen.X.9p
            public static byte[] A01;
            public static String[] A02 = {"OtZHHid0c6Ryk9CDDBq47ngXcNldIUWH", "JwrlVwQ54E2WwwQvkywQUOYHwL6g1bho", "WFiM5IPZvaQ4xMZm5xgvQ3FNROoMY2Kr", "al6ZIECO6LO12zMiuvYELaWNpYKDhozx", "wYAPbQwhGVteNN6MGdL8gA6824n9AnKf", "jTihIhEYsz4XSFMEjn7OlZEBUOzI3KNS", "mXaQIkSzTCVxPQuz9HLogqhmhIjgMyMR", "pEgzTi4rZbqmTwficQat67UuNHBZNbaD"};

            public static String A00(int i10, int i11, int i12) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
                for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
                    bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 86);
                }
                return new String(bArrCopyOfRange);
            }

            public static void A01() {
                byte[] bArr = {17, 4, -1, 0, 10, -28, 9, 15, 0, 13, 14, 15, 4, 15, -4, 7, -32, 17, 0, 9, 15};
                String[] strArr = A02;
                if (strArr[6].charAt(4) != strArr[3].charAt(4)) {
                    throw new RuntimeException();
                }
                A02[2] = "e0kN46odqljBIthjpUkTXG9hdDsWHsKW";
                A01 = bArr;
            }

            static {
                A01();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8Y
            /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass73 anonymousClass73) {
                this.A00.A06.A3z(A00(0, 21, 69), anonymousClass73);
            }
        };
        this.A09 = or;
        AbstractC1064Nf abstractC1064Nf = new AbstractC1064Nf() { // from class: com.facebook.ads.redexgen.X.9j
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8Y
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(OA oa2) {
                this.A00.A07.ABC();
            }
        };
        this.A0A = abstractC1064Nf;
        this.A04 = c1337Xw;
        this.A05 = interfaceC0937Id;
        this.A07 = ma2;
        RN rn = new RN(c1337Xw);
        this.A08 = rn;
        rn.A0c(new C06666p(c1337Xw));
        rn.getEventBus().A03(ab2, a10, or, abstractC1064Nf);
        this.A06 = interfaceC1019Lm;
        rn.setIsFullScreen(true);
        rn.setVolume(1.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(15);
        interfaceC1019Lm.A3P(rn, layoutParams);
        C1023Lq closeButton = new C1023Lq(c1337Xw);
        closeButton.setOnClickListener(new M8(this));
        RelativeLayout.LayoutParams params = closeButton.getDefaultLayoutParams();
        interfaceC1019Lm.A3P(closeButton, params);
    }

    public final void A04(int i10) {
        this.A08.setVideoProgressReportIntervalMs(i10);
    }

    public final void A05(View view) {
        this.A08.setControlsAnchorView(view);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final void A9A(Intent intent, Bundle bundle, C5H c5h) {
        String ctaText = A02(8, 11, 102);
        if (bundle == null) {
            this.A03 = intent.getStringExtra(ctaText);
        } else {
            this.A03 = bundle.getString(ctaText);
        }
        String stringExtra = intent.getStringExtra(A02(19, 18, 33));
        if (stringExtra != null && !stringExtra.isEmpty()) {
            P0 p10 = new P0(this.A04, stringExtra);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            int i10 = (int) (16.0f * Kn.A02);
            layoutParams.setMargins(i10, i10, i10, i10);
            layoutParams.addRule(10);
            layoutParams.addRule(9);
            p10.setOnClickListener(new M9(this));
            this.A06.A3P(p10, layoutParams);
        }
        this.A00 = intent.getIntExtra(A02(77, 13, 124), 0);
        this.A02 = new AnonymousClass74(this.A04, this.A05, this.A08, this.A03, intent.getBundleExtra(A02(58, 11, 1)));
        if (IN.A1X(this.A04)) {
            this.A01 = new PQ(this.A04, this.A05, this.A08, this.A03, null);
        } else {
            this.A01 = null;
        }
        this.A08.setVideoMPD(intent.getStringExtra(A02(69, 8, 98)));
        this.A08.setVideoURI(intent.getStringExtra(A02(90, 8, 34)));
        int i11 = this.A00;
        if (i11 > 0) {
            this.A08.A0Y(i11);
        }
        if (intent.getBooleanExtra(A02(0, 8, 72), false)) {
            this.A08.A0b(PZ.A04, 17);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final void AC8(boolean z10) {
        this.A06.A3z(A02(37, 21, 27), new NI());
        this.A08.A0W();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final void ACY(boolean z10) {
        this.A06.A3z(A02(37, 21, 27), new C1055Mw());
        if (!this.A08.A0j()) {
            this.A08.A0b(PZ.A04, 18);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final void AEi(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final String getCurrentClientToken() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final void onDestroy() {
        this.A06.A3z(A02(37, 21, 27), new M1(this.A00, this.A08.getCurrentPositionInMillis()));
        this.A02.A0d(this.A08.getCurrentPositionInMillis());
        PQ pq = this.A01;
        if (pq != null) {
            pq.A09();
        }
        this.A08.A0Z(1);
        this.A08.A0V();
    }
}
