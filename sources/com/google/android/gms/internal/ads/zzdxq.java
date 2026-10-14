package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdxq extends zzbtw {
    public final /* synthetic */ zzdxr zza;

    public zzdxq(zzdxr zzdxrVar) {
        this.zza = zzdxrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbtx
    public final void zze(com.google.android.gms.ads.internal.util.zzaz zzazVar) {
        this.zza.zza.zze(zzazVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtx
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zza.zzd(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }
}
