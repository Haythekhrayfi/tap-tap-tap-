package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.view.Surface;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Q9 {
    public static byte[] A02;
    public static String[] A03 = {"WzijvlAd9RP1HJzMxCKzeYHnMs2QP54v", "kfrqpsiELz0FvZTPYg", "hAwPDz", "OryCsPOoCbEZ1Kjw18", "JoqBI6chV", "rfkFyJ13DXugB3RLj6H", "rQvj", "kthZXjW83"};
    public final C0813Dg A00;
    public final V4 A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 10);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-114, -104, -116, -114, -49, -51, -31, -33, -47, -114, -116, -90, -116, -114, -96, -86, -98, -96, -16, -29, -20, -30, -29, -16, -29, -16, -57, -20, -30, -29, -10, -96, -98, -72, -98, -96, -114, -23, 111, 114, -127, -68, 99, -75, -70, -79, -90, 99, 97, 123, 97, 99};
    }

    static {
        A02();
    }

    public Q9(C1337Xw c1337Xw) {
        V4 v10 = new V4();
        this.A01 = v10;
        GL trackSelectionFactory = new VB(v10);
        this.A00 = C9K.A00(new XG(c1337Xw), new C0770Aw(trackSelectionFactory), new XI());
    }

    public static String A01(C9I c9i) {
        return A00(41, 11, 55) + c9i.A01 + A00(14, 22, 116) + c9i.A00 + A00(0, 14, 98) + c9i.getCause() + A00(36, 2, 98);
    }

    public static boolean A03() {
        if (A03[0].charAt(3) == 'z') {
            throw new RuntimeException();
        }
        A03[6] = "p35x";
        return true;
    }

    public final int A04() {
        return this.A00.A0J();
    }

    public final int A05() {
        return this.A00.A65();
    }

    public final long A06() {
        return this.A00.A6W();
    }

    public final long A07() {
        return this.A00.A6i();
    }

    public final Q7 A08() {
        Format vf = this.A00.A0L();
        if (vf == null) {
            return null;
        }
        return new Q7(vf.A0F, vf.A08);
    }

    public final void A09() {
        this.A00.AED();
    }

    public final void A0A() {
        this.A00.AEo();
    }

    public final void A0B() {
        this.A00.A0M();
    }

    public final void A0C(float f10) {
        this.A00.A0N(f10);
    }

    public final void A0D(long j10) {
        this.A00.AEn(j10);
    }

    public final void A0E(Surface surface) {
        this.A00.A0O(surface);
    }

    public final void A0F(C1336Xv c1336Xv, Uri uri) {
        if (IN.A2L(c1336Xv, A03())) {
            QD cacheManager = QD.A05(c1336Xv);
            VU vu = new VU(cacheManager.A0F(c1336Xv));
            String strA08 = QD.A08(c1336Xv, uri);
            if (strA08 != null) {
                vu.A00(strA08);
            }
            this.A00.A0P(vu.A01(uri));
            return;
        }
        EW mediaSource = new VU(new V2(c1336Xv, C0930Hv.A0K(c1336Xv, A00(38, 3, 4)), this.A01)).A01(uri);
        this.A00.A0P(mediaSource);
    }

    public final void A0G(Q6 q10) {
        this.A00.A3L(new JO(this, q10));
    }

    public final void A0H(Q8 q10) {
        this.A00.A0Q(new JP(this, q10));
    }

    public final void A0I(boolean z10) {
        this.A00.AFD(z10);
    }

    public final boolean A0J() {
        return this.A00.A7X();
    }

    public final boolean A0K() {
        return this.A00.A0K() != null;
    }
}
