package com.google.android.gms.internal.ads;

import androidx.activity.j;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzfwr extends zzfuq.zzi implements Runnable {
    private final Runnable zza;

    public zzfwr(Runnable runnable) {
        Objects.requireNonNull(runnable);
        this.zza = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.run();
        } catch (Error | RuntimeException e10) {
            zze(e10);
            throw e10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuq
    public final String zza() {
        return j.a("task=[", this.zza.toString(), "]");
    }
}
