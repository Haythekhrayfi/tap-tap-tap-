package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class EU {
    public static String[] A04 = {"TJGXeByBmTHQPhxlQWaLs9WTuhAPsvDn", "cTyjqlp8UNOQyLJMZAg4XzmxFMTsV66P", "jpK43NGJIXClE5ie7D0g7Fa1Rpa7kANX", "QOLMQ2OzOpXdQRVqr", "8HaEwRmcLljD6jWZTmAaPx2QrUAiOCOo", "DwqRJ6bMYzXyiD2Eugn3dkRE0I23BFLv", "IP6wvLF5I09xjY7fYX", "9PCiAf0"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;

    public EU(int i10) {
        this(i10, -1L);
    }

    public EU(int i10, int i11, int i12, long j10) {
        this.A02 = i10;
        this.A00 = i11;
        this.A01 = i12;
        this.A03 = j10;
    }

    public EU(int i10, long j10) {
        this(i10, -1, -1, j10);
    }

    public final EU A00(int i10) {
        if (this.A02 == i10) {
            return this;
        }
        return new EU(i10, this.A00, this.A01, this.A03);
    }

    public final boolean A01() {
        return this.A00 != -1;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0056 A[ORIG_RETURN, RETURN] */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EU eu = (EU) obj;
        int i10 = this.A02;
        int i11 = eu.A02;
        if (A04[5].charAt(6) == 'n') {
            throw new RuntimeException();
        }
        A04[5] = "1RYqQKBI4tHo2l91LJlKc5yEyLaxvrL0";
        if (i10 == i11 && this.A00 == eu.A00) {
            int i12 = this.A01;
            if (A04[6].length() != 3) {
                A04[3] = "Mb83VhRFw0YfLpvsGxQ6UEzyZMUp7";
                if (i12 == eu.A01) {
                    if (this.A03 == eu.A03) {
                        return true;
                    }
                }
            } else if (i12 == eu.A01) {
                if (this.A03 == eu.A03) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A02;
        int result2 = ((((17 * 31) + result) * 31) + this.A00) * 31;
        int result3 = this.A01;
        return ((result2 + result3) * 31) + ((int) this.A03);
    }
}
