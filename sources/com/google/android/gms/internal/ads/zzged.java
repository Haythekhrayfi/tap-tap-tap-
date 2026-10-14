package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzged {
    private static final zzged zza = new zzged();
    private static final zzgec zzb = new zzgec(null);
    private final AtomicReference zzc = new AtomicReference();

    public static zzged zza() {
        return zza;
    }

    public final zzghp zzb() {
        zzghp zzghpVar = (zzghp) this.zzc.get();
        return zzghpVar == null ? zzb : zzghpVar;
    }
}
