package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzecw implements zzgwe {
    private final zzgwr zza;
    private final zzgwr zzb;

    public zzecw(zzgwr zzgwrVar, zzgwr zzgwrVar2) {
        this.zza = zzgwrVar;
        this.zzb = zzgwrVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzecv zzb() {
        return new zzecv((Context) this.zza.zzb(), (zzcop) this.zzb.zzb());
    }
}
