package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
final class zzdv extends zzch {
    private final com.google.android.gms.measurement.internal.zzgz zza;

    public zzdv(com.google.android.gms.measurement.internal.zzgz zzgzVar) {
        this.zza = zzgzVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final int zzd() {
        return System.identityHashCode(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final void zze(String str, String str2, Bundle bundle, long j10) {
        this.zza.onEvent(str, str2, bundle, j10);
    }
}
