package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzaqk implements Runnable {
    public final /* synthetic */ zzaql zza;

    public zzaqk(zzaql zzaqlVar) {
        this.zza = zzaqlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zza.zzo) {
            if (this.zza.zzp) {
                return;
            }
            this.zza.zzp = true;
            try {
                zzaql.zzj(this.zza);
            } catch (Exception e10) {
                this.zza.zzh.zzc(2023, -1L, e10);
            }
            synchronized (this.zza.zzo) {
                this.zza.zzp = false;
            }
        }
    }
}
