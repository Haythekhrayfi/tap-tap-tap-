package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzali implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ long zzb;
    public final /* synthetic */ zzalk zzc;

    public zzali(zzalk zzalkVar, String str, long j10) {
        this.zzc = zzalkVar;
        this.zza = str;
        this.zzb = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zza.zza(this.zza, this.zzb);
        zzalk zzalkVar = this.zzc;
        zzalkVar.zza.zzb(zzalkVar.toString());
    }
}
