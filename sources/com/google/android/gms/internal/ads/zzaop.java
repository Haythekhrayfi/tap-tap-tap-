package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaop extends zzgpm implements zzgqx {
    private static final zzaop zzb;
    private int zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzgpr zzh = zzgpm.zzaJ();
    private long zzi;

    static {
        zzaop zzaopVar = new zzaop();
        zzb = zzaopVar;
        zzgpm.zzaU(zzaop.class, zzaopVar);
    }

    private zzaop() {
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new zzaop();
        }
        zzanp zzanpVar = null;
        if (i11 == 4) {
            return new zzaoo(zzanpVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
