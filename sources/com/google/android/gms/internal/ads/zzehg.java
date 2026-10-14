package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdError;

/* JADX INFO: loaded from: classes2.dex */
final class zzehg implements zzcwp {
    public boolean zza = false;
    public final /* synthetic */ zzecf zzb;
    public final /* synthetic */ zzcaj zzc;
    public final /* synthetic */ zzehh zzd;

    public zzehg(zzehh zzehhVar, zzecf zzecfVar, zzcaj zzcajVar) {
        this.zzd = zzehhVar;
        this.zzb = zzecfVar;
        this.zzc = zzcajVar;
    }

    private final synchronized void zze(com.google.android.gms.ads.internal.client.zze zzeVar) {
        int i10 = 1;
        if (true == ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzfi)).booleanValue()) {
            i10 = 3;
        }
        this.zzc.zze(new zzecg(i10, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcwp
    public final synchronized void zza(int i10) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(new com.google.android.gms.ads.internal.client.zze(i10, zzehh.zze(this.zzb.zza, i10), AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzcwp
    public final synchronized void zzb(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcwp
    public final synchronized void zzc(int i10, String str) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        if (str == null) {
            str = zzehh.zze(this.zzb.zza, i10);
        }
        zze(new com.google.android.gms.ads.internal.client.zze(i10, str, AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzcwp
    public final synchronized void zzd() {
        this.zzc.zzd(null);
    }
}
