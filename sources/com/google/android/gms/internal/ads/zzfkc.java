package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfkc extends zzgpm implements zzgqx {
    private static final zzfkc zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private zzfjy zzh;

    static {
        zzfkc zzfkcVar = new zzfkc();
        zzb = zzfkcVar;
        zzgpm.zzaU(zzfkc.class, zzfkcVar);
    }

    private zzfkc() {
    }

    public static zzfka zza() {
        return (zzfka) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzfkc zzfkcVar, String str) {
        Objects.requireNonNull(str);
        zzfkcVar.zzd |= 2;
        zzfkcVar.zzf = str;
    }

    public static /* synthetic */ void zze(zzfkc zzfkcVar, zzfjy zzfjyVar) {
        Objects.requireNonNull(zzfjyVar);
        zzfkcVar.zzh = zzfjyVar;
        zzfkcVar.zzd |= 8;
    }

    public static /* synthetic */ void zzf(zzfkc zzfkcVar, int i10) {
        zzfkcVar.zze = 1;
        zzfkcVar.zzd = 1 | zzfkcVar.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", zzfkb.zza, "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzfkc();
        }
        zzfjz zzfjzVar = null;
        if (i11 == 4) {
            return new zzfka(zzfjzVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
