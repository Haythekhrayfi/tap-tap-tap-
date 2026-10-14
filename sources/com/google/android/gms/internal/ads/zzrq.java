package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes2.dex */
public class zzrq extends zzhn {
    public final zzrs zza;
    public final String zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzrq(Throwable th, zzrs zzrsVar) {
        super("Decoder failed: ".concat(String.valueOf(zzrsVar == null ? null : zzrsVar.zza)), th);
        String diagnosticInfo = null;
        this.zza = zzrsVar;
        if (zzfj.zza >= 21 && (th instanceof MediaCodec.CodecException)) {
            diagnosticInfo = ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        this.zzb = diagnosticInfo;
    }
}
