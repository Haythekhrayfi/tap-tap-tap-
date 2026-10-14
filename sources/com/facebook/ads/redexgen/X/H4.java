package com.facebook.ads.redexgen.X;

import java.io.File;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class H4 implements Comparable<H4> {
    public static String[] A06 = {"tyIMHYj4E3EgW4mShNYTh30KqADxMnXY", "o4JUlXa2QWu1MieYLvsMRT696KEqR", "les1EbCUxP4xgOdfeUltBKAu87PDHxqp", "SxfWhIkSVBET5IPf", "bPkhSE8L0qTQU8qqVG5cBeS4akAeFCpX", "MYrQWqVSdZJmtqUt3HjVFVZZ1A2nkQzV", "YLTzIQmg1iEN7fTeYL0Ebb05kPDCmFqk", "L0nZjQMyNIt0WlCmUM7oX7gpc1lDkDOo"};
    public final long A00;
    public final long A01;
    public final long A02;
    public final File A03;
    public final String A04;
    public final boolean A05;

    public H4(String str, long j10, long j11, long j12, File file) {
        this.A04 = str;
        this.A02 = j10;
        this.A01 = j11;
        this.A05 = file != null;
        this.A03 = file;
        this.A00 = j12;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(H4 h10) {
        if (!this.A04.equals(h10.A04)) {
            return this.A04.compareTo(h10.A04);
        }
        long j10 = this.A02 - h10.A02;
        String[] strArr = A06;
        if (strArr[0].charAt(26) != strArr[6].charAt(26)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[0] = "iYRssdXy9CB99yO9PwMxA9WvOrDQskNV";
        strArr2[6] = "6rGRVoRQr925zwi8UOEHhi5JTPDCThCe";
        if (j10 == 0) {
            return 0;
        }
        return j10 < 0 ? -1 : 1;
    }

    public final boolean A01() {
        return !this.A05;
    }

    public final boolean A02() {
        return this.A01 == -1;
    }
}
