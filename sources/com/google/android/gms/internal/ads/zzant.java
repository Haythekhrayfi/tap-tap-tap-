package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzant extends zzgpm implements zzgqx {
    private static final zzant zzb;
    private int zzd;
    private int zze;

    static {
        zzant zzantVar = new zzant();
        zzb = zzantVar;
        zzgpm.zzaU(zzant.class, zzantVar);
    }

    private zzant() {
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzanx.zza});
        }
        if (i11 == 3) {
            return new zzant();
        }
        zzanp zzanpVar = null;
        if (i11 == 4) {
            return new zzans(zzanpVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
