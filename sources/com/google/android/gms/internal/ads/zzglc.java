package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzglc extends zzgpm implements zzgqx {
    private static final zzglc zzb;
    private int zzd;
    private zzgpv zze = zzgpm.zzaN();

    static {
        zzglc zzglcVar = new zzglc();
        zzb = zzglcVar;
        zzgpm.zzaU(zzglc.class, zzglcVar);
    }

    private zzglc() {
    }

    public static zzgkz zza() {
        return (zzgkz) zzb.zzaA();
    }

    public static /* synthetic */ void zze(zzglc zzglcVar, zzglb zzglbVar) {
        Objects.requireNonNull(zzglbVar);
        zzgpv zzgpvVar = zzglcVar.zze;
        if (!zzgpvVar.zzc()) {
            zzglcVar.zze = zzgpm.zzaO(zzgpvVar);
        }
        zzglcVar.zze.add(zzglbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", zzglb.class});
        }
        if (i11 == 3) {
            return new zzglc();
        }
        zzgky zzgkyVar = null;
        if (i11 == 4) {
            return new zzgkz(zzgkyVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
