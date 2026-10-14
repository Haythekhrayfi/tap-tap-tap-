package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgli extends zzgpm implements zzgqx {
    private static final zzgli zzb;
    private String zzd = "";

    static {
        zzgli zzgliVar = new zzgli();
        zzb = zzgliVar;
        zzgpm.zzaU(zzgli.class, zzgliVar);
    }

    private zzgli() {
    }

    public static zzgli zzc() {
        return zzb;
    }

    public static zzgli zzd(zzgoe zzgoeVar, zzgoy zzgoyVar) throws zzgpy {
        return (zzgli) zzgpm.zzaG(zzb, zzgoeVar, zzgoyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzd"});
        }
        if (i11 == 3) {
            return new zzgli();
        }
        zzglg zzglgVar = null;
        if (i11 == 4) {
            return new zzglh(zzglgVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final String zze() {
        return this.zzd;
    }
}
