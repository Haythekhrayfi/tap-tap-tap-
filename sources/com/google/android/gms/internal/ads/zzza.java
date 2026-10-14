package com.google.android.gms.internal.ads;

import android.view.Surface;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes2.dex */
final class zzza {
    public static void zza(Surface surface, float f10) {
        try {
            surface.setFrameRate(f10, f10 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD ? 0 : 1);
        } catch (IllegalStateException e10) {
            zzer.zzd("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
        }
    }
}
