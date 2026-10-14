package com.facebook.ads.redexgen.X;

import android.view.View;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import org.joda.time.DateTimeConstants;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ua, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1240Ua implements InterfaceC0949Ip {
    public static byte[] A04;
    public static String[] A05 = {"Y66c6k3Hy3UvBBfpHck", "fJ4NdAtGEgbYsoLarolV0m2U2ouke5wB", "RcyYmVgVLeSkKDa12w3", "KskJyNeVQ7IEAjxWCckPmucmu9amULkO", "1ed8Y", "R", "mHN6PRZU6o6WB3AjYfdaJfhjKiNadrGW", "OPv53LJXnFYa9uQB3GUlIx9f3blXJ2fU"};
    public static final String A06;
    public ViewOnAttachStateChangeListenerC1241Ub A00;
    public C1473bR<IT, IY> A01;
    public final C1336Xv A02;
    public final C1467bL A03 = C1467bL.A01();

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A05[1].charAt(19) != 'V') {
                throw new RuntimeException();
            }
            A05[1] = "obfng8wQuS9GtxnUf86VO2yIawxGqzEf";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 105);
            i13++;
        }
    }

    public static void A02() {
        A04 = new byte[]{-29, -9, -12, -81, -4, -12, -13, -8, -16, -81, -14, 1, -12, -16, 3, -8, 5, -12, -81, 5, -8, -12, 6, -81, -8, 2, -81, -3, 4, -5, -5, -67, -57, -32, -28, -41, -39, -37, -27, -26, -41, -28, -37, -32, -39, -110, -45, -110, -32, -25, -34, -34, -110, -43, -28, -41, -45, -26, -37, -24, -41, -110, -24, -37, -41, -23, -109, 6, Ascii.EM, 21, 39, 32, Ascii.US, Ascii.EM, Ascii.RS, 36, -12, 17, 36, 17, -48, Ascii.EM, 35, -48, Ascii.RS, 37, Ascii.FS, Ascii.FS, -47, 4, -10, -12, 0, -1, -11, -16, -12, -7, -14, -1, -1, -10, -3};
    }

    static {
        A02();
        A06 = C1240Ua.class.getSimpleName();
    }

    public C1240Ua(C1336Xv c1336Xv) {
        this.A02 = c1336Xv;
    }

    private void A01() {
        this.A02.A07().A9K(A00(89, 14, 40), DateTimeConstants.SECONDS_PER_HOUR, new C06947w(A00(67, 22, 71)));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0949Ip
    public final void AAq() {
        C1473bR<IT, IY> c1473bR = this.A01;
        if (c1473bR != null) {
            c1473bR.A03.A00();
        } else {
            A01();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0949Ip
    public final void ADL() {
        C1473bR<IT, IY> c1473bR = this.A01;
        if (c1473bR != null) {
            c1473bR.A03.A03();
        } else {
            A01();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0949Ip
    public final void AFo(View view) {
        if (this.A01 == null) {
            this.A02.A07().A9K(A00(89, 14, 40), DateTimeConstants.SECONDS_PER_HOUR, new C06947w(A00(32, 35, 9)));
            return;
        }
        this.A03.A04(view);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0949Ip
    public final void AFz(View view, String str, boolean z10) {
        AG0(view, str, z10, false);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0949Ip
    public final void AG0(View view, String str, boolean z10, boolean z11) {
        AG1(view, str, z10, z11, false);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0949Ip
    public final void AG1(View view, String str, boolean z10, boolean z11, boolean z12) {
        if (view != null) {
            ViewOnAttachStateChangeListenerC1241Ub viewOnAttachStateChangeListenerC1241Ub = new ViewOnAttachStateChangeListenerC1241Ub(view);
            this.A00 = viewOnAttachStateChangeListenerC1241Ub;
            this.A03.A06(viewOnAttachStateChangeListenerC1241Ub, view);
            if (z11) {
                ViewOnAttachStateChangeListenerC1241Ub viewOnAttachStateChangeListenerC1241Ub2 = this.A00;
                String[] strArr = A05;
                if (strArr[0].length() != strArr[2].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A05;
                strArr2[0] = "hwPcHACCkDldKsuu7a1";
                strArr2[2] = "KVS16a9OP0E0NreE4Vx";
                viewOnAttachStateChangeListenerC1241Ub2.A03();
            }
            C1473bR<IT, IY> c1473bRA06 = C1473bR.A00(new IT(this.A02, view, str, z10, z12), new IY(), A06).A05(new C1242Uc(new UZ())).A06();
            this.A01 = c1473bRA06;
            this.A03.A05(view, c1473bRA06);
            return;
        }
        this.A02.A07().A9K(A00(89, 14, 40), DateTimeConstants.SECONDS_PER_HOUR, new C06947w(A00(0, 32, 38)));
    }
}
