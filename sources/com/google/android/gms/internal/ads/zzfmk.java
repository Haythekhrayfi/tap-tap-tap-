package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzfmk extends zzfuq {
    public Object zza;

    public zzfmk(Object obj) {
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzfuq
    public final String zza() {
        Object obj = this.zza;
        return obj == null ? "" : obj.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfuq
    public final void zzb() {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfuq
    public final boolean zzd(Object obj) {
        return super.zzd(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfuq
    public final boolean zze(Throwable th) {
        return super.zze(th);
    }
}
