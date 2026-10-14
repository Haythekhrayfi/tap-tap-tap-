package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;

/* JADX INFO: loaded from: classes2.dex */
final class zzzd implements DisplayManager.DisplayListener, zzzb {
    private final DisplayManager zza;
    private zzyz zzb;

    private zzzd(DisplayManager displayManager) {
        this.zza = displayManager;
    }

    public static zzzb zzc(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            return new zzzd(displayManager);
        }
        return null;
    }

    private final Display zzd() {
        return this.zza.getDisplay(0);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i10) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i10) {
        zzyz zzyzVar = this.zzb;
        if (zzyzVar == null || i10 != 0) {
            return;
        }
        zzzf.zzb(zzyzVar.zza, zzd());
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzzb
    public final void zza() {
        this.zza.unregisterDisplayListener(this);
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzzb
    public final void zzb(zzyz zzyzVar) {
        this.zzb = zzyzVar;
        this.zza.registerDisplayListener(this, zzfj.zzt(null));
        zzzf.zzb(zzyzVar.zza, zzd());
    }
}
