package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeoi implements zzeqx {
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;
    private final boolean zzd;

    public zzeoi(String str, boolean z10, boolean z11, boolean z12) {
        this.zza = str;
        this.zzb = z10;
        this.zzc = z11;
        this.zzd = z12;
    }

    @Override // com.google.android.gms.internal.ads.zzeqx
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!this.zza.isEmpty()) {
            bundle.putString("inspector_extras", this.zza);
        }
        bundle.putInt("test_mode", this.zzb ? 1 : 0);
        bundle.putInt("linked_device", this.zzc ? 1 : 0);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zziK)).booleanValue()) {
            if (this.zzb || this.zzc) {
                bundle.putInt("risd", !this.zzd ? 1 : 0);
            }
        }
    }
}
