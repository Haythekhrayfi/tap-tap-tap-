package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdww {
    private final zzfwn zza;
    private final zzfwn zzb;
    private final zzdxo zzc;

    public zzdww(zzfwn zzfwnVar, zzfwn zzfwnVar2, zzdxo zzdxoVar) {
        this.zza = zzfwnVar;
        this.zzb = zzfwnVar2;
        this.zzc = zzdxoVar;
    }

    public final /* synthetic */ zzfwm zza(zzbti zzbtiVar) throws Exception {
        return this.zzc.zza(zzbtiVar, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzjU)).longValue());
    }

    public final zzfwm zzb(final zzbti zzbtiVar) {
        String str = zzbtiVar.zzb;
        com.google.android.gms.ads.internal.zzt.zzp();
        return zzfwc.zzm(zzfwc.zzf(zzfvt.zzv(com.google.android.gms.ads.internal.util.zzs.zzy(str) ? zzfwc.zzg(new zzdwa(1, "Ads signal service force local")) : zzfwc.zzf(zzfwc.zzk(new zzfvi() { // from class: com.google.android.gms.internal.ads.zzdws
            @Override // com.google.android.gms.internal.ads.zzfvi
            public final zzfwm zza() {
                return this.zza.zza(zzbtiVar);
            }
        }, this.zza), ExecutionException.class, new zzfvj() { // from class: com.google.android.gms.internal.ads.zzdwt
            @Override // com.google.android.gms.internal.ads.zzfvj
            public final zzfwm zza(Object obj) {
                ExecutionException executionException = (ExecutionException) obj;
                Throwable cause = executionException.getCause();
                ExecutionException cause2 = executionException;
                if (cause != null) {
                    cause2 = executionException.getCause();
                }
                return zzfwc.zzg(cause2);
            }
        }, this.zzb)), zzdwa.class, new zzfvj() { // from class: com.google.android.gms.internal.ads.zzdwu
            @Override // com.google.android.gms.internal.ads.zzfvj
            public final zzfwm zza(Object obj) {
                return zzfwc.zzh(null);
            }
        }, this.zzb), new zzfvj() { // from class: com.google.android.gms.internal.ads.zzdwv
            @Override // com.google.android.gms.internal.ads.zzfvj
            public final zzfwm zza(Object obj) {
                InputStream inputStream = (InputStream) obj;
                JSONObject jSONObject = new JSONObject();
                if (inputStream != null) {
                    try {
                        com.google.android.gms.ads.internal.zzt.zzp();
                        jSONObject = new JSONObject(com.google.android.gms.ads.internal.util.zzs.zzJ(new InputStreamReader(inputStream)));
                    } catch (IOException | JSONException e10) {
                        com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "AdsServiceSignalTask.startAdsServiceSignalTask");
                    }
                }
                return zzfwc.zzh(jSONObject);
            }
        }, this.zzb);
    }
}
