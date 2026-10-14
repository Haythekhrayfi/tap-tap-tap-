package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class F5 {
    public static String[] A05 = {"uUgQSQgVsgHH0N1UsfY", "sl", "7AFLCGuL9JRzl", "SUkqvXm6rFeJNlyU4q2", "DM2QNBARzQjqq5KTyec", "OFwEtNlY3tfCjSjl1W0mAcBM0ytDkhEA", "Uou0zfuAqjYMYyC", "2ZbfYqEAzIBMf"};
    public static final F5 A06 = new F5(new long[0]);
    public final int A00;
    public final long A01;
    public final long A02;
    public final long[] A03;
    public final F3[] A04;

    public F5(long... jArr) {
        int length = jArr.length;
        this.A00 = length;
        this.A03 = Arrays.copyOf(jArr, length);
        this.A04 = new F3[length];
        for (int i10 = 0; i10 < length; i10++) {
            this.A04[i10] = new F3();
        }
        this.A01 = 0L;
        this.A02 = -9223372036854775807L;
    }

    public final int A00(long j10) {
        int i10 = 0;
        while (true) {
            long[] jArr = this.A03;
            int index = jArr.length;
            if (i10 >= index) {
                break;
            }
            long j11 = jArr[i10];
            if (j11 == Long.MIN_VALUE) {
                break;
            }
            if (A05[5].charAt(14) == 'w') {
                throw new RuntimeException();
            }
            A05[5] = "JOT1DKN2kTxJVBU4QbvAyq2E38ICiTh6";
            if (j10 < j11 && this.A04[i10].A02()) {
                break;
            }
            i10++;
        }
        int index2 = this.A03.length;
        if (i10 < index2) {
            return i10;
        }
        return -1;
    }

    public final int A01(long j10) {
        int length = this.A03.length - 1;
        while (length >= 0) {
            long j11 = this.A03[length];
            if (j11 != Long.MIN_VALUE && j11 <= j10) {
                break;
            }
            length--;
        }
        if (length < 0 || !this.A04[length].A02()) {
            return -1;
        }
        return length;
    }
}
