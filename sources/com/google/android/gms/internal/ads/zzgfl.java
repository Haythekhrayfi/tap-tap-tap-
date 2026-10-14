package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgfl extends RuntimeException {
    public zzgfl(String str) {
        super(str);
    }

    public zzgfl(String str, Throwable th) {
        super("Creating a protokey serialization failed", th);
    }

    public zzgfl(Throwable th) {
        super(th);
    }
}
