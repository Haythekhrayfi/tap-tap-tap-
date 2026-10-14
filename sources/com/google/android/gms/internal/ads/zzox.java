package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzox extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzox(long j10, long j11) {
        StringBuilder sbA = i2.a.a("Unexpected audio track timestamp discontinuity: expected ", j11, ", got ");
        sbA.append(j10);
        super(sbA.toString());
    }
}
