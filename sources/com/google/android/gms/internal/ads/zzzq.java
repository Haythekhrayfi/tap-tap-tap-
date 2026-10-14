package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class zzzq {
    private final Handler zza;
    private final zzzr zzb;

    public zzzq(Handler handler, zzzr zzzrVar) {
        this.zza = zzzrVar == null ? null : handler;
        this.zzb = zzzrVar;
    }

    public final void zza(final String str, final long j10, final long j11) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzm
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzg(str, j10, j11);
                }
            });
        }
    }

    public final void zzb(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzp
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzh(str);
                }
            });
        }
    }

    public final void zzc(final zzhz zzhzVar) {
        zzhzVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzl
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzi(zzhzVar);
                }
            });
        }
    }

    public final void zzd(final int i10, final long j10) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzg
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzj(i10, j10);
                }
            });
        }
    }

    public final void zze(final zzhz zzhzVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzk
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzk(zzhzVar);
                }
            });
        }
    }

    public final void zzf(final zzam zzamVar, final zzia zziaVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzn
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzl(zzamVar, zziaVar);
                }
            });
        }
    }

    public final /* synthetic */ void zzg(String str, long j10, long j11) {
        zzzr zzzrVar = this.zzb;
        int i10 = zzfj.zza;
        zzzrVar.zzo(str, j10, j11);
    }

    public final /* synthetic */ void zzh(String str) {
        zzzr zzzrVar = this.zzb;
        int i10 = zzfj.zza;
        zzzrVar.zzp(str);
    }

    public final /* synthetic */ void zzi(zzhz zzhzVar) {
        zzhzVar.zza();
        zzzr zzzrVar = this.zzb;
        int i10 = zzfj.zza;
        zzzrVar.zzq(zzhzVar);
    }

    public final /* synthetic */ void zzj(int i10, long j10) {
        zzzr zzzrVar = this.zzb;
        int i11 = zzfj.zza;
        zzzrVar.zzk(i10, j10);
    }

    public final /* synthetic */ void zzk(zzhz zzhzVar) {
        zzzr zzzrVar = this.zzb;
        int i10 = zzfj.zza;
        zzzrVar.zzr(zzhzVar);
    }

    public final /* synthetic */ void zzl(zzam zzamVar, zzia zziaVar) {
        int i10 = zzfj.zza;
        this.zzb.zzt(zzamVar, zziaVar);
    }

    public final /* synthetic */ void zzm(Object obj, long j10) {
        zzzr zzzrVar = this.zzb;
        int i10 = zzfj.zza;
        zzzrVar.zzl(obj, j10);
    }

    public final /* synthetic */ void zzn(long j10, int i10) {
        zzzr zzzrVar = this.zzb;
        int i11 = zzfj.zza;
        zzzrVar.zzs(j10, i10);
    }

    public final /* synthetic */ void zzo(Exception exc) {
        zzzr zzzrVar = this.zzb;
        int i10 = zzfj.zza;
        zzzrVar.zzn(exc);
    }

    public final /* synthetic */ void zzp(zzdn zzdnVar) {
        zzzr zzzrVar = this.zzb;
        int i10 = zzfj.zza;
        zzzrVar.zzu(zzdnVar);
    }

    public final void zzq(final Object obj) {
        if (this.zza != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzh
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzm(obj, jElapsedRealtime);
                }
            });
        }
    }

    public final void zzr(final long j10, final int i10) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzj
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzn(j10, i10);
                }
            });
        }
    }

    public final void zzs(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzi
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzo(exc);
                }
            });
        }
    }

    public final void zzt(final zzdn zzdnVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzo
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzp(zzdnVar);
                }
            });
        }
    }
}
