package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public class zzbcr {
    private final String zza;
    private final Object zzb;
    private final int zzc;

    public zzbcr(String str, Object obj, int i10) {
        this.zza = str;
        this.zzb = obj;
        this.zzc = i10;
    }

    public static zzbcr zza(String str, double d10) {
        return new zzbcr(str, Double.valueOf(d10), 3);
    }

    public static zzbcr zzb(String str, long j10) {
        return new zzbcr(str, Long.valueOf(j10), 2);
    }

    public static zzbcr zzc(String str, String str2) {
        return new zzbcr(str, str2, 4);
    }

    public static zzbcr zzd(String str, boolean z10) {
        return new zzbcr(str, Boolean.valueOf(z10), 1);
    }

    public final Object zze() {
        zzbdu zzbduVarZza = zzbdw.zza();
        if (zzbduVarZza == null) {
            if (zzbdw.zzb() != null) {
                zzbdw.zzb().zza();
            }
            return this.zzb;
        }
        int i10 = this.zzc - 1;
        if (i10 == 0) {
            return zzbduVarZza.zza(this.zza, ((Boolean) this.zzb).booleanValue());
        }
        if (i10 != 1) {
            return i10 != 2 ? zzbduVarZza.zzd(this.zza, (String) this.zzb) : zzbduVarZza.zzb(this.zza, ((Double) this.zzb).doubleValue());
        }
        return zzbduVarZza.zzc(this.zza, ((Long) this.zzb).longValue());
    }
}
