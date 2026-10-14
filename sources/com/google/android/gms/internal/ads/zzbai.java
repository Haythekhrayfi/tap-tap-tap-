package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbai extends zzgpm implements zzgqx {
    private static final zzbai zzb;
    private int zzd;
    private zzazz zze;
    private int zzf = 1000;
    private zzbag zzg;
    private zzazx zzh;

    static {
        zzbai zzbaiVar = new zzbai();
        zzb = zzbaiVar;
        zzgpm.zzaU(zzbai.class, zzbaiVar);
    }

    private zzbai() {
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", "zzf", zzaym.zza, "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzbai();
        }
        zzaxg zzaxgVar = null;
        if (i11 == 4) {
            return new zzbah(zzaxgVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
