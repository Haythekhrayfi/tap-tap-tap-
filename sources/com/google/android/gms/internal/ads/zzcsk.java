package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcsk {
    private final zzdvg zza;
    private final zzfai zzb;
    private final zzfel zzc;
    private final zzcmh zzd;
    private final zzefw zze;
    private final zzdal zzf;
    private zzezz zzg;
    private final zzdwl zzh;
    private final zzcuk zzi;
    private final Executor zzj;
    private final zzdvx zzk;
    private final zzech zzl;
    private final zzdxb zzm;
    private final zzdxi zzn;

    public zzcsk(zzdvg zzdvgVar, zzfai zzfaiVar, zzfel zzfelVar, zzcmh zzcmhVar, zzefw zzefwVar, zzdal zzdalVar, zzezz zzezzVar, zzdwl zzdwlVar, zzcuk zzcukVar, Executor executor, zzdvx zzdvxVar, zzech zzechVar, zzdxb zzdxbVar, zzdxi zzdxiVar) {
        this.zza = zzdvgVar;
        this.zzb = zzfaiVar;
        this.zzc = zzfelVar;
        this.zzd = zzcmhVar;
        this.zze = zzefwVar;
        this.zzf = zzdalVar;
        this.zzg = zzezzVar;
        this.zzh = zzdwlVar;
        this.zzi = zzcukVar;
        this.zzj = executor;
        this.zzk = zzdvxVar;
        this.zzl = zzechVar;
        this.zzm = zzdxbVar;
        this.zzn = zzdxiVar;
    }

    public final com.google.android.gms.ads.internal.client.zze zza(Throwable th) {
        return zzfbi.zzb(th, this.zzl);
    }

    public final zzdal zzc() {
        return this.zzf;
    }

    public final /* synthetic */ zzezz zzd(zzezz zzezzVar) throws Exception {
        this.zzd.zza(zzezzVar);
        return zzezzVar;
    }

    public final zzfwm zze(final zzfcb zzfcbVar) {
        zzfdq zzfdqVarZza = this.zzc.zzb(zzfef.GET_CACHE_KEY, this.zzi.zzc()).zzf(new zzfvj() { // from class: com.google.android.gms.internal.ads.zzcsh
            @Override // com.google.android.gms.internal.ads.zzfvj
            public final zzfwm zza(Object obj) {
                return this.zza.zzf(zzfcbVar, (zzbue) obj);
            }
        }).zza();
        zzfwc.zzq(zzfdqVarZza, new zzcsi(this), this.zzj);
        return zzfdqVarZza;
    }

    public final /* synthetic */ zzfwm zzf(zzfcb zzfcbVar, zzbue zzbueVar) throws Exception {
        zzbueVar.zzi = zzfcbVar;
        return this.zzh.zza(zzbueVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ zzfwm zzg(zzfwm zzfwmVar, zzfwm zzfwmVar2, zzfwm zzfwmVar3) throws Exception {
        return this.zzn.zzc((zzbue) zzfwmVar.get(), (JSONObject) zzfwmVar2.get(), (zzbuh) zzfwmVar3.get());
    }

    public final zzfwm zzh(zzbue zzbueVar) {
        zzfdq zzfdqVarZza = this.zzc.zzb(zzfef.NOTIFY_CACHE_HIT, this.zzh.zzg(zzbueVar)).zza();
        zzfwc.zzq(zzfdqVarZza, new zzcsj(this), this.zzj);
        return zzfdqVarZza;
    }

    public final zzfwm zzi(zzfwm zzfwmVar) {
        zzfec zzfecVarZzf = this.zzc.zzb(zzfef.RENDERER, zzfwmVar).zze(new zzfdo() { // from class: com.google.android.gms.internal.ads.zzcsg
            @Override // com.google.android.gms.internal.ads.zzfdo
            public final Object zza(Object obj) throws Exception {
                zzezz zzezzVar = (zzezz) obj;
                this.zza.zzd(zzezzVar);
                return zzezzVar;
            }
        }).zzf(this.zze);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzfl)).booleanValue()) {
            zzfecVarZzf = zzfecVarZzf.zzi(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzfm)).intValue(), TimeUnit.SECONDS);
        }
        return zzfecVarZzf.zza();
    }

    public final zzfwm zzj() {
        com.google.android.gms.ads.internal.client.zzl zzlVar = this.zzb.zzd;
        if (zzlVar.zzx == null && zzlVar.zzs == null) {
            return zzk(this.zzi.zzc());
        }
        zzfel zzfelVar = this.zzc;
        return zzfdv.zzc(this.zza.zza(), zzfef.PRELOADED_LOADER, zzfelVar).zza();
    }

    public final zzfwm zzk(final zzfwm zzfwmVar) {
        zzfec zzfecVarZzf;
        zzezz zzezzVar = this.zzg;
        if (zzezzVar != null) {
            zzfecVarZzf = zzfdv.zzc(zzfwc.zzh(zzezzVar), zzfef.SERVER_TRANSACTION, this.zzc);
        } else {
            com.google.android.gms.ads.internal.zzt.zzc().zzj();
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzjT)).booleanValue() || ((Boolean) zzbdk.zzb.zze()).booleanValue()) {
                zzfec zzfecVarZzb = this.zzc.zzb(zzfef.SERVER_TRANSACTION, zzfwmVar);
                final zzdvx zzdvxVar = this.zzk;
                zzfecVarZzf = zzfecVarZzb.zzf(new zzfvj() { // from class: com.google.android.gms.internal.ads.zzcsf
                    @Override // com.google.android.gms.internal.ads.zzfvj
                    public final zzfwm zza(Object obj) {
                        return zzdvxVar.zzb((zzbue) obj);
                    }
                });
            } else {
                final zzdxb zzdxbVar = this.zzm;
                final zzfwm zzfwmVarZzm = zzfwc.zzm(zzfwmVar, new zzfvj() { // from class: com.google.android.gms.internal.ads.zzcsb
                    @Override // com.google.android.gms.internal.ads.zzfvj
                    public final zzfwm zza(Object obj) {
                        return zzdxbVar.zza((zzbue) obj);
                    }
                }, this.zzj);
                zzfec zzfecVarZzb2 = this.zzc.zzb(zzfef.BUILD_URL, zzfwmVarZzm);
                final zzdwl zzdwlVar = this.zzh;
                final zzfdq zzfdqVarZza = zzfecVarZzb2.zzf(new zzfvj() { // from class: com.google.android.gms.internal.ads.zzcsc
                    @Override // com.google.android.gms.internal.ads.zzfvj
                    public final zzfwm zza(Object obj) {
                        return zzdwlVar.zzb((JSONObject) obj);
                    }
                }).zza();
                zzfecVarZzf = this.zzc.zza(zzfef.SERVER_TRANSACTION, zzfwmVar, zzfwmVarZzm, zzfdqVarZza).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzcsd
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.zza.zzg(zzfwmVar, zzfwmVarZzm, zzfdqVarZza);
                    }
                }).zzf(new zzfvj() { // from class: com.google.android.gms.internal.ads.zzcse
                    @Override // com.google.android.gms.internal.ads.zzfvj
                    public final zzfwm zza(Object obj) {
                        return (zzfwm) obj;
                    }
                });
            }
        }
        return zzfecVarZzf.zza();
    }

    public final void zzl(zzezz zzezzVar) {
        this.zzg = zzezzVar;
    }
}
