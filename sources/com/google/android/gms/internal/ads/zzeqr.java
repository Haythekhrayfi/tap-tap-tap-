package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeqr implements zzeqy {
    private final boolean zza;

    public zzeqr(zzexi zzexiVar) {
        this.zza = zzexiVar != null;
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final int zza() {
        return 36;
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final zzfwm zzb() {
        return zzfwc.zzh(this.zza ? new zzeqx() { // from class: com.google.android.gms.internal.ads.zzeqq
            @Override // com.google.android.gms.internal.ads.zzeqx
            public final void zzh(Object obj) {
                ((Bundle) obj).putBoolean("sdk_prefetch", true);
            }
        } : null);
    }
}
