package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbha extends zzbgk {
    private final UnifiedNativeAd.UnconfirmedClickListener zza;

    public zzbha(UnifiedNativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        this.zza = unconfirmedClickListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbgl
    public final void zze() {
        this.zza.onUnconfirmedClickCancelled();
    }

    @Override // com.google.android.gms.internal.ads.zzbgl
    public final void zzf(String str) {
        this.zza.onUnconfirmedClickReceived(str);
    }
}
