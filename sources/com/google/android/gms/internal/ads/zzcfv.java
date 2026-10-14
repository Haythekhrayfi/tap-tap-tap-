package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcfv extends com.google.android.gms.ads.internal.client.zzdp {
    private final zzcca zza;
    private final boolean zzc;
    private final boolean zzd;
    private int zze;
    private com.google.android.gms.ads.internal.client.zzdt zzf;
    private boolean zzg;
    private float zzi;
    private float zzj;
    private float zzk;
    private boolean zzl;
    private boolean zzm;
    private zzbfz zzn;
    private final Object zzb = new Object();
    private boolean zzh = true;

    public zzcfv(zzcca zzccaVar, float f10, boolean z10, boolean z11) {
        this.zza = zzccaVar;
        this.zzi = f10;
        this.zzc = z10;
        this.zzd = z11;
    }

    private final void zzw(final int i10, final int i11, final boolean z10, final boolean z11) {
        zzcae.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfu
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd(i10, i11, z10, z11);
            }
        });
    }

    private final void zzx(String str, Map map) {
        final HashMap map2 = map == null ? new HashMap() : new HashMap(map);
        map2.put("action", str);
        zzcae.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcft
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzr(map2);
            }
        });
    }

    public final void zzc(float f10, float f11, int i10, boolean z10, float f12) {
        boolean z11;
        boolean z12;
        int i11;
        synchronized (this.zzb) {
            z11 = true;
            if (f11 == this.zzi && f12 == this.zzk) {
                z11 = false;
            }
            this.zzi = f11;
            this.zzj = f10;
            z12 = this.zzh;
            this.zzh = z10;
            i11 = this.zze;
            this.zze = i10;
            float f13 = this.zzk;
            this.zzk = f12;
            if (Math.abs(f12 - f13) > 1.0E-4f) {
                this.zza.zzF().invalidate();
            }
        }
        if (z11) {
            try {
                zzbfz zzbfzVar = this.zzn;
                if (zzbfzVar != null) {
                    zzbfzVar.zze();
                }
            } catch (RemoteException e10) {
                zzbzr.zzl("#007 Could not call remote method.", e10);
            }
        }
        zzw(i11, i10, z12, z10);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0055 A[Catch: RemoteException -> 0x003f, all -> 0x0072, TryCatch #1 {RemoteException -> 0x003f, blocks: (B:31:0x0037, B:33:0x003b, B:37:0x0043, B:39:0x0047, B:41:0x004c, B:43:0x0050, B:45:0x0055, B:47:0x0059, B:48:0x005c, B:50:0x0063, B:52:0x0067), top: B:62:0x0037, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0059 A[Catch: RemoteException -> 0x003f, all -> 0x0072, TryCatch #1 {RemoteException -> 0x003f, blocks: (B:31:0x0037, B:33:0x003b, B:37:0x0043, B:39:0x0047, B:41:0x004c, B:43:0x0050, B:45:0x0055, B:47:0x0059, B:48:0x005c, B:50:0x0063, B:52:0x0067), top: B:62:0x0037, outer: #0 }] */
    public final /* synthetic */ void zzd(int i10, int i11, boolean z10, boolean z11) {
        int i12;
        boolean z12;
        boolean z13;
        com.google.android.gms.ads.internal.client.zzdt zzdtVar;
        com.google.android.gms.ads.internal.client.zzdt zzdtVar2;
        com.google.android.gms.ads.internal.client.zzdt zzdtVar3;
        com.google.android.gms.ads.internal.client.zzdt zzdtVar4;
        synchronized (this.zzb) {
            boolean z14 = this.zzg;
            if (z14 || i11 != 1) {
                i12 = i11;
                z12 = false;
            } else {
                i11 = 1;
                i12 = 1;
                z12 = true;
            }
            boolean z15 = i10 != i11;
            if (z15 && i12 == 1) {
                z13 = true;
                i12 = 1;
            } else {
                z13 = false;
            }
            boolean z16 = z15 && i12 == 2;
            boolean z17 = z15 && i12 == 3;
            this.zzg = z14 || z12;
            if (z12) {
                try {
                    com.google.android.gms.ads.internal.client.zzdt zzdtVar5 = this.zzf;
                    if (zzdtVar5 != null) {
                        zzdtVar5.zzi();
                    }
                    if (z13 && (zzdtVar4 = this.zzf) != null) {
                        zzdtVar4.zzh();
                    }
                    if (z16 && (zzdtVar3 = this.zzf) != null) {
                        zzdtVar3.zzg();
                    }
                    if (z17) {
                        zzdtVar2 = this.zzf;
                        if (zzdtVar2 != null) {
                            zzdtVar2.zze();
                        }
                        this.zza.zzw();
                    }
                    if (z10 != z11 && (zzdtVar = this.zzf) != null) {
                        zzdtVar.zzf(z11);
                    }
                } catch (RemoteException e10) {
                    zzbzr.zzl("#007 Could not call remote method.", e10);
                }
            } else {
                if (z13) {
                    zzdtVar4.zzh();
                }
                if (z16) {
                    zzdtVar3.zzg();
                }
                if (z17) {
                    zzdtVar2 = this.zzf;
                    if (zzdtVar2 != null) {
                        zzdtVar2.zze();
                    }
                    this.zza.zzw();
                }
                if (z10 != z11) {
                    zzdtVar.zzf(z11);
                }
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zze() {
        float f10;
        synchronized (this.zzb) {
            f10 = this.zzk;
        }
        return f10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zzf() {
        float f10;
        synchronized (this.zzb) {
            f10 = this.zzj;
        }
        return f10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zzg() {
        float f10;
        synchronized (this.zzb) {
            f10 = this.zzi;
        }
        return f10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final int zzh() {
        int i10;
        synchronized (this.zzb) {
            i10 = this.zze;
        }
        return i10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final com.google.android.gms.ads.internal.client.zzdt zzi() throws RemoteException {
        com.google.android.gms.ads.internal.client.zzdt zzdtVar;
        synchronized (this.zzb) {
            zzdtVar = this.zzf;
        }
        return zzdtVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzj(boolean z10) {
        zzx(true != z10 ? "unmute" : "mute", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzk() {
        zzx("pause", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzl() {
        zzx("play", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzm(com.google.android.gms.ads.internal.client.zzdt zzdtVar) {
        synchronized (this.zzb) {
            this.zzf = zzdtVar;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzn() {
        zzx("stop", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzo() {
        boolean z10;
        boolean zZzp = zzp();
        synchronized (this.zzb) {
            z10 = false;
            if (!zZzp) {
                try {
                    if (this.zzm && this.zzd) {
                        z10 = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzp() {
        boolean z10;
        synchronized (this.zzb) {
            z10 = false;
            if (this.zzc && this.zzl) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzq() {
        boolean z10;
        synchronized (this.zzb) {
            z10 = this.zzh;
        }
        return z10;
    }

    public final /* synthetic */ void zzr(Map map) {
        this.zza.zzd("pubVideoCmd", map);
    }

    public final void zzs(com.google.android.gms.ads.internal.client.zzfl zzflVar) {
        boolean z10 = zzflVar.zza;
        boolean z11 = zzflVar.zzb;
        boolean z12 = zzflVar.zzc;
        synchronized (this.zzb) {
            this.zzl = z11;
            this.zzm = z12;
        }
        zzx("initialState", CollectionUtils.mapOf("muteStart", true != z10 ? "0" : "1", "customControlsRequested", true != z11 ? "0" : "1", "clickToExpandRequested", true != z12 ? "0" : "1"));
    }

    public final void zzt(float f10) {
        synchronized (this.zzb) {
            this.zzj = f10;
        }
    }

    public final void zzu() {
        boolean z10;
        int i10;
        synchronized (this.zzb) {
            z10 = this.zzh;
            i10 = this.zze;
            this.zze = 3;
        }
        zzw(i10, 3, z10, z10);
    }

    public final void zzv(zzbfz zzbfzVar) {
        synchronized (this.zzb) {
            this.zzn = zzbfzVar;
        }
    }
}
