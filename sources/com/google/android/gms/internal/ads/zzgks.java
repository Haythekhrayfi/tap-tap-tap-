package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class zzgks extends zzgpm implements zzgqx {
    private static final zzgks zzb;
    private int zzf;
    private boolean zzg;
    private String zzd = "";
    private String zze = "";
    private String zzh = "";

    static {
        zzgks zzgksVar = new zzgks();
        zzb = zzgksVar;
        zzgpm.zzaU(zzgks.class, zzgksVar);
    }

    private zzgks() {
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzgks();
        }
        zzgkq zzgkqVar = null;
        if (i11 == 4) {
            return new zzgkr(zzgkqVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
