package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgkk extends zzgpm implements zzgqx {
    private static final zzgkk zzb;
    private String zzd = "";
    private zzgoe zze = zzgoe.zzb;
    private int zzf;

    static {
        zzgkk zzgkkVar = new zzgkk();
        zzb = zzgkkVar;
        zzgpm.zzaU(zzgkk.class, zzgkkVar);
    }

    private zzgkk() {
    }

    public static zzgkh zza() {
        return (zzgkh) zzb.zzaA();
    }

    public static zzgkk zze() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzgkk();
        }
        zzgkg zzgkgVar = null;
        if (i11 == 4) {
            return new zzgkh(zzgkgVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgkj zzc() {
        int i10 = this.zzf;
        zzgkj zzgkjVar = zzgkj.UNKNOWN_KEYMATERIAL;
        if (i10 != 0) {
            if (i10 == 1) {
                zzgkjVar = zzgkj.SYMMETRIC;
            } else if (i10 == 2) {
                zzgkjVar = zzgkj.ASYMMETRIC_PRIVATE;
            } else if (i10 != 3) {
                zzgkjVar = i10 != 4 ? null : zzgkj.REMOTE;
            } else {
                zzgkjVar = zzgkj.ASYMMETRIC_PUBLIC;
            }
        }
        return zzgkjVar == null ? zzgkj.UNRECOGNIZED : zzgkjVar;
    }

    public final zzgoe zzf() {
        return this.zze;
    }

    public final String zzg() {
        return this.zzd;
    }
}
