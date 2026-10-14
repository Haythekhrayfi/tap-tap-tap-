package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzane extends zzgpm implements zzgqx {
    private static final zzane zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzane zzaneVar = new zzane();
        zzb = zzaneVar;
        zzgpm.zzaU(zzane.class, zzaneVar);
    }

    private zzane() {
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzane();
        }
        zzanb zzanbVar = null;
        if (i11 == 4) {
            return new zzand(zzanbVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
