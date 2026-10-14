package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzanl extends zzgpm implements zzgqx {
    private static final zzanl zzb;
    private int zzd;
    private int zze = 2;

    static {
        zzanl zzanlVar = new zzanl();
        zzb = zzanlVar;
        zzgpm.zzaU(zzanl.class, zzanlVar);
    }

    private zzanl() {
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001b᠌\u0000", new Object[]{"zzd", "zze", zzanm.zza});
        }
        if (i11 == 3) {
            return new zzanl();
        }
        zzanh zzanhVar = null;
        if (i11 == 4) {
            return new zzank(zzanhVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
