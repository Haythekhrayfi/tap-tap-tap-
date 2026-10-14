package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzekk implements zzeqy {
    private final Context zza;

    public zzekk(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final zzfwm zzb() {
        zzekl zzeklVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcB)).booleanValue()) {
            zzeklVar = new zzekl(e0.a.a(this.zza, "com.google.android.gms.permission.AD_ID") == 0);
        } else {
            zzeklVar = null;
        }
        return zzfwc.zzh(zzeklVar);
    }
}
