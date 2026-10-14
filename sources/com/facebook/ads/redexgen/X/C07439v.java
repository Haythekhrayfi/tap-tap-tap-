package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C07439v {
    public static String[] A06 = {"WwB4b7", "9U9mb9jKte7kllJhP3clLvI5b73", "TDqEL0AoY", "4IvfGYKFDovhkqqhRuF", "llxeZdB1AGHDFzy1eOGJjj7vjbGoDyRo", "wyDFlV", "VELYNO0Lyu3d7b6TF4mD3ooMbXgWeIiM", "iuggwru9v4rPlYsWAIf5ZcemLGs"};
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public long A04;
    public F5 A05;

    public final int A00() {
        return this.A05.A00;
    }

    public final int A01(int i10) {
        return this.A05.A04[i10].A00;
    }

    public final int A02(int i10) {
        return this.A05.A04[i10].A00();
    }

    public final int A03(int i10, int i11) {
        return this.A05.A04[i10].A01(i11);
    }

    public final int A04(long j10) {
        return this.A05.A00(j10);
    }

    public final int A05(long j10) {
        return this.A05.A01(j10);
    }

    public final long A06() {
        return this.A05.A01;
    }

    public final long A07() {
        return this.A01;
    }

    public final long A08() {
        return C9C.A01(this.A04);
    }

    public final long A09(int i10) {
        return this.A05.A03[i10];
    }

    public final long A0A(int i10, int i11) {
        F3 f10 = this.A05.A04[i10];
        if (f10.A00 == -1) {
            return -9223372036854775807L;
        }
        long[] jArr = f10.A02;
        if (A06[2].length() != 9) {
            throw new RuntimeException();
        }
        A06[2] = "IGBMGqW3m";
        return jArr[i11];
    }

    public final C07439v A0B(Object obj, Object obj2, int i10, long j10, long j11) {
        return A0C(obj, obj2, i10, j10, j11, F5.A06);
    }

    public final C07439v A0C(Object obj, Object obj2, int i10, long j10, long j11, F5 f10) {
        this.A02 = obj;
        this.A03 = obj2;
        this.A00 = i10;
        this.A01 = j10;
        this.A04 = j11;
        this.A05 = f10;
        return this;
    }

    public final boolean A0D(int i10) {
        return !this.A05.A04[i10].A02();
    }

    public final boolean A0E(int i10, int i11) {
        F3 f10 = this.A05.A04[i10];
        return (f10.A00 == -1 || f10.A01[i11] == 0) ? false : true;
    }
}
