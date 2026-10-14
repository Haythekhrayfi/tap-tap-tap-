package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzelt implements zzeqx {
    private final com.google.android.gms.ads.internal.client.zzw zza;
    private final zzbzx zzb;
    private final boolean zzc;

    public zzelt(com.google.android.gms.ads.internal.client.zzw zzwVar, zzbzx zzbzxVar, boolean z10) {
        this.zza = zzwVar;
        this.zzb = zzbzxVar;
        this.zzc = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzeqx
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        String str;
        Bundle bundle = (Bundle) obj;
        if (this.zzb.zzc >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzeX)).intValue()) {
            bundle.putString("app_open_version", "2");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzeY)).booleanValue()) {
            bundle.putBoolean("app_switched", this.zzc);
        }
        com.google.android.gms.ads.internal.client.zzw zzwVar = this.zza;
        if (zzwVar != null) {
            int i10 = zzwVar.zza;
            if (i10 == 1) {
                str = "p";
            } else if (i10 != 2) {
                return;
            } else {
                str = "l";
            }
            bundle.putString("avo", str);
        }
    }
}
