package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdgz extends com.google.android.gms.ads.internal.client.zzdp {
    private final Object zza = new Object();

    @Nullable
    private final com.google.android.gms.ads.internal.client.zzdq zzb;

    @Nullable
    private final zzbol zzc;

    public zzdgz(@Nullable com.google.android.gms.ads.internal.client.zzdq zzdqVar, @Nullable zzbol zzbolVar) {
        this.zzb = zzdqVar;
        this.zzc = zzbolVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zze() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zzf() throws RemoteException {
        zzbol zzbolVar = this.zzc;
        return zzbolVar != null ? zzbolVar.zzg() : StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zzg() throws RemoteException {
        zzbol zzbolVar = this.zzc;
        return zzbolVar != null ? zzbolVar.zzh() : StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final int zzh() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzdt zzi() throws RemoteException {
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.client.zzdq zzdqVar = this.zzb;
            if (zzdqVar == null) {
                return null;
            }
            return zzdqVar.zzi();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzj(boolean z10) throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzk() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzl() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzm(@Nullable com.google.android.gms.ads.internal.client.zzdt zzdtVar) throws RemoteException {
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.client.zzdq zzdqVar = this.zzb;
            if (zzdqVar != null) {
                zzdqVar.zzm(zzdtVar);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzn() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzo() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzp() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzq() throws RemoteException {
        throw new RemoteException();
    }
}
