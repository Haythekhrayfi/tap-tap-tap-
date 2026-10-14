package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzesy implements zzeqy {
    public final zzfwn zza;
    public final Context zzb;
    public final zzawo zzc;

    public zzesy(zzawo zzawoVar, zzfwn zzfwnVar, Context context) {
        this.zzc = zzawoVar;
        this.zza = zzfwnVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final int zza() {
        return 45;
    }

    @Override // com.google.android.gms.internal.ads.zzeqy
    public final zzfwm zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzesx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzesz(new JSONObject());
            }
        });
    }
}
