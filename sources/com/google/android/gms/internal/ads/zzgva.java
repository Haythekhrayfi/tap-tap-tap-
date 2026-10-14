package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgva extends zzgpm implements zzgqx {
    private static final zzgva zzb;
    private zzgtr zzB;
    private zzgtj zzD;
    private zzguk zzF;
    private int zzG;
    private int zzd;
    private int zze;
    private int zzf;
    private zzgtn zzj;
    private zzgun zzn;
    private boolean zzo;
    private boolean zzr;
    private boolean zzs;
    private zzguv zzu;
    private boolean zzv;
    private zzguz zzz;
    private byte zzH = 2;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private zzgpv zzk = zzgpm.zzaN();
    private zzgpv zzl = zzgpm.zzaN();
    private String zzm = "";
    private zzgpv zzp = zzgpm.zzaN();
    private String zzq = "";
    private zzgoe zzt = zzgoe.zzb;
    private String zzw = "";
    private zzgpv zzx = zzgpm.zzaN();
    private zzgpv zzy = zzgpm.zzaN();
    private zzgpv zzA = zzgpm.zzaN();
    private String zzC = "";
    private zzgpv zzE = zzgpm.zzaN();

    static {
        zzgva zzgvaVar = new zzgva();
        zzb = zzgvaVar;
        zzgpm.zzaU(zzgva.class, zzgvaVar);
    }

    private zzgva() {
    }

    public static zzgtl zza() {
        return (zzgtl) zzb.zzaA();
    }

    public static /* synthetic */ void zzg(zzgva zzgvaVar, String str) {
        Objects.requireNonNull(str);
        zzgvaVar.zzd |= 4;
        zzgvaVar.zzg = str;
    }

    public static /* synthetic */ void zzh(zzgva zzgvaVar, String str) {
        Objects.requireNonNull(str);
        zzgvaVar.zzd |= 8;
        zzgvaVar.zzh = str;
    }

    public static /* synthetic */ void zzi(zzgva zzgvaVar, zzgtn zzgtnVar) {
        Objects.requireNonNull(zzgtnVar);
        zzgvaVar.zzj = zzgtnVar;
        zzgvaVar.zzd |= 32;
    }

    public static /* synthetic */ void zzj(zzgva zzgvaVar, zzgut zzgutVar) {
        Objects.requireNonNull(zzgutVar);
        zzgpv zzgpvVar = zzgvaVar.zzk;
        if (!zzgpvVar.zzc()) {
            zzgvaVar.zzk = zzgpm.zzaO(zzgpvVar);
        }
        zzgvaVar.zzk.add(zzgutVar);
    }

    public static /* synthetic */ void zzk(zzgva zzgvaVar, String str) {
        zzgvaVar.zzd |= 64;
        zzgvaVar.zzm = str;
    }

    public static /* synthetic */ void zzl(zzgva zzgvaVar) {
        zzgvaVar.zzd &= -65;
        zzgvaVar.zzm = zzb.zzm;
    }

    public static /* synthetic */ void zzm(zzgva zzgvaVar, zzgun zzgunVar) {
        Objects.requireNonNull(zzgunVar);
        zzgvaVar.zzn = zzgunVar;
        zzgvaVar.zzd |= 128;
    }

    public static /* synthetic */ void zzn(zzgva zzgvaVar, zzguv zzguvVar) {
        Objects.requireNonNull(zzguvVar);
        zzgvaVar.zzu = zzguvVar;
        zzgvaVar.zzd |= 8192;
    }

    public static /* synthetic */ void zzo(zzgva zzgvaVar, Iterable iterable) {
        zzgpv zzgpvVar = zzgvaVar.zzx;
        if (!zzgpvVar.zzc()) {
            zzgvaVar.zzx = zzgpm.zzaO(zzgpvVar);
        }
        zzgnn.zzav(iterable, zzgvaVar.zzx);
    }

    public static /* synthetic */ void zzp(zzgva zzgvaVar, Iterable iterable) {
        zzgpv zzgpvVar = zzgvaVar.zzy;
        if (!zzgpvVar.zzc()) {
            zzgvaVar.zzy = zzgpm.zzaO(zzgpvVar);
        }
        zzgnn.zzav(iterable, zzgvaVar.zzy);
    }

    public static /* synthetic */ void zzq(zzgva zzgvaVar, int i10) {
        zzgvaVar.zze = i10 - 1;
        zzgvaVar.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzH);
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0001\u001d\u0000\u0001\u0001\u001d\u001d\u0000\u0007\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001cဉ\u0014\u001d᠌\u0015", new Object[]{"zzd", "zzg", "zzh", "zzi", "zzk", zzgut.class, "zzo", "zzp", "zzq", "zzr", "zzs", "zze", zzguo.zza, "zzf", zzgtk.zza, "zzj", "zzm", "zzn", "zzt", "zzl", zzgve.class, "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", zzgvk.class, "zzB", "zzC", "zzD", "zzE", zzgtv.class, "zzF", "zzG", zzgux.zza});
        }
        if (i11 == 3) {
            return new zzgva();
        }
        zzgtb zzgtbVar = null;
        if (i11 == 4) {
            return new zzgtl(zzgtbVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzH = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final String zzd() {
        return this.zzm;
    }

    public final String zze() {
        return this.zzg;
    }

    public final List zzf() {
        return this.zzk;
    }
}
