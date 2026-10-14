package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbdw {
    private static final AtomicReference zzb = new AtomicReference();
    private static final AtomicReference zzc = new AtomicReference();
    public static final AtomicBoolean zza = new AtomicBoolean();

    public static zzbdu zza() {
        return (zzbdu) zzb.get();
    }

    public static zzbdv zzb() {
        return (zzbdv) zzc.get();
    }

    public static void zzc(zzbdu zzbduVar) {
        zzb.set(zzbduVar);
    }
}
