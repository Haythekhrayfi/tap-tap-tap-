package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzanj extends zzgpm implements zzgqx {
    private static final zzanj zzb;
    private int zzd;
    private zzanl zze;
    private zzano zzf;

    static {
        zzanj zzanjVar = new zzanj();
        zzb = zzanjVar;
        zzgpm.zzaU(zzanj.class, zzanjVar);
    }

    private zzanj() {
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzanj();
        }
        zzanh zzanhVar = null;
        if (i11 == 4) {
            return new zzani(zzanhVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
