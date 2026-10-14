package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzerd implements zzeqx {
    public final boolean zza;
    public final boolean zzb;
    public final String zzc;
    public final boolean zzd;
    public final boolean zze;
    public final boolean zzf;
    public final String zzg;
    public final ArrayList zzh;

    @Nullable
    public final String zzi;

    @Nullable
    public final String zzj;
    public final String zzk;
    public final boolean zzl;
    public final String zzm;
    public final long zzn;
    public final boolean zzo;

    public zzerd(boolean z10, boolean z11, String str, boolean z12, boolean z13, boolean z14, String str2, ArrayList arrayList, @Nullable String str3, @Nullable String str4, String str5, boolean z15, String str6, long j10, boolean z16) {
        this.zza = z10;
        this.zzb = z11;
        this.zzc = str;
        this.zzd = z12;
        this.zze = z13;
        this.zzf = z14;
        this.zzg = str2;
        this.zzh = arrayList;
        this.zzi = str3;
        this.zzj = str4;
        this.zzk = str5;
        this.zzl = z15;
        this.zzm = str6;
        this.zzn = j10;
        this.zzo = z16;
    }

    @Override // com.google.android.gms.internal.ads.zzeqx
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putBoolean("cog", this.zza);
        bundle.putBoolean("coh", this.zzb);
        bundle.putString("gl", this.zzc);
        bundle.putBoolean("simulator", this.zzd);
        bundle.putBoolean("is_latchsky", this.zze);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzjC)).booleanValue()) {
            bundle.putBoolean("is_sidewinder", this.zzf);
        }
        bundle.putString("hl", this.zzg);
        if (!this.zzh.isEmpty()) {
            bundle.putStringArrayList("hl_list", this.zzh);
        }
        bundle.putString("mv", this.zzi);
        bundle.putString("submodel", this.zzm);
        Bundle bundleZza = zzfat.zza(bundle, "device");
        bundle.putBundle("device", bundleZza);
        bundleZza.putString("build", this.zzk);
        bundleZza.putLong("remaining_data_partition_space", this.zzn);
        Bundle bundleZza2 = zzfat.zza(bundleZza, "browser");
        bundleZza.putBundle("browser", bundleZza2);
        bundleZza2.putBoolean("is_browser_custom_tabs_capable", this.zzl);
        if (!TextUtils.isEmpty(this.zzj)) {
            Bundle bundleZza3 = zzfat.zza(bundleZza, "play_store");
            bundleZza.putBundle("play_store", bundleZza3);
            bundleZza3.putString("package_version", this.zzj);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzjO)).booleanValue()) {
            bundle.putBoolean("is_bstar", this.zzo);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzjM)).booleanValue()) {
            zzfat.zzg(bundle, "gotmt_l", true, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzjJ)).booleanValue());
            zzfat.zzg(bundle, "gotmt_i", true, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzjI)).booleanValue());
        }
    }
}
