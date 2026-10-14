package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzguj extends zzgpm implements zzgqx {
    private static final zzguj zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        zzguj zzgujVar = new zzguj();
        zzb = zzgujVar;
        zzgpm.zzaU(zzguj.class, zzgujVar);
    }

    private zzguj() {
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            zzgpq zzgpqVar = zzguh.zza;
            return zzgpm.zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", zzgpqVar, "zzf", "zzg", zzgpqVar});
        }
        if (i11 == 3) {
            return new zzguj();
        }
        zzgtb zzgtbVar = null;
        if (i11 == 4) {
            return new zzgui(zzgtbVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
