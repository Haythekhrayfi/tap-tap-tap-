package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeop implements zzeqx {
    public final zzezm zza;

    public zzeop(zzezm zzezmVar) {
        this.zza = zzezmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqx
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzezm zzezmVar = this.zza;
        if (zzezmVar != null) {
            bundle.putBoolean("render_in_browser", zzezmVar.zzd());
            bundle.putBoolean("disable_ml", this.zza.zzc());
        }
    }
}
