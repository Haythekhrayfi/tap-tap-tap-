package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes.dex */
public final class zzab {
    private boolean zza = false;
    private float zzb = 1.0f;

    public static float zzb(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        }
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        return streamMaxVolume == 0 ? StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD : audioManager.getStreamVolume(3) / streamMaxVolume;
    }

    private final synchronized boolean zzf() {
        return this.zzb >= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
    }

    public final synchronized float zza() {
        if (!zzf()) {
            return 1.0f;
        }
        return this.zzb;
    }

    public final synchronized void zzc(boolean z10) {
        this.zza = z10;
    }

    public final synchronized void zzd(float f10) {
        this.zzb = f10;
    }

    public final synchronized boolean zze() {
        return this.zza;
    }
}
