package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfgi extends zzgpm implements zzgqx {
    private static final zzfgi zzb;
    private zzfge zzd;

    static {
        zzfgi zzfgiVar = new zzfgi();
        zzb = zzfgiVar;
        zzgpm.zzaU(zzfgi.class, zzfgiVar);
    }

    private zzfgi() {
    }

    public static zzfgh zza() {
        return (zzfgh) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzfgi zzfgiVar, zzfge zzfgeVar) {
        Objects.requireNonNull(zzfgeVar);
        zzfgiVar.zzd = zzfgeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0000\u0001\u0000\u0000\u0006\u0006\u0001\u0000\u0000\u0000\u0006\t", new Object[]{"zzd"});
        }
        if (i11 == 3) {
            return new zzfgi();
        }
        zzfgf zzfgfVar = null;
        if (i11 == 4) {
            return new zzfgh(zzfgfVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
