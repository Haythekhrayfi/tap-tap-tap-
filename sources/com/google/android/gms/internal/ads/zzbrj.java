package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbrj extends zzbgk {
    private final NativeAd.UnconfirmedClickListener zza;

    public zzbrj(NativeAd.UnconfirmedClickListener unconfirmedClickListener) {
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
