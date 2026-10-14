package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgvc extends zzgpm implements zzgqx {
    private static final zzgvc zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzgvc zzgvcVar = new zzgvc();
        zzb = zzgvcVar;
        zzgpm.zzaU(zzgvc.class, zzgvcVar);
    }

    private zzgvc() {
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
            return new zzgvc();
        }
        zzgtb zzgtbVar = null;
        if (i11 == 4) {
            return new zzgvb(zzgtbVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
