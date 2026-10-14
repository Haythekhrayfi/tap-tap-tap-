package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.internal.ads.zzbef;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes.dex */
@ParametersAreNonnullByDefault
public class MediationNativeAdConfiguration extends MediationAdConfiguration {
    private final zzbef zza;

    public MediationNativeAdConfiguration(Context context, String str, Bundle bundle, Bundle bundle2, boolean z10, Location location, int i10, int i11, String str2, String str3, zzbef zzbefVar) {
        super(context, str, bundle, bundle2, z10, location, i10, i11, str2, str3);
        this.zza = zzbefVar;
    }

    public NativeAdOptions getNativeAdOptions() {
        return zzbef.zza(this.zza);
    }
}
