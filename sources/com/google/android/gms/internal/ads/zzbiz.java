package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventParameters;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbiz implements zzbij {
    private final zzbiy zza;

    public zzbiz(zzbiy zzbiyVar) {
        this.zza = zzbiyVar;
    }

    public static void zzb(zzcez zzcezVar, zzbiy zzbiyVar) {
        zzcezVar.zzad("/reward", new zzbiz(zzbiyVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbij
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("action");
        if (!"grant".equals(str)) {
            if ("video_start".equals(str)) {
                this.zza.zzc();
                return;
            } else {
                if ("video_complete".equals(str)) {
                    this.zza.zzb();
                    return;
                }
                return;
            }
        }
        zzbvg zzbvgVar = null;
        try {
            int i10 = Integer.parseInt((String) map.get(AppLovinEventParameters.REVENUE_AMOUNT));
            String str2 = (String) map.get("type");
            if (!TextUtils.isEmpty(str2)) {
                zzbvgVar = new zzbvg(str2, i10);
            }
        } catch (NumberFormatException e10) {
            zzbzr.zzk("Unable to parse reward amount.", e10);
        }
        this.zza.zza(zzbvgVar);
    }
}
