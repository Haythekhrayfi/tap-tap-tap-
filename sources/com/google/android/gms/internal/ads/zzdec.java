package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdec implements zzgwe {
    private final zzddr zza;
    private final zzgwr zzb;

    public zzdec(zzddr zzddrVar, zzgwr zzgwrVar) {
        this.zza = zzddrVar;
        this.zzb = zzgwrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setZzf = this.zza.zzf((zzcud) this.zzb.zzb());
        zzgwm.zzb(setZzf);
        return setZzf;
    }
}
