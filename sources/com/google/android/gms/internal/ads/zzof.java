package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzof {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;

    public final zzof zza(boolean z10) {
        this.zza = true;
        return this;
    }

    public final zzof zzb(boolean z10) {
        this.zzb = z10;
        return this;
    }

    public final zzof zzc(boolean z10) {
        this.zzc = z10;
        return this;
    }

    public final zzoh zzd() {
        if (this.zza || !(this.zzb || this.zzc)) {
            return new zzoh(this, null);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }
}
