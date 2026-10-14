package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzelm implements zzeqx {
    private final Bundle zza;

    public zzelm(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzeqx
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.zza.isEmpty()) {
            return;
        }
        bundle.putBundle("installed_adapter_data", this.zza);
    }
}
