package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzazi extends zzgpm implements zzgqx {
    private static final zzgps zzb = new zzazg();
    private static final zzazi zzd;
    private int zze;
    private long zzf;
    private int zzg;
    private long zzh;
    private long zzi;
    private zzgpr zzj = zzgpm.zzaJ();
    private zzazd zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private long zzr;

    static {
        zzazi zzaziVar = new zzazi();
        zzd = zzaziVar;
        zzgpm.zzaU(zzazi.class, zzaziVar);
    }

    private zzazi() {
    }

    public static /* synthetic */ void zzA(zzazi zzaziVar, int i10) {
        zzaziVar.zzm = i10 - 1;
        zzaziVar.zze |= 64;
    }

    public static /* synthetic */ void zzB(zzazi zzaziVar, int i10) {
        zzaziVar.zzn = i10 - 1;
        zzaziVar.zze |= 128;
    }

    public static /* synthetic */ void zzC(zzazi zzaziVar, int i10) {
        zzaziVar.zzp = i10 - 1;
        zzaziVar.zze |= 512;
    }

    public static zzazh zzg() {
        return (zzazh) zzd.zzaA();
    }

    public static zzazi zzi(byte[] bArr) throws zzgpy {
        return (zzazi) zzgpm.zzaF(zzd, bArr);
    }

    public static /* synthetic */ void zzl(zzazi zzaziVar, long j10) {
        zzaziVar.zze |= 1;
        zzaziVar.zzf = j10;
    }

    public static /* synthetic */ void zzm(zzazi zzaziVar, long j10) {
        zzaziVar.zze |= 4;
        zzaziVar.zzh = j10;
    }

    public static /* synthetic */ void zzn(zzazi zzaziVar, long j10) {
        zzaziVar.zze |= 8;
        zzaziVar.zzi = j10;
    }

    public static /* synthetic */ void zzo(zzazi zzaziVar, Iterable iterable) {
        zzgpr zzgprVar = zzaziVar.zzj;
        if (!zzgprVar.zzc()) {
            zzaziVar.zzj = zzgpm.zzaK(zzgprVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzaziVar.zzj.zzh(((zzaxx) it.next()).zza());
        }
    }

    public static /* synthetic */ void zzp(zzazi zzaziVar, zzazd zzazdVar) {
        Objects.requireNonNull(zzazdVar);
        zzaziVar.zzk = zzazdVar;
        zzaziVar.zze |= 16;
    }

    public static /* synthetic */ void zzq(zzazi zzaziVar, int i10) {
        zzaziVar.zze |= 256;
        zzaziVar.zzo = i10;
    }

    public static /* synthetic */ void zzr(zzazi zzaziVar, zzazm zzazmVar) {
        zzaziVar.zzq = zzazmVar.zza();
        zzaziVar.zze |= 1024;
    }

    public static /* synthetic */ void zzs(zzazi zzaziVar, long j10) {
        zzaziVar.zze |= 2048;
        zzaziVar.zzr = j10;
    }

    public static /* synthetic */ void zzy(zzazi zzaziVar, int i10) {
        zzaziVar.zzg = i10 - 1;
        zzaziVar.zze |= 2;
    }

    public static /* synthetic */ void zzz(zzazi zzaziVar, int i10) {
        zzaziVar.zzl = i10 - 1;
        zzaziVar.zze |= 32;
    }

    public final int zza() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            zzgpq zzgpqVar = zzaym.zza;
            return zzgpm.zzaR(zzd, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ࠞ\u0006ဉ\u0004\u0007᠌\u0005\b᠌\u0006\t᠌\u0007\nင\b\u000b᠌\t\f᠌\n\rဂ\u000b", new Object[]{"zze", "zzf", "zzg", zzgpqVar, "zzh", "zzi", "zzj", zzaxw.zza, "zzk", "zzl", zzgpqVar, "zzm", zzgpqVar, "zzn", zzgpqVar, "zzo", "zzp", zzgpqVar, "zzq", zzazl.zza, "zzr"});
        }
        if (i11 == 3) {
            return new zzazi();
        }
        zzaxg zzaxgVar = null;
        if (i11 == 4) {
            return new zzazh(zzaxgVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzd;
    }

    public final long zzc() {
        return this.zzi;
    }

    public final long zzd() {
        return this.zzh;
    }

    public final long zze() {
        return this.zzf;
    }

    public final zzazd zzf() {
        zzazd zzazdVar = this.zzk;
        return zzazdVar == null ? zzazd.zzd() : zzazdVar;
    }

    public final zzazm zzj() {
        zzazm zzazmVarZzb = zzazm.zzb(this.zzq);
        return zzazmVarZzb == null ? zzazm.UNSPECIFIED : zzazmVarZzb;
    }

    public final List zzk() {
        return new zzgpt(this.zzj, zzb);
    }

    public final int zzt() {
        int iZza = zzayn.zza(this.zzm);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    public final int zzu() {
        int iZza = zzayn.zza(this.zzn);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    public final int zzv() {
        int iZza = zzayn.zza(this.zzp);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    public final int zzw() {
        int iZza = zzayn.zza(this.zzg);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    public final int zzx() {
        int iZza = zzayn.zza(this.zzl);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }
}
