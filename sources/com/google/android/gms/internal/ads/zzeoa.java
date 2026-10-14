package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeoa implements zzeqx {
    private final boolean zza;

    public zzeoa(boolean z10) {
        this.zza = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzeqx
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        ((Bundle) obj).putBoolean("is_gbid", this.zza);
    }
}
