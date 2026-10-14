package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzayp extends zzgpm implements zzgqx {
    private static final zzayp zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private zzazz zzi;
    private zzayh zzk;
    private zzayk zzl;
    private zzazd zzm;
    private zzaxl zzn;
    private zzazn zzo;
    private zzbau zzp;
    private zzaxu zzq;
    private String zzf = "";
    private int zzh = 1000;
    private zzgpu zzj = zzgpm.zzaL();

    static {
        zzayp zzaypVar = new zzayp();
        zzb = zzaypVar;
        zzgpm.zzaU(zzayp.class, zzaypVar);
    }

    private zzayp() {
    }

    public static zzayo zzd() {
        return (zzayo) zzb.zzaA();
    }

    public static /* synthetic */ void zzg(zzayp zzaypVar, String str) {
        Objects.requireNonNull(str);
        zzaypVar.zzd |= 2;
        zzaypVar.zzf = str;
    }

    public static /* synthetic */ void zzh(zzayp zzaypVar, Iterable iterable) {
        zzgpu zzgpuVar = zzaypVar.zzj;
        if (!zzgpuVar.zzc()) {
            zzaypVar.zzj = zzgpm.zzaM(zzgpuVar);
        }
        zzgnn.zzav(iterable, zzaypVar.zzj);
    }

    public static /* synthetic */ void zzj(zzayp zzaypVar, zzayh zzayhVar) {
        Objects.requireNonNull(zzayhVar);
        zzaypVar.zzk = zzayhVar;
        zzaypVar.zzd |= 32;
    }

    public static /* synthetic */ void zzk(zzayp zzaypVar, zzaxl zzaxlVar) {
        Objects.requireNonNull(zzaxlVar);
        zzaypVar.zzn = zzaxlVar;
        zzaypVar.zzd |= 256;
    }

    public static /* synthetic */ void zzl(zzayp zzaypVar, zzazn zzaznVar) {
        Objects.requireNonNull(zzaznVar);
        zzaypVar.zzo = zzaznVar;
        zzaypVar.zzd |= 512;
    }

    public static /* synthetic */ void zzm(zzayp zzaypVar, zzbau zzbauVar) {
        Objects.requireNonNull(zzbauVar);
        zzaypVar.zzp = zzbauVar;
        zzaypVar.zzd |= 1024;
    }

    public static /* synthetic */ void zzn(zzayp zzaypVar, zzaxu zzaxuVar) {
        Objects.requireNonNull(zzaxuVar);
        zzaypVar.zzq = zzaxuVar;
        zzaypVar.zzd |= 2048;
    }

    public final zzaxl zza() {
        zzaxl zzaxlVar = this.zzn;
        return zzaxlVar == null ? zzaxl.zzc() : zzaxlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0001\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\f᠌\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", zzaym.zza, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq"});
        }
        if (i11 == 3) {
            return new zzayp();
        }
        zzaxg zzaxgVar = null;
        if (i11 == 4) {
            return new zzayo(zzaxgVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzayh zzc() {
        zzayh zzayhVar = this.zzk;
        return zzayhVar == null ? zzayh.zzc() : zzayhVar;
    }

    public final String zzf() {
        return this.zzf;
    }
}
