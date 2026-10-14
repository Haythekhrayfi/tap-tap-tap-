package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgtq extends zzgpm implements zzgqx {
    private static final zzgtq zzb;
    private int zzd;
    private zzgoe zze = zzgoe.zzb;

    static {
        zzgtq zzgtqVar = new zzgtq();
        zzb = zzgtqVar;
        zzgpm.zzaU(zzgtq.class, zzgtqVar);
    }

    private zzgtq() {
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new zzgtq();
        }
        zzgtb zzgtbVar = null;
        if (i11 == 4) {
            return new zzgtp(zzgtbVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
