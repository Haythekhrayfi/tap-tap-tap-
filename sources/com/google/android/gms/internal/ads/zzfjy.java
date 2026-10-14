package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfjy extends zzgpm implements zzgqx {
    private static final zzgps zzb = new zzfjv();
    private static final zzfjy zzd;
    private int zze;
    private zzgpr zzf = zzgpm.zzaJ();
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        zzfjy zzfjyVar = new zzfjy();
        zzd = zzfjyVar;
        zzgpm.zzaU(zzfjy.class, zzfjyVar);
    }

    private zzfjy() {
    }

    public static zzfjx zza() {
        return (zzfjx) zzd.zzaA();
    }

    public static /* synthetic */ void zzd(zzfjy zzfjyVar, String str) {
        Objects.requireNonNull(str);
        zzfjyVar.zze |= 1;
        zzfjyVar.zzg = str;
    }

    public static /* synthetic */ void zze(zzfjy zzfjyVar, int i10) {
        zzgpr zzgprVar = zzfjyVar.zzf;
        if (!zzgprVar.zzc()) {
            zzfjyVar.zzf = zzgpm.zzaK(zzgprVar);
        }
        zzfjyVar.zzf.zzh(2);
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zze", "zzf", zzfjw.zza, "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new zzfjy();
        }
        zzfjv zzfjvVar = null;
        if (i11 == 4) {
            return new zzfjx(zzfjvVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzd;
    }
}
