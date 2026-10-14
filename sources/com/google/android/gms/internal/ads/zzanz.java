package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzanz extends zzgpm implements zzgqx {
    private static final zzanz zzb;
    private int zzd;
    private long zze = -1;
    private int zzf = 1000;
    private int zzg = 1000;

    static {
        zzanz zzanzVar = new zzanz();
        zzb = zzanzVar;
        zzgpm.zzaU(zzanz.class, zzanzVar);
    }

    private zzanz() {
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            zzgpq zzgpqVar = zzaot.zza;
            return zzgpm.zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", zzgpqVar, "zzg", zzgpqVar});
        }
        if (i11 == 3) {
            return new zzanz();
        }
        zzanp zzanpVar = null;
        if (i11 == 4) {
            return new zzany(zzanpVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
