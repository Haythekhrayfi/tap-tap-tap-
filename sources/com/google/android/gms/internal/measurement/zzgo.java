package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgo extends zzke implements zzlm {
    private static final zzgo zza;
    private zzkl zze = zzke.zzbD();

    static {
        zzgo zzgoVar = new zzgo();
        zza = zzgoVar;
        zzke.zzbJ(zzgo.class, zzgoVar);
    }

    private zzgo() {
    }

    public static zzgo zzc() {
        return zza;
    }

    public final int zza() {
        return this.zze.size();
    }

    public final List zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzke
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzke.zzbI(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", zzgq.class});
        }
        if (i11 == 3) {
            return new zzgo();
        }
        zzgm zzgmVar = null;
        if (i11 == 4) {
            return new zzgn(zzgmVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
