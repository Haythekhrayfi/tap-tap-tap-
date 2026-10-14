package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaow extends zzgpm implements zzgqx {
    private static final zzaow zzb;
    private int zzd;
    private long zze;
    private String zzf = "";
    private zzgoe zzg = zzgoe.zzb;

    static {
        zzaow zzaowVar = new zzaow();
        zzb = zzaowVar;
        zzgpm.zzaU(zzaow.class, zzaowVar);
    }

    private zzaow() {
    }

    public static zzaow zzd() {
        return zzb;
    }

    public final long zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzaow();
        }
        zzanp zzanpVar = null;
        if (i11 == 4) {
            return new zzaov(zzanpVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final boolean zze() {
        return (this.zzd & 1) != 0;
    }
}
