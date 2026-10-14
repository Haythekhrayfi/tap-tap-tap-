package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
final class zzji implements Runnable {
    public final /* synthetic */ zzq zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ zzac zzc;
    public final /* synthetic */ zzac zzd;
    public final /* synthetic */ zzjs zze;

    public zzji(zzjs zzjsVar, boolean z10, zzq zzqVar, boolean z11, zzac zzacVar, zzac zzacVar2) {
        this.zze = zzjsVar;
        this.zza = zzqVar;
        this.zzb = z11;
        this.zzc = zzacVar;
        this.zzd = zzacVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjs zzjsVar = this.zze;
        zzee zzeeVar = zzjsVar.zzb;
        if (zzeeVar == null) {
            a.a(zzjsVar.zzs, "Discarding data. Failed to send conditional user property to service");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        this.zze.zzD(zzeeVar, this.zzb ? null : this.zzc, this.zza);
        this.zze.zzQ();
    }
}
