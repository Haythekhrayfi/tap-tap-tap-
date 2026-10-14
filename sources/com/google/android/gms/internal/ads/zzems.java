package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzems implements zzeqx {
    public final double zza;
    public final boolean zzb;

    public zzems(double d10, boolean z10) {
        this.zza = d10;
        this.zzb = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzeqx
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundleZza = zzfat.zza(bundle, "device");
        bundle.putBundle("device", bundleZza);
        Bundle bundleZza2 = zzfat.zza(bundleZza, "battery");
        bundleZza.putBundle("battery", bundleZza2);
        bundleZza2.putBoolean("is_charging", this.zzb);
        bundleZza2.putDouble("battery_level", this.zza);
    }
}
