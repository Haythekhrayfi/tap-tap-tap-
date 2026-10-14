package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import androidx.fragment.app.w;

/* JADX INFO: loaded from: classes2.dex */
public final class zzru extends Exception {
    public final String zza;
    public final boolean zzb;
    public final zzrs zzc;
    public final String zzd;
    public final zzru zze;

    public zzru(zzam zzamVar, Throwable th, boolean z10, int i10) {
        this("Decoder init failed: [" + i10 + "], " + String.valueOf(zzamVar), th, zzamVar.zzm, false, null, android.support.v4.media.a.a("com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_neg_", Math.abs(i10)), null);
    }

    public zzru(zzam zzamVar, Throwable th, boolean z10, zzrs zzrsVar) {
        this(w.a("Decoder init failed: ", zzrsVar.zza, ", ", String.valueOf(zzamVar)), th, zzamVar.zzm, false, zzrsVar, (zzfj.zza < 21 || !(th instanceof MediaCodec.CodecException)) ? null : ((MediaCodec.CodecException) th).getDiagnosticInfo(), null);
    }

    private zzru(String str, Throwable th, String str2, boolean z10, zzrs zzrsVar, String str3, zzru zzruVar) {
        super(str, th);
        this.zza = str2;
        this.zzb = false;
        this.zzc = zzrsVar;
        this.zzd = str3;
        this.zze = zzruVar;
    }

    public static /* bridge */ /* synthetic */ zzru zza(zzru zzruVar, zzru zzruVar2) {
        return new zzru(zzruVar.getMessage(), zzruVar.getCause(), zzruVar.zza, false, zzruVar.zzc, zzruVar.zzd, zzruVar2);
    }
}
