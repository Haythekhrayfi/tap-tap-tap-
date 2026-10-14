package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzr {
    private int zza;
    private int zzb;
    private int zzc;
    private byte[] zzd;

    public zzr() {
        this.zza = -1;
        this.zzb = -1;
        this.zzc = -1;
    }

    public /* synthetic */ zzr(zzs zzsVar, zzq zzqVar) {
        this.zza = zzsVar.zzd;
        this.zzb = zzsVar.zze;
        this.zzc = zzsVar.zzf;
        this.zzd = zzsVar.zzg;
    }

    public final zzr zza(int i10) {
        this.zzb = 1;
        return this;
    }

    public final zzr zzb(int i10) {
        this.zza = 1;
        return this;
    }

    public final zzr zzc(int i10) {
        this.zzc = i10;
        return this;
    }

    public final zzs zzd() {
        return new zzs(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
