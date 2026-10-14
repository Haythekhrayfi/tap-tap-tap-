package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class zzfji implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    public final zzfki zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue zzd;
    private final HandlerThread zze;

    public zzfji(Context context, String str, String str2) {
        this.zzb = str;
        this.zzc = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.zze = handlerThread;
        handlerThread.start();
        zzfki zzfkiVar = new zzfki(context, handlerThread.getLooper(), this, this, 9200000);
        this.zza = zzfkiVar;
        this.zzd = new LinkedBlockingQueue();
        zzfkiVar.checkAvailabilityAndConnect();
    }

    public static zzaon zza() {
        zzanq zzanqVarZza = zzaon.zza();
        zzanqVarZza.zzD(32768L);
        return (zzaon) zzanqVarZza.zzal();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzfkn zzfknVarZzd = zzd();
        if (zzfknVarZzd != null) {
            try {
                try {
                    this.zzd.put(zzfknVarZzd.zze(new zzfkj(this.zzb, this.zzc)).zza());
                } catch (Throwable unused) {
                    this.zzd.put(zza());
                }
            } catch (InterruptedException unused2) {
            } finally {
                zzc();
                this.zze.quit();
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        try {
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    public final zzaon zzb(int i10) {
        zzaon zzaonVar;
        try {
            zzaonVar = (zzaon) this.zzd.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            zzaonVar = null;
        }
        return zzaonVar == null ? zza() : zzaonVar;
    }

    public final void zzc() {
        zzfki zzfkiVar = this.zza;
        if (zzfkiVar != null) {
            if (zzfkiVar.isConnected() || this.zza.isConnecting()) {
                this.zza.disconnect();
            }
        }
    }

    public final zzfkn zzd() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
