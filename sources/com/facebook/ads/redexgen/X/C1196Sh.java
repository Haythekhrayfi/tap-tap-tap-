package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1196Sh implements InterfaceC1056Mx {
    public static byte[] A01;
    public static String[] A02 = {"kBW4xLQ0UagetoFfZBciP8yG8j8W9VjJ", "CuM3P9amPTPJ5VHvR15Uue2Gct3r32Ot", "lbGRsJ8fypW9S7UDq3wjuqDAeCT4ZPX8", "CX6eEzMwkcIPtUXHSQR62noGC5y", "Dd2JYkt6fB7OqeIXSHoD4gCnoZc1iMAP", "m18x0ngOflO", "jU1O956PNCfHvoVw6Wvh6mauWMk", "8DHuyV3l5L6zPCdvs"};
    public final /* synthetic */ C1190Sb A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 36);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{33, 39, 49, 38, 11, 58, 53, 34, 61, 51, 53, 32, 61, 59, 58, 11, 61, 53, 54};
    }

    static {
        A01();
    }

    public C1196Sh(C1190Sb c1190Sb) {
        this.A00 = c1190Sb;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1056Mx
    public final void AC5(String str) {
        this.A00.A0T = false;
        this.A00.A0H.setProgress(100);
        LO.A0N(this.A00.A0H, 8);
        if (this.A00.A0F.A0d() && this.A00.A0I != null) {
            String strA0L = this.A00.A0F.A0L();
            if (!TextUtils.isEmpty(strA0L)) {
                this.A00.A0I.loadUrl(strA0L);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1056Mx
    public final void AC7(String str) {
        this.A00.A0T = true;
        LO.A0N(this.A00.A0H, 0);
        this.A00.A0G.setUrl(str);
        if (!this.A00.A0S) {
            C1190Sb c1190Sb = this.A00;
            if (A02[2].charAt(10) != 'W') {
                throw new RuntimeException();
            }
            A02[2] = "iBZiIf2sDnWp0Vlx6S4c9whpzLyUbI90";
            if (c1190Sb.A01 > 1) {
                this.A00.A0S = true;
                this.A00.A0Z(A00(0, 19, 112));
            }
        }
        C1190Sb.A03(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1056Mx
    public final void ACP(int i10) {
        if (this.A00.A0T) {
            C1049Mq c1049Mq = this.A00.A0H;
            String[] strArr = A02;
            if (strArr[3].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[3] = "lMw90bHodMLjKU6qsq03ZDigEQG";
            strArr2[6] = "W3A1xCHgBxfgFje8Ug40eYh6nHu";
            c1049Mq.setProgress(i10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1056Mx
    public final void ACU(String str) {
        this.A00.A0G.setTitle(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1056Mx
    public final void ACW() {
        this.A00.A0K.A09().AAa(14);
    }
}
