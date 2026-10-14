package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AZ extends C1364Yy {
    public static String[] A08 = {"bHvO3zM", "7z8VpEP", "iw2Y0c", "LME8njBPiXs011hhslbtp", "9K0lNzbR5X2b0vS5", "Pt0EnZUFnGQLsNks8pQcEgn0FivkNzUh", "t6anbflpJj2CGicCnIMdWTRCydsD", "D9TL9YTSSd0lWzGeUvgWfvwaUF0YdAOx"};
    public float A00;
    public int A01;
    public int A02;
    public C0754Ag A03;
    public int[] A04;
    public final C1337Xw A05;
    public final C1106Ov A06;
    public final C1107Ow A07;

    public AZ(C1337Xw c1337Xw, C1107Ow c1107Ow, C1106Ov c1106Ov) {
        super(c1337Xw);
        this.A02 = 0;
        this.A00 = 50.0f;
        this.A05 = c1337Xw;
        this.A07 = c1107Ow;
        this.A06 = c1106Ov;
        this.A01 = -1;
        this.A03 = new C0754Ag(this, c1337Xw);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00f9  */
    @Override // com.facebook.ads.redexgen.X.AbstractC06054a
    public final void A1J(C06124i c06124i, C06194p c06194p, int i10, int widthMode) {
        int[] iArrA02;
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(widthMode);
        if ((mode == 1073741824 && A2A() == 1) || (mode2 == 1073741824 && A2A() == 0)) {
            super.A1J(c06124i, c06194p, i10, widthMode);
            return;
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(widthMode);
        if (this.A06.A01(this.A01)) {
            iArrA02 = this.A06.A02(this.A01);
        } else {
            iArrA02 = new int[]{0, 0};
            if (c06194p.A03() >= 1) {
                int iA0W = A0W() > 0 ? 1 : A0W();
                for (int i11 = 0; i11 < iA0W; i11++) {
                    View viewA1q = A1q(i11);
                    if (A08[5].length() != 32) {
                        throw new RuntimeException();
                    }
                    A08[4] = "FajaHWp";
                    if (viewA1q == null) {
                        break;
                    }
                    this.A04 = this.A07.A00(viewA1q, View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    if (A2A() == 0) {
                        int heightMode = iArrA02[0];
                        int[] iArr = this.A04;
                        iArrA02[0] = heightMode + iArr[0];
                        if (i11 == 0) {
                            int iA0g = iArr[1] + A0g();
                            if (A08[6].length() != 1) {
                                A08[6] = "o1L5u";
                                iArrA02[1] = iA0g + A0d();
                            } else {
                                throw new RuntimeException();
                            }
                        } else {
                            continue;
                        }
                    } else {
                        int i12 = iArrA02[1];
                        int[] iArr2 = this.A04;
                        if (A08[6].length() != 1) {
                            A08[5] = "6nCDHSOFLCCkeDdRDThHGlolS6KLs45E";
                            iArrA02[1] = i12 + iArr2[1];
                            if (i11 == 0) {
                                iArrA02[0] = iArr2[0] + A0e() + A0f();
                            }
                        } else {
                            A08[3] = "KFvpvLkhCjqU9hzA1pvFB";
                            iArrA02[1] = i12 + iArr2[1];
                            if (i11 == 0) {
                                iArrA02[0] = iArr2[0] + A0e() + A0f();
                            }
                        }
                    }
                }
                int widthMode2 = this.A01;
                if (widthMode2 != -1) {
                    this.A06.A00(widthMode2, iArrA02);
                }
            }
        }
        if (mode == 1073741824) {
            iArrA02[0] = size;
        }
        if (mode2 == 1073741824) {
            iArrA02[1] = size2;
        }
        A13(iArrA02[0], iArrA02[1]);
    }

    @Override // com.facebook.ads.redexgen.X.C1364Yy, com.facebook.ads.redexgen.X.AbstractC06054a
    public final void A1t(int i10) {
        A2F(i10, this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.C1364Yy, com.facebook.ads.redexgen.X.AbstractC06054a
    public final void A21(EB eb2, C06194p c06194p, int i10) {
        this.A03.A0A(i10);
        A1L(this.A03);
    }

    public final void A2K(double d10) {
        if (d10 <= 0.0d) {
            d10 = 1.0d;
        }
        this.A00 = (float) (50.0d / d10);
        this.A03 = new C0754Ag(this, this.A05);
    }

    public final void A2L(int i10) {
        this.A01 = i10;
    }

    public final void A2M(int i10) {
        this.A02 = i10;
    }
}
