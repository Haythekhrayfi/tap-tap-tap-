package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbgy extends zzbgb {
    private final OnAdManagerAdViewLoadedListener zza;

    public zzbgy(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener) {
        this.zza = onAdManagerAdViewLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbgc
    public final void zze(com.google.android.gms.ads.internal.client.zzbu zzbuVar, IObjectWrapper iObjectWrapper) {
        if (zzbuVar == null || iObjectWrapper == null) {
            return;
        }
        AdManagerAdView adManagerAdView = new AdManagerAdView((Context) ObjectWrapper.unwrap(iObjectWrapper));
        try {
            if (zzbuVar.zzi() instanceof com.google.android.gms.ads.internal.client.zzg) {
                com.google.android.gms.ads.internal.client.zzg zzgVar = (com.google.android.gms.ads.internal.client.zzg) zzbuVar.zzi();
                adManagerAdView.setAdListener(zzgVar != null ? zzgVar.zzb() : null);
            }
        } catch (RemoteException e10) {
            zzbzr.zzh("", e10);
        }
        try {
            if (zzbuVar.zzj() instanceof zzauo) {
                zzauo zzauoVar = (zzauo) zzbuVar.zzj();
                adManagerAdView.setAppEventListener(zzauoVar != null ? zzauoVar.zzb() : null);
            }
        } catch (RemoteException e11) {
            zzbzr.zzh("", e11);
        }
        zzbzk.zza.post(new zzbgx(this, adManagerAdView, zzbuVar));
    }
}
