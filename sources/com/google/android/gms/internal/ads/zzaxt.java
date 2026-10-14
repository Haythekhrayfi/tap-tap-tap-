package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaxt extends zzgpm implements zzgqx {
    private static final zzaxt zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    static {
        zzaxt zzaxtVar = new zzaxt();
        zzb = zzaxtVar;
        zzgpm.zzaU(zzaxt.class, zzaxtVar);
    }

    private zzaxt() {
    }

    public static zzaxs zza() {
        return (zzaxs) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzaxt zzaxtVar, boolean z10) {
        zzaxtVar.zzd |= 1;
        zzaxtVar.zze = z10;
    }

    public static /* synthetic */ void zze(zzaxt zzaxtVar, boolean z10) {
        zzaxtVar.zzd |= 2;
        zzaxtVar.zzf = z10;
    }

    public static /* synthetic */ void zzf(zzaxt zzaxtVar, int i10) {
        zzaxtVar.zzd |= 4;
        zzaxtVar.zzg = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzaxt();
        }
        zzaxg zzaxgVar = null;
        if (i11 == 4) {
            return new zzaxs(zzaxgVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
