package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgkw extends zzgpm implements zzgqx {
    private static final zzgkw zzb;
    private zzgkk zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzgkw zzgkwVar = new zzgkw();
        zzb = zzgkwVar;
        zzgpm.zzaU(zzgkw.class, zzgkwVar);
    }

    private zzgkw() {
    }

    public static zzgkv zzd() {
        return (zzgkv) zzb.zzaA();
    }

    public static /* synthetic */ void zzg(zzgkw zzgkwVar, zzgkk zzgkkVar) {
        Objects.requireNonNull(zzgkkVar);
        zzgkwVar.zzd = zzgkkVar;
    }

    public final int zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzgkw();
        }
        zzgkt zzgktVar = null;
        if (i11 == 4) {
            return new zzgkv(zzgktVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgkk zzc() {
        zzgkk zzgkkVar = this.zzd;
        return zzgkkVar == null ? zzgkk.zze() : zzgkkVar;
    }

    public final zzglq zzf() {
        zzglq zzglqVarZzb = zzglq.zzb(this.zzg);
        return zzglqVarZzb == null ? zzglq.UNRECOGNIZED : zzglqVarZzb;
    }

    public final boolean zzj() {
        return this.zzd != null;
    }

    public final int zzk() {
        int i10 = this.zze;
        int i11 = 3;
        if (i10 == 0) {
            i11 = 2;
        } else if (i10 != 1) {
            if (i10 != 2) {
                i11 = i10 != 3 ? 0 : 5;
            } else {
                i11 = 4;
            }
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }
}
