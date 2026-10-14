package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes2.dex */
final class zzdva implements zzfvy {
    public final /* synthetic */ zzdvb zza;

    public zzdva(zzdvb zzdvbVar) {
        this.zza = zzdvbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvy
    public final void zza(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzfW)).booleanValue()) {
            Matcher matcher = zzdvb.zza.matcher(th.getMessage());
            if (matcher.matches()) {
                this.zza.zzf.zzi(Integer.parseInt(matcher.group(1)));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfvy
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzezz zzezzVar = (zzezz) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzfW)).booleanValue()) {
            this.zza.zzf.zzi(zzezzVar.zzb.zzb.zze);
            this.zza.zzf.zzj(zzezzVar.zzb.zzb.zzf);
        }
    }
}
