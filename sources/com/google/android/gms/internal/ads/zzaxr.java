package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaxr extends zzgpm implements zzgqx {
    private static final zzaxr zzb;
    private int zzd;
    private boolean zze;
    private int zzf;

    static {
        zzaxr zzaxrVar = new zzaxr();
        zzb = zzaxrVar;
        zzgpm.zzaU(zzaxr.class, zzaxrVar);
    }

    private zzaxr() {
    }

    public static zzaxq zza() {
        return (zzaxq) zzb.zzaA();
    }

    public static zzaxr zzd() {
        return zzb;
    }

    public static /* synthetic */ void zze(zzaxr zzaxrVar, boolean z10) {
        zzaxrVar.zzd |= 1;
        zzaxrVar.zze = z10;
    }

    public static /* synthetic */ void zzf(zzaxr zzaxrVar, int i10) {
        zzaxrVar.zzd |= 2;
        zzaxrVar.zzf = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzaxr();
        }
        zzaxg zzaxgVar = null;
        if (i11 == 4) {
            return new zzaxq(zzaxgVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
