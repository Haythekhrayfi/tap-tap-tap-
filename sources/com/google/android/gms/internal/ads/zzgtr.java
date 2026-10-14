package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgtr extends zzgpm implements zzgqx {
    private static final zzgtr zzb;
    private int zzd;
    private zzgtq zzf;
    private long zzg;
    private String zze = "";
    private String zzh = "";

    static {
        zzgtr zzgtrVar = new zzgtr();
        zzb = zzgtrVar;
        zzgpm.zzaU(zzgtr.class, zzgtrVar);
    }

    private zzgtr() {
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzgtr();
        }
        zzgtb zzgtbVar = null;
        if (i11 == 4) {
            return new zzgto(zzgtbVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
