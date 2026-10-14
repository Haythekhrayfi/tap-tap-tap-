package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeom implements zzeqx {
    public final Bundle zza;

    public zzeom(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzeqx
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundleZza = zzfat.zza(bundle, "device");
        bundleZza.putBundle("android_mem_info", this.zza);
        bundle.putBundle("device", bundleZza);
    }
}
