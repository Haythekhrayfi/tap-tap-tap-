package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeug implements zzeqy {
    private final zzbza zza;
    private final boolean zzb;
    private final boolean zzc;
    private final ScheduledExecutorService zzd;
    private final zzfwn zze;
    private final String zzf;
    private final zzbyp zzg;

    public zzeug(zzbza zzbzaVar, boolean z10, boolean z11, zzbyp zzbypVar, zzfwn zzfwnVar, String str, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzbzaVar;
        this.zzb = z10;
        this.zzc = z11;
        this.zzg = zzbypVar;
        this.zze = zzfwnVar;
        this.zzf = str;
        this.zzd = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final int zza() {
        return 50;
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final zzfwm zzb() {
        if ((!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzgV)).booleanValue() || !this.zzc) && this.zzb) {
            return zzfwc.zze(zzfwc.zzn(zzfwc.zzl(zzfwc.zzh(null), new zzfov() { // from class: com.google.android.gms.internal.ads.zzeue
                @Override // com.google.android.gms.internal.ads.zzfov
                public final Object apply(Object obj) {
                    String str = (String) obj;
                    if (str == null) {
                        return null;
                    }
                    return new zzeuh(str);
                }
            }, this.zze), ((Long) zzbds.zzc.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzd), Exception.class, new zzfov() { // from class: com.google.android.gms.internal.ads.zzeuf
                @Override // com.google.android.gms.internal.ads.zzfov
                public final Object apply(Object obj) {
                    this.zza.zzc((Exception) obj);
                    return null;
                }
            }, this.zze);
        }
        return zzfwc.zzh(null);
    }

    public final /* synthetic */ zzeuh zzc(Exception exc) {
        this.zza.zzu(exc, "TrustlessTokenSignal");
        return null;
    }
}
