package com.facebook.ads.redexgen.X;

import android.net.TrafficStats;
import java.util.Arrays;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6L, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C6L implements Callable<Boolean> {
    public static byte[] A02;
    public static String[] A03 = {"4L70rbdc", "PBHhMXx0npnpwTY", "91GJPzFmEyeOW3DYeKz29HPCrWXW0gNC", "umTRidE45okZulrVlJrHIV8", "kRbho3HgdeG0CdJ8rA209tRImftPXEnI", "60YY30c8MY", "ZuHjaYDngPTOcLYvMZdLe8TI8ruUn8GD", "lL0vcWHD5F"};
    public final C6K A00;
    public final /* synthetic */ C6O A01;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 32);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{114, 126, 109, 116, 106, 111, 43, 52, 57, 56, 50};
        if (A03[1].length() != 15) {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[7] = "XFV0lH04tD";
        strArr[5] = "8rdCtS3Igw";
    }

    static {
        A02();
    }

    public C6L(C6O c6o, C6K c6k) {
        this.A01 = c6o;
        this.A00 = c6k;
    }

    private final Boolean A00() throws Throwable {
        String strA01;
        if (C0979Jw.A02(this)) {
            return null;
        }
        try {
            TrafficStats.setThreadStatsTag(61453);
            if (this.A00.A04) {
                strA01 = A01(0, 6, 63);
            } else {
                strA01 = A01(6, 5, 125);
            }
            String str = this.A00.A08;
            String creativeType = this.A00.A07;
            AnonymousClass06 anonymousClass06 = new AnonymousClass06(str, creativeType, this.A00.A06, strA01, this.A00.A02, this.A00.A05);
            anonymousClass06.A04 = this.A00.A03;
            anonymousClass06.A02 = this.A00.A01;
            anonymousClass06.A05 = this.A00.A04;
            if (C6R.A06(this.A01.A04)) {
                C6O.A0F.put(this.A00.A08, anonymousClass06);
            }
            return Boolean.valueOf(C6O.A03(this.A01.A04.A01()).AEY(anonymousClass06) != null);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
            return null;
        }
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Boolean call() throws Exception {
        if (C0979Jw.A02(this)) {
            return null;
        }
        try {
            return A00();
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
            return null;
        }
    }
}
