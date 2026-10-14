package com.google.android.gms.internal.ads;

import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbik implements zzbij {
    private final zzbil zza;

    public zzbik(zzbil zzbilVar) {
        this.zza = zzbilVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbij
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcez zzcezVar = (zzcez) obj;
        boolean zEquals = "1".equals(map.get("transparentBackground"));
        boolean zEquals2 = "1".equals(map.get("blur"));
        float f10 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        try {
            if (map.get("blurRadius") != null) {
                f10 = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e10) {
            zzbzr.zzh("Fail to parse float", e10);
        }
        this.zza.zzc(zEquals);
        this.zza.zzb(zEquals2, f10);
        zzcezVar.zzat(zEquals);
    }
}
