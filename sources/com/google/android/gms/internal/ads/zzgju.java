package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgju extends zzgpm implements zzgqx {
    private static final zzgju zzb;

    static {
        zzgju zzgjuVar = new zzgju();
        zzb = zzgjuVar;
        zzgpm.zzaU(zzgju.class, zzgjuVar);
    }

    private zzgju() {
    }

    public static zzgju zzc() {
        return zzb;
    }

    public static zzgju zzd(zzgoe zzgoeVar, zzgoy zzgoyVar) throws zzgpy {
        return (zzgju) zzgpm.zzaG(zzb, zzgoeVar, zzgoyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        zzgjs zzgjsVar = null;
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0000\u0000", null);
        }
        if (i11 == 3) {
            return new zzgju();
        }
        if (i11 == 4) {
            return new zzgjt(zzgjsVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
