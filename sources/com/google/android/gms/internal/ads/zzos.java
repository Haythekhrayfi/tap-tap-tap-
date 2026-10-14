package com.google.android.gms.internal.ads;

import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
public final class zzos {
    private final Handler zza;
    private final zzot zzb;

    public zzos(Handler handler, zzot zzotVar) {
        this.zza = zzotVar == null ? null : handler;
        this.zzb = zzotVar;
    }

    public final void zza(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzoi
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzh(exc);
                }
            });
        }
    }

    public final void zzb(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzoo
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzi(exc);
                }
            });
        }
    }

    public final void zzc(final String str, final long j10, final long j11) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzon
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzj(str, j10, j11);
                }
            });
        }
    }

    public final void zzd(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzop
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzk(str);
                }
            });
        }
    }

    public final void zze(final zzhz zzhzVar) {
        zzhzVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzoj
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzl(zzhzVar);
                }
            });
        }
    }

    public final void zzf(final zzhz zzhzVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzok
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzm(zzhzVar);
                }
            });
        }
    }

    public final void zzg(final zzam zzamVar, final zzia zziaVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzoq
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzn(zzamVar, zziaVar);
                }
            });
        }
    }

    public final /* synthetic */ void zzh(Exception exc) {
        zzot zzotVar = this.zzb;
        int i10 = zzfj.zza;
        zzotVar.zzb(exc);
    }

    public final /* synthetic */ void zzi(Exception exc) {
        zzot zzotVar = this.zzb;
        int i10 = zzfj.zza;
        zzotVar.zzi(exc);
    }

    public final /* synthetic */ void zzj(String str, long j10, long j11) {
        zzot zzotVar = this.zzb;
        int i10 = zzfj.zza;
        zzotVar.zzc(str, j10, j11);
    }

    public final /* synthetic */ void zzk(String str) {
        zzot zzotVar = this.zzb;
        int i10 = zzfj.zza;
        zzotVar.zzd(str);
    }

    public final /* synthetic */ void zzl(zzhz zzhzVar) {
        zzhzVar.zza();
        zzot zzotVar = this.zzb;
        int i10 = zzfj.zza;
        zzotVar.zze(zzhzVar);
    }

    public final /* synthetic */ void zzm(zzhz zzhzVar) {
        zzot zzotVar = this.zzb;
        int i10 = zzfj.zza;
        zzotVar.zzf(zzhzVar);
    }

    public final /* synthetic */ void zzn(zzam zzamVar, zzia zziaVar) {
        int i10 = zzfj.zza;
        this.zzb.zzg(zzamVar, zziaVar);
    }

    public final /* synthetic */ void zzo(long j10) {
        zzot zzotVar = this.zzb;
        int i10 = zzfj.zza;
        zzotVar.zzh(j10);
    }

    public final /* synthetic */ void zzp(boolean z10) {
        zzot zzotVar = this.zzb;
        int i10 = zzfj.zza;
        zzotVar.zzm(z10);
    }

    public final /* synthetic */ void zzq(int i10, long j10, long j11) {
        zzot zzotVar = this.zzb;
        int i11 = zzfj.zza;
        zzotVar.zzj(i10, j10, j11);
    }

    public final void zzr(final long j10) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzol
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzo(j10);
                }
            });
        }
    }

    public final void zzs(final boolean z10) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzom
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzp(z10);
                }
            });
        }
    }

    public final void zzt(final int i10, final long j10, final long j11) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzor
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzq(i10, j10, j11);
                }
            });
        }
    }
}
