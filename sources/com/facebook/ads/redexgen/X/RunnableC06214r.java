package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC06214r implements Runnable {
    public static byte[] A07;
    public static String[] A08 = {"c4xSVVt4fNiIZ9aJ0ftrOCVpKy2EJW", "bj77oS7wYHzhrY124YppwtIfPTuDoAHL", "mRmZUQV2DMpprRsDQaH8Mtbq5JuQtR14", "UXM5", "qfxFRQLCBxpF20va4RNO9ygLlTXV5cTV", "Bw29gSSAA0erG37CQVEqOkFPeCj6ZZr8", "KVIri1u0fbW7r5jnncTGzAnirlJcKx", "TA0EOfT3Z02jNldii3VIEnkki3"};
    public OverScroller A01;
    public int A02;
    public int A03;
    public final /* synthetic */ EB A06;
    public Interpolator A00 = EB.A1A;
    public boolean A04 = false;
    public boolean A05 = false;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 32);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A07 = new byte[]{-46, -42, -96, -45, -29, -14, -17, -20, -20};
    }

    static {
        A03();
    }

    public RunnableC06214r(EB eb2) {
        this.A06 = eb2;
        this.A01 = new OverScroller(eb2.getContext(), EB.A1A);
    }

    private float A00(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    private int A01(int i10, int i11, int i12, int i13) {
        int absDx;
        int delta = Math.abs(i10);
        int velocity = Math.abs(i11);
        int duration = delta > velocity ? 1 : 0;
        int containerSize = (int) Math.sqrt((i12 * i12) + (i13 * i13));
        int absDx2 = (int) Math.sqrt((i10 * i10) + (i11 * i11));
        EB eb2 = this.A06;
        int width = duration != 0 ? eb2.getWidth() : eb2.getHeight();
        int halfContainerSize = width / 2;
        float fA00 = halfContainerSize + (halfContainerSize * A00(Math.min(1.0f, (absDx2 * 1.0f) / width)));
        if (containerSize > 0) {
            absDx = Math.round(Math.abs(fA00 / containerSize) * 1000.0f) * 4;
        } else {
            if (duration == 0) {
                delta = velocity;
            }
            absDx = (int) (((delta / width) + 1.0f) * 300.0f);
        }
        return Math.min(absDx, 2000);
    }

    private final void A04() {
        this.A05 = false;
        this.A04 = true;
    }

    private final void A05() {
        this.A04 = false;
        if (this.A05) {
            A07();
        }
    }

    private final void A06(int i10, int i11, int i12, int i13) {
        A0B(i10, i11, A01(i10, i11, i12, i13));
    }

    public final void A07() {
        if (this.A04) {
            this.A05 = true;
            return;
        }
        this.A06.removeCallbacks(this);
        if (A08[4].charAt(10) == 'o') {
            throw new RuntimeException();
        }
        A08[2] = "DBTzn4opHB64KJUt1kyQdTPFEm6jko5S";
        C3F.A0D(this.A06, this);
    }

    public final void A08() {
        this.A06.removeCallbacks(this);
        this.A01.abortAnimation();
    }

    public final void A09(int i10, int i11) {
        this.A06.setScrollState(2);
        this.A03 = 0;
        this.A02 = 0;
        this.A01.fling(0, 0, i10, i11, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        A07();
    }

    public final void A0A(int i10, int i11) {
        A06(i10, i11, 0, 0);
    }

    public final void A0B(int i10, int i11, int i12) {
        A0C(i10, i11, i12, EB.A1A);
    }

    public final void A0C(int i10, int i11, int i12, Interpolator interpolator) {
        if (this.A00 != interpolator) {
            this.A00 = interpolator;
            this.A01 = new OverScroller(this.A06.getContext(), interpolator);
        }
        this.A06.setScrollState(2);
        this.A03 = 0;
        this.A02 = 0;
        this.A01.startScroll(0, 0, i10, i11, i12);
        if (Build.VERSION.SDK_INT < 23) {
            OverScroller overScroller = this.A01;
            if (A08[7].length() != 26) {
                throw new RuntimeException();
            }
            A08[2] = "UeYo97OquvC2FnZv3LivDSVIricXCoYT";
            overScroller.computeScrollOffset();
        }
        A07();
    }

    public final void A0D(int i10, int i11, Interpolator interpolator) {
        int iA01 = A01(i10, i11, 0, 0);
        if (interpolator == null) {
            interpolator = EB.A1A;
        }
        A0C(i10, i11, iA01, interpolator);
    }

    /* JADX WARN: Code duplicated, block: B:127:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:129:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:130:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:24:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:30:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:56:0x017d  */
    @Override // java.lang.Runnable
    public final void run() {
        int x10;
        if (this.A06.A06 == null) {
            A08();
            if (A08[2].charAt(8) != 'G') {
                A08[3] = "wyRlewweBEsEMs9L1doa5ZD019uED4";
                return;
            }
        } else {
            A04();
            this.A06.A1J();
            OverScroller overScroller = this.A01;
            AbstractC06174n abstractC06174n = this.A06.A06.A02;
            if (overScroller.computeScrollOffset()) {
                int[] iArr = this.A06.A16;
                int overscrollX = overScroller.getCurrX();
                int velY = overScroller.getCurrY();
                int vresult = overscrollX - this.A02;
                int velX = velY - this.A03;
                int iA1h = 0;
                int dy = 0;
                this.A02 = overscrollX;
                this.A03 = velY;
                int i10 = 0;
                int i11 = 0;
                if (this.A06.A1z(vresult, velX, iArr, null, 1)) {
                    vresult -= iArr[0];
                    velX -= iArr[1];
                }
                if (this.A06.A04 != null) {
                    this.A06.A1K();
                    this.A06.A1L();
                    C05572c.A01(A02(0, 9, 96));
                    EB eb2 = this.A06;
                    eb2.A1m(eb2.A0s);
                    if (vresult != 0) {
                        iA1h = this.A06.A06.A1h(vresult, this.A06.A0r, this.A06.A0s);
                        i10 = vresult - iA1h;
                    }
                    if (velX != 0) {
                        dy = this.A06.A06.A1i(velX, this.A06.A0r, this.A06.A0s);
                        i11 = velX - dy;
                    }
                    C05572c.A00();
                    if (A08[4].charAt(10) != 111) {
                        A08[7] = "AEnMZuqp98GVRFTkSbmwbA51QL";
                        this.A06.A1P();
                        this.A06.A1M();
                        this.A06.A1s(false);
                        if (abstractC06174n != null) {
                            if (!abstractC06174n.A0E() && abstractC06174n.A0F()) {
                                x10 = this.A06.A0s.A03();
                                if (x10 == 0) {
                                    abstractC06174n.A09();
                                } else if (abstractC06174n.A07() >= x10) {
                                    abstractC06174n.A04(vresult - i10, velX - i11);
                                } else {
                                    abstractC06174n.A0A(x10 - 1);
                                    abstractC06174n.A04(vresult - i10, velX - i11);
                                }
                            }
                        }
                    } else {
                        this.A06.A1P();
                        this.A06.A1M();
                        this.A06.A1s(false);
                        if (abstractC06174n != null) {
                            if (!abstractC06174n.A0E()) {
                                x10 = this.A06.A0s.A03();
                                if (x10 == 0) {
                                    abstractC06174n.A09();
                                } else if (abstractC06174n.A07() >= x10) {
                                    abstractC06174n.A04(vresult - i10, velX - i11);
                                } else {
                                    abstractC06174n.A0A(x10 - 1);
                                    abstractC06174n.A04(vresult - i10, velX - i11);
                                }
                            }
                        }
                    }
                    if (A08[4].charAt(10) == 111) {
                        throw new RuntimeException();
                    }
                    A08[3] = "TGS8taa2nLIFayhr7f7v";
                }
                if (!this.A06.A0v.isEmpty()) {
                    this.A06.invalidate();
                }
                if (this.A06.getOverScrollMode() != 2) {
                    this.A06.A1a(vresult, velX);
                }
                int dx = iA1h;
                int hresult = i10;
                if (!this.A06.A1y(dx, dy, hresult, i11, null, 1) && (i10 != 0 || i11 != 0)) {
                    int y10 = (int) overScroller.getCurrVelocity();
                    int dx2 = 0;
                    if (i10 != overscrollX) {
                        if (i10 < 0) {
                            dx2 = -y10;
                        } else {
                            dx2 = i10 > 0 ? y10 : 0;
                        }
                    }
                    if (i11 != velY) {
                        if (i11 < 0) {
                            y10 = -y10;
                        } else if (i11 <= 0) {
                            y10 = 0;
                        }
                    } else {
                        y10 = 0;
                    }
                    int dy2 = this.A06.getOverScrollMode();
                    String[] strArr = A08;
                    String str = strArr[5];
                    String str2 = strArr[1];
                    int iCharAt = str.charAt(12);
                    int hresult2 = str2.charAt(12);
                    if (iCharAt != hresult2) {
                        A08[7] = "VAPByUbSVbCRl876Iw5SK7wrPn";
                        if (dy2 != 2) {
                            this.A06.A1Z(dx2, y10);
                        }
                    } else if (dy2 != 2) {
                        this.A06.A1Z(dx2, y10);
                    }
                    if ((dx2 != 0 || i10 == overscrollX || overScroller.getFinalX() == 0) && (y10 != 0 || i11 == velY || overScroller.getFinalY() == 0)) {
                        overScroller.abortAnimation();
                    }
                }
                if (iA1h != 0 || dy != 0) {
                    EB eb3 = this.A06;
                    String[] strArr2 = A08;
                    if (strArr2[6].length() != strArr2[0].length()) {
                        eb3.A1c(iA1h, dy);
                    } else {
                        String[] strArr3 = A08;
                        strArr3[6] = "bSHjdsVkhDQdmG1cm4T37Ejfm8kVFC";
                        strArr3[0] = "uWlM2d1CCrIfar3HOPPYeFU5881RH0";
                        eb3.A1c(iA1h, dy);
                    }
                }
                if (!this.A06.awakenScrollBars()) {
                    this.A06.invalidate();
                }
                int velY2 = ((vresult == 0 && velX == 0) || (vresult != 0 && this.A06.A06.A24() && iA1h == vresult) || (velX != 0 && this.A06.A06.A25() && dy == velX)) ? 1 : 0;
                boolean fullyConsumedVertical = overScroller.isFinished();
                if (A08[4].charAt(10) == 'o') {
                    throw new RuntimeException();
                }
                A08[2] = "98aPJs2vUpcbHQSYyxrV3zG03CSHn11I";
                if (fullyConsumedVertical || (velY2 == 0 && !this.A06.A1w(1))) {
                    this.A06.setScrollState(0);
                    if (EB.A1E) {
                        this.A06.A02.A02();
                    }
                    this.A06.A1Y(1);
                } else {
                    A07();
                    if (this.A06.A03 != null) {
                        this.A06.A03.A0B(this.A06, vresult, velX);
                    }
                }
            }
            if (abstractC06174n != null) {
                boolean zA0E = abstractC06174n.A0E();
                String[] strArr4 = A08;
                if (strArr4[5].charAt(12) != strArr4[1].charAt(12)) {
                    String[] strArr5 = A08;
                    strArr5[6] = "1QtdEsEbLTCaQSWKyl1hJXPObs6yvI";
                    strArr5[0] = "gIBnLdKBfiMzk6Ug2irxti7V3sW67K";
                    if (zA0E) {
                        abstractC06174n.A04(0, 0);
                    }
                    if (!this.A05) {
                        abstractC06174n.A09();
                    }
                }
            }
            A05();
            return;
        }
        throw new RuntimeException();
    }
}
