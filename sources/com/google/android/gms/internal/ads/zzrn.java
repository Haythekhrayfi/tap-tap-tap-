package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* JADX INFO: loaded from: classes2.dex */
public final class zzrn {
    public final zzrs zza;
    public final MediaFormat zzb;
    public final zzam zzc;
    public final Surface zzd;
    public final MediaCrypto zze = null;

    private zzrn(zzrs zzrsVar, MediaFormat mediaFormat, zzam zzamVar, Surface surface, MediaCrypto mediaCrypto, int i10) {
        this.zza = zzrsVar;
        this.zzb = mediaFormat;
        this.zzc = zzamVar;
        this.zzd = surface;
    }

    public static zzrn zza(zzrs zzrsVar, MediaFormat mediaFormat, zzam zzamVar, MediaCrypto mediaCrypto) {
        return new zzrn(zzrsVar, mediaFormat, zzamVar, null, null, 0);
    }

    public static zzrn zzb(zzrs zzrsVar, MediaFormat mediaFormat, zzam zzamVar, Surface surface, MediaCrypto mediaCrypto) {
        return new zzrn(zzrsVar, mediaFormat, zzamVar, surface, null, 0);
    }
}
