package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgun extends zzgpm implements zzgqx {
    private static final zzgun zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private zzgoe zzg;
    private zzgoe zzh;

    static {
        zzgun zzgunVar = new zzgun();
        zzb = zzgunVar;
        zzgpm.zzaU(zzgun.class, zzgunVar);
    }

    private zzgun() {
        zzgoe zzgoeVar = zzgoe.zzb;
        this.zzg = zzgoeVar;
        this.zzh = zzgoeVar;
    }

    public static zzgul zza() {
        return (zzgul) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzgun zzgunVar, String str) {
        zzgunVar.zzd |= 2;
        zzgunVar.zzf = "image/png";
    }

    public static /* synthetic */ void zze(zzgun zzgunVar, zzgoe zzgoeVar) {
        Objects.requireNonNull(zzgoeVar);
        zzgunVar.zzd |= 4;
        zzgunVar.zzg = zzgoeVar;
    }

    public static /* synthetic */ void zzf(zzgun zzgunVar, int i10) {
        zzgunVar.zze = 1;
        zzgunVar.zzd = 1 | zzgunVar.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzd", "zze", zzgum.zza, "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzgun();
        }
        zzgtb zzgtbVar = null;
        if (i11 == 4) {
            return new zzgul(zzgtbVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
