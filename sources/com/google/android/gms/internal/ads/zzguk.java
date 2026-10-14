package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzguk extends zzgpm implements zzgqx {
    private static final zzguk zzb;
    private int zzd;
    private int zze;
    private zzguj zzf;
    private zzguj zzg;

    static {
        zzguk zzgukVar = new zzguk();
        zzb = zzgukVar;
        zzgpm.zzaU(zzguk.class, zzgukVar);
    }

    private zzguk() {
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", zzguh.zza, "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzguk();
        }
        zzgtb zzgtbVar = null;
        if (i11 == 4) {
            return new zzgug(zzgtbVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
