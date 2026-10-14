package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbri extends zzbge {
    private final NativeAd.OnNativeAdLoadedListener zza;

    public zzbri(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
        this.zza = onNativeAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbgf
    public final void zze(zzbgo zzbgoVar) {
        this.zza.onNativeAdLoaded(new zzbrb(zzbgoVar));
    }
}
