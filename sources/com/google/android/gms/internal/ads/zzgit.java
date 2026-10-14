package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgit extends zzgpm implements zzgqx {
    private static final zzgit zzb;
    private int zzd;

    static {
        zzgit zzgitVar = new zzgit();
        zzb = zzgitVar;
        zzgpm.zzaU(zzgit.class, zzgitVar);
    }

    private zzgit() {
    }

    public static zzgis zzc() {
        return (zzgis) zzb.zzaA();
    }

    public static zzgit zze() {
        return zzb;
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
            return zzgpm.zzaR(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        }
        if (i11 == 3) {
            return new zzgit();
        }
        zzgir zzgirVar = null;
        if (i11 == 4) {
            return new zzgis(zzgirVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
