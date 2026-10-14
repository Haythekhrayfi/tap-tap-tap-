package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbau extends zzgpm implements zzgqx {
    private static final zzbau zzb;
    private int zzd;
    private boolean zze;
    private int zzf;

    static {
        zzbau zzbauVar = new zzbau();
        zzb = zzbauVar;
        zzgpm.zzaU(zzbau.class, zzbauVar);
    }

    private zzbau() {
    }

    public static zzbat zza() {
        return (zzbat) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzbau zzbauVar, boolean z10) {
        zzbauVar.zzd |= 1;
        zzbauVar.zze = z10;
    }

    public static /* synthetic */ void zze(zzbau zzbauVar, int i10) {
        zzbauVar.zzd |= 2;
        zzbauVar.zzf = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzbau();
        }
        zzaxg zzaxgVar = null;
        if (i11 == 4) {
            return new zzbat(zzaxgVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final boolean zzf() {
        return this.zze;
    }
}
