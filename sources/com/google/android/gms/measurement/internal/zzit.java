package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzit implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzq zzc;
    public final /* synthetic */ boolean zzd;
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zze;
    public final /* synthetic */ zzjs zzf;

    public zzit(zzjs zzjsVar, String str, String str2, zzq zzqVar, boolean z10, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zzf = zzjsVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzqVar;
        this.zzd = z10;
        this.zze = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Bundle bundle;
        RemoteException e10;
        Bundle bundle2 = new Bundle();
        try {
            zzjs zzjsVar = this.zzf;
            zzee zzeeVar = zzjsVar.zzb;
            if (zzeeVar == null) {
                zzjsVar.zzs.zzay().zzd().zzc("Failed to get user properties; not connected to service", this.zza, this.zzb);
                this.zzf.zzs.zzv().zzR(this.zze, bundle2);
                return;
            }
            Preconditions.checkNotNull(this.zzc);
            List<zzlc> listZzh = zzeeVar.zzh(this.zza, this.zzb, this.zzd, this.zzc);
            bundle = new Bundle();
            if (listZzh != null) {
                for (zzlc zzlcVar : listZzh) {
                    String str = zzlcVar.zze;
                    if (str != null) {
                        bundle.putString(zzlcVar.zzb, str);
                    } else {
                        Long l10 = zzlcVar.zzd;
                        if (l10 != null) {
                            bundle.putLong(zzlcVar.zzb, l10.longValue());
                        } else {
                            Double d10 = zzlcVar.zzg;
                            if (d10 != null) {
                                bundle.putDouble(zzlcVar.zzb, d10.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                try {
                    this.zzf.zzQ();
                    this.zzf.zzs.zzv().zzR(this.zze, bundle);
                } catch (RemoteException e11) {
                    e10 = e11;
                    this.zzf.zzs.zzay().zzd().zzc("Failed to get user properties; remote exception", this.zza, e10);
                    this.zzf.zzs.zzv().zzR(this.zze, bundle);
                }
            } catch (Throwable th) {
                th = th;
                bundle2 = bundle;
                this.zzf.zzs.zzv().zzR(this.zze, bundle2);
                throw th;
            }
        } catch (RemoteException e12) {
            bundle = bundle2;
            e10 = e12;
        } catch (Throwable th2) {
            th = th2;
            this.zzf.zzs.zzv().zzR(this.zze, bundle2);
            throw th;
        }
    }
}
