package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import ch.qos.logback.classic.Level;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"HandlerLeak"})
final class zzxx extends Handler implements Runnable {
    public final /* synthetic */ zzyc zza;
    private final zzxy zzb;
    private final long zzc;
    private zzxu zzd;
    private IOException zze;
    private int zzf;
    private Thread zzg;
    private boolean zzh;
    private volatile boolean zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzxx(zzyc zzycVar, Looper looper, zzxy zzxyVar, zzxu zzxuVar, int i10, long j10) {
        super(looper);
        this.zza = zzycVar;
        this.zzb = zzxyVar;
        this.zzd = zzxuVar;
        this.zzc = j10;
    }

    private final void zzd() {
        this.zze = null;
        zzyc zzycVar = this.zza;
        ExecutorService executorService = zzycVar.zze;
        zzxx zzxxVar = zzycVar.zzf;
        Objects.requireNonNull(zzxxVar);
        executorService.execute(zzxxVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.zzi) {
            return;
        }
        int i10 = message.what;
        if (i10 == 0) {
            zzd();
            return;
        }
        if (i10 == 3) {
            throw ((Error) message.obj);
        }
        this.zza.zzf = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = jElapsedRealtime - this.zzc;
        zzxu zzxuVar = this.zzd;
        Objects.requireNonNull(zzxuVar);
        if (this.zzh) {
            zzxuVar.zzI(this.zzb, jElapsedRealtime, j10, false);
            return;
        }
        int i11 = message.what;
        if (i11 == 1) {
            try {
                zzxuVar.zzJ(this.zzb, jElapsedRealtime, j10);
                return;
            } catch (RuntimeException e10) {
                zzer.zzd("LoadTask", "Unexpected exception handling load completed", e10);
                this.zza.zzg = new zzyb(e10);
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.zze = iOException;
        int i12 = this.zzf + 1;
        this.zzf = i12;
        zzxw zzxwVarZzt = zzxuVar.zzt(this.zzb, jElapsedRealtime, j10, iOException, i12);
        if (zzxwVarZzt.zza == 3) {
            this.zza.zzg = this.zze;
        } else if (zzxwVarZzt.zza != 2) {
            if (zzxwVarZzt.zza == 1) {
                this.zzf = 1;
            }
            zzc(zzxwVarZzt.zzb != -9223372036854775807L ? zzxwVarZzt.zzb : Math.min((this.zzf - 1) * 1000, Level.TRACE_INT));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object zzybVar;
        Message messageObtainMessage;
        boolean z10;
        try {
            synchronized (this) {
                z10 = !this.zzh;
                this.zzg = Thread.currentThread();
            }
            if (z10) {
                String str = "load:" + this.zzb.getClass().getSimpleName();
                int i10 = zzfj.zza;
                Trace.beginSection(str);
                try {
                    this.zzb.zzh();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.zzg = null;
                Thread.interrupted();
            }
            if (this.zzi) {
                return;
            }
            sendEmptyMessage(1);
        } catch (IOException e10) {
            if (this.zzi) {
                return;
            }
            messageObtainMessage = obtainMessage(2, e10);
            messageObtainMessage.sendToTarget();
        } catch (Error e11) {
            if (!this.zzi) {
                zzer.zzd("LoadTask", "Unexpected error loading stream", e11);
                obtainMessage(3, e11).sendToTarget();
            }
            throw e11;
        } catch (Exception e12) {
            if (this.zzi) {
                return;
            }
            zzer.zzd("LoadTask", "Unexpected exception loading stream", e12);
            zzybVar = new zzyb(e12);
            messageObtainMessage = obtainMessage(2, zzybVar);
            messageObtainMessage.sendToTarget();
        } catch (OutOfMemoryError e13) {
            if (this.zzi) {
                return;
            }
            zzer.zzd("LoadTask", "OutOfMemory error loading stream", e13);
            zzybVar = new zzyb(e13);
            messageObtainMessage = obtainMessage(2, zzybVar);
            messageObtainMessage.sendToTarget();
        }
    }

    public final void zza(boolean z10) {
        this.zzi = z10;
        this.zze = null;
        if (hasMessages(0)) {
            this.zzh = true;
            removeMessages(0);
            if (!z10) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                this.zzh = true;
                this.zzb.zzg();
                Thread thread = this.zzg;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z10) {
            this.zza.zzf = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            zzxu zzxuVar = this.zzd;
            Objects.requireNonNull(zzxuVar);
            zzxuVar.zzI(this.zzb, jElapsedRealtime, jElapsedRealtime - this.zzc, true);
            this.zzd = null;
        }
    }

    public final void zzb(int i10) throws IOException {
        IOException iOException = this.zze;
        if (iOException != null && this.zzf > i10) {
            throw iOException;
        }
    }

    public final void zzc(long j10) {
        zzdy.zzf(this.zza.zzf == null);
        this.zza.zzf = this;
        if (j10 > 0) {
            sendEmptyMessageDelayed(0, j10);
        } else {
            zzd();
        }
    }
}
