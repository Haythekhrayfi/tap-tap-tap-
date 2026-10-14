package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
final class zzehs implements com.google.android.gms.ads.internal.zzf {
    public final /* synthetic */ zzcaj zza;
    public final /* synthetic */ zzezz zzb;
    public final /* synthetic */ zzezn zzc;
    public final /* synthetic */ zzehy zzd;
    public final /* synthetic */ zzeht zze;

    public zzehs(zzeht zzehtVar, zzcaj zzcajVar, zzezz zzezzVar, zzezn zzeznVar, zzehy zzehyVar) {
        this.zze = zzehtVar;
        this.zza = zzcajVar;
        this.zzb = zzezzVar;
        this.zzc = zzeznVar;
        this.zzd = zzehyVar;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zza(View view) {
        this.zza.zzd(this.zze.zzd.zza(this.zzb, this.zzc, view, this.zzd));
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzb() {
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzc() {
    }
}
