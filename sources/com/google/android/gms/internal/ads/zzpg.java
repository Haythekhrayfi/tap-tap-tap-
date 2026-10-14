package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* JADX INFO: loaded from: classes2.dex */
final class zzpg {
    public static zzoh zza(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z10) {
        int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        if (playbackOffloadSupport == 0) {
            return zzoh.zza;
        }
        zzof zzofVar = new zzof();
        zzofVar.zza(true);
        zzofVar.zzb(playbackOffloadSupport == 2);
        zzofVar.zzc(z10);
        return zzofVar.zzd();
    }
}
