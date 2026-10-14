package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinMediationProvider;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfeu {
    private final HashMap zza;
    private final zzffa zzb;

    private zzfeu() {
        HashMap map = new HashMap();
        this.zza = map;
        this.zzb = new zzffa(com.google.android.gms.ads.internal.zzt.zzB());
        map.put("new_csi", "1");
    }

    public static zzfeu zzb(String str) {
        zzfeu zzfeuVar = new zzfeu();
        zzfeuVar.zza.put("action", str);
        return zzfeuVar;
    }

    public static zzfeu zzc(String str) {
        zzfeu zzfeuVar = new zzfeu();
        zzfeuVar.zza.put("request_id", str);
        return zzfeuVar;
    }

    public final zzfeu zza(String str, String str2) {
        this.zza.put(str, str2);
        return this;
    }

    public final zzfeu zzd(String str) {
        this.zzb.zzb(str);
        return this;
    }

    public final zzfeu zze(String str, String str2) {
        this.zzb.zzc(str, str2);
        return this;
    }

    public final zzfeu zzf(zzezn zzeznVar) {
        this.zza.put("aai", zzeznVar.zzx);
        return this;
    }

    public final zzfeu zzg(zzezq zzezqVar) {
        if (!TextUtils.isEmpty(zzezqVar.zzb)) {
            this.zza.put("gqi", zzezqVar.zzb);
        }
        return this;
    }

    public final zzfeu zzh(zzezz zzezzVar, zzbze zzbzeVar) {
        HashMap map;
        String str;
        zzezy zzezyVar = zzezzVar.zzb;
        zzg(zzezyVar.zzb);
        if (!zzezyVar.zza.isEmpty()) {
            String str2 = "ad_format";
            switch (((zzezn) zzezyVar.zza.get(0)).zzb) {
                case 1:
                    map = this.zza;
                    str = "banner";
                    map.put(str2, str);
                    break;
                case 2:
                    map = this.zza;
                    str = "interstitial";
                    map.put(str2, str);
                    break;
                case 3:
                    map = this.zza;
                    str = "native_express";
                    map.put(str2, str);
                    break;
                case 4:
                    map = this.zza;
                    str = "native_advanced";
                    map.put(str2, str);
                    break;
                case 5:
                    map = this.zza;
                    str = "rewarded";
                    map.put(str2, str);
                    break;
                case 6:
                    this.zza.put("ad_format", "app_open_ad");
                    if (zzbzeVar != null) {
                        map = this.zza;
                        str = true != zzbzeVar.zzk() ? "0" : "1";
                        str2 = "as";
                        map.put(str2, str);
                    }
                    break;
                default:
                    map = this.zza;
                    str = AppLovinMediationProvider.UNKNOWN;
                    map.put(str2, str);
                    break;
            }
        }
        return this;
    }

    public final zzfeu zzi(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.zza.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.zza.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
        return this;
    }

    public final Map zzj() {
        HashMap map = new HashMap(this.zza);
        for (zzfez zzfezVar : this.zzb.zza()) {
            map.put(zzfezVar.zza, zzfezVar.zzb);
        }
        return map;
    }
}
