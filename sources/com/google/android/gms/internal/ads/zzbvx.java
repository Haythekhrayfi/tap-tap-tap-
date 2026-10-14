package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbvx implements RewardItem {
    private final zzbvk zza;

    public zzbvx(zzbvk zzbvkVar) {
        this.zza = zzbvkVar;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
        zzbvk zzbvkVar = this.zza;
        if (zzbvkVar != null) {
            try {
                return zzbvkVar.zze();
            } catch (RemoteException e10) {
                zzbzr.zzk("Could not forward getAmount to RewardItem", e10);
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final String getType() {
        zzbvk zzbvkVar = this.zza;
        if (zzbvkVar != null) {
            try {
                return zzbvkVar.zzf();
            } catch (RemoteException e10) {
                zzbzr.zzk("Could not forward getType to RewardItem", e10);
            }
        }
        return null;
    }
}
