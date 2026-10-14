package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzaqi implements zzfke {
    public final /* synthetic */ zzfjb zza;

    public zzaqi(zzfjb zzfjbVar) {
        this.zza = zzfjbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfke
    public final void zza(int i10, long j10) {
        this.zza.zzd(i10, System.currentTimeMillis() - j10);
    }

    @Override // com.google.android.gms.internal.ads.zzfke
    public final void zzb(int i10, long j10, String str) {
        this.zza.zze(i10, System.currentTimeMillis() - j10, str);
    }
}
