package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfff {
    private final String zza = (String) zzbcz.zzb.zze();

    public final String zza(Map map) {
        Uri.Builder builderBuildUpon = Uri.parse(this.zza).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return builderBuildUpon.build().toString();
    }
}
