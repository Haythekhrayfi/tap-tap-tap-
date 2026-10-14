package com.google.android.gms.internal.ads;

import android.content.Context;
import com.yandex.metrica.plugins.PluginErrorDetails;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzepc implements zzeqy {
    private final zzfwn zza;
    private final Context zzb;
    private final Set zzc;

    public zzepc(zzfwn zzfwnVar, Context context, Set set) {
        this.zza = zzfwnVar;
        this.zzb = context;
        this.zzc = set;
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final int zza() {
        return 27;
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final zzfwm zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzepb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    public final /* synthetic */ zzepd zzc() throws Exception {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzeM)).booleanValue()) {
            Set set = this.zzc;
            if (set.contains("rewarded") || set.contains("interstitial") || set.contains(PluginErrorDetails.Platform.NATIVE) || set.contains("banner")) {
                return new zzepd(com.google.android.gms.ads.internal.zzt.zzA().zze(this.zzb));
            }
        }
        return new zzepd(null);
    }
}
