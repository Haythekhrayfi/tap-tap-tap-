package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzegh implements zzgwe {
    private final zzgwr zza;
    private final zzgwr zzb;

    public zzegh(zzgwr zzgwrVar, zzgwr zzgwrVar2) {
        this.zza = zzgwrVar;
        this.zzb = zzgwrVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzegg zzb() {
        return new zzegg((Context) this.zza.zzb(), (zzdmr) this.zzb.zzb());
    }
}
