package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgjo extends zzgpm implements zzgqx {
    private static final zzgjo zzb;
    private int zzd;
    private int zze;

    static {
        zzgjo zzgjoVar = new zzgjo();
        zzb = zzgjoVar;
        zzgpm.zzaU(zzgjo.class, zzgjoVar);
    }

    private zzgjo() {
    }

    public static zzgjn zzc() {
        return (zzgjn) zzb.zzaA();
    }

    public static zzgjo zze(zzgoe zzgoeVar, zzgoy zzgoyVar) throws zzgpy {
        return (zzgjo) zzgpm.zzaG(zzb, zzgoeVar, zzgoyVar);
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzd"});
        }
        if (i11 == 3) {
            return new zzgjo();
        }
        zzgjm zzgjmVar = null;
        if (i11 == 4) {
            return new zzgjn(zzgjmVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
