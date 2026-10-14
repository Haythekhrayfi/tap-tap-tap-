package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzapa extends zzgpm implements zzgqx {
    private static final zzapa zzb;
    private int zzd;
    private zzgpv zze = zzgpm.zzaN();
    private zzgoe zzf = zzgoe.zzb;
    private int zzg = 1;
    private int zzh = 1;

    static {
        zzapa zzapaVar = new zzapa();
        zzb = zzapaVar;
        zzgpm.zzaU(zzapa.class, zzapaVar);
    }

    private zzapa() {
    }

    public static zzaoz zza() {
        return (zzaoz) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzapa zzapaVar, zzgoe zzgoeVar) {
        zzgpv zzgpvVar = zzapaVar.zze;
        if (!zzgpvVar.zzc()) {
            zzapaVar.zze = zzgpm.zzaO(zzgpvVar);
        }
        zzapaVar.zze.add(zzgoeVar);
    }

    public static /* synthetic */ void zze(zzapa zzapaVar, zzgoe zzgoeVar) {
        zzapaVar.zzd |= 1;
        zzapaVar.zzf = zzgoeVar;
    }

    public static /* synthetic */ void zzf(zzapa zzapaVar, int i10) {
        zzapaVar.zzh = 4;
        zzapaVar.zzd = 4 | zzapaVar.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", zzaou.zza, "zzh", zzaos.zza});
        }
        if (i11 == 3) {
            return new zzapa();
        }
        zzanp zzanpVar = null;
        if (i11 == 4) {
            return new zzaoz(zzanpVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
