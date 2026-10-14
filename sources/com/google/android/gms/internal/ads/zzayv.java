package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzayv extends zzgpm implements zzgqx {
    private static final zzayv zzb;
    private int zzd;
    private zzayr zze;
    private zzgpv zzf = zzgpm.zzaN();
    private int zzg;
    private zzazx zzh;

    static {
        zzayv zzayvVar = new zzayv();
        zzb = zzayvVar;
        zzgpm.zzaU(zzayv.class, zzayvVar);
    }

    private zzayv() {
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003᠌\u0001\u0004ဉ\u0002", new Object[]{"zzd", "zze", "zzf", zzazv.class, "zzg", zzaym.zza, "zzh"});
        }
        if (i11 == 3) {
            return new zzayv();
        }
        zzaxg zzaxgVar = null;
        if (i11 == 4) {
            return new zzayu(zzaxgVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
