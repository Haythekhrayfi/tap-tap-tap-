package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzlc {
    private static final zzto zzt = new zzto(new Object());
    public final zzcw zza;
    public final zzto zzb;
    public final long zzc;
    public final long zzd;
    public final int zze;
    public final zzih zzf;
    public final boolean zzg;
    public final zzvn zzh;
    public final zzxh zzi;
    public final List zzj;
    public final zzto zzk;
    public final boolean zzl;
    public final int zzm;
    public final zzch zzn;
    public final boolean zzo;
    public volatile long zzp;
    public volatile long zzq;
    public volatile long zzr;
    public volatile long zzs;

    public zzlc(zzcw zzcwVar, zzto zztoVar, long j10, long j11, int i10, zzih zzihVar, boolean z10, zzvn zzvnVar, zzxh zzxhVar, List list, zzto zztoVar2, boolean z11, int i11, zzch zzchVar, long j12, long j13, long j14, long j15, boolean z12) {
        this.zza = zzcwVar;
        this.zzb = zztoVar;
        this.zzc = j10;
        this.zzd = j11;
        this.zze = i10;
        this.zzf = zzihVar;
        this.zzg = z10;
        this.zzh = zzvnVar;
        this.zzi = zzxhVar;
        this.zzj = list;
        this.zzk = zztoVar2;
        this.zzl = z11;
        this.zzm = i11;
        this.zzn = zzchVar;
        this.zzp = j12;
        this.zzq = j13;
        this.zzr = j14;
        this.zzs = j15;
        this.zzo = z12;
    }

    public static zzlc zzi(zzxh zzxhVar) {
        zzcw zzcwVar = zzcw.zza;
        zzto zztoVar = zzt;
        return new zzlc(zzcwVar, zztoVar, -9223372036854775807L, 0L, 1, null, false, zzvn.zza, zzxhVar, zzfsc.zzl(), zztoVar, false, 0, zzch.zza, 0L, 0L, 0L, 0L, false);
    }

    public static zzto zzj() {
        return zzt;
    }

    public final long zza() {
        long j10;
        long j11;
        if (!zzk()) {
            return this.zzr;
        }
        do {
            j10 = this.zzs;
            j11 = this.zzr;
        } while (j10 != this.zzs);
        return zzfj.zzo(zzfj.zzq(j11) + ((long) ((SystemClock.elapsedRealtime() - j10) * this.zzn.zzc)));
    }

    public final zzlc zzb() {
        return new zzlc(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, zza(), SystemClock.elapsedRealtime(), this.zzo);
    }

    public final zzlc zzc(zzto zztoVar) {
        return new zzlc(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, zztoVar, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, this.zzo);
    }

    public final zzlc zzd(zzto zztoVar, long j10, long j11, long j12, long j13, zzvn zzvnVar, zzxh zzxhVar, List list) {
        return new zzlc(this.zza, zztoVar, j11, j12, this.zze, this.zzf, this.zzg, zzvnVar, zzxhVar, list, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, j13, j10, SystemClock.elapsedRealtime(), this.zzo);
    }

    public final zzlc zze(boolean z10, int i10) {
        return new zzlc(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, z10, i10, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, this.zzo);
    }

    public final zzlc zzf(zzih zzihVar) {
        return new zzlc(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzihVar, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, this.zzo);
    }

    public final zzlc zzg(int i10) {
        return new zzlc(this.zza, this.zzb, this.zzc, this.zzd, i10, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, this.zzo);
    }

    public final zzlc zzh(zzcw zzcwVar) {
        return new zzlc(zzcwVar, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, this.zzo);
    }

    public final boolean zzk() {
        return this.zze == 3 && this.zzl && this.zzm == 0;
    }
}
