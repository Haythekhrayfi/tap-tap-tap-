package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdvb implements zzdvz {
    private static final Pattern zza = Pattern.compile("Received error HTTP response code: (.*)");
    private final zzdub zzb;
    private final zzfwn zzc;
    private final zzfai zzd;
    private final ScheduledExecutorService zze;
    private final zzdzx zzf;
    private final zzffy zzg;
    private final Context zzh;

    public zzdvb(Context context, zzfai zzfaiVar, zzdub zzdubVar, zzfwn zzfwnVar, ScheduledExecutorService scheduledExecutorService, zzdzx zzdzxVar, zzffy zzffyVar) {
        this.zzh = context;
        this.zzd = zzfaiVar;
        this.zzb = zzdubVar;
        this.zzc = zzfwnVar;
        this.zze = scheduledExecutorService;
        this.zzf = zzdzxVar;
        this.zzg = zzffyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdvz
    public final zzfwm zzb(zzbue zzbueVar) {
        zzfwm zzfwmVarZzb = this.zzb.zzb(zzbueVar);
        zzffn zzffnVarZza = zzffm.zza(this.zzh, 11);
        zzffx.zzd(zzfwmVarZzb, zzffnVarZza);
        zzfwm zzfwmVarZzm = zzfwc.zzm(zzfwmVarZzb, new zzfvj() { // from class: com.google.android.gms.internal.ads.zzduy
            @Override // com.google.android.gms.internal.ads.zzfvj
            public final zzfwm zza(Object obj) {
                return this.zza.zzc((InputStream) obj);
            }
        }, this.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzfl)).booleanValue()) {
            zzfwmVarZzm = zzfwc.zzf(zzfwc.zzn(zzfwmVarZzm, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzfm)).intValue(), TimeUnit.SECONDS, this.zze), TimeoutException.class, new zzfvj() { // from class: com.google.android.gms.internal.ads.zzduz
                @Override // com.google.android.gms.internal.ads.zzfvj
                public final zzfwm zza(Object obj) {
                    return zzfwc.zzg(new zzdtx(5));
                }
            }, zzcae.zzf);
        }
        zzffx.zza(zzfwmVarZzm, this.zzg, zzffnVarZza);
        zzfwc.zzq(zzfwmVarZzm, new zzdva(this), zzcae.zzf);
        return zzfwmVarZzm;
    }

    public final /* synthetic */ zzfwm zzc(InputStream inputStream) throws Exception {
        return zzfwc.zzh(new zzezz(new zzezw(this.zzd), zzezy.zza(new InputStreamReader(inputStream))));
    }
}
