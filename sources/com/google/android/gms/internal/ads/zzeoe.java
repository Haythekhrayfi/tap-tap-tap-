package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeoe implements zzeqx {
    private final Boolean zza;

    public zzeoe(Boolean bool) {
        this.zza = bool;
    }

    @Override // com.google.android.gms.internal.ads.zzeqx
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        Boolean bool = this.zza;
        if (bool != null) {
            bundle.putBoolean("hw_accel", bool.booleanValue());
        }
    }
}
