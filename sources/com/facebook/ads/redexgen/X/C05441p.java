package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C05441p {
    public static byte[] A00;
    public static String[] A01 = {"SZD1gnuwYC0ZDT5XCpN5wGg04vpvlXtv", "38Pkme0hctlwOycqXgIFmSt4EwGMsPu", "PZ5YSJhnqoOlFoXIJ", "MKZOkal4amZt32sY0duMnYWyMVrdvNv7", "PmMqC", "MtvBWYcgrX5nN2Ecp9gb0xGXALHF8kJ8", "836OSMulKGxVhnpon", "Ud77gBKi5ZcurXFgX0oEk2YfAMQgAhDP"};

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 18);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{Ascii.EM, 95, 67, 90, 91, 103, 96, 122, 107, 124, 125, 122, 103, 122, 103, 111, 98, 3, 20, 6, 16, 3, 21, 20, 21, 46, 7, Ascii.CAN, 21, 20, Ascii.RS};
    }

    static {
        A01();
    }

    public static void A02(C1337Xw c1337Xw, C6O c6o, C0855Ew c0855Ew) {
        c6o.A0c(new C6M(c0855Ew.A0q().A01(), P1.A04, P1.A04, c0855Ew.A0M(), A00(17, 14, 99)));
        boolean zA0c = c0855Ew.A0c();
        if (zA0c) {
            C6K c6k = new C6K(c0855Ew.A0H(), c0855Ew.A0M(), A00(17, 14, 99));
            c6k.A04 = true;
            c6k.A03 = A00(0, 5, 37);
            c6o.A0X(c6k);
        }
        boolean isDSL = Q9.A03();
        boolean zA2M = IN.A2M(c1337Xw, isDSL);
        C6K c6k2 = new C6K(c0855Ew.A0n().A0D().A08(), c0855Ew.A0M(), A00(17, 14, 99), c0855Ew.A0n().A0D().A05());
        if (zA0c && !zA2M) {
            c6o.A0X(c6k2);
        } else {
            c6o.A0a(c6k2);
        }
        c6o.A0c(new C6M(c0855Ew.A0n().A0D().A07(), C05391k.A00(c0855Ew.A0n().A0D()), C05391k.A01(c0855Ew.A0n().A0D()), c0855Ew.A0M(), A00(17, 14, 99)));
        Iterator<String> it = c0855Ew.A0n().A0G().A01().iterator();
        while (isDSL) {
            String url = it.next();
            c6o.A0c(new C6M(url, -1, -1, c0855Ew.A0M(), A00(17, 14, 99)));
        }
    }

    public static void A03(C1337Xw c1337Xw, C6O c6o, C0855Ew c0855Ew) {
        int i10 = 0;
        for (C1D c1d : c0855Ew.A0u()) {
            C6M c6m = new C6M(c1d.A0D().A07(), C05391k.A00(c1d.A0D()), C05391k.A01(c1d.A0D()), c0855Ew.A0M(), A00(5, 12, 28));
            if (i10 == 0) {
                c6o.A0b(c6m);
            } else {
                c6o.A0c(c6m);
            }
            Iterator<String> it = c1d.A0G().A01().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                String[] strArr = A01;
                if (strArr[2].length() != strArr[6].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[0] = "d4OGgqInyGax2uUwuJ6rocUy9OK0g6RJ";
                strArr2[7] = "8ZRzgNChvbJeQD0ONiajCC1PQNrhJWUQ";
                if (zHasNext) {
                    c6o.A0c(new C6M(it.next(), -1, -1, c0855Ew.A0M(), A00(5, 12, 28)));
                }
            }
            if (!TextUtils.isEmpty(c1d.A0D().A08())) {
                new C6K(c1d.A0D().A08(), c0855Ew.A0M(), A00(5, 12, 28), c1d.A0D().A05()).A04 = false;
            }
            i10++;
        }
    }
}
