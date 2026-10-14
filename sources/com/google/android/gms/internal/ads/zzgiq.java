package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgiq extends zzgpm implements zzgqx {
    private static final zzgiq zzb;
    private zzgit zzd;
    private int zze;

    static {
        zzgiq zzgiqVar = new zzgiq();
        zzb = zzgiqVar;
        zzgpm.zzaU(zzgiq.class, zzgiqVar);
    }

    private zzgiq() {
    }

    public static zzgip zzc() {
        return (zzgip) zzb.zzaA();
    }

    public static zzgiq zze() {
        return zzb;
    }

    public static zzgiq zzf(zzgoe zzgoeVar, zzgoy zzgoyVar) throws zzgpy {
        return (zzgiq) zzgpm.zzaG(zzb, zzgoeVar, zzgoyVar);
    }

    public static /* synthetic */ void zzh(zzgiq zzgiqVar, zzgit zzgitVar) {
        Objects.requireNonNull(zzgitVar);
        zzgiqVar.zzd = zzgitVar;
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new zzgiq();
        }
        zzgio zzgioVar = null;
        if (i11 == 4) {
            return new zzgip(zzgioVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgit zzg() {
        zzgit zzgitVar = this.zzd;
        return zzgitVar == null ? zzgit.zze() : zzgitVar;
    }
}
