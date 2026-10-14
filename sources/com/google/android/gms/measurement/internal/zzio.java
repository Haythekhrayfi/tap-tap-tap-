package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes2.dex */
final class zzio implements Runnable {
    public final /* synthetic */ zzis zza;

    public zzio(zzis zzisVar) {
        this.zza = zzisVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzis zzisVar = this.zza;
        zzisVar.zza = zzisVar.zzh;
    }
}
