package com.google.android.gms.ads.admanager;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbdd;
import com.google.android.gms.internal.ads.zzblb;
import com.google.android.gms.internal.ads.zzbsw;
import com.google.android.gms.internal.ads.zzbzg;

/* JADX INFO: loaded from: classes.dex */
public abstract class AdManagerInterstitialAd extends InterstitialAd {
    public static void load(final Context context, final String str, final AdManagerAdRequest adManagerAdRequest, final AdManagerInterstitialAdLoadCallback adManagerInterstitialAdLoadCallback) {
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkNotNull(str, "AdUnitId cannot be null.");
        Preconditions.checkNotNull(adManagerAdRequest, "AdManagerAdRequest cannot be null.");
        Preconditions.checkNotNull(adManagerInterstitialAdLoadCallback, "LoadCallback cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbbm.zza(context);
        if (((Boolean) zzbdd.zzi.zze()).booleanValue()) {
            if (((Boolean) zzba.zzc().zzb(zzbbm.zzjJ)).booleanValue()) {
                zzbzg.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.admanager.zzc
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                        try {
                            new zzblb(context2, str2).zza(adManagerAdRequest2.zza(), adManagerInterstitialAdLoadCallback);
                        } catch (IllegalStateException e10) {
                            zzbsw.zza(context2).zzf(e10, "AdManagerInterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new zzblb(context, str).zza(adManagerAdRequest.zza(), adManagerInterstitialAdLoadCallback);
    }

    public abstract AppEventListener getAppEventListener();

    public abstract void setAppEventListener(AppEventListener appEventListener);
}
