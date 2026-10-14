package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.facebook.ads.AdError;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class zzfjk implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    public final zzfki zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue zzd;
    private final HandlerThread zze;
    private final zzfjb zzf;
    private final long zzg;
    private final int zzh;

    public zzfjk(Context context, int i10, int i11, String str, String str2, String str3, zzfjb zzfjbVar) {
        this.zzb = str;
        this.zzh = i11;
        this.zzc = str2;
        this.zzf = zzfjbVar;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.zze = handlerThread;
        handlerThread.start();
        this.zzg = System.currentTimeMillis();
        zzfki zzfkiVar = new zzfki(context, handlerThread.getLooper(), this, this, 19621000);
        this.zza = zzfkiVar;
        this.zzd = new LinkedBlockingQueue();
        zzfkiVar.checkAvailabilityAndConnect();
    }

    public static zzfku zza() {
        return new zzfku(null, 1);
    }

    private final void zze(int i10, long j10, Exception exc) {
        this.zzf.zzc(i10, System.currentTimeMillis() - j10, exc);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzfkn zzfknVarZzd = zzd();
        if (zzfknVarZzd != null) {
            try {
                zzfku zzfkuVarZzf = zzfknVarZzd.zzf(new zzfks(1, this.zzh, this.zzb, this.zzc));
                zze(5011, this.zzg, null);
                this.zzd.put(zzfkuVarZzf);
            } catch (Throwable th) {
                try {
                    zze(2010, this.zzg, new Exception(th));
                } finally {
                    zzc();
                    this.zze.quit();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            zze(4012, this.zzg, null);
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        try {
            zze(4011, this.zzg, null);
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    public final zzfku zzb(int i10) {
        zzfku zzfkuVar;
        try {
            zzfkuVar = (zzfku) this.zzd.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            zze(AdError.INTERSTITIAL_AD_TIMEOUT, this.zzg, e10);
            zzfkuVar = null;
        }
        zze(AuthApiStatusCodes.AUTH_TOKEN_ERROR, this.zzg, null);
        if (zzfkuVar != null) {
            zzfjb.zzg(zzfkuVar.zzc == 7 ? 3 : 2);
        }
        return zzfkuVar == null ? zza() : zzfkuVar;
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
