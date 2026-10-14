package com.applovin.exoplayer2.common.b;

import com.applovin.exoplayer2.common.base.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static int a(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static int a(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        return j10 > j11 ? 1 : 0;
    }

    public static long a(long... jArr) {
        Preconditions.checkArgument(jArr.length > 0);
        long j10 = jArr[0];
        for (int i10 = 1; i10 < jArr.length; i10++) {
            if (jArr[i10] > j10) {
                j10 = jArr[i10];
            }
        }
        return j10;
    }
}
