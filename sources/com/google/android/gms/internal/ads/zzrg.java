package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
final class zzrg {
    private static final ArrayDeque zza = new ArrayDeque();
    private static final Object zzb = new Object();
    private final MediaCodec zzc;
    private final HandlerThread zzd;
    private Handler zze;
    private final AtomicReference zzf;
    private final zzeb zzg;
    private boolean zzh;

    public zzrg(MediaCodec mediaCodec, HandlerThread handlerThread) {
        zzeb zzebVar = new zzeb(zzdz.zza);
        this.zzc = mediaCodec;
        this.zzd = handlerThread;
        this.zzg = zzebVar;
        this.zzf = new AtomicReference();
    }

    public static /* bridge */ /* synthetic */ void zza(zzrg zzrgVar, Message message) {
        zzrf zzrfVar;
        int i10 = message.what;
        zzrf zzrfVar2 = null;
        if (i10 == 0) {
            zzrfVar = (zzrf) message.obj;
            try {
                zzrgVar.zzc.queueInputBuffer(zzrfVar.zza, 0, zzrfVar.zzc, zzrfVar.zze, zzrfVar.zzf);
            } catch (RuntimeException e10) {
                e = e10;
                zzrd.zza(zzrgVar.zzf, null, e);
            }
            zzrfVar2 = zzrfVar;
        } else if (i10 == 1) {
            zzrfVar = (zzrf) message.obj;
            int i11 = zzrfVar.zza;
            MediaCodec.CryptoInfo cryptoInfo = zzrfVar.zzd;
            long j10 = zzrfVar.zze;
            int i12 = zzrfVar.zzf;
            try {
                synchronized (zzb) {
                    zzrgVar.zzc.queueSecureInputBuffer(i11, 0, cryptoInfo, j10, i12);
                }
            } catch (RuntimeException e11) {
                e = e11;
                zzrd.zza(zzrgVar.zzf, null, e);
            }
            zzrfVar2 = zzrfVar;
        } else if (i10 != 2) {
            zzrd.zza(zzrgVar.zzf, null, new IllegalStateException(String.valueOf(message.what)));
        } else {
            zzrgVar.zzg.zze();
        }
        if (zzrfVar2 != null) {
            ArrayDeque arrayDeque = zza;
            synchronized (arrayDeque) {
                arrayDeque.add(zzrfVar2);
            }
        }
    }

    private static zzrf zzh() {
        ArrayDeque arrayDeque = zza;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new zzrf();
            }
            return (zzrf) arrayDeque.removeFirst();
        }
    }

    private static byte[] zzi(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < (length = bArr.length)) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private static int[] zzj(int[] iArr, int[] iArr2) {
        int length;
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < (length = iArr.length)) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }

    public final void zzb() {
        if (this.zzh) {
            try {
                Handler handler = this.zze;
                Objects.requireNonNull(handler);
                handler.removeCallbacksAndMessages(null);
                this.zzg.zzc();
                Handler handler2 = this.zze;
                Objects.requireNonNull(handler2);
                handler2.obtainMessage(2).sendToTarget();
                this.zzg.zza();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    public final void zzc() {
        RuntimeException runtimeException = (RuntimeException) this.zzf.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    public final void zzd(int i10, int i11, int i12, long j10, int i13) {
        zzc();
        zzrf zzrfVarZzh = zzh();
        zzrfVarZzh.zza(i10, 0, i12, j10, i13);
        Handler handler = this.zze;
        int i14 = zzfj.zza;
        handler.obtainMessage(0, zzrfVarZzh).sendToTarget();
    }

    public final void zze(int i10, int i11, zzhm zzhmVar, long j10, int i12) {
        zzc();
        zzrf zzrfVarZzh = zzh();
        zzrfVarZzh.zza(i10, 0, 0, j10, 0);
        MediaCodec.CryptoInfo cryptoInfo = zzrfVarZzh.zzd;
        cryptoInfo.numSubSamples = zzhmVar.zzf;
        cryptoInfo.numBytesOfClearData = zzj(zzhmVar.zzd, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = zzj(zzhmVar.zze, cryptoInfo.numBytesOfEncryptedData);
        byte[] bArrZzi = zzi(zzhmVar.zzb, cryptoInfo.key);
        Objects.requireNonNull(bArrZzi);
        cryptoInfo.key = bArrZzi;
        byte[] bArrZzi2 = zzi(zzhmVar.zza, cryptoInfo.iv);
        Objects.requireNonNull(bArrZzi2);
        cryptoInfo.iv = bArrZzi2;
        cryptoInfo.mode = zzhmVar.zzc;
        if (zzfj.zza >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(zzhmVar.zzg, zzhmVar.zzh));
        }
        this.zze.obtainMessage(1, zzrfVarZzh).sendToTarget();
    }

    public final void zzf() {
        if (this.zzh) {
            zzb();
            this.zzd.quit();
        }
        this.zzh = false;
    }

    public final void zzg() {
        if (this.zzh) {
            return;
        }
        this.zzd.start();
        this.zze = new zzre(this, this.zzd.getLooper());
        this.zzh = true;
    }
}
