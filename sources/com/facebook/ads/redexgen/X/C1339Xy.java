package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1339Xy implements QC {
    public static byte[] A04;
    public static String[] A05 = {"YemVV2CAzinSYko79pvdFyiaYh6Ax0NW", "FtFCRkuseyQck6qipAKyAgz81MNc63Vq", "zQJLp3VKHBLQ3ByylDAuuS44tkTO3MMG", "42Yp5AyXW20j54q75pN0MZ83oMgNP5AR", "H6ih9Bh2z", "6YmusGfII7QcqEjcRVkg771Wm5bkMvFZ", "MrQdRQonl4dLBaJwcA8", "V6zsFfxQuHmo6VBO3CkkHMQL74uZQLm4"};
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C6J A02;
    public final /* synthetic */ C6K A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 94);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{Ascii.CAN, 3, 6, 3, 2, Ascii.SUB, 3, 62, 33, 44, 45, 39};
    }

    static {
        A01();
    }

    public C1339Xy(C6J c6j, C6K c6k, long j10, long j11) {
        this.A02 = c6j;
        this.A03 = c6k;
        this.A00 = j10;
        this.A01 = j11;
    }

    @Override // com.facebook.ads.redexgen.X.QC
    public final void AAw(boolean z10) {
        if (C6R.A06(this.A02.A01.A04)) {
            C6Q c6q = new C6Q(this.A03.A06, this.A03.A07, A00(7, 5, 22), this.A03.A02, this.A03.A08);
            C6R.A04(this.A02.A01.A04, c6q, z10);
            if (!z10) {
                C6R.A05(this.A02.A01.A04, this.A03.A06, this.A03.A07, this.A03.A08, A00(7, 5, 22), this.A03.A02, 2112, null, Long.valueOf(this.A00), Long.valueOf(System.currentTimeMillis() - this.A01), null);
            }
            Map map = C6O.A0G;
            if (A05[1].charAt(13) == 'O') {
                throw new RuntimeException();
            }
            A05[1] = "tpujksKgYg5a3fdXCIDkrfoMaur1s0eW";
            map.put(c6q.A04, c6q);
        }
        try {
            this.A02.A00.put(true);
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.facebook.ads.redexgen.X.QC
    public final void AB8(Throwable th) {
        if (C6R.A06(this.A02.A01.A04)) {
            C7Q c7q = this.A02.A01.A04;
            String str = this.A03.A06;
            String str2 = this.A03.A07;
            String str3 = this.A03.A08;
            String str4 = this.A03.A02;
            String string = th != null ? th.toString() : A00(0, 7, 51);
            Long lValueOf = Long.valueOf(System.currentTimeMillis() - this.A01);
            String[] strArr = A05;
            if (strArr[3].charAt(20) == strArr[0].charAt(20)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[2] = "AayJnSlXKOYoed0ZHJ3UlPrg44Go7inE";
            strArr2[7] = "t2uUu9WqhkybHrBNVhVVT1YnAGopOKs6";
            C6R.A05(c7q, str, str2, str3, A00(7, 5, 22), str4, 2119, string, null, lValueOf, null);
        }
        try {
            this.A02.A00.put(false);
        } catch (InterruptedException unused) {
        }
    }
}
