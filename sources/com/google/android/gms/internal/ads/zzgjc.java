package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgjc extends zzgpm implements zzgqx {
    private static final zzgjc zzb;
    private int zzd;

    static {
        zzgjc zzgjcVar = new zzgjc();
        zzb = zzgjcVar;
        zzgpm.zzaU(zzgjc.class, zzgjcVar);
    }

    private zzgjc() {
    }

    public static zzgjb zzc() {
        return (zzgjb) zzb.zzaA();
    }

    public static zzgjc zze() {
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
            return new zzgjc();
        }
        zzgja zzgjaVar = null;
        if (i11 == 4) {
            return new zzgjb(zzgjaVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
