package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbgz extends zzbge {
    private final UnifiedNativeAd.OnUnifiedNativeAdLoadedListener zza;

    public zzbgz(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
        this.zza = onUnifiedNativeAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbgf
    public final void zze(zzbgo zzbgoVar) {
        this.zza.onUnifiedNativeAdLoaded(new zzbgp(zzbgoVar));
    }
}
