package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzyv extends HandlerThread implements Handler.Callback {
    private zzee zza;
    private Handler zzb;
    private Error zzc;
    private RuntimeException zzd;
    private zzyx zze;

    public zzyv() {
        super("ExoPlayer:PlaceholderSurface");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        try {
            if (i10 != 1) {
                if (i10 != 2) {
                    return true;
                }
                try {
                    zzee zzeeVar = this.zza;
                    Objects.requireNonNull(zzeeVar);
                    zzeeVar.zzc();
                } catch (Throwable th) {
                    try {
                        zzer.zzd("PlaceholderSurface", "Failed to release placeholder surface", th);
                    } finally {
                        quit();
                    }
                }
                return true;
            }
            try {
                int i11 = message.arg1;
                zzee zzeeVar2 = this.zza;
                Objects.requireNonNull(zzeeVar2);
                zzeeVar2.zzb(i11);
                this.zze = new zzyx(this, this.zza.zza(), i11 != 0, null);
                synchronized (this) {
                    notify();
                }
            } catch (zzef e10) {
                zzer.zzd("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                this.zzd = new IllegalStateException(e10);
                synchronized (this) {
                    notify();
                }
            } catch (Error e11) {
                zzer.zzd("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                this.zzc = e11;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e12) {
                zzer.zzd("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                this.zzd = e12;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }

    public final zzyx zza(int i10) {
        boolean z10;
        start();
        Handler handler = new Handler(getLooper(), this);
        this.zzb = handler;
        this.zza = new zzee(handler, null);
        synchronized (this) {
            z10 = false;
            this.zzb.obtainMessage(1, i10, 0).sendToTarget();
            while (this.zze == null && this.zzd == null && this.zzc == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.zzd;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = this.zzc;
        if (error != null) {
            throw error;
        }
        zzyx zzyxVar = this.zze;
        Objects.requireNonNull(zzyxVar);
        return zzyxVar;
    }

    public final void zzb() {
        Handler handler = this.zzb;
        Objects.requireNonNull(handler);
        handler.sendEmptyMessage(2);
    }
}
