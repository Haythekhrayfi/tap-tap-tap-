package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzepo implements zzeqx {
    private zzfme zza;
    private zzfme zzb;
    private boolean zzc;
    private boolean zzd;
    private final boolean zze = false;
    private final boolean zzf;

    public zzepo(zzfme zzfmeVar, zzfme zzfmeVar2, boolean z10, boolean z11, boolean z12) {
        this.zza = zzfmeVar;
        this.zzb = zzfmeVar2;
        this.zzc = z10;
        this.zzd = z11;
        this.zzf = z12;
    }

    public zzepo(boolean z10) {
        this.zzf = z10;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0028  */
    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    /* JADX WARN: Code duplicated, block: B:15:0x0042  */
    /* JADX WARN: Code duplicated, block: B:20:0x006e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:24:0x0084  */
    /* JADX WARN: Code duplicated, block: B:26:0x008c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    @Override // com.google.android.gms.internal.ads.zzeqx
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.zze) {
            return;
        }
        Bundle bundleZza = zzfat.zza(bundle, "pii");
        if (!this.zzf) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcC)).booleanValue()) {
                if (this.zza.zzc()) {
                    bundleZza.putString("paidv1_id_android", this.zza.zzb());
                    bundleZza.putLong("paidv1_creation_time_android", this.zza.zza());
                }
            } else if (this.zzf) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcE)).booleanValue()) {
                    if (this.zza.zzc()) {
                        bundleZza.putString("paidv1_id_android", this.zza.zzb());
                        bundleZza.putLong("paidv1_creation_time_android", this.zza.zza());
                    }
                }
            }
        } else if (this.zzf) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcE)).booleanValue()) {
                if (this.zza.zzc()) {
                    bundleZza.putString("paidv1_id_android", this.zza.zzb());
                    bundleZza.putLong("paidv1_creation_time_android", this.zza.zza());
                }
            }
        }
        if (!this.zzf) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcD)).booleanValue()) {
                if (this.zzb.zzc()) {
                    bundleZza.putString("paidv2_id_android", this.zzb.zzb());
                    bundleZza.putLong("paidv2_creation_time_android", this.zzb.zza());
                }
                bundleZza.putBoolean("paidv2_pub_option_android", this.zzc);
                bundleZza.putBoolean("paidv2_user_option_android", this.zzd);
            } else if (this.zzf) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcF)).booleanValue()) {
                    if (this.zzb.zzc()) {
                        bundleZza.putString("paidv2_id_android", this.zzb.zzb());
                        bundleZza.putLong("paidv2_creation_time_android", this.zzb.zza());
                    }
                    bundleZza.putBoolean("paidv2_pub_option_android", this.zzc);
                    bundleZza.putBoolean("paidv2_user_option_android", this.zzd);
                }
            }
        } else if (this.zzf) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcF)).booleanValue()) {
                if (this.zzb.zzc()) {
                    bundleZza.putString("paidv2_id_android", this.zzb.zzb());
                    bundleZza.putLong("paidv2_creation_time_android", this.zzb.zza());
                }
                bundleZza.putBoolean("paidv2_pub_option_android", this.zzc);
                bundleZza.putBoolean("paidv2_user_option_android", this.zzd);
            }
        }
        if (bundleZza.isEmpty()) {
            return;
        }
        bundle.putBundle("pii", bundleZza);
    }
}
