package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcpa implements zzgwe {
    private final zzgwr zza;
    private final zzgwr zzb;

    public zzcpa(zzgwr zzgwrVar, zzgwr zzgwrVar2) {
        this.zza = zzgwrVar;
        this.zzb = zzgwrVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcxv zzb() {
        return new zzcxv((ScheduledExecutorService) this.zza.zzb(), (Clock) this.zzb.zzb());
    }
}
