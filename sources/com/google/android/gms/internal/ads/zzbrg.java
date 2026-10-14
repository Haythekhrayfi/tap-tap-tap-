package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbrg {
    private final NativeCustomFormatAd.OnCustomFormatAdLoadedListener zza;
    private final NativeCustomFormatAd.OnCustomClickListener zzb;
    private NativeCustomFormatAd zzc;

    public zzbrg(NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
        this.zza = onCustomFormatAdLoadedListener;
        this.zzb = onCustomClickListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized NativeCustomFormatAd zzf(zzbfl zzbflVar) {
        NativeCustomFormatAd nativeCustomFormatAd = this.zzc;
        if (nativeCustomFormatAd != null) {
            return nativeCustomFormatAd;
        }
        zzbrh zzbrhVar = new zzbrh(zzbflVar);
        this.zzc = zzbrhVar;
        return zzbrhVar;
    }

    public final zzbfv zza() {
        zzbrc zzbrcVar = null;
        if (this.zzb == null) {
            return null;
        }
        return new zzbrd(this, zzbrcVar);
    }

    public final zzbfy zzb() {
        return new zzbrf(this, null);
    }
}
