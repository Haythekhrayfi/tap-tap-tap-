package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgtv extends zzgpm implements zzgqx {
    private static final zzgtv zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private long zzh;

    static {
        zzgtv zzgtvVar = new zzgtv();
        zzb = zzgtvVar;
        zzgpm.zzaU(zzgtv.class, zzgtvVar);
    }

    private zzgtv() {
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဂ\u0003", new Object[]{"zzd", "zze", zzgtu.zza, "zzf", zzgts.zza, "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzgtv();
        }
        zzgtb zzgtbVar = null;
        if (i11 == 4) {
            return new zzgtt(zzgtbVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
