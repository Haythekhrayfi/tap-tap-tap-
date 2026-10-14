package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.AdFormat;
import com.yandex.metrica.plugins.PluginErrorDetails;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzffy implements Runnable {
    private final zzfgb zzb;
    private String zzc;
    private String zzd;
    private zzezy zze;
    private com.google.android.gms.ads.internal.client.zze zzf;
    private Future zzg;
    private final List zza = new ArrayList();
    private int zzh = 2;

    public zzffy(zzfgb zzfgbVar) {
        this.zzb = zzfgbVar;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        zzg();
    }

    public final synchronized zzffy zza(zzffn zzffnVar) {
        if (((Boolean) zzbcy.zzc.zze()).booleanValue()) {
            List list = this.zza;
            zzffnVar.zzi();
            list.add(zzffnVar);
            Future future = this.zzg;
            if (future != null) {
                future.cancel(false);
            }
            this.zzg = zzcae.zzd.schedule(this, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzin)).intValue(), TimeUnit.MILLISECONDS);
        }
        return this;
    }

    public final synchronized zzffy zzb(String str) {
        if (((Boolean) zzbcy.zzc.zze()).booleanValue() && zzffx.zze(str)) {
            this.zzc = str;
        }
        return this;
    }

    public final synchronized zzffy zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbcy.zzc.zze()).booleanValue()) {
            this.zzf = zzeVar;
        }
        return this;
    }

    public final synchronized zzffy zzd(ArrayList arrayList) {
        if (((Boolean) zzbcy.zzc.zze()).booleanValue()) {
            if (arrayList.contains("banner") || arrayList.contains(AdFormat.BANNER.name())) {
                this.zzh = 3;
            } else if (arrayList.contains("interstitial") || arrayList.contains(AdFormat.INTERSTITIAL.name())) {
                this.zzh = 4;
            } else if (arrayList.contains(PluginErrorDetails.Platform.NATIVE) || arrayList.contains(AdFormat.NATIVE.name())) {
                this.zzh = 8;
            } else if (arrayList.contains("rewarded") || arrayList.contains(AdFormat.REWARDED.name())) {
                this.zzh = 5;
            } else if (arrayList.contains("app_open_ad")) {
                this.zzh = 7;
            } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(AdFormat.REWARDED_INTERSTITIAL.name())) {
                this.zzh = 6;
            }
        }
        return this;
    }

    public final synchronized zzffy zze(String str) {
        if (((Boolean) zzbcy.zzc.zze()).booleanValue()) {
            this.zzd = str;
        }
        return this;
    }

    public final synchronized zzffy zzf(zzezy zzezyVar) {
        if (((Boolean) zzbcy.zzc.zze()).booleanValue()) {
            this.zze = zzezyVar;
        }
        return this;
    }

    public final synchronized void zzg() {
        if (((Boolean) zzbcy.zzc.zze()).booleanValue()) {
            Future future = this.zzg;
            if (future != null) {
                future.cancel(false);
            }
            for (zzffn zzffnVar : this.zza) {
                int i10 = this.zzh;
                if (i10 != 2) {
                    zzffnVar.zzm(i10);
                }
                if (!TextUtils.isEmpty(this.zzc)) {
                    zzffnVar.zze(this.zzc);
                }
                if (!TextUtils.isEmpty(this.zzd) && !zzffnVar.zzk()) {
                    zzffnVar.zzd(this.zzd);
                }
                zzezy zzezyVar = this.zze;
                if (zzezyVar != null) {
                    zzffnVar.zzb(zzezyVar);
                } else {
                    com.google.android.gms.ads.internal.client.zze zzeVar = this.zzf;
                    if (zzeVar != null) {
                        zzffnVar.zza(zzeVar);
                    }
                }
                this.zzb.zzb(zzffnVar.zzl());
            }
            this.zza.clear();
        }
    }

    public final synchronized zzffy zzh(int i10) {
        if (((Boolean) zzbcy.zzc.zze()).booleanValue()) {
            this.zzh = i10;
        }
        return this;
    }
}
