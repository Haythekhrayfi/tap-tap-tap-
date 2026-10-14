package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaxu extends zzgpm implements zzgqx {
    private static final zzaxu zzb;
    private zzgpv zzd = zzgpm.zzaN();

    static {
        zzaxu zzaxuVar = new zzaxu();
        zzb = zzaxuVar;
        zzgpm.zzaU(zzaxu.class, zzaxuVar);
    }

    private zzaxu() {
    }

    public static zzaxo zza() {
        return (zzaxo) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzaxu zzaxuVar, zzaxn zzaxnVar) {
        Objects.requireNonNull(zzaxnVar);
        zzgpv zzgpvVar = zzaxuVar.zzd;
        if (!zzgpvVar.zzc()) {
            zzaxuVar.zzd = zzgpm.zzaO(zzgpvVar);
        }
        zzaxuVar.zzd.add(zzaxnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzaxn.class});
        }
        if (i11 == 3) {
            return new zzaxu();
        }
        zzaxg zzaxgVar = null;
        if (i11 == 4) {
            return new zzaxo(zzaxgVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
