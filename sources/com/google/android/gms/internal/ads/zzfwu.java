package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzfwu {
    public static void zza(Throwable th) {
        if (th instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }
}
