package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzebb implements zzgwe {
    private final zzgwr zza;
    private final zzgwr zzb;

    public zzebb(zzgwr zzgwrVar, zzgwr zzgwrVar2) {
        this.zza = zzgwrVar;
        this.zzb = zzgwrVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextZza = ((zzcha) this.zza).zza();
        zzfwn zzfwnVar = zzcae.zza;
        zzgwm.zzb(zzfwnVar);
        return new zzeba(contextZza, zzfwnVar);
    }
}
