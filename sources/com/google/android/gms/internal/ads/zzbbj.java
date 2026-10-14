package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzbbj implements zzbdu {
    public final /* synthetic */ zzbbk zza;

    public zzbbj(zzbbk zzbbkVar) {
        this.zza = zzbbkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbdu
    public final Boolean zza(String str, boolean z10) {
        try {
            return Boolean.valueOf(this.zza.zze.getBoolean(str, z10));
        } catch (ClassCastException unused) {
            return Boolean.valueOf(this.zza.zze.getString(str, String.valueOf(z10)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdu
    public final Double zzb(String str, double d10) {
        try {
            return Double.valueOf(this.zza.zze.getFloat(str, (float) d10));
        } catch (ClassCastException unused) {
            return Double.valueOf(this.zza.zze.getString(str, String.valueOf(d10)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdu
    public final Long zzc(String str, long j10) {
        try {
            return Long.valueOf(this.zza.zze.getLong(str, j10));
        } catch (ClassCastException unused) {
            return Long.valueOf(this.zza.zze.getInt(str, (int) j10));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdu
    public final String zzd(String str, String str2) {
        return this.zza.zze.getString(str, str2);
    }
}
