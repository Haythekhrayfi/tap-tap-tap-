package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.Bundle;
import android.os.ext.SdkExtensions;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzemk implements zzeqx {

    @Nullable
    private final Integer zza;

    private zzemk(@Nullable Integer num) {
        this.zza = num;
    }

    public static /* bridge */ /* synthetic */ zzemk zzb() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzjh)).booleanValue()) {
            return new zzemk(null);
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        int extensionVersion = 0;
        if (Build.VERSION.SDK_INT >= 30 && SdkExtensions.getExtensionVersion(30) > 3) {
            extensionVersion = SdkExtensions.getExtensionVersion(1000000);
        }
        return new zzemk(Integer.valueOf(extensionVersion));
    }

    @Override // com.google.android.gms.internal.ads.zzeqx
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        Integer num = this.zza;
        if (num != null) {
            bundle.putInt("aos", num.intValue());
        }
    }
}
