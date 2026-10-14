package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class zzjp implements Runnable {
    public final /* synthetic */ zzjr zza;

    public zzjp(zzjr zzjrVar) {
        this.zza = zzjrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjs zzjsVar = this.zza.zza;
        Context contextZzau = zzjsVar.zzs.zzau();
        this.zza.zza.zzs.zzaw();
        zzjs.zzo(zzjsVar, new ComponentName(contextZzau, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
