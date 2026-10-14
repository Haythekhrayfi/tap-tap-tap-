package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
final class zzgn implements Callable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ zzgq zzb;

    public zzgn(zzgq zzgqVar, String str) {
        this.zzb = zzgqVar;
        this.zza = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        this.zzb.zza.zzA();
        return this.zzb.zza.zzi().zzu(this.zza);
    }
}
