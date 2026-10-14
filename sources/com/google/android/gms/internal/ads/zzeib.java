package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
final class zzeib implements com.google.android.gms.ads.internal.zzf {
    public final /* synthetic */ zzddo zza;

    public zzeib(zzeic zzeicVar, zzddo zzddoVar) {
        this.zza = zzddoVar;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zza(View view) {
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzb() {
        this.zza.zzb().onAdClicked();
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzc() {
        this.zza.zzc().zza();
        this.zza.zzf().zza();
    }
}
