package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzguf extends zzgpm implements zzgqx {
    private static final zzguf zzb;
    private int zzd;
    private zzgue zze;
    private zzgoe zzg;
    private zzgoe zzh;
    private int zzi;
    private zzgoe zzj;
    private byte zzk = 2;
    private zzgpv zzf = zzgpm.zzaN();

    static {
        zzguf zzgufVar = new zzguf();
        zzb = zzgufVar;
        zzgpm.zzaU(zzguf.class, zzgufVar);
    }

    private zzguf() {
        zzgoe zzgoeVar = zzgoe.zzb;
        this.zzg = zzgoeVar;
        this.zzh = zzgoeVar;
        this.zzj = zzgoeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzk);
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zzd", "zze", "zzf", zzgtx.class, "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new zzguf();
        }
        zzgtb zzgtbVar = null;
        if (i11 == 4) {
            return new zzguc(zzgtbVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzk = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
