package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzayb extends zzgpm implements zzgqx {
    private static final zzayb zzb;
    private int zzd;
    private String zze = "";
    private zzgpv zzf = zzgpm.zzaN();
    private int zzg;

    static {
        zzayb zzaybVar = new zzayb();
        zzb = zzaybVar;
        zzgpm.zzaU(zzayb.class, zzaybVar);
    }

    private zzayb() {
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001", new Object[]{"zzd", "zze", "zzf", zzaxz.class, "zzg", zzaym.zza});
        }
        if (i11 == 3) {
            return new zzayb();
        }
        zzaxg zzaxgVar = null;
        if (i11 == 4) {
            return new zzaya(zzaxgVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
