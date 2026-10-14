package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeln {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    private zzelm zzb;

    public final zzelm zza() {
        return this.zzb;
    }

    public final void zzb(zzelm zzelmVar) {
        this.zzb = zzelmVar;
    }

    public final void zzc(boolean z10) {
        this.zza.set(true);
    }

    public final boolean zzd() {
        return this.zza.get();
    }
}
