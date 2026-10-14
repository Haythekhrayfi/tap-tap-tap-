package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* JADX INFO: loaded from: classes2.dex */
final class zzpj {
    public static void zza(AudioTrack audioTrack, zzpl zzplVar) {
        audioTrack.setPreferredDevice(zzplVar == null ? null : zzplVar.zza);
    }
}
