package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes2.dex */
final class zzzc implements zzzb {
    private final WindowManager zza;

    private zzzc(WindowManager windowManager) {
        this.zza = windowManager;
    }

    public static zzzb zzc(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            return new zzzc(windowManager);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzzb
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzzb
    public final void zzb(zzyz zzyzVar) {
        zzzf.zzb(zzyzVar.zza, this.zza.getDefaultDisplay());
    }
}
