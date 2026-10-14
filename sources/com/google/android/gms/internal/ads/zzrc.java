package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
final class zzrc implements zzrp {
    private final MediaCodec zza;
    private final zzri zzb;
    private final zzrg zzc;
    private boolean zzd;
    private int zze = 0;

    public /* synthetic */ zzrc(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z10, zzrb zzrbVar) {
        this.zza = mediaCodec;
        this.zzb = new zzri(handlerThread);
        this.zzc = new zzrg(mediaCodec, handlerThread2);
    }

    public static /* synthetic */ void zzh(zzrc zzrcVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        zzrcVar.zzb.zzf(zzrcVar.zza);
        int i11 = zzfj.zza;
        Trace.beginSection("configureCodec");
        zzrcVar.zza.configure(mediaFormat, surface, (MediaCrypto) null, 0);
        Trace.endSection();
        zzrcVar.zzc.zzg();
        Trace.beginSection("startCodec");
        zzrcVar.zza.start();
        Trace.endSection();
        zzrcVar.zze = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzs(int i10, String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder(str);
        if (i10 == 1) {
            str2 = "Audio";
        } else if (i10 == 2) {
            str2 = "Video";
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            str2 = ")";
        }
        sb2.append(str2);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzrp
    public final int zza() {
        this.zzc.zzc();
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzrp
    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        this.zzc.zzc();
        return this.zzb.zzb(bufferInfo);
    }

    @Override // com.google.android.gms.internal.ads.zzrp
    public final MediaFormat zzc() {
        return this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzrp
    public final ByteBuffer zzf(int i10) {
        return this.zza.getInputBuffer(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzrp
    public final ByteBuffer zzg(int i10) {
        return this.zza.getOutputBuffer(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzrp
    public final void zzi() {
        this.zzc.zzb();
        this.zza.flush();
        this.zzb.zze();
        this.zza.start();
    }

    @Override // com.google.android.gms.internal.ads.zzrp
    public final void zzj(int i10, int i11, int i12, long j10, int i13) {
        this.zzc.zzd(i10, 0, i12, j10, i13);
    }

    @Override // com.google.android.gms.internal.ads.zzrp
    public final void zzk(int i10, int i11, zzhm zzhmVar, long j10, int i12) {
        this.zzc.zze(i10, 0, zzhmVar, j10, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzrp
    public final void zzl() {
        try {
            if (this.zze == 1) {
                this.zzc.zzf();
                this.zzb.zzg();
            }
            this.zze = 2;
            if (this.zzd) {
            }
        } finally {
            if (!this.zzd) {
                this.zza.release();
                this.zzd = true;
            }
        }
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
