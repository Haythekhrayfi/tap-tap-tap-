package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzglb extends zzgpm implements zzgqx {
    private static final zzglb zzb;
    private String zzd = "";
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzglb zzglbVar = new zzglb();
        zzb = zzglbVar;
        zzgpm.zzaU(zzglb.class, zzglbVar);
    }

    private zzglb() {
    }

    public static zzgla zza() {
        return (zzgla) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzglb zzglbVar, String str) {
        Objects.requireNonNull(str);
        zzglbVar.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzglb();
        }
        zzgky zzgkyVar = null;
        if (i11 == 4) {
            return new zzgla(zzgkyVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
