package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzguz extends zzgpm implements zzgqx {
    private static final zzguz zzb;
    private int zzd;
    private String zze = "";
    private zzgoe zzf = zzgoe.zzb;

    static {
        zzguz zzguzVar = new zzguz();
        zzb = zzguzVar;
        zzgpm.zzaU(zzguz.class, zzguzVar);
    }

    private zzguz() {
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzguz();
        }
        zzgtb zzgtbVar = null;
        if (i11 == 4) {
            return new zzguy(zzgtbVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
