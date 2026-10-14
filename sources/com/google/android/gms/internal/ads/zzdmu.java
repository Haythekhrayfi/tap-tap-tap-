package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdmu implements zzgwe {
    private final zzgwr zza;

    public zzdmu(zzgwr zzgwrVar) {
        this.zza = zzgwrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzaxj zzaxjVar = ((zzcux) this.zza).zza().zzo.zza == 3 ? zzaxj.REWARDED_INTERSTITIAL : zzaxj.REWARD_BASED_VIDEO_AD;
        zzgwm.zzb(zzaxjVar);
        return zzaxjVar;
    }
}
