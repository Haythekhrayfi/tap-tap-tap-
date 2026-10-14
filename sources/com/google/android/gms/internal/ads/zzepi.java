package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class zzepi implements zzgwe {
    private final zzgwr zza;
    private final zzgwr zzb;

    public zzepi(zzgwr zzgwrVar, zzgwr zzgwrVar2) {
        this.zza = zzgwrVar;
        this.zzb = zzgwrVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeph(((zzduj) this.zza).zzb(), (PackageInfo) this.zzb.zzb());
    }
}
