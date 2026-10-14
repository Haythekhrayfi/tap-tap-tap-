package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgtx extends zzgpm implements zzgqx {
    private static final zzgtx zzb;
    private int zzd;
    private zzgoe zze;
    private zzgoe zzf;
    private byte zzg = 2;

    static {
        zzgtx zzgtxVar = new zzgtx();
        zzb = zzgtxVar;
        zzgpm.zzaU(zzgtx.class, zzgtxVar);
    }

    private zzgtx() {
        zzgoe zzgoeVar = zzgoe.zzb;
        this.zze = zzgoeVar;
        this.zzf = zzgoeVar;
    }

    public static zzgtw zza() {
        return (zzgtw) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzgtx zzgtxVar, zzgoe zzgoeVar) {
        zzgtxVar.zzd |= 1;
        zzgtxVar.zze = zzgoeVar;
    }

    public static /* synthetic */ void zze(zzgtx zzgtxVar, zzgoe zzgoeVar) {
        zzgtxVar.zzd |= 2;
        zzgtxVar.zzf = zzgoeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzgtx();
        }
        zzgtb zzgtbVar = null;
        if (i11 == 4) {
            return new zzgtw(zzgtbVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
