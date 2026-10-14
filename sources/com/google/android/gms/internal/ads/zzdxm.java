package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdxm implements zzgwe {
    private final zzgwr zza;
    private final zzgwr zzb;

    public zzdxm(zzgwr zzgwrVar, zzgwr zzgwrVar2) {
        this.zza = zzgwrVar;
        this.zzb = zzgwrVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdxl zzb() {
        return new zzdxl(((zzcha) this.zza).zza(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
