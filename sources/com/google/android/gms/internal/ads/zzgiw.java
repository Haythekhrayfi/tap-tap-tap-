package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgiw extends zzgpm implements zzgqx {
    private static final zzgiw zzb;
    private int zzd;
    private zzgjc zze;
    private zzgoe zzf = zzgoe.zzb;

    static {
        zzgiw zzgiwVar = new zzgiw();
        zzb = zzgiwVar;
        zzgpm.zzaU(zzgiw.class, zzgiwVar);
    }

    private zzgiw() {
    }

    public static zzgiv zzc() {
        return (zzgiv) zzb.zzaA();
    }

    public static zzgiw zze(zzgoe zzgoeVar, zzgoy zzgoyVar) throws zzgpy {
        return (zzgiw) zzgpm.zzaG(zzb, zzgoeVar, zzgoyVar);
    }

    public static /* synthetic */ void zzi(zzgiw zzgiwVar, zzgjc zzgjcVar) {
        Objects.requireNonNull(zzgjcVar);
        zzgiwVar.zze = zzgjcVar;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzgiw();
        }
        zzgiu zzgiuVar = null;
        if (i11 == 4) {
            return new zzgiv(zzgiuVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgjc zzf() {
        zzgjc zzgjcVar = this.zze;
        return zzgjcVar == null ? zzgjc.zze() : zzgjcVar;
    }

    public final zzgoe zzg() {
        return this.zzf;
    }
}
