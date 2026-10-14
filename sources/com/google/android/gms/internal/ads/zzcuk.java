package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcuk {
    private final zzfel zza;
    private final zzbzx zzb;
    private final ApplicationInfo zzc;
    private final String zzd;
    private final List zze;
    private final PackageInfo zzf;
    private final zzgvy zzg;
    private final String zzh;
    private final zzerb zzi;
    private final com.google.android.gms.ads.internal.util.zzg zzj;
    private final zzfai zzk;

    public zzcuk(zzfel zzfelVar, zzbzx zzbzxVar, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, zzgvy zzgvyVar, com.google.android.gms.ads.internal.util.zzg zzgVar, String str2, zzerb zzerbVar, zzfai zzfaiVar) {
        this.zza = zzfelVar;
        this.zzb = zzbzxVar;
        this.zzc = applicationInfo;
        this.zzd = str;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = zzgvyVar;
        this.zzh = str2;
        this.zzi = zzerbVar;
        this.zzj = zzgVar;
        this.zzk = zzfaiVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ zzbue zza(zzfwm zzfwmVar) throws Exception {
        return new zzbue((Bundle) zzfwmVar.get(), this.zzb, this.zzc, this.zzd, this.zze, this.zzf, (String) ((zzfwm) this.zzg.zzb()).get(), this.zzh, null, null, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzgV)).booleanValue() && this.zzj.zzP(), this.zzk.zzb());
    }

    public final zzfwm zzb() {
        zzfel zzfelVar = this.zza;
        return zzfdv.zzc(this.zzi.zza(new Bundle()), zzfef.SIGNALS, zzfelVar).zza();
    }

    public final zzfwm zzc() {
        final zzfwm zzfwmVarZzb = zzb();
        return this.zza.zza(zzfef.REQUEST_PARCEL, zzfwmVarZzb, (zzfwm) this.zzg.zzb()).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzcuj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zza(zzfwmVarZzb);
            }
        }).zza();
    }
}
