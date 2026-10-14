package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
final class zzri extends MediaCodec.Callback {
    private final HandlerThread zzb;
    private Handler zzc;
    private MediaFormat zzh;
    private MediaFormat zzi;
    private MediaCodec.CodecException zzj;
    private long zzk;
    private boolean zzl;
    private IllegalStateException zzm;
    private final Object zza = new Object();
    private final zzrm zzd = new zzrm();
    private final zzrm zze = new zzrm();
    private final ArrayDeque zzf = new ArrayDeque();
    private final ArrayDeque zzg = new ArrayDeque();

    public zzri(HandlerThread handlerThread) {
        this.zzb = handlerThread;
    }

    public static /* synthetic */ void zzd(zzri zzriVar) {
        synchronized (zzriVar.zza) {
            if (zzriVar.zzl) {
                return;
            }
            long j10 = zzriVar.zzk - 1;
            zzriVar.zzk = j10;
            if (j10 > 0) {
                return;
            }
            if (j10 >= 0) {
                zzriVar.zzi();
                return;
            }
            IllegalStateException illegalStateException = new IllegalStateException();
            synchronized (zzriVar.zza) {
                zzriVar.zzm = illegalStateException;
            }
        }
    }

    private final void zzh(MediaFormat mediaFormat) {
        this.zze.zzb(-2);
        this.zzg.add(mediaFormat);
    }

    private final void zzi() {
        if (!this.zzg.isEmpty()) {
            this.zzi = (MediaFormat) this.zzg.getLast();
        }
        this.zzd.zzc();
        this.zze.zzc();
        this.zzf.clear();
        this.zzg.clear();
    }

    private final void zzj() {
        IllegalStateException illegalStateException = this.zzm;
        if (illegalStateException == null) {
            return;
        }
        this.zzm = null;
        throw illegalStateException;
    }

    private final void zzk() {
        MediaCodec.CodecException codecException = this.zzj;
        if (codecException == null) {
            return;
        }
        this.zzj = null;
        throw codecException;
    }

    private final boolean zzl() {
        return this.zzk > 0 || this.zzl;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.zza) {
            this.zzj = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.zza) {
            this.zzd.zzb(i10);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.zza) {
            MediaFormat mediaFormat = this.zzi;
            if (mediaFormat != null) {
                zzh(mediaFormat);
                this.zzi = null;
            }
            this.zze.zzb(i10);
            this.zzf.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.zza) {
            zzh(mediaFormat);
            this.zzi = null;
        }
    }

    public final int zza() {
        synchronized (this.zza) {
            int iZza = -1;
            if (zzl()) {
                return -1;
            }
            zzj();
            zzk();
            if (!this.zzd.zzd()) {
                iZza = this.zzd.zza();
            }
            return iZza;
        }
    }

    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.zza) {
            if (zzl()) {
                return -1;
            }
            zzj();
            zzk();
            if (this.zze.zzd()) {
                return -1;
            }
            int iZza = this.zze.zza();
            if (iZza >= 0) {
                zzdy.zzb(this.zzh);
                MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.zzf.remove();
                bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
            } else if (iZza == -2) {
                this.zzh = (MediaFormat) this.zzg.remove();
                iZza = -2;
            }
            return iZza;
        }
    }

    public final MediaFormat zzc() {
        MediaFormat mediaFormat;
        synchronized (this.zza) {
            mediaFormat = this.zzh;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    public final void zze() {
        synchronized (this.zza) {
            this.zzk++;
            Handler handler = this.zzc;
            int i10 = zzfj.zza;
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrh
                @Override // java.lang.Runnable
                public final void run() {
                    zzri.zzd(this.zza);
                }
            });
        }
    }

    public final void zzf(MediaCodec mediaCodec) {
        zzdy.zzf(this.zzc == null);
        this.zzb.start();
        Handler handler = new Handler(this.zzb.getLooper());
        mediaCodec.setCallback(this, handler);
        this.zzc = handler;
    }

    public final void zzg() {
        synchronized (this.zza) {
            this.zzl = true;
            this.zzb.quit();
            zzi();
        }
    }
}
