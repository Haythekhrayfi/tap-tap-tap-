package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzayr extends zzgpm implements zzgqx {
    private static final zzayr zzb;
    private int zzd;
    private int zzf;
    private zzazx zzh;
    private String zze = "";
    private zzgpr zzg = zzgpm.zzaJ();

    static {
        zzayr zzayrVar = new zzayr();
        zzb = zzayrVar;
        zzgpm.zzaU(zzayr.class, zzayrVar);
    }

    private zzayr() {
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zzd", "zze", "zzf", zzaym.zza, "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzayr();
        }
        zzaxg zzaxgVar = null;
        if (i11 == 4) {
            return new zzayq(zzaxgVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
