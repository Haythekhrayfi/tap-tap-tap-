package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcmp implements zzcmj {
    private final zzdsx zza;

    public zzcmp(zzdsx zzdsxVar) {
        this.zza = zzdsxVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    @Override // com.google.android.gms.internal.ads.zzcmj
    public final void zza(Map map) {
        byte b10;
        zzdsx zzdsxVar;
        zzdst zzdstVar;
        String str = (String) map.get("gesture");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 97520651) {
            if (iHashCode == 109399814 && str.equals("shake")) {
                b10 = 0;
            } else {
                b10 = -1;
            }
        } else if (str.equals("flick")) {
            b10 = 1;
        } else {
            b10 = -1;
        }
        if (b10 == 0) {
            zzdsxVar = this.zza;
            zzdstVar = zzdst.SHAKE;
        } else if (b10 != 1) {
            zzdsxVar = this.zza;
            zzdstVar = zzdst.NONE;
        } else {
            zzdsxVar = this.zza;
            zzdstVar = zzdst.FLICK;
        }
        zzdsxVar.zzk(zzdstVar);
    }
}
