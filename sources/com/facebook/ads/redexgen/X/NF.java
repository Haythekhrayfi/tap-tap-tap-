package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class NF implements View.OnClickListener {
    public static String[] A03 = {"5NPsaGxTntAZUh5vvPpYLifVDwpYE9gO", "yAdF8jFrPkVudWekKgJT40sKzU7M", "P84QernMh58Oht", "HVjKxCVNtxzSBN1ofjZs3kMRuF4TzLwS", "c9t8G7uI59pglLVDHXf1Cg7BVtBq", "zkFcC9XFE44gS7Ii7sdayH8FvB1qc1Nx", "mQLKSBYKXRgBaCP29rEHxwq0", "ifKB8OntsRJFcWFaLpGEPIeHfTRm85bo"};
    public float A00;
    public float A01;
    public View.OnClickListener A02;

    public NF(View.OnClickListener onClickListener) {
        this.A02 = onClickListener;
    }

    public final void A00(float f10, float f11) {
        this.A00 = f10;
        this.A01 = f11;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0050 A[Catch: all -> 0x0088, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0088, blocks: (B:6:0x0008, B:9:0x001c, B:18:0x0050, B:29:0x0082), top: B:34:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0063  */
    /* JADX WARN: Code duplicated, block: B:26:0x0073  */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        float f10;
        float f11;
        int width;
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            int width2 = view.getWidth();
            int height = view.getHeight();
            int iAbs = Math.abs(width2 - height) / 2;
            if (width2 != height) {
                if (width2 > height) {
                    float f12 = this.A00;
                    if (f12 >= iAbs) {
                        int i10 = width2 - iAbs;
                        String[] strArr = A03;
                        String str = strArr[1];
                        String str2 = strArr[4];
                        int width3 = str.length();
                        if (width3 != str2.length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A03;
                        strArr2[1] = "IaFg43gDfmav4cpS3tfI5ukrEyaV";
                        strArr2[4] = "YCQU4nAsEaYrX5eT9av2YKK9p1Sz";
                        if (f12 > i10) {
                            if (height <= width2) {
                                return;
                            }
                            f10 = this.A01;
                            f11 = iAbs;
                            width = A03[5].charAt(3);
                            if (width != 66) {
                                A03[0] = "DOfOMptgN0kFoREvgd3Bxl9Eys2o9Nt4";
                                if (f10 < f11) {
                                    return;
                                }
                            } else {
                                String[] strArr3 = A03;
                                strArr3[1] = "SME7OxnBFewA4wdZ4tQVNxKrxX7o";
                                strArr3[4] = "dj4w34xtzstsWLpNapZgfCztNtRS";
                                if (f10 < f11) {
                                    return;
                                }
                            }
                            if (f10 > height - iAbs) {
                                return;
                            }
                        }
                    } else {
                        if (height <= width2) {
                            return;
                        }
                        f10 = this.A01;
                        f11 = iAbs;
                        width = A03[5].charAt(3);
                        if (width != 66) {
                            A03[0] = "DOfOMptgN0kFoREvgd3Bxl9Eys2o9Nt4";
                            if (f10 < f11) {
                                return;
                            }
                        } else {
                            String[] strArr4 = A03;
                            strArr4[1] = "SME7OxnBFewA4wdZ4tQVNxKrxX7o";
                            strArr4[4] = "dj4w34xtzstsWLpNapZgfCztNtRS";
                            if (f10 < f11) {
                                return;
                            }
                        }
                        if (f10 > height - iAbs) {
                            return;
                        }
                    }
                } else {
                    if (height <= width2) {
                        return;
                    }
                    f10 = this.A01;
                    f11 = iAbs;
                    width = A03[5].charAt(3);
                    if (width != 66) {
                        A03[0] = "DOfOMptgN0kFoREvgd3Bxl9Eys2o9Nt4";
                        if (f10 < f11) {
                            return;
                        }
                    } else {
                        String[] strArr5 = A03;
                        strArr5[1] = "SME7OxnBFewA4wdZ4tQVNxKrxX7o";
                        strArr5[4] = "dj4w34xtzstsWLpNapZgfCztNtRS";
                        if (f10 < f11) {
                            return;
                        }
                    }
                    if (f10 > height - iAbs) {
                        return;
                    }
                }
            }
            this.A02.onClick(view);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }
}
