package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdgj extends zzben {
    private final zzdha zza;
    private IObjectWrapper zzb;

    public zzdgj(zzdha zzdhaVar) {
        this.zza = zzdhaVar;
    }

    private static float zzb(IObjectWrapper iObjectWrapper) {
        Drawable drawable;
        return (iObjectWrapper == null || (drawable = (Drawable) ObjectWrapper.unwrap(iObjectWrapper)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) ? StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD : drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzbeo
    public final float zze() throws RemoteException {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzfZ)).booleanValue()) {
            return StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        }
        if (this.zza.zzb() != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            return this.zza.zzb();
        }
        if (this.zza.zzj() != null) {
            try {
                return this.zza.zzj().zze();
            } catch (RemoteException e10) {
                zzbzr.zzh("Remote exception getting video controller aspect ratio.", e10);
                return StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            }
        }
        IObjectWrapper iObjectWrapper = this.zzb;
        if (iObjectWrapper != null) {
            return zzb(iObjectWrapper);
        }
        zzber zzberVarZzm = this.zza.zzm();
        if (zzberVarZzm == null) {
            return StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        }
        float fZzd = (zzberVarZzm.zzd() == -1 || zzberVarZzm.zzc() == -1) ? 0.0f : zzberVarZzm.zzd() / zzberVarZzm.zzc();
        return fZzd == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD ? zzb(zzberVarZzm.zzf()) : fZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbeo
    public final float zzf() throws RemoteException {
        return (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzga)).booleanValue() && this.zza.zzj() != null) ? this.zza.zzj().zzf() : StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
    }

    @Override // com.google.android.gms.internal.ads.zzbeo
    public final float zzg() throws RemoteException {
        return (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzga)).booleanValue() && this.zza.zzj() != null) ? this.zza.zzj().zzg() : StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
    }

    @Override // com.google.android.gms.internal.ads.zzbeo
    public final com.google.android.gms.ads.internal.client.zzdq zzh() throws RemoteException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzga)).booleanValue()) {
            return this.zza.zzj();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbeo
    public final IObjectWrapper zzi() throws RemoteException {
        IObjectWrapper iObjectWrapper = this.zzb;
        if (iObjectWrapper != null) {
            return iObjectWrapper;
        }
        zzber zzberVarZzm = this.zza.zzm();
        if (zzberVarZzm == null) {
            return null;
        }
        return zzberVarZzm.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbeo
    public final void zzj(IObjectWrapper iObjectWrapper) {
        this.zzb = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbeo
    public final boolean zzk() throws RemoteException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzga)).booleanValue()) {
            return this.zza.zzad();
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbeo
    public final boolean zzl() throws RemoteException {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzga)).booleanValue() && this.zza.zzj() != null;
    }

    @Override // com.google.android.gms.internal.ads.zzbeo
    public final void zzm(zzbfz zzbfzVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzga)).booleanValue() && (this.zza.zzj() instanceof zzcfv)) {
            ((zzcfv) this.zza.zzj()).zzv(zzbfzVar);
        }
    }
}
