package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgub extends zzgpm implements zzgqx {
    private static final zzgub zzb;
    private int zzd;
    private zzgua zze;
    private zzgoe zzg;
    private zzgoe zzh;
    private int zzi;
    private byte zzj = 2;
    private zzgpv zzf = zzgpm.zzaN();

    static {
        zzgub zzgubVar = new zzgub();
        zzb = zzgubVar;
        zzgpm.zzaU(zzgub.class, zzgubVar);
    }

    private zzgub() {
        zzgoe zzgoeVar = zzgoe.zzb;
        this.zzg = zzgoeVar;
        this.zzh = zzgoeVar;
    }

    public static zzgty zza() {
        return (zzgty) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzgub zzgubVar, zzgtx zzgtxVar) {
        Objects.requireNonNull(zzgtxVar);
        zzgpv zzgpvVar = zzgubVar.zzf;
        if (!zzgpvVar.zzc()) {
            zzgubVar.zzf = zzgpm.zzaO(zzgpvVar);
        }
        zzgubVar.zzf.add(zzgtxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzj);
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zzd", "zze", "zzf", zzgtx.class, "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new zzgub();
        }
        zzgtb zzgtbVar = null;
        if (i11 == 4) {
            return new zzgty(zzgtbVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzj = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
