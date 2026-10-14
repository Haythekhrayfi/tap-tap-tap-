package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzemc implements zzeqy {
    public final zzbza zza;
    public AppSetIdClient zzb;
    private final ScheduledExecutorService zzc;
    private final zzfwn zzd;
    private final Context zze;

    public zzemc(Context context, zzbza zzbzaVar, ScheduledExecutorService scheduledExecutorService, zzfwn zzfwnVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcy)).booleanValue()) {
            this.zzb = AppSet.getClient(context);
        }
        this.zze = context;
        this.zza = zzbzaVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfwnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final int zza() {
        return 11;
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final zzfwm zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcu)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcz)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcv)).booleanValue()) {
                    return zzfwc.zzl(zzfml.zza(this.zzb.getAppSetIdInfo()), new zzfov() { // from class: com.google.android.gms.internal.ads.zzelz
                        @Override // com.google.android.gms.internal.ads.zzfov
                        public final Object apply(Object obj) {
                            AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                            return new zzemd(appSetIdInfo.getId(), appSetIdInfo.getScope());
                        }
                    }, zzcae.zzf);
                }
                Task<AppSetIdInfo> taskZza = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcy)).booleanValue() ? zzfbl.zza(this.zze) : this.zzb.getAppSetIdInfo();
                if (taskZza == null) {
                    return zzfwc.zzh(new zzemd(null, -1));
                }
                zzfwm zzfwmVarZzm = zzfwc.zzm(zzfml.zza(taskZza), new zzfvj() { // from class: com.google.android.gms.internal.ads.zzema
                    @Override // com.google.android.gms.internal.ads.zzfvj
                    public final zzfwm zza(Object obj) {
                        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                        return appSetIdInfo == null ? zzfwc.zzh(new zzemd(null, -1)) : zzfwc.zzh(new zzemd(appSetIdInfo.getId(), appSetIdInfo.getScope()));
                    }
                }, zzcae.zzf);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcw)).booleanValue()) {
                    zzfwmVarZzm = zzfwc.zzn(zzfwmVarZzm, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcx)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                }
                return zzfwc.zze(zzfwmVarZzm, Exception.class, new zzfov() { // from class: com.google.android.gms.internal.ads.zzemb
                    @Override // com.google.android.gms.internal.ads.zzfov
                    public final Object apply(Object obj) {
                        this.zza.zza.zzu((Exception) obj, "AppSetIdInfoSignal");
                        return new zzemd(null, -1);
                    }
                }, this.zzd);
            }
        }
        return zzfwc.zzh(new zzemd(null, -1));
    }
}
