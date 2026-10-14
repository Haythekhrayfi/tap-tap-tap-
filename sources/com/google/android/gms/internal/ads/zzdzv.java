package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdzv implements zzcwu, zzcvj {
    private static final Object zza = new Object();
    private static int zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;
    private final zzeaf zzd;

    public zzdzv(zzeaf zzeafVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzd = zzeafVar;
        this.zzc = zzgVar;
    }

    private final void zzb(boolean z10) {
        int i10;
        int iIntValue;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzfW)).booleanValue() && !this.zzc.zzP()) {
            Object obj = zza;
            synchronized (obj) {
                i10 = zzb;
                iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzfX)).intValue();
            }
            if (i10 >= iIntValue) {
                return;
            }
            this.zzd.zzd(z10);
            synchronized (obj) {
                zzb++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvj
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzb(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcwu
    public final void zzn() {
        zzb(true);
    }
}
