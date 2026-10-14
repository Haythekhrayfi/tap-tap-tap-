package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfy extends zzke implements zzlm {
    private static final zzfy zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private zzfm zzh;

    static {
        zzfy zzfyVar = new zzfy();
        zza = zzfyVar;
        zzke.zzbJ(zzfy.class, zzfyVar);
    }

    private zzfy() {
    }

    @Override // com.google.android.gms.internal.measurement.zzke
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzke.zzbI(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzfy();
        }
        zzfj zzfjVar = null;
        if (i11 == 4) {
            return new zzfx(zzfjVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
