package com.google.android.gms.internal.ads;

import android.view.Surface;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class zzlo extends zzm implements zzis {
    private final zzjx zzb;
    private final zzeb zzc;

    public zzlo(zzir zzirVar) {
        zzeb zzebVar = new zzeb(zzdz.zza);
        this.zzc = zzebVar;
        try {
            this.zzb = new zzjx(zzirVar, this);
            zzebVar.zze();
        } catch (Throwable th) {
            this.zzc.zze();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzis
    public final void zzA(zzlv zzlvVar) {
        this.zzc.zzb();
        this.zzb.zzA(zzlvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzis
    public final void zzB(zztq zztqVar) {
        this.zzc.zzb();
        this.zzb.zzB(zztqVar);
    }

    public final zzih zzC() {
        this.zzc.zzb();
        return this.zzb.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzm
    public final void zza(int i10, long j10, int i11, boolean z10) {
        this.zzc.zzb();
        this.zzb.zza(i10, j10, 5, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final int zzb() {
        this.zzc.zzb();
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final int zzc() {
        this.zzc.zzb();
        return this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final int zzd() {
        this.zzc.zzb();
        return this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final int zze() {
        this.zzc.zzb();
        return this.zzb.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final int zzf() {
        this.zzc.zzb();
        return this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final int zzg() {
        this.zzc.zzb();
        return this.zzb.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final int zzh() {
        this.zzc.zzb();
        this.zzb.zzh();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final long zzi() {
        this.zzc.zzb();
        return this.zzb.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final long zzj() {
        this.zzc.zzb();
        return this.zzb.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final long zzk() {
        this.zzc.zzb();
        return this.zzb.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final long zzl() {
        this.zzc.zzb();
        return this.zzb.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final long zzm() {
        this.zzc.zzb();
        return this.zzb.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final zzcw zzn() {
        this.zzc.zzb();
        return this.zzb.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final zzdh zzo() {
        this.zzc.zzb();
        return this.zzb.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzp() {
        this.zzc.zzb();
        this.zzb.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzq() {
        this.zzc.zzb();
        this.zzb.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzr(boolean z10) {
        this.zzc.zzb();
        this.zzb.zzr(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzs(Surface surface) {
        this.zzc.zzb();
        this.zzb.zzs(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzt(float f10) {
        this.zzc.zzb();
        this.zzb.zzt(f10);
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzu() {
        this.zzc.zzb();
        this.zzb.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final boolean zzv() {
        this.zzc.zzb();
        return this.zzb.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final boolean zzw() {
        this.zzc.zzb();
        this.zzb.zzw();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final boolean zzx() {
        this.zzc.zzb();
        return this.zzb.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzis
    public final int zzy() {
        this.zzc.zzb();
        this.zzb.zzy();
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzis
    public final void zzz(zzlv zzlvVar) {
        this.zzc.zzb();
        this.zzb.zzz(zzlvVar);
    }
}
