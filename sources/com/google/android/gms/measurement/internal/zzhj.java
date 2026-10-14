package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes2.dex */
final class zzhj implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ Object zzc;
    public final /* synthetic */ long zzd;
    public final /* synthetic */ zzid zze;

    public zzhj(zzid zzidVar, String str, String str2, Object obj, long j10) {
        this.zze = zzidVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = obj;
        this.zzd = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zzY(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
