package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzaqm implements Runnable {
    public final /* synthetic */ zzaqn zza;

    public zzaqm(zzaqn zzaqnVar) {
        this.zza = zzaqnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        if (this.zza.zzb != null) {
            return;
        }
        synchronized (zzaqn.zzc) {
            if (this.zza.zzb != null) {
                return;
            }
            boolean z10 = false;
            try {
                zBooleanValue = ((Boolean) zzbbm.zzci.zze()).booleanValue();
            } catch (IllegalStateException unused) {
                zBooleanValue = false;
            }
            if (zBooleanValue) {
                try {
                    zzaqn.zza = zzfld.zzb(this.zza.zze.zza, "ADSHIELD", null);
                } catch (Throwable unused2) {
                }
            }
            z10 = zBooleanValue;
            this.zza.zzb = Boolean.valueOf(z10);
            zzaqn.zzc.open();
        }
    }
}
