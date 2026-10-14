package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgwo {
    private final List zza;
    private final List zzb;

    public /* synthetic */ zzgwo(int i10, int i11, zzgwn zzgwnVar) {
        this.zza = zzgwb.zzc(i10);
        this.zzb = zzgwb.zzc(i11);
    }

    public final zzgwo zza(zzgwr zzgwrVar) {
        this.zzb.add(zzgwrVar);
        return this;
    }

    public final zzgwo zzb(zzgwr zzgwrVar) {
        this.zza.add(zzgwrVar);
        return this;
    }

    public final zzgwp zzc() {
        return new zzgwp(this.zza, this.zzb, null);
    }
}
