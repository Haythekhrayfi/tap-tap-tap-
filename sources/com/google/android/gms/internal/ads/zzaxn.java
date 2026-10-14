package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaxn extends zzgpm implements zzgqx {
    private static final zzaxn zzb;
    private int zzd;
    private int zze;
    private zzaxr zzf;
    private zzaxt zzg;

    static {
        zzaxn zzaxnVar = new zzaxn();
        zzb = zzaxnVar;
        zzgpm.zzaU(zzaxn.class, zzaxnVar);
    }

    private zzaxn() {
    }

    public static zzaxm zza() {
        return (zzaxm) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzaxn zzaxnVar, zzaxr zzaxrVar) {
        Objects.requireNonNull(zzaxrVar);
        zzaxnVar.zzf = zzaxrVar;
        zzaxnVar.zzd |= 2;
    }

    public static /* synthetic */ void zze(zzaxn zzaxnVar, zzaxt zzaxtVar) {
        Objects.requireNonNull(zzaxtVar);
        zzaxnVar.zzg = zzaxtVar;
        zzaxnVar.zzd |= 4;
    }

    public static /* synthetic */ void zzf(zzaxn zzaxnVar, int i10) {
        zzaxnVar.zze = 1;
        zzaxnVar.zzd = 1 | zzaxnVar.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", zzaxp.zza, "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzaxn();
        }
        zzaxg zzaxgVar = null;
        if (i11 == 4) {
            return new zzaxm(zzaxgVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
