package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaom extends zzgpm implements zzgqx {
    private static final zzaom zzb;
    private int zzd;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private long zzl = -1;

    static {
        zzaom zzaomVar = new zzaom();
        zzb = zzaomVar;
        zzgpm.zzaU(zzaom.class, zzaomVar);
    }

    private zzaom() {
    }

    public static zzaol zza() {
        return (zzaol) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzaom zzaomVar, long j10) {
        zzaomVar.zzd |= 1;
        zzaomVar.zze = j10;
    }

    public static /* synthetic */ void zze(zzaom zzaomVar, long j10) {
        zzaomVar.zzd |= 4;
        zzaomVar.zzg = j10;
    }

    public static /* synthetic */ void zzf(zzaom zzaomVar, long j10) {
        zzaomVar.zzd |= 8;
        zzaomVar.zzh = j10;
    }

    public static /* synthetic */ void zzg(zzaom zzaomVar, long j10) {
        zzaomVar.zzd |= 16;
        zzaomVar.zzi = j10;
    }

    public static /* synthetic */ void zzh(zzaom zzaomVar, long j10) {
        zzaomVar.zzd |= 32;
        zzaomVar.zzj = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i11 == 3) {
            return new zzaom();
        }
        zzanp zzanpVar = null;
        if (i11 == 4) {
            return new zzaol(zzanpVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
