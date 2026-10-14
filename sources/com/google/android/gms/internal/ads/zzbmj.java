package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzbmj implements zzcan {
    public final /* synthetic */ zzbmk zza;

    public zzbmj(zzbmk zzbmkVar) {
        this.zza = zzbmkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcan
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        final zzblg zzblgVar = (zzblg) obj;
        zzcae.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbmi
            @Override // java.lang.Runnable
            public final void run() {
                zzblg zzblgVar2 = zzblgVar;
                zzblgVar2.zzr("/result", zzbii.zzo);
                zzblgVar2.zzc();
            }
        });
    }
}
