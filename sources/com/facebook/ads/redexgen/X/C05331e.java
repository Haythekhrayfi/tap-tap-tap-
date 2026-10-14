package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C05331e {
    public static byte[] A05;
    public static String[] A06 = {"jJreqFAWfQsm2UlBXjWleQZy51A8w9r3", "B5vxrqY9e1pfFDILbPSJEQZe5Zep9JAF", "7hwRhDIA2xM98ucsNVPICP0872", "8yYdfjKxcW1uK5E8nS4F9bT", "cwoTvwLLOWGZrFwonmn2qn9xu", "wuc4L", "VoE60CbUCih", "1JGxuEjawtyxaKItdz1AQ1lnM"};
    public C6O A00;
    public NH A01 = NH.A06;
    public ArrayList<OX> A02 = new ArrayList<>();
    public final C1C A03;
    public final InterfaceC05321d A04;

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 96);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A05 = new byte[]{-97, -39, -27, -34, -35, -81, -44, -38, -53, -40, -44, -57, -46, -122, -85, -40, -40, -43, -40, -122, -104, -106, -106, -100, -122, -35, -49, -38, -50, -43, -37, -38, -122, -57, -122, -36, -57, -46, -49, -54, -122, -89, -54, -81, -44, -52, -43, -108, Ascii.US, 34, Ascii.GS, 34, Ascii.US, 50, Ascii.US, Ascii.GS, 32, 51, 44, 34, 42, 35, -45, -30, -37, -59, -54, -61, -53, -48, -63, -46, -61, -44, -61, -49, -43, -42, -37, -44, -36, -31, -40, -41, -76, -41, -73, -44, -25, -44, -75, -24, -31, -41, -33, -40, -38, -33, -27, -42, -29, -28, -27, -38, -27, -38, -46, -35};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A0J(C1337Xw c1337Xw, EnumSet<CacheFlag> enumSet) {
        if (A0E() == EnumC0970Jm.A03) {
            C1402aB c1402aB = (C1402aB) this.A03;
            AbstractC1404aD abstractC1404aDA0k = c1402aB.A0k();
            if (A0C(c1337Xw, abstractC1404aDA0k) || abstractC1404aDA0k == null) {
                return;
            }
            this.A04.AEA();
            A0A(c1337Xw, enumSet, c1402aB, abstractC1404aDA0k, 0, this.A04);
            return;
        }
        if (A0C(c1337Xw, (AbstractC1404aD) this.A03)) {
            return;
        }
        this.A04.AEA();
        if (A0E() == EnumC0970Jm.A0B) {
            A08(c1337Xw, (C0857Ey) this.A03);
        } else {
            A09(c1337Xw, enumSet, (C0857Ey) this.A03, -1, this.A04);
        }
    }

    static {
        A06();
    }

    public C05331e(C1337Xw c1337Xw, C05461r c05461r, InterfaceC05321d interfaceC05321d, String str) {
        JSONObject dataObject = c05461r.A03();
        this.A03 = A01(c1337Xw, c05461r, str, dataObject);
        this.A04 = interfaceC05321d;
    }

    private AdError A00(C1337Xw c1337Xw, AbstractC1404aD abstractC1404aD) {
        if (abstractC1404aD == null || abstractC1404aD.A0u().isEmpty()) {
            c1337Xw.A07().A9K(A04(62, 3, 18), C06937v.A0Z, new C06947w(A04(5, 43, 6)));
            return AdError.internalError(AdError.INTERNAL_ERROR_2006);
        }
        return null;
    }

    public static C1C A01(C1337Xw c1337Xw, C05461r c05461r, String str, JSONObject jSONObject) {
        C1C c1cA02 = null;
        if (jSONObject.has(A04(65, 12, 2))) {
            try {
                c1cA02 = C1402aB.A03(jSONObject, c1337Xw, true);
                c1cA02.A0W(true);
                c1cA02.A0T(A04(96, 12, 17));
            } catch (JSONException unused) {
            }
        }
        if (c1cA02 == null) {
            c1cA02 = C0857Ey.A02(jSONObject, c1337Xw);
        }
        c1cA02.A0S(str);
        C8E c8eA01 = c05461r.A01();
        if (c8eA01 != null) {
            c1cA02.A0P(c8eA01.A06());
        }
        return c1cA02;
    }

    private C6O A03(C1337Xw c1337Xw) {
        C6O c6o = this.A00;
        return c6o != null ? c6o : new C6O(c1337Xw);
    }

    private void A08(C1337Xw c1337Xw, C0857Ey c0857Ey) {
        C1Y playableData = c0857Ey.A0n().A0D().A06();
        A0B(playableData != null ? playableData.A0A() : NH.A06);
        C1393a2 c1393a2 = new C1393a2(this);
        C6O c6o = new C6O(c1337Xw);
        boolean z10 = IN.A1i(c1337Xw) && C06445o.A0A(c0857Ey.A0O());
        if (z10) {
            C06445o unifiedAssetsLoader = new C06445o(c6o, c0857Ey.A0O(), c0857Ey.A0K(), c0857Ey.A0M(), z10, new C1392a1(this));
            c6o.A0d(new C0945Il(c0857Ey.A0s(), c1337Xw.A09()));
            unifiedAssetsLoader.A0B();
            return;
        }
        C05431o.A02(c1337Xw, c0857Ey, true, c1393a2);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0094  */
    private void A09(C1337Xw c1337Xw, EnumSet<CacheFlag> enumSet, AbstractC1404aD abstractC1404aD, int i10, InterfaceC05321d interfaceC05321d) {
        Iterator<String> it;
        boolean zA0c = abstractC1404aD.A0c();
        C6O c6oA03 = A03(c1337Xw);
        c6oA03.A0d(new C0945Il(abstractC1404aD.A0s(), c1337Xw.A09()));
        boolean z10 = IN.A1i(c1337Xw) && C06445o.A0A(abstractC1404aD.A0O());
        if (A06[3].length() == 32) {
            throw new RuntimeException();
        }
        A06[5] = "QkQhg";
        if (z10) {
            new C06445o(c6oA03, abstractC1404aD.A0O(), abstractC1404aD.A0K(), abstractC1404aD.A0M(), z10, new C1396a5(this, c1337Xw, zA0c, abstractC1404aD, interfaceC05321d)).A0B();
            return;
        }
        String strA04 = A04(96, 12, 17);
        String[] strArr = A06;
        if (strArr[1].charAt(24) != strArr[0].charAt(24)) {
            String[] strArr2 = A06;
            strArr2[1] = "jVhVjw8PHVLop7GyU0UYPYiA56KfUjA6";
            strArr2[0] = "lzrrt2iICm45JkiVqVLOf6p257fg56KP";
            if (zA0c) {
                C6K c6k = new C6K(abstractC1404aD.A0H(), abstractC1404aD.A0M(), strA04);
                c6k.A04 = true;
                c6k.A03 = A04(0, 5, 17);
                c6oA03.A0X(c6k);
            }
        } else {
            String[] strArr3 = A06;
            strArr3[7] = "mMtIDEEqjJJ695eeXDndb9bWh";
            strArr3[4] = "Ebj8lqyUqzLrB8iZ5jF9tO70n";
            if (zA0c) {
                C6K c6k2 = new C6K(abstractC1404aD.A0H(), abstractC1404aD.A0M(), strA04);
                c6k2.A04 = true;
                c6k2.A03 = A04(0, 5, 17);
                c6oA03.A0X(c6k2);
            }
        }
        c6oA03.A0c(new C6M(abstractC1404aD.A0q().A01(), P1.A04, P1.A04, abstractC1404aD.A0M(), A04(96, 12, 17)));
        boolean zContains = enumSet.contains(CacheFlag.VIDEO);
        int i11 = 0;
        boolean zA2M = IN.A2M(c1337Xw, Q9.A03());
        for (C1D adInfo : abstractC1404aD.A0u()) {
            C6M c6m = new C6M(adInfo.A0D().A07(), C05391k.A00(adInfo.A0D()), C05391k.A01(adInfo.A0D()), abstractC1404aD.A0M(), A04(96, 12, 17));
            if (i11 == 0) {
                c6oA03.A0b(c6m);
            } else {
                c6oA03.A0c(c6m);
            }
            List<String> listA01 = adInfo.A0G().A01();
            String[] strArr4 = A06;
            if (strArr4[6].length() != strArr4[2].length()) {
                String[] strArr5 = A06;
                strArr5[1] = "D8Za7DAeUKhUMlH0nChh1nyf5MUepOev";
                strArr5[0] = "YMJugZMvnGL61TcEtQKO8oN05ixDNSHw";
                it = listA01.iterator();
            } else {
                it = listA01.iterator();
            }
            while (it.hasNext()) {
                c6oA03.A0c(new C6M(it.next(), -1, -1, abstractC1404aD.A0M(), A04(96, 12, 17)));
            }
            if (zContains && !TextUtils.isEmpty(adInfo.A0D().A08())) {
                C6K c6k3 = new C6K(adInfo.A0D().A08(), abstractC1404aD.A0M(), A04(96, 12, 17), adInfo.A0D().A05());
                c6k3.A04 = false;
                if (i11 == 0) {
                    if (zA0c && !zA2M) {
                        c6oA03.A0X(c6k3);
                    } else {
                        c6oA03.A0a(c6k3);
                    }
                } else if (zA0c && !zA2M) {
                    c6oA03.A0Y(c6k3);
                } else {
                    c6oA03.A0Z(c6k3);
                }
            }
            i11++;
        }
        c6oA03.A0W(new C1394a3(this, c1337Xw, zA0c, abstractC1404aD, interfaceC05321d), new C6H(abstractC1404aD.A0M(), strA04, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A(C1337Xw c1337Xw, EnumSet<CacheFlag> enumSet, C1402aB c1402aB, AbstractC1404aD abstractC1404aD, int i10, InterfaceC05321d interfaceC05321d) {
        A09(c1337Xw, enumSet, abstractC1404aD, i10, new C1398a7(this, c1337Xw, abstractC1404aD, c1402aB, i10, interfaceC05321d, enumSet));
    }

    private void A0B(NH nh) {
        this.A01 = nh;
    }

    private boolean A0C(C1337Xw c1337Xw, AbstractC1404aD abstractC1404aD) {
        AdError adErrorA00 = A00(c1337Xw, abstractC1404aD);
        if (adErrorA00 != null) {
            InterfaceC05321d interfaceC05321d = this.A04;
            String[] strArr = A06;
            if (strArr[1].charAt(24) != strArr[0].charAt(24)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[1] = "Dm6wm58uJ8qXwjtNx8Vtzbsb5Jkw9mit";
            strArr2[0] = "fLwuuFNg4tiwPdo6hP9t6x3v5l5Hcavg";
            interfaceC05321d.AAE(adErrorA00);
            return true;
        }
        return false;
    }

    public final C1C A0D() {
        return this.A03;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ab, code lost:
    
        if (r3 != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00af, code lost:
    
        return com.facebook.ads.redexgen.X.EnumC0970Jm.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b7, code lost:
    
        if (r3 != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bc, code lost:
    
        return com.facebook.ads.redexgen.X.EnumC0970Jm.A0A;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.ads.redexgen.X.EnumC0970Jm A0E() {
        /*
            r4 = this;
            com.facebook.ads.redexgen.X.1C r0 = r4.A03
            boolean r0 = r0.A0b()
            if (r0 == 0) goto Lb
            com.facebook.ads.redexgen.X.Jm r0 = com.facebook.ads.redexgen.X.EnumC0970Jm.A03
            return r0
        Lb:
            com.facebook.ads.redexgen.X.1C r3 = r4.A03
            com.facebook.ads.redexgen.X.aD r3 = (com.facebook.ads.redexgen.X.AbstractC1404aD) r3
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C05331e.A06
            r0 = 6
            r1 = r2[r0]
            r0 = 2
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L50
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C05331e.A06
            java.lang.String r1 = "f4kXngrP8CD5dz"
            r0 = 3
            r2[r0] = r1
            boolean r0 = r3.A0c()
            if (r0 == 0) goto L31
            com.facebook.ads.redexgen.X.Jm r0 = com.facebook.ads.redexgen.X.EnumC0970Jm.A05
            return r0
        L31:
            java.util.List r0 = r3.A0u()
            int r1 = r0.size()
            r0 = 1
            if (r1 <= r0) goto L5e
            com.facebook.ads.redexgen.X.Jm r3 = com.facebook.ads.redexgen.X.EnumC0970Jm.A09
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C05331e.A06
            r0 = 7
            r1 = r2[r0]
            r0 = 4
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L56
        L50:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L56:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C05331e.A06
            java.lang.String r1 = "ny"
            r0 = 3
            r2[r0] = r1
            return r3
        L5e:
            com.facebook.ads.redexgen.X.1D r0 = r3.A0n()
            com.facebook.ads.redexgen.X.1G r0 = r0.A0D()
            com.facebook.ads.redexgen.X.1Y r0 = r0.A06()
            if (r0 == 0) goto L8e
            com.facebook.ads.redexgen.X.Jm r3 = com.facebook.ads.redexgen.X.EnumC0970Jm.A0B
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C05331e.A06
            r0 = 6
            r1 = r2[r0]
            r0 = 2
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L88
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C05331e.A06
            java.lang.String r1 = "JH"
            r0 = 3
            r2[r0] = r1
            return r3
        L88:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L8e:
            boolean r3 = r4.A0L(r3)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C05331e.A06
            r0 = 3
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 32
            if (r1 == r0) goto Lb0
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C05331e.A06
            java.lang.String r1 = "93R6MUXHMTxUt8WfLt1oZ3ea5zubl3sl"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "9xXPI1nVQC4CSUB4soKlPH985bh9DAt9"
            r0 = 0
            r2[r0] = r1
            if (r3 == 0) goto Lba
        Lad:
            com.facebook.ads.redexgen.X.Jm r0 = com.facebook.ads.redexgen.X.EnumC0970Jm.A0C
            return r0
        Lb0:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C05331e.A06
            java.lang.String r1 = "ySAy4b6nQ"
            r0 = 3
            r2[r0] = r1
            if (r3 == 0) goto Lba
            goto Lad
        Lba:
            com.facebook.ads.redexgen.X.Jm r0 = com.facebook.ads.redexgen.X.EnumC0970Jm.A0A
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C05331e.A0E():com.facebook.ads.redexgen.X.Jm");
    }

    public final NH A0F() {
        return this.A01;
    }

    public final String A0G() {
        if (this.A03.A0b()) {
            return ((C1402aB) this.A03).A0n();
        }
        return ((AbstractC1404aD) this.A03).A0s();
    }

    public final void A0H() {
        this.A04.AFq();
    }

    public final void A0I(Intent intent, RewardData rewardData, String str) {
        this.A03.A0R(rewardData);
        this.A03.A0U(str);
        if (A0D().A0b()) {
            intent.putExtra(A04(77, 19, 19), this.A03);
        }
        intent.putExtra(A04(48, 14, 94), this.A03);
    }

    public final boolean A0K() {
        return this.A03.A0Y();
    }

    public final boolean A0L(AbstractC1404aD abstractC1404aD) {
        return !TextUtils.isEmpty(abstractC1404aD.A0n().A0D().A08());
    }
}
