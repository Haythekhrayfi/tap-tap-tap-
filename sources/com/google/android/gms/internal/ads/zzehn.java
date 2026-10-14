package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class zzehn implements com.google.android.gms.ads.internal.zzf {
    public final AtomicBoolean zza = new AtomicBoolean(false);
    private final zzcve zzb;
    private final zzcvy zzc;
    private final zzdcw zzd;
    private final zzdco zze;
    private final zzcnx zzf;

    public zzehn(zzcve zzcveVar, zzcvy zzcvyVar, zzdcw zzdcwVar, zzdco zzdcoVar, zzcnx zzcnxVar) {
        this.zzb = zzcveVar;
        this.zzc = zzcvyVar;
        this.zzd = zzdcwVar;
        this.zze = zzdcoVar;
        this.zzf = zzcnxVar;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final synchronized void zza(View view) {
        if (this.zza.compareAndSet(false, true)) {
            this.zzf.zzl();
            this.zze.zza(view);
        }
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzb() {
        if (this.zza.get()) {
            this.zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzc() {
        if (this.zza.get()) {
            this.zzc.zza();
            this.zzd.zza();
        }
    }
}
