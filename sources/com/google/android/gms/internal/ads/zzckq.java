package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzckq implements zzdmq {
    private final zzciq zza;
    private zzexi zzb;
    private zzewl zzc;
    private zzdat zzd;
    private zzcuq zze;

    public /* synthetic */ zzckq(zzciq zzciqVar, zzckp zzckpVar) {
        this.zza = zzciqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcum
    public final /* synthetic */ zzcum zza(zzewl zzewlVar) {
        this.zzc = zzewlVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcum
    public final /* synthetic */ zzcum zzb(zzexi zzexiVar) {
        this.zzb = zzexiVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdmq
    public final /* synthetic */ zzdmq zzc(zzdat zzdatVar) {
        this.zzd = zzdatVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdmq
    public final /* synthetic */ zzdmq zzd(zzcuq zzcuqVar) {
        this.zze = zzcuqVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcum
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzdmr zzh() {
        zzgwm.zzc(this.zzd, zzdat.class);
        zzgwm.zzc(this.zze, zzcuq.class);
        return new zzcks(this.zza, new zzcsm(), new zzfbm(), new zzctx(), new zzdqn(), this.zzd, this.zze, zzega.zza(), null, this.zzb, this.zzc, null);
    }
}
