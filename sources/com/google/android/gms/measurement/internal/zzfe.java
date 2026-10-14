package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import ch.qos.logback.classic.spi.CallerData;
import com.google.android.gms.common.stats.ConnectionTracker;

/* JADX INFO: loaded from: classes2.dex */
final class zzfe implements Runnable {
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzbr zza;
    public final /* synthetic */ ServiceConnection zzb;
    public final /* synthetic */ zzff zzc;

    public zzfe(zzff zzffVar, com.google.android.gms.internal.measurement.zzbr zzbrVar, ServiceConnection serviceConnection) {
        this.zzc = zzffVar;
        this.zza = zzbrVar;
        this.zzb = serviceConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzem zzemVarZzd;
        String str;
        zzff zzffVar = this.zzc;
        zzfg zzfgVar = zzffVar.zza;
        String str2 = zzffVar.zzb;
        com.google.android.gms.internal.measurement.zzbr zzbrVar = this.zza;
        ServiceConnection serviceConnection = this.zzb;
        zzfgVar.zza.zzaz().zzg();
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str2);
        Bundle bundle2 = null;
        try {
            Bundle bundleZzd = zzbrVar.zzd(bundle);
            if (bundleZzd == null) {
                zzfgVar.zza.zzay().zzd().zza("Install Referrer Service returned a null response");
            } else {
                bundle2 = bundleZzd;
            }
        } catch (Exception e10) {
            zzfgVar.zza.zzay().zzd().zzb("Exception occurred while retrieving the Install Referrer", e10.getMessage());
        }
        zzfgVar.zza.zzaz().zzg();
        zzfy.zzO();
        if (bundle2 != null) {
            long j10 = bundle2.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j10 == 0) {
                zzemVarZzd = zzfgVar.zza.zzay().zzk();
                str = "Service response is missing Install Referrer install timestamp";
            } else {
                String string = bundle2.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    zzemVarZzd = zzfgVar.zza.zzay().zzd();
                    str = "No referrer defined in Install Referrer response";
                } else {
                    zzfgVar.zza.zzay().zzj().zzb("InstallReferrer API result", string);
                    Bundle bundleZzs = zzfgVar.zza.zzv().zzs(Uri.parse(CallerData.NA.concat(string)));
                    if (bundleZzs == null) {
                        zzemVarZzd = zzfgVar.zza.zzay().zzd();
                        str = "No campaign params defined in Install Referrer result";
                    } else {
                        String string2 = bundleZzs.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j11 = bundle2.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                            if (j11 == 0) {
                                zzemVarZzd = zzfgVar.zza.zzay().zzd();
                                str = "Install Referrer is missing click timestamp for ad campaign";
                            } else {
                                bundleZzs.putLong("click_timestamp", j11);
                            }
                        }
                        if (j10 == zzfgVar.zza.zzm().zzd.zza()) {
                            zzfgVar.zza.zzay().zzj().zza("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (zzfgVar.zza.zzJ()) {
                            zzfgVar.zza.zzm().zzd.zzb(j10);
                            zzfgVar.zza.zzay().zzj().zzb("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            bundleZzs.putString("_cis", "referrer API v2");
                            zzfgVar.zza.zzq().zzF("auto", "_cmp", bundleZzs, str2);
                        }
                    }
                }
            }
            zzemVarZzd.zza(str);
        }
        ConnectionTracker.getInstance().unbindService(zzfgVar.zza.zzau(), serviceConnection);
    }
}
