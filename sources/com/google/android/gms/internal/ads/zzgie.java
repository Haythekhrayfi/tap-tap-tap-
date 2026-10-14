package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgie extends zzgpm implements zzgqx {
    private static final zzgie zzb;
    private int zzd;

    static {
        zzgie zzgieVar = new zzgie();
        zzb = zzgieVar;
        zzgpm.zzaU(zzgie.class, zzgieVar);
    }

    private zzgie() {
    }

    public static zzgid zzc() {
        return (zzgid) zzb.zzaA();
    }

    public static zzgie zze() {
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
            return new zzgie();
        }
        zzgic zzgicVar = null;
        if (i11 == 4) {
            return new zzgid(zzgicVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
