package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgue extends zzgpm implements zzgqx {
    private static final zzgue zzb;
    private int zzd;
    private int zze;
    private zzgoe zzf;
    private zzgoe zzg;

    static {
        zzgue zzgueVar = new zzgue();
        zzb = zzgueVar;
        zzgpm.zzaU(zzgue.class, zzgueVar);
    }

    private zzgue() {
        zzgoe zzgoeVar = zzgoe.zzb;
        this.zzf = zzgoeVar;
        this.zzg = zzgoeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzgue();
        }
        zzgtb zzgtbVar = null;
        if (i11 == 4) {
            return new zzgud(zzgtbVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
