package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfuk extends zzful {
    public static int zza(long j10) {
        int i10 = (int) j10;
        if (i10 == j10) {
            return i10;
        }
        throw new IllegalArgumentException(zzfpw.zzb("Out of range: %s", Long.valueOf(j10)));
    }

    public static int zzb(int i10, int i11, int i12) {
        return Math.min(Math.max(i10, i11), 1073741823);
    }

    public static int zzc(long j10) {
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j10 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j10;
    }
}
