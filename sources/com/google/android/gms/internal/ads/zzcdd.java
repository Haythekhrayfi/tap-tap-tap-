package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcdd extends com.google.android.gms.ads.internal.util.zzb {
    public final zzcca zza;
    public final zzcdl zzb;
    private final String zzc;
    private final String[] zzd;

    public zzcdd(zzcca zzccaVar, zzcdl zzcdlVar, String str, String[] strArr) {
        this.zza = zzccaVar;
        this.zzb = zzcdlVar;
        this.zzc = str;
        this.zzd = strArr;
        com.google.android.gms.ads.internal.zzt.zzy().zzb(this);
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        try {
            this.zzb.zzu(this.zzc, this.zzd);
        } finally {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcdc(this));
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final zzfwm zzb() {
        return (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbP)).booleanValue() && (this.zzb instanceof zzcdu)) ? zzcae.zze.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzcdb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzd();
            }
        }) : super.zzb();
    }

    public final /* synthetic */ Boolean zzd() throws Exception {
        return Boolean.valueOf(this.zzb.zzw(this.zzc, this.zzd, this));
    }

    public final String zze() {
        return this.zzc;
    }
}
