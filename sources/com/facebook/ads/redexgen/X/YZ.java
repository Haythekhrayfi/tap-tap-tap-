package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.view.View;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class YZ extends AbstractC05180p {
    public static byte[] A03;
    public View A00;
    public final C5B A01;
    public final C0830Dx A02;

    static {
        A03();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 53);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{-23, 7, 20, 20, 21, Ascii.SUB, -58, 22, Ascii.CAN, 11, Ascii.EM, 11, 20, Ascii.SUB, -58, 20, Ascii.ESC, 18, 18, -58, 7, 10, -4, 15, 11, Ascii.GS};
    }

    public YZ(C5B c5b) {
        this.A02 = c5b.A09();
        this.A01 = c5b;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05180p
    public final void A0C() {
        this.A02.A0E().A3j();
        C0978Jv.A00(new C1342Yb(this));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05180p
    public final void A0D() {
        this.A02.A0E().A3m();
        C0978Jv.A00(new C1341Ya(this));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05180p
    public final void A0E(View view) {
        if (view != null) {
            this.A02.A0E().A3l();
            this.A00 = view;
            this.A01.A07().removeAllViews();
            this.A01.A07().addView(this.A00);
            if (this.A00 instanceof C1214Sz) {
                JK.A01(this.A01.A05(), this.A00, this.A01.A0A());
            }
            C0854Ev controller = this.A01.A08();
            if (controller != null) {
                controller.A0H();
            }
            C0978Jv.A00(new C1343Yc(this));
            C5B c5b = this.A01;
            c5b.A0B(c5b.A07(), this.A00);
            if (Build.VERSION.SDK_INT >= 18 && IN.A11(this.A01.A07().getContext())) {
                final NB nb2 = new NB();
                this.A01.A0D(nb2);
                nb2.A0C(this.A01.getPlacementId());
                nb2.A0B(this.A01.A07().getContext().getPackageName());
                if (this.A01.A08() != null && this.A01.A08().A0G() != null) {
                    nb2.A09(this.A01.A08().A0G().A0C());
                }
                View view2 = this.A00;
                if (view2 instanceof C1214Sz) {
                    nb2.A0A(((C1214Sz) view2).getViewabilityChecker());
                }
                this.A00.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.facebook.ads.redexgen.X.5L
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view3) {
                        if (this.A00.A00 != null) {
                            nb2.setBounds(0, 0, this.A00.A00.getWidth(), this.A00.A00.getHeight());
                            NB nb3 = nb2;
                            nb3.A0D(!nb3.A0E());
                        }
                        return true;
                    }
                });
                this.A00.getOverlay().add(nb2);
                return;
            }
            return;
        }
        throw new IllegalStateException(A02(0, 26, 113));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05180p
    public final void A0F(InterfaceC05170o interfaceC05170o) {
        this.A02.A0E().A3k(this.A01.A08() != null);
        if (this.A01.A08() != null) {
            this.A01.A08().A0I();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05180p
    public final void A0G(JD jd2) {
        this.A02.A0E().A2h(LF.A01(this.A01.A04()), jd2.A03().getErrorCode(), jd2.A04());
        C0978Jv.A00(new C1344Yd(this, jd2));
    }
}
