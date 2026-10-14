package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzemv implements zzeqy {
    private final zzewl zza;

    public zzemv(zzewl zzewlVar) {
        this.zza = zzewlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final int zza() {
        return 15;
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final zzfwm zzb() {
        zzewl zzewlVar = this.zza;
        zzeqx zzeqxVar = null;
        if (zzewlVar != null && zzewlVar.zza() != null && !zzewlVar.zza().isEmpty()) {
            zzeqxVar = new zzeqx() { // from class: com.google.android.gms.internal.ads.zzemu
                @Override // com.google.android.gms.internal.ads.zzeqx
                public final void zzh(Object obj) {
                    this.zza.zzc((Bundle) obj);
                }
            };
        }
        return zzfwc.zzh(zzeqxVar);
    }

    public final /* synthetic */ void zzc(Bundle bundle) {
        bundle.putString("key_schema", this.zza.zza());
    }
}
