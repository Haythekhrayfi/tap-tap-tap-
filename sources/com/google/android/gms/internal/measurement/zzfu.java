package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfu extends zzke implements zzlm {
    private static final zzfu zza;
    private int zze;
    private String zzf = "";
    private long zzg;

    static {
        zzfu zzfuVar = new zzfu();
        zza = zzfuVar;
        zzke.zzbJ(zzfu.class, zzfuVar);
    }

    private zzfu() {
    }

    public static zzft zza() {
        return (zzft) zza.zzbx();
    }

    public static /* synthetic */ void zzc(zzfu zzfuVar, String str) {
        Objects.requireNonNull(str);
        zzfuVar.zze |= 1;
        zzfuVar.zzf = str;
    }

    public static /* synthetic */ void zzd(zzfu zzfuVar, long j10) {
        zzfuVar.zze |= 2;
        zzfuVar.zzg = j10;
    }

    @Override // com.google.android.gms.internal.measurement.zzke
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzke.zzbI(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzfu();
        }
        zzfj zzfjVar = null;
        if (i11 == 4) {
            return new zzft(zzfjVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
