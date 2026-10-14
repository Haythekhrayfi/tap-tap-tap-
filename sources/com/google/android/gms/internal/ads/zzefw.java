package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzefw implements zzfvj {
    private final zzfel zza;
    private final zzcvi zzb;
    private final zzfgn zzc;
    private final zzfgr zzd;
    private final Executor zze;
    private final ScheduledExecutorService zzf;
    private final zzcrg zzg;
    private final zzefr zzh;
    private final zzech zzi;
    private final Context zzj;
    private final zzffy zzk;

    public zzefw(Context context, zzfel zzfelVar, zzefr zzefrVar, zzcvi zzcviVar, zzfgn zzfgnVar, zzfgr zzfgrVar, zzcrg zzcrgVar, Executor executor, ScheduledExecutorService scheduledExecutorService, zzech zzechVar, zzffy zzffyVar) {
        this.zzj = context;
        this.zza = zzfelVar;
        this.zzh = zzefrVar;
        this.zzb = zzcviVar;
        this.zzc = zzfgnVar;
        this.zzd = zzfgrVar;
        this.zzg = zzcrgVar;
        this.zze = executor;
        this.zzf = scheduledExecutorService;
        this.zzi = zzechVar;
        this.zzk = zzffyVar;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004e  */
    @Override // com.google.android.gms.internal.ads.zzfvj
    public final /* synthetic */ zzfwm zza(Object obj) throws Exception {
        int i10;
        final zzezz zzezzVar = (zzezz) obj;
        String strZza = "No fill.";
        String str = true != ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzfk)).booleanValue() ? "No ad config." : "No fill.";
        int i11 = zzezzVar.zzb.zzb.zze;
        if (i11 == 0) {
            strZza = str;
        } else if (i11 < 200 || i11 >= 300) {
            strZza = (i11 < 300 || i11 >= 400) ? android.support.v4.media.a.a("Received error HTTP response code: ", i11) : "No location header to follow redirect or too many redirects.";
        } else if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzfj)).booleanValue()) {
            strZza = str;
        }
        zzezq zzezqVar = zzezzVar.zzb.zzb;
        zzezp zzezpVar = zzezqVar.zzi;
        if (zzezpVar != null) {
            strZza = zzezpVar.zza();
        }
        this.zzi.zzh(zzezqVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzhR)).booleanValue() && (i10 = zzezzVar.zzb.zzb.zze) != 0 && (i10 < 200 || i10 >= 300)) {
            return zzfwc.zzg(new zzefu(3, strZza));
        }
        zzfdq zzfdqVarZza = zzfdv.zzc(zzfwc.zzg(new zzefu(3, strZza)), zzfef.RENDER_CONFIG_INIT, this.zza).zza();
        String str2 = zzezzVar.zzb.zzb.zzm;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzdj)).booleanValue() || TextUtils.isEmpty(str2)) {
            for (zzezn zzeznVar : zzezzVar.zzb.zza) {
                this.zzi.zzd(zzeznVar);
                Iterator it = zzeznVar.zza.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        this.zzi.zze(zzeznVar, 0L, zzfbi.zzd(1, null, null));
                        break;
                    }
                    zzecc zzeccVarZza = this.zzg.zza(zzeznVar.zzb, (String) it.next());
                    if (zzeccVarZza != null && zzeccVarZza.zzb(zzezzVar, zzeznVar)) {
                        break;
                    }
                }
            }
        } else {
            this.zzi.zzg(str2, zzezzVar.zzb.zza);
        }
        this.zzb.zzm(new zzcne(zzezzVar, this.zzd, this.zzc), this.zze);
        int i12 = 0;
        for (final zzezn zzeznVar2 : zzezzVar.zzb.zza) {
            for (String str3 : zzeznVar2.zza) {
                final zzecc zzeccVarZza2 = this.zzg.zza(zzeznVar2.zzb, str3);
                if (zzeccVarZza2 != null && zzeccVarZza2.zzb(zzezzVar, zzeznVar2)) {
                    zzfdqVarZza = this.zza.zzb(zzfef.RENDER_CONFIG_WATERFALL, zzfdqVarZza).zzh("render-config-" + i12 + "-" + str3).zzc(Throwable.class, new zzfvj() { // from class: com.google.android.gms.internal.ads.zzefv
                        @Override // com.google.android.gms.internal.ads.zzfvj
                        public final zzfwm zza(Object obj2) {
                            return this.zza.zzb(zzeznVar2, zzezzVar, zzeccVarZza2, (Throwable) obj2);
                        }
                    }).zza();
                    break;
                }
            }
            i12++;
        }
        return zzfdqVarZza;
    }

    public final /* synthetic */ zzfwm zzb(zzezn zzeznVar, zzezz zzezzVar, zzecc zzeccVar, Throwable th) throws Exception {
        zzffn zzffnVarZza = zzffm.zza(this.zzj, 12);
        zzffnVarZza.zzd(zzeznVar.zzF);
        zzffnVarZza.zzh();
        zzefr zzefrVar = this.zzh;
        zzfwm zzfwmVarZzn = zzfwc.zzn(zzeccVar.zza(zzezzVar, zzeznVar), zzeznVar.zzS, TimeUnit.MILLISECONDS, this.zzf);
        zzefrVar.zze(zzezzVar, zzeznVar, zzfwmVarZzn, this.zzc);
        zzffx.zza(zzfwmVarZzn, this.zzk, zzffnVarZza);
        return zzfwmVarZzn;
    }
}
