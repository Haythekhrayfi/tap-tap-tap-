package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgs extends zzke implements zzlm {
    private static final zzgs zza;
    private int zze;
    private zzkl zzf = zzke.zzbD();
    private zzgo zzg;

    static {
        zzgs zzgsVar = new zzgs();
        zza = zzgsVar;
        zzke.zzbJ(zzgs.class, zzgsVar);
    }

    private zzgs() {
    }

    public final zzgo zza() {
        zzgo zzgoVar = this.zzg;
        return zzgoVar == null ? zzgo.zzc() : zzgoVar;
    }

    public final List zzc() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzke
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzke.zzbI(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", zzgx.class, "zzg"});
        }
        if (i11 == 3) {
            return new zzgs();
        }
        zzgm zzgmVar = null;
        if (i11 == 4) {
            return new zzgr(zzgmVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
