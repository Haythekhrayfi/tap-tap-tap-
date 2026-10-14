package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzayk extends zzgpm implements zzgqx {
    private static final zzayk zzb;
    private int zzd;
    private int zze;
    private zzazz zzf;
    private String zzg = "";
    private String zzh = "";

    static {
        zzayk zzaykVar = new zzayk();
        zzb = zzaykVar;
        zzgpm.zzaU(zzayk.class, zzaykVar);
    }

    private zzayk() {
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005᠌\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zzd", "zze", zzayj.zza, "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzayk();
        }
        zzaxg zzaxgVar = null;
        if (i11 == 4) {
            return new zzayi(zzaxgVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
