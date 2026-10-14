package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzayt extends zzgpm implements zzgqx {
    private static final zzayt zzb;
    private int zzd;
    private int zze;
    private zzgpr zzf = zzgpm.zzaJ();

    static {
        zzayt zzaytVar = new zzayt();
        zzb = zzaytVar;
        zzgpm.zzaU(zzayt.class, zzaytVar);
    }

    private zzayt() {
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u0016", new Object[]{"zzd", "zze", zzaym.zza, "zzf"});
        }
        if (i11 == 3) {
            return new zzayt();
        }
        zzaxg zzaxgVar = null;
        if (i11 == 4) {
            return new zzays(zzaxgVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
