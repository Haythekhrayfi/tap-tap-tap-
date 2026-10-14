package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.view.View;
import com.applovin.exoplayer2.common.base.Ascii;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1467bL {
    public InterfaceC1470bO A00;
    public InterfaceC1468bM A01;
    public C1455b9 A02;
    public final InterfaceC1477bV A04;
    public final InterfaceC1469bN A05;
    public final LinkedHashMap<Integer, Runnable> A06 = new LinkedHashMap<>();
    public final InterfaceC1468bM A03 = new C0880Fv(this);

    public C1467bL(InterfaceC1477bV interfaceC1477bV, InterfaceC1469bN interfaceC1469bN) {
        this.A04 = interfaceC1477bV;
        this.A05 = interfaceC1469bN;
    }

    public static C1467bL A01() {
        return new C1467bL(new C0884Fz(), null);
    }

    private void A03(AbstractC1471bP abstractC1471bP, InterfaceC1475bT interfaceC1475bT, InterfaceC0879Fu interfaceC0879Fu) {
        C1455b9 c1455b9A00 = C1455b9.A00(abstractC1471bP, interfaceC1475bT, interfaceC0879Fu);
        this.A02 = c1455b9A00;
        InterfaceC1470bO interfaceC1470bO = this.A00;
        if (interfaceC1470bO != null) {
            c1455b9A00.A03(interfaceC1470bO);
        }
        this.A02.A04(this.A03);
    }

    public final void A04(View view) {
        this.A02.A01(view);
    }

    public final void A05(View view, C1473bR c1473bR) {
        this.A02.A02(view, c1473bR);
    }

    public final void A06(AbstractC1471bP abstractC1471bP, View view) {
        C0881Fw c0881Fw = new C0881Fw(view, this.A04);
        final InterfaceC1469bN interfaceC1469bN = this.A05;
        A03(abstractC1471bP, c0881Fw, new InterfaceC0879Fu(interfaceC1469bN) { // from class: com.facebook.ads.redexgen.X.3d
            public static byte[] A09;
            public static String[] A0A = {"okBgSYhQGmV0QyU32992deBLR6XrdaZQ", "E", "ZDdZ5rthnspWTI3gzSJHBR7aYCyAxUsq", "EsXM2pc2I6J3hYC1V9OQRTCtALa8wmqB", "DKA0ex9266tXplnV6PUb8C0vdYHWYjG4", "tBgdKBpc94v7LWesC8aTGIaQqZdJYwjy", "iZindrm9v6DBRttH7DMzAa7", "d9237vu9oQoOcpvZwewcjFUDz74P7MIA"};
            public static final String A0B;
            public long A00;
            public InterfaceC1470bO A01;
            public final InterfaceC1469bN A02;
            public final Map<String, C1459bD> A06 = new HashMap();
            public final C1460bE A04 = new C1460bE();
            public final C1460bE A03 = new C1460bE();
            public final List<Rect> A05 = new ArrayList(1);
            public final boolean A08 = false;
            public final boolean A07 = false;

            public static String A02(int i10, int i11, int i12) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
                for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
                    bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 91);
                }
                return new String(bArrCopyOfRange);
            }

            public static void A03() {
                A09 = new byte[]{41, 21, 20, 14, 93, 11, 20, Ascii.CAN, 10, 13, 18, 20, 19, 9, 93, 21, Ascii.FS, 14, 93, 19, 18, 9, 93, Ascii.US, Ascii.CAN, Ascii.CAN, 19, 93, 16, Ascii.CAN, Ascii.FS, 14, 8, 15, Ascii.CAN, Ascii.EM, 93, 18, 15, 93, 20, 14, 93, Ascii.FS, 93, Ascii.SUB, 15, 18, 8, 13, 93, 10, 21, 20, Ascii.RS, 21, 93, 10, 20, 17, 17, 93, 19, Ascii.CAN, 11, Ascii.CAN, 15, 93, 15, Ascii.CAN, 9, 8, 15, 19, 93, Ascii.FS, 93, 16, Ascii.CAN, Ascii.FS, 14, 8, 15, Ascii.CAN, 16, Ascii.CAN, 19, 9, 93, 14, 20, 19, Ascii.RS, Ascii.CAN, 93, 20, 9, 90, 14, 93, 16, Ascii.FS, Ascii.EM, Ascii.CAN, 93, 8, 13, 93, 18, Ascii.ESC, 93, 14, 8, Ascii.US, 11, 20, Ascii.CAN, 10, 14, 93, 9, 21, Ascii.FS, 9, 93, Ascii.RS, 18, 8, 17, Ascii.EM, 93, Ascii.US, Ascii.CAN, 93, 18, Ascii.ESC, Ascii.ESC, 14, Ascii.RS, 15, Ascii.CAN, Ascii.CAN, 19, 118, 125, 111, 75, 123, 121, 118, 63, 36, 61, 61, 113, 39, 56, 52, 38, 113, 33, 35, 62, 33, 52, 35, 37, 40, 113, 55, 62, 35, 113, 35, 52, 60, 62, 39, 52, 53, 113, 56, 37, 52, 60, 113, 125, 97, 104, 122, 92, 107, 126, 97, 124, 122};
            }

            static {
                A03();
                A0B = C05833d.class.getSimpleName();
            }

            {
                this.A02 = interfaceC1469bN;
            }

            public static Rect A00(C1459bD c1459bD) {
                if (c1459bD != null && c1459bD.A02.top != Integer.MIN_VALUE && c1459bD.A02.left != Integer.MIN_VALUE) {
                    Rect rect = c1459bD.A02;
                    String[] strArr = A0A;
                    if (strArr[1].length() == strArr[6].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A0A;
                    strArr2[1] = "p";
                    strArr2[6] = "Kr6mbDoiLKwWSgNyXDF2oJW";
                    if (rect.right != Integer.MIN_VALUE && c1459bD.A02.bottom != Integer.MIN_VALUE) {
                        return c1459bD.A02;
                    }
                }
                throw new IllegalStateException(A02(0, 143, 38));
            }

            private C1459bD A01(C1473bR c1473bR, Rect rect, Rect rect2) {
                C1459bD c1459bDA03 = this.A06.get(c1473bR.A04);
                if (this.A04.A06(c1473bR)) {
                    if (c1459bDA03 != null) {
                        c1459bDA03.A01 = EnumC1463bH.A04;
                    } else {
                        c1459bDA03 = C1459bD.A03(this.A00);
                        this.A06.put(c1473bR.A04, c1459bDA03);
                    }
                }
                c1459bDA03.A02.set(rect2);
                c1459bDA03.A03.add(new Rect(rect));
                return c1459bDA03;
            }

            private void A04(C1460bE c1460bE) {
                for (C1473bR c1473bR : c1460bE.A01()) {
                    C1459bD c1459bD = this.A06.get(c1473bR.A04);
                    if (c1459bD == null) {
                        if (this.A02 != null) {
                            String str = A02(150, 36, 10) + c1473bR.A04;
                            throw new NullPointerException(A02(186, 10, 85));
                        }
                    } else {
                        c1459bD.A01 = EnumC1463bH.A03;
                        c1459bD.A03.clear();
                        c1473bR.A03(this);
                        if (this.A08) {
                            Map<String, C1459bD> map = this.A06;
                            String[] strArr = A0A;
                            if (strArr[0].charAt(8) == strArr[2].charAt(8)) {
                                throw new RuntimeException();
                            }
                            String[] strArr2 = A0A;
                            strArr2[0] = "dCpYPRypiVOHB4OlkAqBqk8EySqTLE1k";
                            strArr2[2] = "r3sjB169HJX8vOmMpko73ANLsggTEmi2";
                            map.remove(c1459bD);
                        } else {
                            continue;
                        }
                    }
                }
            }

            private void A05(C1460bE c1460bE) {
                Iterator it = c1460bE.A00().iterator();
                while (it.hasNext()) {
                    ((C1473bR) it.next()).A03(this);
                }
            }

            @Override // com.facebook.ads.redexgen.X.InterfaceC0879Fu
            public final void A3Q(C1473bR c1473bR, Rect rect, Rect rect2) {
                A01(c1473bR, rect, rect2);
                C1473bR c1473bR2 = c1473bR.A01;
                C1473bR parentViewpointData = C1473bR.A08;
                if (c1473bR2 == parentViewpointData) {
                    return;
                }
                boolean zA06 = this.A03.A06(c1473bR2);
                C1459bD parentViewProperties = this.A06.get(c1473bR2.A04);
                if (zA06) {
                    if (parentViewProperties == null) {
                        parentViewProperties = C1459bD.A03(this.A00);
                        parentViewProperties.A02.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
                        this.A06.put(c1473bR2.A04, parentViewProperties);
                    } else {
                        parentViewProperties.A03.clear();
                        if (!this.A07 || c1473bR2.A04()) {
                            parentViewProperties.A01 = EnumC1463bH.A04;
                        }
                    }
                }
                parentViewProperties.A03.add(new Rect(rect));
            }

            @Override // com.facebook.ads.redexgen.X.InterfaceC0879Fu
            public final void A3w(long j10, List<Rect> viewportRects) {
                this.A00 = j10;
                this.A05.clear();
                Iterator<Rect> it = viewportRects.iterator();
                while (it.hasNext()) {
                    this.A05.add(new Rect(it.next()));
                }
                Iterator it2 = this.A04.A01().iterator();
                while (it2.hasNext()) {
                    this.A06.remove(((C1473bR) it2.next()).A04);
                }
                Iterator it3 = this.A03.A01().iterator();
                while (it3.hasNext()) {
                    this.A06.remove(((C1473bR) it3.next()).A04);
                }
                Iterator<C1459bD> it4 = this.A06.values().iterator();
                while (it4.hasNext()) {
                    it4.next().A03.clear();
                }
                this.A04.A04();
                this.A03.A04();
            }

            @Override // com.facebook.ads.redexgen.X.InterfaceC0879Fu
            public final void A5T() {
                A05(this.A04);
                A04(this.A04);
                A05(this.A03);
                A04(this.A03);
                if (this.A01 != null) {
                    new C1458bC(toString(), this, this.A05, this.A04.A00(), this.A03.A00());
                    throw new NullPointerException(A02(143, 7, 67));
                }
            }

            @Override // com.facebook.ads.redexgen.X.InterfaceC1462bG
            public final void A70(C1473bR c1473bR, Rect rect) {
                rect.setEmpty();
                Iterator it = this.A06.get(c1473bR.A04).A03.iterator();
                while (it.hasNext()) {
                    rect.union((Rect) it.next());
                }
            }

            @Override // com.facebook.ads.redexgen.X.InterfaceC1462bG
            public final EnumC1463bH A89(C1473bR c1473bR) {
                return this.A06.get(c1473bR.A04).A01;
            }

            @Override // com.facebook.ads.redexgen.X.InterfaceC1462bG
            public final void A8B(Rect rect) {
                rect.setEmpty();
                Iterator<Rect> it = this.A05.iterator();
                while (it.hasNext()) {
                    rect.union(it.next());
                }
            }

            @Override // com.facebook.ads.redexgen.X.InterfaceC1462bG
            public final float A8C(C1473bR c1473bR) {
                C1459bD c1459bD = this.A06.get(c1473bR.A04);
                if (c1459bD != null) {
                    Rect rectA00 = A00(c1459bD);
                    int iHeight = rectA00.height() * rectA00.width();
                    int totalVisibleArea = 0;
                    for (Rect rect : c1459bD.A03) {
                        totalVisibleArea += rect.height() * rect.width();
                    }
                    return totalVisibleArea / iHeight;
                }
                return StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            }

            @Override // com.facebook.ads.redexgen.X.InterfaceC0879Fu
            public final void AFL(InterfaceC1470bO interfaceC1470bO) {
                this.A01 = interfaceC1470bO;
            }
        });
    }
}
