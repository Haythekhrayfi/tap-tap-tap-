package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.widget.FrameLayout;
import com.applovin.exoplayer2.common.base.Ascii;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class OP extends FrameLayout {
    public static byte[] A0L;
    public static String[] A0M = {"tg98T7YqorVxljyy5rC9rRviyjZQ3PWt", "vfHBQfbeXMWpx0Lt9J2p4bolhXFdVoUD", "nuD8gLvjahybAxP4K7AI7EnQPexhi40p", "Mle9DIn2BhVQrDGkT0Ym6c4cXgC65WVc", "K7R1lop0AG70QQAdOPTNlaEDkQeUTiOI", "yRh0uKXr8zSd48KJrOgjFYKLFGGCRN1w", "QQOq4rDYvkiUVU0ErOwgNbjJJCuazTiH", "YmsKh0Z7MVbEzdUA2tq2qo4jdnYDOoVM"};
    public PZ A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final AbstractC1404aD A05;
    public final C6O A06;
    public final C1337Xw A07;
    public final C0945Il A08;
    public final InterfaceC1019Lm A09;
    public final MF A0A;
    public final OO A0B;
    public final PQ A0C;
    public final RN A0D;
    public final AnonymousClass74 A0E;
    public final OR A0F;
    public final AbstractC1064Nf A0G;
    public final MN A0H;
    public final MB A0I;
    public final M3 A0J;
    public final M2 A0K;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0L, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 38);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0C() {
        A0L = new byte[]{5, 19, 20, 20, 3, 8, 18, 50, 15, 11, 3, 78, 95, 88, 75, 94, 67, 69, 68, 95, 71, 70, 87, 86, 98, 115, 103, 97, 119, 118, 80, 107, 71, 97, 119, 96, 38, 36, 57, 49, 36, 51, 37, 37};
    }

    static {
        A0C();
    }

    public OP(C1337Xw c1337Xw, InterfaceC0937Id interfaceC0937Id, AbstractC1404aD abstractC1404aD, C6O c6o, C0945Il c0945Il, InterfaceC1019Lm interfaceC1019Lm, MF mf, OO oo) {
        super(c1337Xw);
        M3 m10 = new M3() { // from class: com.facebook.ads.redexgen.X.92
            public static byte[] A01;

            static {
                A01();
            }

            public static String A00(int i10, int i11, int i12) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
                for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
                    bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 5);
                }
                return new String(bArrCopyOfRange);
            }

            public static void A01() {
                A01 = new byte[]{16, 18, 5, 16, 1, 18, 5, 4};
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8Y
            /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
            public final void A03(M6 m11) {
                this.A00.A03 = true;
                this.A00.A0B.ADD(A00(0, 8, 101), this.A00.A03());
            }
        };
        this.A0J = m10;
        MB mb2 = new MB() { // from class: com.facebook.ads.redexgen.X.91
            public static byte[] A01;

            static {
                A01();
            }

            public static String A00(int i10, int i11, int i12) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
                for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
                    bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 15);
                }
                return new String(bArrCopyOfRange);
            }

            public static void A01() {
                A01 = new byte[]{65, 93, 80, 72};
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8Y
            /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
            public final void A03(MC mc2) {
                this.A00.A04 = true;
                this.A00.A0B.ADD(A00(0, 4, 62), this.A00.A03());
            }
        };
        this.A0I = mb2;
        MN mn = new MN() { // from class: com.facebook.ads.redexgen.X.90
            public static byte[] A01;

            static {
                A01();
            }

            public static String A00(int i10, int i11, int i12) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
                for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
                    bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 93);
                }
                return new String(bArrCopyOfRange);
            }

            public static void A01() {
                A01 = new byte[]{Ascii.FS, 13, Ascii.EM, Ascii.US, 9};
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8Y
            /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass70 anonymousClass70) {
                this.A00.A0B.ADD(A00(0, 5, 49), this.A00.A03());
            }
        };
        this.A0H = mn;
        M2 m11 = new M2() { // from class: com.facebook.ads.redexgen.X.8z
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8Y
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C06746z c06746z) {
                this.A00.A0H(c06746z);
                this.A00.A0A();
            }
        };
        this.A0K = m11;
        OR or = new OR() { // from class: com.facebook.ads.redexgen.X.8y
            public static byte[] A01;

            static {
                A01();
            }

            public static String A00(int i10, int i11, int i12) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
                for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
                    bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 77);
                }
                return new String(bArrCopyOfRange);
            }

            public static void A01() {
                A01 = new byte[]{20, 32, Ascii.RS, 33, Ascii.GS, 22, 37, 22, 21};
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8Y
            /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass73 anonymousClass73) {
                this.A00.A07();
                OO oo2 = this.A00.A0B;
                OP op = this.A00;
                oo2.ADD(A00(0, 9, 100), op.A04(op.A0D.getDuration()));
            }
        };
        this.A0F = or;
        C07208x c07208x = new C07208x(this);
        this.A0G = c07208x;
        this.A03 = false;
        this.A04 = false;
        this.A02 = false;
        this.A01 = false;
        this.A07 = c1337Xw;
        this.A05 = abstractC1404aD;
        this.A06 = c6o;
        this.A08 = c0945Il;
        this.A09 = interfaceC1019Lm;
        this.A0A = mf;
        RN rn = new RN(c1337Xw);
        this.A0D = rn;
        this.A0B = oo;
        rn.setFunnelLoggingHandler(c0945Il);
        rn.getEventBus().A03(m10, mb2, mn, m11, or, c07208x);
        this.A0E = new AnonymousClass74(c1337Xw, interfaceC0937Id, rn, abstractC1404aD.A0s());
        if (IN.A1X(c1337Xw)) {
            this.A0C = new PQ(c1337Xw, interfaceC0937Id, rn, abstractC1404aD.A0s(), null);
        } else {
            this.A0C = null;
        }
        A0B();
        rn.setVideoURI(c6o.A0S(abstractC1404aD.A0n().A0D().A08()));
        A09();
        LO.A0M(this, abstractC1404aD.A0m().A01().A07(true));
        String videoUrl = abstractC1404aD.A0n().A0D().A07();
        if (!TextUtils.isEmpty(videoUrl)) {
            C1066Nh.A00(c1337Xw, this, videoUrl);
        }
        addView(rn, new FrameLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject A03() {
        return A04(this.A0D.getCurrentPositionInMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject A04(int i10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A02(0, 11, 64), i10);
            jSONObject.put(A02(11, 8, 12), this.A0D.getDuration());
            jSONObject.put(A02(19, 5, 20), this.A0D.A0h());
            jSONObject.put(A02(24, 12, 52), this.A0D.A0j());
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07() {
        if (this.A02) {
            return;
        }
        if (A0M[4].charAt(2) == 'n') {
            throw new RuntimeException();
        }
        String[] strArr = A0M;
        strArr[2] = "wYD5NcGpzh0isOAoVzlYli3P4mnoyMgF";
        strArr[3] = "lJUNZHbcIhPOnD8CvxzjDicpi9xwJBJa";
        this.A02 = true;
    }

    private void A08() {
        this.A0D.postDelayed(new SP(this), IN.A0K(this.A07));
    }

    private void A09() {
        this.A0D.postDelayed(new SO(this), IN.A0L(this.A07));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A() {
        this.A0B.ADD(A02(36, 8, 112), A03());
    }

    private void A0B() {
        if (!TextUtils.isEmpty(this.A05.A0n().A0D().A07())) {
            C06606h c06606h = new C06606h(this.A07);
            this.A0D.A0c(c06606h);
            c06606h.setImage(this.A05.A0n().A0D().A07());
        }
        C6C c6c = new C6C(this.A07, true, this.A08);
        this.A0D.A0c(c6c);
        this.A0D.A0c(new C0973Jq(c6c, EnumC1123Pm.A03, true));
        this.A0D.A0c(new C6X(this.A07));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0H(C06746z c06746z) {
        if (this.A0D.getState() == QO.A02 && IN.A1D(this.A07)) {
            this.A0D.postDelayed(new SN(this, c06746z), 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I(String str) {
        this.A07.A0E().A2u(str);
        if (IN.A1E(this.A07)) {
            A07();
            return;
        }
        InterfaceC1019Lm interfaceC1019Lm = this.A09;
        MF mf = this.A0A;
        String[] strArr = A0M;
        if (strArr[5].charAt(16) != strArr[6].charAt(16)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0M;
        strArr2[2] = "EBONCaOY6he3EVwrjSVJVgPSsddIWnnf";
        strArr2[3] = "quoo3J1Esh1kTLqYeLvwyhMYZuOues3Q";
        interfaceC1019Lm.A3y(mf.A6q());
        this.A09.A3y(this.A0A.A6m());
    }

    public final void A0N() {
        this.A0D.setVolume(this.A05.A0n().A0D().A09() ? StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD : 1.0f);
        this.A0D.A0b(PZ.A02, 26);
        A08();
    }

    public final void A0O() {
        RN rn = this.A0D;
        if (rn != null) {
            if (!this.A02) {
                rn.A0a(PU.A03);
            }
            this.A0D.getEventBus().A04(this.A0J, this.A0I, this.A0H, this.A0K, this.A0F, this.A0G);
            this.A0D.A0V();
        }
        PQ pq = this.A0C;
        if (pq != null) {
            pq.A0A();
        }
        this.A0E.A0g();
    }

    public final void A0P() {
        this.A0D.A0Z(9);
        LO.A0T(this);
        LO.A0H(this.A0D);
        LO.A0Z(this.A0D);
    }

    public final void A0Q() {
        this.A0D.A0a(PU.A04);
    }

    public final void A0R(boolean z10) {
        if (z10) {
            this.A0D.setVolume(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        } else {
            this.A0D.setVolume(1.0f);
        }
        A0A();
        if (A0M[7].charAt(5) == 'u') {
            throw new RuntimeException();
        }
        A0M[4] = "yn69DofMHsLSVfdL7HK9OU5c1k1rZYJH";
    }

    public final void A0S(boolean z10) {
        if (this.A0D.A0i()) {
            return;
        }
        this.A00 = this.A0D.getVideoStartReason();
        this.A01 = z10;
        this.A0D.A0e(false, 19);
    }

    public final void A0T(boolean z10) {
        PZ pz;
        if (this.A0D.A0j() || this.A02 || this.A0D.getState() == QO.A06 || (pz = this.A00) == null) {
            return;
        }
        boolean z11 = this.A01;
        if (A0M[7].charAt(5) == 'u') {
            throw new RuntimeException();
        }
        String[] strArr = A0M;
        strArr[1] = "icjW3n8vZZxsaCmttUmjcTI7CQu2m51p";
        strArr[0] = "kS3lp82K2YolC4kFtdcvtTBENFWE8ibh";
        if (!z11 || z10) {
            this.A0D.A0b(pz, 27);
        }
    }

    public final void A0U(boolean z10) {
        this.A0D.A0e(z10, 18);
    }

    public final void A0V(boolean z10) {
        this.A0D.A0b(PZ.A04, 25);
    }
}
