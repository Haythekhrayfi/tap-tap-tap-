package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfg extends zzke implements zzlm {
    private static final zzfg zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        zzfg zzfgVar = new zzfg();
        zza = zzfgVar;
        zzke.zzbJ(zzfg.class, zzfgVar);
    }

    private zzfg() {
    }

    @Override // com.google.android.gms.internal.measurement.zzke
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzke.zzbI(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzfg();
        }
        zzey zzeyVar = null;
        if (i11 == 4) {
            return new zzff(zzeyVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
