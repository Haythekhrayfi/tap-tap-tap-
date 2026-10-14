package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgvi extends zzgpm implements zzgqx {
    private static final zzgvi zzb;
    private int zzd;
    private String zze = "";

    static {
        zzgvi zzgviVar = new zzgvi();
        zzb = zzgviVar;
        zzgpm.zzaU(zzgvi.class, zzgviVar);
    }

    private zzgvi() {
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new zzgvi();
        }
        zzgtb zzgtbVar = null;
        if (i11 == 4) {
            return new zzgvh(zzgtbVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
