package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.HandlerThread;
import android.os.Trace;

/* JADX INFO: loaded from: classes2.dex */
public final class zzra implements zzro {
    private final zzfpx zzb;
    private final zzfpx zzc;

    public zzra(int i10, boolean z10) {
        zzqy zzqyVar = new zzqy(i10);
        zzqz zzqzVar = new zzqz(i10);
        this.zzb = zzqyVar;
        this.zzc = zzqzVar;
    }

    public static /* synthetic */ HandlerThread zza(int i10) {
        return new HandlerThread(zzrc.zzs(i10, "ExoPlayer:MediaCodecAsyncAdapter:"));
    }

    public static /* synthetic */ HandlerThread zzb(int i10) {
        return new HandlerThread(zzrc.zzs(i10, "ExoPlayer:MediaCodecQueueingThread:"));
    }

    public final zzrc zzc(zzrn zzrnVar) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        String str = zzrnVar.zza.zza;
        zzrc zzrcVar = null;
        try {
            int i10 = zzfj.zza;
            Trace.beginSection("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                zzrc zzrcVar2 = new zzrc(mediaCodecCreateByCodecName, zza(((zzqy) this.zzb).zza), zzb(((zzqz) this.zzc).zza), false, null);
                try {
                    Trace.endSection();
                    zzrc.zzh(zzrcVar2, zzrnVar.zzb, zzrnVar.zzd, null, 0);
                    return zzrcVar2;
                } catch (Exception e10) {
                    e = e10;
                    zzrcVar = zzrcVar2;
                    if (zzrcVar != null) {
                        zzrcVar.zzl();
                    } else if (mediaCodecCreateByCodecName != null) {
                        mediaCodecCreateByCodecName.release();
                    }
                    throw e;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Exception e12) {
            e = e12;
            mediaCodecCreateByCodecName = null;
        }
    }
}
