package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzazx extends zzgpm implements zzgqx {
    private static final zzazx zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzazx zzazxVar = new zzazx();
        zzb = zzazxVar;
        zzgpm.zzaU(zzazx.class, zzazxVar);
    }

    private zzazx() {
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzazx();
        }
        zzaxg zzaxgVar = null;
        if (i11 == 4) {
            return new zzazw(zzaxgVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
