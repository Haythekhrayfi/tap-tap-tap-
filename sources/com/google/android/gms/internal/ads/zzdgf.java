package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdgf implements zzgwe {
    private final zzgwr zza;
    private final zzgwr zzb;

    public zzdgf(zzgwr zzgwrVar, zzgwr zzgwrVar2) {
        this.zza = zzgwrVar;
        this.zzb = zzgwrVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdco((Context) this.zza.zzb(), new HashSet(), ((zzcrt) this.zzb).zza());
    }
}
