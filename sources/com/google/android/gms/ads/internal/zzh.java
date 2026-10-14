package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzfke;

/* JADX INFO: loaded from: classes.dex */
final class zzh implements zzfke {
    public final /* synthetic */ zzi zza;

    public zzh(zzi zziVar) {
        this.zza = zziVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfke
    public final void zza(int i10, long j10) {
        this.zza.zzi.zzd(i10, System.currentTimeMillis() - j10);
    }

    @Override // com.google.android.gms.internal.ads.zzfke
    public final void zzb(int i10, long j10, String str) {
        this.zza.zzi.zze(i10, System.currentTimeMillis() - j10, str);
    }
}
