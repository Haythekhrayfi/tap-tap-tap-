package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzcfq implements zzbij {
    public final /* synthetic */ zzcfs zza;

    public zzcfq(zzcfs zzcfsVar) {
        this.zza = zzcfsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbij
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int i10 = Integer.parseInt(str);
                synchronized (this.zza) {
                    zzcfs zzcfsVar = this.zza;
                    if (zzcfsVar.zzG != i10) {
                        zzcfsVar.zzG = i10;
                        this.zza.requestLayout();
                    }
                }
            } catch (Exception e10) {
                zzbzr.zzk("Exception occurred while getting webview content height", e10);
            }
        }
    }
}
