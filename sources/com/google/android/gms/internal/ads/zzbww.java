package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes2.dex */
final class zzbww {
    private final Clock zza;
    private final com.google.android.gms.ads.internal.util.zzg zzb;
    private final zzbxw zzc;

    public zzbww(Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzbxw zzbxwVar) {
        this.zza = clock;
        this.zzb = zzgVar;
        this.zzc = zzbxwVar;
    }

    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzar)).booleanValue()) {
            this.zzc.zzt();
        }
    }

    public final void zzb(int i10, long j10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzaq)).booleanValue()) {
            return;
        }
        if (j10 - this.zzb.zzf() < 0) {
            com.google.android.gms.ads.internal.util.zze.zza("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzar)).booleanValue()) {
            this.zzb.zzK(i10);
        } else {
            this.zzb.zzK(-1);
        }
        this.zzb.zzL(j10);
        zza();
    }
}
