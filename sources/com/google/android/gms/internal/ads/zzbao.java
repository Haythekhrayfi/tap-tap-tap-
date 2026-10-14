package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbao extends zzgpm implements zzgqx {
    private static final zzbao zzb;
    private int zzd;
    private int zze = 1000;
    private zzbag zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private long zzj;

    static {
        zzbao zzbaoVar = new zzbao();
        zzb = zzbaoVar;
        zzgpm.zzaU(zzbao.class, zzbaoVar);
    }

    private zzbao() {
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဃ\u0005", new Object[]{"zzd", "zze", zzaym.zza, "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new zzbao();
        }
        zzaxg zzaxgVar = null;
        if (i11 == 4) {
            return new zzban(zzaxgVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
