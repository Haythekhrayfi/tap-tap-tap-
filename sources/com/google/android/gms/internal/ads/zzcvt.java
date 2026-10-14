package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcvt extends zzdaq implements zzcvk {
    private final ScheduledExecutorService zzb;
    private ScheduledFuture zzc;
    private boolean zzd;

    public zzcvt(zzcvs zzcvsVar, Set set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.zzd = false;
        this.zzb = scheduledExecutorService;
        zzm(zzcvsVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzcvk
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzp(new zzdap() { // from class: com.google.android.gms.internal.ads.zzcvm
            @Override // com.google.android.gms.internal.ads.zzdap
            public final void zza(Object obj) {
                ((zzcvk) obj).zza(zzeVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvk
    public final void zzb() {
        zzp(new zzdap() { // from class: com.google.android.gms.internal.ads.zzcvo
            @Override // com.google.android.gms.internal.ads.zzdap
            public final void zza(Object obj) {
                ((zzcvk) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvk
    public final void zzc(final zzdev zzdevVar) {
        if (this.zzd) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        zzp(new zzdap() { // from class: com.google.android.gms.internal.ads.zzcvl
            @Override // com.google.android.gms.internal.ads.zzdap
            public final void zza(Object obj) {
                ((zzcvk) obj).zzc(zzdevVar);
            }
        });
    }

    public final /* synthetic */ void zzd() {
        synchronized (this) {
            zzbzr.zzg("Timeout waiting for show call succeed to be called.");
            zzc(new zzdev("Timeout for show call succeed."));
            this.zzd = true;
        }
    }

    public final synchronized void zze() {
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public final void zzf() {
        this.zzc = this.zzb.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcvn
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd();
            }
        }, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzjp)).intValue(), TimeUnit.MILLISECONDS);
    }
}
