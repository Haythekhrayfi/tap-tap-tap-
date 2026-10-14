package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.appopen.AppOpenAd;

/* JADX INFO: loaded from: classes2.dex */
public final class zzawb {
    private com.google.android.gms.ads.internal.client.zzbu zza;
    private final Context zzb;
    private final String zzc;
    private final com.google.android.gms.ads.internal.client.zzdx zzd;

    @AppOpenAd.AppOpenAdOrientation
    private final int zze;
    private final AppOpenAd.AppOpenAdLoadCallback zzf;
    private final zzbnt zzg = new zzbnt();
    private final com.google.android.gms.ads.internal.client.zzp zzh = com.google.android.gms.ads.internal.client.zzp.zza;

    public zzawb(Context context, String str, com.google.android.gms.ads.internal.client.zzdx zzdxVar, @AppOpenAd.AppOpenAdOrientation int i10, AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback) {
        this.zzb = context;
        this.zzc = str;
        this.zzd = zzdxVar;
        this.zze = i10;
        this.zzf = appOpenAdLoadCallback;
    }

    public final void zza() {
        try {
            com.google.android.gms.ads.internal.client.zzbu zzbuVarZzd = com.google.android.gms.ads.internal.client.zzay.zza().zzd(this.zzb, com.google.android.gms.ads.internal.client.zzq.zzb(), this.zzc, this.zzg);
            this.zza = zzbuVarZzd;
            if (zzbuVarZzd != null) {
                if (this.zze != 3) {
                    this.zza.zzI(new com.google.android.gms.ads.internal.client.zzw(this.zze));
                }
                this.zza.zzH(new zzavo(this.zzf, this.zzc));
                this.zza.zzaa(this.zzh.zza(this.zzb, this.zzd));
            }
        } catch (RemoteException e10) {
            zzbzr.zzl("#007 Could not call remote method.", e10);
        }
    }
}
