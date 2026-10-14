package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1202Sn extends AbstractC1072Nn {
    public static byte[] A06;
    public static String[] A07 = {"1qM0UqBuKeNFs4931PZdKXfB5ZchECK5", "3ZSmcCEAG5Dz0dWrJNlp2MNszP7YT25A", "Vrvau7r1HMpQKQXhvyVkTfJZAsfHOW4A", "oVRoE2FdK0le1s2SfNIozg00Kc9sH4MP", "npYoVlwUwM4clRwIxvjz9nauDkw8jySV", "7Yuh663Y", "kkRlGGIMUj7iwn7pYEfT9Vq54HRzcbQk", "UynwTjbvMY6JmtelA"};
    public static final int A08;
    public static final int A09;
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public static final int A0G;
    public static final int A0H;
    public C0981Jy A00;
    public JU A01;
    public JQ A02;
    public final AbstractC1404aD A03;
    public final C1D A04;
    public final NJ A05;

    public static String A0C(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 22);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0D() {
        A06 = new byte[]{9, 5, 7, 68, 12, 11, 9, 15, 8, 5, 5, 1, 68, 11, 14, Ascii.EM, 68, 3, 4, Ascii.RS, 15, Ascii.CAN, Ascii.EM, Ascii.RS, 3, Ascii.RS, 3, 11, 6, 68, 9, 6, 3, 9, 1, 15, 14, 92, 75, 89, 79, 92, 74, 75, 74, 113, 88, 71, 74, 75, 65};
    }

    static {
        A0D();
        A0B = (int) (Kn.A02 * 48.0f);
        A0F = (int) (Kn.A02 * 16.0f);
        A08 = (int) (Kn.A02 * 4.0f);
        A0E = (int) (Kn.A02 * 44.0f);
        A0C = (int) (Kn.A02 * 8.0f);
        A0D = (int) (Kn.A02 * 12.0f);
        A0H = (int) (Kn.A02 * 12.0f);
        A0G = (int) (Kn.A02 * 26.0f);
        int iA01 = C05562b.A01(-1, 77);
        A09 = iA01;
        A0A = C05562b.A01(iA01, 90);
    }

    public AbstractC1202Sn(C1076Nr c1076Nr, boolean z10) {
        super(c1076Nr, z10);
        AbstractC1404aD abstractC1404aDA04 = c1076Nr.A04();
        this.A03 = abstractC1404aDA04;
        this.A04 = abstractC1404aDA04.A0n();
        this.A05 = A0B(c1076Nr);
        AbstractC1018Ll abstractC1018LlA08 = c1076Nr.A08();
        if (abstractC1018LlA08 != null) {
            abstractC1018LlA08.setLayoutParams(new RelativeLayout.LayoutParams(-1, abstractC1018LlA08.getToolbarHeight()));
            abstractC1018LlA08.setPageDetailsVisible(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x009d  */
    /* JADX WARN: Code duplicated, block: B:14:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:17:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:9:0x005c  */
    private C1203So A0B(C1076Nr c1076Nr) {
        String strA0C;
        C1203So c1203So;
        boolean z10;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        if (!c1076Nr.A04().A0K().equals(A0C(37, 14, 56))) {
            if (A07[5].length() != 7) {
                A07[7] = "aLegEIjbGKC4WYI41vdDU1g9u";
                strA0C = A0C(0, 37, 124);
                C1337Xw c1337XwA05 = c1076Nr.A05();
                int i10 = A0B;
                if (this.A04.A0E().A00() == C1I.A05) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                c1203So = new C1203So(c1337XwA05, i10, z10, getColors(), this.A04.A0F().A06(), strA0C, c1076Nr.A06(), c1076Nr.A09(), c1076Nr.A0B(), c1076Nr.A07());
                this.A02 = new JQ(c1203So, 400, 100, 0);
                LO.A0K(c1203So);
                c1203So.A0C(c1076Nr.A00());
                if (IN.A0z(c1076Nr.A05())) {
                    c1203So.A0B();
                    if (c1076Nr.A08() != null) {
                        c1076Nr.A08().setCTAClickListener(getCtaButton());
                    }
                }
                addView(c1203So, layoutParams);
                c1203So.getCTAButton().A0A(this.A03, c1076Nr.A08());
                return c1203So;
            }
            throw new RuntimeException();
        }
        EnumC1113Pc enumC1113Pc = EnumC1113Pc.A04;
        if (A07[7].length() != 22) {
            String[] strArr = A07;
            strArr[6] = "Ca3psE1IPVUhCMreDaAATfbsplsRsoNT";
            strArr[1] = "q1VyT2b1NhDnFBLs9y9UP0y4iho0jP8D";
            strA0C = enumC1113Pc.A02();
            C1337Xw c1337XwA06 = c1076Nr.A05();
            int i11 = A0B;
            if (this.A04.A0E().A00() == C1I.A05) {
                z10 = true;
            } else {
                z10 = false;
            }
            c1203So = new C1203So(c1337XwA06, i11, z10, getColors(), this.A04.A0F().A06(), strA0C, c1076Nr.A06(), c1076Nr.A09(), c1076Nr.A0B(), c1076Nr.A07());
            this.A02 = new JQ(c1203So, 400, 100, 0);
            LO.A0K(c1203So);
            c1203So.A0C(c1076Nr.A00());
            if (IN.A0z(c1076Nr.A05())) {
                c1203So.A0B();
                if (c1076Nr.A08() != null) {
                    c1076Nr.A08().setCTAClickListener(getCtaButton());
                }
            }
            addView(c1203So, layoutParams);
            c1203So.getCTAButton().A0A(this.A03, c1076Nr.A08());
            return c1203So;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1072Nn
    public void A0t(C1D c1d, String str, double d10, Bundle bundle) {
        super.A0t(c1d, str, d10, bundle);
        this.A05.setInfo(c1d.A0E(), c1d.A0F(), str, this.A03.A0q().A01(), null);
    }

    public final int A0w(AbstractC1018Ll abstractC1018Ll) {
        return abstractC1018Ll == null ? AbstractC1018Ll.A00 : abstractC1018Ll.getToolbarHeight();
    }

    public void A0x() {
        View expandableLayout = getAdDetailsView().getExpandableLayout();
        if (expandableLayout != null) {
            C0981Jy c0981Jy = new C0981Jy(true);
            this.A00 = c0981Jy;
            JU ju = this.A01;
            if (ju != null) {
                c0981Jy.A0I(ju);
            }
            C1M c1mA01 = this.A03.A0m().A01();
            this.A00.A0I(new JS(getAdDetailsView().getCTAButton(), 300, -1, c1mA01.A09(true)));
            int i10 = A09;
            int i11 = A0A;
            int i12 = A08;
            Drawable drawableA08 = LO.A08(i10, i11, i12);
            Drawable startDrawable = LO.A05(c1mA01.A08(true), i12);
            this.A00.A0I(new JV(getAdDetailsView().getCTAButton(), 300, drawableA08, startDrawable));
            this.A00.A0I(new JT(expandableLayout, 150, false));
            this.A00.A0H(2300);
        }
    }

    public AbstractC1404aD getAdDataBundle() {
        return this.A03;
    }

    public JQ getAdDetailsAnimation() {
        return this.A02;
    }

    public NJ getAdDetailsView() {
        return this.A05;
    }

    public C1D getAdInfo() {
        return this.A04;
    }

    public C0981Jy getAnimationPlugin() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1072Nn, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getAdDetailsView().A0C(configuration.orientation);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        View expandableLayout = getAdDetailsView().getExpandableLayout();
        if (expandableLayout == null || !z10) {
            return;
        }
        JU ju = this.A01;
        if (A07[2].charAt(30) != '4') {
            throw new RuntimeException();
        }
        A07[0] = "AO2Vor543jhYYkt1oYijcT7buZTkR3eI";
        if (ju == null) {
            JU ju2 = new JU(expandableLayout, 300, expandableLayout.getHeight(), 0);
            this.A01 = ju2;
            this.A00.A0I(ju2);
            this.A00.A0G();
        }
    }
}
