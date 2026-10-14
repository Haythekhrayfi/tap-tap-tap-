package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgq extends zzke implements zzlm {
    private static final zzgq zza;
    private int zze;
    private String zzf = "";
    private zzkl zzg = zzke.zzbD();

    static {
        zzgq zzgqVar = new zzgq();
        zza = zzgqVar;
        zzke.zzbJ(zzgq.class, zzgqVar);
    }

    private zzgq() {
    }

    public final String zzb() {
        return this.zzf;
    }

    public final List zzc() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.measurement.zzke
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzke.zzbI(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", zzgx.class});
        }
        if (i11 == 3) {
            return new zzgq();
        }
        zzgm zzgmVar = null;
        if (i11 == 4) {
            return new zzgp(zzgmVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
