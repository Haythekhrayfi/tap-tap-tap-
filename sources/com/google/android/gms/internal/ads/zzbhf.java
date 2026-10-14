package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbhf implements zzbij {
    @Override // com.google.android.gms.internal.ads.zzbij
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcez zzcezVar = (zzcez) obj;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                zzbzr.zzj("No label given for CSI tick.");
                return;
            }
            if (TextUtils.isEmpty(str4)) {
                zzbzr.zzj("No timestamp given for CSI tick.");
                return;
            }
            try {
                long j10 = (Long.parseLong(str4) - com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()) + com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
                if (true == TextUtils.isEmpty(str3)) {
                    str3 = "native:view_load";
                }
                zzcezVar.zzm().zzc(str2, str3, j10);
                return;
            } catch (NumberFormatException e10) {
                zzbzr.zzk("Malformed timestamp for CSI tick.", e10);
                return;
            }
        }
        if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                zzbzr.zzj("No value given for CSI experiment.");
                return;
            } else {
                zzcezVar.zzm().zza().zzd("e", str5);
                return;
            }
        }
        if ("extra".equals(str)) {
            String str6 = (String) map.get("name");
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                zzbzr.zzj("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str6)) {
                zzbzr.zzj("No name given for CSI extra.");
            } else {
                zzcezVar.zzm().zza().zzd(str6, str7);
            }
        }
    }
}
