package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfgj extends zzgpm implements zzgqx {
    private static final zzfgj zzb;
    private zzgpv zzd = zzgpm.zzaN();

    static {
        zzfgj zzfgjVar = new zzfgj();
        zzb = zzfgjVar;
        zzgpm.zzaU(zzfgj.class, zzfgjVar);
    }

    private zzfgj() {
    }

    public static zzfgg zzc() {
        return (zzfgg) zzb.zzaA();
    }

    public static /* synthetic */ void zzf(zzfgj zzfgjVar, zzfgi zzfgiVar) {
        Objects.requireNonNull(zzfgiVar);
        zzgpv zzgpvVar = zzfgjVar.zzd;
        if (!zzgpvVar.zzc()) {
            zzfgjVar.zzd = zzgpm.zzaO(zzgpvVar);
        }
        zzfgjVar.zzd.add(zzfgiVar);
    }

    public final int zza() {
        return this.zzd.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzfgi.class});
        }
        if (i11 == 3) {
            return new zzfgj();
        }
        zzfgf zzfgfVar = null;
        if (i11 == 4) {
            return new zzfgg(zzfgfVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
