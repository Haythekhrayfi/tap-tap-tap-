package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfbe {
    private final Deque zza = new LinkedBlockingDeque();
    private final Callable zzb;
    private final zzfwn zzc;

    public zzfbe(Callable callable, zzfwn zzfwnVar) {
        this.zzb = callable;
        this.zzc = zzfwnVar;
    }

    public final synchronized zzfwm zza() {
        zzc(1);
        return (zzfwm) this.zza.poll();
    }

    public final synchronized void zzb(zzfwm zzfwmVar) {
        this.zza.addFirst(zzfwmVar);
    }

    public final synchronized void zzc(int i10) {
        int size = i10 - this.zza.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.zza.add(this.zzc.zzb(this.zzb));
        }
    }
}
