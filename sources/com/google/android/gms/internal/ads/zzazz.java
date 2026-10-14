package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzazz extends zzgpm implements zzgqx {
    private static final zzazz zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzazz zzazzVar = new zzazz();
        zzb = zzazzVar;
        zzgpm.zzaU(zzazz.class, zzazzVar);
    }

    private zzazz() {
    }

    public static zzazy zza() {
        return (zzazy) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzazz zzazzVar, int i10) {
        zzazzVar.zzd |= 1;
        zzazzVar.zze = i10;
    }

    public static /* synthetic */ void zze(zzazz zzazzVar, int i10) {
        zzazzVar.zzd |= 2;
        zzazzVar.zzf = i10;
    }

    public static /* synthetic */ void zzf(zzazz zzazzVar, int i10) {
        zzazzVar.zzd |= 4;
        zzazzVar.zzg = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzazz();
        }
        zzaxg zzaxgVar = null;
        if (i11 == 4) {
            return new zzazy(zzaxgVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
