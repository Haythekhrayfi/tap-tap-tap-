package com.google.android.gms.internal.ads;

import android.app.Application;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfgv {
    private boolean zza;

    public final void zza(Context context) {
        zzfid.zzb(context, "Application Context cannot be null");
        if (this.zza) {
            return;
        }
        this.zza = true;
        zzfhr.zzb().zzc(context);
        zzfhm zzfhmVarZza = zzfhm.zza();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(zzfhmVarZza);
        }
        zzfib.zzd(context);
        zzfho.zzb().zzc(context);
    }

    public final boolean zzb() {
        return this.zza;
    }
}
