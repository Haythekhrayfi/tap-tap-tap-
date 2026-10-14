package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzglf extends zzgpm implements zzgqx {
    private static final zzglf zzb;
    private int zzd;
    private zzgli zze;

    static {
        zzglf zzglfVar = new zzglf();
        zzb = zzglfVar;
        zzgpm.zzaU(zzglf.class, zzglfVar);
    }

    private zzglf() {
    }

    public static zzgle zzc() {
        return (zzgle) zzb.zzaA();
    }

    public static zzglf zze(zzgoe zzgoeVar, zzgoy zzgoyVar) throws zzgpy {
        return (zzglf) zzgpm.zzaG(zzb, zzgoeVar, zzgoyVar);
    }

    public static /* synthetic */ void zzh(zzglf zzglfVar, zzgli zzgliVar) {
        Objects.requireNonNull(zzgliVar);
        zzglfVar.zze = zzgliVar;
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
            return zzgpm.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new zzglf();
        }
        zzgld zzgldVar = null;
        if (i11 == 4) {
            return new zzgle(zzgldVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgli zzf() {
        zzgli zzgliVar = this.zze;
        return zzgliVar == null ? zzgli.zzc() : zzgliVar;
    }
}
