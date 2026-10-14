package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.applovin.exoplayer2.common.base.Ascii;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class PD extends FrameLayout {
    public static byte[] A0C;
    public static String[] A0D = {"2LrpfYyae0azpeRldXrTpIs5j5WolZYJ", "aTWFoH17M5HvBaS06GyoTMgY8LK09kB1", "ZT9jJV1ne", "vwbwskwEgIVHj6V8wHV", "a8UIfMhCahgZVDol7QIaAFMNjSR7v8Rm", "pauq9xVSe1TSbn6Nh8iDWIypG", "tig0s2h3zWgeN1kA13N6tuAlrnUP1dby", "gu60Pcp0oAdbO9RcUpkXMIBgrMh0CW0V"};
    public static final float A0E;
    public static final RelativeLayout.LayoutParams A0F;
    public int A00;
    public long A01;
    public Map<String, String> A02;
    public final AbstractC1404aD A03;
    public final C1Y A04;
    public final C1337Xw A05;
    public final InterfaceC0937Id A06;
    public final N6 A07;
    public final C1214Sz A08;
    public final PB A09;
    public final AtomicBoolean A0A;
    public final AtomicBoolean A0B;

    public static String A06(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            int i14 = bArrCopyOfRange[i13] ^ i12;
            if (A0D[5].length() != 25) {
                throw new RuntimeException();
            }
            A0D[4] = "2xsSJQdmJTzWNKbVkLPVv70adF3crTtp";
            bArrCopyOfRange[i13] = (byte) (i14 ^ 37);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A0C = new byte[]{11, 47, Ascii.GS, 33, 44, 52, 44, 47, 33, 40, 12, 41, 52, 5, 22, 23, 13, 10, 3, 68, 1, 22, 22, 11, 22, 52, 8, 5, Ascii.GS, 5, 6, 8, 1, 68, 0, 11, 39, 16, 5, 39, 8, 13, 7, 15, 68, 16, 22, 13, 3, 3, 1, 22, 1, 0, 68, 19, 13, 16, 12, 68, 20, 22, 1, 73, 1, 18, 1, 10, 16, 68, 7, 8, 13, 7, 15, 23, 68, 7, 11, 17, 10, 16, 68, 5, 10, 0, 68, 32, 1, 8, 5, Ascii.GS, 106, 86, 91, 67, 91, 88, 86, 95, 123, 94, 73, 108, 83, 95, 77, 102, 97, 99, 109, 106, 36, 104, 107, 101, 96, 109, 106, 99, 36, 118, 97, 105, 107, 112, 97, 36, 116, 104, 101, 125, 101, 102, 104, 97, 61, 50, 55, 61, 53, 45, 112, 113, 120, 117, 109, 93, 65, 76, 84, 76, 79, 65, 72, 55, 43, 38, 62, 38, 37, 43, 34, Ascii.CAN, 53, 34, 42, 40, 51, 34, 21, 2, 10, 8, 19, 2, 56, 20, 2, 20, 20, 14, 8, 9, 56, 14, 3, 20, 15, 11, 5, 14, 107, 121, 126, 67, 106, 117, 121, 107};
    }

    static {
        A09();
        A0E = (int) (Kn.A02 * 4.0f);
        A0F = new RelativeLayout.LayoutParams(-1, -1);
    }

    public PD(C1337Xw c1337Xw, AbstractC1404aD abstractC1404aD, C1Y c1y, InterfaceC0937Id interfaceC0937Id, PB pb2, Map<String, String> playableMetricsData) {
        super(c1337Xw);
        this.A0A = new AtomicBoolean(false);
        this.A0B = new AtomicBoolean(false);
        this.A01 = -1L;
        this.A00 = 0;
        this.A07 = new T2() { // from class: com.facebook.ads.redexgen.X.7E
            @Override // com.facebook.ads.redexgen.X.N6
            public final void AAN() {
            }

            @Override // com.facebook.ads.redexgen.X.T2, com.facebook.ads.redexgen.X.N6
            public final void ABB(int i10, String str) {
                this.A00.A0B.set(true);
                this.A00.A09.ABj();
            }

            @Override // com.facebook.ads.redexgen.X.T2, com.facebook.ads.redexgen.X.N6
            public final void ABO() {
                if (this.A00.A0B.get() || !this.A00.A0A.compareAndSet(false, true)) {
                    return;
                }
                this.A00.A09.ABO();
            }

            @Override // com.facebook.ads.redexgen.X.N6
            public final void ADO() {
                this.A00.A09.ADO();
            }
        };
        this.A05 = c1337Xw;
        this.A03 = abstractC1404aD;
        this.A04 = c1y;
        this.A06 = interfaceC0937Id;
        this.A09 = pb2;
        this.A02 = playableMetricsData;
        C1214Sz c1214SzA04 = A04();
        this.A08 = c1214SzA04;
        if (IN.A1W(c1337Xw)) {
            c1337Xw.A0A().AFz(c1214SzA04, abstractC1404aD.A0s(), false);
        }
        addView(c1214SzA04, A0F);
    }

    public static /* synthetic */ int A00(PD pd2) {
        int i10 = pd2.A00;
        pd2.A00 = i10 + 1;
        return i10;
    }

    private C1214Sz A04() {
        C1214Sz c1214Sz = new C1214Sz(this.A05, (WeakReference<N6>) new WeakReference(this.A07), 10, IN.A1d(this.A05));
        c1214Sz.setCornerRadius(A0E);
        c1214Sz.setLogMultipleImpressions(false);
        c1214Sz.setCheckAssetsByJavascriptBridge(false);
        c1214Sz.setWebViewTimeoutInMillis(this.A04.A08());
        c1214Sz.setRequestId(this.A03.A0M());
        c1214Sz.setOnTouchListener(new PC(this));
        WebSettings settings = c1214Sz.getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setAllowFileAccess(true);
        if (Build.VERSION.SDK_INT >= 16) {
            settings.setAllowFileAccessFromFileURLs(true);
        }
        if (Build.VERSION.SDK_INT > 16) {
            c1214Sz.addJavascriptInterface(new PE(this.A05, this, this.A06, this.A02, this.A03.A0s()), A06(0, 12, 104));
        }
        return c1214Sz;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00b8, code lost:
    
        if (r3 <= com.facebook.ads.redexgen.X.IN.A0H(r8)) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ba, code lost:
    
        r3 = r9.A09;
        r2 = com.facebook.ads.redexgen.X.PD.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ce, code lost:
    
        if (r2[0].charAt(14) == r2[7].charAt(14)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00d0, code lost:
    
        r3.AAn();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00d3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00d4, code lost:
    
        r2 = com.facebook.ads.redexgen.X.PD.A0D;
        r2[0] = "1qrV4xG42mjJ5wR1PYF4mguO0xYm8sMw";
        r2[7] = "To2gWJFbGkwQ4PRGYAw3BZd3UXo54AHv";
        r3.AAn();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00f2, code lost:
    
        if (r3 <= com.facebook.ads.redexgen.X.IN.A0H(r8)) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00f5, code lost:
    
        r6.A03(0);
        r9.A05.A07().A9K(r5, com.facebook.ads.redexgen.X.C06937v.A2D, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0A() {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.PD.A0A():void");
    }

    public final void A0B() {
        String strA0E;
        if (this.A04.A0J()) {
            C06947w c06947w = new C06947w(A06(107, 29, 33));
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(A06(170, 17, 66), this.A04.A0F());
                jSONObject.put(A06(187, 5, 69), this.A03.A0s());
            } catch (JSONException e10) {
                Log.e(A06(92, 15, 31), A06(12, 13, 65), e10);
            }
            c06947w.A05(jSONObject);
            c06947w.A03(1);
            InterfaceC06927u interfaceC06927uA07 = this.A05.A07();
            if (A0D[4].charAt(0) == 'P') {
                throw new RuntimeException();
            }
            A0D[1] = "TEDpWyR4sKSlO4xRZxixfnQAFgDgpHMF";
            int i10 = C06937v.A2F;
            String strA06 = A06(155, 15, 98);
            interfaceC06927uA07.A9L(strA06, i10, c06947w);
            if (IN.A0o(this.A05) && LD.A00(this.A05) == LC.A07) {
                this.A05.A07().A9L(strA06, C06937v.A2E, c06947w);
                this.A07.ABB(0, null);
                return;
            }
        }
        try {
            C1214Sz c1214Sz = this.A08;
            if (!TextUtils.isEmpty(this.A04.A0B())) {
                strA0E = this.A04.A0B();
            } else {
                strA0E = this.A04.A0E();
            }
            c1214Sz.loadUrl(strA0E);
        } catch (Exception e11) {
            this.A05.A07().A9K(A06(192, 8, 57), C06937v.A2c, new C06947w(e11));
        }
    }

    public final void A0C() {
        if (IN.A1W(this.A05)) {
            C1337Xw c1337Xw = this.A05;
            if (A0D[2].length() == 31) {
                throw new RuntimeException();
            }
            A0D[1] = "2a9geg5CZy9bcTekyOeVTlcxLNQduX9G";
            c1337Xw.A0A().AFo(this.A08);
        }
        this.A08.removeJavascriptInterface(A06(0, 12, 104));
        if (A0D[3].length() != 23) {
            A0D[6] = "33aduEcFLWt6pdjLdZ5sJJvVvr5WDkst";
            this.A08.destroy();
        } else {
            this.A08.destroy();
        }
    }

    public LG getTouchDataRecorder() {
        return this.A08.getTouchDataRecorder();
    }

    public QR getViewabilityChecker() {
        return this.A08.getViewabilityChecker();
    }
}
