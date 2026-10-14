package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcmt implements zzcmj {
    private final Context zza;
    private final com.google.android.gms.ads.internal.util.zzg zzb = com.google.android.gms.ads.internal.zzt.zzo().zzh();

    public zzcmt(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzcmj
    public final void zza(Map map) {
        if (map.isEmpty()) {
            return;
        }
        String str = (String) map.get("gad_idless");
        if (str != null) {
            boolean z10 = Boolean.parseBoolean(str);
            map.remove("gad_idless");
            if (z10) {
                try {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcC)).booleanValue()) {
                        zzfmh.zzj(this.zza).zzk();
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcL)).booleanValue()) {
                        zzfmh.zzj(this.zza).zzl();
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcD)).booleanValue()) {
                        zzfmi.zzi(this.zza).zzj();
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcH)).booleanValue()) {
                            zzfmi.zzi(this.zza).zzk();
                        }
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcI)).booleanValue()) {
                            zzfmi.zzi(this.zza).zzl();
                        }
                    }
                } catch (IOException e10) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "SetAppMeasurementConsentConfig.run");
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzau)).booleanValue()) {
                this.zzb.zzH(z10);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzfW)).booleanValue() && z10) {
                    this.zza.deleteDatabase("OfflineUpload.db");
                }
            }
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzap)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzn().zzr(bundle);
        }
    }
}
