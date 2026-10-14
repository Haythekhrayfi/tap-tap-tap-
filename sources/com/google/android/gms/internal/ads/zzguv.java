package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzguv extends zzgpm implements zzgqx {
    private static final zzguv zzb;
    private int zzd;
    private long zzf;
    private boolean zzg;
    private int zzh;
    private String zze = "";
    private String zzi = "";
    private String zzj = "";

    static {
        zzguv zzguvVar = new zzguv();
        zzb = zzguvVar;
        zzgpm.zzaU(zzguv.class, zzguvVar);
    }

    private zzguv() {
    }

    public static zzguu zza() {
        return (zzguu) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzguv zzguvVar, String str) {
        zzguvVar.zzd |= 1;
        zzguvVar.zze = str;
    }

    public static /* synthetic */ void zze(zzguv zzguvVar, long j10) {
        zzguvVar.zzd |= 2;
        zzguvVar.zzf = j10;
    }

    public static /* synthetic */ void zzf(zzguv zzguvVar, boolean z10) {
        zzguvVar.zzd |= 4;
        zzguvVar.zzg = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", zzguw.zza, "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new zzguv();
        }
        zzgtb zzgtbVar = null;
        if (i11 == 4) {
            return new zzguu(zzgtbVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
