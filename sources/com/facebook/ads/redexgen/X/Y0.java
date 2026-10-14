package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class Y0 implements C0L {
    public static byte[] A01;
    public static String[] A02 = {"aROWSCJTZ7USEA9NykDAgKPqU9Hz2yMC", "Zqbs868sBagHNlYScp55lXssWh10RIQa", "mbYc5GC1jhCg", "AuzesFDqytnerPl8cSxQvwaSTNgSXgGN", "J34OJh55Zf7CVcps1JZJSO0d6JwePACZ", "sgVYwbqUus7", "7dh0o4NaZc6u8WRc1KGfxvMUmypAWeMQ", "ZE0swazaf"};
    public final /* synthetic */ C1336Xv A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            byte b10 = bArrCopyOfRange[i13];
            if (A02[3].charAt(2) == 'x') {
                throw new RuntimeException();
            }
            A02[0] = "5v5qZEzKm5dZGLy7lyhruzHwv9U4ulwR";
            bArrCopyOfRange[i13] = (byte) ((b10 ^ i12) ^ 108);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{5, 1, 13, 11, 9};
    }

    static {
        A01();
    }

    public Y0(C1336Xv c1336Xv) {
        this.A00 = c1336Xv;
    }

    @Override // com.facebook.ads.redexgen.X.C0L
    public final void A9E(Throwable th) {
        this.A00.A07().A9K(A00(0, 5, 0), C06937v.A1d, new C06947w(th));
    }

    @Override // com.facebook.ads.redexgen.X.C0L
    public final void A9O(Throwable th) {
        this.A00.A07().A9K(A00(0, 5, 0), C06937v.A1f, new C06947w(th));
    }

    @Override // com.facebook.ads.redexgen.X.C0L
    public final void AE6(String str, int i10, String str2, Long l10, Long l11, AnonymousClass06 anonymousClass06) {
        C6R.A05(this.A00, anonymousClass06.A06, anonymousClass06.A08, anonymousClass06.A09, anonymousClass06.A07, anonymousClass06.A03, i10, str2, l10, l11, null);
    }

    @Override // com.facebook.ads.redexgen.X.C0L
    public final void AE7(String str, boolean z10, AnonymousClass06 anonymousClass06) {
        C6R.A04(this.A00, new C6Q(anonymousClass06.A06, anonymousClass06.A08, anonymousClass06.A07, anonymousClass06.A03, str), z10);
    }
}
