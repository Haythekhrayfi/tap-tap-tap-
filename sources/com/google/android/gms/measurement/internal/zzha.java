package com.google.android.gms.measurement.internal;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
final class zzha implements zzei {
    public final /* synthetic */ zzfy zza;

    public zzha(zzhb zzhbVar, zzfy zzfyVar) {
        this.zza = zzfyVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzei
    public final boolean zza() {
        return this.zza.zzL() && Log.isLoggable(this.zza.zzay().zzq(), 3);
    }
}
