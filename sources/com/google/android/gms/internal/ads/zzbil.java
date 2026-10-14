package com.google.android.gms.internal.ads;

import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbil {
    private boolean zza = false;
    private boolean zzb = false;
    private float zzc = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
    private final AtomicBoolean zzd = new AtomicBoolean(false);

    public final synchronized float zza() {
        return this.zzc;
    }

    public final synchronized void zzb(boolean z10, float f10) {
        this.zzb = z10;
        this.zzc = f10;
    }

    public final synchronized void zzc(boolean z10) {
        this.zza = z10;
        this.zzd.set(true);
    }

    public final synchronized boolean zzd() {
        return this.zzb;
    }

    public final synchronized boolean zze(boolean z10) {
        if (!this.zzd.get()) {
            return z10;
        }
        return this.zza;
    }
}
