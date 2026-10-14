package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzazn extends zzgpm implements zzgqx {
    private static final zzazn zzb;
    private int zzd;
    private int zzf;
    private int zzg;
    private long zzh;
    private long zzk;
    private int zzl;
    private zzgpv zze = zzgpm.zzaN();
    private String zzi = "";
    private String zzj = "";

    static {
        zzazn zzaznVar = new zzazn();
        zzb = zzaznVar;
        zzgpm.zzaU(zzazn.class, zzaznVar);
    }

    private zzazn() {
    }

    public static zzazj zza() {
        return (zzazj) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzazn zzaznVar, Iterable iterable) {
        zzgpv zzgpvVar = zzaznVar.zze;
        if (!zzgpvVar.zzc()) {
            zzaznVar.zze = zzgpm.zzaO(zzgpvVar);
        }
        zzgnn.zzav(iterable, zzaznVar.zze);
    }

    public static /* synthetic */ void zze(zzazn zzaznVar, int i10) {
        zzaznVar.zzd |= 1;
        zzaznVar.zzf = i10;
    }

    public static /* synthetic */ void zzf(zzazn zzaznVar, int i10) {
        zzaznVar.zzd |= 2;
        zzaznVar.zzg = i10;
    }

    public static /* synthetic */ void zzg(zzazn zzaznVar, long j10) {
        zzaznVar.zzd |= 4;
        zzaznVar.zzh = j10;
    }

    public static /* synthetic */ void zzh(zzazn zzaznVar, String str) {
        Objects.requireNonNull(str);
        zzaznVar.zzd |= 8;
        zzaznVar.zzi = str;
    }

    public static /* synthetic */ void zzi(zzazn zzaznVar, String str) {
        Objects.requireNonNull(str);
        zzaznVar.zzd |= 16;
        zzaznVar.zzj = str;
    }

    public static /* synthetic */ void zzj(zzazn zzaznVar, long j10) {
        zzaznVar.zzd |= 32;
        zzaznVar.zzk = j10;
    }

    public static /* synthetic */ void zzk(zzazn zzaznVar, int i10) {
        zzaznVar.zzd |= 64;
        zzaznVar.zzl = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zzd", "zze", zzazi.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i11 == 3) {
            return new zzazn();
        }
        zzaxg zzaxgVar = null;
        if (i11 == 4) {
            return new zzazj(zzaxgVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
