package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.ads.AdActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbzb {
    public final String zzf;
    private final com.google.android.gms.ads.internal.util.zzg zzj;
    public long zza = -1;
    public long zzb = -1;
    public int zzc = -1;
    public int zzd = -1;
    public long zze = 0;
    private final Object zzi = new Object();
    public int zzg = 0;
    public int zzh = 0;

    public zzbzb(String str, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzf = str;
        this.zzj = zzgVar;
    }

    private final void zzg() {
        if (((Boolean) zzbdl.zza.zze()).booleanValue()) {
            synchronized (this.zzi) {
                this.zzc--;
                this.zzd--;
            }
        }
    }

    public final Bundle zza(Context context, String str) {
        Bundle bundle;
        String str2;
        synchronized (this.zzi) {
            bundle = new Bundle();
            if (!this.zzj.zzP()) {
                bundle.putString("session_id", this.zzf);
            }
            bundle.putLong("basets", this.zzb);
            bundle.putLong("currts", this.zza);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.zzc);
            bundle.putInt("preqs_in_session", this.zzd);
            bundle.putLong("time_in_session", this.zze);
            bundle.putInt("pclick", this.zzg);
            bundle.putInt("pimp", this.zzh);
            Context contextZza = zzbus.zza(context);
            int identifier = contextZza.getResources().getIdentifier("Theme.Translucent", "style", "android");
            boolean z10 = false;
            if (identifier == 0) {
                str2 = "Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.";
            } else {
                try {
                    if (identifier == contextZza.getPackageManager().getActivityInfo(new ComponentName(contextZza.getPackageName(), AdActivity.CLASS_NAME), 0).theme) {
                        z10 = true;
                    } else {
                        zzbzr.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    zzbzr.zzj("Fail to fetch AdActivity theme");
                    str2 = "Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.";
                    zzbzr.zzi(str2);
                }
                bundle.putBoolean("support_transparent_background", z10);
            }
            zzbzr.zzi(str2);
            bundle.putBoolean("support_transparent_background", z10);
        }
        return bundle;
    }

    public final void zzb() {
        synchronized (this.zzi) {
            this.zzg++;
        }
    }

    public final void zzc() {
        synchronized (this.zzi) {
            this.zzh++;
        }
    }

    public final void zzd() {
        zzg();
    }

    public final void zze() {
        zzg();
    }

    public final void zzf(com.google.android.gms.ads.internal.client.zzl zzlVar, long j10) {
        Bundle bundle;
        synchronized (this.zzi) {
            long jZzd = this.zzj.zzd();
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
            if (this.zzb == -1) {
                if (jCurrentTimeMillis - jZzd > ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzaQ)).longValue()) {
                    this.zzd = -1;
                } else {
                    this.zzd = this.zzj.zzc();
                }
                this.zzb = j10;
            }
            this.zza = j10;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzdk)).booleanValue() && (bundle = zzlVar.zzc) != null && bundle.getInt("gw", 2) == 1) {
                return;
            }
            this.zzc++;
            int i10 = this.zzd + 1;
            this.zzd = i10;
            if (i10 == 0) {
                this.zze = 0L;
                this.zzj.zzD(jCurrentTimeMillis);
            } else {
                this.zze = jCurrentTimeMillis - this.zzj.zze();
            }
        }
    }
}
