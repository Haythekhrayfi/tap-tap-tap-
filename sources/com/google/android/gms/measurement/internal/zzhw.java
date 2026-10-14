package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes2.dex */
final class zzhw implements Runnable {
    public final /* synthetic */ Boolean zza;
    public final /* synthetic */ zzid zzb;

    public zzhw(zzid zzidVar, Boolean bool) {
        this.zzb = zzidVar;
        this.zza = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzaa(this.zza, true);
    }
}
