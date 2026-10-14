package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes2.dex */
final class zzev implements Runnable {
    public final /* synthetic */ boolean zza;
    public final /* synthetic */ zzew zzb;

    public zzev(zzew zzewVar, boolean z10) {
        this.zzb = zzewVar;
        this.zza = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzb.zzJ(this.zza);
    }
}
