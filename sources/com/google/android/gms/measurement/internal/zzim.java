package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
final class zzim implements Runnable {
    public final /* synthetic */ Bundle zza;
    public final /* synthetic */ zzik zzb;
    public final /* synthetic */ zzik zzc;
    public final /* synthetic */ long zzd;
    public final /* synthetic */ zzis zze;

    public zzim(zzis zzisVar, Bundle bundle, zzik zzikVar, zzik zzikVar2, long j10) {
        this.zze = zzisVar;
        this.zza = bundle;
        this.zzb = zzikVar;
        this.zzc = zzikVar2;
        this.zzd = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzis.zzp(this.zze, this.zza, this.zzb, this.zzc, this.zzd);
    }
}
