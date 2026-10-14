package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzbsl extends zzbsh {
    public final /* synthetic */ UpdateImpressionUrlsCallback zza;

    public zzbsl(zzbsq zzbsqVar, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        this.zza = updateImpressionUrlsCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzbsi
    public final void zze(String str) {
        this.zza.onFailure(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbsi
    public final void zzf(List list) {
        this.zza.onSuccess(list);
    }
}
