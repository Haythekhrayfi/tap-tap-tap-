package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class zzevt extends com.google.android.gms.ads.internal.client.zzbt implements com.google.android.gms.ads.internal.overlay.zzo, zzavn {
    public zzcov zza;
    private final zzcgu zzb;
    private final Context zzc;
    private final String zze;
    private final zzevn zzf;
    private final zzevl zzg;
    private final zzbzx zzh;
    private final zzdqa zzi;
    private zzcoj zzk;
    private AtomicBoolean zzd = new AtomicBoolean();
    private long zzj = -1;

    public zzevt(zzcgu zzcguVar, Context context, String str, zzevn zzevnVar, zzevl zzevlVar, zzbzx zzbzxVar, zzdqa zzdqaVar) {
        this.zzb = zzcguVar;
        this.zzc = context;
        this.zze = str;
        this.zzf = zzevnVar;
        this.zzg = zzevlVar;
        this.zzh = zzbzxVar;
        this.zzi = zzdqaVar;
        zzevlVar.zzn(this);
    }

    private final synchronized void zzq(int i10) {
        if (this.zzd.compareAndSet(false, true)) {
            this.zzg.zzj();
            zzcoj zzcojVar = this.zzk;
            if (zzcojVar != null) {
                com.google.android.gms.ads.internal.zzt.zzb().zze(zzcojVar);
            }
            if (this.zza != null) {
                long jElapsedRealtime = -1;
                if (this.zzj != -1) {
                    jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zzj;
                }
                this.zza.zze(jElapsedRealtime, i10);
            }
            zzx();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzA() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzB() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(com.google.android.gms.ads.internal.client.zzbe zzbeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(com.google.android.gms.ads.internal.client.zzby zzbyVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzF(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(com.google.android.gms.ads.internal.client.zzcb zzcbVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(zzavw zzavwVar) {
        this.zzg.zzp(zzavwVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(com.google.android.gms.ads.internal.client.zzw zzwVar) {
        this.zzf.zzl(zzwVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzJ(com.google.android.gms.ads.internal.client.zzci zzciVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzK(com.google.android.gms.ads.internal.client.zzdu zzduVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzL(boolean z10) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzM(zzbsc zzbscVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzN(boolean z10) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzO(zzbck zzbckVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzQ(zzbsf zzbsfVar, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzR(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzS(zzbva zzbvaVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzT(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzU(com.google.android.gms.ads.internal.client.zzfl zzflVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzW(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzX() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzY() {
        return this.zzf.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzZ() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzavn
    public final void zza() {
        zzq(3);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzaa(com.google.android.gms.ads.internal.client.zzl zzlVar) throws RemoteException {
        boolean z10;
        if (((Boolean) zzbdd.zzd.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzjJ)).booleanValue()) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        if (this.zzh.zzc < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzjK)).intValue() || !z10) {
            Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzs.zzD(this.zzc) && zzlVar.zzs == null) {
            zzbzr.zzg("Failed to load the ad because app ID is missing.");
            this.zzg.zza(zzfbi.zzd(4, null, null));
            return false;
        }
        if (zzY()) {
            return false;
        }
        this.zzd = new AtomicBoolean();
        return this.zzf.zzb(zzlVar, this.zze, new zzevr(this), new zzevs(this));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzab(com.google.android.gms.ads.internal.client.zzcf zzcfVar) {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzb() {
        if (this.zza == null) {
            return;
        }
        this.zzj = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
        int iZza = this.zza.zza();
        if (iZza <= 0) {
            return;
        }
        zzcoj zzcojVar = new zzcoj(this.zzb.zzB(), com.google.android.gms.ads.internal.zzt.zzB());
        this.zzk = zzcojVar;
        zzcojVar.zzd(iZza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzevq
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzp();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbF() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzd() {
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zze() {
        zzcov zzcovVar = this.zza;
        if (zzcovVar != null) {
            zzcovVar.zze(com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zzj, 1);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(int i10) {
        int i11;
        if (i10 == 0) {
            throw null;
        }
        int i12 = i10 - 1;
        if (i12 == 0) {
            zzq(2);
            return;
        }
        if (i12 != 1) {
            i11 = i12 != 2 ? 6 : 3;
        } else {
            i11 = 4;
        }
        zzq(i11);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized com.google.android.gms.ads.internal.client.zzq zzg() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzbh zzi() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzcb zzj() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized com.google.android.gms.ads.internal.client.zzdn zzk() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized com.google.android.gms.ads.internal.client.zzdq zzl() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final IObjectWrapper zzn() {
        return null;
    }

    public final /* synthetic */ void zzo() {
        zzq(5);
    }

    public final void zzp() {
        this.zzb.zzA().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzevp
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzo();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzr() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzs() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzt() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzx() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        zzcov zzcovVar = this.zza;
        if (zzcovVar != null) {
            zzcovVar.zzb();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(com.google.android.gms.ads.internal.client.zzl zzlVar, com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzz() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
    }
}
