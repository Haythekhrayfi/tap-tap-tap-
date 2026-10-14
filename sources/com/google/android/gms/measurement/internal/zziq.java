package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes2.dex */
final class zziq implements Runnable {
    public final /* synthetic */ zzik zza;
    public final /* synthetic */ long zzb;
    public final /* synthetic */ zzis zzc;

    public zziq(zzis zzisVar, zzik zzikVar, long j10) {
        this.zzc = zzisVar;
        this.zza = zzikVar;
        this.zzb = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzB(this.zza, false, this.zzb);
        zzis zzisVar = this.zzc;
        zzisVar.zza = null;
        zzisVar.zzs.zzt().zzG(null);
    }
}
