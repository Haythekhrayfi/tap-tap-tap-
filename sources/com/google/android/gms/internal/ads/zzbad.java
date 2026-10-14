package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbad extends zzgpm implements zzgqx {
    private static final zzbad zzb;
    private int zzd;
    private int zze = 1000;
    private zzbag zzf;
    private zzazx zzg;

    static {
        zzbad zzbadVar = new zzbad();
        zzb = zzbadVar;
        zzgpm.zzaU(zzbad.class, zzbadVar);
    }

    private zzbad() {
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", zzaym.zza, "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzbad();
        }
        zzaxg zzaxgVar = null;
        if (i11 == 4) {
            return new zzbac(zzaxgVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
