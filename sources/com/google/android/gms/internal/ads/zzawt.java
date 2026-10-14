package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.io.IOException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes2.dex */
final class zzawt implements BaseGmsClient.BaseConnectionCallbacks {
    public static final /* synthetic */ int zzd = 0;
    public final /* synthetic */ zzawl zza;
    public final /* synthetic */ zzcaj zzb;
    public final /* synthetic */ zzawv zzc;

    public zzawt(zzawv zzawvVar, zzawl zzawlVar, zzcaj zzcajVar) {
        this.zzc = zzawvVar;
        this.zza = zzawlVar;
        this.zzb = zzcajVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzc.zzd) {
            zzawv zzawvVar = this.zzc;
            if (zzawvVar.zzb) {
                return;
            }
            zzawvVar.zzb = true;
            final zzawk zzawkVar = this.zzc.zza;
            if (zzawkVar == null) {
                return;
            }
            zzfwn zzfwnVar = zzcae.zza;
            final zzawl zzawlVar = this.zza;
            final zzcaj zzcajVar = this.zzb;
            final zzfwm zzfwmVarZza = zzfwnVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzawq
                @Override // java.lang.Runnable
                public final void run() {
                    zzawt zzawtVar = this.zza;
                    zzawk zzawkVar2 = zzawkVar;
                    zzawl zzawlVar2 = zzawlVar;
                    zzcaj zzcajVar2 = zzcajVar;
                    try {
                        zzawn zzawnVarZzq = zzawkVar2.zzq();
                        zzawi zzawiVarZzg = zzawkVar2.zzp() ? zzawnVarZzq.zzg(zzawlVar2) : zzawnVarZzq.zzf(zzawlVar2);
                        if (!zzawiVarZzg.zze()) {
                            zzcajVar2.zze(new RuntimeException("No entry contents."));
                            zzawv.zze(zzawtVar.zzc);
                            return;
                        }
                        zzaws zzawsVar = new zzaws(zzawtVar, zzawiVarZzg.zzc(), 1);
                        int i10 = zzawsVar.read();
                        if (i10 == -1) {
                            throw new IOException("Unable to read from cache.");
                        }
                        zzawsVar.unread(i10);
                        zzcajVar2.zzd(zzawx.zzb(zzawsVar, zzawiVarZzg.zzd(), zzawiVarZzg.zzg(), zzawiVarZzg.zza(), zzawiVarZzg.zzf()));
                    } catch (RemoteException | IOException e10) {
                        zzbzr.zzh("Unable to obtain a cache service instance.", e10);
                        zzcajVar2.zze(e10);
                        zzawv.zze(zzawtVar.zzc);
                    }
                }
            });
            final zzcaj zzcajVar2 = this.zzb;
            zzcajVar2.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzawr
                @Override // java.lang.Runnable
                public final void run() {
                    zzcaj zzcajVar3 = zzcajVar2;
                    Future future = zzfwmVarZza;
                    if (zzcajVar3.isCancelled()) {
                        future.cancel(true);
                    }
                }
            }, zzcae.zzf);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
    }
}
