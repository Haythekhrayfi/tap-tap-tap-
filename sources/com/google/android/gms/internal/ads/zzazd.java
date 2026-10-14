package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzazd extends zzgpm implements zzgqx {
    private static final zzazd zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzazd zzazdVar = new zzazd();
        zzb = zzazdVar;
        zzgpm.zzaU(zzazd.class, zzazdVar);
    }

    private zzazd() {
    }

    public static zzayw zza() {
        return (zzayw) zzb.zzaA();
    }

    public static zzazd zzd() {
        return zzb;
    }

    public static /* synthetic */ void zzi(zzazd zzazdVar, int i10) {
        zzazdVar.zze = i10 - 1;
        zzazdVar.zzd |= 1;
    }

    public static /* synthetic */ void zzj(zzazd zzazdVar, int i10) {
        zzazdVar.zzf = i10 - 1;
        zzazdVar.zzd |= 2;
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", zzazb.zza, "zzf", zzayy.zza});
        }
        if (i11 == 3) {
            return new zzazd();
        }
        zzaxg zzaxgVar = null;
        if (i11 == 4) {
            return new zzayw(zzaxgVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final boolean zze() {
        return (this.zzd & 2) != 0;
    }

    public final boolean zzf() {
        return (this.zzd & 1) != 0;
    }

    public final int zzg() {
        int iZza = zzayz.zza(this.zzf);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    public final int zzh() {
        int iZza = zzazc.zza(this.zze);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }
}
