package com.google.android.gms.internal.ads;

import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
final class zzegx extends zzbve {
    public final /* synthetic */ zzcxm zza;
    public final /* synthetic */ zzcve zzb;
    public final /* synthetic */ zzcwn zzc;
    public final /* synthetic */ zzddd zzd;

    public zzegx(zzegy zzegyVar, zzcxm zzcxmVar, zzcve zzcveVar, zzcwn zzcwnVar, zzddd zzdddVar) {
        this.zza = zzcxmVar;
        this.zzb = zzcveVar;
        this.zzc = zzcwnVar;
        this.zzd = zzdddVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zze(IObjectWrapper iObjectWrapper) {
        this.zzb.onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzf(IObjectWrapper iObjectWrapper) {
        this.zza.zzf(4);
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzg(IObjectWrapper iObjectWrapper, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzh(IObjectWrapper iObjectWrapper) {
        this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzi(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzj(IObjectWrapper iObjectWrapper) {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzk(IObjectWrapper iObjectWrapper, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzl(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzm(IObjectWrapper iObjectWrapper, zzbvg zzbvgVar) {
        this.zzd.zza(zzbvgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzn(IObjectWrapper iObjectWrapper) {
        this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzo(IObjectWrapper iObjectWrapper) {
        this.zzd.zzc();
    }
}
