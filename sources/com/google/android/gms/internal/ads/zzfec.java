package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfec {
    public final /* synthetic */ zzfed zza;
    private final Object zzb;
    private final String zzc;
    private final zzfwm zzd;
    private final List zze;
    private final zzfwm zzf;

    private zzfec(zzfed zzfedVar, Object obj, String str, zzfwm zzfwmVar, List list, zzfwm zzfwmVar2) {
        this.zza = zzfedVar;
        this.zzb = obj;
        this.zzc = str;
        this.zzd = zzfwmVar;
        this.zze = list;
        this.zzf = zzfwmVar2;
    }

    public final zzfdq zza() {
        Object obj = this.zzb;
        String strZzf = this.zzc;
        if (strZzf == null) {
            strZzf = this.zza.zzf(obj);
        }
        final zzfdq zzfdqVar = new zzfdq(obj, strZzf, this.zzf);
        this.zza.zzd.zza(zzfdqVar);
        zzfwm zzfwmVar = this.zzd;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzfdw
            @Override // java.lang.Runnable
            public final void run() {
                zzfec zzfecVar = this.zza;
                zzfecVar.zza.zzd.zzc(zzfdqVar);
            }
        };
        zzfwn zzfwnVar = zzcae.zzf;
        zzfwmVar.zzc(runnable, zzfwnVar);
        zzfwc.zzq(zzfdqVar, new zzfea(this, zzfdqVar), zzfwnVar);
        return zzfdqVar;
    }

    public final zzfec zzb(Object obj) {
        return this.zza.zzb(obj, zza());
    }

    public final zzfec zzc(Class cls, zzfvj zzfvjVar) {
        zzfed zzfedVar = this.zza;
        return new zzfec(zzfedVar, this.zzb, this.zzc, this.zzd, this.zze, zzfwc.zzf(this.zzf, cls, zzfvjVar, zzfedVar.zzb));
    }

    public final zzfec zzd(final zzfwm zzfwmVar) {
        return zzg(new zzfvj() { // from class: com.google.android.gms.internal.ads.zzfdx
            @Override // com.google.android.gms.internal.ads.zzfvj
            public final zzfwm zza(Object obj) {
                return zzfwmVar;
            }
        }, zzcae.zzf);
    }

    public final zzfec zze(final zzfdo zzfdoVar) {
        return zzf(new zzfvj() { // from class: com.google.android.gms.internal.ads.zzfdz
            @Override // com.google.android.gms.internal.ads.zzfvj
            public final zzfwm zza(Object obj) {
                return zzfwc.zzh(zzfdoVar.zza(obj));
            }
        });
    }

    public final zzfec zzf(zzfvj zzfvjVar) {
        return zzg(zzfvjVar, this.zza.zzb);
    }

    public final zzfec zzg(zzfvj zzfvjVar, Executor executor) {
        return new zzfec(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzfwc.zzm(this.zzf, zzfvjVar, executor));
    }

    public final zzfec zzh(String str) {
        return new zzfec(this.zza, this.zzb, str, this.zzd, this.zze, this.zzf);
    }

    public final zzfec zzi(long j10, TimeUnit timeUnit) {
        zzfed zzfedVar = this.zza;
        return new zzfec(zzfedVar, this.zzb, this.zzc, this.zzd, this.zze, zzfwc.zzn(this.zzf, j10, timeUnit, zzfedVar.zzc));
    }
}
