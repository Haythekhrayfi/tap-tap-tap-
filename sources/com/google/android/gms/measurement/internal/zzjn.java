package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* JADX INFO: loaded from: classes2.dex */
final class zzjn implements Runnable {
    public final /* synthetic */ ComponentName zza;
    public final /* synthetic */ zzjr zzb;

    public zzjn(zzjr zzjrVar, ComponentName componentName) {
        this.zzb = zzjrVar;
        this.zza = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjs.zzo(this.zzb.zza, this.zza);
    }
}
