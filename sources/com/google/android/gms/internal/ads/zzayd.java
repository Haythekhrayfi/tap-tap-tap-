package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzayd extends zzgpm implements zzgqx {
    private static final zzayd zzb;
    private int zzd;
    private String zze = "";
    private zzgpv zzf = zzgpm.zzaN();
    private int zzg = 1000;
    private int zzh = 1000;
    private int zzi = 1000;

    static {
        zzayd zzaydVar = new zzayd();
        zzb = zzaydVar;
        zzgpm.zzaU(zzayd.class, zzaydVar);
    }

    private zzayd() {
    }

    public static zzayd zzc() {
        return zzb;
    }

    public static /* synthetic */ void zzd(zzayd zzaydVar, String str) {
        Objects.requireNonNull(str);
        zzaydVar.zzd |= 1;
        zzaydVar.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.zzgpm
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            zzgpq zzgpqVar = zzaym.zza;
            return zzgpm.zzaR(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001\u0004᠌\u0002\u0005᠌\u0003", new Object[]{"zzd", "zze", "zzf", zzaxz.class, "zzg", zzgpqVar, "zzh", zzgpqVar, "zzi", zzgpqVar});
        }
        if (i11 == 3) {
            return new zzayd();
        }
        zzaxg zzaxgVar = null;
        if (i11 == 4) {
            return new zzayc(zzaxgVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
