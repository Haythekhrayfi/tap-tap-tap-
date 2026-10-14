package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbmf extends zzcaq {
    private final Object zza = new Object();
    private final zzbmk zzb;
    private boolean zzc;

    public zzbmf(zzbmk zzbmkVar) {
        this.zzb = zzbmkVar;
    }

    public final void zzb() {
        synchronized (this.zza) {
            if (this.zzc) {
                return;
            }
            this.zzc = true;
            zzi(new zzbmc(this), new zzcam());
            zzi(new zzbmd(this), new zzbme(this));
        }
    }
}
