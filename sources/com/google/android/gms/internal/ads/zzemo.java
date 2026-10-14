package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzemo implements zzeqx {
    public final int zza;
    public final boolean zzb;
    public final boolean zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final float zzi;
    public final boolean zzj;

    public zzemo(int i10, boolean z10, boolean z11, int i11, int i12, int i13, int i14, int i15, float f10, boolean z12) {
        this.zza = i10;
        this.zzb = z10;
        this.zzc = z11;
        this.zzd = i11;
        this.zze = i12;
        this.zzf = i13;
        this.zzg = i14;
        this.zzh = i15;
        this.zzi = f10;
        this.zzj = z12;
    }

    @Override // com.google.android.gms.internal.ads.zzeqx
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putInt("am", this.zza);
        bundle.putBoolean("ma", this.zzb);
        bundle.putBoolean("sp", this.zzc);
        bundle.putInt("muv", this.zzd);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzjz)).booleanValue()) {
            bundle.putInt("muv_min", this.zze);
            bundle.putInt("muv_max", this.zzf);
        }
        bundle.putInt("rm", this.zzg);
        bundle.putInt("riv", this.zzh);
        bundle.putFloat("android_app_volume", this.zzi);
        bundle.putBoolean("android_app_muted", this.zzj);
    }
}
