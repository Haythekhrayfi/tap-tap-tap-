package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbgw {
    private final NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener zza;
    private final NativeCustomTemplateAd.OnCustomClickListener zzb;
    private NativeCustomTemplateAd zzc;

    public zzbgw(NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener) {
        this.zza = onCustomTemplateAdLoadedListener;
        this.zzb = onCustomClickListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized NativeCustomTemplateAd zzf(zzbfl zzbflVar) {
        NativeCustomTemplateAd nativeCustomTemplateAd = this.zzc;
        if (nativeCustomTemplateAd != null) {
            return nativeCustomTemplateAd;
        }
        zzbfm zzbfmVar = new zzbfm(zzbflVar);
        this.zzc = zzbfmVar;
        return zzbfmVar;
    }

    public final zzbfv zzd() {
        zzbgs zzbgsVar = null;
        if (this.zzb == null) {
            return null;
        }
        return new zzbgt(this, zzbgsVar);
    }

    public final zzbfy zze() {
        return new zzbgv(this, null);
    }
}
