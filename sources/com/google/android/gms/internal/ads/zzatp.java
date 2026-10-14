package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzatp extends zzgpm implements zzgqx {
    private static final zzatp zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private long zzh;
    private long zzi;

    static {
        zzatp zzatpVar = new zzatp();
        zzb = zzatpVar;
        zzgpm.zzaU(zzatp.class, zzatpVar);
    }

    private zzatp() {
    }

    public static zzato zze() {
        return (zzato) zzb.zzaA();
    }

    public static zzatp zzg() {
        return zzb;
    }

    public static zzatp zzh(zzgoe zzgoeVar) throws zzgpy {
        return (zzatp) zzgpm.zzaE(zzb, zzgoeVar);
    }

    public static zzatp zzi(zzgoe zzgoeVar, zzgoy zzgoyVar) throws zzgpy {
        return (zzatp) zzgpm.zzaG(zzb, zzgoeVar, zzgoyVar);
    }

    public static /* synthetic */ void zzl(zzatp zzatpVar, String str) {
        Objects.requireNonNull(str);
        zzatpVar.zzd |= 1;
        zzatpVar.zze = str;
    }

    public static /* synthetic */ void zzm(zzatp zzatpVar, long j10) {
        zzatpVar.zzd |= 16;
        zzatpVar.zzi = j10;
    }

    public static /* synthetic */ void zzn(zzatp zzatpVar, String str) {
        Objects.requireNonNull(str);
        zzatpVar.zzd |= 2;
        zzatpVar.zzf = str;
    }

    public static /* synthetic */ void zzo(zzatp zzatpVar, long j10) {
        zzatpVar.zzd |= 4;
        zzatpVar.zzg = j10;
    }

    public static /* synthetic */ void zzp(zzatp zzatpVar, long j10) {
        zzatpVar.zzd |= 8;
        zzatpVar.zzh = j10;
    }

    public final long zza() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new zzatp();
        }
        zzatn zzatnVar = null;
        if (i11 == 4) {
            return new zzato(zzatnVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final long zzc() {
        return this.zzg;
    }

    public final long zzd() {
        return this.zzi;
    }

    public final String zzj() {
        return this.zzf;
    }

    public final String zzk() {
        return this.zze;
    }
}
