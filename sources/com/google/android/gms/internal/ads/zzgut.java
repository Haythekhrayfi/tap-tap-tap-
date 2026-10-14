package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgut extends zzgpm implements zzgqx {
    private static final zzgut zzb;
    private int zzd;
    private int zze;
    private zzgub zzg;
    private zzguf zzh;
    private int zzi;
    private int zzl;
    private byte zzn = 2;
    private String zzf = "";
    private zzgpr zzj = zzgpm.zzaJ();
    private String zzk = "";
    private zzgpv zzm = zzgpm.zzaN();

    static {
        zzgut zzgutVar = new zzgut();
        zzb = zzgutVar;
        zzgpm.zzaU(zzgut.class, zzgutVar);
    }

    private zzgut() {
    }

    public static zzgus zzc() {
        return (zzgus) zzb.zzaA();
    }

    public static /* synthetic */ void zzf(zzgut zzgutVar, int i10) {
        zzgutVar.zzd |= 1;
        zzgutVar.zze = i10;
    }

    public static /* synthetic */ void zzg(zzgut zzgutVar, String str) {
        Objects.requireNonNull(str);
        zzgutVar.zzd |= 2;
        zzgutVar.zzf = str;
    }

    public static /* synthetic */ void zzh(zzgut zzgutVar, zzgub zzgubVar) {
        Objects.requireNonNull(zzgubVar);
        zzgutVar.zzg = zzgubVar;
        zzgutVar.zzd |= 4;
    }

    public static /* synthetic */ void zzi(zzgut zzgutVar, String str) {
        Objects.requireNonNull(str);
        zzgpv zzgpvVar = zzgutVar.zzm;
        if (!zzgpvVar.zzc()) {
            zzgutVar.zzm = zzgpm.zzaO(zzgpvVar);
        }
        zzgutVar.zzm.add(str);
    }

    public static /* synthetic */ void zzj(zzgut zzgutVar, int i10) {
        zzgutVar.zzl = i10 - 1;
        zzgutVar.zzd |= 64;
    }

    public final int zza() {
        return this.zzm.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzn);
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", zzguq.zza, "zzm"});
        }
        if (i11 == 3) {
            return new zzgut();
        }
        zzgtb zzgtbVar = null;
        if (i11 == 4) {
            return new zzgus(zzgtbVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzn = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final String zze() {
        return this.zzf;
    }
}
