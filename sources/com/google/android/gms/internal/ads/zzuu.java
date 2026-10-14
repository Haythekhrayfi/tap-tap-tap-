package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzuu implements zzua {
    private final zzgd zzc;
    private int zzd;
    private final zzut zze;
    private final zzxt zzf;
    private final zzql zzg;

    public zzuu(zzgd zzgdVar, zzut zzutVar) {
        zzql zzqlVar = new zzql();
        zzxt zzxtVar = new zzxt();
        this.zzc = zzgdVar;
        this.zze = zzutVar;
        this.zzg = zzqlVar;
        this.zzf = zzxtVar;
        this.zzd = 1048576;
    }

    public final zzuu zza(int i10) {
        this.zzd = i10;
        return this;
    }

    public final zzuw zzb(zzbp zzbpVar) {
        Objects.requireNonNull(zzbpVar.zzd);
        return new zzuw(zzbpVar, this.zzc, this.zze, zzqu.zza, this.zzf, this.zzd, null);
    }
}
