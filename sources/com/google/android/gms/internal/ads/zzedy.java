package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzedy extends zzbob implements zzcwq {
    private zzboc zza;
    private zzcwp zzb;

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final synchronized void zza(zzcwp zzcwpVar) {
        this.zzb = zzcwpVar;
    }

    public final synchronized void zzc(zzboc zzbocVar) {
        this.zza = zzbocVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final synchronized void zze() throws RemoteException {
        zzboc zzbocVar = this.zza;
        if (zzbocVar != null) {
            zzbocVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final synchronized void zzf() throws RemoteException {
        zzboc zzbocVar = this.zza;
        if (zzbocVar != null) {
            zzbocVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final synchronized void zzg(int i10) throws RemoteException {
        zzcwp zzcwpVar = this.zzb;
        if (zzcwpVar != null) {
            zzcwpVar.zza(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final synchronized void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzcwp zzcwpVar = this.zzb;
        if (zzcwpVar != null) {
            zzcwpVar.zzb(zzeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final synchronized void zzi(int i10, String str) throws RemoteException {
        zzcwp zzcwpVar = this.zzb;
        if (zzcwpVar != null) {
            zzcwpVar.zzc(i10, str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final synchronized void zzj(int i10) throws RemoteException {
        zzboc zzbocVar = this.zza;
        if (zzbocVar != null) {
            zzbocVar.zzj(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final synchronized void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzboc zzbocVar = this.zza;
        if (zzbocVar != null) {
            zzbocVar.zzk(zzeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final synchronized void zzl(String str) throws RemoteException {
        zzboc zzbocVar = this.zza;
        if (zzbocVar != null) {
            zzbocVar.zzl(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final synchronized void zzm() throws RemoteException {
        zzboc zzbocVar = this.zza;
        if (zzbocVar != null) {
            zzbocVar.zzm();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final synchronized void zzn() throws RemoteException {
        zzboc zzbocVar = this.zza;
        if (zzbocVar != null) {
            zzbocVar.zzn();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final synchronized void zzo() throws RemoteException {
        zzboc zzbocVar = this.zza;
        if (zzbocVar != null) {
            zzbocVar.zzo();
        }
        zzcwp zzcwpVar = this.zzb;
        if (zzcwpVar != null) {
            zzcwpVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final synchronized void zzp() throws RemoteException {
        zzboc zzbocVar = this.zza;
        if (zzbocVar != null) {
            zzbocVar.zzp();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final synchronized void zzq(String str, String str2) throws RemoteException {
        zzboc zzbocVar = this.zza;
        if (zzbocVar != null) {
            zzbocVar.zzq(str, str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final synchronized void zzr(zzbfl zzbflVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final synchronized void zzs(zzbvg zzbvgVar) throws RemoteException {
        zzboc zzbocVar = this.zza;
        if (zzbocVar != null) {
            zzbocVar.zzs(zzbvgVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final synchronized void zzt(zzbvk zzbvkVar) throws RemoteException {
        zzboc zzbocVar = this.zza;
        if (zzbocVar != null) {
            zzbocVar.zzt(zzbvkVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final synchronized void zzu() throws RemoteException {
        zzboc zzbocVar = this.zza;
        if (zzbocVar != null) {
            zzbocVar.zzu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final synchronized void zzv() throws RemoteException {
        zzboc zzbocVar = this.zza;
        if (zzbocVar != null) {
            zzbocVar.zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final synchronized void zzw() throws RemoteException {
        zzboc zzbocVar = this.zza;
        if (zzbocVar != null) {
            zzbocVar.zzw();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final synchronized void zzx() throws RemoteException {
        zzboc zzbocVar = this.zza;
        if (zzbocVar != null) {
            zzbocVar.zzx();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final synchronized void zzy() throws RemoteException {
        zzboc zzbocVar = this.zza;
        if (zzbocVar != null) {
            zzbocVar.zzy();
        }
    }
}
