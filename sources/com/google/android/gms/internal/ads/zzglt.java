package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class zzglt extends zzgpm implements zzgqx {
    private static final zzglt zzb;
    private String zzd = "";
    private zzgpv zze = zzgpm.zzaN();

    static {
        zzglt zzgltVar = new zzglt();
        zzb = zzgltVar;
        zzgpm.zzaU(zzglt.class, zzgltVar);
    }

    private zzglt() {
    }

    public static zzglt zzc() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgpm.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzd", "zze", zzgks.class});
        }
        if (i11 == 3) {
            return new zzglt();
        }
        zzglr zzglrVar = null;
        if (i11 == 4) {
            return new zzgls(zzglrVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
