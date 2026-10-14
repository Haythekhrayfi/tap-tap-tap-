package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* JADX INFO: loaded from: classes2.dex */
final class zzod {
    private static final AudioAttributes zza = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    public static int zza(int i10, int i11) {
        for (int i12 = 10; i12 > 0; i12--) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(zzfj.zzf(i12)).build(), zza)) {
                return i12;
            }
        }
        return 0;
    }

    public static zzfsc<Integer> zzb() {
        zzfrz zzfrzVar = new zzfrz();
        zzfuc it = zzoe.zzc.keySet().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            if (zzfj.zza >= 34 || iIntValue != 30) {
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), zza)) {
                    zzfrzVar.zzf(Integer.valueOf(iIntValue));
                }
            }
        }
        zzfrzVar.zzf((Object) 2);
        return zzfrzVar.zzi();
    }
}
