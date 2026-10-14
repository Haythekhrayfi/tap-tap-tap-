package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaxz extends zzgpm implements zzgqx {
    private static final zzaxz zzb;
    private int zzd;
    private int zze;
    private zzazt zzf;

    static {
        zzaxz zzaxzVar = new zzaxz();
        zzb = zzaxzVar;
        zzgpm.zzaU(zzaxz.class, zzaxzVar);
    }

    private zzaxz() {
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", zzaxw.zza, "zzf"});
        }
        if (i11 == 3) {
            return new zzaxz();
        }
        zzaxg zzaxgVar = null;
        if (i11 == 4) {
            return new zzaxy(zzaxgVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
