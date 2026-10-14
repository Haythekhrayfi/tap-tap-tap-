package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.internal.ads.zzbzq;
import com.google.android.gms.internal.ads.zzbzr;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class zzc extends zzb {
    private final Context zza;

    public zzc(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        boolean isAdIdFakeForDebugLogging;
        try {
            isAdIdFakeForDebugLogging = AdvertisingIdClient.getIsAdIdFakeForDebugLogging(this.zza);
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e10) {
            zzbzr.zzh("Fail to get isAdIdFakeForDebugLogging", e10);
            isAdIdFakeForDebugLogging = false;
        }
        zzbzq.zzj(isAdIdFakeForDebugLogging);
        zzbzr.zzj("Update ad debug logging enablement as " + isAdIdFakeForDebugLogging);
    }
}
