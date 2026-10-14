package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;

/* JADX INFO: loaded from: classes2.dex */
final class zzbqe implements MediationAdLoadCallback {
    public final /* synthetic */ zzbpq zza;
    public final /* synthetic */ zzboc zzb;
    public final /* synthetic */ zzbqf zzc;

    public zzbqe(zzbqf zzbqfVar, zzbpq zzbpqVar, zzboc zzbocVar) {
        this.zzc = zzbqfVar;
        this.zza = zzbpqVar;
        this.zzb = zzbocVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        try {
            this.zza.zzf(adError.zza());
        } catch (RemoteException e10) {
            zzbzr.zzh("", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        MediationRewardedAd mediationRewardedAd = (MediationRewardedAd) obj;
        if (mediationRewardedAd != null) {
            try {
                this.zzc.zzc = mediationRewardedAd;
                this.zza.zzg();
            } catch (RemoteException e10) {
                zzbzr.zzh("", e10);
            }
            return new zzbqg(this.zzb);
        }
        zzbzr.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            this.zza.zze("Adapter returned null.");
            return null;
        } catch (RemoteException e11) {
            zzbzr.zzh("", e11);
            return null;
        }
    }
}
