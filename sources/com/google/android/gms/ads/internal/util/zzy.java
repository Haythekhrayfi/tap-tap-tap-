package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.content.Context;
import com.google.android.gms.internal.ads.zzbbm;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes.dex */
@ParametersAreNonnullByDefault
@TargetApi(30)
public final class zzy extends zzx {
    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final int zzn(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzib)).booleanValue()) {
            return 0;
        }
        return super.zzn(context);
    }
}
