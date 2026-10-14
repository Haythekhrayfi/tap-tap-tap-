package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgkf extends zzgpm implements zzgqx {
    private static final zzgkf zzb;
    private int zzd;
    private int zze;

    static {
        zzgkf zzgkfVar = new zzgkf();
        zzb = zzgkfVar;
        zzgpm.zzaU(zzgkf.class, zzgkfVar);
    }

    private zzgkf() {
    }

    public static zzgke zzc() {
        return (zzgke) zzb.zzaA();
    }

    public static zzgkf zze() {
        return zzb;
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new zzgkf();
        }
        zzgkd zzgkdVar = null;
        if (i11 == 4) {
            return new zzgke(zzgkdVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zzg() {
        int i10 = this.zzd;
        int i11 = 5;
        if (i10 == 0) {
            i11 = 2;
        } else if (i10 == 1) {
            i11 = 3;
        } else if (i10 == 2) {
            i11 = 4;
        } else if (i10 != 3) {
            if (i10 != 4) {
                i11 = i10 != 5 ? 0 : 7;
            } else {
                i11 = 6;
            }
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }
}
