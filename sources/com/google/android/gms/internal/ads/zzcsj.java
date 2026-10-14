package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
final class zzcsj implements zzfvy {
    public final /* synthetic */ zzcsk zza;

    public zzcsj(zzcsk zzcskVar) {
        this.zza = zzcskVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvy
    public final void zza(Throwable th) {
        this.zza.zzf.zzh(false);
    }

    @Override // com.google.android.gms.internal.ads.zzfvy
    public final /* bridge */ /* synthetic */ void zzb(@NullableDecl Object obj) {
        this.zza.zzf.zzh(true);
    }
}
