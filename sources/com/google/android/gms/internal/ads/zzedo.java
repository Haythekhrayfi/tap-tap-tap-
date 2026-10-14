package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzedo implements zzgwe {
    private final zzgwr zza;
    private final zzgwr zzb;

    public zzedo(zzgwr zzgwrVar, zzgwr zzgwrVar2) {
        this.zza = zzgwrVar;
        this.zzb = zzgwrVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzedn zzb() {
        return new zzedn((Context) this.zza.zzb(), (zzcpy) this.zzb.zzb());
    }
}
