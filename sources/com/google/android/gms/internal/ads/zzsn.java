package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class zzsn implements zzrp {
    private final MediaCodec zza;
    private ByteBuffer[] zzb;
    private ByteBuffer[] zzc;

    public /* synthetic */ zzsn(MediaCodec mediaCodec, zzsm zzsmVar) {
        this.zza = mediaCodec;
        if (zzfj.zza < 21) {
            this.zzb = mediaCodec.getInputBuffers();
            this.zzc = mediaCodec.getOutputBuffers();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrp
    public final int zza() {
        return this.zza.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.internal.ads.zzrp
    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.zza.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3) {
                if (zzfj.zza < 21) {
                    this.zzc = this.zza.getOutputBuffers();
                }
                iDequeueOutputBuffer = -3;
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzrp
    public final MediaFormat zzc() {
        return this.zza.getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.zzrp
    public final ByteBuffer zzf(int i10) {
        return zzfj.zza >= 21 ? this.zza.getInputBuffer(i10) : this.zzb[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzrp
    public final ByteBuffer zzg(int i10) {
        return zzfj.zza >= 21 ? this.zza.getOutputBuffer(i10) : this.zzc[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzrp
    public final void zzi() {
        this.zza.flush();
    }

    @Override // com.google.android.gms.internal.ads.zzrp
    public final void zzj(int i10, int i11, int i12, long j10, int i13) {
        this.zza.queueInputBuffer(i10, 0, i12, j10, i13);
    }

    @Override // com.google.android.gms.internal.ads.zzrp
    public final void zzk(int i10, int i11, zzhm zzhmVar, long j10, int i12) {
        this.zza.queueSecureInputBuffer(i10, 0, zzhmVar.zza(), j10, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzrp
    public final void zzl() {
        this.zzb = null;
        this.zzc = null;
        this.zza.release();
    }

    @Override // com.google.android.gms.internal.ads.zzrp
    public final void zzm(int i10, long j10) {
        this.zza.releaseOutputBuffer(i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzrp
    public final void zzn(int i10, boolean z10) {
        this.zza.releaseOutputBuffer(i10, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzrp
    public final void zzo(Surface surface) {
        this.zza.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzrp
    public final void zzp(Bundle bundle) {
        this.zza.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzrp
    public final void zzq(int i10) {
        this.zza.setVideoScalingMode(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzrp
    public final boolean zzr() {
        return false;
    }
}
