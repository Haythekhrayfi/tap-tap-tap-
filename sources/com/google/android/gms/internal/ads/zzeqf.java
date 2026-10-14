package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeqf implements zzeqy {
    private final String zza;
    private final zzfwn zzb;
    private final ScheduledExecutorService zzc;
    private final Context zzd;
    private final zzfai zze;
    private final zzcgu zzf;

    public zzeqf(zzfwn zzfwnVar, ScheduledExecutorService scheduledExecutorService, String str, Context context, zzfai zzfaiVar, zzcgu zzcguVar) {
        this.zzb = zzfwnVar;
        this.zzc = scheduledExecutorService;
        this.zza = str;
        this.zzd = context;
        this.zze = zzfaiVar;
        this.zzf = zzcguVar;
    }

    public static /* synthetic */ zzfwm zzc(zzeqf zzeqfVar) {
        String strName = zzeqfVar.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzgT)).booleanValue()) {
            strName = AdFormat.UNKNOWN.name();
        }
        com.google.android.gms.ads.nonagon.signalgeneration.zzg zzgVarZzn = zzeqfVar.zzf.zzn();
        zzcuo zzcuoVar = new zzcuo();
        zzcuoVar.zze(zzeqfVar.zzd);
        zzfag zzfagVar = new zzfag();
        zzfagVar.zzs("adUnitId");
        zzfagVar.zzE(zzeqfVar.zze.zzd);
        zzfagVar.zzr(new com.google.android.gms.ads.internal.client.zzq());
        zzcuoVar.zzi(zzfagVar.zzG());
        zzgVarZzn.zza(zzcuoVar.zzj());
        com.google.android.gms.ads.nonagon.signalgeneration.zzac zzacVar = new com.google.android.gms.ads.nonagon.signalgeneration.zzac();
        zzacVar.zza(strName);
        zzgVarZzn.zzb(zzacVar.zzb());
        new zzdar();
        return zzfwc.zze(zzfwc.zzl((zzfvt) zzfwc.zzn(zzfvt.zzv(zzgVarZzn.zzc().zzc()), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzgU)).longValue(), TimeUnit.MILLISECONDS, zzeqfVar.zzc), new zzfov() { // from class: com.google.android.gms.internal.ads.zzeqd
            @Override // com.google.android.gms.internal.ads.zzfov
            public final Object apply(Object obj) {
                com.google.android.gms.ads.nonagon.signalgeneration.zzam zzamVar = (com.google.android.gms.ads.nonagon.signalgeneration.zzam) obj;
                return zzamVar != null ? new zzeqg(zzamVar.zza) : new zzeqg(null);
            }
        }, zzeqfVar.zzb), Exception.class, new zzfov() { // from class: com.google.android.gms.internal.ads.zzeqe
            @Override // com.google.android.gms.internal.ads.zzfov
            public final Object apply(Object obj) {
                zzbzr.zzh("", (Exception) obj);
                return new zzeqg(null);
            }
        }, zzeqfVar.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final int zza() {
        return 33;
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final zzfwm zzb() {
        return (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzgS)).booleanValue() || "adUnitId".equals(this.zze.zzf)) ? zzfwc.zzh(new zzeqg(null)) : zzfwc.zzk(new zzfvi() { // from class: com.google.android.gms.internal.ads.zzeqc
            @Override // com.google.android.gms.internal.ads.zzfvi
            public final zzfwm zza() {
                return zzeqf.zzc(this.zza);
            }
        }, this.zzb);
    }
}
