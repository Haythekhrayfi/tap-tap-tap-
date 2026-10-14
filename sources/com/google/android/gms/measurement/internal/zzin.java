package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes2.dex */
final class zzin implements Runnable {
    public final /* synthetic */ zzik zza;
    public final /* synthetic */ zzik zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ boolean zzd;
    public final /* synthetic */ zzis zze;

    public zzin(zzis zzisVar, zzik zzikVar, zzik zzikVar2, long j10, boolean z10) {
        this.zze = zzisVar;
        this.zza = zzikVar;
        this.zzb = zzikVar2;
        this.zzc = j10;
        this.zzd = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zzA(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
