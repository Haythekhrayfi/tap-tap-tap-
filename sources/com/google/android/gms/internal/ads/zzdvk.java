package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdvk extends zzbtz {
    public final /* synthetic */ zzdvl zza;

    public zzdvk(zzdvl zzdvlVar) {
        this.zza = zzdvlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbua
    public final void zze(com.google.android.gms.ads.internal.util.zzaz zzazVar) {
        this.zza.zza.zze(zzazVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbua
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zza.zzd(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }
}
