package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbio implements zzbij {
    private final Context zza;

    public zzbio(Context context) {
        this.zza = context;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    @Override // com.google.android.gms.internal.ads.zzbij
    public final void zza(Object obj, Map map) {
        byte b10;
        if (com.google.android.gms.ads.internal.zzt.zzn().zzu(this.zza)) {
            String str = (String) map.get("eventName");
            String str2 = (String) map.get("eventId");
            int iHashCode = str.hashCode();
            if (iHashCode != 94399) {
                if (iHashCode != 94401) {
                    if (iHashCode == 94407 && str.equals("_ai")) {
                        b10 = 1;
                    } else {
                        b10 = -1;
                    }
                } else if (str.equals("_ac")) {
                    b10 = 0;
                } else {
                    b10 = -1;
                }
            } else if (str.equals("_aa")) {
                b10 = 2;
            } else {
                b10 = -1;
            }
            if (b10 == 0) {
                com.google.android.gms.ads.internal.zzt.zzn().zzm(this.zza, str2);
                return;
            }
            if (b10 == 1) {
                com.google.android.gms.ads.internal.zzt.zzn().zzn(this.zza, str2);
            } else if (b10 != 2) {
                zzbzr.zzg("logScionEvent gmsg contained unsupported eventName");
            } else {
                com.google.android.gms.ads.internal.zzt.zzn().zzk(this.zza, str2);
            }
        }
    }
}
