package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* JADX INFO: loaded from: classes2.dex */
final class zzpf {
    public static zzoh zza(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z10) {
        if (!AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return zzoh.zza;
        }
        zzof zzofVar = new zzof();
        zzofVar.zza(true);
        zzofVar.zzc(z10);
        zzofVar.zzb(zzfj.zza == 30 && zzfj.zzd.startsWith("Pixel"));
        return zzofVar.zzd();
    }
}
