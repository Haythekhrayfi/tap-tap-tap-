package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcgv {
    private zzbzx zza;
    private Context zzb;
    private WeakReference zzc;

    public final zzcgv zzc(Context context) {
        this.zzc = new WeakReference(context);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.zzb = context;
        return this;
    }

    public final zzcgv zzd(zzbzx zzbzxVar) {
        this.zza = zzbzxVar;
        return this;
    }
}
