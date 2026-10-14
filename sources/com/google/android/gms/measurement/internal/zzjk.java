package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
final class zzjk implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzq zzc;
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zzd;
    public final /* synthetic */ zzjs zze;

    public zzjk(zzjs zzjsVar, String str, String str2, zzq zzqVar, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zze = zzjsVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzqVar;
        this.zzd = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = new ArrayList();
        try {
            try {
                zzjs zzjsVar = this.zze;
                zzee zzeeVar = zzjsVar.zzb;
                if (zzeeVar == null) {
                    zzjsVar.zzs.zzay().zzd().zzc("Failed to get conditional properties; not connected to service", this.zza, this.zzb);
                } else {
                    Preconditions.checkNotNull(this.zzc);
                    arrayList = zzlh.zzH(zzeeVar.zzf(this.zza, this.zzb, this.zzc));
                    this.zze.zzQ();
                }
            } catch (RemoteException e10) {
                this.zze.zzs.zzay().zzd().zzd("Failed to get conditional properties; remote exception", this.zza, this.zzb, e10);
            }
        } finally {
            this.zze.zzs.zzv().zzQ(this.zzd, arrayList);
        }
    }
}
