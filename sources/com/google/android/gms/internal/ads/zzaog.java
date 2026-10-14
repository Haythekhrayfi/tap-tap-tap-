package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaog extends zzgpm implements zzgqx {
    private static final zzaog zzb;
    private int zzd;
    private int zze;
    private long zzf = -1;

    static {
        zzaog zzaogVar = new zzaog();
        zzb = zzaogVar;
        zzgpm.zzaU(zzaog.class, zzaogVar);
    }

    private zzaog() {
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", zzanv.zza, "zzf"});
        }
        if (i11 == 3) {
            return new zzaog();
        }
        zzanp zzanpVar = null;
        if (i11 == 4) {
            return new zzaof(zzanpVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
