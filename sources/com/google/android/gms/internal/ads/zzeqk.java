package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeqk implements zzeqx {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final Long zze;

    public zzeqk(String str, String str2, String str3, String str4, Long l10) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = l10;
    }

    @Override // com.google.android.gms.internal.ads.zzeqx
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzfat.zzc(bundle, "gmp_app_id", this.zza);
        zzfat.zzc(bundle, "fbs_aiid", this.zzb);
        zzfat.zzc(bundle, "fbs_aeid", this.zzc);
        zzfat.zzc(bundle, "apm_id_origin", this.zzd);
        Long l10 = this.zze;
        if (l10 != null) {
            bundle.putLong("sai_timeout", l10.longValue());
        }
    }
}
