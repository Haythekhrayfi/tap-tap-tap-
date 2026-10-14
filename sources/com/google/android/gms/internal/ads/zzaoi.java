package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaoi extends zzgpm implements zzgqx {
    private static final zzaoi zzb;
    private int zzd;
    private long zze = -1;
    private int zzf = 1000;

    static {
        zzaoi zzaoiVar = new zzaoi();
        zzb = zzaoiVar;
        zzgpm.zzaU(zzaoi.class, zzaoiVar);
    }

    private zzaoi() {
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", "zzf", zzaot.zza});
        }
        if (i11 == 3) {
            return new zzaoi();
        }
        zzanp zzanpVar = null;
        if (i11 == 4) {
            return new zzaoh(zzanpVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
