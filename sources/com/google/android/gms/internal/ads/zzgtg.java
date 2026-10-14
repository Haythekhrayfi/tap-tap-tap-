package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgtg extends zzgpm implements zzgqx {
    private static final zzgtg zzb;
    private int zzd;
    private int zze;
    private long zzf;
    private zzgoe zzg = zzgoe.zzb;

    static {
        zzgtg zzgtgVar = new zzgtg();
        zzb = zzgtgVar;
        zzgpm.zzaU(zzgtg.class, zzgtgVar);
    }

    private zzgtg() {
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", zzgtf.zza, "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzgtg();
        }
        zzgtb zzgtbVar = null;
        if (i11 == 4) {
            return new zzgte(zzgtbVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
