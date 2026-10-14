package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class zzezk extends zzbuw {
    private final zzeza zza;
    private final zzeyq zzb;
    private final zzfaa zzc;
    private zzdmm zzd;
    private boolean zze = false;

    public zzezk(zzeza zzezaVar, zzeyq zzeyqVar, zzfaa zzfaaVar) {
        this.zza = zzezaVar;
        this.zzb = zzeyqVar;
        this.zzc = zzfaaVar;
    }

    private final synchronized boolean zzy() {
        zzdmm zzdmmVar;
        zzdmmVar = this.zzd;
        return (zzdmmVar == null || zzdmmVar.zze()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzbux
    public final Bundle zzb() {
        Preconditions.checkMainThread("getAdMetadata can only be called from the UI thread.");
        zzdmm zzdmmVar = this.zzd;
        return zzdmmVar != null ? zzdmmVar.zza() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbux
    public final synchronized com.google.android.gms.ads.internal.client.zzdn zzc() throws RemoteException {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzgA)).booleanValue()) {
            return null;
        }
        zzdmm zzdmmVar = this.zzd;
        if (zzdmmVar == null) {
            return null;
        }
        return zzdmmVar.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzbux
    public final synchronized String zzd() throws RemoteException {
        zzdmm zzdmmVar = this.zzd;
        if (zzdmmVar == null || zzdmmVar.zzl() == null) {
            return null;
        }
        return zzdmmVar.zzl().zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbux
    public final void zze() throws RemoteException {
        zzf(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbux
    public final synchronized void zzf(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        Context context = null;
        this.zzb.zzb(null);
        if (this.zzd != null) {
            if (iObjectWrapper != null) {
                context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
            }
            this.zzd.zzm().zza(context);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0031 A[Catch: all -> 0x0063, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0019, B:12:0x0022, B:13:0x002b, B:15:0x0031, B:19:0x0045), top: B:25:0x0001, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[DONT_GENERATE] */
    /* JADX WARN: Instruction removed from duplicated block: B:17:0x0043, please report this as an issue */
    @Override // com.google.android.gms.internal.ads.zzbux
    public final synchronized void zzg(zzbvb zzbvbVar) throws RemoteException {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        String str = zzbvbVar.zzb;
        String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzff);
        if (str2 == null || str == null) {
            if (zzy()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzfh)).booleanValue()) {
                    return;
                }
            }
            zzeys zzeysVar = new zzeys(null);
            this.zzd = null;
            this.zza.zzj(1);
            this.zza.zzb(zzbvbVar.zza, zzbvbVar.zzb, zzeysVar, new zzezi(this));
            return;
        }
        try {
            if (Pattern.matches(str2, str)) {
                return;
            }
        } catch (RuntimeException e10) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "NonagonUtil.isPatternMatched");
        }
        if (zzy()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzfh)).booleanValue()) {
                return;
            }
        }
        zzeys zzeysVar2 = new zzeys(null);
        this.zzd = null;
        this.zza.zzj(1);
        this.zza.zzb(zzbvbVar.zza, zzbvbVar.zzb, zzeysVar2, new zzezi(this));
        return;
        throw th;
    }

    @Override // com.google.android.gms.internal.ads.zzbux
    public final void zzh() {
        zzi(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbux
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzm().zzb(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbux
    public final void zzj() {
        zzk(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbux
    public final synchronized void zzk(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzm().zzc(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbux
    public final void zzl(com.google.android.gms.ads.internal.client.zzby zzbyVar) {
        Preconditions.checkMainThread("setAdMetadataListener can only be called from the UI thread.");
        if (zzbyVar == null) {
            this.zzb.zzb(null);
        } else {
            this.zzb.zzb(new zzezj(this, zzbyVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbux
    public final synchronized void zzm(String str) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setCustomData");
        this.zzc.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbux
    public final synchronized void zzn(boolean z10) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zze = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzbux
    public final void zzo(zzbva zzbvaVar) throws RemoteException {
        Preconditions.checkMainThread("setRewardedVideoAdListener can only be called from the UI thread.");
        this.zzb.zzf(zzbvaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbux
    public final synchronized void zzp(String str) throws RemoteException {
        Preconditions.checkMainThread("setUserId must be called on the main UI thread.");
        this.zzc.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbux
    public final synchronized void zzq() throws RemoteException {
        zzr(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbux
    public final synchronized void zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Preconditions.checkMainThread("showAd must be called on the main UI thread.");
        if (this.zzd != null) {
            Activity activity = null;
            if (iObjectWrapper != null) {
                Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
                if (objUnwrap instanceof Activity) {
                    activity = (Activity) objUnwrap;
                }
            }
            this.zzd.zzh(this.zze, activity);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbux
    public final boolean zzs() throws RemoteException {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbux
    public final boolean zzt() {
        zzdmm zzdmmVar = this.zzd;
        return zzdmmVar != null && zzdmmVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbux
    public final void zzu(zzbuv zzbuvVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.zzb.zzg(zzbuvVar);
    }
}
