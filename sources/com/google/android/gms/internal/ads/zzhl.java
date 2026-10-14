package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes2.dex */
final class zzhl {
    private final MediaCodec.CryptoInfo zza;
    private final MediaCodec.CryptoInfo.Pattern zzb = new MediaCodec.CryptoInfo.Pattern(0, 0);

    public static /* bridge */ /* synthetic */ void zza(zzhl zzhlVar, int i10, int i11) {
        zzhlVar.zzb.set(i10, i11);
        zzhlVar.zza.setPattern(zzhlVar.zzb);
    }
}
