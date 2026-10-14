package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdac implements zzcyb {
    private int zza = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbd)).intValue();

    @Override // com.google.android.gms.internal.ads.zzcyb
    public final synchronized void zzb(zzezz zzezzVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbe)).booleanValue()) {
            try {
                this.zza = zzezzVar.zzb.zzb.zzc;
            } catch (NullPointerException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyb
    public final void zzbA(zzbue zzbueVar) {
    }

    public final synchronized int zzc() {
        return this.zza;
    }
}
